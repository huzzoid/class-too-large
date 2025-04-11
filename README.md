# class-too-large

This is sample project to reproduce "Class too large error"

`> Task :app:processDebugAndroidTestResources FAILED
FAILURE: Build failed with an exception.`
`* What went wrong:
Execution failed for task ':app:processDebugAndroidTestResources'.`
`> A failure occurred while executing com.android.build.gradle.internal.res.LinkApplicationAndroidResourcesTask$TaskAction`
`> Class too large: com/example/myapplication/test/R$string`

see more at https://issuetracker.google.com/issues/408010448
