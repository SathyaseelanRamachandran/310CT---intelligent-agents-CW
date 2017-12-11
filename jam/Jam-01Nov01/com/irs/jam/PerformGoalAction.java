//  -*- Mode: Java -*-
//////////////////////////////////////////////////////////////////////////////
//  
//  $Id: PerformGoalAction.java,v 1.2 1998/11/04 17:57:41 marcush Exp marcush $
//  $Source: C:\\com\\irs\\jam\\RCS\\PerformGoalAction.java,v $
//  
//  File              : PerformGoalAction.java
//  Original author(s): Marcus J. Huber <marcush@heron.eecs.umich.edu>
//                    : Jaeho Lee <jaeho@heron.eecs.umich.edu>
//  Created On        : Tue Sep 30 14:23:08 1997
//  Last Modified By  : marcush <marcush@irs.home.com>
//  Last Modified On  : Tue Jul 27 13:31:30 1999
//  Update Count      : 15
//  
//////////////////////////////////////////////////////////////////////////////
//
//  JAM agent architecture
//
//  Copyright (C) 1997 Marcus J. Huber and Jaeho Lee.
//  Copyright (C) 1997-1999 Intelligent Reasoning Systems
//  
//  Permission is granted to copy and redistribute this software so long
//  as no fee is charged, and so long as the copyright notice above, this
//  grant of permission, and the disclaimer below appear in all copies
//  made.  JAM may not be bundled, or sold alone or as part of another
//  product, without permission.
//  
//  This software is provided as is, without representation as to its
//  fitness for any purpose, and without warranty of any kind, either
//  express or implied, including without limitation the implied
//  warranties of merchantability and fitness for a particular purpose.
//  Marcus J. Huber, Jaeho Lee and Intelligent Reasoning Systems shall
//  not be liable for any damages, including special, indirect,
//  incidental, or consequential damages, with respect to any claim
//  arising out of or in connection with the use of the software, even
//  if they have been or are hereafter advised of the possibility of
//  such damages.
// 
//////////////////////////////////////////////////////////////////////////////

package com.irs.jam;

import java.io.*;

/**
 *
 * A built-in JAM primitive action for performment subgoaling.
 *
 * @author Marc Huber
 * @author Jaeho Lee
 *
 **/

public class PerformGoalAction extends GoalAction implements Serializable
{
  //
  // Members
  //

  //
  // Constructors
  //

  /**
   * Primary constructor
   * 
   */
  public PerformGoalAction(String name, Relation goal, Expression utility,
			   ExpList by, ExpList notBy,
			   Interpreter interpreter)
  {
    super(name, goal, utility, by, notBy, interpreter);
    _actType = ACT_PERFORM;
  }

  //
  // Member functions
  //
  public boolean	isExecutableAction()	{ return false; }
  //  public int		getType()		{ return ACT_PERFORM; }

  /**
   * Display information about the goal
   * 
   */
  public void		format(PrintStream s, Binding b)
  {
    formatArgs(s, b, "PERFORM ", ";");
  }

}
