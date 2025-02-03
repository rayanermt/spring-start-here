
/*
    Country is a data transfer object (DTO) because it models the data transferred between two apps. That is, instances of a Country object are returned by a REST endpoint.
 */

package learnspring.c10ex1rest.models;

public class Country {
    private String name;
    private int population;

//    Factory method for simple instantiation.
    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
