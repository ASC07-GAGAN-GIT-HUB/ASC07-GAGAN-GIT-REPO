import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class LearnersAnswersMap {
    HashMap<String,String> learnerAnswersmap = new HashMap<>();
    public void assignLearnerAnswers() {
       learnerAnswersmap.put("Maheen", "Private variables cannot be accessed outside the class");
       learnerAnswersmap.put("Gagan", "The main method should always be main, otherwise we will not be able to run the program");
       learnerAnswersmap.put("Khyati", "The HashMap belongs to the java.util package");
       learnerAnswersmap.put("Mavya", "Identified the objects in the program");
       learnerAnswersmap.put("Anjali", "Identified the classes in the program");
       learnerAnswersmap.put("Khyati", "System defined classes: HashMap");
       learnerAnswersmap.put("Charisma", "String Class");
       learnerAnswersmap.put("Vishranthi", "Ordering: Unorder, Insertion Order, Sort Order");
       learnerAnswersmap.put("Swapna", "Fetch the key and value");

       // keys are not ordered in the HashMap
    }

    public void displayLearnerAnswers() {

//        System.out.println("Maheen's answer: " + learnerAnswersmap.get("Maheen"));
//        System.out.println("Gagan's answer: " + learnerAnswersmap.get("Gagan"));
//        System.out.println("Khyati's answer: " + learnerAnswersmap.get("Khyati"));
//        System.out.println("Mavya's answer: " + learnerAnswersmap.get("Mavya"));
//        System.out.println("Anjali's answer: " + learnerAnswersmap.get("Anjali"));

          System.out.println(learnerAnswersmap);

          // provided key display value

        for(String key: learnerAnswersmap.keySet())
        {
            System.out.println(key + ":" + learnerAnswersmap.get(key));
        }

        // for printing the key

        Set<String> learnersSet = learnerAnswersmap.keySet();
        System.out.println(learnersSet);

        // for printing the value

        Collection<String> learnervalues = learnerAnswersmap.values();
        System.out.println(learnervalues);

        // For printing the specific key and value

        String swapnaanswer = learnerAnswersmap.get("Swapna");
        System.out.println(swapnaanswer);

        // Search for a key and display value

//        if(learnerAnswersmap.)

    }
}