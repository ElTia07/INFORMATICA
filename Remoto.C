// Github_controllo_remoto_C
#!/bin/bash

URL="URL_DEL_FILE"  #devo inserire l'URL
FILENAME="comandi.txt"  #devo inserire il file

while true
do
    wget -O $FILENAME $URL
    LAST_COMMAND=$(tail -n 1 $FILENAME)
    eval $LAST_COMMAND
    sleep 30
done
