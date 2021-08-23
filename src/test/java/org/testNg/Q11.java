package org.testNg;

import java.io.IOException;

import org.Base.BaseClass;
import org.pom.pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q11 extends BaseClass{
@BeforeClass(groups = {"pepper","thunder"})
private void openbrw() {
loadBrowser();
}
@AfterClass(groups = {"pepper","thunder"})
private void closebrw() {
close();
}
@AfterMethod(groups = {"pepper","thunder"})
private void endTime() {
printDateAndTime();
}
@BeforeMethod(groups = {"pepper","thunder"})
private void startTime() {
printDateAndTime();
}
@Test(groups ="pepper")
private void tc1() throws IOException {
lanchUrl("https://en-gb.facebook.com/");
pojo p=new pojo();
fillTextBox(p.getTxtUser(), getData(1, 0));
fillTextBox(p.getTxtPass(), getData(1, 1));

}
@Test(groups="thunder")
private void tc2() throws IOException {
lanchUrl("https://en-gb.facebook.com/");
pojo p=new pojo();
fillTextBox(p.getTxtUser(), getData(1, 0));
fillTextBox(p.getTxtPass(), getData(1, 1));

}
@Test(groups="pepper")
private void tc3() throws IOException {
lanchUrl("https://en-gb.facebook.com/");
pojo p=new pojo();
fillTextBox(p.getTxtUser(), getData(1, 0));
fillTextBox(p.getTxtPass(), getData(1, 1));

}
}
