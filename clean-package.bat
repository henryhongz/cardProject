@echo off

echo.

echo [信息] 清理生成路径。
echo.



%~d0

cd %~dp0



cd card-demo


call mvn install





pause