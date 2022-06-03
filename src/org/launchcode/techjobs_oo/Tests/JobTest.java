package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void testSettingJobId() {
      Job aJob = new Job();

      assertNotNull(aJob.getId());
    }

    @Test
    public void testJobIdsAreDifferent() {
        Job aJob1 = new Job();
        Job aJob2 = new Job();

        assertNotEquals(aJob1.getId(), aJob2.getId());
        assertEquals(aJob1.getId() +1, aJob2.getId());


    }

   @Test
    public void testJobConstructorSetsAllFields() {

       Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       assertEquals(String.class, aJob.getName().getClass());
       assertEquals(Employer.class, aJob.getEmployer().getClass());
       assertEquals(Location.class, aJob.getLocation().getClass());
       assertEquals(PositionType.class, aJob.getPositionType().getClass());
       assertEquals(CoreCompetency.class, aJob.getCoreCompetency().getClass());


       assertEquals(aJob.getName(), "Product tester");
       assertEquals(aJob.getEmployer().getValue(), "ACME");
       assertEquals(aJob.getLocation().getValue(), "Desert");
       assertEquals(aJob.getPositionType().getValue(), "Quality control");
       assertEquals(aJob.getCoreCompetency().getValue(), "Persistence");
   }

   @Test
    public void testJobsForEquality() {

        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality Control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        Job aJob1 = new Job("Title Job", employer, location, positionType, coreCompetency);
        Job aJob2 = new Job("Title Job", employer, location, positionType, coreCompetency);

        assertTrue(aJob1.equals(aJob2));
   }

   @Test
    public void  testToStringStartsAndEndsWithNewLine() {

       Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       assertEquals("ID:  5\n" +
               "Name: Product tester\n" +
               "Employer: ACME\n" +
               "Location: Desert\n" +
               "Position Type: Quality control\n" +
               "Core Competency: Persistence\n", aJob.toString());


   }
   @Test

    public void testToStringHandlesEmptyField() {
        Job aJob = new Job();

       assertEquals("ID:  8\n" +
               "Name: Data Not Available\n" +
               "Employer: Data Not Available\n" +
               "Location: Data Not Available\n" +
               "Position Type: Data Not Available\n" +
               "Core Competency: Data Not Available\n", aJob.toString());
   }

}
