Testset to demonstrate a bug in combination of spring-boot, maven-failsafe-plugin 2.19 and Windows XP/2003.

The bug is a hang of the console if the integration test runs. It displays the spring-boot banner and then hangs.

I figured out that every thread dump I made hangs on a java.io.Consol.istty() call.