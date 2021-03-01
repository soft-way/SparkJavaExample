
SCRIPT_HOME=$(cd `dirname $0`; pwd)

cd "$SCRIPT_HOME"

java -jar \
-Xms256m \
-Xmx1024m \
-XX:MaxMetaspaceSize=256m \
-XX:CompressedClassSpaceSize=128m \
-Dlogback.configurationFile=config/logback.xml \
-Dconfig.file=config/application.conf \
app.jar
