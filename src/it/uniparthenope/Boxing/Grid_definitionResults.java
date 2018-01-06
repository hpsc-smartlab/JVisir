package it.uniparthenope.Boxing;

import java.util.ArrayList;

public class Grid_definitionResults {
    private double[][] xy;
    private double[][] xg;
    private double[][] yg;
    private double[] xg_array;
    private double[] yg_array;
    private double[][] xy_DB;
    private ArrayList<Double> lat_bathy_Inset;
    private ArrayList<Double> lon_bathy_Inset;
    private double[][] bathy_Inset;
    private double[][] lsm_mask;
    private double[][] J_mask;
    private ArrayList<Double> x_islands;
    private ArrayList<Double> y_islands;
    private ArrayList<Double> x_continent;
    private ArrayList<Double> y_continent;
    private double estGdtDist;

    public double[][] getXy() {
        return xy;
    }

    public void setXy(double[][] xy) {
        this.xy = xy;
    }

    public double[][] getXg() {
        return xg;
    }

    public void setXg(double[][] xg) {
        this.xg = xg;
    }

    public double[][] getYg() {
        return yg;
    }

    public void setYg(double[][] yg) {
        this.yg = yg;
    }

    public double[] getXg_array() {
        return xg_array;
    }

    public void setXg_array(double[] xg_array) {
        this.xg_array = xg_array;
    }

    public double[] getYg_array() {
        return yg_array;
    }

    public void setYg_array(double[] yg_array) {
        this.yg_array = yg_array;
    }

    public double[][] getXy_DB() {
        return xy_DB;
    }

    public void setXy_DB(double[][] xy_DB) {
        this.xy_DB = xy_DB;
    }

    public ArrayList<Double> getLat_bathy_Inset() {
        return lat_bathy_Inset;
    }

    public void setLat_bathy_Inset(ArrayList<Double> lat_bathy_Inset) {
        this.lat_bathy_Inset = lat_bathy_Inset;
    }

    public ArrayList<Double> getLon_bathy_Inset() {
        return lon_bathy_Inset;
    }

    public void setLon_bathy_Inset(ArrayList<Double> lon_bathy_Inset) {
        this.lon_bathy_Inset = lon_bathy_Inset;
    }

    public double[][] getBathy_Inset() {
        return bathy_Inset;
    }

    public void setBathy_Inset(double[][] bathy_Inset) {
        this.bathy_Inset = bathy_Inset;
    }

    public double[][] getLsm_mask() {
        return lsm_mask;
    }

    public void setLsm_mask(double[][] lsm_mask) {
        this.lsm_mask = lsm_mask;
    }

    public double[][] getJ_mask() {
        return J_mask;
    }

    public void setJ_mask(double[][] j_mask) {
        J_mask = j_mask;
    }

    public ArrayList<Double> getX_islands() {
        return x_islands;
    }

    public void setX_islands(ArrayList<Double> x_islands) {
        this.x_islands = x_islands;
    }

    public ArrayList<Double> getY_islands() {
        return y_islands;
    }

    public void setY_islands(ArrayList<Double> y_islands) {
        this.y_islands = y_islands;
    }

    public ArrayList<Double> getX_continent() {
        return x_continent;
    }

    public void setX_continent(ArrayList<Double> x_continent) {
        this.x_continent = x_continent;
    }

    public ArrayList<Double> getY_continent() {
        return y_continent;
    }

    public void setY_continent(ArrayList<Double> y_continent) {
        this.y_continent = y_continent;
    }

    public double getEstGdtDist() {
        return estGdtDist;
    }

    public void setEstGdtDist(double estGdtDist) {
        this.estGdtDist = estGdtDist;
    }
}
