<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="Web tests">
    <test name= "Login feature">
        <classes>
            <class name="webtests.LoginValidUser"></class>
            <class name="webtests.LoginInvalidUser"></class>
        </classes>
    </test>

    <test name= "Add items feature">
        <classes>
            <class name="webtests.AddItemsToCart"></class>
        </classes>
    </test>
</suite>