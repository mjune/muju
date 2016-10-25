#!/bin/bash
# Purpose : WebLogic AdminServer wrapper script which redirects logs to admin.out
# Author : Pavan Devarakonda <wlatricksntips .blogspot.com=""> ver 0.2
# Category  : WebLogic Best Practices
# Override  : Yes, You can modify LOGDIR, LOGPATH values 
 
clear
DOMAIN_HOME=${PWD}
LOGDIR=$DOMAIN_HOME/logs
LOGPATH=$LOGDIR/admin.out
export PATH=$PATH:$DOMAIN_HOME
 
if [ -d $LOGDIR ]; then
 nohup bash -c "$DOMAIN_HOME/startWebLogic.sh 2>&1 >>$LOGPATH" &
 echo .
 echo "Starting admin server..."
 echo "tail -f $LOGPATH"
 exit 0
else
 echo "Log path doesn't exists... creating directory now!!"
 mkdir -p $LOGDIR
 ./$0
fi
</wlatricksntips>
