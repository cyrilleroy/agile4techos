rem Installation script for the build platform
echo "Create destination dir"

rem ***************************************************************
rem INSTALLATION BASIC STUFF 
rem ***************************************************************

rem mkdir e:\tools\wget
rem echo "copying needed tools"
rem copy unzip.exe e:\tools
rem copy wget-1.11.4-1-bin.zip e:\tools
rem copy wget-1.11.4-1-dep.zip e:\tools
rem echo "going to the tools directory"
e:
rem cd e:\tools\wget
rem echo "starting installation"
rem e:\tools\unzip.exe ..\wget-1.11.4-1-bin.zip
rem e:\tools\unzip.exe ..\wget-1.11.4-1-dep.zip
cd e:\tools

rem ***************************************************************
rem INSTALLATION JDK
rem ***************************************************************
rem e:\tools\wget\bin\wget.exe "http://cds.sun.com/is-bin/INTERSHOP.enfinity/WFS/CDS-CDS_Developer-Site/en_US/-/USD/VerifyItem-Start/jdk-6u21-windows-i586.exe?BundledLineItemUUID=hNyJ_hCvW_UAAAErF6IpGFJf&OrderID=P1OJ_hCvVSEAAAErDKIpGFJf&ProductID=h2iJ_hCyKS4AAAEpVrwzBGsB&FileName=/jdk-6u21-windows-i586.exe"
rem move "jdk-6u21-windows-i586*" "jdk-6u21-windows-i586.exe"
rem  "jdk-6u21-windows-i586.exe" /l* java.log INSTALLDIR=e:\java\jdk1.6.0_21 /qn


rem ***************************************************************
rem INSTALLATION MYSQL
rem ***************************************************************
rem e:\tools\wget\bin\wget.exe http://10.190.200.129:8081/artifactory/ext-releases-local/com/oracle/mysql/mysqlserver/5.1.50/mysqlserver-5.1.50-win32.msi
rem msiexec /i mysqlserver-5.1.50-win32.msi /l* mysql.log INSTALLDIR="E:\MySQL\Server 5.1\" DATADIR="E:\data\MySQL\" /qn
