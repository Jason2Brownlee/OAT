/*
Optimization Algorithm Toolkit (OAT)
http://sourceforge.net/projects/optalgtoolkit
Copyright (C) 2006  Jason Brownlee

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.oat.domains.cfo.problems.mahfoud;

import com.oat.domains.cfo.CFOProblem;

/**
 * Type: M1<br/>
 * Date: 16/05/2006<br/>
 * <br/>
 * Description: Niching Methods for Genetic Algorithms (Mahfoud) (1995)
 * <br/>
 * @author Daniel Angus
 * 
 * <pre>
 * Change History
 * ----------------------------------------------------------------------------
 * 
 * </pre>
 */
public class M1 extends CFOProblem
{
    public M1()
    {
        setDimensions(1);
    }

    @Override
    protected double problemSpecificCost(double[] v)
    { 
        return Math.pow(Math.sin(5.0*Math.PI*v[0]), 6.0);
    }

    @Override
    public String getName()
    {
        return "M1";
    }

    @Override
    public boolean isMinimization()
    {
        return false;
    }

    @Override
    protected double[][] preapreMinMax()
    {
       return new double[][]{{0.0,1.0}};
    }

    @Override
    protected double[][] preapreOptima()
    {      
    	return new double[][]{{0.1}, {0.3}, {0.5}, {0.7}, {0.9}};
    }
    
    @Override
    public SUPPORTED_DIMENSIONS [] getSupportDimensionality()
    {
        return new SUPPORTED_DIMENSIONS[]{SUPPORTED_DIMENSIONS.ONE_DIMENSIONAL};
    }
}
