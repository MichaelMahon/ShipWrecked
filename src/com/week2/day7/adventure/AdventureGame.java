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
		String[] boatScrapRaftOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner boatScrapRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\oldBoatRaft.txt"));
		Scanner boatScrapRaftScanner = new Scanner(System.in);
		
		String desc = boatScrapRaftReader.nextLine();
		boatScrapRaftOptions[MAIN] = boatScrapRaftReader.nextLine();
		boatScrapRaftOptions[QUIT] = boatScrapRaftReader.nextLine();
		
		boatScrapRaftReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < boatScrapRaftOptions.length; i++)
				System.out.println(boatScrapRaftOptions[i]);

			selection = boatScrapRaftScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		boatScrapRaftScanner.close();
		
	}
	private void coconutRaft() throws IOException
	{
		String[] coconutRaftOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner coconutRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\coconutRaft.txt"));
		Scanner coconutRaftScanner = new Scanner(System.in);
		
		String desc = coconutRaftReader.nextLine();
		coconutRaftOptions[MAIN] = coconutRaftReader.nextLine();
		coconutRaftOptions[QUIT] = coconutRaftReader.nextLine();
		
		coconutRaftReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < coconutRaftOptions.length; i++)
				System.out.println(coconutRaftOptions[i]);

			selection = coconutRaftScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		coconutRaftScanner.close();
		
	}
	private void bambooRaft() throws IOException
	{
		String[] bambooRaftOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner bambooRaftReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\bambooRaft.txt"));
		Scanner bambooRaftScanner = new Scanner(System.in);
		
		String desc = bambooRaftReader.nextLine();
		bambooRaftOptions[MAIN] = bambooRaftReader.nextLine();
		bambooRaftOptions[QUIT] = bambooRaftReader.nextLine();
		
		bambooRaftReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < bambooRaftOptions.length; i++)
				System.out.println(bambooRaftOptions[i]);

			selection = bambooRaftScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		bambooRaftScanner.close();
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
		String[] boatScrapShelterOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner boatScrapShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\boatScrapShelter.txt"));
		Scanner boatScrapShelterScanner = new Scanner(System.in);
		
		String desc = boatScrapShelterReader.nextLine();
		boatScrapShelterOptions[MAIN] = boatScrapShelterReader.nextLine();
		boatScrapShelterOptions[QUIT] = boatScrapShelterReader.nextLine();
		
		boatScrapShelterReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < boatScrapShelterOptions.length; i++)
				System.out.println(boatScrapShelterOptions[i]);

			selection = boatScrapShelterScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		boatScrapShelterScanner.close();
		
	}
	private void leavesShelter() throws IOException
	{
		String[] leavesShelterOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner leavesShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\leavesShelter.txt"));
		Scanner leavesShelterScanner = new Scanner(System.in);
		
		String desc = leavesShelterReader.nextLine();
		leavesShelterOptions[MAIN] = leavesShelterReader.nextLine();
		leavesShelterOptions[QUIT] = leavesShelterReader.nextLine();
		
		leavesShelterReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < leavesShelterOptions.length; i++)
				System.out.println(leavesShelterOptions[i]);

			selection = leavesShelterScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		leavesShelterScanner.close();
		
	}
	private void treeShelter() throws IOException
	{
		String[] treeShelterOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner treeShelterReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\treeShelter.txt"));
		Scanner treeShelterScanner = new Scanner(System.in);
		
		String desc = treeShelterReader.nextLine();
		treeShelterOptions[MAIN] = treeShelterReader.nextLine();
		treeShelterOptions[QUIT] = treeShelterReader.nextLine();
		
		treeShelterReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < treeShelterOptions.length; i++)
				System.out.println(treeShelterOptions[i]);

			selection = treeShelterScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		treeShelterScanner.close();
		
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
		String[] yellSearchOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner yellSearchReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\yellSearch.txt"));
		Scanner yellSearchScanner = new Scanner(System.in);
		
		String desc = yellSearchReader.nextLine();
		yellSearchOptions[MAIN] = yellSearchReader.nextLine();
		yellSearchOptions[QUIT] = yellSearchReader.nextLine();
		
		yellSearchReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < yellSearchOptions.length; i++)
				System.out.println(yellSearchOptions[i]);

			selection = yellSearchScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		yellSearchScanner.close();
		
	}
	private void rockSearch() throws IOException
	{
		String[] rockSearchOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner rockSearchReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\rockSearch.txt"));
		Scanner rockSearchScanner = new Scanner(System.in);
		
		String desc = rockSearchReader.nextLine();
		rockSearchOptions[MAIN] = rockSearchReader.nextLine();
		rockSearchOptions[QUIT] = rockSearchReader.nextLine();
		
		rockSearchReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < rockSearchOptions.length; i++)
				System.out.println(rockSearchOptions[i]);

			selection = rockSearchScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		rockSearchScanner.close();
		
	}
	private void fishSearch() throws IOException
	{
		String[] fishSearchOptions = new String[2];
		boolean validSelection = true;

		int MAIN = 0;
		int QUIT = 1;
		
		String selection = "";

		Scanner fishSearchReader = new Scanner(
				Paths.get("C:\\Users\\admin\\workspace\\Day7Assignment1\\stories\\fishSearch.txt"));
		Scanner fishSearchScanner = new Scanner(System.in);
		
		String desc = fishSearchReader.nextLine();
		fishSearchOptions[MAIN] = fishSearchReader.nextLine();
		fishSearchOptions[QUIT] = fishSearchReader.nextLine();
		
		fishSearchReader.close();
		
		do
		{
			System.out.println("\n" + desc);
			for (int i = 0; i < fishSearchOptions.length; i++)
				System.out.println(fishSearchOptions[i]);

			selection = fishSearchScanner.nextLine().toUpperCase();

			switch (selection)
			{
			case "A":
				mainMenu();
				break;
			case "B":
				break;
			default:
				validSelection = false;
			}

		} while (!validSelection);
		
		fishSearchScanner.close();
		
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
