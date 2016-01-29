/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Base class for extensions that plug into AST classes.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 * @internal
 */

public class ASTBasePlugin {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected ASTBasePlugin(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(ASTBasePlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ASTBasePlugin obj)
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
        libsbmlJNI.delete_ASTBasePlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  
/** * @internal */ public
 ASTBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.ASTBasePlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ASTBasePlugin(cPtr, true);
  }

  
/** * @internal */ public
 String getElementNamespace() {
    return libsbmlJNI.ASTBasePlugin_getElementNamespace(swigCPtr, this);
  }

  
/** * @internal */ public
 String getPrefix() {
    return libsbmlJNI.ASTBasePlugin_getPrefix(swigCPtr, this);
  }

  
/** * @internal */ public
 String getPackageName() {
    return libsbmlJNI.ASTBasePlugin_getPackageName(swigCPtr, this);
  }

  
/** * @internal */ public
 int setSBMLExtension(SBMLExtension ext) {
    return libsbmlJNI.ASTBasePlugin_setSBMLExtension(swigCPtr, this, SBMLExtension.getCPtr(ext), ext);
  }

  
/** * @internal */ public
 int setPrefix(String prefix) {
    return libsbmlJNI.ASTBasePlugin_setPrefix(swigCPtr, this, prefix);
  }

  
/** * @internal */ public
 void connectToParent(ASTBase astbase) {
    libsbmlJNI.ASTBasePlugin_connectToParent(swigCPtr, this, ASTBase.getCPtr(astbase), astbase);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.ASTBasePlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

  
/** * @internal */ public
 boolean stripPackage(String pkgPrefix, boolean flag) {
    return libsbmlJNI.ASTBasePlugin_stripPackage(swigCPtr, this, pkgPrefix, flag);
  }

  
/** * @internal */ public
 String getURI() {
    return libsbmlJNI.ASTBasePlugin_getURI(swigCPtr, this);
  }

  
/** * @internal */ public
 ASTBase getParentASTObject() {
  return libsbml.DowncastASTBase(libsbmlJNI.ASTBasePlugin_getParentASTObject__SWIG_0(swigCPtr, this), false);
}

  
/** * @internal */ public
 int setElementNamespace(String uri) {
    return libsbmlJNI.ASTBasePlugin_setElementNamespace(swigCPtr, this, uri);
  }

  
/** * @internal */ public
 long getLevel() {
    return libsbmlJNI.ASTBasePlugin_getLevel(swigCPtr, this);
  }

  
/** * @internal */ public
 long getVersion() {
    return libsbmlJNI.ASTBasePlugin_getVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 long getPackageVersion() {
    return libsbmlJNI.ASTBasePlugin_getPackageVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 SBMLNamespaces getSBMLNamespaces() {
  return libsbml.DowncastSBMLNamespaces(libsbmlJNI.ASTBasePlugin_getSBMLNamespaces(swigCPtr, this), false);
}

  
/** * @internal */ public
 boolean isSetMath() {
    return libsbmlJNI.ASTBasePlugin_isSetMath(swigCPtr, this);
  }

  
/** * @internal */ public
 ASTBase getMath() {
  return libsbml.DowncastASTBase(libsbmlJNI.ASTBasePlugin_getMath(swigCPtr, this), false);
}

  
/** * @internal */ public
 void createMath(int type) {
    libsbmlJNI.ASTBasePlugin_createMath(swigCPtr, this, type);
  }

  
/** * @internal */ public
 int addChild(ASTBase child) {
    return libsbmlJNI.ASTBasePlugin_addChild(swigCPtr, this, ASTBase.getCPtr(child), child);
  }

  
/** * @internal */ public
 ASTBase getChild(long n) {
  return libsbml.DowncastASTBase(libsbmlJNI.ASTBasePlugin_getChild(swigCPtr, this, n), false);
}

  
/** * @internal */ public
 long getNumChildren() {
    return libsbmlJNI.ASTBasePlugin_getNumChildren(swigCPtr, this);
  }

  
/** * @internal */ public
 int insertChild(long n, ASTBase newChild) {
    return libsbmlJNI.ASTBasePlugin_insertChild(swigCPtr, this, n, ASTBase.getCPtr(newChild), newChild);
  }

  
/** * @internal */ public
 int prependChild(ASTBase newChild) {
    return libsbmlJNI.ASTBasePlugin_prependChild(swigCPtr, this, ASTBase.getCPtr(newChild), newChild);
  }

  
/** * @internal */ public
 int removeChild(long n) {
    return libsbmlJNI.ASTBasePlugin_removeChild(swigCPtr, this, n);
  }

  
/** * @internal */ public
 int replaceChild(long n, ASTBase newChild, boolean delreplaced) {
    return libsbmlJNI.ASTBasePlugin_replaceChild(swigCPtr, this, n, ASTBase.getCPtr(newChild), newChild, delreplaced);
  }

  
/** * @internal */ public
 int swapChildren(SWIGTYPE_p_ASTFunction that) {
    return libsbmlJNI.ASTBasePlugin_swapChildren(swigCPtr, this, SWIGTYPE_p_ASTFunction.getCPtr(that));
  }

  
/** * @internal */ public
 boolean read(XMLInputStream stream, String reqd_prefix, XMLToken currentElement) {
    return libsbmlJNI.ASTBasePlugin_read(swigCPtr, this, XMLInputStream.getCPtr(stream), stream, reqd_prefix, XMLToken.getCPtr(currentElement), currentElement);
  }

  
/** * @internal */ public
 void addExpectedAttributes(SWIGTYPE_p_ExpectedAttributes attributes, XMLInputStream stream, int type) {
    libsbmlJNI.ASTBasePlugin_addExpectedAttributes(swigCPtr, this, SWIGTYPE_p_ExpectedAttributes.getCPtr(attributes), XMLInputStream.getCPtr(stream), stream, type);
  }

  
/** * @internal */ public
 boolean readAttributes(XMLAttributes attributes, SWIGTYPE_p_ExpectedAttributes expectedAttributes, XMLInputStream stream, XMLToken element, int type) {
    return libsbmlJNI.ASTBasePlugin_readAttributes(swigCPtr, this, XMLAttributes.getCPtr(attributes), attributes, SWIGTYPE_p_ExpectedAttributes.getCPtr(expectedAttributes), XMLInputStream.getCPtr(stream), stream, XMLToken.getCPtr(element), element, type);
  }

  
/** * @internal */ public
 void writeAttributes(XMLOutputStream stream, int type) {
    libsbmlJNI.ASTBasePlugin_writeAttributes(swigCPtr, this, XMLOutputStream.getCPtr(stream), stream, type);
  }

  
/** * @internal */ public
 void writeXMLNS(XMLOutputStream stream) {
    libsbmlJNI.ASTBasePlugin_writeXMLNS(swigCPtr, this, XMLOutputStream.getCPtr(stream), stream);
  }

  
/** * @internal */ public
 boolean isNumberNode(int type) {
    return libsbmlJNI.ASTBasePlugin_isNumberNode(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isFunctionNode(int type) {
    return libsbmlJNI.ASTBasePlugin_isFunctionNode(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isLogical(int type) {
    return libsbmlJNI.ASTBasePlugin_isLogical(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isConstantNumber(int type) {
    return libsbmlJNI.ASTBasePlugin_isConstantNumber(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isCSymbolFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_isCSymbolFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isCSymbolNumber(int type) {
    return libsbmlJNI.ASTBasePlugin_isCSymbolNumber(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isName(int type) {
    return libsbmlJNI.ASTBasePlugin_isName(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isNumber(int type) {
    return libsbmlJNI.ASTBasePlugin_isNumber(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isOperator(int type) {
    return libsbmlJNI.ASTBasePlugin_isOperator(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isRelational(int type) {
    return libsbmlJNI.ASTBasePlugin_isRelational(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsQualifier(int type) {
    return libsbmlJNI.ASTBasePlugin_representsQualifier(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_isFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsUnaryFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_representsUnaryFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsBinaryFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_representsBinaryFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsNaryFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_representsNaryFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean hasCorrectNumberArguments(int type) {
    return libsbmlJNI.ASTBasePlugin_hasCorrectNumberArguments(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isWellFormedNode(int type) {
    return libsbmlJNI.ASTBasePlugin_isWellFormedNode(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isTopLevelMathMLFunctionNodeTag(String name) {
    return libsbmlJNI.ASTBasePlugin_isTopLevelMathMLFunctionNodeTag(swigCPtr, this, name);
  }

  
/** * @internal */ public
 boolean isTopLevelMathMLNumberNodeTag(String name) {
    return libsbmlJNI.ASTBasePlugin_isTopLevelMathMLNumberNodeTag(swigCPtr, this, name);
  }

  
/** * @internal */ public
 int getTypeFromName(String name) {
    return libsbmlJNI.ASTBasePlugin_getTypeFromName(swigCPtr, this, name);
  }

  
/** * @internal */ public
 String getNameFromType(int type) {
    return libsbmlJNI.ASTBasePlugin_getNameFromType(swigCPtr, this, type);
  }

  
/** * @internal */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.ASTBasePlugin_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/** * @internal */ public
 void renameUnitSIdRefs(String oldid, String newid) {
    libsbmlJNI.ASTBasePlugin_renameUnitSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/** * @internal */ public
 void replaceIDWithFunction(String id, ASTNode function) {
    libsbmlJNI.ASTBasePlugin_replaceIDWithFunction(swigCPtr, this, id, ASTNode.getCPtr(function), function);
  }

}
