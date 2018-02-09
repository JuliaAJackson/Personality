import java.util.Scanner;

public class PersonalProject
	{
		static String name;
		static int sanguineCounter = 0;
		static int cholericCounter = 0;
		static int phlegmaticCounter = 0;
		static int melancholicCounter = 0;
		static String personalityArray [] = new String [5];
		static String personalityType = "";
		public static void main(String[] args)
			{
				explainTemperamentType();
				greetUser();
				complimentUser();
				giveInfo();
				quizUser();
				printStats();
				chooseCareer();
			}

		private static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, What's your name?");
				name = userInput.nextLine();
				System.out.println("Hi, " + name + "!");
			} 
		private static void complimentUser()
			{
				String complimentArray [] = new String [5];
				complimentArray[0] = name + "! You're positively glowing!";
				complimentArray[1] = name + "! You bring positivity to the world!";
				complimentArray[2] = name + "! No wonder why everyone likes you! You're so nice!";
				complimentArray[3] = name + "! You're one of the most intelligent people I know!";
				complimentArray[4] = name + "! You deserve to treat your self!";
				int randomCompliment = (int) (Math.random() * complimentArray.length);
				System.out.println(complimentArray[randomCompliment]);
			}
		private static void giveInfo()
			{
				System.out.println("Let's find which of the four temperaments you are (options are sanguine, choleric, phlegmatic, or melancholic)");
				String temperamentArray [] = new String [5];
				temperamentArray[0] = "\nA Temperament represents the way a person relates to others and responds to events. \nIt is what you have observed and expect someone’s behavior to be, most of the time.";
				temperamentArray[1] = "A CHOLERIC is usually a goal-oriented person. \nPeople with choleric personality type are very savvy, analytical, and logical. \nExtremely practical and straightforward, choleric people aren’t necessary very good companions or particularly social.";
				temperamentArray[2] = "A PHLEGMATIC type seeks interpersonal harmony and close relationships. \nPeople with phlegmatic temperament tend to avoid conflicts and always try to mediate between others to restore peace and harmony.";
				temperamentArray[3] = "A MELANCHOLIC loves their family and friends but do not look for novelty and adventure. \nThey are very social and seek to contribute to the community. \nThey are extremely orderly and accurate.";
				temperamentArray[4] = "A SANGUINE type tends to be lively, optimistic, buoyant, and carefree. \nThey love adventure and have a high risk tolerance. \nTIME FOR THE TEST";
				for (String t: temperamentArray)
					{
						System.out.println(t);
						System.out.println(" ");
					}
			}
		private static void quizUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Question 1: do you consider yourself to react slowly or quickly to new people, ideas, or challenges? Type the number that corresponds to your answer.");
				System.out.println("1. Quickly");
				System.out.println("2. Slowly");
				int answerOne=userInput.nextInt();
				if (answerOne == 1)
					{
						sanguineCounter++;
						cholericCounter++;
					}
				if (answerOne == 2)
					{
						melancholicCounter++;
						phlegmaticCounter++;
					}
				System.out.println("When presented with an idea, How do you react?");
				System.out.println("1. Quickly, with certainty");
				System.out.println("2. Remain calm and wait to react");
				System.out.println("3. Don't react ");
				int answerTwo = userInput.nextInt();
				if (answerTwo == 1)
					{
						sanguineCounter++;
						cholericCounter++;
					}
				if (answerTwo == 2)
					{
						phlegmaticCounter++;
					}
				if (answerTwo == 3)
					{
						melancholicCounter++;
					}
				System.out.println("How long do your impressions last?");
				System.out.println("1. A short time");
				System.out.println("2. A long time");
				int answerThree = userInput.nextInt();
				if (answerThree == 1)
					{
						cholericCounter++;
						melancholicCounter++;
					}
				if (answerThree == 2)
					{
						phlegmaticCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself introverted or extroverted?");
				System.out.println("1. Introverted");
				System.out.println("2. Extroverted");
				int answerFour = userInput.nextInt();
				if (answerFour == 1)
					{
						phlegmaticCounter++;
						melancholicCounter++;
					}
				if (answerFour == 2)
					{
						cholericCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself more goal-oriented or process-oriented?");
				System.out.println("1. Goal Oriented");
				System.out.println("2. Process Oriented");
				int answerFive = userInput.nextInt();
				if (answerFive == 1)
					{
						cholericCounter++;
						melancholicCounter++;
					}
				if (answerFive == 2)
					{
						phlegmaticCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you find yourself comfortable with the present moment or looking towards the future?");
				System.out.println("1. Comfortable in the present");
				System.out.println("2. Looking towards the future");
				int answerSix = userInput.nextInt();
				if (answerSix == 1)
					{
						phlegmaticCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself more impulsive or methodic?");
				System.out.println("1. Impulsive");
				System.out.println("2. Methodic");
				int answerSeven = userInput.nextInt();
				if (answerSeven == 1)
					{
						sanguineCounter++;
					}
				if (answerSeven == 2)
					{
						phlegmaticCounter++;
						melancholicCounter++;
					}
				System.out.println("Do you consider yourself rule-oriented?");
				System.out.println("1. yes");
				System.out.println("2. no");
				int answerEight = userInput.nextInt();
				if (answerEight == 1)
					{
						phlegmaticCounter++;
					}	
				System.out.println("Do you consider yourself more bossy or docile?");
				System.out.println("1. Bossy");
				System.out.println("2. Docile");
				int answerNine = userInput.nextInt();
				if (answerNine == 1)
					{
						cholericCounter++;
					}
				if (answerNine == 2)
					{
						phlegmaticCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself to be a nonconformist?");
				System.out.println("1. yes");
				System.out.println("2. no");
				int answerTen = userInput.nextInt();
				if (answerTen == 1)
					{
						phlegmaticCounter++;
					}
				System.out.println("Are you comfortable in a group?");
				System.out.println("1. yes");
				System.out.println("2. no (dislike groups)");
				int answerEleven = userInput.nextInt();
				if (answerEleven == 1)
					{
						sanguineCounter++;
						phlegmaticCounter++;
					}
				if (answerEleven == 2)
					{
						melancholicCounter++;
					}
				System.out.println("Are your spaces well organized and neat?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerTwelve = userInput.nextInt();
				if (answerTwelve == 1)
					{
						melancholicCounter++;
					}
				System.out.println("Are you slow to warm up or do you make friends easily?");
				System.out.println("1. slow to warm up");
				System.out.println("2. make friends easliy ");
				int answerThirteen = userInput.nextInt();
				if (answerThirteen == 1)
					{
						melancholicCounter++;
						phlegmaticCounter++;
					}
				if (answerThirteen == 2)
					{
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself adventurous?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerFourteen = userInput.nextInt();
				if (answerFourteen == 1)
					{
						cholericCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself accepting?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerFifteen = userInput.nextInt();
				if (answerFifteen == 1)
					{
						phlegmaticCounter++;
						sanguineCounter++;
					}
				System.out.println("Do you consider yourself competitive?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerSixteen = userInput.nextInt();
				if (answerSixteen == 1)
					{
						cholericCounter++;
					}
				System.out.println("Do you find yourself drawn to be spiritual?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerEighteen = userInput.nextInt();
				if (answerEighteen == 1)
					{
						melancholicCounter++;
					}
				System.out.println("Are you a private person?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerNineteen = userInput.nextInt();
				if (answerNineteen == 1)
					{
						cholericCounter++;
					}
				System.out.println("Do you end up as a mediator in intense situations?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerTwenty = userInput.nextInt();
				if (answerTwenty == 1)
					{
						cholericCounter++;
					}
				System.out.println("Are you a curious person?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerTwentyOne = userInput.nextInt();
				if (answerTwentyOne == 1)
					{
						sanguineCounter++;
					}
				System.out.println("Are you a critical person?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerTwentyTwo = userInput.nextInt();
				if (answerTwentyTwo == 1)
					{
						melancholicCounter++;
					}
				System.out.println("Are you a focused and intense person?");
				System.out.println("1. yes");
				System.out.println("2. no ");
				int answerTwentyThree = userInput.nextInt();
				if (answerTwentyThree == 1)
					{
						cholericCounter++;
					}
				System.out.println("Do you prefer acknowledgement or encouragement when receiving feedback?");
				System.out.println("1. acknowledgement");
				System.out.println("2. encouragement");
				int answerTwentyFour = userInput.nextInt();
				if (answerTwentyFour == 1)
					{
						cholericCounter++;
					}
				if (answerTwentyFour == 2)
					{
						melancholicCounter++;
						phlegmaticCounter++;
					}
		}
		private static void printStats()
		{
			if ((cholericCounter > phlegmaticCounter) & (cholericCounter > melancholicCounter) & (cholericCounter > sanguineCounter))
				{
					System.out.println(name + ", you have a choleric temperament! \n" + personalityArray[0] + personalityArray[4]);
					 personalityType = "choleric";
				}
			else if ((phlegmaticCounter > cholericCounter) & (phlegmaticCounter > melancholicCounter) & (phlegmaticCounter > sanguineCounter))
				{
					System.out.println(name + ", you have a phlegmatic temperament! \n" + personalityArray[1] + personalityArray[4]);
					 personalityType = "phlegmatic";
				}
			else if ((melancholicCounter > phlegmaticCounter) & (melancholicCounter > cholericCounter) & (melancholicCounter > sanguineCounter))
				{
					System.out.println(name + ", you have a melancolic temperament! \n" + personalityArray[2] + personalityArray[4] );
					 personalityType = "melancholic";
				}
			else if ((sanguineCounter > phlegmaticCounter) & (sanguineCounter > melancholicCounter) & (sanguineCounter > cholericCounter))
				{
					System.out.println(name + ", you have a sanguine temperament! \n" + personalityArray[3] + personalityArray[4]);
					 personalityType = "sanguine";
				}
			else if (cholericCounter == phlegmaticCounter)
				{
					int randomNumber = (int) (Math.random() * 1) +1;
					if (randomNumber == 1)
						{
							System.out.println(name + ", you have a choleric temperament! \n" + personalityArray[0] + personalityArray[4]);
							 personalityType = "choleric";
						}
					if (randomNumber == 2)
						{
							System.out.println(name + ", you have a phlegmatic temperament! \n" + personalityArray[1] + personalityArray[4]);
							 personalityType = "phelgmatic";
						}
				}
			else if (cholericCounter == melancholicCounter)
				{
					int randomNumber = (int) (Math.random() * 1) +1;
					if (randomNumber == 1)
						{
							System.out.println(name + ", you have a choleric temperament! \n" + personalityArray[0] + personalityArray[4]);
							 personalityType = "choleric";
						}
					if (randomNumber == 2)
						{
							System.out.println(name + ", you have a melancholic temperament! \n" + personalityArray[2] + personalityArray[4]);
							 personalityType = "melancholic";
						}
				}
			else if (cholericCounter == sanguineCounter)
				{
					int randomNumber = (int) (Math.random() * 1) +1;
					if (randomNumber == 1)
						{
							System.out.println(name + ", you have a choleric temperament! \n" + personalityArray[0] + personalityArray[4]);
							 personalityType = "choleric";
						}
					if (randomNumber == 2)
						{
							System.out.println(name + ", you have a sanguine temperament! \n" + personalityArray[3] + personalityArray[4]);
							 personalityType = "sanguine";
						}
				}
			else if (melancholicCounter == phlegmaticCounter)
				{
					int randomNumber = (int) (Math.random() * 1) +1;
					if (randomNumber == 1)
						{
							System.out.println(name + ", you have a melancholic temperament! \n" + personalityArray[2] + personalityArray[4]);
							String personalityType = "melancholic";
						}
					if (randomNumber == 2)
						{
							System.out.println(name + ", you have a phlegmatic temperament! \n" + personalityArray[1] + personalityArray[4]);
							String personalityType = "phlegmatic";
						}
				}
			else if (sanguineCounter == phlegmaticCounter)
				{
					int randomNumber = (int) (Math.random() * 1) +1;
					if (randomNumber == 1)
						{
							System.out.println(name + ", you have a sanguine temperament! \n" + personalityArray[3] + personalityArray[4]);
							 personalityType = "sanguine";
						}
					if (randomNumber == 2)
						{
							System.out.println(name + ", you have a phlegmatic temperament! \n" + personalityArray[1] + personalityArray[4]);
							 personalityType = "phlegmatic";
						}
				}
			else if (sanguineCounter == melancholicCounter)
				{
					int randomNumber = (int) (Math.random() * 1) +1;
					if (randomNumber == 1)
						{
							System.out.println(name + ", you have a sanguine temperament! \n" + personalityArray[0] + personalityArray[4] );
							 personalityType = "sanguine";
						}
					if (randomNumber == 2)
						{
							System.out.println(name + ", you have a phlegmatic temperament! /n" + personalityArray[1] + personalityArray[4]);
							 personalityType = "phlegmatic";
						}
				}
			else
				{
					System.out.println(name + ", you are quite the mix! \nYou have " + cholericCounter + " Choleric points, "+ phlegmaticCounter + " phlegmatic points, "  + melancholicCounter + " melancholic points, and " + sanguineCounter + " sanguine points." );
				}
		}
		private static void chooseCareer()
		{
			System.out.println("Let's see if your career choice matches well with your personality");
			Scanner userInput = new Scanner(System.in);
			System.out.println("\n Type in the career choice that appeals most to you.");
			String career = userInput.nextLine();
			if (personalityType.equals ("sanguine"))
				{
					System.out.println(career +" is a wise choice but be sure to honor your sanguine roots by making time to work with people and to find adventure.");
				}
			if (personalityType.equals("melancholic"))
				{
					System.out.println(career +" is a wise choice but be sure to honor your melancholic roots by keeping calm, organized, and by takign time to refelct.");
				}
			if (personalityType.equals("phlegmatic"))
				{
					System.out.println(career +" is a wise choice but be sure to honor your phlegmatic roots by taking time for yourself, and taking time to get to know others.");
				}
			if (personalityType.equals("choleric"))
				{
					System.out.println(career +" is a wise choice but be sure to honor your choleric roots by taking time to think through your many opinions, and by honoring your independent nature.");
				}
			
		
			
		}
		private static void explainTemperamentType()
			{
				personalityArray[0] = "\nA choleric is an extroverted, hot-tempered, quick thinking, active, practical, strong-willed and easily annoyed person. \nCholerics are self-confident, self-sufficient and very independent minded. \nThey are decisive and opinionated and find it easy to make decisions for themselves as well as others. \nCholerics tend to leave little room for negotiating. \nThe Choleric is a visionary and seems to never run out of ideas, plans and goals, which are usually very practical.";
				personalityArray[1] = "\nA phlegmatic is an introverted, calm, unemotional, easygoing, never-get-upset, person. \nPhlegmatics are both slow and indirect when responding to others. \nThey are also slow to warm-up but will be accommodating in the process. \nPhlegmatics are by far the easiest person with which to get along. \nThey live a quiet, routine, life, free of the normal anxieties and stresses of the other temperaments. \nThe Phlegmatic will avoid getting too involved with people and life in general. ";
				personalityArray[2] = "\nA melancholic is an introverted, logical, analytical, factual, private, lets-do-it-right person. \nMelancholics respond to others in a slow, cautious and indirect manner. \nMelancholies are reserved and suspicious until sure of your intentions. \nThe Melancholy probe for the “hidden meaning” behind your words. \nThey are timid and may appear unsure and have a serious expression. \nThey are self-sacrificing, gifted and they tend to be a perfectionist. \nMelancholics are very sensitive to what others think about their work. \nThe Melancholy is well organized";
				personalityArray[3] = "\nA sanguine is an extroverted, fun-loving, activity-prone, impulsive, entertaining, persuasive, easily amused and optimistic person. \nSanguines are receptive and open to others and build relationships quickly. \nThey are animated, excited and accepting of others. \nThey will smile and talk easily and often. \nIt is not unusual to feel as if you have known the Sanguine person for years after only a few minutes. \nSanguines are people-oriented, but easily bored.";
				personalityArray[4] =  "\nDescriptions taken from http://fourtemperaments.com/4-primary-temperaments/\n";
				
			}
	}

//hellooo


































