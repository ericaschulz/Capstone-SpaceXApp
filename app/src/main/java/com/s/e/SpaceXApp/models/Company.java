package com.s.e.SpaceXApp.models;

import androidx.room.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity (tableName = "Company")

public class Company {

    @SerializedName("headquarters")
    @Expose
    private Headquarters headquarters;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("founder")
    @Expose
    private String founder;
    @SerializedName("founded")
    @Expose
    private Integer founded;
    @SerializedName("employees")
    @Expose
    private Integer employees;
    @SerializedName("vehicles")
    @Expose
    private Integer vehicles;
    @SerializedName("launch_sites")
    @Expose
    private Integer launchSites;
    @SerializedName("test_sites")
    @Expose
    private Integer testSites;
    @SerializedName("ceo")
    @Expose
    private String ceo;
    @SerializedName("cto")
    @Expose
    private String cto;
    @SerializedName("coo")
    @Expose
    private String coo;
    @SerializedName("cto_propulsion")
    @Expose
    private String ctoPropulsion;
    @SerializedName("valuation")
    @Expose
    private Integer valuation;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("id")
    @Expose
    private String id;

    public Headquarters getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Headquarters headquarters) {
        this.headquarters = headquarters;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Integer getFounded() {
        return founded;
    }

    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public Integer getVehicles() {
        return vehicles;
    }

    public void setVehicles(Integer vehicles) {
        this.vehicles = vehicles;
    }

    public Integer getLaunchSites() {
        return launchSites;
    }

    public void setLaunchSites(Integer launchSites) {
        this.launchSites = launchSites;
    }

    public Integer getTestSites() {
        return testSites;
    }

    public void setTestSites(Integer testSites) {
        this.testSites = testSites;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCto() {
        return cto;
    }

    public void setCto(String cto) {
        this.cto = cto;
    }

    public String getCoo() {
        return coo;
    }

    public void setCoo(String coo) {
        this.coo = coo;
    }

    public String getCtoPropulsion() {
        return ctoPropulsion;
    }

    public void setCtoPropulsion(String ctoPropulsion) {
        this.ctoPropulsion = ctoPropulsion;
    }

    public Integer getValuation() {
        return valuation;
    }

    public void setValuation(Integer valuation) {
        this.valuation = valuation;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public class Headquarters {

        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("state")
        @Expose
        private String state;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }


        public class Links {

            @SerializedName("website")
            @Expose
            private String website;
            @SerializedName("flickr")
            @Expose
            private String flickr;
            @SerializedName("twitter")
            @Expose
            private String twitter;
            @SerializedName("elon_twitter")
            @Expose
            private String elonTwitter;

            public String getWebsite() {
                return website;
            }

            public void setWebsite(String website) {
                this.website = website;
            }

            public String getFlickr() {
                return flickr;
            }

            public void setFlickr(String flickr) {
                this.flickr = flickr;
            }

            public String getTwitter() {
                return twitter;
            }

            public void setTwitter(String twitter) {
                this.twitter = twitter;
            }

            public String getElonTwitter() {
                return elonTwitter;
            }

            public void setElonTwitter(String elonTwitter) {
                this.elonTwitter = elonTwitter;
            }


        }
    }
}
