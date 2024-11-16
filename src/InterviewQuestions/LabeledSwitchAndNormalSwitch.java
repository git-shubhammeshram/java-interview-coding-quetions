package InterviewQuestions;

public class LabeledSwitchAndNormalSwitch {

/*
	public void checkNormalSwitch(String x){
		String dayType;

		switch (x){
			case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                dayType = "weekday";
                break;
            case "Saturday":
            case "Sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "Invalid day";
		}

        System.out.println("Day Type: " + dayType);

	}

	public void checkLabeledSwitch(String x){
		String dayType = switch (x){
			case "Monday","Tuesday","Wednesday","Thursday","Friday"-> "Weekday";
			case "Saturday","Sunday" -> "Weekend";
			default -> "Invalid";

		};
		System.out.println("DayType: "+dayType);


	}

	public static void main(String[] args) {
		LabeledSwitchAndNormalSwitch lsn = new LabeledSwitchAndNormalSwitch();
        lsn.checkNormalSwitch("Monday");
        lsn.checkLabeledSwitch("Monday");
	}
*/
/*

	public static void normalSwitchCase(String normal){
		String dayType;

		switch(normal){
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				dayType ="Weekday";
				break;
			case "Saturday":
			case "Sunday":
				dayType = "Weekend";
                break;
            default:
				dayType = "Invalid day";
		}
		System.out.println("Day Type: " + dayType);
	}

	public static void labeledSwitchCase(String labeled){
		String dayType = switch(labeled){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> "Weekday";
            case "Saturday","Sunday" -> "Weekend";
            default -> "Invalid";
        };
        System.out.println("Day Type: " + dayType);
	}
*/





	/* Write a program to find out is it weekend or weekdays*/
































}
