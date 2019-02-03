# crontab execute script command
# m h  dom mon dow   command
# 00 00 * * * /root/projects/monerbari-backend/backup.sh


# DB BACKUP

w="$(date +'%d_%m_%Y_%H_%M_%S')"
filename="db_backup_$now".gz
backupfolder="/var/iratebdFiles"
fullpathbackupfile="$backupfolder/$filename"
logfile="$backupfolder/"backup_log_"$(date +'%Y_%m')".txt
echo "mysqldump started at $(date +'%d-%m-%Y %H:%M:%S')" >> "$logfile"
mysqldump --user=root --password=root --default-character-set=utf8 iratebd | gzip > "$fullpathbackupfile"
echo "mysqldump finished at $(date +'%d-%m-%Y %H:%M:%S')" >> "$logfile"
chown root "$fullpathbackupfile"
chown root "$logfile"
echo "file permission changed" >> "$logfile"
find "$backupfolder" -name db_backup_* -mtime +8 -exec rm {} \;
echo "old files deleted" >> "$logfile"
echo "operation finished at $(date +'%d-%m-%Y %H:%M:%S')" >> "$logfile"
echo "*****************" >> "$logfile"
echo "Commiting changes" >> "$logfile"

# FILE BACKUP

zip -r $backupfolder/files.zip /var/iratebdFiles

# PUSH TO GIT

cd $backupfolder
git add .
git commit -m "New backup on $(date +'%d-%m-%Y %H:%M:%S')"
echo "***********Pushing latest commit on Repo**********"
git push origin master
exit 0
