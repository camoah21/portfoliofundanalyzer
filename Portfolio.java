package com.realestatefundanalyzer.realestatefundanalyzer;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double totalValue;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Asset> assets;

    // No-argument constructor
    /**
     * The Portfolio function is a constructor for the Portfolio class. It
     * creates an instance of the Portfolio class, which contains a list of
     * stocks and their respective quantities.
     *
     *
     *
     * @return A new portfolio object
     *
     * @docauthor Trelent
     */
    public Portfolio() {
    }

    // Constructor with arguments
    /**
     * The Portfolio function is a constructor for the Portfolio class. It takes
     * in four parameters: assets, id, name and totalValue. The function sets
     * the values of these parameters to their respective fields in the
     * Portfolio class.
     *
     * @param Set&lt;Asset&gt; assets Create a set of assets
     * @param Long id Set the id of the portfolio
     * @param String name Set the name of the portfolio
     * @param double totalValue Set the total value of the portfolio
     *
     * @return A new portfolio object
     *
     * @docauthor Trelent
     */
    public Portfolio(Set<Asset> assets, Long id, String name, double totalValue) {
        this.assets = assets;
        this.id = id;
        this.name = name;
        this.totalValue = totalValue;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }
}
