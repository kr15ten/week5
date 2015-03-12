package za.ac.cput.kristen.week5.CreationalPatterns.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.kristen.week5.CreationalPatterns.AbstractMethod.*;
import za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern.Artist;
import za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern.IBuilder;
import za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern.Lipstick;
import za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern.Makeup;
import za.ac.cput.kristen.week5.CreationalPatterns.FactoryMethod.IStudent;
import za.ac.cput.kristen.week5.CreationalPatterns.FactoryMethod.StudentFactory;
import za.ac.cput.kristen.week5.CreationalPatterns.Prototype.*;
import za.ac.cput.kristen.week5.CreationalPatterns.Singleton.Person;

/**
 * Created by kris on 3/5/15.
 */

@Configuration
public class AppConfig
{
    @Bean(name = "person")
    public Person getPerson()
    {
        return Person.getInstance();
    }

    @Bean(name = "partTimeStudent")
    public IStudent getPartTimeStudent()
    {
        return StudentFactory.getStudent("Part time");
    }

    @Bean(name = "fullTimeStudent")
    public IStudent getFullTimeStudent()
    {
        return StudentFactory.getStudent("Full time");
    }

    @Bean(name = "package1item")
    public IItem getPackage1Item()
    {
        return PackageFactory.getInstance().getItem();
    }

    @Bean(name = "package2item")
    public IItem getPackage2Item()
    {
        return Package2Factory.getInstance().getItem();
    }

    @Bean(name = "package1service")
    public IService getPackage1Service()
    {
        return PackageFactory.getInstance().getService();
    }

    @Bean(name = "lipstick")
    public IBuilder getMakeup()
    {
        return new Lipstick();
    }

    @Bean(name = "personOne")
    public ICopy getCopy()
    {
        return new za.ac.cput.kristen.week5.CreationalPatterns.Prototype.Person("Sarah", "blonde", 5);
    }
}
