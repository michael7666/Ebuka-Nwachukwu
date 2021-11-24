package readtrafficcs;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.presentation.UtilitiesDrawing.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.presentation.*;

import com.anylogic.libraries.road.*;
import com.anylogic.libraries.processmodeling.*;

import java.awt.geom.Arc2D;

 

public class Main extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    if (elementDesciptors_xjal == null) {
      elementDesciptors_xjal = createElementDescriptors(super.getElementDesciptors(), Main.class);
    }
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 4.0 );

  @Override
  public Scale getScale() {
    return scale;
  }

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final short _STATECHART_ELEMENT_NEXT_ID_xjal = 0;
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Embedded Objects

 
  public com.anylogic.libraries.road.CarSource<
Agent 
> carSource;
 
  public com.anylogic.libraries.road.CarMoveTo<
Agent 
> carMoveTo;
 
  public com.anylogic.libraries.road.CarDispose<
Agent 
> carDispose;
 
  public com.anylogic.libraries.road.CarSource<
Agent 
> carSource1;
 
  public com.anylogic.libraries.road.CarMoveTo<
Agent 
> carMoveTo1;
 
  public com.anylogic.libraries.road.CarSource<
Agent 
> carSource2;
 
  public com.anylogic.libraries.processmodeling.SelectOutput5<
Agent 
> selectOutput5;
 
  public com.anylogic.libraries.road.CarMoveTo<
Agent 
> carMoveTo2;
 
  public com.anylogic.libraries.road.CarMoveTo<
Agent 
> carMoveTo3;
 
  public com.anylogic.libraries.road.CarMoveTo<
Agent 
> carMoveTo4;

  public String getNameOf( Agent ao ) {
    if ( ao == carSource ) return "carSource";
    if ( ao == carMoveTo ) return "carMoveTo";
    if ( ao == carDispose ) return "carDispose";
    if ( ao == carSource1 ) return "carSource1";
    if ( ao == carMoveTo1 ) return "carMoveTo1";
    if ( ao == carSource2 ) return "carSource2";
    if ( ao == selectOutput5 ) return "selectOutput5";
    if ( ao == carMoveTo2 ) return "carMoveTo2";
    if ( ao == carMoveTo3 ) return "carMoveTo3";
    if ( ao == carMoveTo4 ) return "carMoveTo4";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarSource<Agent> instantiate_carSource_xjal() {
    com.anylogic.libraries.road.CarSource<Agent> _result_xjal = new com.anylogic.libraries.road.CarSource<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double interarrivalTime(  ) {
        return _carSource_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _carSource_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _carSource_arrivalDate_xjal( this );
      }
      @Override
      public Road road( Agent car ) {
        return _carSource_road_xjal( this, car );
      }
      @Override
      public int laneIndex( Agent car ) {
        return _carSource_laneIndex_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carSource_parkingLot_xjal( this, car );
      }
      @Override
      public Agent newCar(  ) {
        return _carSource_newCar_xjal( this );
      }
      @Override
      public double length( Agent car ) {
        return _carSource_length_xjal( this, car );
      }
      @Override
      public double initialSpeed( Agent car ) {
        return _carSource_initialSpeed_xjal( this, car );
      }
      @Override
      public double preferredSpeed( Agent car ) {
        return _carSource_preferredSpeed_xjal( this, car );
      }
      @Override
      public double maxAcceleration( Agent car ) {
        return _carSource_maxAcceleration_xjal( this, car );
      }
      @Override
      public double maxDeceleration( Agent car ) {
        return _carSource_maxDeceleration_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carSource_onExit_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carSource_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    setupParameters_carSource_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource_xjal( com.anylogic.libraries.road.CarSource<Agent> self ) {
    create_carSource_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carSource_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
    self.arrivalType = 
self.RATE 
;
    self.rate = 
1000 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.appears = 
self.ON_ROAD 
;
    self.laneDirection = 
self.FORWARD_LANE 
;
    self.isRandomLane = 
true 
;
    self.addCarToCustomPopulation = 
false 
;
    self.carPopulation = 
 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource_xjal( com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Road road( Agent car ) {
        return _carMoveTo_road_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carMoveTo_parkingLot_xjal( this, car );
      }
      @Override
      public StopLine stopLine( Agent car ) {
        return _carMoveTo_stopLine_xjal( this, car );
      }
      @Override
      public BusStop busStop( Agent car ) {
        return _carMoveTo_busStop_xjal( this, car );
      }
      @Override
      public void onEnter( Agent car ) {
        _carMoveTo_onEnter_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carMoveTo_onExit_xjal( this, car );
      }
      @Override
      public void onWayNotFound( Agent car ) {
        _carMoveTo_onWayNotFound_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    setupParameters_carMoveTo_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    create_carMoveTo_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.movesTo = 
self.ROAD 
;
    self.destination = 
self.END_OF_FORWARD_LANE 
;
    self.stopLineBehavior = 
self.PASS_THROUGH_STOP_LINE 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarDispose<Agent> instantiate_carDispose_xjal() {
    com.anylogic.libraries.road.CarDispose<Agent> _result_xjal = new com.anylogic.libraries.road.CarDispose<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Agent car ) {
        _carDispose_onEnter_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carDispose_xjal( final com.anylogic.libraries.road.CarDispose<Agent> self ) {
    setupParameters_carDispose_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carDispose_xjal( com.anylogic.libraries.road.CarDispose<Agent> self ) {
    create_carDispose_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carDispose_xjal( final com.anylogic.libraries.road.CarDispose<Agent> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carDispose_xjal( com.anylogic.libraries.road.CarDispose<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarSource<Agent> instantiate_carSource1_xjal() {
    com.anylogic.libraries.road.CarSource<Agent> _result_xjal = new com.anylogic.libraries.road.CarSource<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double interarrivalTime(  ) {
        return _carSource1_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _carSource1_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _carSource1_arrivalDate_xjal( this );
      }
      @Override
      public Road road( Agent car ) {
        return _carSource1_road_xjal( this, car );
      }
      @Override
      public int laneIndex( Agent car ) {
        return _carSource1_laneIndex_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carSource1_parkingLot_xjal( this, car );
      }
      @Override
      public Agent newCar(  ) {
        return _carSource1_newCar_xjal( this );
      }
      @Override
      public double length( Agent car ) {
        return _carSource1_length_xjal( this, car );
      }
      @Override
      public double initialSpeed( Agent car ) {
        return _carSource1_initialSpeed_xjal( this, car );
      }
      @Override
      public double preferredSpeed( Agent car ) {
        return _carSource1_preferredSpeed_xjal( this, car );
      }
      @Override
      public double maxAcceleration( Agent car ) {
        return _carSource1_maxAcceleration_xjal( this, car );
      }
      @Override
      public double maxDeceleration( Agent car ) {
        return _carSource1_maxDeceleration_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carSource1_onExit_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carSource1_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    setupParameters_carSource1_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource1_xjal( com.anylogic.libraries.road.CarSource<Agent> self ) {
    create_carSource1_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carSource1_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
    self.arrivalType = 
self.RATE 
;
    self.rate = 
1000 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.appears = 
self.ON_ROAD 
;
    self.laneDirection = 
self.FORWARD_LANE 
;
    self.isRandomLane = 
true 
;
    self.addCarToCustomPopulation = 
false 
;
    self.carPopulation = 
 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource1_xjal( com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo1_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Road road( Agent car ) {
        return _carMoveTo1_road_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carMoveTo1_parkingLot_xjal( this, car );
      }
      @Override
      public StopLine stopLine( Agent car ) {
        return _carMoveTo1_stopLine_xjal( this, car );
      }
      @Override
      public BusStop busStop( Agent car ) {
        return _carMoveTo1_busStop_xjal( this, car );
      }
      @Override
      public void onEnter( Agent car ) {
        _carMoveTo1_onEnter_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carMoveTo1_onExit_xjal( this, car );
      }
      @Override
      public void onWayNotFound( Agent car ) {
        _carMoveTo1_onWayNotFound_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo1_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    setupParameters_carMoveTo1_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo1_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    create_carMoveTo1_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo1_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.movesTo = 
self.ROAD 
;
    self.destination = 
self.END_OF_FORWARD_LANE 
;
    self.stopLineBehavior = 
self.PASS_THROUGH_STOP_LINE 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo1_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarSource<Agent> instantiate_carSource2_xjal() {
    com.anylogic.libraries.road.CarSource<Agent> _result_xjal = new com.anylogic.libraries.road.CarSource<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double interarrivalTime(  ) {
        return _carSource2_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _carSource2_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _carSource2_arrivalDate_xjal( this );
      }
      @Override
      public Road road( Agent car ) {
        return _carSource2_road_xjal( this, car );
      }
      @Override
      public int laneIndex( Agent car ) {
        return _carSource2_laneIndex_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carSource2_parkingLot_xjal( this, car );
      }
      @Override
      public Agent newCar(  ) {
        return _carSource2_newCar_xjal( this );
      }
      @Override
      public double length( Agent car ) {
        return _carSource2_length_xjal( this, car );
      }
      @Override
      public double initialSpeed( Agent car ) {
        return _carSource2_initialSpeed_xjal( this, car );
      }
      @Override
      public double preferredSpeed( Agent car ) {
        return _carSource2_preferredSpeed_xjal( this, car );
      }
      @Override
      public double maxAcceleration( Agent car ) {
        return _carSource2_maxAcceleration_xjal( this, car );
      }
      @Override
      public double maxDeceleration( Agent car ) {
        return _carSource2_maxDeceleration_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carSource2_onExit_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carSource2_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    setupParameters_carSource2_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource2_xjal( com.anylogic.libraries.road.CarSource<Agent> self ) {
    create_carSource2_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carSource2_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
    self.arrivalType = 
self.RATE 
;
    self.rate = 
1000 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.appears = 
self.ON_ROAD 
;
    self.laneDirection = 
self.FORWARD_LANE 
;
    self.isRandomLane = 
true 
;
    self.addCarToCustomPopulation = 
false 
;
    self.carPopulation = 
 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource2_xjal( com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput5<Agent> instantiate_selectOutput5_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput5<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput5<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition1( Agent agent ) {
        return _selectOutput5_condition1_xjal( this, agent );
      }
      @Override
      public boolean condition2( Agent agent ) {
        return _selectOutput5_condition2_xjal( this, agent );
      }
      @Override
      public boolean condition3( Agent agent ) {
        return _selectOutput5_condition3_xjal( this, agent );
      }
      @Override
      public boolean condition4( Agent agent ) {
        return _selectOutput5_condition4_xjal( this, agent );
      }
      @Override
      public double probability1( Agent agent ) {
        return _selectOutput5_probability1_xjal( this, agent );
      }
      @Override
      public double probability2( Agent agent ) {
        return _selectOutput5_probability2_xjal( this, agent );
      }
      @Override
      public double probability3( Agent agent ) {
        return _selectOutput5_probability3_xjal( this, agent );
      }
      @Override
      public double probability4( Agent agent ) {
        return _selectOutput5_probability4_xjal( this, agent );
      }
      @Override
      public double probability5( Agent agent ) {
        return _selectOutput5_probability5_xjal( this, agent );
      }
      @Override
      public int exitNumber( Agent agent ) {
        return _selectOutput5_exitNumber_xjal( this, agent );
      }
      @Override
      public void onEnter( Agent agent ) {
        _selectOutput5_onEnter_xjal( this, agent );
      }
      @Override
      public void onExit1( Agent agent ) {
        _selectOutput5_onExit1_xjal( this, agent );
      }
      @Override
      public void onExit2( Agent agent ) {
        _selectOutput5_onExit2_xjal( this, agent );
      }
      @Override
      public void onExit3( Agent agent ) {
        _selectOutput5_onExit3_xjal( this, agent );
      }
      @Override
      public void onExit4( Agent agent ) {
        _selectOutput5_onExit4_xjal( this, agent );
      }
      @Override
      public void onExit5( Agent agent ) {
        _selectOutput5_onExit5_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_selectOutput5_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self ) {
    setupParameters_selectOutput5_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_selectOutput5_xjal( com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self ) {
    create_selectOutput5_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_selectOutput5_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, TableInput _t ) {
    self.type = 
self.TYPE_PROBABILITIES 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_selectOutput5_xjal( com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo2_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Road road( Agent car ) {
        return _carMoveTo2_road_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carMoveTo2_parkingLot_xjal( this, car );
      }
      @Override
      public StopLine stopLine( Agent car ) {
        return _carMoveTo2_stopLine_xjal( this, car );
      }
      @Override
      public BusStop busStop( Agent car ) {
        return _carMoveTo2_busStop_xjal( this, car );
      }
      @Override
      public void onEnter( Agent car ) {
        _carMoveTo2_onEnter_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carMoveTo2_onExit_xjal( this, car );
      }
      @Override
      public void onWayNotFound( Agent car ) {
        _carMoveTo2_onWayNotFound_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo2_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    setupParameters_carMoveTo2_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo2_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    create_carMoveTo2_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo2_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.movesTo = 
self.ROAD 
;
    self.destination = 
self.END_OF_FORWARD_LANE 
;
    self.stopLineBehavior = 
self.PASS_THROUGH_STOP_LINE 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo2_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo3_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Road road( Agent car ) {
        return _carMoveTo3_road_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carMoveTo3_parkingLot_xjal( this, car );
      }
      @Override
      public StopLine stopLine( Agent car ) {
        return _carMoveTo3_stopLine_xjal( this, car );
      }
      @Override
      public BusStop busStop( Agent car ) {
        return _carMoveTo3_busStop_xjal( this, car );
      }
      @Override
      public void onEnter( Agent car ) {
        _carMoveTo3_onEnter_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carMoveTo3_onExit_xjal( this, car );
      }
      @Override
      public void onWayNotFound( Agent car ) {
        _carMoveTo3_onWayNotFound_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo3_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    setupParameters_carMoveTo3_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo3_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    create_carMoveTo3_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo3_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.movesTo = 
self.ROAD 
;
    self.destination = 
self.END_OF_FORWARD_LANE 
;
    self.stopLineBehavior = 
self.PASS_THROUGH_STOP_LINE 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo3_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo4_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Road road( Agent car ) {
        return _carMoveTo4_road_xjal( this, car );
      }
      @Override
      public ParkingLot parkingLot( Agent car ) {
        return _carMoveTo4_parkingLot_xjal( this, car );
      }
      @Override
      public StopLine stopLine( Agent car ) {
        return _carMoveTo4_stopLine_xjal( this, car );
      }
      @Override
      public BusStop busStop( Agent car ) {
        return _carMoveTo4_busStop_xjal( this, car );
      }
      @Override
      public void onEnter( Agent car ) {
        _carMoveTo4_onEnter_xjal( this, car );
      }
      @Override
      public void onExit( Agent car ) {
        _carMoveTo4_onExit_xjal( this, car );
      }
      @Override
      public void onWayNotFound( Agent car ) {
        _carMoveTo4_onWayNotFound_xjal( this, car );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo4_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    setupParameters_carMoveTo4_xjal( self, null );
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo4_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self ) {
    create_carMoveTo4_xjal(self, null );
  }


  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_carMoveTo4_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.movesTo = 
self.ROAD 
;
    self.destination = 
self.END_OF_FORWARD_LANE 
;
    self.stopLineBehavior = 
self.PASS_THROUGH_STOP_LINE 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo4_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
    self.create();

  }

  private double _carSource_interarrivalTime_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private double _carSource_rateExpression_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _carSource_arrivalDate_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private Road _carSource_road_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    Road _value;
    _value = 
road 
;
    return _value;
  }
  private int _carSource_laneIndex_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    int _value;
    _value = 
0 
;
    return _value;
  }
  private ParkingLot _carSource_parkingLot_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private Agent _carSource_newCar_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _carSource_length_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
5 
;
    return _value;
  }
  private double _carSource_initialSpeed_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
60 
;
    return _value;
  }
  private double _carSource_preferredSpeed_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
60 
;
    return _value;
  }
  private double _carSource_maxAcceleration_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
1.8 
;
    return _value;
  }
  private double _carSource_maxDeceleration_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
4.2 
;
    return _value;
  }
  private void _carSource_onExit_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    
 
;
  }
  private Road _carMoveTo_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
road1 
;
    return _value;
  }
  private ParkingLot _carMoveTo_parkingLot_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private StopLine _carMoveTo_stopLine_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    StopLine _value;
    _value = 
 
;
    return _value;
  }
  private BusStop _carMoveTo_busStop_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    BusStop _value;
    _value = 
 
;
    return _value;
  }
  private void _carMoveTo_onEnter_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo_onExit_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo_onWayNotFound_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carDispose_onEnter_xjal( final com.anylogic.libraries.road.CarDispose<Agent> self, Agent car ) {
    
 
;
  }
  private double _carSource1_interarrivalTime_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private double _carSource1_rateExpression_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _carSource1_arrivalDate_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private Road _carSource1_road_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    Road _value;
    _value = 
road3 
;
    return _value;
  }
  private int _carSource1_laneIndex_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    int _value;
    _value = 
0 
;
    return _value;
  }
  private ParkingLot _carSource1_parkingLot_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private Agent _carSource1_newCar_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _carSource1_length_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
5 
;
    return _value;
  }
  private double _carSource1_initialSpeed_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
60 
;
    return _value;
  }
  private double _carSource1_preferredSpeed_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
60 
;
    return _value;
  }
  private double _carSource1_maxAcceleration_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
1.8 
;
    return _value;
  }
  private double _carSource1_maxDeceleration_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
4.2 
;
    return _value;
  }
  private void _carSource1_onExit_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    
 
;
  }
  private Road _carMoveTo1_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
road3 
;
    return _value;
  }
  private ParkingLot _carMoveTo1_parkingLot_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private StopLine _carMoveTo1_stopLine_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    StopLine _value;
    _value = 
 
;
    return _value;
  }
  private BusStop _carMoveTo1_busStop_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    BusStop _value;
    _value = 
 
;
    return _value;
  }
  private void _carMoveTo1_onEnter_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo1_onExit_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo1_onWayNotFound_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private double _carSource2_interarrivalTime_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private double _carSource2_rateExpression_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _carSource2_arrivalDate_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private Road _carSource2_road_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    Road _value;
    _value = 
 
;
    return _value;
  }
  private int _carSource2_laneIndex_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    int _value;
    _value = 
0 
;
    return _value;
  }
  private ParkingLot _carSource2_parkingLot_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private Agent _carSource2_newCar_xjal( final com.anylogic.libraries.road.CarSource<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _carSource2_length_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
5 
;
    return _value;
  }
  private double _carSource2_initialSpeed_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
60 
;
    return _value;
  }
  private double _carSource2_preferredSpeed_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
60 
;
    return _value;
  }
  private double _carSource2_maxAcceleration_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
1.8 
;
    return _value;
  }
  private double _carSource2_maxDeceleration_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    double _value;
    _value = 
4.2 
;
    return _value;
  }
  private void _carSource2_onExit_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    
 
;
  }
  private boolean _selectOutput5_condition1_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
randomTrue( 0.2 ) 
;
    return _value;
  }
  private boolean _selectOutput5_condition2_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
randomTrue( 0.25 ) 
;
    return _value;
  }
  private boolean _selectOutput5_condition3_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
randomTrue( 1.0 / 3 ) 
;
    return _value;
  }
  private boolean _selectOutput5_condition4_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    boolean _value;
    _value = 
randomTrue( 0.5 ) 
;
    return _value;
  }
  private double _selectOutput5_probability1_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    double _value;
    _value = 
0.8 
;
    return _value;
  }
  private double _selectOutput5_probability2_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    double _value;
    _value = 
0.1 
;
    return _value;
  }
  private double _selectOutput5_probability3_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    double _value;
    _value = 
0.1 
;
    return _value;
  }
  private double _selectOutput5_probability4_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private double _selectOutput5_probability5_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private int _selectOutput5_exitNumber_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    int _value;
    _value = 
uniform_discr( 1, 5 ) 
;
    return _value;
  }
  private void _selectOutput5_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput5_onExit1_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput5_onExit2_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput5_onExit3_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput5_onExit4_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    
 
;
  }
  private void _selectOutput5_onExit5_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Agent> self, Agent agent ) {
    
 
;
  }
  private Road _carMoveTo2_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
 
;
    return _value;
  }
  private ParkingLot _carMoveTo2_parkingLot_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private StopLine _carMoveTo2_stopLine_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    StopLine _value;
    _value = 
 
;
    return _value;
  }
  private BusStop _carMoveTo2_busStop_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    BusStop _value;
    _value = 
 
;
    return _value;
  }
  private void _carMoveTo2_onEnter_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo2_onExit_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo2_onWayNotFound_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private Road _carMoveTo3_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
 
;
    return _value;
  }
  private ParkingLot _carMoveTo3_parkingLot_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private StopLine _carMoveTo3_stopLine_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    StopLine _value;
    _value = 
 
;
    return _value;
  }
  private BusStop _carMoveTo3_busStop_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    BusStop _value;
    _value = 
 
;
    return _value;
  }
  private void _carMoveTo3_onEnter_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo3_onExit_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo3_onWayNotFound_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private Road _carMoveTo4_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
 
;
    return _value;
  }
  private ParkingLot _carMoveTo4_parkingLot_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    ParkingLot _value;
    _value = 
 
;
    return _value;
  }
  private StopLine _carMoveTo4_stopLine_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    StopLine _value;
    _value = 
 
;
    return _value;
  }
  private BusStop _carMoveTo4_busStop_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    BusStop _value;
    _value = 
 
;
    return _value;
  }
  private void _carMoveTo4_onEnter_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo4_onExit_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  private void _carMoveTo4_onWayNotFound_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    
 
;
  }
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, ViewArea.TOP_LEFT, ViewArea.SPECIFIED_ZOOM, 1, 100, 100 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _road = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _stopLine = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _road1 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _road2 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _stopLine1 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _road3 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _stopLine3 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _road4 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _stopLine2 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _road6 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _road5 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _intersection = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector1 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector2 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector3 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector4 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector27 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector28 = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector29 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector30 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector31 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector41 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector42 = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector43 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector44 = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector5 = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector10 = 27;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector11 = 28;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector12 = 29;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector13 = 30;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector15 = 31;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector16 = 32;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector21 = 33;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector45 = 34;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector46 = 35;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector48 = 36;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector49 = 37;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector50 = 38;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector51 = 39;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector52 = 40;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector6 = 41;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector7 = 42;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector8 = 43;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector9 = 44;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector17 = 45;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector18 = 46;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector19 = 47;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector20 = 48;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector22 = 49;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector37 = 50;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector14 = 51;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector38 = 52;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector39 = 53;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector24 = 54;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector47 = 55;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector53 = 56;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector54 = 57;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector55 = 58;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector56 = 59;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector57 = 60;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector58 = 61;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector59 = 62;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector60 = 63;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector61 = 64;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector62 = 65;
  @AnyLogicInternalCodegenAPI
  protected static final int _intersection1 = 66;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector23 = 67;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector25 = 68;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector26 = 69;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector32 = 70;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector33 = 71;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector34 = 72;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector35 = 73;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector = 74;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector36 = 75;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector40 = 76;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector63 = 77;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector64 = 78;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector65 = 79;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector66 = 80;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector67 = 81;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector68 = 82;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector69 = 83;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector70 = 84;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector71 = 85;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector72 = 86;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector73 = 87;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector74 = 88;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector75 = 89;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector76 = 90;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector77 = 91;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector78 = 92;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector79 = 93;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector80 = 94;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector81 = 95;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector83 = 96;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector84 = 97;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector85 = 98;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector86 = 99;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector87 = 100;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 101;
 

  /**
   * Top-level presentation group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  /**
   * Top-level icon group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  
	@AnyLogicInternalCodegenAPI
	private void _initialize_roadNetwork_xjal() {
		roadNetwork.addAll(road, stopLine, road1, intersection, road2, stopLine1, road3, stopLine3, road4, stopLine2, intersection1, road6, road5);
		
		roadNetwork.initialize();
	}
	
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 150.0, -110.0, 0.0, 148.464, 75.287, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.273, 149.964, 0.0, -30.0, 150.0, 0.0 ),
       new MarkupSegmentLine( -30.0, 150.0, 0.0, -20.0, 150.0, 0.0 ),
       new MarkupSegmentLine( -20.0, 150.0, 0.0, 10.0, 150.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 120.0, 230.0, 0.0, 120.0, 420.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 150.0, 0.0, 480.0, 150.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road4_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 110.0, 450.0, 0.0, 460.0, 450.0, 0.0 ),
       new MarkupSegmentLine( 460.0, 450.0, 0.0, 152.84533200197728, 449.9179703517806, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road6_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 114.74967594406844, 487.23399338601575, 0.0, 114.583, 495.41100000000006, 0.0 ),
       new MarkupSegmentLine( 114.583, 495.41100000000006, 0.0, 114.583, 585.4110000000001, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road5_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 60.0, 500.0, 0.0, -30.0, 500.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private RoadLanesConnector[] _intersection_laneConnectors_xjal() {
    return new RoadLanesConnector[] {
      laneConnector1,
      laneConnector2,
      laneConnector3,
      laneConnector4,
      laneConnector27,
      laneConnector28,
      laneConnector29,
      laneConnector30,
      laneConnector31,
      laneConnector41,
      laneConnector42,
      laneConnector43,
      laneConnector44,
      laneConnector5,
      laneConnector10,
      laneConnector11,
      laneConnector12,
      laneConnector13,
      laneConnector15,
      laneConnector16,
      laneConnector21,
      laneConnector45,
      laneConnector46,
      laneConnector48,
      laneConnector49,
      laneConnector50,
      laneConnector51,
      laneConnector52,
      laneConnector6,
      laneConnector7,
      laneConnector8,
      laneConnector9,
      laneConnector17,
      laneConnector18,
      laneConnector19,
      laneConnector20,
      laneConnector22,
      laneConnector37,
      laneConnector14,
      laneConnector38,
      laneConnector39,
      laneConnector24,
      laneConnector47,
      laneConnector53,
      laneConnector54,
      laneConnector55,
      laneConnector56,
      laneConnector57,
      laneConnector58,
      laneConnector59,
      laneConnector60,
      laneConnector61,
      laneConnector62,
    };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 141.46424051279934, 75.22897309810003, 0.0, 197.46231641040472, 75.69318831329981, 0.0, 3.149882305945604, 3.149882305945601, 1.0,
			113.46520256399664, 74.99686549050008, 27.99999999999999, -6.27489565482377, -0.0,
			169.46327846160202, 75.46108070569994, 27.999999999999986, -3.1333030012339904, -3.14159265358978 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 141.46424051279934, 75.22897309810003, 0.0, 158.77710593220075, 96.33201112692953, 0.0, 3.149882305945604, -1.394515096686654, 1.0000000000000013,
			120.4658807623066, 75.05490000837023, 20.999081257323645, -6.274895654823783, 0.006079561274184419,
			162.45970758094495, 75.65835981062003, 20.999081257323585, -3.127223439959798, -1.408884310316649 ),
       new MarkupSegmentArc( 158.77710593220075, 96.33201112692953, 0.0, 183.46279743600337, 75.57713450949987, 0.0, 1.7470775569031372, 3.149882305945601, 1.000000000000001,
			162.4602142843682, 75.6555152428679, 21.001970602241656, -4.536107750276449, -1.7447988090559754,
			204.46404643213913, 75.75123155062019, 21.001970602241606, -3.1393139057426795, 0.006010904508689376 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 141.46424051279934, 75.22897309810003, 0.0, 169.46327846160202, 75.46108070569993, 0.0, 3.149882305945604, 3.149882305945601, 1.0,
			155.4637594872007, 75.3450269019, 13.999999999999988, -3.1333030012339766, -3.141592653589793,
			183.46279743600337, 75.57713450949986, 13.999999999999984, -3.1333030012339904, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector4_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 141.46424051279934, 75.22897309810003, 0.0, 155.46375948720066, 75.34502690189998, 0.0, 3.149882305945604, 3.149882305945601, 1.0,
			134.46448102559867, 75.17094619620003, 6.999999999999987, -6.27489565482377, -0.0,
			148.464, 75.28700000000002, 6.999999999999986, -3.1333030012339766, -3.141592653589793 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector27_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 101.0, 0.0, 197.2753022695312, 98.25262133415312, 0.0, 4.71238898038469, 3.149882305945601, 1.0000000000000007,
			200.0, 98.27520864850328, 2.7247913514967212, -4.71238898038469, 1.5790859791506993,
			194.55060453906242, 98.23003401980296, 2.7247913514967177, -6.274895654823783, -0.0 ),
       new MarkupSegmentLine( 197.2753022695312, 98.25262133415312, 0.0, 197.46231641040472, 75.69318831329981, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector28_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 141.46424051279934, 75.22897309810003, 0.0, 140.00024051279934, 139.99997309810004, 0.0 ),
       new MarkupSegmentArc( 140.00024051279934, 139.99997309810004, 0.0, 143.0155198990626, 159.6471223328984, 0.0, 3.1619939035264535, -0.32496807408010375, 1.0000000000000013,
			197.82865313045738, 141.17990870262122, 57.84044911572635, -3.1211914036531367, -0.3453693240167591,
			88.20238666766798, 178.11433596317553, 57.84044911572621, -0.32496807408010353, -0.0 ),
       new MarkupSegmentArc( 143.0155198990626, 159.6471223328984, 0.0, 200.0, 199.0, 0.0, 2.8166245795096914, 4.71238898038469, 1.0000080999671987,
			197.8286834863696, 141.17989847534395, 57.840481148188125, -3.4665607276698944, -1.264599376128013,
			200.0, 256.83954414757255, 57.83954414757255, -1.5895674502081147, 0.01877112341321827 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector29_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 141.46424051279934, 75.22897309810003, 0.0, 140.00024051279934, 129.99997309810004, 0.0 ),
       new MarkupSegmentArc( 140.00024051279934, 129.99997309810004, 0.0, 151.54224051279934, 159.6239730981, 0.0, 3.149892463002004, -0.6060316632059637, 1.0000525605230142,
			181.90124765776054, 130.3477514574032, 41.90245040029626, -3.1332928441775825, -0.6952038311748399,
			117.10561274752195, 183.4895323815919, 41.898045918134905, -0.686904021762629, 0.08087235855666525 ),
       new MarkupSegmentArc( 151.54224051279934, 159.6239730981, 0.0, 200.0, 185.0, 0.0, 2.5356179477660086, 4.71238898038469, 1.0000640779470105,
			199.99946419995294, 126.04582880101657, 58.954171200200896, -3.7475673594135777, -0.9648261654704069,
			200.0, 243.94661660181697, 58.94661660181696, -1.5708008712941919, 4.5444992953967654E-6 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector30_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 141.46424051279934, 75.22897309810003, 0.0, 141.16213064822495, 111.67235231515338, 0.0 ),
       new MarkupSegmentArc( 141.16213064822495, 111.67235231515338, 0.0, 200.0, 171.0, 0.0, 3.149882305945601, 4.71238898038469, 1.0000000000000007,
			200.00000000000009, 112.1601089700958, 58.839891029904194, -3.1333030012339904, -1.5790859791506986,
			200.0, 229.83989102990412, 58.83989102990412, -1.5707963267948961, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector31_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 141.46424051279934, 75.22897309810003, 0.0, 141.27722637192582, 97.78840611895333, 0.0 ),
       new MarkupSegmentArc( 141.27722637192582, 97.78840611895333, 0.0, 200.0, 157.0, 0.0, 3.149882305945604, 4.71238898038469, 1.0000000000000007,
			199.9999999999999, 98.27520864850341, 58.72479135149659, -3.1333030012339904, -1.5790859791506993,
			200.0, 215.72479135149652, 58.72479135149652, -1.5707963267948977, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector41_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 200.0, 199.0, 0.0, 4.71238898038469, 4.71238898038469, 1.0,
			200.0, 171.0, 28.0, -1.5707963267948966, -3.141592653589793,
			200.0, 227.0, 28.0, -1.5707963267948966, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector42_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 200.0, 185.0, 0.0, 4.71238898038469, 4.71238898038469, 1.0,
			200.0, 164.0, 21.0, -1.5707963267948966, -3.141592653589793,
			200.0, 206.0, 21.0, -1.5707963267948966, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector43_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 200.0, 171.0, 0.0, 4.71238898038469, 4.71238898038469, 1.0,
			200.0, 157.0, 14.0, -1.5707963267948966, -3.141592653589793,
			200.0, 185.0, 14.0, -1.5707963267948966, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector44_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 200.0, 157.0, 0.0, 4.71238898038469, 4.71238898038469, 1.0,
			200.0, 150.0, 7.0, -1.5707963267948966, -3.141592653589793,
			200.0, 164.0, 7.0, -1.5707963267948966, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector5_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2754639932767, 156.96399956633834, 0.0, 115.55918897913818, 156.94876373577222, 0.0 ),
       new MarkupSegmentArc( 115.55918897913818, 156.94876373577222, 0.0, 197.46231641040472, 75.69318831329981, 0.0, 1.5704443277480986, 3.149882305945601, 1.0000000000000004,
			115.53034801401003, 75.0139852204932, 81.93478359127519, -4.712740979431487, -1.562154675392295,
			279.3942848067993, 76.37239140610639, 81.93478359127509, -3.1333030012339904, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector10_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2754639932767, 156.96399956633834, 0.0, 101.43768095942563, 156.9537344933398, 0.0 ),
       new MarkupSegmentArc( 101.43768095942563, 156.9537344933398, 0.0, 183.46279743600337, 75.57713450949987, 0.0, 1.5704443277480986, 3.149882305945601, 1.0000000000000004,
			101.40879703767408, 74.8969197906484, 82.05681978624791, -4.712740979431487, -1.562154675392295,
			265.5167978343326, 76.25734922835129, 82.05681978624784, -3.1333030012339904, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector11_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2754639932767, 156.96399956633834, 0.0, 90.0004639932767, 159.99999956633835, 0.0 ),
       new MarkupSegmentArc( 90.0004639932767, 159.99999956633835, 0.0, 169.46327846160202, 75.46108070569993, 0.0, 1.5703963268162309, 3.149882305945601, 1.0000000799999975,
			89.96864367669247, 80.44920810557932, 79.5507978248221, -4.712788980363356, -1.5976067462919128,
			249.01133027515382, 76.12052150611012, 79.55078509669637, -3.1688030730654675, 0.03550007183147729 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector12_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2754639932767, 156.96399956633834, 0.0, 73.19466492000056, 156.96367600847498, 0.0 ),
       new MarkupSegmentArc( 73.19466492000056, 156.96367600847498, 0.0, 155.46375948720066, 75.34502690189998, 0.0, 1.5704443277480986, 3.149882305945601, 1.0000000000000004,
			73.16569508500216, 74.66278893095881, 82.30089217619337, -4.712740979431487, -1.5621546753922821,
			237.7618238893991, 76.02726487284109, 82.30089217619329, -3.1333030012339766, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector13_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.46568358959527, 74.8808116867002, 0.0, 73.17495297378697, 100.96367947776814, 0.0, 3.1498823059456025, 1.5704443277480986, 0.9999999999999994,
			125.76567209418833, 75.0988344424416, 26.30089217619334, -3.1333030012339904, -0.0,
			73.1656950850022, 74.66278893095881, 26.30089217619336, -6.274895654823783, 1.562154675392295 ),
       new MarkupSegmentLine( 73.17495297378697, 100.96367947776814, 0.0, 72.25575204706308, 100.96400303563152, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector15_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.2754639932767, 156.96399956633834, 0.0, 72.26068003361648, 114.96400216830824, 0.0, 1.5704443277480986, 1.5704443277480986, 1.0,
			72.2680720134466, 135.9640008673233, 20.999999999999993, -4.712740979431487, -3.141592653589793,
			72.25328805378638, 93.96400346929319, 20.999999999999993, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector16_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.2754639932767, 156.96399956633834, 0.0, 72.26560802016989, 128.96400130098493, 0.0, 1.5704443277480986, 1.5704443277480986, 1.0,
			72.27053600672329, 142.96400043366165, 13.999999999999998, -4.712740979431487, -3.141592653589793,
			72.26068003361648, 114.96400216830823, 13.999999999999998, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector21_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.2754639932767, 156.96399956633834, 0.0, 72.27053600672329, 142.96400043366165, 0.0, 1.5704443277480986, 1.5704443277480986, 1.0,
			72.273, 149.964, 6.999999999999992, -4.712740979431487, -3.141592653589793,
			72.26807201344658, 135.9640008673233, 6.999999999999992, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector45_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.29024795293691, 198.96399696436848, 0.0, 123.37414481604031, 198.9700041460976, 0.0 ),
       new MarkupSegmentLine( 123.37414481604031, 198.9700041460976, 0.0, 148.9161015545302, 198.98500207590178, 0.0 ),
       new MarkupSegmentLine( 148.9161015545302, 198.98500207590178, 0.0, 200.0, 199.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector46_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.28531996638351, 184.96399783169176, 0.0, 123.37118802414285, 184.97000449302712, 0.0 ),
       new MarkupSegmentLine( 123.37118802414285, 184.97000449302712, 0.0, 200.0, 185.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector48_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2754639932767, 156.96399956633834, 0.0, 123.36527444034789, 156.9700051868861, 0.0 ),
       new MarkupSegmentLine( 123.36527444034789, 156.9700051868861, 0.0, 148.91018797037924, 156.98500259629532, 0.0 ),
       new MarkupSegmentLine( 148.91018797037924, 156.98500259629532, 0.0, 200.0, 157.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector49_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 101.0, 0.0, 148.90230319151138, 100.9850032901534, 0.0 ),
       new MarkupSegmentLine( 148.90230319151138, 100.9850032901534, 0.0, 123.35344727275789, 100.97000657460413, 0.0 ),
       new MarkupSegmentLine( 123.35344727275789, 100.97000657460413, 0.0, 72.25575204706308, 100.96400303563152, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector50_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 115.0, 0.0, 148.90427438622834, 114.98500311668887, 0.0 ),
       new MarkupSegmentLine( 148.90427438622834, 114.98500311668887, 0.0, 123.35640406465541, 114.97000622767463, 0.0 ),
       new MarkupSegmentLine( 123.35640406465541, 114.97000622767463, 0.0, 72.26068003361648, 114.96400216830824, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector51_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 129.0, 0.0, 148.9062455809453, 128.98500294322434, 0.0 ),
       new MarkupSegmentLine( 148.9062455809453, 128.98500294322434, 0.0, 123.35936085655291, 128.97000588074513, 0.0 ),
       new MarkupSegmentLine( 123.35936085655291, 128.97000588074513, 0.0, 114.00047373747279, 128.96890601665112, 0.0 ),
       new MarkupSegmentLine( 114.00047373747279, 128.96890601665112, 0.0, 72.26560802016989, 128.96400130098493, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector52_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 143.0, 0.0, 148.90821677566225, 142.98500276975983, 0.0 ),
       new MarkupSegmentLine( 148.90821677566225, 142.98500276975983, 0.0, 123.3623176484504, 142.97000553381562, 0.0 ),
       new MarkupSegmentLine( 123.3623176484504, 142.97000553381562, 0.0, 72.27053600672329, 142.96400043366165, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector6_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.46568358959527, 74.8808116867002, 0.0, 89.96253663899913, 136.5792237882888, 0.0, 3.149882305945602, 0.297359969411102, 1.0,
			316.16630150022706, 76.67722562351571, 216.70806377678247, -3.1333030012339766, -0.0,
			-117.23493432103652, 73.08439774988466, 216.70806377678247, -6.27489565482377, 0.28907031705528613 ),
       new MarkupSegmentLine( 89.96253663899913, 136.5792237882888, 0.0, 80.24167871026044, 168.30050415179804, 0.0 ),
       new MarkupSegmentArc( 80.24167871026044, 168.30050415179804, 0.0, 71.0, 230.0, 0.0, 3.4389526230008958, 0.0, 0.9999999999999992,
			281.5805955461673, 229.99999999999983, 210.5805955461672, -2.844232684178691, -0.297359969411102,
			-139.58059554616761, 230.0, 210.58059554616764, -0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector7_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.46520256399663, 74.99686549050014, 0.0, 103.96256804884558, 136.6486346594486, 0.0, 3.149882305945602, 0.2975713846022905, 0.9999999999999994,
			-102.91797048878055, 73.2030831214776, 216.3906080114743, -6.27489565482377, 0.28928173224647424,
			310.843106586472, 200.09418619741945, 216.39060801147465, -2.8440212689875026, -0.0 ),
       new MarkupSegmentLine( 103.96256804884558, 136.6486346594486, 0.0, 94.2413556633951, 168.34714786942544, 0.0 ),
       new MarkupSegmentArc( 94.2413556633951, 168.34714786942544, 0.0, 85.0, 230.0, 0.0, 3.4391640381920845, 0.0, 0.9999999999999997,
			295.2763367135706, 230.00000000000006, 210.27633671357054, -2.8440212689875026, -0.2975713846022906,
			-125.27633671357074, 230.0, 210.2763367135707, 0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector8_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 127.46472153839797, 75.11291929430008, 0.0, 117.9625999293743, 136.71804529063849, 0.0, 3.1498823059456016, 0.29778309927348934, 0.9999999999999997,
			343.5306919626131, 76.90407210357213, 216.07339448378178, -3.1333030012339904, -0.0,
			-88.60124888581736, 73.321766485028, 216.07339448378195, -6.274895654823783, 0.2894934469176856 ),
       new MarkupSegmentLine( 117.9625999293743, 136.71804529063849, 0.0, 108.24103214143125, 168.39379182700443, 0.0 ),
       new MarkupSegmentArc( 108.24103214143125, 168.39379182700443, 0.0, 99.0, 230.0, 0.0, 3.439375752863283, 0.0, 1.0000000000000004,
			-92.49023648939674, 106.78758365400884, 209.97230077225922, -5.9854022079060965, -0.0,
			308.972300772259, 230.0, 209.97230077225905, -2.8438095543163042, -0.297783099273489 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector9_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 141.46424051279934, 75.22897309810003, 0.0, 131.96263228188255, 136.7874556815711, 0.0, 3.149882305945602, 0.2979951140493944, 1.0,
			357.2132505298898, 77.0174983555993, 215.75642318584937, -3.1333030012339904, -0.0,
			-74.28476950429115, 73.44044784060074, 215.75642318584937, -6.274895654823783, 0.2897054616935909 ),
       new MarkupSegmentLine( 131.96263228188255, 136.7874556815711, 0.0, 122.24070814306202, 168.44043602482233, 0.0 ),
       new MarkupSegmentArc( 122.24070814306202, 168.44043602482233, 0.0, 113.0, 230.0, 0.0, 3.4395877676391873, 0.0, 1.0000000000000002,
			322.6684877288652, 230.00000000000006, 209.6684877288652, -2.8435975395403994, -0.2979951140493938,
			-96.66848772886513, 230.0, 209.66848772886513, 0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector17_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.29024795293691, 198.96399696436848, 0.0, 76.70553291264595, 204.90871900163765, 0.0, 1.5704443277480975, 0.2934925614235615, 0.999999999999999,
			72.28862494735826, 194.3531733658973, 4.610823884119383, -4.712740979431489, -0.0,
			72.29187095851556, 203.57482056283965, 4.610823884119393, -1.5711483258416952, 1.8646408872652573 ),
       new MarkupSegmentLine( 76.70553291264595, 204.90871900163765, 0.0, 72.79727684570969, 217.84052895650953, 0.0 ),
       new MarkupSegmentArc( 72.79727684570969, 217.84052895650953, 0.0, 71.0, 230.0, 0.0, 3.4350852150133546, 0.0, 1.0000000000000013,
			113.03107063841037, 229.99999999999994, 42.031070638410355, -2.848100092166232, -0.29349256142356117,
			28.96892936158976, 230.0, 42.03107063841025, -0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector18_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 143.0, 0.0, 158.0, 143.0, 0.0 ),
       new MarkupSegmentArc( 158.0, 143.0, 0.0, 71.0, 230.0, 0.0, 4.71238898038469, 0.0, 1.0,
			158.0, 230.0, 87.0, -1.5707963267948966, -1.5707963267948966,
			-16.0, 230.0, 87.0, -0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector19_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 143.0, 0.0, 172.0, 143.0, 0.0 ),
       new MarkupSegmentArc( 172.0, 143.0, 0.0, 85.0, 230.0, 0.0, 4.71238898038469, 0.0, 1.0,
			172.0, 230.0, 87.0, -1.5707963267948966, -1.5707963267948966,
			-2.0, 230.0, 87.0, -0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector20_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 200.0, 143.0, 0.0, 186.0, 143.0, 0.0 ),
       new MarkupSegmentArc( 186.0, 143.0, 0.0, 99.0, 230.0, 0.0, 4.71238898038469, 0.0, 1.0,
			186.0, 230.0, 87.0, -1.5707963267948966, -1.5707963267948966,
			12.0, 230.0, 87.0, -0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector22_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 113.0, 230.0, 0.0, 4.71238898038469, 0.0, 1.0,
			200.0, 230.0, 87.0, -1.5707963267948966, -1.5707963267948966,
			26.0, 230.0, 87.0, -0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector37_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.2803919798301, 170.96399869901506, 0.0, 72.25575204706308, 100.96400303563152, 0.0, 1.5704443277480986, 1.5704443277480986, 1.0,
			72.26807201344658, 135.9640008673233, 35.00000000000001, -4.712740979431487, -3.141592653589793,
			72.24343208067957, 65.96400520393975, 35.00000000000001, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector14_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2803919798301, 170.96399869901506, 0.0, 87.3211009262665, 170.9587043835841, 0.0 ),
       new MarkupSegmentArc( 87.3211009262665, 170.9587043835841, 0.0, 183.46279743600337, 75.57713450949987, 0.0, 1.5704443277480986, 3.149882305945601, 1.0000000000000004,
			87.35495579119488, 267.13755440636464, 96.17885598122068, -1.5711483258416945, -0.0,
			87.28724606133817, 74.77985436080368, 96.17885598122056, -4.712740979431487, -1.5621546753922682 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector38_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.2803919798301, 170.96399869901506, 0.0, 99.0, 197.67420309756687, 0.0, 1.5704443277480986, 0.0, 0.9999999999999998,
			72.27099001295372, 144.25379430046326, 26.7102060532935, -4.712740979431487, -0.0,
			72.28979394670648, 197.67420309756687, 26.710206053293515, -1.5711483258416945, 1.5711483258416945 ),
       new MarkupSegmentLine( 99.0, 197.67420309756687, 0.0, 99.0, 230.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector39_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 72.2803919798301, 170.96399869901506, 0.0, 101.44260894597905, 170.95373362601651, 0.0 ),
       new MarkupSegmentArc( 101.44260894597905, 170.95373362601651, 0.0, 197.46231641040472, 75.69318831329981, 0.0, 1.5704443277480957, 3.149882305945601, 1.0000000000000004,
			101.47642085428429, 267.01054746138465, 96.05681978624796, -1.5711483258416976, -0.0,
			101.40879703767413, 74.89691979064847, 96.05681978624786, -4.712740979431489, -1.562154675392281 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector24_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.46520256399663, 74.99686549050014, 0.0, 87.2964609934995, 100.95870872020055, 0.0, 3.1498823059456025, 1.5704443277480986, 0.9999999999999994,
			139.6431590666551, 75.2138766201967, 26.178855981220625, -3.1333030012339904, -0.0,
			87.28724606133814, 74.77985436080358, 26.17885598122065, -6.27489565482377, 1.5621546753922821 ),
       new MarkupSegmentLine( 87.2964609934995, 100.95870872020055, 0.0, 72.25575204706308, 100.96400303563152, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector47_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 129.0, 0.0, 149.32591691396198, 119.8844607854609, 0.0, 4.71238898038469, 1.9267606318455628, 0.9999999999999999,
			200.0, 274.4086088266871, 145.4086088266871, -1.5707963267948966, -0.0,
			200.0, -16.408608826687157, 145.40860882668716, -4.71238898038469, 0.35596430505066606 ),
       new MarkupSegmentLine( 149.32591691396198, 119.8844607854609, 0.0, 122.92983351263646, 110.07033503988055, 0.0 ),
       new MarkupSegmentArc( 122.92983351263646, 110.07033503988055, 0.0, 72.25575204706308, 100.96400303563152, 0.0, -1.2148320217442303, 1.5704443277480993, 1.0000000000000002,
			72.3068840898168, 246.22587549518695, 145.26188145877066, -1.21483202174423, -0.3563163040974643,
			72.20462000430952, -44.29786942392383, 145.2618814587706, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector53_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 149.72182984470726, 129.70621085255948, 0.0, 4.71238898038469, 2.0877753204539538, 1.0,
			200.0, 244.72491808258826, 101.72491808258826, -1.5707963267948966, -0.0,
			199.99999999999997, 41.27508191741174, 101.72491808258826, -4.71238898038469, 0.516978993659058 ),
       new MarkupSegmentLine( 149.72182984470726, 129.70621085255948, 0.0, 122.53392053606943, 114.24832462124334, 0.0 ),
       new MarkupSegmentArc( 122.53392053606943, 114.24832462124334, 0.0, 72.25575204706308, 100.96400303563152, 0.0, -1.053817333135838, 1.5704443277480986, 0.9999999999999998,
			72.29153363642935, 202.616516626018, 101.65251988792923, -1.0538173331358383, -0.5173309927058564,
			72.21997045769683, -0.6885105547549983, 101.65251988792927, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector54_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.29024795293691, 198.96399696436848, 0.0, 72.25575204706308, 100.96400303563152, 0.0, 1.5704443277480986, 1.5704443277480986, 1.0,
			72.27299999999998, 149.964, 49.00000000000001, -4.712740979431487, -3.141592653589793,
			72.23850409412616, 51.96400607126304, 49.00000000000001, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector55_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 115.0, 0.0, 149.01905275528742, 110.34922863722947, 0.0, 4.71238898038469, 1.7527440630171307, 1.0000000000000013,
			200.0, 396.7475265732857, 281.7475265732857, -1.5707963267948966, -0.0,
			199.99999999999983, -166.74752657328497, 281.747526573285, -4.71238898038469, 0.18194773622223412 ),
       new MarkupSegmentLine( 149.01905275528742, 110.34922863722947, 0.0, 123.23669769945633, 105.60572710489578, 0.0 ),
       new MarkupSegmentArc( 123.23669769945633, 105.60572710489578, 0.0, 72.25575204706308, 100.96400303563152, 0.0, -1.3888485905726626, 1.5704443277480988, 0.9999999999999999,
			72.35473434928727, 382.16447512883536, 281.20048951404203, -1.3888485905726629, -0.18229973526903182,
			72.15676974483912, -180.23646905757244, 281.2004895140421, -4.712740979431487, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector56_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.46520256399663, 74.99686549050014, 0.0, 197.46231641040472, 75.69318831329981, 0.0, 3.1498823059456025, 3.149882305945601, 1.0,
			155.46375948720066, 75.3450269019, 41.999999999999986, -3.1333030012339904, -3.1415926535897927,
			239.4608733336088, 76.04134972469961, 41.999999999999986, -3.1333030012339904, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector57_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.29024795293691, 198.96399696436848, 0.0, 155.12019608025673, 116.788928583163, 0.0, 1.5704443277480986, 3.149882305945601, 0.9999999999999991,
			72.26108062171978, 116.1020395874736, 82.86196251033132, -4.712740979431487, -1.562154675392295,
			237.9793115387938, 117.4758175788524, 82.86196251033148, -3.1333030012339904, -0.0 ),
       new MarkupSegmentLine( 155.12019608025673, 116.788928583163, 0.0, 155.46375948720066, 75.34502690189998, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector58_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 129.0, 0.0, 155.39184107002802, 84.02051372655325, 0.0, 4.71238898038469, 3.149882305945601, 0.9999999999999993,
			200.0, 84.39030832691071, 44.609691673089294, -4.71238898038469, 1.5790859791506993,
			110.78368214005599, 83.6507191261958, 44.60969167308935, -6.274895654823783, -0.0 ),
       new MarkupSegmentLine( 155.39184107002802, 84.02051372655325, 0.0, 155.46375948720066, 75.34502690189998, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector59_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 200.0, 143.0, 0.0, 183.04559184772813, 125.90445992275328, 0.0, 4.71238898038469, 3.149882305945601, 1.0000000000000007,
			200.0, 159.95499070831158, 16.9549907083116, -1.5707963267948966, -0.0,
			200.00000000000003, 126.04500929168843, 16.954990708311573, -4.712388980384689, 1.5790859791506986 ),
       new MarkupSegmentLine( 183.04559184772813, 125.90445992275328, 0.0, 183.46279743600337, 75.57713450949987, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector60_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 72.29024795293691, 198.96399696436848, 0.0, 183.35335614657498, 88.77898880267443, 0.0, 1.5704443277480986, 3.149882305945601, 1.0000000000000004,
			72.25113873536614, 87.85796894729543, 111.10603490027677, -4.712740979431487, -1.562154675392295,
			294.45557355778374, 89.70000865805339, 111.10603490027665, -3.1333030012339766, -0.0 ),
       new MarkupSegmentLine( 183.35335614657498, 88.77898880267443, 0.0, 183.46279743600337, 75.57713450949987, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector61_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 113.46520256399663, 74.99686549050014, 0.0, 113.0, 187.2331523770292, 0.0 ),
       new MarkupSegmentLine( 113.0, 187.2331523770292, 0.0, 113.0, 230.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector62_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 127.46472153839797, 75.11291929430008, 0.0, 122.49191378544197, 136.97692963249276, 0.0, 3.1498823059456016, 0.15213120010513514, 1.0,
			559.2937501587423, 78.6927138182593, 431.84386633136745, -3.1333030012339904, -0.0,
			-304.36430708194655, 71.53312477034233, 431.8438663313675, -6.274895654823783, 0.14384154774933117 ),
       new MarkupSegmentLine( 122.49191378544197, 136.97692963249276, 0.0, 117.71490132499426, 168.13492067837169, 0.0 ),
       new MarkupSegmentArc( 117.71490132499426, 168.13492067837169, 0.0, 113.0, 230.0, 0.0, 3.2937238536949285, 0.0, 0.9999999999999993,
			521.2289393384598, 230.00000000000023, 408.22893933845984, -2.9894614534846586, -0.1521312001051346,
			-295.2289393384604, 230.0, 408.2289393384604, 0.0, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private RoadLanesConnector[] _intersection1_laneConnectors_xjal() {
    return new RoadLanesConnector[] {
      laneConnector23,
      laneConnector25,
      laneConnector26,
      laneConnector32,
      laneConnector33,
      laneConnector34,
      laneConnector35,
      laneConnector,
      laneConnector36,
      laneConnector40,
      laneConnector63,
      laneConnector64,
      laneConnector65,
      laneConnector66,
      laneConnector67,
      laneConnector68,
      laneConnector69,
      laneConnector70,
      laneConnector71,
      laneConnector72,
      laneConnector73,
      laneConnector74,
      laneConnector75,
      laneConnector76,
      laneConnector77,
      laneConnector78,
      laneConnector79,
      laneConnector80,
      laneConnector81,
      laneConnector83,
      laneConnector84,
      laneConnector85,
      laneConnector86,
      laneConnector87,
    };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector23_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.0, 420.0, 0.0, 69.34794248465639, 446.47385441981885, 0.0, 3.141592653589793, 0.12464509446312055, 1.0000000000000042,
			283.94484463799876, 420.0, 212.94484463799876, -3.141592653589793, -0.0,
			-141.944844637997, 420.00000000000006, 212.944844637997, -0.0, 0.12464509446312107 ),
       new MarkupSegmentLine( 69.34794248465639, 446.47385441981885, 0.0, 67.68271895947248, 459.76431504707534, 0.0 ),
       new MarkupSegmentArc( 67.68271895947248, 459.76431504707534, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 3.2662377480529132, 0.020380669089323122, 1.0000000000000004,
			-185.0100493246971, 428.1032647500165, 254.66852426051773, -6.158540212716466, -0.0,
			320.3754872436418, 491.4253653441335, 254.66852426051744, -3.0169475591266743, -0.10426442537378768 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector25_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.0, 420.0, 0.0, 97.3467075768175, 446.70230834305875, 0.0, 3.141592653589793, 0.12367354802725683, 0.9999999999999961,
			315.4609952383756, 420.0, 216.46099523837557, -3.141592653589793, -0.0,
			-117.46099523837725, 420.0000000000012, 216.46099523837725, -0.0, 0.12367354802725676 ),
       new MarkupSegmentLine( 97.3467075768175, 446.70230834305875, 0.0, 96.14237302516084, 456.3906219951476, 0.0 ),
       new MarkupSegmentArc( 96.14237302516084, 456.3906219951476, 0.0, 94.82914587982481, 467.8905919044273, 0.0, 3.2652662016170506, 0.09317242522310587, 1.8653463810662567,
			-802.7746700906422, 344.6480739136274, 905.8356624994454, -6.159511759152327, 0.00311695616738931,
			354.0336990531821, 492.111437215394, 260.3337276139562, -3.0148021493951456, -0.03361807897154256 ),
       new MarkupSegmentArc( 94.82914587982481, 467.8905919044273, 0.0, 93.75403719566516, 486.80602896395874, 0.0, 3.2347650788128997, 0.0203806690893229, 0.9999999999999967,
			354.03369905328776, 492.111437215404, 260.3337276140624, -3.048420228366688, -0.07279175613377362,
			-166.52562466195923, 481.50062071251585, 260.3337276140643, -6.262804638090255, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector26_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.0, 420.0, 0.0, 109.67932883511187, 460.27759970409534, 0.0, 3.141592653589793, 0.12319391710143646, 0.9922887979332768,
			-123.13205072319332, 420.0, 236.13205072319332, -0.0, 0.14707249602495331,
			347.6781490639283, 489.74684003563294, 239.81633504835818, -2.9945201575648404, -0.02387857892351567 ),
       new MarkupSegmentArc( 109.67932883511187, 460.27759970409534, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 3.264786570691229, 0.0203806690893229, 1.0000000000000038,
			369.2858807627691, 492.4223299302479, 261.5890775339818, -3.0183987364883578, -0.10281324801210376,
			-153.78362137356578, 481.7603472270797, 261.5890775339798, -6.262804638090255, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector32_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.84720144293613, 442.9179706014098, 0.0, 90.00020144293612, 449.9999706014098, 0.0, 1.5707963267948966, 1.0196916767033395, 0.0,
			152.84720144293613, 442.9179706014098, 0.0, -0.0, -0.0,
			128.9669364543954, 513.3990568433163, 74.41673584457992, -1.2441176661168336, -0.8777833107696199 ),
       new MarkupSegmentArc( 90.00020144293612, 449.9999706014098, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 4.1613366915623216, 0.020380669089322456, 1.0000304795354973,
			69.01875669455174, 415.85904064414564, 40.0727353954821, -5.263441269207058, 0.07393836772734114,
			105.82182316403919, 487.0520125755722, 40.070292710438615, -2.0479102478899236, -1.0733017366105495 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector33_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.84720144293613, 442.9179706014098, 0.0, 124.27720466800967, 442.91034061225696, 0.0 ),
       new MarkupSegmentArc( 124.27720466800967, 442.91034061225696, 0.0, 79.75694469672965, 486.5207193492541, 0.0, -1.5705292637975985, 0.020380669089322456, 0.9999999999999998,
			124.2890936759158, 398.39272587809415, 44.51761632171987, -4.7121219173873925, -0.0,
			124.2653156601036, 487.4279553464198, 44.51761632171989, -1.570529263797599, -1.5506827207028682 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector34_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.84720144293613, 442.9179706014098, 0.0, 138.5616650006786, 442.91415546313885, 0.0 ),
       new MarkupSegmentArc( 138.5616650006786, 442.91415546313885, 0.0, 93.75403719566516, 486.80602896395874, 0.0, -1.5705292637975985, 0.020380669089322456, 0.9999999999999998,
			138.54969925201559, 487.71912095665004, 44.80496709131556, -1.5705292637975985, -1.5506827207028688,
			48.95837513931471, 485.89293697126743, 44.804967091315575, -6.262804638090266, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector35_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.84720144293613, 442.9179706014098, 0.0, 152.8461253333475, 442.91797031402075, 0.0 ),
       new MarkupSegmentArc( 152.8461253333475, 442.91797031402075, 0.0, 107.75112969460068, 487.0913385786634, 0.0, -1.5705292637975985, 0.02038066908932268, 1.0000000000000027,
			152.8581678227674, 397.8256540611609, 45.0923178609115, -4.7121219173873925, -0.0,
			152.83408284392763, 488.0102865668803, 45.09231786091126, -1.570529263797599, -1.5506827207028682 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85467920677155, 414.91797159992683, 0.0, 108.33332119558696, 458.52942593567695, 0.0, -1.5705292637975985, 0.020380669089322456, 0.9999999999999998,
			152.8665685079061, 370.39925889110106, 44.51871429642198, -4.7121219173873925, -0.0,
			152.84278990563712, 459.4366843087526, 44.518714296422004, -1.5705292637975996, -1.5506827207028675 ),
       new MarkupSegmentLine( 108.33332119558696, 458.52942593567695, 0.0, 107.75112969460068, 487.0913385786634, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector36_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.0, 420.0, 0.0, 103.07721761368947, 445.9518663874331, 0.0, 3.141592653589793, 0.7304035681771447, 0.9999999999999983,
			151.89841322844333, 420.0, 38.89841322844334, -3.141592653589793, -0.0,
			74.10158677155653, 420.0, 38.898413228443474, 0.0, 0.7304035681771446 ),
       new MarkupSegmentLine( 103.07721761368947, 445.9518663874331, 0.0, 89.98282651868186, 460.5719417533876, 0.0 ),
       new MarkupSegmentArc( 89.98282651868186, 460.5719417533876, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.8719962217669375, 0.020380669089322456, 1.0000000000000004,
			119.86787162100408, 487.33832008362674, 40.119258837687056, -2.4111890854126488, -0.7100228990878182,
			39.64601777245525, 485.7031186148814, 40.119258837687006, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector40_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 85.0, 420.0, 0.0, 83.34732480701311, 446.588081793838, 0.0, 3.141592653589793, 0.1241572564572404, 1.0000000000000004,
			299.69960697079586, 420.0, 214.69960697079586, -3.141592653589793, -0.0,
			-129.69960697079563, 419.99999999999983, 214.69960697079563, 0.0, 0.12415725645723975 ),
       new MarkupSegmentLine( 83.34732480701311, 446.588081793838, 0.0, 81.68158933982102, 459.9354091110347, 0.0 ),
       new MarkupSegmentArc( 81.68158933982102, 459.9354091110347, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.2657499100470337, 0.020380669089322456, 0.9999999999999978,
			336.6676195567567, 491.75745588317295, 256.9640408044678, -3.017435397132554, -0.10377658736792422,
			-177.15373016329846, 481.28398281533424, 256.96404080446894, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector63_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 85.0, 420.0, 0.0, 92.24023720309893, 446.34800609871587, 0.0, 3.141592653589793, -0.5363467723375135, 1.0000000000000013,
			136.5617402573174, 420.0, 51.56174025731741, -3.141592653589793, -0.5363467723375134,
			47.91873414888057, 472.6960121974317, 51.56174025731728, -0.5363467723375128, -0.0 ),
       new MarkupSegmentLine( 92.24023720309893, 446.34800609871587, 0.0, 100.79964181657499, 460.7462750340248, 0.0 ),
       new MarkupSegmentArc( 100.79964181657499, 460.7462750340248, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 2.605245881252279, 0.020380669089323566, 1.0000000000000027,
			58.182703123338186, 486.0809609814846, 49.57872301340085, -0.5363467723375138, 0.556727441426828,
			157.3195562658629, 488.1017161758422, 49.57872301340058, -3.121211984500467, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector64_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 85.0, 420.0, 0.0, 78.92470766156175, 446.1794577489753, 0.0, 3.141592653589793, 0.45605434699560243, 1.0000000000000027,
			144.4434921639956, 420.0, 59.44349216399558, -3.141592653589793, -0.0,
			25.55650783600474, 420.00000000000006, 59.44349216399526, -0.0, 0.4560543469956026 ),
       new MarkupSegmentLine( 78.92470766156175, 446.1794577489753, 0.0, 72.11626937588412, 460.05881684090457, 0.0 ),
       new MarkupSegmentArc( 72.11626937588412, 460.05881684090457, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 3.5976470005853933, 0.020380669089323344, 1.0000000000000004,
			16.164843236287624, 432.6121725582729, 62.320786014234756, -5.827130960183987, -0.0,
			128.06769551548058, 487.5054611235362, 62.320786014234706, -2.6855383065941942, -0.43567367790627315 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector65_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.0, 420.0, 0.0, 106.919863722774, 446.4094082162633, 0.0, 3.141592653589793, 0.45256632301393807, 0.9999999999999986,
			173.395430792708, 420.0, 60.39543079270801, -3.141592653589793, -0.0,
			52.604569207291824, 420.0, 60.395430792708176, 0.0, 0.4525663230139379 ),
       new MarkupSegmentLine( 106.919863722774, 446.4094082162633, 0.0, 100.11753905472295, 460.39950843772885, 0.0 ),
       new MarkupSegmentArc( 100.11753905472295, 460.39950843772885, 0.0, 93.75403719566516, 486.80602896395874, 0.0, 3.5941589766037305, 0.020380669089323122, 1.000000000000001,
			157.08171789745867, 488.0968681995031, 63.34083524078547, -2.689026330575856, -0.43218565392461095,
			30.426356493871793, 485.5151897284144, 63.34083524078533, -6.262804638090266, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector66_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.0, 420.0, 0.0, 89.08443017353872, 445.83814115391675, 0.0, 3.141592653589793, 0.7328518562039104, 1.0000000000000018,
			60.37750645307574, 420.0, 38.62249354692426, -0.0, 0.7328518562039101,
			117.79135389400159, 471.6762823078334, 38.62249354692414, -2.4087407973858825, -0.0 ),
       new MarkupSegmentLine( 89.08443017353872, 445.83814115391675, 0.0, 75.9774763722418, 460.40034672203774, 0.0 ),
       new MarkupSegmentArc( 75.9774763722418, 460.40034672203774, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 3.8744445097937, 0.0203806690893229, 1.000000000000001,
			105.58283738615383, 487.04714121102177, 39.83125729000043, -2.4087407973858865, -0.7124711871145752,
			25.936867009434494, 485.4236782580771, 39.83125729000035, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector67_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.0, 420.0, 0.0, 101.97672851338095, 446.73239797577935, 0.0, 3.141592653589793, -0.22179199744084377, 0.9999999999999984,
			220.5230093919619, 420.0, 121.52300939196189, -3.141592653589793, -0.2217919974408434,
			-16.56955236520038, 473.46479595155876, 121.52300939196229, -0.2217919974408439, -0.0 ),
       new MarkupSegmentLine( 101.97672851338095, 446.73239797577935, 0.0, 105.05017192910435, 460.3617508963397, 0.0 ),
       new MarkupSegmentArc( 105.05017192910435, 460.3617508963397, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 2.91980065614895, 0.020380669089323122, 1.000000000000004,
			213.533823706394, 435.8984937474573, 111.2077050085496, -3.3633846510306373, -0.0,
			-3.4334798481844473, 484.8250080452219, 111.20770500854871, -0.22179199744084338, 0.24217266653016387 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector68_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.0, 420.0, 0.0, 92.92227564505303, 446.2944336633724, 0.0, 3.141592653589793, 0.4543037747208223, 1.0000000000000042,
			39.081522912487905, 420.0, 59.918477087512095, -0.0, 0.45430377472082106,
			146.76302837761767, 472.58886732674466, 59.91847708751158, -2.687288878868972, -0.0 ),
       new MarkupSegmentLine( 92.92227564505303, 446.2944336633724, 0.0, 86.11691409023089, 460.2291619568089, 0.0 ),
       new MarkupSegmentArc( 86.11691409023089, 460.2291619568089, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.5958964283106156, 0.020380669089322234, 0.9999999999999943,
			29.66024473448401, 432.65718214806907, 62.82968713369253, -5.828881532458764, -0.0,
			142.57358344597844, 487.801141765549, 62.82968713369321, -2.687288878868972, -0.43392310563149517 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector69_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.0, 420.0, 0.0, 81.90153936360892, 446.03415843634286, 0.0, 3.141592653589793, -0.7931126206749131, 0.9999999999999992,
			107.53708615886694, 420.0, 36.53708615886694, -3.141592653589793, -0.7931126206749133,
			56.265992568350846, 472.0683168726858, 36.537086158867005, -0.7931126206749133, -0.0 ),
       new MarkupSegmentLine( 81.90153936360892, 446.03415843634286, 0.0, 97.16138347743842, 461.06035752877534, 0.0 ),
       new MarkupSegmentArc( 97.16138347743842, 461.06035752877534, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 2.34848003291488, 0.020380669089323566, 1.0000000000000007,
			122.08107743943964, 435.75318284772186, 35.516816263527275, -3.934705274264706, -0.0,
			72.24168951543723, 486.3675322098288, 35.51681626352724, -0.7931126206749133, 0.8134932897642386 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector70_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.0, 420.0, 0.0, 73.97734907416782, 446.50338362514714, 0.0, 3.141592653589793, -0.22373886008422939, 0.9999999999999994,
			190.45088287808056, 420.0, 119.45088287808055, -3.141592653589793, -0.22373886008422958,
			-42.49618472974501, 473.0067672502942, 119.45088287808065, -0.2237388600842295, -0.0 ),
       new MarkupSegmentLine( 73.97734907416782, 446.50338362514714, 0.0, 77.05306340474318, 460.02012254875916, 0.0 ),
       new MarkupSegmentArc( 77.05306340474318, 460.02012254875916, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 2.9178537935055635, 0.020380669089323122, 1.0000000000000042,
			-29.61117493067374, 484.2914152223975, 109.39083776863598, -0.2237388600842295, 0.24411952917355453,
			189.1250643241321, 488.7500234761106, 109.39083776863505, -3.121211984500467, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector71_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.0, 420.0, 0.0, 78.23763931749339, 446.23304066147494, 0.0, 3.141592653589793, -0.5384014721200971, 1.0000000000000016,
			122.16004077785405, 420.0, 51.16004077785406, -3.141592653589793, -0.538401472120097,
			34.31523785713288, 472.4660813229498, 51.160040777853894, -0.5384014721200973, -0.0 ),
       new MarkupSegmentLine( 78.23763931749339, 446.23304066147494, 0.0, 86.8040499839896, 460.5759196751427, 0.0 ),
       new MarkupSegmentArc( 86.8040499839896, 460.5759196751427, 0.0, 93.75403719566516, 486.80602896395874, 0.0, 2.603191181469696, 0.02038066908932268, 0.9999999999999993,
			129.0428098131315, 435.3484487890584, 49.19896461524532, -3.6799941257098903, -0.0,
			44.565290154847624, 485.803390561227, 49.198964615245394, -0.5384014721200973, 0.5587821412094225 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector72_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.85841808868926, 400.91797209918536, 0.0, 152.85734197910062, 400.9179718117963, 0.0 ),
       new MarkupSegmentArc( 152.85734197910062, 400.9179718117963, 0.0, 65.75985219779412, 486.2354097345494, 0.0, -1.5705292637975985, 0.020380669089322456, 0.999999999999997,
			152.88060111427373, 313.82565705671277, 87.09231786091073, -4.7121219173873925, -0.0,
			152.83408284392766, 488.0102865668804, 87.09231786091128, -1.5705292637975994, -1.5506827207028737 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector73_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85841808868926, 400.91797209918536, 0.0, 94.33622869665143, 458.24411632097224, 0.0, -1.5705292637975985, 0.02038066908932401, 1.0000000000000027,
			152.87404627174152, 342.3992598896177, 58.518714296422324, -4.7121219173873925, -0.0,
			152.84278990563712, 459.43668430875266, 58.51871429642202, -1.5705292637975996, -1.5506827207028675 ),
       new MarkupSegmentLine( 94.33622869665143, 458.24411632097224, 0.0, 93.75403719566516, 486.80602896395874, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector74_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85841808868926, 400.91797209918536, 0.0, 80.0480294820648, 472.2403009708318, 0.0, -1.5705292637975985, 0.02038066908932401, 1.0000000000000027,
			152.87786189441616, 328.1119096295278, 72.80606506601808, -4.7121219173873925, -0.0,
			152.8389742829625, 473.7240345688425, 72.8060650660177, -1.5705292637975996, -1.5506827207028675 ),
       new MarkupSegmentLine( 80.0480294820648, 472.2403009708318, 0.0, 79.75694469672965, 486.5207193492541, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector75_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85841808868926, 400.91797209918536, 0.0, 108.62442791123807, 444.24793167111267, 0.0, -1.5705292637975985, 0.020380669089322456, 0.999999999999997,
			152.8702306490669, 356.68661014970826, 44.23136352682599, -4.7121219173873925, -0.0,
			152.84660552831167, 445.14933404866275, 44.231363526826264, -1.570529263797599, -1.5506827207028742 ),
       new MarkupSegmentLine( 108.62442791123807, 444.24793167111267, 0.0, 107.75112969460068, 487.0913385786634, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector76_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.85467920677155, 414.91797159992683, 0.0, 152.85360309718294, 414.91797131253776, 0.0 ),
       new MarkupSegmentArc( 152.85360309718294, 414.91797131253776, 0.0, 79.75694469672965, 486.5207193492541, 0.0, -1.5705292637976043, 0.020380669089322456, 0.9999999999999998,
			152.834082843928, 488.0102865668807, 73.09231786091163, -1.570529263797604, -1.550682720702863,
			6.679806549531236, 485.0311521316278, 73.09231786091168, -6.262804638090255, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector77_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.85467920677155, 414.91797159992683, 0.0, 138.56914276451403, 414.91415646165586, 0.0 ),
       new MarkupSegmentArc( 138.56914276451403, 414.91415646165586, 0.0, 65.75985219779412, 486.2354097345494, 0.0, -1.5705292637975985, 0.020380669089322456, 0.9999999999999998,
			138.5885862770125, 342.1091919666617, 72.80496709131556, -4.7121219173873925, -0.0,
			138.5496992520156, 487.7191209566501, 72.8049670913156, -1.570529263797599, -1.5506827207028682 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector78_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.85094032485387, 428.9179711006683, 0.0, 124.2809435499274, 428.91034111151544, 0.0 ),
       new MarkupSegmentArc( 124.2809435499274, 428.91034111151544, 0.0, 65.75985219779412, 486.2354097345494, 0.0, -1.5705292637976043, 0.020380669089322456, 0.9999999999999998,
			124.26531566010388, 487.42795534642005, 58.5176163217202, -1.5705292637976045, -1.5506827207028575,
			7.254388735484326, 485.042864122679, 58.517616321720226, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector79_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.85094032485387, 428.9179711006683, 0.0, 152.84986421526523, 428.9179708132793, 0.0 ),
       new MarkupSegmentArc( 152.84986421526523, 428.9179708132793, 0.0, 93.75403719566516, 486.80602896395874, 0.0, -1.5705292637975985, 0.020380669089322456, 0.9999999999999998,
			152.86564558660285, 369.82565505967824, 59.0923178609112, -4.7121219173873925, -0.0,
			152.8340828439276, 488.0102865668803, 59.09231786091124, -1.5705292637975987, -1.5506827207028686 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector80_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 152.85094032485387, 428.9179711006683, 0.0, 138.5654038825963, 428.91415596239733, 0.0 ),
       new MarkupSegmentArc( 138.5654038825963, 428.91415596239733, 0.0, 79.75694469672965, 486.5207193492541, 0.0, -1.5705292637976043, 0.020380669089322456, 0.9999999999999998,
			138.5496992520159, 487.71912095665033, 58.804967091315866, -1.570529263797604, -1.5506827207028688,
			20.96419014144334, 485.32231774185806, 58.80496709131591, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector81_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85094032485387, 428.9179711006683, 0.0, 108.04221447993585, 472.8109202002412, 0.0, -1.5705292637976043, 0.02038066908932379, 0.9999999999999998,
			152.8389742829627, 473.7240345688427, 44.80606506601788, -1.5705292637976045, -1.5506827207028575,
			63.24545467690898, 471.89780583163986, 44.8060650660179, -6.262804638090266, -0.0 ),
       new MarkupSegmentLine( 108.04221447993585, 472.8109202002412, 0.0, 107.75112969460068, 487.0913385786634, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector83_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85841808868926, 400.91797209918536, 0.0, 116.7533131665767, 415.748137290188, 0.0, -1.5705292637975994, 0.7910513186527546, 1.0,
			152.84470922497513, 452.24991822030347, 51.331947951683226, -1.5705292637975994, -0.7800120711394394,
			80.6619171081783, 379.2463563600726, 51.331947951683226, -5.492133988526832, -0.0 ),
       new MarkupSegmentLine( 116.7533131665767, 415.748137290188, 0.0, 96.10510567458827, 436.16419961646505, 0.0 ),
       new MarkupSegmentArc( 96.10510567458827, 436.16419961646505, 0.0, 60.0, 451.0, 0.0, 3.9326439722425475, 1.5707963267948966, 0.9999999999999987,
			132.21021134917646, 472.67984605086815, 51.35144681793799, -2.350541334937039, -0.0,
			60.0, 399.6485531820619, 51.35144681793813, -5.492133988526832, 0.7797450081421423 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector84_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85467920677155, 414.91797159992683, 0.0, 116.751055149274, 429.7480330674749, 0.0, -1.5705292637975994, 0.791027403943091, 1.000000000000001,
			152.84097123675156, 466.2465713415869, 51.328601572105896, -1.5705292637975994, -0.7800359858491024,
			80.66113906179649, 393.249494793363, 51.32860157210579, -5.492157903236495, -0.0 ),
       new MarkupSegmentLine( 116.751055149274, 429.7480330674749, 0.0, 96.1036248099498, 450.16430351567493, 0.0 ),
       new MarkupSegmentArc( 96.1036248099498, 450.16430351567493, 0.0, 60.0, 465.0, 0.0, 3.9326200575328847, 1.5707963267948966, 0.9999999999999997,
			60.000000000000014, 413.6519013043171, 51.34809869568286, -5.492157903236495, 0.7797689228518048,
			60.0, 516.3480986956829, 51.34809869568291, -1.5707963267948963, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector85_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.85094032485387, 428.9179711006683, 0.0, 116.74879712710461, 443.7479288372154, 0.0, -1.570529263797602, 0.7910034879589364, 1.0000000000000016,
			152.83723324849294, 480.24322459480936, 51.325255324467534, -1.570529263797602, -0.7800599018332542,
			80.66036100571637, 407.25263307962155, 51.32525532446738, -5.49218181922065, -0.0 ),
       new MarkupSegmentLine( 116.74879712710461, 443.7479288372154, 0.0, 96.10214395017802, 464.16440742242963, 0.0 ),
       new MarkupSegmentArc( 96.10214395017802, 464.16440742242963, 0.0, 60.0, 479.0, 0.0, 3.9325961415487276, 1.5707963267948966, 1.000000000000001,
			60.0, 427.65524929451334, 51.344750705486646, -5.492181819220651, 0.7797928388359618,
			60.0, 530.3447507054866, 51.344750705486554, -1.5707963267948966, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector86_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 152.84720144293613, 442.9179706014098, 0.0, 116.74653910006774, 457.74782459940883, 0.0, -1.5705292637975998, 0.7909795707002015, 0.9999999999999994,
			152.83349526019876, 494.23987797996966, 51.32190920876697, -1.5705292637975998, -0.780083819091992,
			80.65958293993668, 421.25577121884794, 51.32190920876701, -5.492205736479384, -0.0 ),
       new MarkupSegmentLine( 116.74653910006774, 457.74782459940883, 0.0, 96.10066309527372, 478.1645113367298, 0.0 ),
       new MarkupSegmentArc( 96.10066309527372, 478.1645113367298, 0.0, 60.0, 493.0, 0.0, 3.9325722242899928, 1.5707963267948966, 1.000000000000001,
			132.20132619054752, 514.670425520809, 51.34140284734937, -2.350613082889593, -0.0,
			60.0, 441.65859715265077, 51.341402847349244, -5.492205736479386, 0.7798167560946967 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector87_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 71.0, 420.0, 0.0, 71.0, 440.0, 0.0 ),
       new MarkupSegmentArc( 71.0, 440.0, 0.0, 60.0, 451.0, 0.0, 3.141592653589793, 1.5707963267948966, 1.0,
			82.0, 440.0, 11.0, -3.141592653589793, -0.0,
			60.0, 440.0, 11.0, -0.0, 1.5707963267948966 ), };
  }
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void _stopLine_onCarPassed_xjal(StopLine self, Agent car, int laneIndex) {
	
 
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void _stopLine1_onCarPassed_xjal(StopLine self, Agent car, int laneIndex) {
	
 
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void _stopLine3_onCarPassed_xjal(StopLine self, Agent car, int laneIndex) {
	
 
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public void _stopLine2_onCarPassed_xjal(StopLine self, Agent car, int laneIndex) {
	
 
  }
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
  }

  protected Road road;
  protected StopLine stopLine;
  protected Road road1;
  protected Road road2;
  protected StopLine stopLine1;
  protected Road road3;
  protected StopLine stopLine3;
  protected Road road4;
  protected StopLine stopLine2;
  protected Road road6;
  protected Road road5;
  protected Intersection intersection;
  protected RoadLanesConnector laneConnector1;
  protected RoadLanesConnector laneConnector2;
  protected RoadLanesConnector laneConnector3;
  protected RoadLanesConnector laneConnector4;
  protected RoadLanesConnector laneConnector27;
  protected RoadLanesConnector laneConnector28;
  protected RoadLanesConnector laneConnector29;
  protected RoadLanesConnector laneConnector30;
  protected RoadLanesConnector laneConnector31;
  protected RoadLanesConnector laneConnector41;
  protected RoadLanesConnector laneConnector42;
  protected RoadLanesConnector laneConnector43;
  protected RoadLanesConnector laneConnector44;
  protected RoadLanesConnector laneConnector5;
  protected RoadLanesConnector laneConnector10;
  protected RoadLanesConnector laneConnector11;
  protected RoadLanesConnector laneConnector12;
  protected RoadLanesConnector laneConnector13;
  protected RoadLanesConnector laneConnector15;
  protected RoadLanesConnector laneConnector16;
  protected RoadLanesConnector laneConnector21;
  protected RoadLanesConnector laneConnector45;
  protected RoadLanesConnector laneConnector46;
  protected RoadLanesConnector laneConnector48;
  protected RoadLanesConnector laneConnector49;
  protected RoadLanesConnector laneConnector50;
  protected RoadLanesConnector laneConnector51;
  protected RoadLanesConnector laneConnector52;
  protected RoadLanesConnector laneConnector6;
  protected RoadLanesConnector laneConnector7;
  protected RoadLanesConnector laneConnector8;
  protected RoadLanesConnector laneConnector9;
  protected RoadLanesConnector laneConnector17;
  protected RoadLanesConnector laneConnector18;
  protected RoadLanesConnector laneConnector19;
  protected RoadLanesConnector laneConnector20;
  protected RoadLanesConnector laneConnector22;
  protected RoadLanesConnector laneConnector37;
  protected RoadLanesConnector laneConnector14;
  protected RoadLanesConnector laneConnector38;
  protected RoadLanesConnector laneConnector39;
  protected RoadLanesConnector laneConnector24;
  protected RoadLanesConnector laneConnector47;
  protected RoadLanesConnector laneConnector53;
  protected RoadLanesConnector laneConnector54;
  protected RoadLanesConnector laneConnector55;
  protected RoadLanesConnector laneConnector56;
  protected RoadLanesConnector laneConnector57;
  protected RoadLanesConnector laneConnector58;
  protected RoadLanesConnector laneConnector59;
  protected RoadLanesConnector laneConnector60;
  protected RoadLanesConnector laneConnector61;
  protected RoadLanesConnector laneConnector62;
  protected Intersection intersection1;
  protected RoadLanesConnector laneConnector23;
  protected RoadLanesConnector laneConnector25;
  protected RoadLanesConnector laneConnector26;
  protected RoadLanesConnector laneConnector32;
  protected RoadLanesConnector laneConnector33;
  protected RoadLanesConnector laneConnector34;
  protected RoadLanesConnector laneConnector35;
  protected RoadLanesConnector laneConnector;
  protected RoadLanesConnector laneConnector36;
  protected RoadLanesConnector laneConnector40;
  protected RoadLanesConnector laneConnector63;
  protected RoadLanesConnector laneConnector64;
  protected RoadLanesConnector laneConnector65;
  protected RoadLanesConnector laneConnector66;
  protected RoadLanesConnector laneConnector67;
  protected RoadLanesConnector laneConnector68;
  protected RoadLanesConnector laneConnector69;
  protected RoadLanesConnector laneConnector70;
  protected RoadLanesConnector laneConnector71;
  protected RoadLanesConnector laneConnector72;
  protected RoadLanesConnector laneConnector73;
  protected RoadLanesConnector laneConnector74;
  protected RoadLanesConnector laneConnector75;
  protected RoadLanesConnector laneConnector76;
  protected RoadLanesConnector laneConnector77;
  protected RoadLanesConnector laneConnector78;
  protected RoadLanesConnector laneConnector79;
  protected RoadLanesConnector laneConnector80;
  protected RoadLanesConnector laneConnector81;
  protected RoadLanesConnector laneConnector83;
  protected RoadLanesConnector laneConnector84;
  protected RoadLanesConnector laneConnector85;
  protected RoadLanesConnector laneConnector86;
  protected RoadLanesConnector laneConnector87;
  protected com.anylogic.engine.markup.RoadNetwork roadNetwork;

  private com.anylogic.engine.markup.RoadNetwork[] _getRoadNetworks_xjal;

  @Override
  public com.anylogic.engine.markup.RoadNetwork[] getRoadNetworks() {
    return _getRoadNetworks_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    road = new Road( this, SHAPE_DRAW_2D3D, true, 4, 4, 0.0, green, _road_segments_xjal() );
    stopLine = new StopLine( road, SHAPE_DRAW_2D3D, true, true, 177.29336648946722, 0, 3 ) {
	@AnyLogicInternalCodegenAPI
	public void onCarPassed(Agent car, int laneIndex) {
		_stopLine_onCarPassed_xjal(this, car, laneIndex);
	}
    };
    road1 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 4, 0.0, green, _road1_segments_xjal() );
    road2 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road2_segments_xjal() );
    stopLine1 = new StopLine( road2, SHAPE_DRAW_2D3D, true, true, 182.0, 0, 3 ) {
	@AnyLogicInternalCodegenAPI
	public void onCarPassed(Agent car, int laneIndex) {
		_stopLine1_onCarPassed_xjal(this, car, laneIndex);
	}
    };
    road3 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 4, 0.0, green, _road3_segments_xjal() );
    stopLine3 = new StopLine( road3, SHAPE_DRAW_2D3D, true, false, 8.0, 0, 3 ) {
	@AnyLogicInternalCodegenAPI
	public void onCarPassed(Agent car, int laneIndex) {
		_stopLine3_onCarPassed_xjal(this, car, laneIndex);
	}
    };
    road4 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road4_segments_xjal() );
    stopLine2 = new StopLine( road4, SHAPE_DRAW_2D3D, true, true, 649.1546789515646, 0, 3 ) {
	@AnyLogicInternalCodegenAPI
	public void onCarPassed(Agent car, int laneIndex) {
		_stopLine2_onCarPassed_xjal(this, car, laneIndex);
	}
    };
    road6 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road6_segments_xjal() );
    road5 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road5_segments_xjal() );
	laneConnector1 = new RoadLanesConnector( road, 3, road, 0, _laneConnector1_segments_xjal() );
	laneConnector2 = new RoadLanesConnector( road, 3, road, 1, _laneConnector2_segments_xjal() );
	laneConnector3 = new RoadLanesConnector( road, 3, road, 2, _laneConnector3_segments_xjal() );
	laneConnector4 = new RoadLanesConnector( road, 3, road, 3, _laneConnector4_segments_xjal() );
	laneConnector27 = new RoadLanesConnector( road3, 0, road, 0, _laneConnector27_segments_xjal() );
	laneConnector28 = new RoadLanesConnector( road, 3, road3, 0, _laneConnector28_segments_xjal() );
	laneConnector29 = new RoadLanesConnector( road, 3, road3, 1, _laneConnector29_segments_xjal() );
	laneConnector30 = new RoadLanesConnector( road, 3, road3, 2, _laneConnector30_segments_xjal() );
	laneConnector31 = new RoadLanesConnector( road, 3, road3, 3, _laneConnector31_segments_xjal() );
	laneConnector41 = new RoadLanesConnector( road3, 3, road3, 0, _laneConnector41_segments_xjal() );
	laneConnector42 = new RoadLanesConnector( road3, 3, road3, 1, _laneConnector42_segments_xjal() );
	laneConnector43 = new RoadLanesConnector( road3, 3, road3, 2, _laneConnector43_segments_xjal() );
	laneConnector44 = new RoadLanesConnector( road3, 3, road3, 3, _laneConnector44_segments_xjal() );
	laneConnector5 = new RoadLanesConnector( road1, 3, road, 0, _laneConnector5_segments_xjal() );
	laneConnector10 = new RoadLanesConnector( road1, 3, road, 1, _laneConnector10_segments_xjal() );
	laneConnector11 = new RoadLanesConnector( road1, 3, road, 2, _laneConnector11_segments_xjal() );
	laneConnector12 = new RoadLanesConnector( road1, 3, road, 3, _laneConnector12_segments_xjal() );
	laneConnector13 = new RoadLanesConnector( road, 0, road1, 0, _laneConnector13_segments_xjal() );
	laneConnector15 = new RoadLanesConnector( road1, 3, road1, 1, _laneConnector15_segments_xjal() );
	laneConnector16 = new RoadLanesConnector( road1, 3, road1, 2, _laneConnector16_segments_xjal() );
	laneConnector21 = new RoadLanesConnector( road1, 3, road1, 3, _laneConnector21_segments_xjal() );
	laneConnector45 = new RoadLanesConnector( road1, 0, road3, 0, _laneConnector45_segments_xjal() );
	laneConnector46 = new RoadLanesConnector( road1, 1, road3, 1, _laneConnector46_segments_xjal() );
	laneConnector48 = new RoadLanesConnector( road1, 3, road3, 3, _laneConnector48_segments_xjal() );
	laneConnector49 = new RoadLanesConnector( road3, 0, road1, 0, _laneConnector49_segments_xjal() );
	laneConnector50 = new RoadLanesConnector( road3, 1, road1, 1, _laneConnector50_segments_xjal() );
	laneConnector51 = new RoadLanesConnector( road3, 2, road1, 2, _laneConnector51_segments_xjal() );
	laneConnector52 = new RoadLanesConnector( road3, 3, road1, 3, _laneConnector52_segments_xjal() );
	laneConnector6 = new RoadLanesConnector( road, 0, road2, 0, _laneConnector6_segments_xjal() );
	laneConnector7 = new RoadLanesConnector( road, 1, road2, 1, _laneConnector7_segments_xjal() );
	laneConnector8 = new RoadLanesConnector( road, 2, road2, 2, _laneConnector8_segments_xjal() );
	laneConnector9 = new RoadLanesConnector( road, 3, road2, 3, _laneConnector9_segments_xjal() );
	laneConnector17 = new RoadLanesConnector( road1, 0, road2, 0, _laneConnector17_segments_xjal() );
	laneConnector18 = new RoadLanesConnector( road3, 3, road2, 0, _laneConnector18_segments_xjal() );
	laneConnector19 = new RoadLanesConnector( road3, 3, road2, 1, _laneConnector19_segments_xjal() );
	laneConnector20 = new RoadLanesConnector( road3, 3, road2, 2, _laneConnector20_segments_xjal() );
	laneConnector22 = new RoadLanesConnector( road3, 3, road2, 3, _laneConnector22_segments_xjal() );
	laneConnector37 = new RoadLanesConnector( road1, 2, road1, 0, _laneConnector37_segments_xjal() );
	laneConnector14 = new RoadLanesConnector( road1, 2, road, 1, _laneConnector14_segments_xjal() );
	laneConnector38 = new RoadLanesConnector( road1, 2, road2, 2, _laneConnector38_segments_xjal() );
	laneConnector39 = new RoadLanesConnector( road1, 2, road, 0, _laneConnector39_segments_xjal() );
	laneConnector24 = new RoadLanesConnector( road, 1, road1, 0, _laneConnector24_segments_xjal() );
	laneConnector47 = new RoadLanesConnector( road3, 2, road1, 0, _laneConnector47_segments_xjal() );
	laneConnector53 = new RoadLanesConnector( road3, 3, road1, 0, _laneConnector53_segments_xjal() );
	laneConnector54 = new RoadLanesConnector( road1, 0, road1, 0, _laneConnector54_segments_xjal() );
	laneConnector55 = new RoadLanesConnector( road3, 1, road1, 0, _laneConnector55_segments_xjal() );
	laneConnector56 = new RoadLanesConnector( road, 1, road, 0, _laneConnector56_segments_xjal() );
	laneConnector57 = new RoadLanesConnector( road1, 0, road, 3, _laneConnector57_segments_xjal() );
	laneConnector58 = new RoadLanesConnector( road3, 2, road, 3, _laneConnector58_segments_xjal() );
	laneConnector59 = new RoadLanesConnector( road3, 3, road, 1, _laneConnector59_segments_xjal() );
	laneConnector60 = new RoadLanesConnector( road1, 0, road, 1, _laneConnector60_segments_xjal() );
	laneConnector61 = new RoadLanesConnector( road, 1, road2, 3, _laneConnector61_segments_xjal() );
	laneConnector62 = new RoadLanesConnector( road, 2, road2, 3, _laneConnector62_segments_xjal() );
	laneConnector23 = new RoadLanesConnector( road2, 0, road6, 0, _laneConnector23_segments_xjal() );
	laneConnector25 = new RoadLanesConnector( road2, 2, road6, 2, _laneConnector25_segments_xjal() );
	laneConnector26 = new RoadLanesConnector( road2, 3, road6, 3, _laneConnector26_segments_xjal() );
	laneConnector32 = new RoadLanesConnector( road4, 3, road6, 0, _laneConnector32_segments_xjal() );
	laneConnector33 = new RoadLanesConnector( road4, 3, road6, 1, _laneConnector33_segments_xjal() );
	laneConnector34 = new RoadLanesConnector( road4, 3, road6, 2, _laneConnector34_segments_xjal() );
	laneConnector35 = new RoadLanesConnector( road4, 3, road6, 3, _laneConnector35_segments_xjal() );
	laneConnector = new RoadLanesConnector( road4, 1, road6, 3, _laneConnector_segments_xjal() );
	laneConnector36 = new RoadLanesConnector( road2, 3, road6, 1, _laneConnector36_segments_xjal() );
	laneConnector40 = new RoadLanesConnector( road2, 1, road6, 1, _laneConnector40_segments_xjal() );
	laneConnector63 = new RoadLanesConnector( road2, 1, road6, 3, _laneConnector63_segments_xjal() );
	laneConnector64 = new RoadLanesConnector( road2, 1, road6, 0, _laneConnector64_segments_xjal() );
	laneConnector65 = new RoadLanesConnector( road2, 3, road6, 2, _laneConnector65_segments_xjal() );
	laneConnector66 = new RoadLanesConnector( road2, 2, road6, 0, _laneConnector66_segments_xjal() );
	laneConnector67 = new RoadLanesConnector( road2, 2, road6, 3, _laneConnector67_segments_xjal() );
	laneConnector68 = new RoadLanesConnector( road2, 2, road6, 1, _laneConnector68_segments_xjal() );
	laneConnector69 = new RoadLanesConnector( road2, 0, road6, 3, _laneConnector69_segments_xjal() );
	laneConnector70 = new RoadLanesConnector( road2, 0, road6, 1, _laneConnector70_segments_xjal() );
	laneConnector71 = new RoadLanesConnector( road2, 0, road6, 2, _laneConnector71_segments_xjal() );
	laneConnector72 = new RoadLanesConnector( road4, 0, road6, 0, _laneConnector72_segments_xjal() );
	laneConnector73 = new RoadLanesConnector( road4, 0, road6, 2, _laneConnector73_segments_xjal() );
	laneConnector74 = new RoadLanesConnector( road4, 0, road6, 1, _laneConnector74_segments_xjal() );
	laneConnector75 = new RoadLanesConnector( road4, 0, road6, 3, _laneConnector75_segments_xjal() );
	laneConnector76 = new RoadLanesConnector( road4, 1, road6, 1, _laneConnector76_segments_xjal() );
	laneConnector77 = new RoadLanesConnector( road4, 1, road6, 0, _laneConnector77_segments_xjal() );
	laneConnector78 = new RoadLanesConnector( road4, 2, road6, 0, _laneConnector78_segments_xjal() );
	laneConnector79 = new RoadLanesConnector( road4, 2, road6, 2, _laneConnector79_segments_xjal() );
	laneConnector80 = new RoadLanesConnector( road4, 2, road6, 1, _laneConnector80_segments_xjal() );
	laneConnector81 = new RoadLanesConnector( road4, 2, road6, 3, _laneConnector81_segments_xjal() );
	laneConnector83 = new RoadLanesConnector( road4, 0, road5, 0, _laneConnector83_segments_xjal() );
	laneConnector84 = new RoadLanesConnector( road4, 1, road5, 1, _laneConnector84_segments_xjal() );
	laneConnector85 = new RoadLanesConnector( road4, 2, road5, 2, _laneConnector85_segments_xjal() );
	laneConnector86 = new RoadLanesConnector( road4, 3, road5, 3, _laneConnector86_segments_xjal() );
	laneConnector87 = new RoadLanesConnector( road2, 0, road5, 0, _laneConnector87_segments_xjal() );
    intersection = new Intersection( this, SHAPE_DRAW_2D3D, true, true, new RoadEnd[] {
			new RoadEnd( road, RoadEnd.Type.END ),
			new RoadEnd( road1, RoadEnd.Type.BEGIN ),
			new RoadEnd( road2, RoadEnd.Type.BEGIN ),
			new RoadEnd( road3, RoadEnd.Type.BEGIN ),
		}, _intersection_laneConnectors_xjal()
 );
  }
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP1_xjal() {
    intersection1 = new Intersection( this, SHAPE_DRAW_2D3D, true, true, new RoadEnd[] {
			new RoadEnd( road2, RoadEnd.Type.END ),
			new RoadEnd( road4, RoadEnd.Type.END ),
			new RoadEnd( road6, RoadEnd.Type.BEGIN ),
			new RoadEnd( road5, RoadEnd.Type.BEGIN ),
		}, _intersection1_laneConnectors_xjal()
 );
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }


  // Static initialization of persistent elements
  {
	roadNetwork = new com.anylogic.engine.markup.RoadNetwork(this, "roadNetwork", SHAPE_DRAW_2D3D, true, true, ROAD_RIGHT_HAND, 3.5, gray, white, ROAD_LINE_SINGLE_DASHED, white, ROAD_LINE_SINGLE, true);
			
	_getRoadNetworks_xjal = new com.anylogic.engine.markup.RoadNetwork[] { 
      roadNetwork };
    _createPersistentElementsBP0_xjal();
    _createPersistentElementsBP1_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape( int _shape ) {
    switch (_shape) {
      case _presentation: return presentation;
      case _icon: return icon;
      case _road: return road;
      case _stopLine: return stopLine;
      case _road1: return road1;
      case _road2: return road2;
      case _stopLine1: return stopLine1;
      case _road3: return road3;
      case _stopLine3: return stopLine3;
      case _road4: return road4;
      case _stopLine2: return stopLine2;
      case _road6: return road6;
      case _road5: return road5;
      case _intersection: return intersection;
      case _laneConnector1: return laneConnector1;
      case _laneConnector2: return laneConnector2;
      case _laneConnector3: return laneConnector3;
      case _laneConnector4: return laneConnector4;
      case _laneConnector27: return laneConnector27;
      case _laneConnector28: return laneConnector28;
      case _laneConnector29: return laneConnector29;
      case _laneConnector30: return laneConnector30;
      case _laneConnector31: return laneConnector31;
      case _laneConnector41: return laneConnector41;
      case _laneConnector42: return laneConnector42;
      case _laneConnector43: return laneConnector43;
      case _laneConnector44: return laneConnector44;
      case _laneConnector5: return laneConnector5;
      case _laneConnector10: return laneConnector10;
      case _laneConnector11: return laneConnector11;
      case _laneConnector12: return laneConnector12;
      case _laneConnector13: return laneConnector13;
      case _laneConnector15: return laneConnector15;
      case _laneConnector16: return laneConnector16;
      case _laneConnector21: return laneConnector21;
      case _laneConnector45: return laneConnector45;
      case _laneConnector46: return laneConnector46;
      case _laneConnector48: return laneConnector48;
      case _laneConnector49: return laneConnector49;
      case _laneConnector50: return laneConnector50;
      case _laneConnector51: return laneConnector51;
      case _laneConnector52: return laneConnector52;
      case _laneConnector6: return laneConnector6;
      case _laneConnector7: return laneConnector7;
      case _laneConnector8: return laneConnector8;
      case _laneConnector9: return laneConnector9;
      case _laneConnector17: return laneConnector17;
      case _laneConnector18: return laneConnector18;
      case _laneConnector19: return laneConnector19;
      case _laneConnector20: return laneConnector20;
      case _laneConnector22: return laneConnector22;
      case _laneConnector37: return laneConnector37;
      case _laneConnector14: return laneConnector14;
      case _laneConnector38: return laneConnector38;
      case _laneConnector39: return laneConnector39;
      case _laneConnector24: return laneConnector24;
      case _laneConnector47: return laneConnector47;
      case _laneConnector53: return laneConnector53;
      case _laneConnector54: return laneConnector54;
      case _laneConnector55: return laneConnector55;
      case _laneConnector56: return laneConnector56;
      case _laneConnector57: return laneConnector57;
      case _laneConnector58: return laneConnector58;
      case _laneConnector59: return laneConnector59;
      case _laneConnector60: return laneConnector60;
      case _laneConnector61: return laneConnector61;
      case _laneConnector62: return laneConnector62;
      case _intersection1: return intersection1;
      case _laneConnector23: return laneConnector23;
      case _laneConnector25: return laneConnector25;
      case _laneConnector26: return laneConnector26;
      case _laneConnector32: return laneConnector32;
      case _laneConnector33: return laneConnector33;
      case _laneConnector34: return laneConnector34;
      case _laneConnector35: return laneConnector35;
      case _laneConnector: return laneConnector;
      case _laneConnector36: return laneConnector36;
      case _laneConnector40: return laneConnector40;
      case _laneConnector63: return laneConnector63;
      case _laneConnector64: return laneConnector64;
      case _laneConnector65: return laneConnector65;
      case _laneConnector66: return laneConnector66;
      case _laneConnector67: return laneConnector67;
      case _laneConnector68: return laneConnector68;
      case _laneConnector69: return laneConnector69;
      case _laneConnector70: return laneConnector70;
      case _laneConnector71: return laneConnector71;
      case _laneConnector72: return laneConnector72;
      case _laneConnector73: return laneConnector73;
      case _laneConnector74: return laneConnector74;
      case _laneConnector75: return laneConnector75;
      case _laneConnector76: return laneConnector76;
      case _laneConnector77: return laneConnector77;
      case _laneConnector78: return laneConnector78;
      case _laneConnector79: return laneConnector79;
      case _laneConnector80: return laneConnector80;
      case _laneConnector81: return laneConnector81;
      case _laneConnector83: return laneConnector83;
      case _laneConnector84: return laneConnector84;
      case _laneConnector85: return laneConnector85;
      case _laneConnector86: return laneConnector86;
      case _laneConnector87: return laneConnector87;
      default: return super.getPersistentShape( _shape ); 
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOfShape_xjal( Object _shape ) {
    try {
      if ( _shape == null ) return null;
      String _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, presentation, "presentation" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, icon, "icon" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road, "road" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, stopLine, "stopLine" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road1, "road1" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road2, "road2" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, stopLine1, "stopLine1" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road3, "road3" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, stopLine3, "stopLine3" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road4, "road4" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, stopLine2, "stopLine2" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road6, "road6" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, road5, "road5" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, intersection, "intersection" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector1, "laneConnector1" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector2, "laneConnector2" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector3, "laneConnector3" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector4, "laneConnector4" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector27, "laneConnector27" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector28, "laneConnector28" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector29, "laneConnector29" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector30, "laneConnector30" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector31, "laneConnector31" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector41, "laneConnector41" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector42, "laneConnector42" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector43, "laneConnector43" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector44, "laneConnector44" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector5, "laneConnector5" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector10, "laneConnector10" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector11, "laneConnector11" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector12, "laneConnector12" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector13, "laneConnector13" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector15, "laneConnector15" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector16, "laneConnector16" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector21, "laneConnector21" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector45, "laneConnector45" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector46, "laneConnector46" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector48, "laneConnector48" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector49, "laneConnector49" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector50, "laneConnector50" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector51, "laneConnector51" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector52, "laneConnector52" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector6, "laneConnector6" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector7, "laneConnector7" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector8, "laneConnector8" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector9, "laneConnector9" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector17, "laneConnector17" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector18, "laneConnector18" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector19, "laneConnector19" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector20, "laneConnector20" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector22, "laneConnector22" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector37, "laneConnector37" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector14, "laneConnector14" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector38, "laneConnector38" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector39, "laneConnector39" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector24, "laneConnector24" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector47, "laneConnector47" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector53, "laneConnector53" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector54, "laneConnector54" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector55, "laneConnector55" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector56, "laneConnector56" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector57, "laneConnector57" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector58, "laneConnector58" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector59, "laneConnector59" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector60, "laneConnector60" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector61, "laneConnector61" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector62, "laneConnector62" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, intersection1, "intersection1" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector23, "laneConnector23" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector25, "laneConnector25" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector26, "laneConnector26" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector32, "laneConnector32" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector33, "laneConnector33" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector34, "laneConnector34" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector35, "laneConnector35" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector, "laneConnector" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector36, "laneConnector36" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector40, "laneConnector40" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector63, "laneConnector63" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector64, "laneConnector64" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector65, "laneConnector65" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector66, "laneConnector66" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector67, "laneConnector67" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector68, "laneConnector68" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector69, "laneConnector69" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector70, "laneConnector70" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector71, "laneConnector71" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector72, "laneConnector72" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector73, "laneConnector73" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector74, "laneConnector74" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector75, "laneConnector75" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector76, "laneConnector76" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector77, "laneConnector77" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector78, "laneConnector78" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector79, "laneConnector79" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector80, "laneConnector80" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector81, "laneConnector81" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector83, "laneConnector83" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector84, "laneConnector84" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector85, "laneConnector85" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector86, "laneConnector86" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector87, "laneConnector87" ); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int[] _connector_pointsX_xjal = {
    200,  290 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _connector_pointsY_xjal = {
    250,250 };

  @AnyLogicInternalCodegenAPI
  protected static final int[] _connector1_pointsX_xjal = {
    330,  410 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _connector1_pointsY_xjal = {
    250,250 };

  @AnyLogicInternalCodegenAPI
  protected static final int[] _connector2_pointsX_xjal = {
    200,  300 };
  @AnyLogicInternalCodegenAPI
  protected static final int[] _connector2_pointsY_xjal = {
    350,350 };


  @AnyLogicInternalCodegenAPI
  private void drawModelElements_EmbeddeObjects_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    // Embedded object "carSource"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, -200 , 440 , 360, -220, "carSource", this.carSource );
    }
    // Embedded object "carMoveTo"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 90 , 440 , 185, -220, "carMoveTo", this.carMoveTo );
    }
    // Embedded object "carDispose"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 210 , 460 , 170, -240, "carDispose", this.carDispose );
    }
    // Embedded object "carSource1"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, -200 , 540 , 360, -220, "carSource1", this.carSource1 );
    }
    // Embedded object "carMoveTo1"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 100 , 540 , 185, -220, "carMoveTo1", this.carMoveTo1 );
    }
    // Embedded object "carSource2"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 90 , 550 , 360, -220, "carSource2", this.carSource2 );
    }
    // Embedded object "selectOutput5"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 530 , 250 , 15, 20, "selectOutput5", this.selectOutput5 );
    }
    // Embedded object "carMoveTo2"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 440 , 490 , 185, -220, "carMoveTo2", this.carMoveTo2 );
    }
    // Embedded object "carMoveTo3"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 440 , 550 , 185, -220, "carMoveTo3", this.carMoveTo3 );
    }
    // Embedded object "carMoveTo4"
    if (!_publicOnly) {
	  drawEmbeddedObjectModel( _panel, _g, 460 , 630 , 185, -220, "carMoveTo4", this.carMoveTo4 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Connectors_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawConnector( _panel, _g, _connector_pointsX_xjal, _connector_pointsY_xjal, false );
      }
    if (!_publicOnly) {
      drawConnector( _panel, _g, _connector1_pointsX_xjal, _connector1_pointsY_xjal, false );
      }
    if (!_publicOnly) {
      drawConnector( _panel, _g, _connector2_pointsX_xjal, _connector2_pointsY_xjal, false );
      }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (_publicOnly) { return; }
      drawLinkToAgent( _panel, _g, 50, -50, 15, 0, "connections", true, connections );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void drawModelElements( Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
  	super.drawModelElements( _panel, _g, _publicOnly, true );
    drawModelElements_EmbeddeObjects_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Connectors_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_AgentLinks_xjal( _panel, _g, _publicOnly, _isSuperClass );
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_EmbeddedObjects_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( carSource.onClickIconAt( _x - -200, _y - 440, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carSource" );
      } else {
        _panel.addInspect( _x, _y, this, "carSource" );
      }
      return true;
    }
    if ( carMoveTo.onClickIconAt( _x - 90, _y - 440, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carMoveTo" );
      } else {
        _panel.addInspect( _x, _y, this, "carMoveTo" );
      }
      return true;
    }
    if ( carDispose.onClickIconAt( _x - 210, _y - 460, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carDispose" );
      } else {
        _panel.addInspect( _x, _y, this, "carDispose" );
      }
      return true;
    }
    if ( carSource1.onClickIconAt( _x - -200, _y - 540, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carSource1" );
      } else {
        _panel.addInspect( _x, _y, this, "carSource1" );
      }
      return true;
    }
    if ( carMoveTo1.onClickIconAt( _x - 100, _y - 540, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carMoveTo1" );
      } else {
        _panel.addInspect( _x, _y, this, "carMoveTo1" );
      }
      return true;
    }
    if ( carSource2.onClickIconAt( _x - 90, _y - 550, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carSource2" );
      } else {
        _panel.addInspect( _x, _y, this, "carSource2" );
      }
      return true;
    }
    if ( selectOutput5.onClickIconAt( _x - 530, _y - 250, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "selectOutput5" );
      } else {
        _panel.addInspect( _x, _y, this, "selectOutput5" );
      }
      return true;
    }
    if ( carMoveTo2.onClickIconAt( _x - 440, _y - 490, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carMoveTo2" );
      } else {
        _panel.addInspect( _x, _y, this, "carMoveTo2" );
      }
      return true;
    }
    if ( carMoveTo3.onClickIconAt( _x - 440, _y - 550, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carMoveTo3" );
      } else {
        _panel.addInspect( _x, _y, this, "carMoveTo3" );
      }
      return true;
    }
    if ( carMoveTo4.onClickIconAt( _x - 460, _y - 630, true ) ) {
      if ( _clickCount == 2 ) {
        _panel.browseAgent_xjal( _x, _y, this, "carMoveTo4" );
      } else {
        _panel.addInspect( _x, _y, this, "carMoveTo4" );
      }
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AgentLinks_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( modelElementContains(_x, _y, 50, -50) ) {
        _panel.addInspect_xjal( 50, -50, this, "connections", Panel.INSPECT_CONNECTIONS_xjal );
      return true;
    }
    return false;
  }


  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( onClickModelAt_EmbeddedObjects_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_AgentLinks_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    return super.onClickModelAt( _panel, _x, _y, _clickCount, _publicOnly, true );
  }



  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    carSource = instantiate_carSource_xjal();
    carMoveTo = instantiate_carMoveTo_xjal();
    carDispose = instantiate_carDispose_xjal();
    carSource1 = instantiate_carSource1_xjal();
    carMoveTo1 = instantiate_carMoveTo1_xjal();
    carSource2 = instantiate_carSource2_xjal();
    selectOutput5 = instantiate_selectOutput5_xjal();
    carMoveTo2 = instantiate_carMoveTo2_xjal();
    carMoveTo3 = instantiate_carMoveTo3_xjal();
    carMoveTo4 = instantiate_carMoveTo4_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , road, stopLine, road1, intersection, road2, stopLine1, road3, stopLine3, road4, stopLine2, intersection1, road6, road5 );
    icon = new ShapeGroup( Main.this, true, 0, 0, 0  );
	_initialize_roadNetwork_xjal();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Creating non-replicated embedded objects
    setupParameters_carSource_xjal( carSource );
    create_carSource_xjal( carSource );
    setupParameters_carMoveTo_xjal( carMoveTo );
    create_carMoveTo_xjal( carMoveTo );
    setupParameters_carDispose_xjal( carDispose );
    create_carDispose_xjal( carDispose );
    setupParameters_carSource1_xjal( carSource1 );
    create_carSource1_xjal( carSource1 );
    setupParameters_carMoveTo1_xjal( carMoveTo1 );
    create_carMoveTo1_xjal( carMoveTo1 );
    setupParameters_carSource2_xjal( carSource2 );
    create_carSource2_xjal( carSource2 );
    setupParameters_selectOutput5_xjal( selectOutput5 );
    create_selectOutput5_xjal( selectOutput5 );
    setupParameters_carMoveTo2_xjal( carMoveTo2 );
    create_carMoveTo2_xjal( carMoveTo2 );
    setupParameters_carMoveTo3_xjal( carMoveTo3 );
    create_carMoveTo3_xjal( carMoveTo3 );
    setupParameters_carMoveTo4_xjal( carMoveTo4 );
    create_carMoveTo4_xjal( carMoveTo4 );
	 // Port connectors with non-replicated objects
    carSource.out.connect( carMoveTo.in ); // connector
    carMoveTo.out.connect( carDispose.in ); // connector1
    carSource1.out.connect( carMoveTo1.in ); // connector2
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType ) {
      double _value;
      _value = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _value, MPS );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    carSource.start();
    carMoveTo.start();
    carDispose.start();
    carSource1.start();
    carMoveTo1.start();
    carSource2.start();
    selectOutput5.start();
    carMoveTo2.start();
    carMoveTo3.start();
    carMoveTo4.start();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( carSource );
    list.add( carMoveTo );
    list.add( carDispose );
    list.add( carSource1 );
    list.add( carMoveTo1 );
    list.add( carSource2 );
    list.add( selectOutput5 );
    list.add( carMoveTo2 );
    list.add( carMoveTo3 );
    list.add( carMoveTo4 );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    carSource.onDestroy();
    carMoveTo.onDestroy();
    carDispose.onDestroy();
    carSource1.onDestroy();
    carMoveTo1.onDestroy();
    carSource2.onDestroy();
    selectOutput5.onDestroy();
    carMoveTo2.onDestroy();
    carMoveTo3.onDestroy();
    carMoveTo4.onDestroy();
    // On destroy code
    
 
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
