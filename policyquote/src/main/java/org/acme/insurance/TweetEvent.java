package org.acme.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Role(org.kie.api.definition.type.Role.Type.EVENT)
public class TweetEvent implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("User Who Tweeted")
   private java.lang.String user;
   @org.kie.api.definition.type.Label("Screen name")
   private java.lang.String screename;
   @org.kie.api.definition.type.Label("Tweet Content")
   private java.lang.String tweet;

   @org.kie.api.definition.type.Label(value = "Date of Tweet")
   private java.util.Date tweetdate;

   public TweetEvent()
   {
   }

   public java.lang.String getUser()
   {
      return this.user;
   }

   public void setUser(java.lang.String user)
   {
      this.user = user;
   }

   public java.lang.String getScreename()
   {
      return this.screename;
   }

   public void setScreename(java.lang.String screename)
   {
      this.screename = screename;
   }

   public java.lang.String getTweet()
   {
      return this.tweet;
   }

   public void setTweet(java.lang.String tweet)
   {
      this.tweet = tweet;
   }

   public java.util.Date getTweetdate()
   {
      return this.tweetdate;
   }

   public void setTweetdate(java.util.Date tweetdate)
   {
      this.tweetdate = tweetdate;
   }

   public TweetEvent(java.lang.String user, java.lang.String screename,
         java.lang.String tweet, java.util.Date tweetdate)
   {
      this.user = user;
      this.screename = screename;
      this.tweet = tweet;
      this.tweetdate = tweetdate;
   }

}