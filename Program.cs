using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task3
{
    public class candidate
    {
        public string name;
        public string cnic;
        public double cgpa;
        public string location;
        public double Project1Marks;
        public double Project2Marks;
        public double ProjectTotalMarks;



    }
    class Program
    {
        static void Main(string[] args)
        {
            var candidate = new List<candidate>()
            {
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Ali Akbar", cnic="1610115218935", cgpa=2.9, location="KPK"}, 
                new candidate(){name=" Jammu Khan", cnic="1610115218935", cgpa=3.4, location="KPK"}, 
                new candidate(){name=" Saad Khan", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid Ali", cnic="1610115218935", cgpa=2.07, location="KPK"},
                new candidate(){name=" Afridi", cnic="1610115218935", cgpa=1.07, location="KPK"}, 
                new candidate(){name=" Shahid khan", cnic="1610115218935", cgpa=3.80, location="KPK"} ,
                new candidate(){name=" Sarfaraz", cnic="1610115218935", cgpa=3.97, location="KPK"} ,
                new candidate(){name=" Gujjar Khan", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=2.97, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Wahif", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Fazal", cnic="1610115218935", cgpa=2.87, location="KPK"} ,
                new candidate(){name=" Raheem", cnic="1610115218935", cgpa=3.17, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.97, location="KPK"} 
            };


            Console.WriteLine("Candidates with their CGPA Greate than 3.00  are : ");
            Random rnd = new Random();
            for (int i = 0; i < candidate.Count; i++)
            {
                if (candidate[i].cgpa >= 3)
                {
                    Console.WriteLine("Candidate names are:  " + candidate[i].name);
                    Console.WriteLine("cnic:  " + candidate[i].cnic);
                    Console.WriteLine("cgpa:  " + candidate[i].cgpa);
                    Console.WriteLine("location" + candidate[i].location);
                    candidate[i].Project1Marks = rnd.Next(80, 101);
                    candidate[i].Project2Marks = rnd.Next(80, 101);
                    candidate[i].ProjectTotalMarks = candidate[i].Project1Marks + candidate[i].Project2Marks;

                    if (candidate[i].ProjectTotalMarks > 180)
                    {
                        Console.WriteLine("Passed");
                    }




                }
            }
            Console.WriteLine("Candidates that had marks above 90% is given by following : ");
            for (int i = 0; i < candidate.Count; i++)
            {
                if (candidate[i].ProjectTotalMarks >= 180)
                {
                    Console.WriteLine("Congratulations Mr.  " + candidate[i].name + "   You have scored above 90% in the projects");

                }
            }
            Console.ReadLine();
        }

    }

}


