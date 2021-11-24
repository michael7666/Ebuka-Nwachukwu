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

  public String getNameOf( Agent ao ) {
    if ( ao == carSource ) return "carSource";
    if ( ao == carMoveTo ) return "carMoveTo";
    if ( ao == carDispose ) return "carDispose";
    if ( ao == carSource1 ) return "carSource1";
    if ( ao == carMoveTo1 ) return "carMoveTo1";
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
      @Override
      public Road road( Agent car ) {
        return _carSource_road_xjal( this, car );
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
    self.arrivalType = self._arrivalType_DefaultValue_xjal();
    self.rate = self._rate_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.setAgentParametersFromDB = self._setAgentParametersFromDB_DefaultValue_xjal();
    self.databaseTable = self._databaseTable_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.appears = self._appears_DefaultValue_xjal();
    self.laneDirection = self._laneDirection_DefaultValue_xjal();
    self.isRandomLane = self._isRandomLane_DefaultValue_xjal();
    self.addCarToCustomPopulation = self._addCarToCustomPopulation_DefaultValue_xjal();
    self.carPopulation = self._carPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource_xjal( com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      @Override
      public Road road( Agent car ) {
        return _carMoveTo_road_xjal( this, car );
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
    self.movesTo = self._movesTo_DefaultValue_xjal();
    self.destination = self._destination_DefaultValue_xjal();
    self.stopLineBehavior = self._stopLineBehavior_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarDispose<Agent> instantiate_carDispose_xjal() {
    com.anylogic.libraries.road.CarDispose<Agent> _result_xjal = new com.anylogic.libraries.road.CarDispose<Agent>( getEngine(), this, null );
    
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
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarSource<Agent> instantiate_carSource1_xjal() {
    com.anylogic.libraries.road.CarSource<Agent> _result_xjal = new com.anylogic.libraries.road.CarSource<Agent>( getEngine(), this, null ) {
      @Override
      public Road road( Agent car ) {
        return _carSource1_road_xjal( this, car );
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
    self.arrivalType = self._arrivalType_DefaultValue_xjal();
    self.rate = self._rate_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.setAgentParametersFromDB = self._setAgentParametersFromDB_DefaultValue_xjal();
    self.databaseTable = self._databaseTable_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.appears = self._appears_DefaultValue_xjal();
    self.laneDirection = self._laneDirection_DefaultValue_xjal();
    self.isRandomLane = self._isRandomLane_DefaultValue_xjal();
    self.addCarToCustomPopulation = self._addCarToCustomPopulation_DefaultValue_xjal();
    self.carPopulation = self._carPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carSource1_xjal( com.anylogic.libraries.road.CarSource<Agent> self, TableInput _t ) {
    self.create();

  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.road.CarMoveTo<Agent> instantiate_carMoveTo1_xjal() {
    com.anylogic.libraries.road.CarMoveTo<Agent> _result_xjal = new com.anylogic.libraries.road.CarMoveTo<Agent>( getEngine(), this, null ) {
      @Override
      public Road road( Agent car ) {
        return _carMoveTo1_road_xjal( this, car );
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
    self.movesTo = self._movesTo_DefaultValue_xjal();
    self.destination = self._destination_DefaultValue_xjal();
    self.stopLineBehavior = self._stopLineBehavior_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void create_carMoveTo1_xjal( com.anylogic.libraries.road.CarMoveTo<Agent> self, TableInput _t ) {
    self.create();

  }

  private Road _carSource_road_xjal( final com.anylogic.libraries.road.CarSource<Agent> self, Agent car ) {
    Road _value;
    _value = 
road 
;
    return _value;
  }
  private Road _carMoveTo_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
road1 
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
  private Road _carMoveTo1_road_xjal( final com.anylogic.libraries.road.CarMoveTo<Agent> self, Agent car ) {
    Road _value;
    _value = 
road3 
;
    return _value;
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
  protected static final int _intersection = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector1 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector2 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector3 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector4 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector27 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector29 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector30 = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector31 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector42 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector43 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector44 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector5 = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector10 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector11 = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector12 = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector13 = 27;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector15 = 28;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector16 = 29;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector21 = 30;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector46 = 31;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector48 = 32;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector49 = 33;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector50 = 34;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector51 = 35;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector52 = 36;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector6 = 37;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector7 = 38;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector8 = 39;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector9 = 40;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector17 = 41;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector18 = 42;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector19 = 43;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector20 = 44;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector22 = 45;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector37 = 46;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector14 = 47;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector38 = 48;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector39 = 49;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector24 = 50;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector47 = 51;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector53 = 52;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector54 = 53;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector55 = 54;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector56 = 55;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector57 = 56;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector58 = 57;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector59 = 58;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector60 = 59;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector61 = 60;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector62 = 61;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector28 = 62;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector41 = 63;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector45 = 64;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector82 = 65;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector83 = 66;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector84 = 67;
  @AnyLogicInternalCodegenAPI
  protected static final int _intersection1 = 68;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector23 = 69;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector25 = 70;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector26 = 71;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector32 = 72;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector33 = 73;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector34 = 74;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector35 = 75;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector = 76;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector36 = 77;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector40 = 78;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector63 = 79;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector64 = 80;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector65 = 81;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector66 = 82;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector67 = 83;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector68 = 84;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector69 = 85;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector70 = 86;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector71 = 87;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector72 = 88;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector73 = 89;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector74 = 90;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector75 = 91;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector76 = 92;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector77 = 93;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector78 = 94;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector79 = 95;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector80 = 96;
  @AnyLogicInternalCodegenAPI
  protected static final int _laneConnector81 = 97;
  @AnyLogicInternalCodegenAPI
  protected static final int _road5 = 98;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 99;
 

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
		roadNetwork.addAll(road, stopLine, road1, intersection, road2, stopLine1, road3, stopLine3, road4, stopLine2, intersection1, road6);
		
		roadNetwork.initialize();
	}
	
	@AnyLogicInternalCodegenAPI
	private void _initialize_roadNetwork2_xjal() {
		roadNetwork2.addAll(road5);
		
		roadNetwork2.initialize();
	}
	
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 150.0, -110.0, 0.0, 151.524, 65.34900000000002, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 75.333, 140.026, 0.0, -30.0, 150.0, 0.0 ),
       new MarkupSegmentLine( -30.0, 150.0, 0.0, -20.0, 150.0, 0.0 ),
       new MarkupSegmentLine( -20.0, 150.0, 0.0, 10.0, 150.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 123.06, 170.062, 0.0, 120.0, 370.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _road3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.06, 140.062, 0.0, 480.0, 150.0, 0.0 ), };
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
  private RoadLanesConnector[] _intersection_laneConnectors_xjal() {
    return new RoadLanesConnector[] {
      laneConnector1,
      laneConnector2,
      laneConnector3,
      laneConnector4,
      laneConnector27,
      laneConnector29,
      laneConnector30,
      laneConnector31,
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
      laneConnector28,
      laneConnector41,
      laneConnector45,
      laneConnector82,
      laneConnector83,
      laneConnector84,
    };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 144.52426436672323, 65.40983637263467, 0.0, 200.52214943293745, 64.92314539155744, 0.0, 3.132901633802833, 3.132901633802833, 1.0,
			172.52320689983034, 65.16649088209607, 28.0, -3.150283673376752, -3.141592653589793,
			228.52109196604457, 64.67979990101884, 28.0, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 144.52426436672323, 65.40983637263467, 0.0, 161.83712978612465, 86.51287440146417, 0.0, 3.132901633802833, -1.394515096686654, 1.0000000000000027,
			123.53040848509497, 65.5922989835626, 20.99464877970013, -0.008691019786933514, 0.014675625441389742,
			165.51895411279438, 65.84358687115721, 20.994648779700018, -3.135608047935318, -1.4004997023411287 ),
       new MarkupSegmentArc( 161.83712978612465, 86.51287440146417, 0.0, 186.52267816638388, 65.04481813682675, 0.0, 1.7470775569031372, 3.132901633802833, 0.9999999999999998,
			165.52184372292578, 65.82736497207736, 21.01112603239786, -4.536107750276449, -1.770047233118969,
			207.53301067841886, 64.86221232357238, 21.011126032397872, -3.1645623298056202, 0.014278656428881717 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 144.52426436672323, 65.40983637263467, 0.0, 172.52320689983034, 65.16649088209606, 0.0, 3.132901633802833, 3.132901633802833, 1.0,
			158.52373563327677, 65.28816362736536, 14.0, -3.150283673376752, -3.141592653589793,
			186.5226781663839, 65.04481813682675, 14.0, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector4_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 144.52426436672323, 65.40983637263467, 0.0, 158.52373563327677, 65.28816362736536, 0.0, 3.132901633802833, 3.132901633802833, 1.0,
			151.524, 65.34900000000002, 6.999999999999993, -3.150283673376752, -3.141592653589793,
			165.52347126655354, 65.22732725473071, 6.999999999999993, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector27_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 204.81723537014324, 91.09351907753401, 0.0, 200.71294814028334, 86.8761391805303, 0.0, -1.5349266891295184, 3.132901633802833, 1.0000000000000009,
			204.6645668870578, 95.3478971924148, 4.257116490079208, -1.5349266891295181, -0.0,
			204.96990385322871, 86.83914096265322, 4.257116490079201, -4.67651934271931, 1.526235669342583 ),
       new MarkupSegmentLine( 200.71294814028334, 86.8761391805303, 0.0, 200.52214943293745, 64.92314539155744, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector29_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 144.52426436672323, 65.40983637263467, 0.0, 143.06026436672323, 120.18083637263469, 0.0 ),
       new MarkupSegmentArc( 143.06026436672323, 120.18083637263469, 0.0, 154.60226436672323, 149.80483637263467, 0.0, 3.149892463002004, -0.6060316632059637, 1.0000525605230157,
			184.96127151168446, 120.52861473193786, 41.90245040029628, -3.1332928441775825, -0.6952038311748399,
			120.16563660144593, 173.67039565612652, 41.898045918134805, -0.686904021762629, 0.0808723585566655 ),
       new MarkupSegmentArc( 154.60226436672323, 149.80483637263467, 0.0, 201.80483187846912, 175.03948637319002, 0.0, 2.5356179477660086, -1.5349266891295197, 1.0000640779470107,
			202.79541956883025, 116.40967675813337, 58.63289941673014, -3.7475673594135785, -0.938440824799908,
			199.70241143265048, 233.6271617872601, 58.625385987261744, -1.5444155306236937, 0.00948884149417384 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector30_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 144.52426436672323, 65.40983637263467, 0.0, 144.84228212823072, 102.00045084939316, 0.0 ),
       new MarkupSegmentArc( 144.84228212823072, 102.00045084939316, 0.0, 202.30689912708146, 161.04849182391402, 0.0, 3.132901633802833, -1.5349266891295197, 1.0000000000000007,
			204.44442884100465, 101.48243437031279, 59.604397772678055, -3.150283673376752, -1.52623566934256,
			200.1693694131583, 220.6145492775152, 59.60439777267798, -1.5349266891295195, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector31_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 144.52426436672323, 65.40983637263467, 0.0, 144.71506307406912, 87.36283016160755, 0.0 ),
       new MarkupSegmentArc( 144.71506307406912, 87.36283016160755, 0.0, 202.80896637569384, 147.05749727463802, 0.0, 3.132901633802833, -1.534926689129517, 0.9999999999999991,
			84.4602222949095, 87.88651936056183, 60.257116490079234, -0.008691019786959063, -0.0,
			204.96990385322886, 86.83914096265309, 60.25711649007934, -3.150283673376752, -1.5262356693425572 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector42_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.31103362430616, 133.066502725362, 0.0, 201.80483187846912, 175.03948637319002, 0.0, -1.5349266891295197, -1.5349266891295197, 1.0,
			202.55793275138765, 154.052994549276, 21.000000000000004, -1.53492668912952, -3.1415926535897927,
			201.0517310055506, 196.02597819710402, 21.000000000000004, -1.534926689129519, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector43_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.31103362430616, 133.066502725362, 0.0, 202.30689912708146, 161.04849182391402, 0.0, -1.5349266891295197, -1.5349266891295197, 1.0,
			202.8089663756938, 147.05749727463802, 14.000000000000007, -1.53492668912952, -3.1415926535897927,
			201.80483187846912, 175.03948637319002, 14.000000000000007, -1.534926689129519, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector44_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.31103362430616, 133.066502725362, 0.0, 202.80896637569384, 147.05749727463802, 0.0, -1.5349266891295197, -1.534926689129517, 0.9999999999999998,
			203.56206724861232, 126.07100545072399, 7.000000000000006, -4.676519342719312, -0.0,
			203.06000000000003, 140.062, 7.00000000000001, -1.5349266891295226, -3.1415926535897873 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector5_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 75.99287949785698, 146.9948276667104, 0.0, 119.27660448371846, 146.97959183614427, 0.0 ),
       new MarkupSegmentArc( 119.27660448371846, 146.97959183614427, 0.0, 138.8573204696209, 144.59840556114932, 0.0, 1.5704443277480986, 4.470711919950535, 0.9999999999999998,
			119.3054454488466, 228.91437035142536, 81.93478359127725, -1.5711483258416945, -0.0,
			119.24776351859005, 65.04481332086314, 81.93478359127731, -4.71274097943149, -0.2413250613873547 ),
       new MarkupSegmentArc( 138.8573204696209, 144.59840556114932, 0.0, 200.52214943293745, 64.92314539155744, 0.0, 1.329119266360739, 3.132901633802833, 1.0000000000000016,
			119.45382878571314, 65.88079509630826, 81.07377928049199, -4.954066040818847, -1.339370939501751,
			281.5928668263767, 64.21854044195638, 81.07377928049173, -3.151844326730805, 0.0015606533540404993 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector10_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 75.99287949785698, 146.9948276667104, 0.0, 116.03369264424154, 143.203356140009, 0.0 ),
       new MarkupSegmentArc( 116.03369264424154, 143.203356140009, 0.0, 186.52267816638388, 65.04481813682675, 0.0, 1.4763876455056122, 3.132901633802833, 0.9999999999999998,
			108.69689581837491, 65.72122058165598, 77.82872168002658, -4.806797661673974, -1.4850786652925587,
			264.34846051439285, 64.36841569199751, 77.82872168002658, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector11_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 75.99287949785698, 146.9948276667104, 0.0, 100.84703861826289, 144.64138303808565, 0.0 ),
       new MarkupSegmentArc( 100.84703861826289, 144.64138303808565, 0.0, 172.52320689983034, 65.16649088209606, 0.0, 1.476387645505612, 3.132901633802833, 0.9999999999999984,
			93.38667470405537, 65.85428536661753, 79.13952103232535, -4.806797661673975, -1.4850786652925707,
			251.65973909560552, 64.47869639757458, 79.13952103232556, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector12_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 75.99287949785698, 146.9948276667104, 0.0, 85.66038459228423, 146.07940993616234, 0.0 ),
       new MarkupSegmentArc( 85.66038459228423, 146.07940993616234, 0.0, 158.52373563327677, 65.28816362736536, 0.0, 1.4763876455056122, 3.132901633802833, 0.9999999999999998,
			93.24431559483261, 226.17146972074556, 80.45032038462415, -1.665205008084181, -0.0,
			78.07645358973576, 65.9873501515791, 80.45032038462419, -4.806797661673975, -1.4850786652925707 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector13_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 102.52585056706255, 65.7748546084426, 0.0, 80.38134860942837, 90.32878860247932, 0.0, 3.132901633802833, 1.476387645505612, 1.0000000000000016,
			78.0764535897358, 65.98735015157911, 24.450320384624145, -0.00869101978694629, 1.4850786652925587,
			82.68624362912094, 114.67022705337946, 24.450320384624074, -1.6652050080841814, -0.0 ),
       new MarkupSegmentLine( 80.38134860942837, 90.32878860247932, 0.0, 70.71384351500114, 91.24420633302736, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector15_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 75.99287949785698, 146.9948276667104, 0.0, 72.0336025107151, 105.18186166644813, 0.0, 1.4763876455056122, 1.4763876455056106, 0.9999999999999998,
			74.01324100428604, 126.08834466657926, 20.999999999999993, -4.806797661673974, -3.141592653589794,
			70.05396401714414, 84.27537866631698, 21.000000000000007, -4.806797661673975, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector16_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 75.99287949785698, 146.9948276667104, 0.0, 73.35336150642905, 119.11951699986888, 0.0, 1.4763876455056122, 1.4763876455056106, 0.9999999999999998,
			74.67312050214302, 133.05717233328963, 14.000000000000002, -4.806797661673974, -3.1415926535897944,
			72.03360251071508, 105.18186166644811, 14.000000000000009, -4.806797661673975, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector21_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 75.99287949785698, 146.9948276667104, 0.0, 74.67312050214302, 133.05717233328963, 0.0, 1.4763876455056122, 1.4763876455056122, 1.0,
			75.333, 140.026, 7.000000000000003, -4.806797661673974, -3.141592653589793,
			74.01324100428604, 126.08834466657925, 7.000000000000003, -4.806797661673974, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector46_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 78.6323974892849, 174.8701383335519, 0.0, 129.71826554704424, 174.87614499488726, 0.0, 1.4763876455056122, -1.5702091683376378, 0.391497657123013,
			92.3721800696477, 319.9726567351322, 145.75157793943978, -1.665205008084181, 0.128977975182813,
			130.2766203112769, -776.0676644054674, 950.9439733217205, -4.677819686491161, -0.03398213543627058 ),
       new MarkupSegmentLine( 129.71826554704424, 174.87614499488726, 0.0, 201.80483187846912, 175.03948637319002, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector48_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 75.99287949785698, 146.9948276667104, 0.0, 144.86839803100187, 144.97829828493067, 0.0, 1.4763876455056122, -1.5349266891295197, 1.0000000000000004,
			26.09839287946074, -379.92876958369663, 529.2805845052532, -4.806797661673974, -0.0,
			125.88736611625295, 673.9184249171169, 529.2805845052528, -1.6652050080841807, 0.13027831895466083 ),
       new MarkupSegmentLine( 144.86839803100187, 144.97829828493067, 0.0, 202.80896637569384, 147.05749727463802, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector49_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 204.81723537014324, 91.09351907753401, 0.0, 146.87666702545158, 89.01432008782669, 0.0 ),
       new MarkupSegmentArc( 146.87666702545158, 89.01432008782669, 0.0, 70.71384351500114, 91.24420633302736, 0.0, -1.5349266891295197, 1.4763876455056122, 0.9999999999999994,
			125.88736611625245, 673.9184249171399, 585.2805845052756, -1.53492668912952, -0.1302783189546586,
			15.54032091374691, -491.4300122510857, 585.2805845052761, -4.806797661673972, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector50_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 204.3151681215309, 105.08451362681001, 0.0, 146.3745997768388, 103.00531463710267, 0.0 ),
       new MarkupSegmentArc( 146.3745997768388, 103.00531463710267, 0.0, 72.0336025107151, 105.18186166644813, 0.0, -1.5349266891295184, 1.4763876455056106, 0.9999999999999994,
			125.8873661162526, 673.9184249171013, 571.2805845052371, -1.5349266891295181, -0.13027831895466432,
			18.17983890517766, -463.55470158420565, 571.2805845052377, -4.806797661673976, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector51_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.81310087291854, 119.075508176086, 0.0, 152.71934645386384, 119.06051111931035, 0.0 ),
       new MarkupSegmentLine( 152.71934645386384, 119.06051111931035, 0.0, 127.17246172947145, 119.04551405683114, 0.0 ),
       new MarkupSegmentLine( 127.17246172947145, 119.04551405683114, 0.0, 117.81357461039133, 119.04441419273712, 0.0 ),
       new MarkupSegmentArc( 117.81357461039133, 119.04441419273712, 0.0, 73.35336150642905, 119.11951699986888, 0.0, -1.5706788059748509, 1.4763876455056106, 2.4999999999999987,
			117.91219865498434, -720.1604526596756, 839.204872647602, -4.7122714595646435, 0.032658635961572126,
			86.01105499127104, 252.79435436089224, 134.27277962361643, -1.5380201700132785, -0.12718483807090397 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector52_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.31103362430616, 133.066502725362, 0.0, 145.37046527961425, 130.98730373565468, 0.0 ),
       new MarkupSegmentArc( 145.37046527961425, 130.98730373565468, 0.0, 74.67312050214304, 133.05717233328963, 0.0, -1.5349266891295197, 1.476387645505612, 1.0000000000000009,
			125.8873661162524, 673.9184249171333, 543.2805845052691, -1.53492668912952, -0.13027831895465886,
			23.458874888031346, -407.8040802505531, 543.2805845052682, -4.806797661673972, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector6_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 102.52585056706255, 65.7748546084426, 0.0, 93.61947591422611, 106.70502907054497, 0.0, 3.132901633802833, 0.4372094648389284, 0.9999999999999999,
			7.806452790860206, 66.59808349603783, 94.72297514799573, -0.008691019786959063, 0.445900484625887,
			179.43249903759204, 146.81197464505226, 94.72297514799574, -2.7043831887508656, -0.0 ),
       new MarkupSegmentLine( 93.61947591422611, 106.70502907054497, 0.0, 83.48739312336384, 128.38368453446967, 0.0 ),
       new MarkupSegmentArc( 83.48739312336384, 128.38368453446967, 0.0, 74.06573775451284, 169.31215533579817, 0.0, 3.5788021184287215, 0.015303549668722383, 0.9999999999999987,
			174.34180680379617, 170.84685494913225, 100.28781245435462, -2.7043831887508656, -0.4219059151701992,
			-26.210331294770754, 167.77745572246403, 100.28781245435489, -6.267881757510866, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector7_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 116.52532183361612, 65.65318186317329, 0.0, 107.61728917264529, 106.7187208815151, 0.0, 3.132901633802833, 0.4359166891193611, 1.0000000000000002,
			21.234313058674942, 66.48137875835383, 95.29460773539657, -0.008691019786959063, 0.44460770890632034,
			194.00026528661562, 146.95606300467645, 95.29460773539654, -2.7056759644704327, -0.0 ),
       new MarkupSegmentLine( 107.61728917264529, 106.7187208815151, 0.0, 97.48896768179756, 128.46256645512454, 0.0 ),
       new MarkupSegmentArc( 97.48896768179756, 128.46256645512454, 0.0, 88.0640983960806, 169.52639666842725, 0.0, 3.5775093427091544, 0.01530354966872327, 1.0000000000000009,
			188.96143965063533, 171.07060469410993, 100.9091574172763, -2.705675964470432, -0.42061313945064,
			-12.83324285847388, 167.98218864274452, 100.90915741727609, -6.267881757510866, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector8_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 130.52479310016966, 65.53150911790398, 0.0, 121.022671491146, 127.13663511424238, 0.0, 3.132901633802833, 0.29778309927348934, 0.6859632455371156,
			-62.62985546720742, 67.21026225830786, 193.16194365167627, -0.008691019786959063, 0.3121147061710908,
			513.4623363078156, 247.57985181358276, 410.5063446163825, -2.838168967205662, -0.005640587110642058 ),
       new MarkupSegmentLine( 121.022671491146, 127.13663511424238, 0.0, 111.30110370320294, 158.81238165060833, 0.0 ),
       new MarkupSegmentArc( 111.30110370320294, 158.81238165060833, 0.0, 102.06245903764837, 169.74063800105637, 0.0, 3.439375752863283, 0.015303549668722605, 1.457804053651578,
			101.59338744290866, 155.83299735789024, 10.154628784651713, -5.985402207906097, 0.9139953727387198,
			106.84011515532914, 169.81375880710675, 4.77821563254422, -1.929814181577584, -1.1964749223434807 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector9_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 144.52426436672323, 65.40983637263467, 0.0, 135.6129657903017, 106.74609936563827, 0.0, 3.132901633802833, 0.43335320405573063, 0.999999999999999,
			240.96382755232716, 64.57165711700812, 96.44320552477845, -3.1502836733767263, -0.0,
			48.084701181119144, 66.24801562826119, 96.44320552477862, -0.008691019786959063, 0.4420442238426893 ),
       new MarkupSegmentLine( 135.6129657903017, 106.74609936563827, 0.0, 125.49206772279729, 128.62033543764022, 0.0 ),
       new MarkupSegmentArc( 125.49206772279729, 128.62033543764022, 0.0, 116.06081967921612, 169.95487933368545, 0.0, 3.574945857645524, 0.01530354966872216, 1.0000000000000009,
			218.20696412577388, 171.518199973116, 102.15810685755051, -2.7082394495340623, -0.41804965438701,
			13.914675232658539, 168.39155869425494, 102.15810685755035, -6.2678817575108585, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector17_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 79.95215648499885, 188.80779366697266, 0.0, 82.41038154152018, 184.67684131601703, 0.0, 1.4763876455056095, 2.7387851169227178, 1.0000000000000002,
			79.67150439073028, 185.84389482542554, 2.977156687334698, -4.8067976616739765, -1.8791951821726844,
			85.14925869231008, 183.50978780660853, 2.9771566873346957, -3.5444001902568676, -0.0 ),
       new MarkupSegmentLine( 82.41038154152018, 184.67684131601703, 0.0, 75.72468697309436, 168.9866472135183, 0.0 ),
       new MarkupSegmentArc( 75.72468697309436, 168.9866472135183, 0.0, 74.06573775451284, 169.31215533579817, 0.0, -0.4028075366670756, 0.015303549668722827, 0.999999999999998,
			76.51963244904039, 168.6479157347356, 0.8641049267567905, -3.544400190256869, -0.0,
			74.92974149714834, 169.325378692301, 0.8641049267567935, -0.4028075366670791, -2.723481567253993 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector18_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.31103362430616, 133.066502725362, 0.0, 115.53078851749551, 129.91650606228885, 0.0 ),
       new MarkupSegmentArc( 115.53078851749551, 129.91650606228885, 0.0, 74.06573775451284, 169.31215533579817, 0.0, -1.5349266891295197, 0.01530354966872105, 0.9999999999999976,
			116.96648711258594, 89.90821778251909, 40.034040035113954, -4.676519342719312, -0.0,
			114.09508992240498, 169.9247943420588, 40.03404003511415, -1.5349266891295188, -1.5913624147915535 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector19_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.31103362430616, 133.066502725362, 0.0, 129.23696183183662, 130.40835249255505, 0.0 ),
       new MarkupSegmentArc( 129.23696183183662, 130.40835249255505, 0.0, 88.0640983960806, 169.52639666842725, 0.0, -1.534926689129517, 0.015303549668723937, 1.0000000000000004,
			130.6625436435763, 90.68198632801884, 39.751936457747206, -4.67651934271931, -0.0,
			127.81138002009705, 170.13471865709124, 39.75193645774716, -1.5349266891295181, -1.591362414791554 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector20_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.31103362430616, 133.066502725362, 0.0, 142.94313514617772, 130.90019892282123, 0.0 ),
       new MarkupSegmentArc( 142.94313514617772, 130.90019892282123, 0.0, 102.06245903764837, 169.74063800105637, 0.0, -1.5349266891295197, 0.015303549668722605, 1.0000000000000004,
			141.52767011778906, 170.34464297212355, 39.46983288038009, -1.53492668912952, -1.5913624147915522,
			62.597247957507705, 169.13663302998918, 39.46983288038006, -6.267881757510866, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector22_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.31103362430616, 133.066502725362, 0.0, 156.64930846051882, 131.39204535308744, 0.0 ),
       new MarkupSegmentArc( 156.64930846051882, 131.39204535308744, 0.0, 116.06081967921612, 169.95487933368545, 0.0, -1.5349266891295197, 0.015303549668722605, 1.0000000000000004,
			155.24396021548102, 170.55456728715592, 39.18772930301301, -1.53492668912952, -1.5913624147915448,
			76.87767914295124, 169.35519138021502, 39.18772930301298, -6.2678817575108585, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector37_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 77.31263849357094, 160.93248300013116, 0.0, 70.71384351500114, 91.24420633302736, 0.0, 1.4763876455056122, 1.4763876455056122, 1.0,
			80.61203598285583, 195.77662133368307, 35.0, -1.665205008084181, -0.0,
			74.01324100428603, 126.08834466657926, 35.0, -4.806797661673975, -3.1415926535897922 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector14_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 77.31263849357094, 160.93248300013116, 0.0, 102.16679761397683, 158.5790383715064, 0.0 ),
       new MarkupSegmentArc( 102.16679761397683, 158.5790383715064, 0.0, 186.52267816638388, 65.04481813682675, 0.0, 1.4763876455056122, 3.132901633802833, 0.9999999999999998,
			93.38667470405537, 65.85428536661755, 93.13952103232533, -4.806797661673974, -1.4850786652925458,
			279.65868162871243, 64.23535090703596, 93.13952103232538, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector38_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 77.31263849357094, 160.93248300013116, 0.0, 91.11390729100873, 159.62563846911385, 0.0 ),
       new MarkupSegmentArc( 91.11390729100873, 159.62563846911385, 0.0, 102.06245903764837, 169.74063800105637, 0.0, 1.4763876455056122, 0.015303549668722605, 1.0000000000000009,
			90.17061594717434, 149.6637668909999, 10.006432126296914, -4.806797661673974, -0.0,
			92.0571986348431, 169.58751004722777, 10.006432126296893, -1.6652050080841807, 1.680508557752895 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector39_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 77.31263849357094, 160.93248300013116, 0.0, 117.35345163995552, 157.14101147342973, 0.0 ),
       new MarkupSegmentArc( 117.35345163995552, 157.14101147342973, 0.0, 200.52214943293745, 64.92314539155744, 0.0, 1.4763876455056122, 3.132901633802833, 0.9999999999999998,
			126.01000746153609, 248.56080236520347, 91.82872168002655, -1.665205008084181, -0.0,
			108.69689581837491, 65.72122058165597, 91.82872168002656, -4.806797661673975, -1.4850786652925578 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector24_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 116.52532183361612, 65.65318186317329, 0.0, 95.56800263540705, 88.89076170440264, 0.0, 3.132901633802833, 1.4763876455056122, 1.0000000000000002,
			93.38667470405538, 65.85428536661756, 23.139521032325344, -0.008691019786933514, 1.4850786652925458,
			97.74933056675874, 111.92723804218771, 23.13952103232533, -1.6652050080841807, -0.0 ),
       new MarkupSegmentLine( 95.56800263540705, 88.89076170440264, 0.0, 70.71384351500114, 91.24420633302736, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector47_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.81310087291854, 119.075508176086, 0.0, 151.15532404190253, 108.59310357923006, 0.0, -1.5349266891295192, 1.927922487034599, 1.0000000000000009,
			197.79371086815274, 286.8164890494852, 167.84894911913975, -1.5349266891295188, -0.0,
			209.83249087768436, -48.66547269731299, 167.84894911913952, -4.6765193427193115, 0.3212565225743243 ),
       new MarkupSegmentLine( 151.15532404190253, 108.59310357923006, 0.0, 123.2680066971699, 98.18763755515955, 0.0 ),
       new MarkupSegmentArc( 123.2680066971699, 98.18763755515955, 0.0, 70.71384351500114, 91.24420633302736, 0.0, -1.2136701665551946, 1.476387645505612, 1.0,
			81.87568543773827, 209.12171738653416, 118.40479013653875, -1.2136701665551946, -0.45153484152898643,
			59.55200159226399, -26.6333047204794, 118.40479013653875, -4.806797661673975, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector53_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.31103362430616, 133.066502725362, 0.0, 151.29408965252557, 118.42118423336422, 0.0, -1.5349266891295201, 2.0838157105157724, 1.0000000000000002,
			207.41134386493908, 18.804083924707044, 114.33596500771621, -4.676519342719312, 0.47714974605549854,
			95.17683544011209, 218.0382845420214, 114.3359650077162, -1.057776943074021, -0.0 ),
       new MarkupSegmentLine( 151.29408965252557, 118.42118423336422, 0.0, 122.62484331083252, 102.27095119054118, 0.0 ),
       new MarkupSegmentArc( 122.62484331083252, 102.27095119054118, 0.0, 70.71384351500114, 91.24420633302736, 0.0, -1.0577769430740211, 1.4763876455056115, 1.0000000000000004,
			79.07779923106523, 179.573918328233, 88.7248205203947, -1.0577769430740214, -0.6074280650101603,
			62.34988779893703, 2.914494337821793, 88.72482052039466, -4.806797661673975, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector54_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 79.95215648499885, 188.80779366697266, 0.0, 70.71384351500114, 91.24420633302736, 0.0, 1.4763876455056122, 1.4763876455056122, 1.0,
			84.57131296999769, 237.5895873339453, 49.0, -1.665205008084181, -0.0,
			75.33299999999998, 140.026, 48.99999999999999, -4.806797661673975, -3.1415926535897922 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector55_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 204.3151681215309, 105.08451362681001, 0.0, 151.09066622999183, 99.04095738599057, 0.0, -1.5349266891295188, 1.7610549368513353, 1.0,
			191.86020538438098, 452.16414538634734, 347.30303321324425, -1.5349266891295188, -0.0,
			216.77013085868023, -241.99511813272738, 347.3030332132443, -4.676519342719312, 0.15438897239106159 ),
       new MarkupSegmentLine( 151.09066622999183, 99.04095738599057, 0.0, 123.83599789170387, 93.79203460745897, 0.0 ),
       new MarkupSegmentArc( 123.83599789170387, 93.79203460745897, 0.0, 70.71384351500114, 91.24420633302736, 0.0, -1.3805377167384574, 1.4763876455056115, 0.9999999999999999,
			88.3852459922157, 277.8676108981388, 187.4581915974465, -1.3805377167384576, -0.2846672913457247,
			53.042441037786716, -95.37919823208418, 187.45819159744659, -4.806797661673975, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector56_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 116.52532183361612, 65.65318186317329, 0.0, 200.52214943293745, 64.92314539155744, 0.0, 3.132901633802833, 3.132901633802833, 1.0,
			158.52373563327677, 65.28816362736538, 42.0, -3.150283673376752, -3.141592653589793,
			242.52056323259814, 64.55812715574953, 42.0, -3.150283673376752, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector57_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 79.95215648499885, 188.80779366697266, 0.0, 158.8370690936883, 101.33980991982085, 0.0, 1.4763876455056122, 3.132901633802833, 0.9999999999999998,
			88.16283751763189, 275.5188088274238, 87.09888307651042, -1.665205008084181, -0.0,
			71.74147545236576, 102.09677850652149, 87.09888307651043, -4.806797661673975, -1.4850786652925578 ),
       new MarkupSegmentLine( 158.8370690936883, 101.33980991982085, 0.0, 158.52373563327677, 65.28816362736536, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector58_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.81310087291854, 119.075508176086, 0.0, 158.58731528646106, 72.60353672855258, 0.0, -1.5349266891295197, 3.132901633802833, 1.0000000000000007,
			202.1308228803844, 165.9551687971784, 46.90983520748039, -1.53492668912952, -0.0,
			205.49537886545272, 72.19584755499368, 46.90983520748033, -4.676519342719312, 1.52623566934256 ),
       new MarkupSegmentLine( 158.58731528646106, 72.60353672855258, 0.0, 158.52373563327677, 65.28816362736536, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector59_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.31103362430616, 133.066502725362, 0.0, 186.967914982053, 116.27305330137088, 0.0, -1.5349266891295197, 3.132901633802833, 0.9999999999999993,
			203.91895382878062, 116.12572777797234, 16.951679055276898, -4.676519342719312, 1.5262356693425478,
			170.01687613532536, 116.42037882476943, 16.951679055276916, -0.00869101978694629, -0.0 ),
       new MarkupSegmentLine( 186.967914982053, 116.27305330137088, 0.0, 186.52267816638388, 65.04481813682675, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector60_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 79.95215648499885, 188.80779366697266, 0.0, 186.57085915421774, 70.58844545682601, 0.0, 1.4763876455056122, 3.132901633802833, 0.9999999999999998,
			91.04948968574155, 306.0040437204956, 117.72048178110799, -1.665205008084181, -0.0,
			68.85482328425609, 71.61154361344974, 117.720481781108, -4.806797661673975, -1.4850786652925578 ),
       new MarkupSegmentLine( 186.57085915421774, 70.58844545682601, 0.0, 186.52267816638388, 65.04481813682675, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector61_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 116.52532183361612, 65.65318186317329, 0.0, 116.21344258928855, 159.9826180937963, 0.0 ),
       new MarkupSegmentLine( 116.21344258928855, 159.9826180937963, 0.0, 116.06081967921612, 169.95487933368545, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector62_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 130.52479310016966, 65.53150911790398, 0.0, 125.98048643484043, 107.16199780500857, 0.0, 3.132901633802832, 0.2261463287024954, 0.9999999999999998,
			309.25521002723076, 63.97812041653209, 178.7371672355211, -3.150283673376752, -0.0,
			-48.2056238268915, 67.0848978192756, 178.73716723552116, -0.00869101978697184, 0.23483734848946727 ),
       new MarkupSegmentLine( 125.98048643484043, 107.16199780500857, 0.0, 121.11101454759597, 128.32606325310525, 0.0 ),
       new MarkupSegmentArc( 121.11101454759597, 128.32606325310525, 0.0, 116.06081967921612, 169.95487933368545, 0.0, 3.3677389822922885, 0.01530354966872216, 0.9999999999999997,
			315.2940310436618, 173.0040927237123, 199.2565437140969, -2.9154463248872977, -0.21084277903377452,
			-83.17239168522971, 166.90566594365862, 199.25654371409706, -6.2678817575108505, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector28_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 116.52532183361612, 65.65318186317329, 0.0, 111.98095345720832, 107.14889515415301, 0.0, 3.1329016338028333, 0.22684996860855744, 1.0000000000000004,
			-61.10355488306905, 67.19699681573198, 177.63558542206312, -0.008691019786959063, 0.2355409883955157,
			285.06546179748557, 147.1007934925742, 177.63558542206297, -2.9147426849812366, -0.0 ),
       new MarkupSegmentLine( 111.98095345720832, 107.14889515415301, 0.0, 107.11111820132622, 128.246592035102, 0.0 ),
       new MarkupSegmentArc( 107.11111820132622, 128.246592035102, 0.0, 102.06245903764837, 169.74063800105637, 0.0, 3.368442622198351, 0.015303549668722605, 0.999999999999998,
			300.0010428151754, 172.77003744668048, 197.9617645123781, -2.9147426849812357, -0.21154641893983633,
			-95.87612473987943, 166.71123855543203, 197.96176451237886, -6.267881757510872, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector41_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 203.81310087291854, 119.075508176086, 0.0, 157.1513757091312, 117.40105080381144, 0.0 ),
       new MarkupSegmentArc( 157.1513757091312, 117.40105080381144, 0.0, 102.06245903764837, 169.74063800105637, 0.0, -1.5349266891295197, 0.015303549668722605, 1.0000000000000004,
			155.24396021548108, 170.55456728715595, 53.187729303013036, -1.53492668912952, -1.5913624147915522,
			48.88095785981571, 168.92670871495685, 53.18772930301301, -6.2678817575108585, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector45_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 102.52585056706255, 65.7748546084426, 0.0, 102.21508194772079, 159.76837676116784, 0.0 ),
       new MarkupSegmentLine( 102.21508194772079, 159.76837676116784, 0.0, 102.06245903764837, 169.74063800105637, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector82_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 130.52479310016966, 65.53150911790398, 0.0, 83.02086660085631, 118.20409926932084, 0.0, 3.132901633802833, 1.4763876455056106, 1.0000000000000013,
			182.97313261060373, 65.07566808422887, 52.45032038462435, -3.150283673376752, -0.0,
			78.07645358973575, 65.98735015157905, 52.45032038462419, -0.00869101978694629, 1.4850786652925567 ),
       new MarkupSegmentLine( 83.02086660085631, 118.20409926932084, 0.0, 73.35336150642905, 119.11951699986888, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector83_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 204.81723537014324, 91.09351907753401, 0.0, 152.49749654393725, 98.78109034303544, 0.0, -1.5349266891295192, 1.2431456888227344, 1.0000000000000004,
			210.06292947621796, -55.08705304324866, 146.27466278277265, -4.676519342719312, -0.0,
			199.57154126406854, 237.27409119831654, 146.27466278277248, -1.534926689129519, -0.3635202756375398 ),
       new MarkupSegmentLine( 152.49749654393725, 98.78109034303544, 0.0, 125.57067529981352, 107.93357010438743, 0.0 ),
       new MarkupSegmentArc( 125.57067529981352, 107.93357010438743, 0.0, 73.35336150642905, 119.11951699986888, 0.0, 4.384738342412527, 1.4763876455056115, 0.9999999999999998,
			199.42026912288728, 325.2008969573792, 229.4751703903447, -1.898446964767059, -0.0,
			51.72108147673964, -109.33375674860443, 229.4751703903448, -5.040039618356852, 0.23324195668287673 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector84_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 203.31103362430616, 133.066502725362, 0.0, 151.54834999164876, 127.03032568504106, 0.0, -1.5349266891295197, 1.7671031053751534, 0.9999999999999998,
			191.64979764386754, 458.02753033883715, 325.1701921950984, -1.5349266891295195, -0.0,
			214.9722696047453, -191.89452488811327, 325.17019219509865, -4.6765193427193115, 0.16043714091487885 ),
       new MarkupSegmentLine( 151.54834999164876, 127.03032568504106, 0.0, 125.01645021547264, 121.75398213400462, 0.0 ),
       new MarkupSegmentArc( 125.01645021547264, 121.75398213400462, 0.0, 73.35336150642905, 119.11951699986888, 0.0, -1.37448954821464, 1.4763876455056115, 1.000000000000001,
			90.18681362487638, 296.89353063455917, 178.56921636724263, -1.37448954821464, -0.2907154598695419,
			56.51990938798184, -58.654496634821044, 178.56921636724223, -4.806797661673975, -0.0 ), };
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
    };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector23_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.00573775451284, 369.2501553357981, 0.0, 69.4124901247392, 416.4871748530337, 0.0, 3.1568962032585155, 0.06827230103392479, 1.0064402514555295,
			740.2718402785385, 379.49310201788666, 669.3444807753567, -3.12628910392108, -0.009224796245819374,
			-589.8536298739414, 371.4074976720114, 660.805564650344, -6.277106553756674, 0.0621935476110141 ),
       new MarkupSegmentLine( 69.4124901247392, 416.4871748530337, 0.0, 67.8216015481822, 439.7530677077076, 0.0 ),
       new MarkupSegmentArc( 67.8216015481822, 439.7530677077076, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 3.2098649546237175, 0.0203806690893229, 0.9936009599713307,
			1037.1785679766924, 506.0363147822871, 971.6205006103121, -3.0733203525558683, -0.04789163194459882,
			-918.2115165550404, 466.1786377927584, 984.1757610437537, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector25_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.00245903764836, 369.67863800105636, 0.0, 97.3467075768175, 446.70230834305875, 0.0, 3.1568962032585164, 0.12367354802725683, 1.7496191219335266,
			912.2255165187878, 382.12480909355656, 813.3182946385974, -3.126289103921072, -0.04478167244073792,
			-166.31296479728599, 413.92731109158757, 265.6889596525485, -0.02947812277202045, 0.15315167079927852 ),
       new MarkupSegmentLine( 97.3467075768175, 446.70230834305875, 0.0, 96.14237302516084, 456.3906219951476, 0.0 ),
       new MarkupSegmentArc( 96.14237302516084, 456.3906219951476, 0.0, 94.82914587982481, 467.8905919044273, 0.0, 3.2652662016170506, 0.09317242522310587, 1.8653463810662567,
			-802.7746700906422, 344.6480739136274, 905.8356624994454, -6.159511759152327, 0.00311695616738931,
			354.0336990531821, 492.111437215394, 260.3337276139562, -3.0148021493951456, -0.03361807897154256 ),
       new MarkupSegmentArc( 94.82914587982481, 467.8905919044273, 0.0, 93.75403719566516, 486.80602896395874, 0.0, 3.2347650788128997, 0.020380669089322456, 0.571552966850797,
			354.0336990533232, 492.1114372154073, 260.333727614098, -3.048420228366687, -0.07279175613378601,
			-703.0054931514721, 470.56528792199566, 796.9250346604645, -6.262804638090255, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector26_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.00081967921612, 369.8928793336854, 0.0, 109.67932883511187, 460.27759970409534, 0.0, 3.1568962032585155, 0.12319391710143646, 1.7298313062588715,
			1400.9988107816037, 389.6053594663928, 1288.148829505647, -3.126289103921072, -0.025645135317611333,
			-317.5436270546103, 407.37844688409433, 430.4855101025182, -0.01034158564887967, 0.13353550275031745 ),
       new MarkupSegmentArc( 109.67932883511187, 460.27759970409534, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 3.264786570691229, 0.020380669089323122, 0.5736332753043518,
			369.2858807627772, 492.42232993024885, 261.58907753398984, -3.018398736488356, -0.10281324801210574,
			-687.054128204352, 470.89043243235847, 794.9703562673151, -6.262804638090255, -0.0 ), };
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
       new MarkupSegmentArc( 113.00081967921612, 369.8928793336854, 0.0, 102.49195070405655, 416.07131682372443, 0.0, 3.1568962032585155, 0.4484924446353482, 1.000852014852953,
			219.3559062558725, 371.5206167569094, 106.36754189999427, -3.126289103921072, -0.008281380127793935,
			6.807085114744623, 370.02803836560946, 106.18651983192686, -6.276163137638675, 0.44147027509443615 ),
       new MarkupSegmentLine( 102.49195070405655, 416.07131682372443, 0.0, 90.7588651016195, 440.45443541156277, 0.0 ),
       new MarkupSegmentArc( 90.7588651016195, 440.45443541156277, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.590085098225141, 0.02038066908932268, 0.9991487104583839,
			191.21280585067962, 488.7925789375813, 111.47901296458292, -2.693100208954446, -0.4281117755460214,
			-31.888921464599562, 484.2449867954912, 111.6690574401418, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector40_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 85.0040983960806, 369.46439666842724, 0.0, 83.41190355219221, 416.6013282756505, 0.0, 3.1568962032585155, 0.06813033724179807, 1.0045889420268483,
			754.6294636016155, 379.71284177405425, 669.7037855303857, -3.1262891039210645, -0.00908752331548029,
			-578.6479363646043, 371.42504757543907, 663.5993730923491, -6.276969280826355, 0.061914310888568705 ),
       new MarkupSegmentLine( 83.41190355219221, 416.6013282756505, 0.0, 81.82044285483701, 439.92423574377074, 0.0 ),
       new MarkupSegmentArc( 81.82044285483701, 439.92423574377074, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.2097229908315916, 0.020380669089322456, 0.9954320201677782,
			1056.4526432874682, 506.42918773080385, 976.8985795664513, -3.0734623163479946, -0.04774966815247266,
			-905.9233214093088, 466.4291141129454, 985.8850133721692, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector63_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 85.0040983960806, 369.46439666842724, 0.0, 92.57608451456781, 416.47752230990307, 0.0, 3.1568962032585155, -0.3231684164443458, 1.0044016657572359,
			221.66764220479348, 371.5559972848916, 136.67954857803264, -3.126289103921072, -0.3443514793646502,
			-35.894647920361365, 459.50358870853256, 135.48421119121755, -0.32904792969592983, 0.005879513251584058 ),
       new MarkupSegmentLine( 92.57608451456781, 416.47752230990307, 0.0, 100.66121749731343, 440.6187706988151, 0.0 ),
       new MarkupSegmentArc( 100.66121749731343, 440.6187706988151, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 2.818424237145449, 0.0203806690893229, 0.9956176239971558,
			-29.732722819229025, 484.2889376520557, 137.5124109053359, -0.3231684164443444, 0.3435490855336589,
			246.4479618430908, 489.918464265234, 138.72564250229337, -3.121211984500467, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector64_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 85.0040983960806, 369.46439666842724, 0.0, 78.82737677041482, 416.30396271151204, 0.0, 3.1568962032585155, 0.26505050593988244, 1.0044909622773166,
			263.033012437571, 372.1890837062437, 178.04976314010202, -3.126289103921072, -0.009350082776350506,
			-91.47171068936589, 370.0785266385053, 176.46124257120505, -6.277231840287234, 0.2590970390475305 ),
       new MarkupSegmentLine( 78.82737677041482, 416.30396271151204, 0.0, 72.41268018301781, 439.93634063953755, 0.0 ),
       new MarkupSegmentArc( 72.41268018301781, 439.93634063953755, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 3.4066431595296756, 0.0203806690893229, 0.9955291162927565,
			257.37212472976137, 490.14113684558606, 191.65207457559848, -2.8765421476499107, -0.24466983685055635,
			-127.57733188832046, 482.29452290366714, 193.37734443145607, -6.262804638090266, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector65_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 113.00081967921612, 369.8928793336854, 0.0, 106.82546482270551, 416.5330833327389, 0.0, 3.1568962032585164, 0.26384131503641717, 1.0008939776886927,
			291.4106048126806, 372.62339550624097, 178.43067883617312, -3.1262891039210645, -0.008178639293876603,
			-65.1231042698691, 370.0830817974853, 178.11208003840997, -6.276060396804734, 0.2567164046615656 ),
       new MarkupSegmentLine( 106.82546482270551, 416.5330833327389, 0.0, 100.41107566810854, 440.27786267141744, 0.0 ),
       new MarkupSegmentArc( 100.41107566810854, 440.27786267141744, 0.0, 93.75403719566516, 486.80602896395874, 0.0, 3.4054339686262107, 0.02038066908932268, 0.9991068207935928,
			287.2492933169204, 490.750137854812, 193.53544930160234, -2.877751338553376, -0.24346064594708564,
			-100.08733444992511, 482.8548650302893, 193.8816367216724, -6.262804638090266, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector66_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.00245903764836, 369.67863800105636, 0.0, 88.49431195465786, 415.9563460671681, 0.0, 3.156896203258516, 0.4494794269879221, 1.0025615867346163,
			205.23968427187083, 371.30457158655145, 106.24966675473084, -3.1262891039210645, -0.009275162417838082,
			-6.713546784299027, 370.0268199521825, 105.707415703934, -6.277156919928696, 0.44345103973703165 ),
       new MarkupSegmentLine( 88.49431195465786, 415.9563460671681, 0.0, 76.75828993720629, 440.28408512542615, 0.0 ),
       new MarkupSegmentArc( 76.75828993720629, 440.28408512542615, 0.0, 65.75985219779412, 486.2354097345494, 0.0, 3.5910720805777157, 0.020380669089323344, 0.9974449582264973,
			176.69886103009185, 488.49673406801867, 110.96205328144292, -2.692113226601871, -0.42909875789859625,
			-45.74824437270131, 483.9624854060576, 111.53125923156246, -6.262804638090261, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector67_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.00245903764836, 369.67863800105636, 0.0, 102.06425716672585, 416.7663827840366, 0.0, 3.1568962032585164, -0.13085823927726548, 1.0027277604640115,
			392.0636350010424, 374.1638644134842, 293.0954965758058, -3.1262891039210645, -0.15368442913210908,
			-186.9464978120708, 454.8031820851066, 291.5030267329722, -0.1383808794633798, 0.007522640186114432 ),
       new MarkupSegmentLine( 102.06425716672585, 416.7663827840366, 0.0, 105.16545047842054, 440.32983283286507, 0.0 ),
       new MarkupSegmentArc( 105.16545047842054, 440.32983283286507, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 3.0107344143125276, 0.0203806690893229, 0.9972796599719645,
			410.80300722677737, 400.104774752381, 308.2732090089623, -3.2724508928670586, -0.0,
			-202.14179250755188, 480.7746388612095, 309.9572937136822, -0.13085823927726623, 0.1512389083665912 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector68_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 99.00245903764836, 369.67863800105636, 0.0, 92.82641950404614, 416.4185238642976, 0.0, 3.1568962032585164, 0.2644444926417189, 1.002688240545017,
			277.21992825714307, 372.4062108276909, 178.23834039994352, -3.12628910392108, -0.008764023328592357,
			-78.29470586436237, 370.0812803712521, 177.28389572063327, -6.276645780839432, 0.25790496630156456 ),
       new MarkupSegmentLine( 92.82641950404614, 416.4185238642976, 0.0, 86.41187918524422, 440.1071008129708, 0.0 ),
       new MarkupSegmentArc( 86.41187918524422, 440.1071008129708, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.4060371462315127, 0.0203806690893229, 0.9973189667173535,
			272.30948795890936, 490.44561246064217, 192.59254062052716, -2.877148160948074, -0.2440638235523932,
			-113.83224518051559, 482.5746957604932, 193.62940256967988, -6.262804638090266, -0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector69_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.00573775451284, 369.2501553357981, 0.0, 82.7914448232527, 416.07147050715037, 0.0, 3.1568962032585155, -0.5011192228578256, 1.005817382089418,
			164.22463534937117, 370.6768467433358, 93.22981452932868, -3.126289103921072, -0.5201557612697878,
			1.967761927068267, 460.34317871209714, 92.15449996764633, -0.5048522116010667, 0.003732988743241311 ),
       new MarkupSegmentLine( 82.7914448232527, 416.07147050715037, 0.0, 96.45988714596376, 441.02496547647576, 0.0 ),
       new MarkupSegmentArc( 96.45988714596376, 441.02496547647576, 0.0, 107.75112969460068, 487.0913385786634, 0.0, 2.6404734307319675, 0.0203806690893229, 0.994216264112146,
			176.20701386238403, 397.34294805706224, 90.92701944611808, -3.6427118764476187, -0.0,
			15.782222619229302, 485.2166911513866, 91.98801102108298, -0.501119222857825, 0.5214998919471459 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector70_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.00573775451284, 369.2501553357981, 0.0, 74.06529972128865, 416.53782386257865, 0.0, 3.156896203258516, -0.13154368193991783, 1.0063956071866471,
			366.71506431323684, 373.7759110164076, 295.7439572980226, -3.12628910392108, -0.15366520860478863,
			-215.40903787877238, 454.8375085808527, 291.9970170712593, -0.13836165893607563, 0.006817976996158196 ),
       new MarkupSegmentLine( 74.06529972128865, 416.53782386257865, 0.0, 77.16790544226227, 439.98774890816173, 0.0 ),
       new MarkupSegmentArc( 77.16790544226227, 439.98774890816173, 0.0, 79.75694469672965, 486.5207193492541, 0.0, 3.0100489716498746, 0.020380669089322456, 0.9936450366625444,
			377.7177450113001, 400.22268996353887, 303.1690386201132, -3.2731363355297107, -0.0,
			-227.2386251824712, 480.2630777879844, 307.05933954752885, -0.13154368193991997, 0.15192435102924567 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _laneConnector71_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 71.00573775451284, 369.2501553357981, 0.0, 78.57588224122703, 416.3627293642152, 0.0, 3.1568962032585155, -0.3239461688646359, 1.0061764294008317,
			208.2561438536176, 371.3507377296565, 137.26647959630407, -3.12628910392108, -0.34435231551765794,
			-49.958247146130205, 459.52123754001593, 135.58642721646794, -0.3290487658489452, 0.0051025969843094925 ),
       new MarkupSegmentLine( 78.57588224122703, 416.3627293642152, 0.0, 86.66318805727141, 440.4482424204201, 0.0 ),
       new MarkupSegmentArc( 86.66318805727141, 440.4482424204201, 0.0, 93.75403719566516, 486.80602896395874, 0.0, 2.8176464847251568, 0.020380669089322456, 0.9938614847055123,
			-43.091656728165475, 484.01663593748754, 136.87411975589416, -0.32394616886463645, 0.3443268379539508,
			232.29538708202023, 489.62998537917474, 138.570127943105, -3.121211984500473, -0.0 ), };
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
  private static MarkupSegment[] _road5_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 80.0, 450.0, 0.0, -10.0, 450.0, 0.0 ), };
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
  protected Intersection intersection;
  protected RoadLanesConnector laneConnector1;
  protected RoadLanesConnector laneConnector2;
  protected RoadLanesConnector laneConnector3;
  protected RoadLanesConnector laneConnector4;
  protected RoadLanesConnector laneConnector27;
  protected RoadLanesConnector laneConnector29;
  protected RoadLanesConnector laneConnector30;
  protected RoadLanesConnector laneConnector31;
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
  protected RoadLanesConnector laneConnector28;
  protected RoadLanesConnector laneConnector41;
  protected RoadLanesConnector laneConnector45;
  protected RoadLanesConnector laneConnector82;
  protected RoadLanesConnector laneConnector83;
  protected RoadLanesConnector laneConnector84;
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
  protected Road road5;
  protected com.anylogic.engine.markup.RoadNetwork roadNetwork;
  protected com.anylogic.engine.markup.RoadNetwork roadNetwork2;

  private com.anylogic.engine.markup.RoadNetwork[] _getRoadNetworks_xjal;

  @Override
  public com.anylogic.engine.markup.RoadNetwork[] getRoadNetworks() {
    return _getRoadNetworks_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    road = new Road( this, SHAPE_DRAW_2D3D, true, 4, 4, 0.0, green, _road_segments_xjal() );
    stopLine = new StopLine( road, SHAPE_DRAW_2D3D, true, true, 167.35562259876357, 0, 3 );
    road1 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 4, 0.0, green, _road1_segments_xjal() );
    road2 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road2_segments_xjal() );
    stopLine1 = new StopLine( road2, SHAPE_DRAW_2D3D, true, true, 191.9614148879728, 0, 3 );
    road3 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 4, 0.0, green, _road3_segments_xjal() );
    stopLine3 = new StopLine( road3, SHAPE_DRAW_2D3D, true, false, 8.0, 0, 3 );
    road4 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road4_segments_xjal() );
    stopLine2 = new StopLine( road4, SHAPE_DRAW_2D3D, true, true, 649.1546789515646, 0, 3 );
    road6 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road6_segments_xjal() );
	laneConnector1 = new RoadLanesConnector( road, 3, road, 0, _laneConnector1_segments_xjal() );
	laneConnector2 = new RoadLanesConnector( road, 3, road, 1, _laneConnector2_segments_xjal() );
	laneConnector3 = new RoadLanesConnector( road, 3, road, 2, _laneConnector3_segments_xjal() );
	laneConnector4 = new RoadLanesConnector( road, 3, road, 3, _laneConnector4_segments_xjal() );
	laneConnector27 = new RoadLanesConnector( road3, 0, road, 0, _laneConnector27_segments_xjal() );
	laneConnector29 = new RoadLanesConnector( road, 3, road3, 1, _laneConnector29_segments_xjal() );
	laneConnector30 = new RoadLanesConnector( road, 3, road3, 2, _laneConnector30_segments_xjal() );
	laneConnector31 = new RoadLanesConnector( road, 3, road3, 3, _laneConnector31_segments_xjal() );
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
	laneConnector28 = new RoadLanesConnector( road, 1, road2, 2, _laneConnector28_segments_xjal() );
	laneConnector41 = new RoadLanesConnector( road3, 2, road2, 2, _laneConnector41_segments_xjal() );
	laneConnector45 = new RoadLanesConnector( road, 0, road2, 2, _laneConnector45_segments_xjal() );
	laneConnector82 = new RoadLanesConnector( road, 2, road1, 2, _laneConnector82_segments_xjal() );
	laneConnector83 = new RoadLanesConnector( road3, 0, road1, 2, _laneConnector83_segments_xjal() );
	laneConnector84 = new RoadLanesConnector( road3, 3, road1, 2, _laneConnector84_segments_xjal() );
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
    road5 = new Road( this, SHAPE_DRAW_2D3D, true, 4, 0, 0.0, green, _road5_segments_xjal() );
    intersection = new Intersection( this, SHAPE_DRAW_2D3D, true, true, new RoadEnd[] {
			new RoadEnd( road, RoadEnd.Type.END ),
			new RoadEnd( road1, RoadEnd.Type.BEGIN ),
			new RoadEnd( road2, RoadEnd.Type.BEGIN ),
			new RoadEnd( road3, RoadEnd.Type.BEGIN ),
		}, _intersection_laneConnectors_xjal()
 );
    intersection1 = new Intersection( this, SHAPE_DRAW_2D3D, true, true, new RoadEnd[] {
			new RoadEnd( road2, RoadEnd.Type.END ),
			new RoadEnd( road4, RoadEnd.Type.END ),
			new RoadEnd( road6, RoadEnd.Type.BEGIN ),
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
      roadNetwork,
      roadNetwork2 };
	roadNetwork2 = new com.anylogic.engine.markup.RoadNetwork(this, "roadNetwork2", SHAPE_DRAW_2D3D, true, true, ROAD_RIGHT_HAND, 3.5, gray, white, ROAD_LINE_SINGLE_DASHED, white, ROAD_LINE_SINGLE, true);
			
	_getRoadNetworks_xjal = new com.anylogic.engine.markup.RoadNetwork[] { 
      roadNetwork,
      roadNetwork2 };
    _createPersistentElementsBP0_xjal();
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
      case _intersection: return intersection;
      case _laneConnector1: return laneConnector1;
      case _laneConnector2: return laneConnector2;
      case _laneConnector3: return laneConnector3;
      case _laneConnector4: return laneConnector4;
      case _laneConnector27: return laneConnector27;
      case _laneConnector29: return laneConnector29;
      case _laneConnector30: return laneConnector30;
      case _laneConnector31: return laneConnector31;
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
      case _laneConnector28: return laneConnector28;
      case _laneConnector41: return laneConnector41;
      case _laneConnector45: return laneConnector45;
      case _laneConnector82: return laneConnector82;
      case _laneConnector83: return laneConnector83;
      case _laneConnector84: return laneConnector84;
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
      case _road5: return road5;
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
      _name_xjal = checkNameOfShape_xjal( _shape, intersection, "intersection" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector1, "laneConnector1" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector2, "laneConnector2" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector3, "laneConnector3" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector4, "laneConnector4" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector27, "laneConnector27" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector29, "laneConnector29" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector30, "laneConnector30" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector31, "laneConnector31" ); if (_name_xjal != null) return _name_xjal;
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
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector28, "laneConnector28" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector41, "laneConnector41" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector45, "laneConnector45" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector82, "laneConnector82" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector83, "laneConnector83" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, laneConnector84, "laneConnector84" ); if (_name_xjal != null) return _name_xjal;
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
      _name_xjal = checkNameOfShape_xjal( _shape, road5, "road5" ); if (_name_xjal != null) return _name_xjal;
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
	_initialize_roadNetwork2_xjal();
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
    super.onDestroy();
  }



}
