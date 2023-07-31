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
package com.oat.experimenter.gui.entry;

import com.oat.gui.SplashWindow;

/**
 * Type: Main<br/>
 * Date: 02/12/2006<br/>
 * <br/>
 * Description: Primary Entry Point
 * <br/>
 * @author Jason Brownlee
 * 
 * <pre>
 * Change History
 * ----------------------------------------------------------------------------
 * 
 * </pre>
 */
public class ExperimenterMain
{
    /**
     * Entry Point
     * @param args
     */
    public static void main(String[] args)
    {
        SplashWindow.splash(ExperimenterMain.class.getResource("/splash.jpg"));
        SplashWindow.invokeMain("com.oat.experimenter.gui.entry.ExperimenterFrame", args);
        SplashWindow.disposeSplash();
    }
}