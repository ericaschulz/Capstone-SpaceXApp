package com.s.e.SpaceXApp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Ships {

        @SerializedName("legacy_id")
        @Expose
        private Object legacyId;
        @SerializedName("model")
        @Expose
        private Object model;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("roles")
        @Expose
        private List<String> roles = null;
        @SerializedName("imo")
        @Expose
        private Integer imo;
        @SerializedName("mmsi")
        @Expose
        private Integer mmsi;
        @SerializedName("abs")
        @Expose
        private Integer abs;
        @SerializedName("class")
        @Expose
        private Integer _class;
        @SerializedName("mass_kg")
        @Expose
        private Integer massKg;
        @SerializedName("mass_lbs")
        @Expose
        private Integer massLbs;
        @SerializedName("year_built")
        @Expose
        private Integer yearBuilt;
        @SerializedName("home_port")
        @Expose
        private String homePort;
        @SerializedName("status")
        @Expose
        private Object status;
        @SerializedName("speed_kn")
        @Expose
        private Object speedKn;
        @SerializedName("course_deg")
        @Expose
        private Object courseDeg;
        @SerializedName("latitude")
        @Expose
        private Object latitude;
        @SerializedName("longitude")
        @Expose
        private Object longitude;
        @SerializedName("last_ais_update")
        @Expose
        private Object lastAisUpdate;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("launches")
        @Expose
        private List<String> launches = null;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("active")
        @Expose
        private Boolean active;
        @SerializedName("id")
        @Expose
        private String id;

        public Object getLegacyId() {
            return legacyId;
        }

        public void setLegacyId(Object legacyId) {
            this.legacyId = legacyId;
        }

        public Object getModel() {
            return model;
        }

        public void setModel(Object model) {
            this.model = model;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        public Integer getImo() {
            return imo;
        }

        public void setImo(Integer imo) {
            this.imo = imo;
        }

        public Integer getMmsi() {
            return mmsi;
        }

        public void setMmsi(Integer mmsi) {
            this.mmsi = mmsi;
        }

        public Integer getAbs() {
            return abs;
        }

        public void setAbs(Integer abs) {
            this.abs = abs;
        }

        public Integer getClass_() {
            return _class;
        }

        public void setClass_(Integer _class) {
            this._class = _class;
        }

        public Integer getMassKg() {
            return massKg;
        }

        public void setMassKg(Integer massKg) {
            this.massKg = massKg;
        }

        public Integer getMassLbs() {
            return massLbs;
        }

        public void setMassLbs(Integer massLbs) {
            this.massLbs = massLbs;
        }

        public Integer getYearBuilt() {
            return yearBuilt;
        }

        public void setYearBuilt(Integer yearBuilt) {
            this.yearBuilt = yearBuilt;
        }

        public String getHomePort() {
            return homePort;
        }

        public void setHomePort(String homePort) {
            this.homePort = homePort;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public Object getSpeedKn() {
            return speedKn;
        }

        public void setSpeedKn(Object speedKn) {
            this.speedKn = speedKn;
        }

        public Object getCourseDeg() {
            return courseDeg;
        }

        public void setCourseDeg(Object courseDeg) {
            this.courseDeg = courseDeg;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public Object getLastAisUpdate() {
            return lastAisUpdate;
        }

        public void setLastAisUpdate(Object lastAisUpdate) {
            this.lastAisUpdate = lastAisUpdate;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<String> getLaunches() {
            return launches;
        }

        public void setLaunches(List<String> launches) {
            this.launches = launches;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }





