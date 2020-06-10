package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.Constants;
import com.utility.*;

public class BestSellersPageTest extends BestSellersPage {

	public BestSellersPageTest() {
		super();
		PageFactory.initElements(Constants.driver, this);

	}

	@BeforeTest()
	public void launchingBestSellersPage() {
		BestSellersPageTest bsptest = new BestSellersPageTest();
		bsptest.pageSetUp();
	}

	@Test
	public void TC01() {
	// To verify if all sub-tabs are clickable and to verify their names
	String title_tab1_act = Constants.driver.getTitle();
	String title_tab1_exp = PropertyUtility.getProperty("");
	Constants.driver.navigate().back();

			bsptest.click_subtab_HotNewReleases();
			String title_tab2_act = Keywords.driver.getTitle();
			String title_tab2_exp = POM.FRAMEWORK.PropertyFile.getProperty("tab2_exp");
			Keywords.navigateBack();

			Constants.logger.log(Status.INFO, "Veifying the title for the webpage after clicking the subtab MostGifted");
			bsptest.click_subtab_MostGifted();
			String title_tab3_act = Keywords.driver.getTitle();
			String title_tab3_exp = POM.FRAMEWORK.PropertyFile.getProperty("tab3_exp");
			Keywords.navigateBack();

			Constants.logger.log(Status.INFO, "Verifying the title for the webpage after clicking the subtab MostWishedFor");
			bsptest.click_subtab_MostWishedFor();
			String title_tab4_act = Keywords.driver.getTitle();
			String title_tab4_exp = POM.FRAMEWORK.PropertyFile.getProperty("tab4_exp");
			Keywords.navigateBack();

			Constants.logger.log(Status.INFO, "Verifying the title for the webpage after clicking the subtab MoversandShakers");
			bsptest.click_subtab_MoversandShakers();
			String title_tab5_act = Keywords.driver.getTitle();
			String title_tab5_exp = POM.FRAMEWORK.PropertyFile.getProperty("tab5_exp");
			Keywords.navigateBack();

			Constants.logger.log(Status.INFO, "")
			softassert = new SoftAssert();
			softassert.assertEquals(title_tab1_act, title_tab1_exp);
			softassert.assertEquals(title_tab2_act, title_tab2_exp);
			softassert.assertEquals(title_tab3_act, title_tab3_exp);
			softassert.assertEquals(title_tab4_act, title_tab4_exp);
			softassert.assertEquals(title_tab5_act, title_tab5_exp);
			softassert.assertAll();
		}

	public void TC02() {
		// Verify if the tabs are having the required text
		bsptest.click_subtab_BestSellers();
		String tabName1 = bsptest.getSubtab_BestSellers().getText();
		String tabName1_exp = POM.FRAMEWORK.PropertyFile.getProperty("firstTabName");
		String tabName2 = bsptest.getSubtab_BestSellers().getText();
		String tabName2_exp = POM.FRAMEWORK.PropertyFile.getProperty("secondTabName");
		String tabName3 = bsptest.getSubtab_BestSellers().getText();
		String tabName3_exp = POM.FRAMEWORK.PropertyFile.getProperty("thirdTabName");
		String tabName4 = bsptest.getSubtab_BestSellers().getText();
		String tabName4_exp = POM.FRAMEWORK.PropertyFile.getProperty("fourthTabName");
		String tabName5 = bsptest.getSubtab_BestSellers().getText();
		String tabName5_exp = POM.FRAMEWORK.PropertyFile.getProperty("fifthTabName");
		softassert.assertEquals(tabName1, tabName1_exp);
		softassert.assertEquals(tabName2, tabName2_exp);
		softassert.assertEquals(tabName3, tabName3_exp);
		softassert.assertEquals(tabName4, tabName4_exp);
		softassert.assertEquals(tabName5, tabName5_exp);
		softassert.assertAll();
	}

	public void TC03() {
		// To verify if the elements after mouse hover have been highlighted/selected
		Keywords.mouseHover(getSubtab_BestSellers());
		boolean a = bsptest.getSubtab_BestSellers().isSelected();
		Keywords.mouseHover(getSubtab_HotNewReleases());
		boolean b = bsptest.getSubtab_HotNewReleases().isSelected();
		Keywords.mouseHover(getSubtab_MoversandShakers());
		boolean c = bsptest.getSubtab_MoversandShakers().isSelected();
		Keywords.mouseHover(getSubtab_MostWishedFor());
		boolean d = bsptest.getSubtab_MostWishedFor().isSelected();
		Keywords.mouseHover(getSubtab_MostGifted());
		boolean e = bsptest.getSubtab_MostGifted().isSelected();
		boolean expected = true;
		softassert = new SoftAssert();
		softassert.assertEquals(a, expected);
		softassert.assertEquals(b, expected);
		softassert.assertEquals(c, expected);
		softassert.assertEquals(d, expected);
		softassert.assertEquals(e, expected);
		softassert.assertAll();
	}

	// To verify the color of the WebElement
	public void TC04() {
		WebElement element = bsptest.getsigninbutton();
		String hex = Keywords.getBackgroundColor(element);
		System.out.println(hex);
		Assert.assertEquals(hex, value);

	}

	public void TC05() {

		Keywords.read_JSON_file("C:\\Users\\sony\\eclipse-workspace\\POM\\resources\\BestSellers.json",
				"Any Department");

	}

	List<String> actual = new ArrayList<String>();actual.add(bsptest.getSubtab_item_AmazonLaunchPad().getText());actual.add(bsptest.getSubtab_item_AppsforAndriod().getText());actual.add(bsptest.getSubtab_item_BabyProducts().getText());actual.add(bsptest.getSubtab_item_BagsWalletsLuggage().getText());actual.add(bsptest.getSubtab_item_Beauty().getText());actual.add(bsptest.getSubtab_item_Books().getText());actual.add(bsptest.getSubtab_item_CarandMotorbike().getText());actual.add(bsptest.getSubtab_item_ClothingandAccessories().getText());actual.add(bsptest.getSubtab_item_ComputersandAccessories().getText());actual.add(bsptest.getSubtab_item_Electronics().getText());actual.add(bsptest.getSubtab_item_Garden_Outdoors().getText());actual.add(bsptest.getSubtab_item_GiftCards().getText());actual.add(bsptest.getSubtab_item_GroceryGourmetFoods().getText());actual.add(bsptest.getSubtab_item_HealthandPersonalCare().getText());actual.add(bsptest.getSubtab_item_HomeandKithen().getText());actual.add(bsptest.getSubtab_item_HomeImprovement().getText());actual.add(bsptest.getSubtab_item_IndustrialandScientific().getText());actual.add(bsptest.getSubtab_item_Jewellery().getText());actual.add(bsptest.getSubtab_item_KindleStore().getText());actual.add(bsptest.getSubtab_item_MoviesandTVShow().getText());actual.add(bsptest.getSubtab_item_Music().getText());actual.add(bsptest.getSubtab_item_MusicalInstruments().getText());actual.add(bsptest.getSubtab_item_OfficeProducts().getText());actual.add(bsptest.getSubtab_item_PetSupplies().getText());actual.add(bsptest.getSubtab_item_ShoesandHandbags().getText());actual.add(bsptest.getSubtab_item_Software().getText());actual.add(bsptest.getSubtab_item_SportsFitnessOutdoors().getText());actual.add(bsptest.getSubtab_item_ToysandGames().getText());actual.add(bsptest.getSubtab_item_VideoGames().getText());actual.add(bsptest.getSubtab_item_Watched().getText());Assert.assertEquals(actual,expected);

	}

	// To verify the location of Sign-in Button
	public void TC06() {
			WebElement signinbutton = bsptest.getSignin_button();
			Point buttonlocation = signinbutton.getLocation();
			int x_co_ordinate = buttonlocation.getX();
			int y_co_ordinate = buttonlocation.getY();
			Assert.assertEquals(x_co_ordinate, expected);
			Assert.assertEquals(y_co_ordinate, expected);

		}

	// This testcase will capture the screenshot of the entire viewport after
	// clicking the tab BestSellersPage on Homepage
	@Test
	public void TC07() {
		// Calling a method from Keywords Package to generate Reports using external
		// library ExtentReports
		Keywords.generateExtentReport("ScreenshotforBestSellersPage", "TC07");

		// Creating logs in the reports previously generated in Step 1
		Constants.logger.log(Status.INFO, "Capturing the screenshot for BestSellersPage");

		// Capturing screenshot by using the method from Keywords package which uses
		// AShot library
		Screenshot sc = Keywords.takeScreenshot("PNG", "BestSellersPage", "./Screenshots");

		// Navigating back to the home-page from the current-page
		Keywords.navigateBack();
		Keywords.navigateBack();

	}

	// This testcase will capture the screenshot of the entire viewport after
	// clicking subtab HotNewReleases
	@Test
	public void TC08() {

		// Using the instance created for BestSellersPage class to click on WebElement
		// present in this class
		bsptest.click_subtab_HotNewReleases();

		// Calling a method from Keywords to generate Extent Report using external
		// library
		Keywords.generateExtentReport("Screenshotfor_subtabHotNewReleases", "TC08");

		// Creating logs by using log method of ExtentTest class and done so by using
		// reference given to instance of
		// ExtentTest class
		Constants.logger.log(Status.INFO, "Capturing Screenshots after clicking the subtab HotNewReleases");

		// Capturing Screenshot by using a method in Keywords package which uses AShot
		// library
		Screenshot sc = Keywords.takeScreenshot("PNG", "subtabHotNewReleases", "./Screenshots");

		// Navigating back to home-page from the current page
		Keywords.navigateBack();
		Keywords.navigateBack();

	}

	// This method will capture the screenshot of the webpage which will open after
	// clicking on the subtab Movers and Shakers
	// on The BestSellers page
	@Test
	public void TC09() {
		// using the instance created for BestSellersTest page for clicking a WebElement
		// present in that class
		bsptest.click_subtab_MoversandShakers();

		// Using a method present in Keywords Package to generate Extent Report for the
		// given Test case
		Keywords.generateExtentReport("ScreenshotofWebpage_subtabMoversandShakers", "TC09");

		// Using the method in Keywords Package which uses AShot library to take
		// screenshot for the viewport by pasting
		Screenshot sc = Keywords.takeScreenshot("PNG", "MoversandShakers", "./Screenshots");

		// Creating logs inside the Extent Report previously generated
		Constants.logger.log(Status.INFO,
				"Capturing the screenshot after clicking on subtab Movers and Shakers after navigating to the BestSellersPage from Homepage");

		// Using the method twice in Keywords Package to nagivate back to the homepage
		Keywords.navigateBack();
		Keywords.navigateBack();

	}

	// This testcase will take the screenshot for the entire viewport for the
	// specified WebPage
	@Test
	public void TC010() {
		// using the instance created for BestSellersTest page for clicking a WebElement
		// present in that class
		bsptest.click_subtab_MostWishedFor();

		// Using a method present in Keywords Package to generate Extent Report for the
		// given Test case
		Keywords.generateExtentReport("ScreenshotofWebpage_subtabMostWishedFor", "TC010");

		// Using the method in Keywords Package which uses AShot library to take
		// screenshot for the entire viewport by pasting
		Screenshot sc = Keywords.takeScreenshot("PNG", "MostWishedFor", "./Screenshots");

		// Creating logs inside the Extent Report previously generated
		Constants.logger.log(Status.INFO,
				"Capturing the screenshot after clicking on subtab MostWishedFor after navigating to the BestSellersPage from Homepage");

		// Using the method twice in Keywords Package to nagivate back to the homepage
		Keywords.navigateBack();
		Keywords.navigateBack();

	}

	// This test case will take the screenshot for the entire viewport for the
	// specified WebPage
	@Test
	public void TC011() {
		// using the instance created for BestSellersTest page for clicking a webelement
		// present in that class
		bsptest.click_subtab_MostGifted();

		// Using a method present in Keywords Package to generate Extent Report for the
		// given Test case
		Keywords.generateExtentReport("ScreenshotofWebpage_subtabMostGifted", "TC012");

		// Using the method in Keywords Package which uses AShot library to take
		// screenshot for the viewport by pasting
		Screenshot sc = Keywords.takeScreenshot("PNG", "MostGifted", "./Screenshots");

		// Creating logs inside the Extent Report previously generated
		Constants.logger.log(Status.INFO,
				"Capturing the screenshot after clicking on subtab MostGifted after navigating to the webpage of BestSellersPage from Homepage");

		// Using the method twice in Keywords Package to nagivate back to the homepage
		Keywords.navigateBack();
		Keywords.navigateBack();

	}

	// To verify if all the categories named in the list on the webpage BestSellers
	// are correct or not
	@Test
	public void TC012() {
		List<WebElement> anydepartmentlist = Constants.driver.findElements(By.xpath("//div/ul[@id='zg_browseRoot']"));
		int i = anydepartmentlist.size();
		Iterator<WebElement> itr = anydepartmentlist.iterator();
		List<String> list = null;
		while (itr.hasNext()) {
			list.add(itr.next().getText());
		}
		System.out.println(list);
		JSONParser parser = new JSONParser();
		Object obj = parser
				.parse(new FileReader("C:\\Users\\sony\\eclipse-workspace\\POM\\resources\\anydepartment.json"));
		JSONObject jsonobj = (JSONObject) obj;
		JSONArray jarray = (JSONArray) jsonobj.get("anydepartment");

	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	@Test
	public void TC013() {

		// Using the method in Keywords package to generate Extent Reports
		Keywords.generateExtentReport("Reportforclicking_subtabitem_AmazonLaunchPad", "TC013");

		// using the reference for instance of the class created for webpage
		// BestSellersPage for the clicking a WebElement present on it
		bsptest.click_subtab_item_AmazonLaunchPad();

		// Verifying that after clicking on subtab the url matched with the expected
		String url_afterclicking_subtabitem_AmazonLaunchPad = Constants.driver.getCurrentUrl();
		String url_expeced_afterclicking_subtabitem_AmazonLaunchPad = "https://www.amazon.in/gp/bestsellers/boost/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_AmazonLaunchPad,
				url_expeced_afterclicking_subtabitem_AmazonLaunchPad);

		// going back to the BestSellers webpage
		Keywords.navigateBack();

		// Fetching the url of the window to which the driver instance is currently
		// pointing at.
		String currenturl = Constants.driver.getCurrentUrl();

		// Getting the expected url
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";

		// Creating log in Extent Reports for verifying the result
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");

		// Comparing the actual and expected url
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC014() {

		Keywords.generateExtentReport("Reportforclicking_subtabBabyProducts", "TC014");
		bsptest.click_subtab_item_BabyProducts();
		String url_afterclicking_subtabitem_BabyProducts = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_BabyProducts = "https://www.amazon.in/gp/bestsellers/baby/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_BabyProducts,
				url_expected_afterclicking_subtabitem_BabyProducts);

		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);

	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC015() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_BabyProducts", "TC015");
		bsptest.click_subtab_item_BagsWalletsLuggage();
		String url_afterclicking_subtabitem_BagsWalletsLuggage = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_BagsWalletsLuggage = "https://www.amazon.in/gp/bestsellers/luggage/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_BagsWalletsLuggage,
				url_expected_afterclicking_subtabitem_BagsWalletsLuggage);

		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC016() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_BabyProducts", "TC016");
		bsptest.click_subtab_item_Beauty();
		String url_afterclicking_subtabitem_Beauty = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Beauty = "https://www.amazon.in/gp/bestsellers/beauty/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Beauty, url_expected_afterclicking_subtabitem_Beauty);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC017() {
		Keywords.generateExtentReport("Reportforclicking_subtabBooks", "TC017");
		bsptest.click_subtab_item_Books();
		String url_afterclicking_subtabitem_Books = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Books = "https://www.amazon.in/gp/bestsellers/books/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Books, url_expected_afterclicking_subtabitem_Books);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC018() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_CarandMotorBike", "TC018");
		bsptest.click_subtab_item_CarandMotorbike();
		String url_afterclicking_subtabitem_CarandMotorBike = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_CarandBike = "https://www.amazon.in/gp/bestsellers/automotive/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_CarandMotorBike,
				url_expected_afterclicking_subtabitem_CarandBike);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC019() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_ClothingandAccessories", "TC019");
		bsptest.click_subtab_item_ClothingandAccessories();
		String url_afterclicking_subtabitem_ClothingandAccessories = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_ClothingandAccessories = "https://www.amazon.in/gp/bestsellers/apparel/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_ClothingandAccessories,
				url_expected_afterclicking_subtabitem_ClothingandAccessories);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC020() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_ComputersandAccessories", "TC020");
		bsptest.click_subtab_item_ComputersandAccessories();
		String url_afterclicking_subtabitem_ComputersandAccessories = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_ComputersandAccessories = "https://www.amazon.in/gp/bestsellers/computers/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_ComputersandAccessories,
				url_expected_afterclicking_subtabitem_ComputersandAccessories);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC021() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_Electronics", "TC021");
		bsptest.click_subtab_item_Electronics();
		String url_afterclicking_subtabitem_Electronics = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Electronics = "https://www.amazon.in/gp/bestsellers/electronics/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Electronics,
				url_expected_afterclicking_subtabitem_Electronics);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC022() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_GardenandOutdoors", "TC022");
		bsptest.click_subtab_item_Garden_Outdoors();
		String url_afterclicking_subtabitem_GardenandOutdoors = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_GardenandOutdoors = "https://www.amazon.in/gp/bestsellers/garden/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_GardenandOutdoors,
				url_expected_afterclicking_subtabitem_GardenandOutdoors);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC023() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_GiftCards", "TC023");
		bsptest.click_subtab_item_GiftCards();
		String url_afterclicking_subtabitem_GiftCards = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_GiftCards = "https://www.amazon.in/gp/bestsellers/gift-cards/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_GiftCards, url_expected_afterclicking_subtabitem_GiftCards);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC024() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_GroceryandGourmetFoods", "TC024");
		bsptest.click_subtab_item_GroceryGourmetFoods();
		String url_afterclicking_subtabitem_GroceryandGourmetFoods = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_GroceryandGourmetFoods = "https://www.amazon.in/gp/bestsellers/grocery/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_GroceryandGourmetFoods,
				url_expected_afterclicking_subtabitem_GroceryandGourmetFoods);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC025() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_HealthandPersonalCare", "TC025");
		bsptest.click_subtab_item_HealthandPersonalCare();
		String url_afterclicking_subtabitem_HealthandPersonalCare = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_HealthandPersonalCare = "https://www.amazon.in/gp/bestsellers/hpc/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_HealthandPersonalCare,
				url_expected_afterclicking_subtabitem_HealthandPersonalCare);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC026() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_HomeandKithen", "TC026");
		bsptest.click_subtab_item_HomeandKithen();
		String url_afterclicking_subtabitem_HomeandKithen = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_HomeandKithen = "https://www.amazon.in/gp/bestsellers/kitchen/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_HomeandKithen,
				url_expected_afterclicking_subtabitem_HomeandKithen);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC027() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_HomeImprovement", "TC027");
		bsptest.click_subtab_item_HomeImprovement();
		String url_afterclicking_subtabitem_HomeImprovement = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_HomeImprovement = "https://www.amazon.in/gp/bestsellers/home-improvement/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_HomeImprovement,
				url_expected_afterclicking_subtabitem_HomeImprovement);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC028() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_IndustrialandScientific", "TC028");
		bsptest.click_subtab_item_IndustrialandScientific();
		String url_afterclicking_subtabitem_IndustrialandScientific = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_IndustrialandScientific = "https://www.amazon.in/gp/bestsellers/industrial/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_IndustrialandScientific,
				url_expected_afterclicking_subtabitem_IndustrialandScientific);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC029() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_Jewellery", "TC029");
		bsptest.click_subtab_item_Jewellery();
		String url_afterclicking_subtabitem_Jewellery = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Jewellery = "https://www.amazon.in/gp/bestsellers/jewelry/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Jewellery, url_expected_afterclicking_subtabitem_Jewellery);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC030() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_KindleStore", "TC030");
		bsptest.click_subtab_item_KindleStore();
		String url_afterclicking_subtabitem_KindleStore = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_KindleStore = "https://www.amazon.in/gp/bestsellers/digital-text/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_KindleStore,
				url_expected_afterclicking_subtabitem_KindleStore);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC031() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_MoviesandTVShow", "TC031");
		bsptest.click_subtab_item_MoviesandTVShow();
		String url_afterclicking_subtabitem_MoviesandTVShow = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_MoviesandTVShow = "https://www.amazon.in/gp/bestsellers/dvd/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_MoviesandTVShow,
				url_expected_afterclicking_subtabitem_MoviesandTVShow);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC032() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_Music", "TC032");
		bsptest.click_subtab_item_Music();
		String url_afterclicking_subtabitem_Music = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Music = "https://www.amazon.in/gp/bestsellers/music/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Music, url_expected_afterclicking_subtabitem_Music);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC033() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_MusicalInstruments", "TC033");
		bsptest.click_subtab_item_MusicalInstruments();
		String url_afterclicking_subtabitem_MusicalInstruments = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_MusicalInstruments = "https://www.amazon.in/gp/bestsellers/musical-instruments/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_MusicalInstruments,
				url_expected_afterclicking_subtabitem_MusicalInstruments);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC034() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_OfficeProducts", "TC034");
		bsptest.click_subtab_item_OfficeProducts();
		String url_afterclicking_subtabitem_OfficeProducts = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_OfficeProducts = "https://www.amazon.in/gp/bestsellers/office/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_OfficeProducts,
				url_expected_afterclicking_subtabitem_OfficeProducts);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC035() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_PetSupplies", "TC035");
		bsptest.click_subtab_item_PetSupplies();
		String url_afterclicking_subtabitem_PetSupplies = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_PetSupplies = "https://www.amazon.in/gp/bestsellers/pet-supplies/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_PetSupplies,
				url_expected_afterclicking_subtabitem_PetSupplies);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC036() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_ShoesandHandbags", "TC036");
		bsptest.click_subtab_item_ShoesandHandbags();
		String url_afterclicking_subtabitem_ShoesandHandbags = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_ShoesandHandbags = "https://www.amazon.in/gp/bestsellers/shoes/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_ShoesandHandbags,
				url_expected_afterclicking_subtabitem_ShoesandHandbags);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC037() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_Software", "TC037");
		bsptest.click_subtab_item_Software();
		String url_afterclicking_subtabitem_Software = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Software = "https://www.amazon.in/gp/bestsellers/software/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Software, url_expected_afterclicking_subtabitem_Software);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC038() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_SportsFitnessOutdoors", "TC038");
		bsptest.click_subtab_item_SportsFitnessOutdoors();
		String url_afterclicking_subtabitem_SportsFitnessOutdoors = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_SportsFitnessOutdoors = "https://www.amazon.in/gp/bestsellers/sports/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_SportsFitnessOutdoors,
				url_expected_afterclicking_subtabitem_SportsFitnessOutdoors);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC039() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_ToysandGames", "TC039");
		bsptest.click_subtab_item_ToysandGames();
		String url_afterclicking_subtabitem_ToysandGames = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_ToysandGames = "https://www.amazon.in/gp/bestsellers/toys/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_ToysandGames,
				url_expected_afterclicking_subtabitem_ToysandGames);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	// To verify if all the categories in the list of BestSellers page are clickable
	// one by one and if we navigate back to the
	// homepage successfully
	public void TC040() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_VideoGames", "TC040");
		bsptest.click_subtab_item_VideoGames();
		String url_afterclicking_subtabitem_VideoGames = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_VideoGames = "https://www.amazon.in/gp/bestsellers/videogames/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_VideoGames, url_expected_afterclicking_subtabitem_VideoGames);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	public void TC041() {
		Keywords.generateExtentReport("Reportforclicking_subtabitem_Watches", "TC041");
		bsptest.click_subtab_item_Watches();
		String url_afterclicking_subtabitem_Watches = Constants.driver.getCurrentUrl();
		String url_expected_afterclicking_subtabitem_Watches = "https://www.amazon.in/gp/bestsellers/watches/ref=zg_bs_nav_0";
		Assert.assertEquals(url_afterclicking_subtabitem_Watches, url_expected_afterclicking_subtabitem_Watches);
		Keywords.navigateBack();
		String currenturl = Constants.driver.getCurrentUrl();
		String expectedurl = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Constants.logger.log(Status.INFO,
				"Verifying if we have navigated back to BestSellersPage by verifying the url is same or not");
		Assert.assertEquals(currenturl, expectedurl);
	}

	@AfterMethod
	public void TC100() {
		Keywords.driver.quit();
	}

}
