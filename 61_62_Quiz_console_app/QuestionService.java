import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5]; //array of objects
    String selection[]=new String[5];

    //constructor
    public QuestionService() {

        questions[0] = new Question("4", 1, "2", "6", "4", "8", "Size of int");
        questions[1] = new Question("8", 2, "2", "6", "4", "8", "Size of double");
        questions[2] = new Question("2", 3, "2", "6", "4", "8", "Size of char");
        questions[3] = new Question("8", 4, "2", "6", "4", "8", "Size of long");
        questions[4] = new Question("1", 5, "1", "6", "4", "8", "Size of boolean");
    }

    public void displayQuestions() {
        // System.out.println("in display questions");

        // System.out.println(questions); //[LQuestion;@4517d9a3
        // System.out.println(questions[0]); //null
        // System.out.println(questions[0].getQuestion()); //NullPointerException
        // questions[0] = new Question(); //this is the object of the class Question and not the array of objects 
        // System.out.println(questions[0].getQuestion());
        //print every questions from Question class
        for (Question q : questions) {
            System.out.println(q);
        }

    }

    public void playQuiz() {
        int i=0;
        for (Question q : questions) {
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option 1: " + q.getOpt1());
            System.out.println("Option 2: " + q.getOpt2());
            System.out.println("Option 3: " + q.getOpt3());
            System.out.println("Option 4: " + q.getOpt4());

            //input for ans
            System.out.println("Enter your answer not option no: ");
            Scanner sc=new Scanner(System.in);
            selection[i]=sc.nextLine();
            i++;


        }
        //print entire selection the answers
        for(String s:selection){
            System.out.println(s);
        }
    }
     
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];


            //compare the answer
            if(que.getAnswer().equals(selection[i])){
                score++;
            } 
        }
        System.out.println("Your score is: "+score);
    }
}
