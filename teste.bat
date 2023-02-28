@echo off
set targ=%1
set dest=%2
set ext=%3
shift
shift
echo %targ% %dest% %ext%
set full=%targ%\*%ext%
for %%f in (%full%) do (
	copy "%%f" "%dest%"
	del "%%f"
)
pause