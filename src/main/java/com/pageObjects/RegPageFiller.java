package com.pageObjects;

import com.base.Base;

public class RegPageFiller {
public void regPageForm(String prex, RegistrationPgObject registrationPgObject,Base base ){
  
  registrationPgObject.selectTitle(base.propp.getProperty(prex+ "title"));
  registrationPgObject.enterLName(base.propp.getProperty(prex+ "lname"));
  registrationPgObject.enterFName(base.propp.getProperty(prex+ "fname"));
  registrationPgObject.enterAdd1(base.propp.getProperty(prex+ "address"));
  registrationPgObject.enterTown(base.propp.getProperty(prex+ "town"));
  registrationPgObject.enterPostal(base.propp.getProperty(prex+ "post"));
  registrationPgObject.enterHPone(base.propp.getProperty(prex+ "tel"));
  registrationPgObject.entermobPhone(base.propp.getProperty(prex+ "mob"));
  registrationPgObject.enterEmail(base.propp.getProperty(prex+ "mail"));
  registrationPgObject.enterreEmail(base.propp.getProperty(prex+ "reemail"));
  registrationPgObject.selectID(base.propp.getProperty(prex+ "id"));
  registrationPgObject.enterID(base.propp.getProperty(prex+ "idno"));
  registrationPgObject.enterPWD(base.propp.getProperty(prex+ "pwd"));
  registrationPgObject.enterRepwd(base.propp.getProperty(prex+ "repwd"));
 /* registrationPgObject.clickCheck1();
  registrationPgObject.clickCheck2();
  registrationPgObject.clickCheck3();
  registrationPgObject.clickConfirm();*/
 }

}