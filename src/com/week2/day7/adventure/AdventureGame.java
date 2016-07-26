package com.week2.day7.adventure;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class AdventureGame
{
	public void StartGame() throws IOException
	{
		System.out.println("Welcome to ShipWrecked \nChoose what you would do in each senerio by selecting the letter for your selection\n");
		mainMenu();
	}

	public void mainMenu() throws IOException
	{
		String[] mainMenuOptions = new String[4];

		int SEARCH_FOR_FOOD = 0;
		int BUILD_SHELTER = 1;
		int BUILD_RAFT = 2;
		int QUIT = 3;
		String selection = "";

		Scanner mainMenuReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\mainMenu.txt"));
		Scanner mainMenuScanner = new Scanner(System.in);

		String desc = mainMenuReader.nextLine();
		mainMenuOptions[SEARCH_FOR_FOOD] = mainMenuReader.nextLine();
		mainMenuOptions[BUILD_SHELTER] = mainMenuReader.nextLine();
		mainMenuOptions[BUILD_RAFT] = mainMenuReader.nextLine();
		mainMenuOptions[QUIT] = mainMenuReader.nextLine();

		mainMenuReader.close();

		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < mainMenuOptions.length; i++)
				System.out.println(mainMenuOptions[i]);

			selection = mainMenuScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				searchBeach();
				break;
			case "B":
				buildShelter();
				break;
			case "C":
				buildRaft();
				break;
			case "D":
				break;
			}

		} while (noValidAnswer(selection));

		mainMenuScanner.close();

	}

	
	private void buildRaft() throws IOException
	{
		String[] buildRaftOptions = new String[5];

		int BAMBOO = 0;
		int COCONUTS = 1;
		int BOAT_SCRAPS = 2;
		int MAIN = 3;
		int QUIT = 4;

		String selection = "";

		Scanner buildRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\buildRaft.txt"));
		Scanner buildRaftScanner = new Scanner(System.in);

		String desc = buildRaftReader.nextLine();
		buildRaftOptions[BAMBOO] = buildRaftReader.nextLine();
		buildRaftOptions[COCONUTS] = buildRaftReader.nextLine();
		buildRaftOptions[BOAT_SCRAPS] = buildRaftReader.nextLine();
		buildRaftOptions[MAIN] = buildRaftReader.nextLine();
		buildRaftOptions[QUIT] = buildRaftReader.nextLine();

		buildRaftReader.close();

		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < buildRaftOptions.length; i++)
				System.out.println(buildRaftOptions[i]);

			selection = buildRaftScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				bambooRaft();
				break;
			case "B":
				coconutRaft();
				break;
			case "C":
				boatScrapRaft();
				break;
			case "D":
				mainMenu();
				break;
			case "E":
				break;
			}

		} while (noValidAnswer(selection));

		buildRaftScanner.close();

	}

	private void boatScrapRaft() throws IOException
	{
		Scanner boatScrapRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\oldBoatRaft.txt"));
		
		String desc = boatScrapRaftReader.nextLine();

		boatScrapRaftReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
	}
	private void coconutRaft() throws IOException
	{
		Scanner coconutRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\coconutRaft.txt"));
		
		String desc = coconutRaftReader.nextLine();

		coconutRaftReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
	}
	private void bambooRaft() throws IOException
	{
		Scanner bambooRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\bambooRaft.txt"));
		
		String desc = bambooRaftReader.nextLine();

		bambooRaftReader.close();

		System.out.println("\n" + desc);
		mainMenu();
	}

	
	private void buildShelter() throws IOException
	{
		String[] buildShelterOptions = new String[5];

		int TREE = 0;
		int LEAVES = 1;
		int BOAT_SCRAPS = 2;
		int MAIN = 3;
		int QUIT = 4;

		String selection = "";

		Scanner buildShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\buildShelter.txt"));
		Scanner buildRaftScanner = new Scanner(System.in);

		String desc = buildShelterReader.nextLine();
		buildShelterOptions[TREE] = buildShelterReader.nextLine();
		buildShelterOptions[LEAVES] = buildShelterReader.nextLine();
		buildShelterOptions[BOAT_SCRAPS] = buildShelterReader.nextLine();
		buildShelterOptions[MAIN] = buildShelterReader.nextLine();
		buildShelterOptions[QUIT] = buildShelterReader.nextLine();

		buildShelterReader.close();

		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < buildShelterOptions.length; i++)
				System.out.println(buildShelterOptions[i]);

			selection = buildRaftScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				treeShelter();
				break;
			case "B":
				leavesShelter();
				break;
			case "C":
				boatScrapShelter();
				break;
			case "D":
				mainMenu();
				break;
			case "E":
				break;
			}

		} while (noValidAnswer(selection));

		buildRaftScanner.close();
	}

	private void boatScrapShelter() throws IOException
	{
		Scanner boatScrapShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\boatScrapShelter.txt"));
		
		String desc = boatScrapShelterReader.nextLine();

		boatScrapShelterReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
	}
	private void leavesShelter() throws IOException
	{
		Scanner leavesShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\treeShelter.txt"));
		
		String desc = leavesShelterReader.nextLine();

		leavesShelterReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
		
	}
	private void treeShelter() throws IOException
	{
		Scanner treeShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\treeShelter.txt"));
		
		String desc = treeShelterReader.nextLine();

		treeShelterReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
	}

	
	private void searchBeach() throws IOException
	{
		String[] searchBeachOptions = new String[5];

		int FISH = 0;
		int ROCKS = 1;
		int YELL = 2;
		int MAIN = 3;
		int QUIT = 4;

		String selection = "";

		Scanner searchBeachReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\searchBeach.txt"));
		Scanner searchBeachScanner = new Scanner(System.in);

		String desc = searchBeachReader.nextLine();
		searchBeachOptions[FISH] = searchBeachReader.nextLine();
		searchBeachOptions[ROCKS] = searchBeachReader.nextLine();
		searchBeachOptions[YELL] = searchBeachReader.nextLine();
		searchBeachOptions[MAIN] = searchBeachReader.nextLine();
		searchBeachOptions[QUIT] = searchBeachReader.nextLine();

		searchBeachReader.close();

		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < searchBeachOptions.length; i++)
				System.out.println(searchBeachOptions[i]);

			selection = searchBeachScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				fishSearch();
				break;
			case "B":
				rockSearch();
				break;
			case "C":
				yellSearch();
				break;
			case "D":
				mainMenu();
				break;
			case "E":
				break;
			}

		} while (noValidAnswer(selection));

		searchBeachScanner.close();

	}

	private void yellSearch() throws IOException
	{
		Scanner yellSearchReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\yellSearch.txt"));
		
		String desc = yellSearchReader.nextLine();

		yellSearchReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
	}
	private void rockSearch() throws IOException
	{
		Scanner rockSearchReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\rockSearch.txt"));
		
		String desc = rockSearchReader.nextLine();

		rockSearchReader.close();

		System.out.println("\n" + desc);
		mainMenu();
		
	}
	private void fishSearch() throws IOException
	{
		Scanner fishSearchReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\fishSearch.txt"));
		
		String desc = fishSearchReader.nextLine();

		fishSearchReader.close();

		System.out.println("\n" + desc);
		mainMenu();
	}

	private boolean noValidAnswer(String selection)
	{
		switch (selection)
		{
		case "A":
		case "B":
		case "C":
		case "D":
		case "E":
			return false;
		default:
			System.out.println("Invalid selection!\nTry Again\n");
			return true;
		}
	}
}
