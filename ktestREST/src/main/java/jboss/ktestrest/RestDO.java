package jboss.ktestrest;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RestDO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Input1")
   private java.lang.String col1;
   @org.kie.api.definition.type.Label(value = "Input two")
   private java.lang.String col2;
   @org.kie.api.definition.type.Label(value = "Output col")
   private java.lang.String col3;

   public RestDO()
   {
   }

   public java.lang.String getCol1()
   {
      return this.col1;
   }

   public void setCol1(java.lang.String col1)
   {
      this.col1 = col1;
   }

   public java.lang.String getCol2()
   {
      return this.col2;
   }

   public void setCol2(java.lang.String col2)
   {
      this.col2 = col2;
   }

   public java.lang.String getCol3()
   {
      return this.col3;
   }

   public void setCol3(java.lang.String col3)
   {
      this.col3 = col3;
   }

   public RestDO(java.lang.String col1, java.lang.String col2,
         java.lang.String col3)
   {
      this.col1 = col1;
      this.col2 = col2;
      this.col3 = col3;
   }

}