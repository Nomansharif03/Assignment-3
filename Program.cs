using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task1
{
    public class candidate
    {
        public string name;
        public string cnic;
        public double cgpa;
        public string location;


    }
    class Program
    {
        static void Main(string[] args)
        {
            var candidate = new List<candidate>()
            {
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=2.9, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.4, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=2.07, location="KPK"},
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=1.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.80, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.97, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=2.97, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=2.87, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.17, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.97, location="KPK"} 
            };


            Console.WriteLine("Candidates with their CGPA Greate than 3.00  are : ");
            for (int i = 0; i < candidate.Count; i++)
            {
                if (candidate[i].cgpa >= 3)
                {
                    Console.WriteLine("Candidate names are:  " + candidate[i].name);
                    Console.WriteLine("Candidate cnic are:  " + candidate[i].cnic);
                    Console.WriteLine("Candidate cgpa are:  " + candidate[i].cgpa);
                    Console.WriteLine("Candidate location are:  " + candidate[i].location);
                }
            }
            Console.ReadLine();
        }

    }

}


