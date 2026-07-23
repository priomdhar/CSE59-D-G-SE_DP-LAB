import java.util.Scanner;

class Course {
    String courseName;
    String[] studentNames = new String[100];
    double[] studentMarks = new double[100];

    int count = 0;

    Course(String courseName)
    {
        this.courseName = courseName;
    }

    void addStudent(String name,double marks)
    {
        studentNames[count] = name;
        studentMarks[count] = marks;
        count++;
    }

    String getHighestScorer() 
    {
        int highestIndex = 0;

        for(int i =1 ; i < count; i++)
        {
            if(studentMarks[i] > studentMarks[highestIndex])
            {
                highestIndex = i;
            }
        }
        return studentNames[highestIndex] + "(" + (int)studentMarks[highestIndex] + ")" ;

    }
    
    int countTopGrades(double threshold)
    {
        int total = 0;

        for(int i = 0 ; i<count ; i++)
        {
            if(studentMarks[i] >= threshold)
            {
                total ++;
            }
        }

        return total;
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String courseName = input.next();
        Course course = new Course(courseName);

        while(input.hasNext()){
            String name = input.next();
            if(!input.hasNextDouble())
            break;

            double marks = input.nextDouble();
            course.addStudent(name, marks);


        }

        System.out.println("Highest Scorer : "+ course.getHighestScorer());
        System.out.println("Number pf A+ (80) : " + course.countTopGrades(80));
        
        input.close();
    }
}
