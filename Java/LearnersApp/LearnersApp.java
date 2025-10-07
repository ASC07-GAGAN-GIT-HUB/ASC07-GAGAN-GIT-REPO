public class LearnersApp {
    public static void main(String[] args) {

        // WorkingwithArrays();
        WorkingwithMaps();
    }

    private static void WorkingwithMaps() {
        LearnersAnswersMap learnerAnswers = new LearnersAnswersMap();
        learnerAnswers.assignLearnerAnswers();
        learnerAnswers.displayLearnerAnswers();
    }

    private static void WorkingwithArrays() {
        LearnersArrayData learnerData = new LearnersArrayData();
        learnerData.assignLearnerNames();
        learnerData.printLearnerNames();
    }
}