/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace libsbml {

 using System;
 using System.Runtime.InteropServices;

/** 
 * @sbmlpackage{core}
 *
@htmlinclude pkg-marker-core.html An assignment to a variable by an SBML <em>event</em>.
 *
 * Event contains an optional element called 'listOfEventAssignments', of
 * class ListOfEventAssignments.  In every instance of an event definition
 * in a model, the object's 'listOfEventAssignments' element must have a
 * non-empty list of one or more 'eventAssignment' elements of class
 * EventAssignment.  The object class EventAssignment has one required
 * attribute, 'variable', and a required element, 'math'.  Being derived
 * from SBase, it also has all the usual attributes and elements of its
 * parent class.
 *
 * An Event object defines when the event can occur, the variables that are
 * affected by the event, and how the variables are affected.  The purpose
 * of the EventAssignment object class is to define how variables are
 * affected by an Event.  In SBML Level&nbsp;2, every Event object instance
 * must have a nonempty list of event assignments; in SBML Level&nbsp;3,
 * the list of assignments is optional.
 *
 * The operation of an Event is divided into two phases (regardless of
 * whether a delay is involved): one phase when the event is @em triggered,
 * and the other when the event is @em executed.   EventAssignment objects
 * are interpreted when an event is executed.  The effects are described
 * below.
 *
 * @section event-variable The attribute 'variable'
 * 
 * The EventAssignment attribute 'variable' must be the identifier of an
 * existing Compartment, Species, SpeciesReference, or Parameter
 * instance defined in the model.  When the event is executed, the value of
 * the model component identified by 'variable' is changed by the
 * EventAssignment to the value computed by the 'math' element; that is, a
 * species' quantity, species reference's stoichiometry, compartment's size
 * or parameter's value are reset to the value computed by 'math'.
 *
 * Certain restrictions are placed on what can appear in 'variable':
 * <ul>
 * <li> The object identified by the value of the EventAssignment attribute
 * 'variable' must not have its 'constant' attribute set to or default to
 * @c true.  (Constants cannot be affected by events.)
 *
 * <li> The 'variable' attribute must not contain the identifier of a
 * reaction; only species, species references, compartment and parameter
 * values may be set by an Event.
 *
 * <li> The value of every 'variable' attribute must be unique among the set
 * of EventAssignment structures within a given Event structure.  In other
 * words, a single event cannot have multiple EventAssignment objects
 * assigning the same variable.  (All of them would be performed at the
 * same time when that particular Event triggers, resulting in
 * indeterminacy.)  However, @em separate Event instances can refer to the
 * same variable.
 *  
 * <li> A variable cannot be assigned a value in an EventAssignment object
 * instance and also be assigned a value by an AssignmentRule; i.e., the
 * value of an EventAssignment's 'variable' attribute cannot be the same as
 * the value of a AssignmentRule' 'variable' attribute.  (Assignment rules
 * hold at all times, therefore it would be inconsistent to also define an
 * event that reassigns the value of the same variable.)
 * </ul>
 *
 * Note that the time of assignment of the object identified by the
 * value of the 'variable' attribute is always the time at which the Event
 * is <em>executed</em>, not when it is <em>triggered</em>.  The timing is
 * controlled by the optional Delay in an Event.  The time of
 * assignment is not affected by the 'useValuesFromTriggerTime'
 * attribute on Event---that attribute affects the time at which the
 * EventAssignment's 'math' expression is @em evaluated.  In other
 * words, SBML allows decoupling the time at which the
 * 'variable' is assigned from the time at which its value
 * expression is calculated.
 *
 * @section event-math The 'math' subelement in an EventAssignment
 * 
 * The MathML expression contained in an EventAssignment defines the new
 * value of the variable being assigned by the Event.
 * 
 * As mentioned above, the time at which the expression in 'math' is
 * evaluated is determined by the attribute 'useValuesFromTriggerTime' on
 * Event.  If the attribute value is @c true, the expression must be
 * evaluated when the event is @em triggered; more precisely, the values of
 * identifiers occurring in MathML <code>&lt;ci&gt;</code> elements in the
 * EventAssignment's 'math' expression are the values they have at the
 * point when the event @em triggered.  If, instead,
 * 'useValuesFromTriggerTime''s value is @c false, it means the values at
 * @em execution time should be used; that is, the values of identifiers
 * occurring in MathML <code>&lt;ci&gt;</code> elements in the
 * EventAssignment's 'math' expression are the values they have at the
 * point when the event @em executed.
 *
 * @section eventassignment-version-diffs SBML Level/Version differences
 * 
 * Between Version&nbsp;4 and previous versions of SBML Level&nbsp;2, the
 * requirements regarding the matching of units between an
 * EvengAssignment's formula and the units of the object identified by the
 * 'variable' attribute changed.  Previous versions required consistency,
 * but in SBML Level&nbsp;2 Version&nbsp;4 and in SBML Level&nbsp;3, unit
 * consistency is only @em recommended.  More precisely:
 * <ul>
 *
 * <li> In the case of a species, an EventAssignment sets the referenced
 * species' quantity (concentration or amount of substance) to the value
 * determined by the formula in the EventAssignment's 'math' subelement.
 * The units of the 'math' formula should (in SBML Level&nbsp;2
 * Version&nbsp;4 and in Level&nbsp;3) or must (in previous Versions of
 * Level&nbsp;2) be identical to the units of the species.
 *
 * <li> (SBML Level&nbsp;3 only.) In the case of a species reference, an
 * EventAssignment sets the stoichiometry of the reactant or product
 * referenced by the SpeciesReference object to the value determined by the
 * formula in the 'math' element.  The unit associated with the value
 * produced by the 'math' formula should be @c dimensionless, because
 * reactant and product stoichiometries in reactions are dimensionless
 * quantities.
 *
 * <li> In the case of a compartment, an EventAssignment sets the
 * referenced compartment's size to the size determined by the formula in
 * the 'math' subelement of the EventAssignment.  The overall units of the
 * formula should (in SBML Level&nbsp;2 Version&nbsp;4 and in Level&nbsp;3)
 * or must (in previous Versions of Level&nbsp;2) be identical to the units
 * specified for the size of the compartment identified by the
 * EventAssignment's 'variable' attribute.
 *
 * <li> In the case of a parameter, an EventAssignment sets the referenced
 * parameter's value to that determined by the formula in 'math'.  The
 * overall units of the formula should (in SBML Level&nbsp;2 Version&nbsp;4
 * and Level&nbsp;3) or must (in previous Versions of Level&nbsp;2) be
 * identical to the units defined for the parameter.
 * </ul>
 * 
 * Note that the formula placed in the 'math' element <em>has no assumed
 * units</em>.  The consistency of the units of the formula, and the units
 * of the entity which the assignment affects, must be explicitly
 * established just as in the case of the value of the Delay subelement.
 * An approach similar to the one discussed in the context of Delay may be
 * used for the formula of an EventAssignment.
 *
 * @see Event
 *
 * 
 * 
 */

public class EventAssignment : SBase {
	private HandleRef swigCPtr;
	
	internal EventAssignment(IntPtr cPtr, bool cMemoryOwn) : base(libsbmlPINVOKE.EventAssignment_SWIGUpcast(cPtr), cMemoryOwn)
	{
		//super(libsbmlPINVOKE.EventAssignmentUpcast(cPtr), cMemoryOwn);
		swigCPtr = new HandleRef(this, cPtr);
	}
	
	internal static HandleRef getCPtr(EventAssignment obj)
	{
		return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
	}
	
	internal static HandleRef getCPtrAndDisown (EventAssignment obj)
	{
		HandleRef ptr = new HandleRef(null, IntPtr.Zero);
		
		if (obj != null)
		{
			ptr             = obj.swigCPtr;
			obj.swigCMemOwn = false;
		}
		
		return ptr;
	}

  ~EventAssignment() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_EventAssignment(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  
/**
   * Creates a new EventAssignment using the given SBML @p level and @p version
   * values.
   *
   * @param level a long integer, the SBML Level to assign to this EventAssignment
   *
   * @param version a long integer, the SBML Version to assign to this
   * EventAssignment
   *
   *
 * @throws SBMLConstructorException
 * Thrown if the given @p level and @p version combination are invalid
 * or if this object is incompatible with the given level and version.
 *
 *
   *
   *
 * @note Attempting to add an object to an SBMLDocument having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * SBMLDocument), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.
 *
 *
   */ public
 EventAssignment(long level, long version) : this(libsbmlPINVOKE.new_EventAssignment__SWIG_0(level, version), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Creates a new EventAssignment using the given SBMLNamespaces object
   * @p sbmlns.
   *
   *
 * 
 * The SBMLNamespaces object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's SBMLNamespaces facilities is to create an
 * SBMLNamespaces object somewhere in a program once, then hand that object
 * as needed to object constructors that accept SBMLNamespaces as arguments.
 *
 * 
   *
   * @param sbmlns an SBMLNamespaces object.
   *
   *
 * @throws SBMLConstructorException
 * Thrown if the given @p sbmlns is inconsistent or incompatible
 * with this object.
 *
 *
   *
   *
 * @note Attempting to add an object to an SBMLDocument having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * SBMLDocument), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.
 *
 *
   */ public
 EventAssignment(SBMLNamespaces sbmlns) : this(libsbmlPINVOKE.new_EventAssignment__SWIG_1(SBMLNamespaces.getCPtr(sbmlns)), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Copy constructor; creates a copy of this EventAssignment.
   *
   * @param orig the object to copy.
   */ public
 EventAssignment(EventAssignment orig) : this(libsbmlPINVOKE.new_EventAssignment__SWIG_2(EventAssignment.getCPtr(orig)), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Creates and returns a deep copy of this EventAssignment object.
   *
   * @return the (deep) copy of this EventAssignment object.
   */ public new
 EventAssignment clone() {
    IntPtr cPtr = libsbmlPINVOKE.EventAssignment_clone(swigCPtr);
    EventAssignment ret = (cPtr == IntPtr.Zero) ? null : new EventAssignment(cPtr, true);
    return ret;
  }

  
/**
   * Get the value of this EventAssignment's 'variable' attribute.
   * 
   * @return the identifier stored in the 'variable' attribute of this
   * EventAssignment.
   */ public
 string getVariable() {
    string ret = libsbmlPINVOKE.EventAssignment_getVariable(swigCPtr);
    return ret;
  }

  
/**
   * Get the mathematical expression in this EventAssignment's 'math'
   * subelement.
   * 
   * @return the top ASTNode of an abstract syntax tree representing the
   * mathematical formula in this EventAssignment.
   */ public
 ASTNode getMath() {
    IntPtr cPtr = libsbmlPINVOKE.EventAssignment_getMath(swigCPtr);
    ASTNode ret = (cPtr == IntPtr.Zero) ? null : new ASTNode(cPtr, false);
    return ret;
  }

  
/**
   * Predicate for testing whether the attribute 'variable' of this
   * EventAssignment is set.
   * 
   * @return @c true if the 'variable' attribute of this EventAssignment
   * is set, @c false otherwise.
   */ public
 bool isSetVariable() {
    bool ret = libsbmlPINVOKE.EventAssignment_isSetVariable(swigCPtr);
    return ret;
  }

  
/**
   * Predicate for testing whether the 'math' subelement of this
   * EventAssignment is set.
   * 
   * @return @c true if this EventAssignment has a 'math' subelement,
   * @c false otherwise.
   */ public
 bool isSetMath() {
    bool ret = libsbmlPINVOKE.EventAssignment_isSetMath(swigCPtr);
    return ret;
  }

  
/**
   * Sets the attribute 'variable' of this EventAssignment to a copy of
   * the given identifier string.
   *
   * @param sid the identifier of a Compartment, Species or (global)
   * Parameter defined in this model.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE@endlink
   */ public
 int setVariable(string sid) {
    int ret = libsbmlPINVOKE.EventAssignment_setVariable(swigCPtr, sid);
    return ret;
  }

  
/**
   * Unsets the attribute 'variable' of this EventAssignment.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE@endlink
   */ public
 int unsetVariable() {
    int ret = libsbmlPINVOKE.EventAssignment_unsetVariable(swigCPtr);
    return ret;
  }

  
/**
   * Sets the 'math' subelement of this EventAssignment to a copy of the
   * given ASTNode.
   *
   * @param math an ASTNode that will be copied and stored as the
   * mathematical formula for this EventAssignment.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT@endlink
   */ public
 int setMath(ASTNode math) {
    int ret = libsbmlPINVOKE.EventAssignment_setMath(swigCPtr, ASTNode.getCPtr(math));
    return ret;
  }

  
/**
   * Calculates and returns a UnitDefinition that expresses the units of
   * measurement assumed for the 'math' expression of this EventAssignment.
   *
   *
 * 
 * The units are calculated based on the mathematical expression in the
 * EventAssignment and the model quantities referenced by
 * <code>&lt;ci&gt;</code> elements used within that expression.  The method
 * EventAssignment::getDerivedUnitDefinition() returns the calculated units,
 * to the extent that libSBML can compute them.
 *
 * 
   *
   *
 * @note The functionality that facilitates unit analysis depends on the
 * model as a whole.  Thus, in cases where the object has not been added to
 * a model or the model itself is incomplete, unit analysis is not possible
 * and this method will return @c null.
 *
 * 
   *
   *
 * @warning <span class='warning'>Note that it is possible the 'math'
 * expression in the EventAssignment contains literal numbers or parameters
 * with undeclared units.  In those cases, it is not possible to calculate
 * the units of the overall expression without making assumptions.  LibSBML
 * does not make assumptions about the units, and
 * EventAssignment::getDerivedUnitDefinition() only returns the units as far
 * as it is able to determine them.  For example, in an expression <em>X +
 * Y</em>, if <em>X</em> has unambiguously-defined units and <em>Y</em> does
 * not, it will return the units of <em>X</em>.  When using this method,
 * <strong>it is critical that callers also invoke the method</strong>
 * EventAssignment::containsUndeclaredUnits() <strong>to determine whether
 * this situation holds</strong>.  Callers should take suitable action in
 * those situations.</span>
 *
   * 
   * @return a UnitDefinition that expresses the units of the math 
   * expression of this EventAssignment, or @c null if one cannot be constructed.
   *
   * @see containsUndeclaredUnits()
   */ public
 UnitDefinition getDerivedUnitDefinition() {
    IntPtr cPtr = libsbmlPINVOKE.EventAssignment_getDerivedUnitDefinition__SWIG_0(swigCPtr);
    UnitDefinition ret = (cPtr == IntPtr.Zero) ? null : new UnitDefinition(cPtr, false);
    return ret;
  }

  
/**
   * Predicate returning @c true if the math expression of this
   * EventAssignment contains literal numbers or parameters with undeclared
   * units.
   *
   *
 * 
 * The units are calculated based on the mathematical expression in the
 * EventAssignment and the model quantities referenced by
 * <code>&lt;ci&gt;</code> elements used within that expression.  The method
 * EventAssignment::getDerivedUnitDefinition() returns the calculated units,
 * to the extent that libSBML can compute them.
 *
 *
   *
   * If the expression contains literal numbers or parameters with undeclared
   * units, libSBML may not be able to compute the full units of the
   * expression and will only return what it can compute.  Callers should
   * always use EventAssignment::containsUndeclaredUnits() when using
   * EventAssignment::getDerivedUnitDefinition() to decide whether the
   * returned units may be incomplete.
   * 
   * @return @c true if the math expression of this EventAssignment
   * includes parameters/numbers 
   * with undeclared units, @c false otherwise.
   *
   * @note A return value of @c true indicates that the UnitDefinition
   * returned by EventAssignment::getDerivedUnitDefinition() may not
   * accurately represent the units of the expression.
   *
   * @see getDerivedUnitDefinition()
   */ public
 bool containsUndeclaredUnits() {
    bool ret = libsbmlPINVOKE.EventAssignment_containsUndeclaredUnits__SWIG_0(swigCPtr);
    return ret;
  }

  
/**
   * Returns the libSBML type code of this object instance.
   *
   *
 * 
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * @if clike The set of possible type codes for core elements is defined in
 * the enumeration #SBMLTypeCode_t, and in addition, libSBML plug-ins for
 * SBML Level&nbsp;3 packages define their own extra enumerations of type
 * codes (e.g., #SBMLLayoutTypeCode_t for the Level&nbsp;3 Layout
 * package).@endif@if java In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.  @endif@if python In the Python language
 * interface for libSBML, the type codes are defined as static integer
 * constants in the interface class @link libsbml@endlink.@endif@if csharp In
 * the C# language interface for libSBML, the type codes are defined as
 * static integer constants in the interface class
 * @link libsbmlcs.libsbml@endlink.@endif  Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the <code>getPackageName()</code>
 * method on the object.
 *
 *
   *
   * @return the SBML type code for this object:
   * @link libsbml#SBML_EVENT_ASSIGNMENT SBML_EVENT_ASSIGNMENT@endlink (default).
   *
   *
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different Level&nbsp;3 package plug-ins.
 * Thus, to identifiy the correct code, <strong>it is necessary to invoke
 * both getTypeCode() and getPackageName()</strong>.</span>
 *
 *
   *
   * @see getElementName()
   * @see getPackageName()
   */ public new
 int getTypeCode() {
    int ret = libsbmlPINVOKE.EventAssignment_getTypeCode(swigCPtr);
    return ret;
  }

  
/**
   * Returns the XML element name of this object, which for
   * EventAssignment, is always @c 'eventAssignment'.
   * 
   * @return the name of this element, i.e., @c 'eventAssignment'. 
   */ public new
 string getElementName() {
    string ret = libsbmlPINVOKE.EventAssignment_getElementName(swigCPtr);
    return ret;
  }

  
/**
   * Predicate returning @c true if all the required attributes for this
   * EventAssignment object have been set.
   *
   * The required attributes for a EventAssignment object are:
   * @li 'variable'
   *
   * @return @c true if the required attributes have been set, @c false
   * otherwise.
   */ public new
 bool hasRequiredAttributes() {
    bool ret = libsbmlPINVOKE.EventAssignment_hasRequiredAttributes(swigCPtr);
    return ret;
  }

  
/**
   * Predicate returning @c true if all the required elements for this
   * EventAssignment object have been set.
   *
   * @note The required elements for a EventAssignment object are:
   * @li 'math'
   *
   * @return a boolean value indicating whether all the required
   * elements for this object have been defined.
   */ public new
 bool hasRequiredElements() {
    bool ret = libsbmlPINVOKE.EventAssignment_hasRequiredElements(swigCPtr);
    return ret;
  }

  
/** */ /* libsbml-internal */ public new
 string getId() {
    string ret = libsbmlPINVOKE.EventAssignment_getId(swigCPtr);
    return ret;
  }

  
/**
   *
 * Replaces all uses of a given @c SIdRef type attribute value with another
 * value.
 *
 *
 * 

 * In SBML, object identifiers are of a data type called <code>SId</code>.
 * In SBML Level&nbsp;3, an explicit data type called <code>SIdRef</code> was
 * introduced for attribute values that refer to <code>SId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to an identifier', but the effective
 * data type was the same as <code>SIdRef</code>in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>SIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 *
 *
 *
 * This method works by looking at all attributes and (if appropriate)
 * mathematical formulas in MathML content, comparing the referenced
 * identifiers to the value of @p oldid.  If any matches are found, the
 * matching values are replaced with @p newid.  The method does @em not
 * descend into child elements.
 *
 * @param oldid the old identifier
 * @param newid the new identifier
 *
 *
   */ public new
 void renameSIdRefs(string oldid, string newid) {
    libsbmlPINVOKE.EventAssignment_renameSIdRefs(swigCPtr, oldid, newid);
  }

  
/**
   *
 * Replaces all uses of a given @c UnitSIdRef type attribute value with
 * another value.
 *
 *
 * 
 * In SBML, unit definitions have identifiers of type <code>UnitSId</code>.  In
 * SBML Level&nbsp;3, an explicit data type called <code>UnitSIdRef</code> was
 * introduced for attribute values that refer to <code>UnitSId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to a unit identifier', but the effective
 * data type was the same as <code>UnitSIdRef</code> in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>UnitSIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 *
 *
 *
 * This method works by looking at all unit identifier attribute values
 * (including, if appropriate, inside mathematical formulas), comparing the
 * referenced unit identifiers to the value of @p oldid.  If any matches
 * are found, the matching values are replaced with @p newid.  The method
 * does @em not descend into child elements.
 *
 * @param oldid the old identifier
 * @param newid the new identifier
 *
 *
   */ public new
 void renameUnitSIdRefs(string oldid, string newid) {
    libsbmlPINVOKE.EventAssignment_renameUnitSIdRefs(swigCPtr, oldid, newid);
  }

  
/** */ /* libsbml-internal */ public new
 void replaceSIDWithFunction(string id, ASTNode function) {
    libsbmlPINVOKE.EventAssignment_replaceSIDWithFunction(swigCPtr, id, ASTNode.getCPtr(function));
  }

  
/** */ /* libsbml-internal */ public new
 void divideAssignmentsToSIdByFunction(string id, ASTNode function) {
    libsbmlPINVOKE.EventAssignment_divideAssignmentsToSIdByFunction(swigCPtr, id, ASTNode.getCPtr(function));
  }

  
/** */ /* libsbml-internal */ public new
 void multiplyAssignmentsToSIdByFunction(string id, ASTNode function) {
    libsbmlPINVOKE.EventAssignment_multiplyAssignmentsToSIdByFunction(swigCPtr, id, ASTNode.getCPtr(function));
  }

}

}
