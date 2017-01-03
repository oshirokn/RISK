import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main (String[] args){
	//champs
	int nbpays; 
	boolean[] tableauAttribution= new boolean[42]; //tableau des pays non attribués
	Joueur[] tabJoueur= new Joueur[3]; //tableau des joueurs
	Pays[] tabPays= new Pays[42]; //tableau des Pays
	//tableaux des continents
	Pays[] Afrique= new Pays[6];
	Pays[] Europe= new Pays[7];
	Pays[] AmeriqueNord= new Pays[9];
	Pays[] AmeriqueSud= new Pays[4];
	Pays[] Asie= new Pays[12];
	Pays[] Oceanie= new Pays[4];
	//tableaux des pays possédés par chaque joueur
	ArrayList<Pays> Joueur1Pays = new ArrayList<Pays>();
	ArrayList<Pays> Joueur2Pays = new ArrayList<Pays>();
	ArrayList<Pays> Joueur3Pays = new ArrayList<Pays>();
	ArrayList<Pays>[] TabJoueurPays = new ArrayList[3];
	//variables
	int i;
	int j;
	int y;
	String color;
	boolean test;
	int[] cond = new int[3];
	int tirage;
	int condtemp[] = {0,0,0};
	//scanner de saisie
	Scanner sc = new Scanner(System.in);

	//Tirage au sort des conditions de victoire
	// Total 8
	for(i=0;i<3;i++){
		do{
			tirage =(1+(int)(Math.random() * ((8-1) +1)));
			condtemp[i]=tirage;
			}while(tirage==condtemp[0] && tirage==condtemp[1]);
			cond[i] = tirage;
	}

	//création des joueurs
	Joueur j1=new Joueur("Bleu",cond[0]);
	Joueur j2=new Joueur("Vert",cond[1]);
	Joueur j3=new Joueur("Rouge",cond[2]);

	//tableau des joueurs
		for(i=0;i<3;i++){
			if(i==0){
				tabJoueur[i]=j1;
			}else{
				if (i==1){
					tabJoueur[i]=j2;
				}else{
					tabJoueur[i]=j3;
				     }
			     }
		}

	//tableau des tableaux dynamiques des pays possédés par les joueurs
		for(i=0;i<3;i++){
			if(i==0){
				TabJoueurPays[i]=Joueur1Pays;
			}else{
				if (i==1){
					TabJoueurPays[i]=Joueur2Pays;
				}else{
					TabJoueurPays[i]=Joueur3Pays;
				     }
			     }
		}

	//calcul du nombre de pays
	nbpays=42/3;//nombre de pays par joueur

	//création des pays, du tableau de pays et des tableaux des continents
	Pays p1=new Pays(1,"Afghanistan",1);
	tabPays[0]=p1;
	Asie[0]=p1;
	Pays p2=new Pays(2,"Afrique du Nord",1);
	tabPays[1]=p2;
	Afrique[0]=p2;
	Pays p3=new Pays(3,"Afrique du Sud",10);
	tabPays[2]=p3;
	Afrique[1]=p3;
	Pays p4=new Pays(4,"Afrique Orientale",10);
	tabPays[3]=p4;
	Afrique[2]=p4;
	Pays p5=new Pays(5,"Alaska",1);
	tabPays[4]=p5;
	AmeriqueNord[0]=p5;
	Pays p6=new Pays(6,"Alberta",1);
	tabPays[5]=p6;
	AmeriqueNord[1]=p6;
	Pays p7=new Pays(7,"Amerique Centrale",5);
	tabPays[6]=p7;
	AmeriqueNord[2]=p7;
	Pays p8=new Pays(8,"Argentine",1);
	tabPays[7]=p8;
	AmeriqueSud[0]=p8;
	Pays p9=new Pays(9,"Australie Occidentale",10);
	tabPays[8]=p9;
	Oceanie[0]=p9;
	Pays p10=new Pays(10,"Australie Orientale",1);
	tabPays[9]=p10;
	Oceanie[1]=p10;
	Pays p11=new Pays(11,"Brésil",10);
	tabPays[10]=p11;
	AmeriqueSud[1]=p11;
	Pays p12=new Pays(12,"Chine",5);
	tabPays[11]=p12;
	Asie[1]=p12;
	Pays p13=new Pays(13,"Congo",5);
	tabPays[12]=p13;
	Afrique[3]=p13;
	Pays p14=new Pays(14,"Egypte",1);
	tabPays[13]=p14;
	Afrique[4]=p14;
	Pays p15=new Pays(15,"Etat de l'Est",10);
	tabPays[14]=p15;
	AmeriqueNord[3]=p15;
	Pays p16=new Pays(16,"Etat de l'Ouest",1);
	tabPays[15]=p16;
	AmeriqueNord[4]=p16;
	Pays p17=new Pays(17,"Europe du Nord",5);
	tabPays[16]=p17;
	Europe[0]=p17;
	Pays p18=new Pays(18,"Europe du Sud",5);
	tabPays[17]=p18;
	Europe[1]=p18;
	Pays p19=new Pays(19,"Europe Occidentale",1);
	tabPays[18]=p19;
	Europe[2]=p19;
	Pays p20=new Pays(20,"Grande Bretagne",5);
	tabPays[19]=p20;
	Europe[3]=p20;
	Pays p21=new Pays(21,"Groenland",5);
	tabPays[20]=p21;
	AmeriqueNord[5]=p21;
	Pays p22=new Pays(22,"Inde",1);
	tabPays[21]=p22;
	Asie[2]=p22;
	Pays p23=new Pays(23,"Indonésie",5);
	tabPays[22]=p23;
	Oceanie[2]=p23;
	Pays p24=new Pays(24,"Islande",1);
	tabPays[23]=p24;
	Europe[3]=p24;
	Pays p25=new Pays(25,"Japon",1);
	tabPays[24]=p25;
	Asie[3]=p25;
	Pays p26=new Pays(26,"Kamchatka",5);
	tabPays[25]=p26;
	Asie[4]=p26;
	Pays p27=new Pays(27,"Madagascar",1);
	tabPays[26]=p27;
	Afrique[5]=p27;
	Pays p28=new Pays(28,"Mongolie",10);
	tabPays[27]=p28;
	Asie[5]=p28;
	Pays p29=new Pays(29,"Moyen Orient",10);
	tabPays[28]=p29;
	Asie[6]=p29;
	Pays p30=new Pays(30,"Nouvelle Guinée",5);
	tabPays[29]=p30;
	Oceanie[3]=p30;
	Pays p31=new Pays(31,"Ontario",5);
	tabPays[30]=p31;
	AmeriqueNord[6]=p31;
	Pays p32=new Pays(32,"Oural",5);
	tabPays[31]=p32;
	Asie[7]=p32;
	Pays p33=new Pays(33,"Pérou",5);
	tabPays[32]=p33;
	AmeriqueSud[2]=p33;
	Pays p34=new Pays(34,"Québec",10);
	tabPays[33]=p34;
	AmeriqueNord[7]=p34;
	Pays p35=new Pays(35,"Scandinavie",10);
	tabPays[34]=p35;
	Europe[4]=p35;
	Pays p36=new Pays(36,"Siam",10);
	tabPays[35]=p36;
	Asie[8]=p36;
	Pays p37=new Pays(37,"Sibérie",10);
	tabPays[36]=p37;
	Asie[9]=p37;
	Pays p38=new Pays(38,"Tchita",1);
	tabPays[37]=p38;
	Asie[10]=p38;
	Pays p39=new Pays(39,"Territoire du Nord Ouest",10);
	tabPays[38]=p39;
	AmeriqueNord[8]=p39;
	Pays p40=new Pays(40,"Ukraine",10);
	tabPays[39]=p40;
	Europe[5]=p40;
	Pays p41=new Pays(41,"Venezuela",10);
	tabPays[40]=p41;
	AmeriqueSud[3]=p41;
	Pays p42=new Pays(42,"Yakoutie",5);
	tabPays[41]=p42;
	Asie[11]=p42;
	
	//attribution des voisins
	p1.addVoisin(p40);
	p1.addVoisin(p30);
	p1.addVoisin(p33);
	p1.addVoisin(p12);
	p1.addVoisin(p22);
	p2.addVoisin(p19);
	p2.addVoisin(p18);
	p2.addVoisin(p14);
	p2.addVoisin(p4);
	p2.addVoisin(p13);
	p2.addVoisin(p1);
	p3.addVoisin(p13);
	p3.addVoisin(p4);
	p3.addVoisin(p27);
	p4.addVoisin(p14);
	p4.addVoisin(p2);
	p4.addVoisin(p3);
	p4.addVoisin(p27);
	p4.addVoisin(p29);
	p5.addVoisin(p39);
	p5.addVoisin(p6);
	p5.addVoisin(p26);
	p6.addVoisin(p5);
	p6.addVoisin(p39);
	p6.addVoisin(p31);
	p6.addVoisin(p16);
	p7.addVoisin(p16);
	p7.addVoisin(p15);
	p7.addVoisin(p41);
	p8.addVoisin(p11);
	p8.addVoisin(p33);
	p9.addVoisin(p10);
	p9.addVoisin(p23);
	p9.addVoisin(p30);
	p10.addVoisin(p9);
	p10.addVoisin(p30);
	p11.addVoisin(p8);
	p11.addVoisin(p33);
	p11.addVoisin(p41);
	p11.addVoisin(p2);
	p12.addVoisin(p1);
	p12.addVoisin(p32);
	p12.addVoisin(p37);
	p12.addVoisin(p28);
	p12.addVoisin(p36);
	p12.addVoisin(p2);
	p13.addVoisin(p2);
	p13.addVoisin(p3);
	p13.addVoisin(p4);
	p14.addVoisin(p2);
	p14.addVoisin(p4);
	p14.addVoisin(p18);
	p14.addVoisin(p29);
	p15.addVoisin(p34);
	p15.addVoisin(p31);
	p15.addVoisin(p16);
	p15.addVoisin(p7);
	p16.addVoisin(p6);
	p16.addVoisin(p31);
	p16.addVoisin(p15);
	p16.addVoisin(p7);
	p17.addVoisin(p40);
	p17.addVoisin(p18);
	p17.addVoisin(p35);
	p17.addVoisin(p20);
	p17.addVoisin(p19);
	p18.addVoisin(p17);
	p18.addVoisin(p19);
	p18.addVoisin(p40);
	p18.addVoisin(p29);
	p18.addVoisin(p2);
	p19.addVoisin(p20);
	p19.addVoisin(p18);
	p19.addVoisin(p17);
	p19.addVoisin(p2);
	p20.addVoisin(p17);
	p20.addVoisin(p19);
	p20.addVoisin(p24);
	p20.addVoisin(p35);
	p21.addVoisin(p34);
	p21.addVoisin(p24);
	p22.addVoisin(p29);
	p22.addVoisin(p1);
	p22.addVoisin(p12);
	p22.addVoisin(p36);
	p23.addVoisin(p36);
	p23.addVoisin(p30);
	p23.addVoisin(p9);
	p24.addVoisin(p21);
	p24.addVoisin(p20);
	p24.addVoisin(p35);
	p25.addVoisin(p28);
	p25.addVoisin(p26);
	p26.addVoisin(p25);
	p26.addVoisin(p28);
	p26.addVoisin(p38);
	p26.addVoisin(p42);
	p27.addVoisin(p3);
	p27.addVoisin(p4);
	p28.addVoisin(p12);
	p28.addVoisin(p25);
	p28.addVoisin(p37);
	p28.addVoisin(p38);
	p28.addVoisin(p26);
	p29.addVoisin(p14);
	p29.addVoisin(p4);
	p29.addVoisin(p18);
	p29.addVoisin(p40);
	p29.addVoisin(p1);
	p29.addVoisin(p22);
	p30.addVoisin(p11);
	p30.addVoisin(p23);
	p31.addVoisin(p34);
	p31.addVoisin(p6);
	p31.addVoisin(p40);
	p31.addVoisin(p21);
	p32.addVoisin(p13);
	p32.addVoisin(p38);
	p32.addVoisin(p12);
	p33.addVoisin(p8);
	p33.addVoisin(p41);
	p34.addVoisin(p15);
	p34.addVoisin(p21);
	p35.addVoisin(p24);
	p35.addVoisin(p17);
	p35.addVoisin(p40);
	p36.addVoisin(p22);
	p36.addVoisin(p23);
	p37.addVoisin(p42);
	p37.addVoisin(p32);
	p37.addVoisin(p28);
	p38.addVoisin(p42);
	p38.addVoisin(p26);
	p38.addVoisin(p28);
	p39.addVoisin(p21);
	p39.addVoisin(p5);
	p39.addVoisin(p6);
	p40.addVoisin(p1);
	p40.addVoisin(p29);
	p40.addVoisin(p17);
	p40.addVoisin(p18);
	p40.addVoisin(p35);
	p41.addVoisin(p33);
	p41.addVoisin(p7);
	p42.addVoisin(p26);
	p42.addVoisin(p37);
	
	//initialisation du tableau des pays non attribués
	for (i=0;i<42;i++){
		tableauAttribution[i]=false;
	}
	
	//attribution des pays
	for(i=0;i<3;i++){
		for (j=0;j<nbpays;j++){
			test=false;
			while(test==false){
				y=((int)(Math.random() * ((41) +1))); //obtenir un nombre aléatoire entre 0 et 41
				if (tableauAttribution[y]==false){ //le pays est disponible
					tabPays[y].setJoueur(tabJoueur[i]);
					if(i==0){
						Joueur1Pays.add(tabPays[y]);
						}else{
							if(i==1){
								Joueur2Pays.add(tabPays[y]);
								}else{
									Joueur3Pays.add(tabPays[y]);
							 	}
						}
					tableauAttribution[y]=true;
					test=true;
				}
			}
		}
	}
	
	//premier tour: affichage des conditions de victoire+répartition des armées
	int nbpions=0;
	int num;
	int nbarme=0;
	for(i=0;i<3;i++){
		Fonctions.AfficherConditionVictoire(tabJoueur[i]);
		System.out.println(tabJoueur[i].getNConditionDeVictoire()+"Joueur "+tabJoueur[i].getCouleur()+" positionnez vos armées");	
		for(j=0;j<TabJoueurPays[i].size();j++){
			nbpions=TabJoueurPays[i].get(j).getOccupepar()-1+nbpions;
			TabJoueurPays[i].get(j).setOccupepar(1);
		}
		while (nbpions>0){
			do {
				System.out.println("Il vous reste "+nbpions+" pions à placer");
				for(j=0;j<TabJoueurPays[i].size();j++){
				System.out.println("Pays : "+TabJoueurPays[i].get(j).getNom()+" n° "+TabJoueurPays[i].get(j).getId()+" Occupé par : "+TabJoueurPays[i].get(j).getOccupepar()+" armée(s)");
				}
					do{
						System.out.println("saisissez le numéro du pays sur lequel vous voulez placer une/des armée(s)");
						num=sc.nextInt();
					}while(num<1 || num>=43);
					if (true==TabJoueurPays[i].contains(tabPays[num-1])){
						System.out.println("saisissez le nombre de troupe à placer");
						nbarme=sc.nextInt();
						if(nbarme<=nbpions){
							tabPays[num-1].setOccupepar(nbarme+1);
							nbpions=nbpions-nbarme;
						}else
							System.out.println("Vous ne disposez pas d'assez de troupes");
					}else
						System.out.println("Ce pays n'est pas disponible");
				}while (nbpions>0); 
			
		}
	System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
}

	//vrai tour de jeu
		//reception et disposition des renforts
		//ordres de déplacement et combat + réattribution des pays et nouvelles positions des armées
		//vérification de la condition de victoire
}
}


