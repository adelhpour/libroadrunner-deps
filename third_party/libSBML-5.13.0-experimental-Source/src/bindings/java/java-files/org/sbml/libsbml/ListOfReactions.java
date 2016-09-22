/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  A list of {@link Reaction} objects.
 <p>
 * <p>
 * The various ListOf___ classes in SBML
 * are merely containers used for organizing the main components of an SBML
 * model.  In libSBML's implementation, ListOf___
 * classes are derived from the
 * intermediate utility class {@link ListOf}, which
 * is not defined by the SBML specifications but serves as a useful
 * programmatic construct.  {@link ListOf} is itself is in turn derived from {@link SBase},
 * which provides all of the various ListOf___
 * classes with common features
 * defined by the SBML specification, such as 'metaid' attributes and
 * annotations.
 <p>
 * Readers may wonder about the motivations for using the ListOf___
 * containers in SBML.  A simpler approach in XML might be to place the
 * components all directly at the top level of the model definition.  The
 * choice made in SBML is to group them within XML elements named after
 * ListOf<em>Classname</em>, in part because it helps organize the
 * components.  More importantly, the fact that the container classes are
 * derived from {@link SBase} means that software tools can add information <em>about</em>
 * the lists themselves into each list container's 'annotation'.
 <p>
 * @see ListOfFunctionDefinitions
 * @see ListOfUnitDefinitions
 * @see ListOfCompartmentTypes
 * @see ListOfSpeciesTypes
 * @see ListOfCompartments
 * @see ListOfSpecies
 * @see ListOfParameters
 * @see ListOfInitialAssignments
 * @see ListOfRules
 * @see ListOfConstraints
 * @see ListOfReactions
 * @see ListOfEvents
 */

public class ListOfReactions extends ListOf {
   private long swigCPtr;

   protected ListOfReactions(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfReactions_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfReactions obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfReactions obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_ListOfReactions(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfReactions} object.
   <p>
   * The object is constructed such that it is valid for the given SBML
   * Level and Version combination.
   <p>
   * @param level the SBML Level
   <p>
   * @param version the Version within the SBML Level
   <p>
   * <p>
 * @throws SBMLConstructorException
 * Thrown if the given <code>level</code> and <code>version</code> combination are invalid
 * or if this object is incompatible with the given level and version.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
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
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.
   */ public
 ListOfReactions(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfReactions__SWIG_0(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfReactions} object.
   <p>
   * The object is constructed such that it is valid for the SBML Level and
   * Version combination determined by the {@link SBMLNamespaces} object in 
   * <code>sbmlns</code>.
   <p>
   * @param sbmlns an {@link SBMLNamespaces} object that is used to determine the
   * characteristics of the {@link ListOfReactions} object to be created.
   <p>
   * <p>
 * @throws SBMLConstructorException
 * Thrown if the given <code>sbmlns</code> is inconsistent or incompatible
 * with this object.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
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
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.
   */ public
 ListOfReactions(SBMLNamespaces sbmlns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfReactions__SWIG_1(SBMLNamespaces.getCPtr(sbmlns), sbmlns), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfReactions} object.
   <p>
   * @return the (deep) copy of this {@link ListOfReactions} object.
   */ public
 ListOfReactions cloneObject() {
    long cPtr = libsbmlJNI.ListOfReactions_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfReactions(cPtr, true);
  }

  
/**
   * Returns the libSBML type code for the objects contained in this {@link ListOf}
   * (i.e., {@link Reaction} objects, if the list is non-empty).
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the <code>getPackageName()</code>
 * method on the object.
   <p>
   * @return the SBML type code for objects contained in this list:
   * {@link libsbmlConstants#SBML_REACTION SBML_REACTION} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfReactions_getItemTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this object
   <p>
   * For {@link ListOfReactions}, the XML element name is <code>'listOfReactions'.</code>
   <p>
   * @return the name of this element, i.e., <code>'listOfReactions'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfReactions_getElementName(swigCPtr, this);
  }

  
/**
   * Get a {@link Reaction} from the {@link ListOfReactions}.
   <p>
   * @param n the index number of the {@link Reaction} to get.
   <p>
   * @return the nth {@link Reaction} in this {@link ListOfReactions}.
   <p>
   * @see #size()
   */ public
 Reaction get(long n) {
  return (Reaction) libsbml.DowncastSBase(libsbmlJNI.ListOfReactions_get__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Get a {@link Reaction} from the {@link ListOfReactions} based on its identifier.
   <p>
   * @param sid a string representing the identifier of the {@link Reaction} to get.
   <p>
   * @return {@link Reaction} in this {@link ListOfReactions} with the given <code>sid</code> or 
   * <code>null</code> if no such {@link Reaction} exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 Reaction get(String sid) {
  return (Reaction) libsbml.DowncastSBase(libsbmlJNI.ListOfReactions_get__SWIG_2(swigCPtr, this, sid), false);
}

  
/**
   * Removes the nth item from this {@link ListOfReactions} items and returns a
   * pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the item to remove
   <p>
   * @see #size()
   */ public
 Reaction remove(long n) {
  return (Reaction) libsbml.DowncastSBase(libsbmlJNI.ListOfReactions_remove__SWIG_0(swigCPtr, this, n), true);
}

  
/**
   * Removes item in this {@link ListOfReactions} items with the given identifier.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then
   * null is returned.
   <p>
   * @param sid the identifier of the item to remove
   <p>
   * @return the item removed.  As mentioned above, the caller owns the
   * returned item.
   */ public
 Reaction remove(String sid) {
  return (Reaction) libsbml.DowncastSBase(libsbmlJNI.ListOfReactions_remove__SWIG_1(swigCPtr, this, sid), true);
}

}
