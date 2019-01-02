prunsrv install DaemonLoggingExample ^
 --Install="%CD%\prunsrv.exe" ^
 --Description="Example service using Apache Commons Daemon" ^
 --Startup=auto ^
 --Jvm=auto ^
 --JavaHome="D:\Java\jdk1.8.0_181" ^
 --Classpath="%CD%\*;%CD%\dependency\*" ^
 --StartMode=jvm ^
 --StartClass="com.flores.examples.daemon.DaemonExample" ^
 --StopMode=jvm ^
 --StopClass="com.flores.examples.daemon.DaemonExample" ^
 --StartMethod=start ^
 --StopMethod=stop ^
 --StdOutput="DaemonLoggingExample.out" ^
 --StdError="DaemonLoggingExample.err"