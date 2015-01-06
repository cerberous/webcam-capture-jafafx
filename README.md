Project created to shoe eror on closing WebCamera
===================================================
To reproduce the error:
1 - Star application (Main.java);
2 - Open Webcam preview by clicking on 'Dialog' Button;
3 - Select WebCam, Stop Webcam, Dispose Webcam and close the dialog;

When doing again, beginning from step 2, the application crashes when clicking on 'Dispose'.
See 'hs_err_pid2144.log' file for log details.