/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Parent class for libSBML's 'ListOfXYZ' classes.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * The {@link ListOf} class in libSBML is a utility class that serves as the parent
 * class for implementing the ListOf__ classes.  It provides methods for
 * working generically with the various SBML lists of objects in a program.
 * LibSBML uses this separate list class rather than ordinary
 * Java lists,
 * so that it can provide the methods and features associated with {@link SBase}.
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
 * The relationship between the lists and the rest of an SBML model is
 * illustrated by the following (for SBML Level&nbsp;2 Version&nbsp;4):
 <p>
 * <figure>
  <object type="image/svg+xml" data="listof-illustration.svg" class="centered"></object>
</figure>

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

public class ListOf extends SBase {
   private long swigCPtr;

   protected ListOf(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOf_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOf obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOf obj)
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
        libsbmlJNI.delete_ListOf(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOf} object.
   <p>
   * @param level the SBML Level; if not assigned, defaults to the
   * value of {@link SBMLDocument#getDefaultLevel()}.
   <p>
   * @param version the Version within the SBML Level; if not assigned,
   * defaults to the value of {@link SBMLDocument#getDefaultVersion()}.
   <p>
   * <p>
 * @note Bare {@link ListOf} objects are
 * impossible to add to SBML models.  The {@link ListOf}
 * class is simply the base
 * of <em>other</em> classes in
 * libSBML.  Calling programs are not intended to create bare {@link ListOf}
 * objects themselves.
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
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 ListOf(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOf__SWIG_0(level, version), true);
  }

  
/**
   * Creates a new {@link ListOf} object.
   <p>
   * @param level the SBML Level; if not assigned, defaults to the
   * value of {@link SBMLDocument#getDefaultLevel()}.
   <p>
   * @param version the Version within the SBML Level; if not assigned,
   * defaults to the value of {@link SBMLDocument#getDefaultVersion()}.
   <p>
   * <p>
 * @note Bare {@link ListOf} objects are
 * impossible to add to SBML models.  The {@link ListOf}
 * class is simply the base
 * of <em>other</em> classes in
 * libSBML.  Calling programs are not intended to create bare {@link ListOf}
 * objects themselves.
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
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 ListOf(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOf__SWIG_1(level), true);
  }

  
/**
   * Creates a new {@link ListOf} object.
   <p>
   * @param level the SBML Level; if not assigned, defaults to the
   * value of {@link SBMLDocument#getDefaultLevel()}.
   <p>
   * @param version the Version within the SBML Level; if not assigned,
   * defaults to the value of {@link SBMLDocument#getDefaultVersion()}.
   <p>
   * <p>
 * @note Bare {@link ListOf} objects are
 * impossible to add to SBML models.  The {@link ListOf}
 * class is simply the base
 * of <em>other</em> classes in
 * libSBML.  Calling programs are not intended to create bare {@link ListOf}
 * objects themselves.
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
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 ListOf() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOf__SWIG_2(), true);
  }

  
/**
   * Creates a new {@link ListOf} with a given {@link SBMLNamespaces} object.
   <p>
   * @param sbmlns the set of SBML namespaces that this {@link ListOf} should
   * contain.
   <p>
   * <p>
 * @note Bare {@link ListOf} objects are
 * impossible to add to SBML models.  The {@link ListOf}
 * class is simply the base
 * of <em>other</em> classes in
 * libSBML.  Calling programs are not intended to create bare {@link ListOf}
 * objects themselves.
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
 ListOf(SBMLNamespaces sbmlns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOf__SWIG_3(SBMLNamespaces.getCPtr(sbmlns), sbmlns), true);
  }

  
/**
   * Copy constructor; creates a copy of this {@link ListOf}.
   <p>
   * @param orig the {@link ListOf} instance to copy.
   */ public
 ListOf(ListOf orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOf__SWIG_4(ListOf.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOf} object.
   <p>
   * @return the (deep) copy of this {@link ListOf} object.
   */ public
 ListOf cloneObject() {
    long cPtr = libsbmlJNI.ListOf_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOf(cPtr, true);
  }

  
/**
   * Adds an item to the end of this {@link ListOf}'s list of items.
   <p>
   * This method makes a clone of the <code>item</code> handed to it.  This means that
   * when the {@link ListOf} object is destroyed, the original items will not be
   * destroyed.  For a method with an alternative ownership behavior, see the
   * {@link ListOf#appendAndOwn(SBase)} method.
   <p>
   * @param item the item to be added to the list.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   *
   * </ul> <p>
   * @see #appendAndOwn(SBase disownedItem)
   * @see #appendFrom(ListOf list)
   */ public
 int append(SBase item) {
    return libsbmlJNI.ListOf_append(swigCPtr, this, SBase.getCPtr(item), item);
  }

  
/**
   * Adds an item to the end of this {@link ListOf}'s list of items.
   <p>
   * This method does not clone the <code>disownedItem</code> handed to it; instead, it assumes
   * ownership of it.  This means that when the {@link ListOf} is destroyed, the item
   * will be destroyed along with it.  For a method with an alternative
   * ownership behavior, see the {@link ListOf#append(SBase item)} method.
   <p>
   * @param disownedItem the item to be added to the list.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   *
   * </ul> <p>
   * @see #append(SBase item)
   * @see #appendFrom(ListOf list)
   */ public
 int appendAndOwn(SBase disownedItem) {
    return libsbmlJNI.ListOf_appendAndOwn(swigCPtr, this, SBase.getCPtrAndDisown(disownedItem), disownedItem);
  }

  
/**
   * Adds a clone of a list of items to this {@link ListOf}'s list.
   <p>
   * Note that because this clones the objects handed to it, the original
   * items will not be destroyed when this {@link ListOf} object is destroyed.
   <p>
   * @param list a list of items to be added.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   *
   * </ul> <p>
   * @see #append(SBase item)
   * @see #appendAndOwn(SBase disownedItem)
   */ public
 int appendFrom(ListOf list) {
    return libsbmlJNI.ListOf_appendFrom(swigCPtr, this, ListOf.getCPtr(list), list);
  }

  
/**
   * Inserts an item at a given position in this {@link ListOf}'s list of items.
   <p>
   * This variant of the method makes a clone of the <code>item</code> handed to it.
   * This means that when the {@link ListOf} is destroyed, the original <code>item</code> will
   * <em>not</em> be destroyed.
   <p>
   * @param location the location in the list where to insert the item.
   * @param item the item to be inserted to the list.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   *
   * </ul> <p>
   * @see #insertAndOwn(int location, SBase item)
   */ public
 int insert(int location, SBase item) {
    return libsbmlJNI.ListOf_insert(swigCPtr, this, location, SBase.getCPtr(item), item);
  }

  
/**
   * Inserts an item at a given position in this {@link ListOf}'s list of items.
   <p>
   * This variant of the method does not make a clone of the <code>disownedItem</code> handed to it.
   * This means that when the {@link ListOf} is destroyed, the original <code>item</code>
   * <em>will</em> be destroyed.
   <p>
   * @param location the location where to insert the item
   * @param disownedItem the item to be inserted to the list
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   *
   * </ul> <p>
   * @see #insert(int location, SBase item)
   */ public
 int insertAndOwn(int location, SBase disownedItem) {
    return libsbmlJNI.ListOf_insertAndOwn(swigCPtr, this, location, SBase.getCPtrAndDisown(disownedItem), disownedItem);
  }

  
/**
   * Get an item from the list.
   <p>
   * @param n the index number of the item to get.
   <p>
   * @return the <em>n</em>th item in this {@link ListOf} items, or a null pointer if
   * the index number <code>n</code> refers to a nonexistent position in this list.
   <p>
   * @see #size()
   */ public
 SBase get(long n) {
  return libsbml.DowncastSBase(libsbmlJNI.ListOf_get__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Returns the first child element found that has the given identifier.
   <p>
   * This method searches this {@link ListOf}'s list of items for SBML objects based
   * on their 'id' attribute value in the model-wide <code>SId</code>
   * identifier namespace.
   <p>
   * @param id string representing the id of the object to find.
   <p>
   * @return the first element found with the given <code>id</code>, or <code>null</code> if no
   * such object is found.
   */ public
 SBase getElementBySId(String id) {
  return libsbml.DowncastSBase(libsbmlJNI.ListOf_getElementBySId(swigCPtr, this, id), false);
}

  
/**
   * Returns the first child element found with the given meta-identifier.
   <p>
   * @param metaid string representing the 'metaid' attribute of the object
   * to find.
   <p>
   * @return the first element found with the given <code>metaid</code>, or <code>null</code> if
   * no such object is found.
   */ public
 SBase getElementByMetaId(String metaid) {
  return libsbml.DowncastSBase(libsbmlJNI.ListOf_getElementByMetaId(swigCPtr, this, metaid), false);
}

  
/**
   * Removes all items in this {@link ListOf} object.
   <p>
   * If parameter <code>doDelete</code> is <code>true</code> (default), all items in this {@link ListOf}
   * object are deleted and cleared, and thus the caller doesn't have to
   * delete those items.  Otherwise, all items are cleared only from this
   * {@link ListOf} object; the caller is still responsible for deleting the actual
   * items.  (In the latter case, callers are advised to store pointers to
   * all items elsewhere before calling this function.)
   <p>
   * @param doDelete if <code>true</code> (default), all items are deleted and cleared.
   * Otherwise, all items are just cleared and not deleted.
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 void clear(boolean doDelete) {
    libsbmlJNI.ListOf_clear__SWIG_0(swigCPtr, this, doDelete);
  }

  
/**
   * Removes all items in this {@link ListOf} object.
   <p>
   * If parameter <code>doDelete</code> is <code>true</code> (default), all items in this {@link ListOf}
   * object are deleted and cleared, and thus the caller doesn't have to
   * delete those items.  Otherwise, all items are cleared only from this
   * {@link ListOf} object; the caller is still responsible for deleting the actual
   * items.  (In the latter case, callers are advised to store pointers to
   * all items elsewhere before calling this function.)
   <p>
   * @param doDelete if <code>true</code> (default), all items are deleted and cleared.
   * Otherwise, all items are just cleared and not deleted.
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 void clear() {
    libsbmlJNI.ListOf_clear__SWIG_1(swigCPtr, this);
  }

  
/**
   * Removes all items in this {@link ListOf} object and deletes its properties too.
   <p>
   * This performs a call to clear() with an argument of <code>true</code> (thus removing
   * all the child objects in the list), followed by calls to various libSBML
   * <code>unset<em>Foo</em></code> methods to delete everything else: {@link CVTerm}
   * objects, model history objects, etc.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int removeFromParentAndDelete() {
    return libsbmlJNI.ListOf_removeFromParentAndDelete(swigCPtr, this);
  }

  
/**
   * Removes the <em>n</em>th item from this {@link ListOf} list of items and returns
   * it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the item to remove
   <p>
   * @see #size()
   */ public
 SBase remove(long n) {
  return libsbml.DowncastSBase(libsbmlJNI.ListOf_remove(swigCPtr, this, n), true);
}

  
/**
   * Returns number of items in this {@link ListOf} list.
   <p>
   * @return the number of items in this {@link ListOf} items.
   */ public
 long size() {
    return libsbmlJNI.ListOf_size(swigCPtr, this);
  }

  public void connectToChild() {
    libsbmlJNI.ListOf_connectToChild(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this object, namely,
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}.
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
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF} (default).
   <p>
   * @note The various {@link ListOf} classes mostly differ from each other in what they
   * contain.  Hence, one must call getItemTypeCode() to fully determine the
   * class of this SBML object.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different Level&nbsp;3 package plug-ins.
 * Thus, to identifiy the correct code, <strong>it is necessary to invoke
 * both getTypeCode() and getPackageName()</strong>.</span>
   <p>
   * @see #getItemTypeCode()
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.ListOf_getTypeCode(swigCPtr, this);
  }

  
/**
   * Get the type code of the objects contained in this {@link ListOf}.
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
   * Classes that inherit from the {@link ListOf} class should override this method
   * to return the SBML type code for the objects contained in this {@link ListOf}.
   * If they do not, this method will return
   * {@link libsbmlConstants#SBML_UNKNOWN SBML_UNKNOWN}
   <p>
   * @return The {@link ListOf} base class contains no SBML objects, and therefore
   * this method returns {@link libsbmlConstants#SBML_UNKNOWN SBML_UNKNOWN}.
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOf_getItemTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this object, which for {@link ListOf}, is
   * always <code>'listOf'.</code>
   <p>
   * @return the XML name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.ListOf_getElementName(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.ListOf_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
