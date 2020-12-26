concurrently "npm --prefix /home/pi/world-radio/ui run serve" "npm --prefix /home/pi/world-radio/api run start" &
sleep 5
SELF_IP=$(hostname -I | cut -d' ' -f1)
DOMAIN_WORLD_RADIO="http://$SELF_IP:8080"
echo "[`date '+%d/%m/%Y %H:%M:%S'`] SERVER IS RUNNING AT $DOMAIN_WORLD_RADIO" >> /home/pi/world-radio/radio.log
