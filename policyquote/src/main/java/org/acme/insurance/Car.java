package org.acme.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Car implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Brand")
   private java.lang.String brand;
   @org.kie.api.definition.type.Label(value = "Wheels")
   private java.lang.String wheels;

   public Car()
   {
   }

   public java.lang.String getBrand()
   {
      return this.brand;
   }

   public void setBrand(java.lang.String brand)
   {
      this.brand = brand;
   }

   public java.lang.String getWheels()
   {
      return this.wheels;
   }

   public void setWheels(java.lang.String wheels)
   {
      this.wheels = wheels;
   }

   public Car(java.lang.String brand, java.lang.String wheels)
   {
      this.brand = brand;
      this.wheels = wheels;
   }

}