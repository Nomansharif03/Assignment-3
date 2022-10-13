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
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"},
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"}, 
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} ,
                new candidate(){name=" Shahid", cnic="1610115218935", cgpa=3.07, location="KPK"} 
            };

                
                Console.WriteLine("Interested Candidates with their data are : ");
                for(int i=0;i<candidate.Count;i++)
                {
                    Console.WriteLine("Candidate names are:  "+ candidate[i].name);
                    Console.WriteLine("Candidate cnic are:  " + candidate[i].cnic);
                    Console.WriteLine("Candidate cgpa are:  " + candidate[i].cgpa);
                    Console.WriteLine("Candidate location are:  " + candidate[i].location);

                }
            Console.ReadLine();
            }
     
        }
    
    }


