public class student {
    public void stud_det()
    {
        String name = "Sami";
        String prg = "BCA";
        String dept = "MCA";
        String[] course={"DevOps","Machine Learning","C#"};
        System.out.println("Name of the Student is = "+name);
        System.out.println("Program of the student is = "+prg);
        System.out.println("Department of the student is = "+dept);
        for (int i=0;i<course.length;i++){

            System.out.println(course[i]);
        }
 
         }
    }
     class Stud_Course extends student {
        public void course()
        {
            String[] subjects = {"DevOps", "Machine Learning", "C#"};
            int[][] marks = {
                {50, 30, 60}
                
            };
    
            // Assuming each row represents a student and each column represents a subject
            for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks[i].length; j++) {
                    if (marks[i][j] < 40) {
                        System.out.println("Sami" + (i +1) + " scored less than 40 in the  " + subjects[j]);
                    }
                }     
            }
            }
        public static void main(String args[])
        {
            Stud_Course sc = new Stud_Course();
            sc.stud_det();
            sc.course();
            
        }
    }
    // rm -fr .git
