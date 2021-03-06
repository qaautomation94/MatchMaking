package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.ExecutionFile;



public class Locatiors extends ExecutionFile{
	

	@FindBy(xpath="//input[contains(@id,'user')]") public WebElement UserName;
	@FindBy(xpath="//input[contains(@id,'password')]") public WebElement Password;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement LoginButton;
	@FindBy(xpath="//a[contains(@href, '/publishers')]") public WebElement Publishers;
	@FindBy(xpath="//tbody/tr") public List<WebElement> publisherrecords;
	@FindBy(xpath="//a[contains(@href, '/offers')]") public WebElement Offers;
	@FindBy(xpath="//a[contains(@href, '/logout')]") public WebElement Logout;
	
	
	@FindBy(xpath="//button[contains(@data-test, 'inspect')]") public List<WebElement> ViewBudget;

	@FindBy(xpath="//div[contains(@class, 'ant-empty-description')]") public List<WebElement> nobudget;
	@FindBy(xpath="//input[contains(@id,'user')]") public WebElement search;
	
	//CHAT
	@FindBy(xpath="//a[contains(@href, '/message/chat/messages')]") public WebElement ChatButton;
	
	@FindBy(xpath="//a[contains(text(), 'Messages')]") public WebElement messages;
	
	@FindBy(xpath="//a[contains(text(), 'Profile')]") public WebElement profile;
	@FindBy(xpath="//a[contains(text(), 'Edit Profile')]") public WebElement EditProfile;
	
	@FindBy(xpath="//input[contains(@id,'headline')]") public WebElement ProfileTitle;
	@FindBy(xpath="//textarea[contains(@id,'essay')]") public WebElement ProfileProposal;
	
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SubmitProposal;
	
	@FindBy(xpath="//div[contains(text(), 'Successfully Updated.')]") public WebElement SuccessMessage;
	
	@FindBy(xpath="//a[contains(text(), 'Edit Account')]") public WebElement EditAccount;
	@FindBy(xpath="//select[contains(@id,'day')]") public WebElement ChangeDOB;
	@FindBy(xpath="//button[contains(@type,'submit')]") public WebElement AccountDetails;
	
	@FindBy(xpath="//a[contains(text(), 'Edit Personal')]") public WebElement EditPersonal;
	
	@FindBy(xpath="//select[contains(@id,'body')]") public WebElement Body;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement PersonalProposal;
	
	//PROFILE EDIT PARTNER
	@FindBy(xpath="//a[contains(text(), 'Edit Partner')]") public WebElement EditPartner;
	@FindBy(xpath="//select[contains(@id,'p_weight_from')]") public WebElement Weight;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement PartnerPreferences;
	
	//PROFILE EDIT SETTINGS
	@FindBy(xpath="//a[contains(text(), 'Edit Settings')]") public WebElement EditSettings;
	@FindBy(xpath="//label[contains(@class,'custom-control-label')]") public WebElement EmailNotification;
	@FindBy(xpath="//input[contains(@id,'alerts')]") public WebElement UpdatePreferences;
	
	//PROFILE EDIT VERIFICATION
	@FindBy(xpath="//a[contains(text(), 'Edit Verification')]") public WebElement EditVerification;
	@FindBy(xpath="//input[contains(@id,'real_name')]") public WebElement RealName;
	@FindBy(xpath="//input[contains(@name,'mobile')]") public WebElement MobileNumber;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement VerifyAccount;
	
	//BASIC SEARCH
	@FindBy(xpath="//a[contains(text(), 'Search')]") public WebElement Search;
	@FindBy(xpath="//a[contains(text(),'Basic Search')]") public WebElement BasicSearch;
	@FindBy(xpath="//select[contains(@id,'p_age_to')]") public WebElement AgeRange;
	@FindBy(xpath="//select[contains(@id,'status')]") public WebElement Status;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement StartSearching;
	@FindBy(xpath="//h3[contains(text(), 'Search Results')]") public WebElement SearchResults;
	
	//ADVANCE SEARCH
	@FindBy(xpath="//a[contains(text(),'Advanced Search')]") public WebElement AdvancedSearch;
	@FindBy(xpath="//input[contains(@id,'appearance')]") public WebElement Charming;
	@FindBy(xpath="//input[contains(@id,'complexion')]") public WebElement VeryFair;
	@FindBy(xpath="//input[contains(@id,'cast')]") public WebElement Kshetri;
	@FindBy(xpath="//input[contains(@id,'class')]") public WebElement IdontCare;
	@FindBy(xpath="//label[contains(@class,'custom-control-label')]") public WebElement ProfilePhotoButton;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SearchingAdvance;
	
	//PHOTO GALLERY
	@FindBy(xpath="//a[contains(text(), 'Gallery')]") public WebElement Gallery;
	@FindBy(xpath="//a[contains(text(),'Photo Gallery')]") public WebElement PhotoGallery;
	@FindBy(xpath="//h3[contains(text(), ' Photo Gallery ')]") public WebElement PhotoGalleryTitle;
	
	//VIDEO GALLERY
	@FindBy(xpath="//a[contains(text(),'Video Gallery')]") public WebElement VideoGallery;
	@FindBy(xpath="//h3[contains(text(), ' Video Gallery ')]") public WebElement VideoGalleryTitle;
	
	//ONINE MEMBERS
	@FindBy(xpath="//a[contains(text(), 'Members')]") public WebElement Members;
	@FindBy(xpath="//a[contains(text(),'Online')]") public WebElement Online;
	@FindBy(xpath="//h3[contains(@class,'header_big bg-dark round20')]") public WebElement WhoisOnline;
	
	//RECENT MEMBERS
	@FindBy(xpath="//a[contains(text(),'Recent')]") public WebElement Recent;
	@FindBy(xpath="//h3[contains(text(), 'Recent Members')]") public WebElement RecentMembers;
	
	//VERIFIED MEMBERS
	@FindBy(xpath="//a[contains(text(),'Verified')]") public WebElement Verified;
	@FindBy(xpath="//h3[contains(text(), 'Verified Members')]") public WebElement VerifiedMembers;
	
	//NEWEST MEMBERS
	@FindBy(xpath="//a[contains(text(),'Newest')]") public WebElement Newest;
	@FindBy(xpath="//h3[contains(text(), 'New Members')]") public WebElement NewMembers;
	
	//FEATURED MEMBERS
	@FindBy(xpath="//a[contains(text(),'Featured')]") public WebElement Featured;
	@FindBy(xpath="//h3[contains(text(), 'Featured Members')]") public WebElement FeaturedMembers;
	
	//RECOMMENDED MEMBERS
	@FindBy(xpath="//a[contains(text(),'Recommended')]") public WebElement Recommended;
	@FindBy(xpath="//h3[contains(text(), 'Recommended Members')]") public WebElement RecommendedMembers;
	
	//MY MATCHES PROSPECTS
	@FindBy(xpath="//a[contains(text(), 'Prospects')]") public WebElement Prospects;
	@FindBy(xpath="//a[contains(text(),'My Matches')]") public WebElement MyMatches;
	@FindBy(xpath="//h3[contains(text(), 'My Matches')]") public WebElement MyMatchesTitle;
	
	//MY FAVOURITIES PROSPECTS
	@FindBy(xpath="//a[contains(text(),'My Favourites')]") public WebElement MyFavourites;
	@FindBy(xpath="//h3[contains(text(), 'My Favourites')]") public WebElement MyFavouritesTitle;
	
	//FAVOURS ME PROSPECTS
	@FindBy(xpath="//a[contains(text(),'Favours Me')]") public WebElement FavoursMe;
	@FindBy(xpath="//h3[contains(text(), 'Favours Me')]") public WebElement FavoursMeTitle;
	
	//MY VIEWED PROSPECTS
	@FindBy(xpath="//a[contains(text(),'My Viewed')]") public WebElement MyViewed;
	@FindBy(xpath="//h3[contains(text(), 'My Viewed')]") public WebElement MyViewedTitle;
		
	//VIEWED ME PROSPECTS
	@FindBy(xpath="//a[contains(text(),'Viewed Me')]") public WebElement ViewedMe;
	@FindBy(xpath="//h3[contains(text(), 'Viewed Me')]") public WebElement ViewedMeTitle;
		
	//MY BLOCKED PROSPECTS
	@FindBy(xpath="//a[contains(text(),'My Blocked')]") public WebElement MyBlocked;
	@FindBy(xpath="//h3[contains(text(), 'Blocked Profiles')]") public WebElement BlockedProfiles;
	
	//INCOMING MAIL MESSAGES
	@FindBy(xpath="//a[contains(text(), 'Messages')]") public WebElement Messages;
	@FindBy(xpath="//a[contains(text(),'Incoming Mails')]") public WebElement IncomingMails;
	@FindBy(xpath="//h3[contains(text(), ' Inbox Messages ')]") public WebElement  InboxMessages;
	
	//SENT MAIL MESSAGES
	@FindBy(xpath="//a[contains(text(),'Sent Mails')]") public WebElement SentMails;
	@FindBy(xpath="//h3[contains(text(), 'Sent Messages')]") public WebElement  SentMessages ;
	
	//RECEIVED INTERESTS MESSAGES
	@FindBy(xpath="//a[contains(text(),'Received Interests')]") public WebElement ReceivedInterests;
	@FindBy(xpath="//h3[contains(@class,'header_big')]") public WebElement   InterestsReceived;
	
	//SENT INTERESTS MESSAGES
	@FindBy(xpath="//a[contains(text(),'Sent Interests')]") public WebElement SentInterests;
	@FindBy(xpath="//h3[contains(@class,'header_big')]") public WebElement InterestsSent;
	
	//CHAT CONVERSATION MESSAGES
	@FindBy(xpath="//a[contains(text(),'Chat Conversations')]") public WebElement ChatConversations;
	@FindBy(xpath="//h3[contains(@class,'header_big')]") public WebElement ChatConversationsTitle;
	@FindBy(xpath="//button[contains(@id, 'btn_2')]") public WebElement ViewChat;
	@FindBy(xpath="//b[contains(@class,'btn btn-sm btn-success btn-block')]") public WebElement ReplyChat;
	@FindBy(xpath="//input[contains(@maxlength,'180')]") public WebElement RepltText;
	@FindBy(xpath="//button[contains(text(),'Send')]") public WebElement Send;
	@FindBy(xpath="//button[contains(text(),'×')]") public WebElement CloseChat;
	@FindBy(xpath="//button[contains(text(),'Hide Chat')]") public WebElement HideCaht;
	
	//ONLINE SECURITY SUPPORT
	@FindBy(xpath="//a[contains(text(), 'Support')]") public WebElement Support;
	@FindBy(xpath="//a[contains(text(),'Online Security')]") public WebElement OnlineSecurity;
	
	//RELATIONSHIP ADVICE SUPPORT
	@FindBy(xpath="//a[contains(text(),'Relationship Advice')]") public WebElement RelationshipAdvice;
	
	//HELP PAGE SUPPORT
	@FindBy(xpath="//a[contains(text(),'Help Pages')]") public WebElement HelpPages;
	
	//TESTIMONIALS SUPPORT
	@FindBy(xpath="//a[contains(text(),'Testimonials')]") public WebElement Testimonials;
	
	//ABOUT US SUPPORT
	@FindBy(xpath="//a[contains(text(),'About us')]") public WebElement Aboutus;
	
	//CONTACT US SUPPORT
	@FindBy(xpath="//a[contains(text(),'Contact us')]") public WebElement Contactus;
	@FindBy(xpath="//textarea[contains(@id,'comment')]") public WebElement Comment;
	@FindBy(xpath="//input[contains(@id, 'Submit')]") public WebElement SubmitInformation;
	
	//VIEWED
	@FindBy(xpath="//a[contains(@href,'/filter/viewedme')]") public WebElement Viewed;
	@FindBy(xpath="//h3[contains(text(),'Viewed Me')]") public WebElement ViewedMeText;
	
	//FAVOURS
	@FindBy(xpath="//a[contains(text(),'Favours')]") public WebElement Favours;
	
	//INTERESTS
	@FindBy(xpath="//a[contains(text(),'Interests')]") public WebElement Interests;
	
	//MAIL
	@FindBy(xpath="//a[contains(text(),'Mail')]") public WebElement Mail;
	@FindBy(xpath="//button[contains(text(),'View Mail')]") public WebElement ViewMail;
	@FindBy(xpath="//button[contains(text(),'Reply Mail')]") public WebElement ReplyMail;
	@FindBy(xpath="//input[contains(@id,'subject')]") public WebElement Subject;
	@FindBy(xpath="//textarea[contains(@id,'text')]") public WebElement Content;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SendMessage;
	@FindBy(xpath="//div[contains(text(),'Successfully Sent.')]") public WebElement SentMessageTitle;
	
	//SIGNUP
	@FindBy(xpath="//input[contains(@id,'Join')]") public WebElement Register;
	@FindBy(xpath="//input[contains(@id,'join_handle')]") public WebElement SignUpUserName;
	@FindBy(xpath="//input[contains(@id,'join_password')]") public WebElement CreatePassword;
	@FindBy(xpath="//input[contains(@id,'email')]") public WebElement Email;
	@FindBy(xpath="//label[contains(@class,'gender-cc female')]") public WebElement FemaleGender;
	@FindBy(xpath="//select[contains(@id,'day')]") public WebElement Day;
	@FindBy(xpath="//select[contains(@id,'month')]") public WebElement Month;
	@FindBy(xpath="//select[contains(@id,'year')]") public WebElement Year;
	@FindBy(xpath="//textarea[contains(@id,'essay')]") public WebElement ProposalDescription;
	@FindBy(xpath="//select[contains(@id,'country')]") public WebElement Country;
	@FindBy(xpath="//select[contains(@id,'state')]") public WebElement State;
	@FindBy(xpath="//span[contains(@id,'select2-city-container')]") public WebElement SelectCity;
	@FindBy(xpath="//li[contains(text(),'Acampo')]") public WebElement City;
	@FindBy(xpath="//select[contains(@id,'city')]") public WebElement City1;

	@FindBy(xpath="//select[contains(@id,'height')]") public WebElement Height;
	@FindBy(xpath="//select[contains(@id,'weight')]") public WebElement Weight2;
	@FindBy(xpath="//select[contains(@id,'appearance')]") public WebElement Appearance;
	@FindBy(xpath="//select[contains(@id,'complexion')]") public WebElement Complexion;
	@FindBy(xpath="//select[contains(@id,'status')]") public WebElement Marital;
	@FindBy(xpath="//select[contains(@id,'education')]") public WebElement Education;
	@FindBy(xpath="//select[contains(@id,'career')]") public WebElement Career;
	@FindBy(xpath="//select[contains(@id,'religion')]") public WebElement Religion;
	@FindBy(xpath="//select[contains(@id,'ethnicity')]") public WebElement Ethnicity;
	@FindBy(xpath="//select[contains(@id,'class')]") public WebElement SocialClass;
	@FindBy(xpath="//select[contains(@id,'residency')]") public WebElement Residency;
	@FindBy(xpath="//select[contains(@id,'family')]") public WebElement Family;
	@FindBy(xpath="//select[contains(@id,'smoking')]") public WebElement Smoking;
	@FindBy(xpath="//select[contains(@id,'drinking')]") public WebElement Drinking;
	@FindBy(xpath="//select[contains(@id,'diet')]") public WebElement Childern;
	@FindBy(xpath="//select[contains(@id,'humor')]") public WebElement Personality;
	@FindBy(xpath="//select[contains(@id,'first_date')]") public WebElement NextStep;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement CompleteRegistration;

}




