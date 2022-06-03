package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Job)) return false;
        Job aJob = (Job) o;
        boolean sameName = this.name.equals(aJob.name);
        boolean sameEmployer = this.employer.equals(aJob.employer);
        boolean sameLocation = this.location.equals(aJob.location);
        boolean samePositionType = this.positionType.equals(aJob.positionType);
        boolean sameCoreCompetency = this.coreCompetency.equals(aJob.coreCompetency);

        if (sameName && sameEmployer && sameLocation && samePositionType && sameCoreCompetency ) {
            return true;
        } else {
            return false;
        }

    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
            return Objects.hash(getId());
        }

    public String getName() {
        return name;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String name = this.getName() == null ? "Data Not Available" : this.getName();
        String employer = this.getEmployer() == null ? "Data Not Available" : this.getEmployer().getValue();
        String location = this.getLocation() == null ? "Data Not Available" : this.getLocation().getValue();
        String positionType = this.getPositionType() == null ? "Data Not Available" : this.getPositionType().getValue();
        String coreCompetency = this.getCoreCompetency() == null ? "Data Not Available" : this.getCoreCompetency().getValue();
        return "ID:  " + this.getId() + "\n" +
                "Name: " +  name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }

}
