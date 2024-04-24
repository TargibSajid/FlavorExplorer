package bin.frames;
import bin.classes.*;





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

 public class HomePageFrame extends Customer implements IHomeFrameActions
{
	

	public final double bhapaPithaPrice =40;
	public final double bhunaKhichuriPrice = 90;
	public final double shorsheIlishPrice = 120;
	public final double kacchiBiriyaniPrice = 180;
	public final double bhortaPrice = 30;
	public final double chuiJhalPrice = 60;
	public final double grilledChickenPrice = 320;
	public final double payeshPrice =50;
	public final double pizzaPrice = 100;
	public final double sandWichPrice = 200;
	public final double gaengHungLayPrice = 300;
	public final double gaengKeowWanGaiPrice = 250;
	public final double kaengLueangPrice = 200;
	public final double padKraPaoMooPrice =  100;
	public final double padThaiPrice = 100;
	public final double tomYumGoongPrice = 1000;
	public final double saiOuaPrice = 430;
	public final double khaoSoiGaiPrice = 200;
	public final double mooYorChiangMaiPrice  = 150;
	public final double chowMeinPrice = 60;
	public final double kungPaoChickenPrice = 320;
	public final double mapoTofuPrice = 200;
	public final double pekingRoastDuckPrice = 200;
	public final double sourPorkPrice = 150;
	public final double chickenTeriyakiPrice = 550;
	public final double crabRangoonPrice = 200;
	public final double sesameChickenPrice = 400;
	public final double sugarDoughnutPrice = 100;



	public int bhapaPithaCount,bhunaKhichuriCount,shorsheIlishCount,kaccchiBiriyaniCount,bhortaCount,chuiJhalCount,grilledChikenCount,payeshCount,pizzaCount,sandWichCount,gaengKeowWanGaiCount,kaengLueangCount,padKraPaoMooCount,padThaiCount,tomYumGoongCount,saiOuaCount,gaengHungLayCount,khaoSoiGaiCount,mooYorChiangMaiCount,chowMeinCount,kungPaoChickenCount,mapoTofuCount,pekingRoastDuckCount,sourPorkCount,chickenTeriyakiCount,crabRangoonCount,sesameChickenCount,sugarDoughnutCount;
	public double totalCost;
	public int totalIteamCount;

	JPanel hometab,exploretab,favouritestab,orderstab,profiletab,cTraditionaltab,cnTraditionaltab,pTraditionaltab,pnTraditionaltab,afTraditionaltab,afnTraditionaltab,tTraditionaltab,tnTraditionaltab,bTraditionaltab,bnTraditionaltab,iTraditionaltab,inTraditionaltab,mTraditionaltab,mnTraditionaltab,bangladeshitab,indiantab,mexicantab,americantab,thailandtab,afghanistantab,pakistantab,chinatab;
	JFrame frame;

	Font font;
	JTextField searchInput;
	


	public HomePageFrame(String username , String password , String email){

		super(username,password,email);
		frame = new JFrame("Flavour&Explore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);

        JPanel mainPanel = new JPanel(new BorderLayout());

    

        // Add your stylized logo image to the headerPanel
      
		

       

        // Navigation Tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setSize(1100,825);
       	tabbedPane.addTab("Home", hometab =  new JPanel());
       	hometab.setLayout(null);
       	// Search Bar in home tab

       	JLabel searchLabel = new JLabel("Find Your Recipes & Tutorials");
       	searchLabel.setBounds(700,10,2000,10);
       	searchLabel.setForeground(Color.WHITE);




       	hometab.add(searchLabel);
		
		searchInput = new JTextField();
		searchInput.setBounds(500,70,80,30);
		searchInput.setSize(500,30);

		JButton searchButton = new JButton("Search");
		searchButton.setBounds(1000,70,80,30);
		searchButton.setSize(100,30);
		searchButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				search();
			}
		});


		hometab.add(searchInput);
		hometab.add(searchButton);


		JLabel resturantLabel = new JLabel("Resturant reservation");
		resturantLabel.setBounds(600,600,600,30);
		font=resturantLabel.getFont().deriveFont(25f);
		resturantLabel.setFont(font);
		resturantLabel.setForeground(Color.WHITE);


		hometab.add(resturantLabel);


		JButton clickHere = new JButton("Click here");
		clickHere.setBounds(900,600,600,30);
		clickHere.setSize(100,30);
		clickHere.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				switchToRestaurantBookingFrame();
			}
		});
		hometab.add(clickHere);


		ImageIcon homeBackground = new ImageIcon("background.jpg");
		JLabel homeBackgroundLabel = new JLabel(homeBackground);
		homeBackgroundLabel.setBounds(0,0,1920,1080);
		hometab.add(homeBackgroundLabel); 









        tabbedPane.addTab("Explore", exploretab = new JPanel());
        exploretab.setLayout(new BorderLayout());


       	
       	JTabbedPane explorePane = new JTabbedPane();
        explorePane.setSize(110,82);
       	
       	explorePane.addTab("Bangladeshi", bangladeshitab =  new JPanel());
       	bangladeshitab.setLayout(new BorderLayout());//
       	
       	JTabbedPane bangladeshiPane = new JTabbedPane();
       	bangladeshiPane.setSize(110,82);
       	bangladeshiPane.addTab("Traditional",bTraditionaltab = new JPanel());
       	bTraditionaltab.setLayout(null);


       	




       	//bangladdeshi traditional foods

       	//bhapa pitha

       	JLabel bhapapitha = new JLabel("Bhapa pitha");
		bhapapitha.setBounds(90,-220,5,3);
		bhapapitha.setSize(1100,825);

		bTraditionaltab.add(bhapapitha);

		ImageIcon bhapapithaImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Bangladesh\\bhapapitha.jpg");
		JLabel bhapapithaImgLabel = new JLabel(bhapapithaImg);
		bhapapithaImgLabel.setBounds(20,20,100,100);
		bhapapithaImgLabel.setSize(200,200);

		
		JLabel bhapapithaPriceLabel = new JLabel("Price : BDT 40 ");
		bhapapithaPriceLabel.setBounds(90,-200,5,3);
		bhapapithaPriceLabel.setSize(1100,825);

		bTraditionaltab.add(bhapapithaPriceLabel);





		bTraditionaltab.add(bhapapithaImgLabel);

		JButton bhapapithabtn = new JButton("Add to Cart");
		bhapapithabtn.setBounds(40,220,100,30);
		bhapapithabtn.setSize(150,30);
		bhapapithabtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				bhapaPithaCount++;
				totalIteamCount++;
				
			}
		});
		bTraditionaltab.add(bhapapithabtn);


		//bhuna khichuri

		JLabel bhunaKhichuri = new JLabel("Bhuna Khichuri");
		bhunaKhichuri.setBounds(490,-220,5,3);
		bhunaKhichuri.setSize(1100,825);

		bTraditionaltab.add(bhunaKhichuri);

		
		ImageIcon bhunaKhichuriImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Bangladesh\\Bhuna.jpg");
		JLabel bhunaKhichuriImgLabel = new JLabel(bhunaKhichuriImg);
		bhunaKhichuriImgLabel.setBounds(430,20,100,100);
		bhunaKhichuriImgLabel.setSize(200,200);

		
		bTraditionaltab.add(bhunaKhichuriImgLabel);


		JLabel bhunaKhichuriPriceLabel = new JLabel("Price : BDT 90 ");
		bhunaKhichuriPriceLabel.setBounds(490,-200,5,3);
		bhunaKhichuriPriceLabel.setSize(1100,825);

		bTraditionaltab.add(bhunaKhichuriPriceLabel);

		JButton bhunaKhichuribtn = new JButton("Add to Cart");
		bhunaKhichuribtn.setBounds(440,220,100,30);
		bhunaKhichuribtn.setSize(150,30);
		bhunaKhichuribtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			
				bhunaKhichuriCount++;
				totalIteamCount++;
				
			}
		});
		bTraditionaltab.add(bhunaKhichuribtn);


		//sorse illish

		JLabel shorsheilish = new JLabel("Shorshe Ilish");
		shorsheilish.setBounds(890,-220,5,3);
		shorsheilish.setSize(1100,825);

		bTraditionaltab.add(shorsheilish);

		ImageIcon shorsheilishImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Bangladesh\\sorisaelish.jpg");
		JLabel shorsheilishImgLabel = new JLabel(shorsheilishImg);
		shorsheilishImgLabel.setBounds(830,20,100,100);
		shorsheilishImgLabel.setSize(200,200);
		bTraditionaltab.add(shorsheilishImgLabel);


		JLabel shorsheilishPriceLabel = new JLabel("Price : BDT 120 ");
		shorsheilishPriceLabel.setBounds(890,-200,5,3);
		shorsheilishPriceLabel.setSize(1100,825);

		bTraditionaltab.add(shorsheilishPriceLabel);


		JButton sorseilishbtn = new JButton("Add to Cart");
		sorseilishbtn.setBounds(840,220,100,30);
		sorseilishbtn.setSize(150,30);
		sorseilishbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				shorsheIlishCount++;
				totalIteamCount++;
			}
		});
		bTraditionaltab.add(sorseilishbtn);


		//kacchi Biriyani
		JLabel kacchiBiriyani = new JLabel("Kacchi Biriyani");
		kacchiBiriyani.setBounds(1190,-220,5,3);
		kacchiBiriyani.setSize(1100,825);

		bTraditionaltab.add(kacchiBiriyani);

		ImageIcon kacchiBiriyaniImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Bangladesh\\kacchi.jpg");
		JLabel kacchiBiriyaniImgLabel = new JLabel(kacchiBiriyaniImg);
		kacchiBiriyaniImgLabel.setBounds(1120,20,100,100);
		kacchiBiriyaniImgLabel.setSize(200,200);
		bTraditionaltab.add(kacchiBiriyaniImgLabel);



		JLabel kacchiBiriyaniPriceLabel = new JLabel("Price : BDT 180 ");
		kacchiBiriyaniPriceLabel.setBounds(1190,-200,5,3);
		kacchiBiriyaniPriceLabel.setSize(1100,825);

		bTraditionaltab.add(kacchiBiriyaniPriceLabel);

		JButton kacchibiriyanibtn = new JButton("Add to Cart");
		kacchibiriyanibtn.setBounds(1240,220,100,30);
		kacchibiriyanibtn.setSize(150,30);
		kacchibiriyanibtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				kaccchiBiriyaniCount++;
				totalIteamCount++;
			}
		});
		bTraditionaltab.add(kacchibiriyanibtn);


		//bhorta vaat

		JLabel bhortavaat = new JLabel("Bhorta&Rice");
		bhortavaat.setBounds(85,-20,5,3);
		bhortavaat.setSize(1100,825);

		bTraditionaltab.add(bhortavaat);

		ImageIcon bhortavaatImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Bangladesh\\fishvorta.jpg");
		JLabel bhortavaatImgLabel = new JLabel(bhortavaatImg);
		bhortavaatImgLabel.setBounds(20,220,100,100);
		bhortavaatImgLabel.setSize(200,200);
		bTraditionaltab.add(bhortavaatImgLabel);


		JLabel bhortavaatPriceLabel = new JLabel("Price : BDT 30 ");
		bhortavaatPriceLabel.setBounds(85,0,5,3);
		bhortavaatPriceLabel.setSize(1100,825);

		bTraditionaltab.add(bhortavaatPriceLabel);



		JButton bhortavaatbtn = new JButton("Add to Cart");
		bhortavaatbtn.setBounds(40,420,100,30);
		bhortavaatbtn.setSize(150,30);
		bhortavaatbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				bhortaCount++;
				totalIteamCount++;
			}
		});
		bTraditionaltab.add(bhortavaatbtn);










       	bangladeshiPane.addTab("NON-Traditional",bnTraditionaltab = new JPanel());
       	bnTraditionaltab.setLayout(null);


       	//bangladeshi non traditional 

       	//chui jhal

       	JLabel chuijhal= new JLabel("Chui Jhal");
		chuijhal.setBounds(90,-220,5,3);
		chuijhal.setSize(1100,825);

		bnTraditionaltab.add(chuijhal);

		ImageIcon chuijhaImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Bangladesh\\chui jhal.jpg");
		JLabel chuijhaImgLabel = new JLabel(chuijhaImg);
		chuijhaImgLabel.setBounds(20,20,100,100);
		chuijhaImgLabel.setSize(200,200);

		bnTraditionaltab.add(chuijhaImgLabel);

		JLabel chuijhalPriceLabel = new JLabel("Price : BDT 60");
		chuijhalPriceLabel.setBounds(90,-200,5,3);
		chuijhalPriceLabel.setSize(1100,825);

		bnTraditionaltab.add(chuijhalPriceLabel);

		JButton chuijhalbtn = new JButton("Add to Cart");
		chuijhalbtn.setBounds(40,220,100,30);
		chuijhalbtn.setSize(150,30);
		chuijhalbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				chuiJhalCount++;
				totalIteamCount++;
				
			}
		});
		bnTraditionaltab.add(chuijhalbtn);

		//grilled-chicken

		JLabel grilledchicken = new JLabel("Grilled-Chicken");
		grilledchicken.setBounds(490,-220,5,3);
		grilledchicken.setSize(1100,825);

		bnTraditionaltab.add(grilledchicken);


		ImageIcon grilledchickenImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Bangladesh\\grilled-chicken.jpg");
		JLabel grilledchickenImgLabel = new JLabel(grilledchickenImg);
		grilledchickenImgLabel.setBounds(430,20,100,100);
		grilledchickenImgLabel.setSize(200,200);

		bnTraditionaltab.add(grilledchickenImgLabel);

		JLabel grilledchickenPriceLabel = new JLabel("Price : BDT 320");
		grilledchickenPriceLabel.setBounds(490,-200,5,3);
		grilledchickenPriceLabel.setSize(1100,825);

		bnTraditionaltab.add(grilledchickenPriceLabel);

		JButton grilledchickenbtn = new JButton("Add to Cart");
		grilledchickenbtn.setBounds(440,220,100,30);
		grilledchickenbtn.setSize(150,30);
		grilledchickenbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				grilledChikenCount++;
				totalIteamCount++;
			}
		});
		bnTraditionaltab.add(grilledchickenbtn);


		//Payesh

		JLabel payesh = new JLabel("Payesh");
		payesh.setBounds(890,-220,5,3);
		payesh.setSize(1100,825);

		bnTraditionaltab.add(payesh);

		ImageIcon payeshImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Bangladesh\\payesh.jpg");
		JLabel payeshImgLabel = new JLabel(payeshImg);
		payeshImgLabel.setBounds(810,20,100,100);
		payeshImgLabel.setSize(200,200);


		bnTraditionaltab.add(payeshImgLabel);

		JLabel payeshPriceLabel = new JLabel("Price : BDT 50 ");
		payeshPriceLabel.setBounds(890,-200,5,3);
		payeshPriceLabel.setSize(1100,825);

		bnTraditionaltab.add(payeshPriceLabel);

		JButton payeshbtn = new JButton("Add to Cart");
		payeshbtn.setBounds(840,220,100,30);
		payeshbtn.setSize(150,30);
		payeshbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				payeshCount++;
				totalIteamCount++;
			}
		});
		bnTraditionaltab.add(payeshbtn);





		//pizza
		JLabel pizza = new JLabel("Pizza");
		pizza.setBounds(1190,-220,5,3);
		pizza.setSize(1100,825);

		bnTraditionaltab.add(pizza);


		ImageIcon pizzaImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Bangladesh\\pizza.jpg");
		JLabel pizzaImgLabel = new JLabel(pizzaImg);
		pizzaImgLabel.setBounds(1110,20,100,100);
		pizzaImgLabel.setSize(200,200);


		bnTraditionaltab.add(pizzaImgLabel);


		JLabel pizzaPriceLabel = new JLabel("Price : BDT 100 ");
		pizzaPriceLabel.setBounds(1190,-200,5,3);
		pizzaPriceLabel.setSize(1100,825);

		bnTraditionaltab.add(pizzaPriceLabel);

		JButton pizzabtn = new JButton("Add to Cart");
		pizzabtn.setBounds(1240,220,100,30);
		pizzabtn.setSize(150,30);
		pizzabtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				pizzaCount++;
				totalIteamCount++;
				
			}
		});
		bnTraditionaltab.add(pizzabtn);


		//SandWich

		JLabel sandWich = new JLabel("SandWich");
		sandWich.setBounds(85,-20,5,3);
		sandWich.setSize(1100,825);

		bnTraditionaltab.add(sandWich);

		ImageIcon sandWichImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Bangladesh\\sandwhich.jpg");
		JLabel sandWichImgLabel = new JLabel(sandWichImg);
		sandWichImgLabel.setBounds(20,220,100,100);
		sandWichImgLabel.setSize(200,200);


		bnTraditionaltab.add(sandWichImgLabel);

		JLabel sandWichPriceLabel = new JLabel("Price : BDT 200 ");
		sandWichPriceLabel.setBounds(85,0,5,3);
		sandWichPriceLabel.setSize(1100,825);

		bnTraditionaltab.add(sandWichPriceLabel);


		JButton sandWichbtn = new JButton("Add to Cart");
		sandWichbtn.setBounds(40,420,100,30);
		sandWichbtn.setSize(150,30);
		sandWichbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				sandWichCount++;
				totalIteamCount++;
			}
		});
		bnTraditionaltab.add(sandWichbtn);





       	bangladeshitab.add(bangladeshiPane,BorderLayout.CENTER);



        







       





        

        explorePane.addTab("Thailand",thailandtab =  new JPanel());
        thailandtab.setLayout(new BorderLayout());//


        JTabbedPane thailandPane = new JTabbedPane();
       	thailandPane.setSize(110,82);
       	thailandPane.addTab("Traditional",tTraditionaltab = new JPanel());
       	tTraditionaltab.setLayout(null);





       	//thai traditional

       	//Gaeng Keow Wan Gai 

       	JLabel gaengKeowWanGai = new JLabel("Gaeng Keow Wan Gai");
		gaengKeowWanGai.setBounds(90,-220,5,3);
		gaengKeowWanGai.setSize(1100,825);

		tTraditionaltab.add(gaengKeowWanGai);

		ImageIcon gaengKeowWanGaiImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Thailand\\Gaeng Keow Wan Gai.jpg");
		JLabel gaengKeowWanGaiImgLabel = new JLabel(gaengKeowWanGaiImg);
		gaengKeowWanGaiImgLabel.setBounds(20,20,100,100);
		gaengKeowWanGaiImgLabel.setSize(200,200);
		tTraditionaltab.add(gaengKeowWanGaiImgLabel);

		JLabel gaengKeowWanGailPriceLabel = new JLabel("Price : BDT 250 ");
		gaengKeowWanGailPriceLabel.setBounds(90,-200,5,3);
		gaengKeowWanGailPriceLabel.setSize(1100,825);

		tTraditionaltab.add(gaengKeowWanGailPriceLabel);


		JButton gaengKeowWanGaibtn = new JButton("Add to Cart");
		gaengKeowWanGaibtn.setBounds(40,220,100,30);
		gaengKeowWanGaibtn.setSize(150,30);
		gaengKeowWanGaibtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				gaengKeowWanGaiCount++;
				totalIteamCount++;
				
			}
		});
		tTraditionaltab.add(gaengKeowWanGaibtn);


		//Kaeng Lueang

		JLabel kaengLueang = new JLabel("Kaeng Lueang");
		kaengLueang.setBounds(490,-220,5,3);
		kaengLueang.setSize(1100,825);

		tTraditionaltab.add(kaengLueang);

		ImageIcon kaengLueangImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Thailand\\Kaeng Lueang.jpg");
		JLabel kaengLueangImgLabel = new JLabel(kaengLueangImg);
		kaengLueangImgLabel.setBounds(430,20,100,100);
		kaengLueangImgLabel.setSize(200,200);
		tTraditionaltab.add(kaengLueangImgLabel);

		JLabel kaengLueangPriceLabel = new JLabel("Price : BDT 200 ");
		kaengLueangPriceLabel.setBounds(490,-200,5,3);
		kaengLueangPriceLabel.setSize(1100,825);

		tTraditionaltab.add(kaengLueangPriceLabel);


		JButton kaengLueangbtn = new JButton("Add to Cart");
		kaengLueangbtn.setBounds(440,220,100,30);
		kaengLueangbtn.setSize(150,30);
		kaengLueangbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				kaengLueangCount++;
				totalIteamCount++;
			}
		});
		tTraditionaltab.add(kaengLueangbtn);



		//Pad Kra Pao Moo

		JLabel padKraPaoMoo = new JLabel("Pad Kra Pao Moo");
		padKraPaoMoo.setBounds(890,-220,5,3);
		padKraPaoMoo.setSize(1100,825);

		tTraditionaltab.add(padKraPaoMoo);


		ImageIcon padKraPaoMooImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Thailand\\Pad Kra Pao Moo.jpg");
		JLabel padKraPaoMooImgLabel = new JLabel(padKraPaoMooImg);
		padKraPaoMooImgLabel.setBounds(840,20,100,100);
		padKraPaoMooImgLabel.setSize(200,200);
		tTraditionaltab.add(padKraPaoMooImgLabel);


		JLabel padKraPaoMooPriceLabel = new JLabel("Price : BDT 100");
		padKraPaoMooPriceLabel.setBounds(890,-200,5,3);
		padKraPaoMooPriceLabel.setSize(1100,825);

		tTraditionaltab.add(padKraPaoMooPriceLabel);


		JButton padKraPaoMoobtn = new JButton("Add to Cart");
		padKraPaoMoobtn.setBounds(840,220,100,30);
		padKraPaoMoobtn.setSize(150,30);
		padKraPaoMoobtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				padKraPaoMooCount++;
				totalIteamCount++;
			}
		});
		tTraditionaltab.add(padKraPaoMoobtn);



		//Pad Thai
		JLabel padThai = new JLabel("Pad Thai");
		padThai.setBounds(1190,-220,5,3);
		padThai.setSize(1100,825);

		tTraditionaltab.add(padThai);

		ImageIcon padThaiImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Thailand\\Pad Thai.jpg");
		JLabel padThaiImgLabel = new JLabel(padThaiImg);
		padThaiImgLabel.setBounds(1120,20,100,100);
		padThaiImgLabel.setSize(200,200);
		tTraditionaltab.add(padThaiImgLabel);

		JLabel padThaiPriceLabel = new JLabel("Price : BDT 100 ");
		padThaiPriceLabel.setBounds(1190,-200,5,3);
		padThaiPriceLabel.setSize(1100,825);

		tTraditionaltab.add(padThaiPriceLabel);

		JButton padThaibtn = new JButton("Add to Cart");
		padThaibtn.setBounds(1240,220,100,30);
		padThaibtn.setSize(150,30);
		padThaibtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				padThaiCount++;
				totalIteamCount++;
				
			}
		});
		tTraditionaltab.add(padThaibtn);


		//Tom Yum Goong

		JLabel tomYumGoong = new JLabel("Tom Yum Goong");
		tomYumGoong.setBounds(85,-20,5,3);
		tomYumGoong.setSize(1100,825);

		tTraditionaltab.add(tomYumGoong);

		ImageIcon tomYumGoongImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Thailand\\Tom Yum Goong.jpg");
		JLabel tomYumGoongImgLabel = new JLabel(tomYumGoongImg);
		tomYumGoongImgLabel.setBounds(20,220,100,100);
		tomYumGoongImgLabel.setSize(200,200);
		tTraditionaltab.add(tomYumGoongImgLabel);

		JLabel tomYumGoongPriceLabel = new JLabel("Price : BDT 1000 ");
		tomYumGoongPriceLabel.setBounds(85,0,5,3);
		tomYumGoongPriceLabel.setSize(1100,825);

		tTraditionaltab.add(tomYumGoongPriceLabel);

		JButton tomYumGoongbtn = new JButton("Add to Cart");
		tomYumGoongbtn.setBounds(40,420,100,30);
		tomYumGoongbtn.setSize(150,30);
		tomYumGoongbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				tomYumGoongCount++;
				totalIteamCount++;
				
			}
		});
		tTraditionaltab.add(tomYumGoongbtn);

       	 	



       	thailandPane.addTab("NON-Traditional",tnTraditionaltab = new JPanel());
       	tnTraditionaltab.setLayout(null);



       	//thai non traditional
       	//Gaeng Hung Lay

		JLabel gaengHungLay = new JLabel("Gaeng Hung Lay");
		gaengHungLay.setBounds(490,-220,5,3);
		gaengHungLay.setSize(1100,825);

		tnTraditionaltab.add(gaengHungLay);

		ImageIcon gaengHungLayImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Thailand\\Gaeng Hung Lay.jpg");
		JLabel gaengHungLayImgLabel = new JLabel(gaengHungLayImg);
		gaengHungLayImgLabel.setBounds(20,20,100,100);
		gaengHungLayImgLabel.setSize(200,200);
		tnTraditionaltab.add(gaengHungLayImgLabel);


		JLabel gaengHungLayPriceLabel = new JLabel("Price : BDT 200 ");
		gaengHungLayPriceLabel.setBounds(490,-200,5,3);
		gaengHungLayPriceLabel.setSize(1100,825);

		tnTraditionaltab.add(gaengHungLayPriceLabel);


		JButton gaengHungLaybtn = new JButton("Add to Cart");
		gaengHungLaybtn.setBounds(40,220,100,30);
		gaengHungLaybtn.setSize(150,30);
		gaengHungLaybtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				gaengHungLayCount++;
				totalIteamCount++;
			}
		});
		tnTraditionaltab.add(gaengHungLaybtn);


		//Khao Soi Gai

		JLabel khaoSoiGai = new JLabel("Khao Soi Gai");
		khaoSoiGai.setBounds(890,-220,5,3);
		khaoSoiGai.setSize(1100,825);

		tnTraditionaltab.add(khaoSoiGai);

		ImageIcon khaoSoiGaiImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Thailand\\Khao Soi Gai.jpg");
		JLabel khaoSoiGaiImgLabel = new JLabel(khaoSoiGaiImg);
		khaoSoiGaiImgLabel.setBounds(430,20,100,100);
		khaoSoiGaiImgLabel.setSize(200,200);
		tnTraditionaltab.add(khaoSoiGaiImgLabel);

		JLabel khaoSoiGaiPriceLabel = new JLabel("Price : BDT 150");
		khaoSoiGaiPriceLabel.setBounds(890,-200,5,3);
		khaoSoiGaiPriceLabel.setSize(1100,825);

		tnTraditionaltab.add(khaoSoiGaiPriceLabel);

		JButton khaoSoiGaibtn = new JButton("Add to Cart");
		khaoSoiGaibtn.setBounds(440,220,100,30);
		khaoSoiGaibtn.setSize(150,30);
		khaoSoiGaibtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				khaoSoiGaiCount++;
				totalIteamCount++;
				
			}
		});
		tnTraditionaltab.add(khaoSoiGaibtn);




		//Moo Yor Chiang Mai
		JLabel mooYorChiangMai = new JLabel("Moo Yor Chiang Mai");
		mooYorChiangMai.setBounds(1190,-220,5,3);
		mooYorChiangMai.setSize(1100,825);

		tnTraditionaltab.add(mooYorChiangMai);

		ImageIcon mooYorChiangMaiImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Thailand\\Moo Yor Chiang Mai.jpg");
		JLabel mooYorChiangMaiImgLabel = new JLabel(mooYorChiangMaiImg);
		mooYorChiangMaiImgLabel.setBounds(840,20,100,100);
		mooYorChiangMaiImgLabel.setSize(200,200);
		tnTraditionaltab.add(mooYorChiangMaiImgLabel);


		JLabel mooYorChiangMaiPriceLabel = new JLabel("Price : BDT 430 ");
		mooYorChiangMaiPriceLabel.setBounds(1190,-200,5,3);
		mooYorChiangMaiPriceLabel.setSize(1100,825);

		tnTraditionaltab.add(mooYorChiangMaiPriceLabel);


		JButton mooYorChiangMaibtn = new JButton("Add to Cart");
		mooYorChiangMaibtn.setBounds(840,220,100,30);
		mooYorChiangMaibtn.setSize(150,30);
		mooYorChiangMaibtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				mooYorChiangMaiCount++;
				totalIteamCount++;
			}
		});
		tnTraditionaltab.add(mooYorChiangMaibtn);


		//Sai Oua

		JLabel saiOua = new JLabel("Sai Oua");
		saiOua.setBounds(90,-220,5,3);
		saiOua.setSize(1100,825);

		tnTraditionaltab.add(saiOua);

		ImageIcon saiOuaImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Thailand\\Sai Oua.jpg");
		JLabel saiOuaImgLabel = new JLabel(saiOuaImg);
		saiOuaImgLabel.setBounds(1120,20,100,100);
		saiOuaImgLabel.setSize(200,200);
		tnTraditionaltab.add(saiOuaImgLabel);


		JLabel saiOuaPriceLabel = new JLabel("Price : BDT 300 ");
		saiOuaPriceLabel.setBounds(90,-200,5,3);
		saiOuaPriceLabel.setSize(1100,825);

		tnTraditionaltab.add(saiOuaPriceLabel);


		JButton saiOuabtn = new JButton("Add to Cart");
		saiOuabtn.setBounds(1240,220,100,30);
		saiOuabtn.setSize(150,30);
		saiOuabtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				saiOuaCount++;
				totalIteamCount++;
			}
		});
		tnTraditionaltab.add(saiOuabtn);

       	 	






       	thailandtab.add(thailandPane,BorderLayout.CENTER);


        

        


        





        explorePane.addTab("China",chinatab =  new JPanel());
        chinatab.setLayout(new BorderLayout());//


        JTabbedPane chinaPane = new JTabbedPane();
       	chinaPane.setSize(110,82);
       	chinaPane.addTab("Traditional",cTraditionaltab = new JPanel());
       	cTraditionaltab.setLayout(null);



       	// china traditional 
       	//Chow Mein
       	JLabel chowMein = new JLabel("Chow Mein");
		chowMein.setBounds(90,-220,5,3);
		chowMein.setSize(1100,825);

		cTraditionaltab.add(chowMein);


		ImageIcon chowMeinImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Chaina\\Chow Mein.jpg");
		JLabel chowMeinImgLabel = new JLabel(chowMeinImg);
		chowMeinImgLabel.setBounds(20,20,100,100);
		chowMeinImgLabel.setSize(200,200);
		cTraditionaltab.add(chowMeinImgLabel);


		JLabel chowMeinPriceLabel = new JLabel("Price : BDT 60 ");
		chowMeinPriceLabel.setBounds(90,-200,5,3);
		chowMeinPriceLabel.setSize(1100,825);

		cTraditionaltab.add(chowMeinPriceLabel);

		JButton chowMeinbtn = new JButton("Add to Cart");
		chowMeinbtn.setBounds(40,220,100,30);
		chowMeinbtn.setSize(150,30);
		chowMeinbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				chowMeinCount++;
				totalIteamCount++;
			}
		});
		cTraditionaltab.add(chowMeinbtn);

		//Kung-Pao-Chicken

		JLabel kungPaoChicken = new JLabel("Kung-Pao-Chicken");
		kungPaoChicken.setBounds(490,-220,5,3);
		kungPaoChicken.setSize(1100,825);

		cTraditionaltab.add(kungPaoChicken);

		ImageIcon kungPaoChickenImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Chaina\\Mapo Tofu.jpg");
		JLabel kungPaoChickenImgLabel = new JLabel(kungPaoChickenImg);
		kungPaoChickenImgLabel.setBounds(430,20,100,100);
		kungPaoChickenImgLabel.setSize(200,200);
		cTraditionaltab.add(kungPaoChickenImgLabel);


		JLabel kungPaoChickenPriceLabel = new JLabel("Price : BDT 320 ");
		kungPaoChickenPriceLabel.setBounds(490,-200,5,3);
		kungPaoChickenPriceLabel.setSize(1100,825);

		cTraditionaltab.add(kungPaoChickenPriceLabel);


		JButton kungPaoChickenbtn = new JButton("Add to Cart");
		kungPaoChickenbtn.setBounds(440,220,100,30);
		kungPaoChickenbtn.setSize(150,30);
		kungPaoChickenbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				kungPaoChickenCount++;
				totalIteamCount++;
			}
		});
		cTraditionaltab.add(kungPaoChickenbtn);


		//Mapo Tofu

		JLabel mapoTofu = new JLabel("Mapo Tofu");
		mapoTofu.setBounds(890,-220,5,3);
		mapoTofu.setSize(1100,825);

		cTraditionaltab.add(mapoTofu);

		ImageIcon mapoTofuImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Chaina\\Kung-Pao-Chicken.jpg");
		JLabel mapoTofuImgLabel = new JLabel(mapoTofuImg);
		mapoTofuImgLabel.setBounds(840,20,100,100);
		mapoTofuImgLabel.setSize(200,200);
		cTraditionaltab.add(mapoTofuImgLabel);


		JLabel mapoTofuPriceLabel = new JLabel("Price : BDT 200 ");
		mapoTofuPriceLabel.setBounds(890,-200,5,3);
		mapoTofuPriceLabel.setSize(1100,825);

		cTraditionaltab.add(mapoTofuPriceLabel);


		JButton mapoTofubtn = new JButton("Add to Cart");
		mapoTofubtn.setBounds(840,220,100,30);
		mapoTofubtn.setSize(150,30);
		mapoTofubtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				mapoTofuCount++;
				totalIteamCount++;
			}
		});
		cTraditionaltab.add(mapoTofubtn);



		//Peking Roast Duck
		JLabel pekingRoastDuck = new JLabel("Peking Roast Duck");
		pekingRoastDuck.setBounds(1190,-220,5,3);
		pekingRoastDuck.setSize(1100,825);

		cTraditionaltab.add(pekingRoastDuck);

		ImageIcon pekingRoastDuckImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Chaina\\Peking Roast Duck.jpg");
		JLabel pekingRoastDuckImgLabel = new JLabel(pekingRoastDuckImg);
		pekingRoastDuckImgLabel.setBounds(1120,20,100,100);
		pekingRoastDuckImgLabel.setSize(200,200);
		cTraditionaltab.add(pekingRoastDuckImgLabel);

		JLabel pekingRoastDuckPriceLabel = new JLabel("Price : BDT 200 ");
		pekingRoastDuckPriceLabel.setBounds(1190,-200,5,3);
		pekingRoastDuckPriceLabel.setSize(1100,825);

		cTraditionaltab.add(pekingRoastDuckPriceLabel);

		JButton pekingRoastDuckbtn = new JButton("Add to Cart");
		pekingRoastDuckbtn.setBounds(1240,220,100,30);
		pekingRoastDuckbtn.setSize(150,30);
		pekingRoastDuckbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				pekingRoastDuckCount++;
				totalIteamCount++;
			}
		});
		cTraditionaltab.add(pekingRoastDuckbtn);

		


		//Sweet and Sour Pork

		JLabel sourPork = new JLabel("Sour Pork");
		sourPork.setBounds(85,-20,5,3);
		sourPork.setSize(1100,825);

		cTraditionaltab.add(sourPork);

		ImageIcon sourPorkImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Traditional food\\Chaina\\Sweet and Sour Pork.jpg");
		JLabel sourPorkImgLabel = new JLabel(sourPorkImg);
		sourPorkImgLabel.setBounds(20,220,100,100);
		sourPorkImgLabel.setSize(200,200);
		cTraditionaltab.add(sourPorkImgLabel);

		JLabel sourPorkPriceLabel = new JLabel("Price : BDT 150 ");
		sourPorkPriceLabel.setBounds(85,0,5,3);
		sourPorkPriceLabel.setSize(1100,825);

		cTraditionaltab.add(sourPorkPriceLabel);



		JButton sourPorkbtn = new JButton("Add to Cart");
		sourPorkbtn.setBounds(40,420,100,30);
		sourPorkbtn.setSize(150,30);
		sourPorkbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				sourPorkCount++;
				totalIteamCount++;
			}
		});
		cTraditionaltab.add(sourPorkbtn);




       	chinaPane.addTab("NON-Traditional",cnTraditionaltab = new JPanel());
       	cnTraditionaltab.setLayout(null);


       	//china non traditional 
       	//Chicken Teriyaki
       	JLabel chickenTeriyaki = new JLabel("Chicken Teriyaki");
		chickenTeriyaki.setBounds(90,-220,5,3);
		chickenTeriyaki.setSize(1100,825);

		cnTraditionaltab.add(chickenTeriyaki);

		ImageIcon chickenTeriyakiImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Chaina\\Chicken Teriyaki.jpg");
		JLabel chickenTeriyakiImgLabel = new JLabel(chickenTeriyakiImg);
		chickenTeriyakiImgLabel.setBounds(20,20,100,100);
		chickenTeriyakiImgLabel.setSize(200,200);
		cnTraditionaltab.add(chickenTeriyakiImgLabel);

		JLabel chickenTeriyakiPriceLabel = new JLabel("Price : BDT 550 ");
		chickenTeriyakiPriceLabel.setBounds(90,-200,5,3);
		chickenTeriyakiPriceLabel.setSize(1100,825);

		cnTraditionaltab.add(chickenTeriyakiPriceLabel);


		JButton chickenTeriyakibtn = new JButton("Add to Cart");
		chickenTeriyakibtn.setBounds(40,220,100,30);
		chickenTeriyakibtn.setSize(150,30);
		chickenTeriyakibtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				chickenTeriyakiCount++;
				totalIteamCount++;
			}
		});
		cnTraditionaltab.add(chickenTeriyakibtn);

		//Crab Rangoon
		JLabel crabRangoon = new JLabel("Crab Rangoon");
		crabRangoon.setBounds(490,-220,5,3);
		crabRangoon.setSize(1100,825);

		cnTraditionaltab.add(crabRangoon);

		ImageIcon crabRangoonImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Chaina\\Crab Rangoon.jpg");
		JLabel crabRangoonImgLabel = new JLabel(crabRangoonImg);
		crabRangoonImgLabel.setBounds(430,20,100,100);
		crabRangoonImgLabel.setSize(200,200);
		cnTraditionaltab.add(crabRangoonImgLabel);

		JLabel crabRangoonPriceLabel = new JLabel("Price : BDT 200 ");
		crabRangoonPriceLabel.setBounds(490,-200,5,3);
		crabRangoonPriceLabel.setSize(1100,825);

		cnTraditionaltab.add(crabRangoonPriceLabel);

		JButton crabRangoonbtn = new JButton("Add to Cart");
		crabRangoonbtn.setBounds(440,220,100,30);
		crabRangoonbtn.setSize(150,30);
		crabRangoonbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				crabRangoonCount++;
				totalIteamCount++;
			}
		});
		cnTraditionaltab.add(crabRangoonbtn);


		//Sesame Chicken

		JLabel sesameChicken = new JLabel("Sesame Chicken");
		sesameChicken.setBounds(890,-220,5,3);
		sesameChicken.setSize(1100,825);

		cnTraditionaltab.add(sesameChicken);

		ImageIcon sesameChickenImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Chaina\\Sesame Chicken.jpg");
		JLabel sesameChickenImgLabel = new JLabel(sesameChickenImg);
		sesameChickenImgLabel.setBounds(840,20,100,100);
		sesameChickenImgLabel.setSize(200,200);
		cnTraditionaltab.add(sesameChickenImgLabel);

		JLabel sesameChickenPriceLabel = new JLabel("Price : BDT 400");
		sesameChickenPriceLabel.setBounds(890,-200,5,3);
		sesameChickenPriceLabel.setSize(1100,825);

		cnTraditionaltab.add(sesameChickenPriceLabel);

		JButton sesameChickenbtn = new JButton("Add to Cart");
		sesameChickenbtn.setBounds(840,220,100,30);
		sesameChickenbtn.setSize(150,30);
		sesameChickenbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				sesameChickenCount++;
				totalIteamCount++;
			}
		});
		cnTraditionaltab.add(sesameChickenbtn);



		//Sugar Doughnut
		JLabel sugarDoughnut = new JLabel("Sugar Doughnut");
		sugarDoughnut.setBounds(1190,-220,5,3);
		sugarDoughnut.setSize(1100,825);

		cnTraditionaltab.add(sugarDoughnut);

		ImageIcon sugarDoughnutImg = new ImageIcon("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\pictures\\Non traditional food\\Chaina\\Sugar Doughnut.jpg");
		JLabel sugarDoughnutImgLabel = new JLabel(sugarDoughnutImg);
		sugarDoughnutImgLabel.setBounds(1120,20,100,100);
		sugarDoughnutImgLabel.setSize(200,200);
		cnTraditionaltab.add(sugarDoughnutImgLabel);

		JLabel sugarDoughnutPriceLabel = new JLabel("Price : BDT 100 ");
		sugarDoughnutPriceLabel.setBounds(1190,-200,5,3);
		sugarDoughnutPriceLabel.setSize(1100,825);

		cnTraditionaltab.add(sugarDoughnutPriceLabel);


		JButton sugarDoughnutbtn = new JButton("Add to Cart");
		sugarDoughnutbtn.setBounds(1240,220,100,30);
		sugarDoughnutbtn.setSize(150,30);
		sugarDoughnutbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				sugarDoughnutCount++;
				totalIteamCount++;
			}
		});
		cnTraditionaltab.add(sugarDoughnutbtn);








       	chinatab.add(chinaPane,BorderLayout.CENTER);




        exploretab.add(explorePane, BorderLayout.CENTER);



       






        tabbedPane.addTab("Orders",orderstab =  new JPanel());
        orderstab.setLayout(null);

        JButton orderbtn = new JButton("Online Payment");
        orderbtn.setBounds(650,600,600,30);
        orderbtn.setSize(200,50);





        orderbtn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		

        		switchToPaymentFrame();
        	}
        });

        orderstab.add(orderbtn);


        JButton codbtn = new JButton("Cash on Delivery");
        codbtn.setBounds(650,750,600,30);
        codbtn.setSize(200,50);
        codbtn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		JOptionPane.showMessageDialog(frame,"Your total cost :" ,"Delivery Arraving in 10 min" , JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        orderstab.add(codbtn);


        JLabel orderedlabel = new JLabel("Iteams added  to cart: " );
        System.out.println(totalIteamCount);
        orderedlabel.setBounds(50,-80,1000,200);
        font = orderedlabel.getFont().deriveFont(20f);
        orderedlabel.setFont(font);
        orderstab.add(orderedlabel);


        JLabel costlabel = new JLabel("Total Cost: ");
        costlabel.setBounds(50,300,1000,200);
        font = costlabel.getFont().deriveFont(20f);
        costlabel.setFont(font);
        orderstab.add(costlabel);


        JButton costbtn = new JButton("View Total cost");
        costbtn.setBounds(260,370,600,30);
        costbtn.setSize(200,50);





        costbtn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		totalCost = bhapaPithaPrice*bhapaPithaCount+ bhunaKhichuriPrice*bhunaKhichuriCount + shorsheIlishPrice * shorsheIlishCount + kacchiBiriyaniPrice*kaccchiBiriyaniCount + bhortaPrice*bhortaCount + chuiJhalPrice*chuiJhalCount + grilledChickenPrice*grilledChikenCount + payeshPrice*payeshCount + pizzaPrice*pizzaCount + sandWichPrice *sandWichCount + gaengKeowWanGaiPrice*gaengKeowWanGaiCount + kaengLueangPrice*kaengLueangCount + padKraPaoMooPrice*padKraPaoMooCount + padThaiPrice*padThaiCount+tomYumGoongPrice*tomYumGoongCount + saiOuaPrice*saiOuaCount + gaengHungLayPrice*gaengHungLayCount +khaoSoiGaiPrice*khaoSoiGaiCount + mooYorChiangMaiPrice*mooYorChiangMaiCount + chowMeinPrice * chowMeinCount + kungPaoChickenPrice* kungPaoChickenCount + mapoTofuPrice* mapoTofuCount + pekingRoastDuckPrice*pekingRoastDuckCount + sourPorkPrice * sourPorkCount + chickenTeriyakiPrice*chickenTeriyakiCount +crabRangoonPrice*crabRangoonCount+ sesameChickenPrice* sesameChickenCount + sugarDoughnutPrice*sugarDoughnutCount;
        		
        		JOptionPane.showMessageDialog(frame,"Total cost : " + totalCost + "Taka", "Payment" ,JOptionPane.INFORMATION_MESSAGE);
        		
        	}
        });

        orderstab.add(costbtn);



        JButton cartbtn = new JButton("View cart");
        cartbtn.setBounds(260,0,600,30);
        cartbtn.setSize(200,50);





        cartbtn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		
        		JOptionPane.showMessageDialog(frame,"Iteams Counted: " + totalIteamCount, "Your cart" ,JOptionPane.INFORMATION_MESSAGE);
        		
        	}
        });

        orderstab.add(cartbtn);



        tabbedPane.addTab("Profile",profiletab =  new JPanel());
        profiletab.setLayout(null);
        
        JLabel usernameLabel = new JLabel("User name : " + username);
        usernameLabel.setBounds(50,-80,1000,200);
        font=usernameLabel.getFont().deriveFont(15f);
		usernameLabel.setFont(font);
        profiletab.add(usernameLabel);

        JLabel emailLabel = new JLabel("Provided Email : " + email);
        emailLabel.setBounds(50,-60,1000,200);
        font=emailLabel.getFont().deriveFont(15f);
		emailLabel.setFont(font);
        profiletab.add(emailLabel);

        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        
        JButton logoutbtn = new JButton("LOGOUT");
        logoutbtn.setBounds(1300,10,80,30);
        logoutbtn.setSize(100,40);
        logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchBackToLoginFrame();
            }
        });
        profiletab.add(logoutbtn);

        frame.getContentPane().add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void switchBackToLoginFrame()
    {
    		
		frame.setVisible(false);

		new LoginFrame();

	
    }

    public void switchToRestaurantBookingFrame()
    {
    	frame.setVisible(true);

    	new RestaurantBookingFrame();
    }

    public void switchToPaymentFrame()
    {
    	frame.setVisible(true);

    	new PaymentFrame();
    }

    public void search()
    {
    	frame.setVisible(true);

    	String searchData = searchInput.getText();

    	 new SearchFrame(searchData);

    }
}


    

    
    
	

		
