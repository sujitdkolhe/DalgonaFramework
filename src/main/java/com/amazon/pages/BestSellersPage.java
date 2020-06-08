package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;
import com.config.Keyword;



public class BestSellersPage extends HomePage {
	public BestSellersPage() {
		super();
		PageFactory.initElements(Constants.driver, this);
		System.out.println("PageFactory Constructor is called");
	}
	public void pageSetUp() {
		Keyword.openBrowser(com.utility.PropertyUtility.getProperty("Chrome"));
		Keyword.launchUrl(com.utility.PropertyUtility.getProperty("Homepage"));
		BestSellersPage bestsellers = new BestSellersPage();
		bestsellers.click_subtab_BestSellers(); 
		
	}
	@FindBy(xpath = "//li/div/a[contains(text(),'Bestsellers')]")
	private WebElement subtab_BestSellers;

	public void click_subtab_BestSellers() {
		getSubtab_BestSellers().click();
	}

	@FindBy(linkText = "//div/a[contains(text(),'Hot New Releases')]")
	private WebElement subtab_HotNewReleases;

	public void click_subtab_HotNewReleases() {
		getSubtab_HotNewReleases().click();
	}

	@FindBy(linkText = "//div/a[contains(text(),'Movers and Shakers')]")
	private WebElement subtab_MoversandShakers;

	public void click_subtab_MoversandShakers() {
		getSubtab_MoversandShakers().click();
	}

	@FindBy(linkText = "//div/a[contains(text(),'Most Wished For')]")
	private WebElement subtab_MostWishedFor;

	public void click_subtab_MostWishedFor() {
		getSubtab_MostWishedFor().click();
	}

	@FindBy(linkText = "//div/a[contains(text(),'Most Gifted')]")
	private WebElement subtab_MostGifted;

	public void click_subtab_MostGifted() {
		getSubtab_MostGifted().click();
	}

	@FindBy(linkText = "//a[contains(text(),'Amazon Launchpad')]")
	private WebElement subtab_item_AmazonLaunchPad;

	public void click_subtab_item_AmazonLaunchPad() {
		subtab_item_AmazonLaunchPad.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Apps for Android')]")
	private WebElement subtab_item_AppsforAndriod;

	public void click_subtab_item_AppsforAndriod() {
		subtab_item_AppsforAndriod.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Baby Products')]")
	private WebElement subtab_item_BabyProducts;

	public void click_subtab_item_BabyProducts() {
		subtab_item_BabyProducts.click();
	}

	public WebElement getSubtab_item_AmazonLaunchPad() {
		return subtab_item_AmazonLaunchPad;
	}

	public void setSubtab_item_AmazonLaunchPad(WebElement subtab_item_AmazonLaunchPad) {
		this.subtab_item_AmazonLaunchPad = subtab_item_AmazonLaunchPad;
	}

	public WebElement getSubtab_item_AppsforAndriod() {
		return subtab_item_AppsforAndriod;
	}

	public void setSubtab_item_AppsforAndriod(WebElement subtab_item_AppsforAndriod) {
		this.subtab_item_AppsforAndriod = subtab_item_AppsforAndriod;
	}

	public WebElement getSubtab_item_BabyProducts() {
		return subtab_item_BabyProducts;
	}

	public void setSubtab_item_BabyProducts(WebElement subtab_item_BabyProducts) {
		this.subtab_item_BabyProducts = subtab_item_BabyProducts;
	}

	public WebElement getSubtab_item_BagsWalletsLuggage() {
		return subtab_item_BagsWalletsLuggage;
	}

	public void setSubtab_item_BagsWalletsLuggage(WebElement subtab_item_BagsWalletsLuggage) {
		this.subtab_item_BagsWalletsLuggage = subtab_item_BagsWalletsLuggage;
	}

	public WebElement getSubtab_item_Beauty() {
		return subtab_item_Beauty;
	}

	public void setSubtab_item_Beauty(WebElement subtab_item_Beauty) {
		this.subtab_item_Beauty = subtab_item_Beauty;
	}

	public WebElement getSubtab_item_Books() {
		return subtab_item_Books;
	}

	public void setSubtab_item_Books(WebElement subtab_item_Books) {
		this.subtab_item_Books = subtab_item_Books;
	}

	public WebElement getSubtab_item_CarandMotorbike() {
		return subtab_item_CarandMotorbike;
	}

	public void setSubtab_item_CarandMotorbike(WebElement subtab_item_CarandMotorbike) {
		this.subtab_item_CarandMotorbike = subtab_item_CarandMotorbike;
	}

	public WebElement getSubtab_item_ClothingandAccessories() {
		return subtab_item_ClothingandAccessories;
	}

	public void setSubtab_item_ClothingandAccessories(WebElement subtab_item_ClothingandAccessories) {
		this.subtab_item_ClothingandAccessories = subtab_item_ClothingandAccessories;
	}

	public WebElement getSubtab_item_ComputersandAccessories() {
		return subtab_item_ComputersandAccessories;
	}

	public void setSubtab_item_ComputersandAccessories(WebElement subtab_item_ComputersandAccessories) {
		this.subtab_item_ComputersandAccessories = subtab_item_ComputersandAccessories;
	}

	public WebElement getSubtab_item_Electronics() {
		return subtab_item_Electronics;
	}

	public void setSubtab_item_Electronics(WebElement subtab_item_Electronics) {
		this.subtab_item_Electronics = subtab_item_Electronics;
	}

	public WebElement getSubtab_item_Garden_Outdoors() {
		return subtab_item_Garden_Outdoors;
	}

	public void setSubtab_item_Garden_Outdoors(WebElement subtab_item_Garden_Outdoors) {
		this.subtab_item_Garden_Outdoors = subtab_item_Garden_Outdoors;
	}

	public WebElement getSubtab_item_GiftCards() {
		return subtab_item_GiftCards;
	}

	public void setSubtab_item_GiftCards(WebElement subtab_item_GiftCards) {
		this.subtab_item_GiftCards = subtab_item_GiftCards;
	}

	public WebElement getSubtab_item_GroceryGourmetFoods() {
		return subtab_item_GroceryGourmetFoods;
	}

	public void setSubtab_item_GroceryGourmetFoods(WebElement subtab_item_GroceryGourmetFoods) {
		this.subtab_item_GroceryGourmetFoods = subtab_item_GroceryGourmetFoods;
	}

	public WebElement getSubtab_item_HealthandPersonalCare() {
		return subtab_item_HealthandPersonalCare;
	}

	public void setSubtab_item_HealthandPersonalCare(WebElement subtab_item_HealthandPersonalCare) {
		this.subtab_item_HealthandPersonalCare = subtab_item_HealthandPersonalCare;
	}

	public WebElement getSubtab_item_HomeandKithen() {
		return subtab_item_HomeandKithen;
	}

	public void setSubtab_item_HomeandKithen(WebElement subtab_item_HomeandKithen) {
		this.subtab_item_HomeandKithen = subtab_item_HomeandKithen;
	}

	public WebElement getSubtab_item_HomeImprovement() {
		return subtab_item_HomeImprovement;
	}

	public void setSubtab_item_HomeImprovement(WebElement subtab_item_HomeImprovement) {
		this.subtab_item_HomeImprovement = subtab_item_HomeImprovement;
	}

	public WebElement getSubtab_item_IndustrialandScientific() {
		return subtab_item_IndustrialandScientific;
	}

	public void setSubtab_item_IndustrialandScientific(WebElement subtab_item_IndustrialandScientific) {
		this.subtab_item_IndustrialandScientific = subtab_item_IndustrialandScientific;
	}

	public WebElement getSubtab_item_Jewellery() {
		return subtab_item_Jewellery;
	}

	public void setSubtab_item_Jewellery(WebElement subtab_item_Jewellery) {
		this.subtab_item_Jewellery = subtab_item_Jewellery;
	}

	public WebElement getSubtab_item_KindleStore() {
		return subtab_item_KindleStore;
	}

	public void setSubtab_item_KindleStore(WebElement subtab_item_KindleStore) {
		this.subtab_item_KindleStore = subtab_item_KindleStore;
	}

	public WebElement getSubtab_item_MoviesandTVShow() {
		return subtab_item_MoviesandTVShow;
	}

	public void setSubtab_item_MoviesandTVShow(WebElement subtab_item_MoviesandTVShow) {
		this.subtab_item_MoviesandTVShow = subtab_item_MoviesandTVShow;
	}

	public WebElement getSubtab_item_Music() {
		return subtab_item_Music;
	}

	public void setSubtab_item_Music(WebElement subtab_item_Music) {
		this.subtab_item_Music = subtab_item_Music;
	}

	public WebElement getSubtab_item_MusicalInstruments() {
		return subtab_item_MusicalInstruments;
	}

	public void setSubtab_item_MusicalInstruments(WebElement subtab_item_MusicalInstruments) {
		this.subtab_item_MusicalInstruments = subtab_item_MusicalInstruments;
	}

	public WebElement getSubtab_item_OfficeProducts() {
		return subtab_item_OfficeProducts;
	}

	public void setSubtab_item_OfficeProducts(WebElement subtab_item_OfficeProducts) {
		this.subtab_item_OfficeProducts = subtab_item_OfficeProducts;
	}

	public WebElement getSubtab_item_PetSupplies() {
		return subtab_item_PetSupplies;
	}

	public void setSubtab_item_PetSupplies(WebElement subtab_item_PetSupplies) {
		this.subtab_item_PetSupplies = subtab_item_PetSupplies;
	}

	public WebElement getSubtab_item_ShoesandHandbags() {
		return subtab_item_ShoesandHandbags;
	}

	public void setSubtab_item_ShoesandHandbags(WebElement subtab_item_ShoesandHandbags) {
		this.subtab_item_ShoesandHandbags = subtab_item_ShoesandHandbags;
	}

	public WebElement getSubtab_item_Software() {
		return subtab_item_Software;
	}

	public void setSubtab_item_Software(WebElement subtab_item_Software) {
		this.subtab_item_Software = subtab_item_Software;
	}

	public WebElement getSubtab_item_SportsFitnessOutdoors() {
		return subtab_item_SportsFitnessOutdoors;
	}

	public void setSubtab_item_SportsFitnessOutdoors(WebElement subtab_item_SportsFitnessOutdoors) {
		this.subtab_item_SportsFitnessOutdoors = subtab_item_SportsFitnessOutdoors;
	}

	public WebElement getSubtab_item_ToysandGames() {
		return subtab_item_ToysandGames;
	}

	public void setSubtab_item_ToysandGames(WebElement subtab_item_ToysandGames) {
		this.subtab_item_ToysandGames = subtab_item_ToysandGames;
	}

	public WebElement getSubtab_item_VideoGames() {
		return subtab_item_VideoGames;
	}

	public void setSubtab_item_VideoGames(WebElement subtab_item_VideoGames) {
		this.subtab_item_VideoGames = subtab_item_VideoGames;
	}

	public WebElement getSubtab_item_Watches() {
		return subtab_item_Watches;
	}

	public void setSubtab_item_Watches(WebElement subtab_item_Watches) {
		this.subtab_item_Watches = subtab_item_Watches;
	}

	public WebElement getSignin_button() {
		return signin_button;
	}

	public void setSignin_button(WebElement signin_button) {
		this.signin_button = signin_button;
	}

	@FindBy(linkText = "//a[contains(text(),'Bags, Wallets and Luggage')]")
	private WebElement subtab_item_BagsWalletsLuggage;

	public void click_subtab_item_BagsWalletsLuggage() {
		subtab_item_BagsWalletsLuggage.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Beauty')]")
	private WebElement subtab_item_Beauty;

	public void click_subtab_item_Beauty() {
		subtab_item_Beauty.click();
	}

	@FindBy(linkText = "//li/a[contains(text(),'Books')]")
	private WebElement subtab_item_Books;

	public void click_subtab_item_Books() {
		subtab_item_Books.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Car & Motorbike')]")
	private WebElement subtab_item_CarandMotorbike;

	public void click_subtab_item_CarandMotorbike() {
		subtab_item_CarandMotorbike.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Clothing & Accessories')]")
	private WebElement subtab_item_ClothingandAccessories;

	public void click_subtab_item_ClothingandAccessories() {
		subtab_item_ClothingandAccessories.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Computers & Accessories')]")
	private WebElement subtab_item_ComputersandAccessories;

	public void click_subtab_item_ComputersandAccessories() {
		subtab_item_ComputersandAccessories.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Electronics')]")
	private WebElement subtab_item_Electronics;

	public void click_subtab_item_Electronics() {
		subtab_item_Electronics.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Garden & Outdoors')]")
	private WebElement subtab_item_Garden_Outdoors;

	public void click_subtab_item_Garden_Outdoors() {
		subtab_item_Garden_Outdoors.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Gift Cards')]")
	private WebElement subtab_item_GiftCards;

	public void click_subtab_item_GiftCards() {
		subtab_item_GiftCards.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Grocery & Gourmet Foods')]")
	private WebElement subtab_item_GroceryGourmetFoods;

	public void click_subtab_item_GroceryGourmetFoods() {
		subtab_item_GroceryGourmetFoods.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Health & Personal Care')]")
	private WebElement subtab_item_HealthandPersonalCare;

	public void click_subtab_item_HealthandPersonalCare() {
		subtab_item_HealthandPersonalCare.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Home & Kitchen')]")
	private WebElement subtab_item_HomeandKithen;

	public void click_subtab_item_HomeandKithen() {
		subtab_item_HomeandKithen.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Home Improvement')]")
	private WebElement subtab_item_HomeImprovement;

	public void click_subtab_item_HomeImprovement() {
		subtab_item_HomeImprovement.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Industrial & Scientific')]")
	private WebElement subtab_item_IndustrialandScientific;

	public void click_subtab_item_IndustrialandScientific() {
		subtab_item_IndustrialandScientific.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Jewellery')]")
	private WebElement subtab_item_Jewellery;

	public void click_subtab_item_Jewellery() {
		subtab_item_Jewellery.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Kindle Store')]")
	private WebElement subtab_item_KindleStore;

	public void click_subtab_item_KindleStore() {
		subtab_item_KindleStore.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Movies & TV Shows')]")
	private WebElement subtab_item_MoviesandTVShow;

	public void click_subtab_item_MoviesandTVShow() {
		subtab_item_MoviesandTVShow.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Musical Instruments')]//preceding::a[contains(text(),'Music')]")
	private WebElement subtab_item_Music;

	public void click_subtab_item_Music() {
		subtab_item_Music.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Musical Instruments')]")
	private WebElement subtab_item_MusicalInstruments;

	public void click_subtab_item_MusicalInstruments() {
		subtab_item_MusicalInstruments.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Office Products')]")
	private WebElement subtab_item_OfficeProducts;

	public void click_subtab_item_OfficeProducts() {
		subtab_item_OfficeProducts.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Pet Supplies')]")
	private WebElement subtab_item_PetSupplies;

	public void click_subtab_item_PetSupplies() {
		subtab_item_PetSupplies.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Shoes & Handbags')]")
	private WebElement subtab_item_ShoesandHandbags;

	public void click_subtab_item_ShoesandHandbags() {
		subtab_item_ShoesandHandbags.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Software')]")
	private WebElement subtab_item_Software;

	public void click_subtab_item_Software() {
		subtab_item_Software.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Sports, Fitness & Outdoors')]")
	private WebElement subtab_item_SportsFitnessOutdoors;

	public void click_subtab_item_SportsFitnessOutdoors() {
		subtab_item_SportsFitnessOutdoors.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Toys & Games')]")
	private WebElement subtab_item_ToysandGames;

	public void click_subtab_item_ToysandGames() {
		subtab_item_ToysandGames.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Video Games')]")
	private WebElement subtab_item_VideoGames;

	public void click_subtab_item_VideoGames() {
		subtab_item_VideoGames.click();
	}

	@FindBy(linkText = "//a[contains(text(),'Watches')]")
	private WebElement subtab_item_Watches;
	
	public void click_subtab_item_Watches() {
		subtab_item_Watches.click();
	}

	@FindBy(xpath = "//span[@class='action-inner']")
	private WebElement signin_button;

	public void click_signinbutton() {
		signin_button.click();
	}

	public void setsigninbutton(WebElement signin_button) {
		this.signin_button = signin_button;
	}

	public WebElement getsigninbutton() {
		return signin_button;
	}

	public WebElement getSubtab_BestSellers() {
		return subtab_BestSellers;
	}

	public void setSubtab_BestSellers(WebElement subtab_BestSellers) {
		this.subtab_BestSellers = subtab_BestSellers;
	}

	public WebElement getSubtab_HotNewReleases() {
		return subtab_HotNewReleases;
	}

	public void setSubtab_HotNewReleases(WebElement subtab_HotNewReleases) {
		this.subtab_HotNewReleases = subtab_HotNewReleases;
	}

	public WebElement getSubtab_MostGifted() {
		return subtab_MostGifted;
	}

	public void setSubtab_MostGifted(WebElement subtab_MostGifted) {
		this.subtab_MostGifted = subtab_MostGifted;
	}

	public WebElement getSubtab_MostWishedFor() {
		return subtab_MostWishedFor;
	}

	public void setSubtab_MostWishedFor(WebElement subtab_MostWishedFor) {
		this.subtab_MostWishedFor = subtab_MostWishedFor;
	}

	public WebElement getSubtab_MoversandShakers() {
		return subtab_MoversandShakers;
	}

	public void setSubtab_MoversandShakers(WebElement subtab_MoversandShakers) {
		this.subtab_MoversandShakers = subtab_MoversandShakers;
	}
}


