/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t_oster.liblasercut;

import java.util.List;

/**
 *
 * @author thommy
 */
public abstract class LaserCutter
{

  /**
   * Performs sanity checks on the LaserJob and sends it to the Cutter
   * @param job
   * @throws IllegalJobException if the Job didn't pass the SanityCheck
   * @throws Exception  if there is a Problem with the Communication or Queue
   */
  public abstract void sendJob(LaserJob job) throws IllegalJobException, Exception;

  /**
   * Returns the available Resolutions in DPI
   * @return 
   */
  public abstract List<Integer> getResolutions();

  /**
   * Returns the Maximum width of a LaserJob in mm
   * @return 
   */
  public abstract double getBedWidth();

  /**
   * Returns the Maximum height of a LaserJob in mm
   * @return 
   */
  public abstract double getBedHeight();
  
  protected String name = "Unnamed Lasercutter";
  /**
   * Returns the Name of the Lasercutter instance
   * @return 
   */
  public String getName()
  {
    return name;
  }
  
  /**
   * Sets the name of this Lasercutter Instance
   */
  public void setName(String name)
  {
    this.name = name;
  }
}
