package validation;


import org.json.JSONString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Validate {

	private static final JSONString[] username = null;
	private static final WebElement inputField = null;
	private static final WebElement newUser = null;
	private static final WebElement addUserButton = null;
	private static final WebElement addButton = null;
	private static final CharSequence name = null;
	private static Object Else;
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xoliswa\\eclipse-workspace\\webdriver.exe");
		
		driver.get("https://www.way2automation.com/angularjsprotrator/webtables/");
		// Validate that you are on the User List Table
			driver.findElement(By.className("UserListTable"));
			if(userTable.isDisplayed()) {
				System.out.println("user list table displayed");
				
				
			}else {
				System.out.println("user List not displayed.");
			}
			
			driver.findElement(By.id("user-input"));
			driver.findElement(By.id("add-buton"));
			inputField.clear();
			inputField.sendKeys(name);
			addButton.click();
			
			if (newUser.isDisplayed()) {
				System.out.println("user was successfully added");
				
			}  else {
				System.out.println("user not added");
				
			}
			
			driver.quit();
				
			}
	
		
		// Click Add User.
	public void AddUser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/angularjsprotrator/webtables/");
		driver.findElement(By.id("user button"));
		addUserButton.click();
		
		driver.quit();
		
	}
			
		//  Add users with the details below
	@Test
	
	public void testAddUsers() {
		addUser("FName1, LName1, user1, Pass1, Company AA, Admin, admin@mail.com, 08255 ");
		
		addUser("FName1, LName2, user2, Pass2, Company BB, Customer, cusomter@mail.com, 08255 ");
				
	}



	private void addUsers(FirstName, LastName, UserName, Password, Customer, Role, Email, Cell ) {
		// locate the elements and fill in the user details 
		driver.findElement(By.id("first Name"));
		driver.findElement(By.id("last Name"));
		driver.findElement(By.id("user Name(*)"));
		driver.findElement(By.id("password"));
		driver.findElement(By.id("customer"));
		driver.findElement(By.id("role"));
		driver.findElement(By.id("email"));
		driver.findElement(By.id("cell"));
		
		//fill in details 
		firstnamefield.sendKey(firstname);
		lastnamefield.sendKey(lastname);
		usernamefield.sendKey(username);
		passwordfield.sendKey(password);
		customerfield.sendKey(customer);
		rolefield.sendKey(role);
		emailfield.sendkey(email);
		cellfield.sendKey(cell);
		
		//submit the form
				submitButton.click();
		
		
		
	
	
		
	//  Ensure that Username (*) is unique on each run
		public void uniqueUserName() {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.way2automation.com/angularjsprotrator/webtables/");
			
			@Test
			public void uniqueUsername() {
				addUser("uniqueUsername");
				
				
			}


			private void addUser(String string) {
				
			}
				
		
		
		driver.quit();
		
		
		
		//Ensure that your users are added to the list.
		public static void main1(String[] args) {
			ChromeOptions options = new ChromeOptions();
			
				String[] usersToAdd = {"", "", "",};
				for (String username : usersToAdd){
					driver.findElement(By.id("user-input"));
					driver.findElement(By.id("add-button"));
					
					inputField.clear();
					inputfield.sendKey(firstName);
					
					addButton.click();
					
					//verify users are added
					driver.findElements(By.cssSelector("user-list"));
					for (String Name : usersToAdd) {
						boolean userFound = false;
						for (userElement : userList ) {
							if(user.getText().equals(username)) {
								userFound = true;
								break;
								
							}
						}
						
						if (userFound ) {
							System.out.print("user succesfully added.");
							
						}  else = Else; {
							System.out.print("usernot in the list");
						}
						
					}
				}	
				}
				driver.quit();
 				
		
			
		
		
		
			
		