package com.googlecode.tawus.addons.integration.pages;

import org.apache.tapestry5.annotations.Property;

public class TabPanelDemo
{
   @Property
   private String active;
   
   @Property
   private String active2;
  
   void onActivate(String active)
   {
      if(active != null && active.indexOf('-') != -1){
         String [] parts = active.split("-");
         this.active = parts[0];
         this.active2 = parts[1];
      }
      else 
      {
         this.active = active;
      }      
   }
   
   String onPassivate()
   {
      if(active2 != null){
         return active + "-" + active2;
      }
      return active;
   }
   
}
