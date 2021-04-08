Feature: Celebrity Fashion
Background:
Given Launch browser and navigate to url


@Registration
Scenario:
When Register new Customer "Rakshi_Kathir" and "rakshikathir.12@gmail.com"
And Set password using the link received in Email "rakshikathir.12@gmail.com" and "RakshiKathir@123"
Then Customer Registered successful

@Login
Scenario:
When Login as "Varun_krish" and "Varun@123"
And Click SignIn
Then Customer Logged in successfully

@Forgot_Password
Scenario:
When Click on Forgot password
And Enter the Email address "rakshikathir.12@gmail.com" and click send
And Navigate to respective mail account "rakshikathir.12@gmail.com" and "RakshiKathir@123"
Then Click set password link received in mail
And Enter password "RakshiKathir@1" and click submit
And Click on SignIn

@RM_CreateRole
Scenario:
When Login as "Praveen_Kumar" and "Praveen@123"
And Click Roles and try to add Role "DH"
And Select modules and click add
Then New Role Created successfully

@Edit_and_Delete_Role
Scenario:
When Login as "Praveen_Kumar" and "Praveen@123"
And Click Roles,select role,edit "s" then update
Then Delete role 

@UM_AddUser
Scenario:
When Login as "Praveen_Kumar" and "Praveen@123"
And Click User,Add User "Shalu" and "shalu@gmail.com"  and "DH"
Then Save user

@UM_update_delete__UserInfo
Scenario:
When Login as "Sindhuja Rajendran" and "ThamanMitra@1"
And Click User and edit role,email address as "ram12@gmail.com"
And Delete User
Then User info can be Updated and Deleted successfully

@UM_SBox_Sort
Scenario:
When Login as "Sindhuja Rajendran" and "ThamanMitra@1"
And Enter "Praveen" in search box as match data
And Enter "Sindhu" in search box as mis-match
Then Check sort

@FaceBook_SignUp
Scenario:
When SignUP with Facebook "thamanmitra.s@gmail.com" and "ThamanMitra@1"
Then Successfully registered


@FB_SignUp_witout_email
Scenario:
When SignUP with Facebook not linked with email "7550155333" and "SindhujaMitra@1" 
And Please register you email address "sindhujamithu92@gmail.com"
Then Facebook signUp successfull
@Google_SignUp
Scenario:
When SignUP with google "sindhujanandhan92@gmail.com" and "SindhujaNandhan@1"
Then Successfully registered with google
@FaceBook_SignIn
Scenario:
When SignIn with Facebook "thamanmitra.s@gmail.com" and "ThamanMitra@1"
Then Successfully signIn with facebook
@Google_SignIn
Scenario:
When SignIn with Google "sindhujanandhan92@gmail.com" and "SindhujaNandhan@1"
Then Successfully signIn with google
@ProfileUpdate
Scenario:
When Login  as "Varun_krish" "Varun@123" and Click Profile and edit
And Enter Fname "Varun" Lname "Krishnan" mobile "1234567543"
And Gender DoB "05-11-2000" mail "varun.krish.v.12@gmail.com"
Then Click update
@upload_profile_Image
Scenario:
When Login  as "Varun_krish" "Varun@123" and Click Profile and edit profile
Then Upload image and click update
@Invalid_Profile_Update
Scenario:
When Login  as "Varun_krish" "Varun@123" and Click Profile and edit
And Enter Fname "Varun1" Lname "Krishnan23" mobile "12345675431"
And Gender DoB "05-11-2021" mail "varun.krish.v.12gmail.com"
Then Click update
@Moodboard_sort
Scenario:
When Login as "Shalini_Shiv" "Shalini@123" and click moodboard left menu
And sort by "Recent" then by "Alphabet" and finally by "Popularity"
Then sorting done and driver closed

@Moodboard_Mywork&RecentlyUpload_navigation
Scenario:
When Login as "Shalini_Shiv" "Shalini@123" and click moodboard left menu
And Click recently uploaded topic,then navigate back
And Click My work style ,then navigate bac'k

@CreateTopic
Scenario:
When Login as "Shalini_Shiv" "Shalini@123" and click moodboard left menu
And Click create topic in moodboard
And Enter topic as "TMB Mens's 4" with description "Trendy Men's wear##4"
And click next and attach image and design file
And Click next and invite people "Priya" "Preethi" then click done
@EditVersion
Scenario:
When Login as "Shalini_Shiv" "Shalini@123" and click moodboard left menu
And Click style, edit description as "Mens wear@#$1" and edit this topic
Then Add new people to the topic
@Upload_NewVersion
Scenario:
When Login as "Shalini_Shiv" "Shalini@123" and click moodboard left menu
And Click style "MM wear##1" and upload new version
Then Add new people "Preethi" to added version of particular topic
@Send_for_approval
Scenario:
When Login as "Shalini_Shiv" "Shalini@123" and click moodboard left menu
And Select particular style and Click send for approval
And Send to  design head "Shruthi"
@Send_for_pricing
Scenario:
When login as design head  with following credential "Shruthi" and "Shruthi@123"
And Click in app notification and approve it
Then send to merchandiser "Priya_bharathi"
@Request_Img
Scenario:
When Login as merchandiser "Priya_bharathi" and "Priya@123"
And Click in app notification
And Select gender as "Male" and catagory as "LL Bean" and price "1010.95" and click next
And Select default image and customization fabric and click image request button
Then send image request to designer "Varun_Krish"











