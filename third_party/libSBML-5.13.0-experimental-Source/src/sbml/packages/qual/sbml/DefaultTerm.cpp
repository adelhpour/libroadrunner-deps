/**
 * @file   DefaultTerm.cpp
 * @brief  Implementation of the DefaultTerm class
 * @author Generated by autocreate code
 *
 * <!--------------------------------------------------------------------------
 * This file is part of libSBML.  Please visit http://sbml.org for more
 * information about SBML, and the latest version of libSBML.
 *
 * Copyright (C) 2013-2016 jointly by the following organizations:
 *     1. California Institute of Technology, Pasadena, CA, USA
 *     2. EMBL European Bioinformatics Institute (EMBL-EBI), Hinxton, UK
 *     3. University of Heidelberg, Heidelberg, Germany
 * 
 * Copyright (C) 2009-2013 jointly by the following organizations:
 *     1. California Institute of Technology, Pasadena, CA, USA
 *     2. EMBL European Bioinformatics Institute (EMBL-EBI), Hinxton, UK
 *
 * Copyright (C) 2006-2008 by the California Institute of Technology,
 *     Pasadena, CA, USA 
 *
 * Copyright (C) 2002-2005 jointly by the following organizations:
 *     1. California Institute of Technology, Pasadena, CA, USA
 *     2. Japan Science and Technology Agency, Japan
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation.  A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as http://sbml.org/software/libsbml/license.html
 * ------------------------------------------------------------------------ -->
 */


#include <sbml/packages/qual/sbml/DefaultTerm.h>
#include <sbml/packages/qual/validator/QualSBMLError.h>


using namespace std;


LIBSBML_CPP_NAMESPACE_BEGIN
#ifdef __cplusplus


/*
 * Creates a new DefaultTerm with the given level, version, and package version.
 */
DefaultTerm::DefaultTerm (unsigned int level, unsigned int version, unsigned int pkgVersion)
  : SBase(level, version)
   ,mResultLevel (SBML_INT_MAX)
   ,mIsSetResultLevel (false)
{
  // set an SBMLNamespaces derived object of this package
  setSBMLNamespacesAndOwn(new QualPkgNamespaces(level, version, pkgVersion));
}


/*
 * Creates a new DefaultTerm with the given QualPkgNamespaces object.
 */
DefaultTerm::DefaultTerm (QualPkgNamespaces* qualns)
  : SBase(qualns)
   ,mResultLevel (SBML_INT_MAX)
   ,mIsSetResultLevel (false)
{
  // set the element namespace of this object
  setElementNamespace(qualns->getURI());

  // load package extensions bound with this object (if any) 
  loadPlugins(qualns);
}


/*
 * Copy constructor for DefaultTerm.
 */
DefaultTerm::DefaultTerm (const DefaultTerm& orig)
  : SBase(orig)
  , mResultLevel(orig.mResultLevel)
  , mIsSetResultLevel(orig.mIsSetResultLevel)
{
}


/*
 * Assignment for DefaultTerm.
 */
DefaultTerm&
DefaultTerm::operator=(const DefaultTerm& rhs)
{
  if (&rhs != this)
  {
    SBase::operator=(rhs);
    mResultLevel  = rhs.mResultLevel;
    mIsSetResultLevel  = rhs.mIsSetResultLevel;
  }
  return *this;
}


/*
 * Clone for DefaultTerm.
 */
DefaultTerm*
DefaultTerm::clone () const
{
  return new DefaultTerm(*this);
}


/*
 * Destructor for DefaultTerm.
 */
DefaultTerm::~DefaultTerm ()
{
}


/*
 * Returns the value of the "resultLevel" attribute of this DefaultTerm.
 */
int
DefaultTerm::getResultLevel() const
{
  return mResultLevel;
}


/*
 * Returns true/false if resultLevel is set.
 */
bool
DefaultTerm::isSetResultLevel() const
{
  return mIsSetResultLevel;
}


/*
 * Sets resultLevel and returns value indicating success.
 */
int
DefaultTerm::setResultLevel(int resultLevel)
{
  mResultLevel = resultLevel;
  mIsSetResultLevel = true;
  return LIBSBML_OPERATION_SUCCESS;
}


/*
 * Unsets resultLevel and returns value indicating success.
 */
int
DefaultTerm::unsetResultLevel()
{
  mResultLevel = SBML_INT_MAX;
  mIsSetResultLevel = false;

  if (isSetResultLevel() == false)
  {
    return LIBSBML_OPERATION_SUCCESS;
  }
  else
  {
    return LIBSBML_OPERATION_FAILED;
  }
}


/*
 * Returns the XML element name of this object
 */
const std::string&
DefaultTerm::getElementName () const
{
  static const string name = "defaultTerm";
  return name;
}


/*
 * Returns the libSBML type code for this SBML object.
 */
int
DefaultTerm::getTypeCode () const
{
  return SBML_QUAL_DEFAULT_TERM;
}


/*
 * check if all the required attributes are set
 */
bool
DefaultTerm::hasRequiredAttributes () const
{
  bool allPresent = true;

  if (isSetResultLevel() == false)
    allPresent = false;

  return allPresent;
}


  /** @cond doxygenLibsbmlInternal */
/*
 * write contained elements
 */
void
DefaultTerm::writeElements (XMLOutputStream& stream) const
{
  SBase::writeElements(stream);

  SBase::writeExtensionElements(stream);
}
/** @endcond */


/** @cond doxygenLibsbmlInternal */
bool
DefaultTerm::accept (SBMLVisitor& v) const
{
  return v.visit(*this);
}
/** @endcond */


  /** @cond doxygenLibsbmlInternal */
/*
 * Sets the parent SBMLDocument.
 */
void
DefaultTerm::setSBMLDocument (SBMLDocument* d)
{
  SBase::setSBMLDocument(d);
}
/** @endcond */


  /** @cond doxygenLibsbmlInternal */
/*
 * Enables/Disables the given package with this element.
 */
void
DefaultTerm::enablePackageInternal(const std::string& pkgURI,
             const std::string& pkgPrefix, bool flag)
{
  SBase::enablePackageInternal(pkgURI, pkgPrefix, flag);
}
/** @endcond */


  /** @cond doxygenLibsbmlInternal */
/*
 * Get the list of expected attributes for this element.
 */
void
DefaultTerm::addExpectedAttributes(ExpectedAttributes& attributes)
{
  SBase::addExpectedAttributes(attributes);

  attributes.add("resultLevel");
}
/** @endcond */


  /** @cond doxygenLibsbmlInternal */
/*
 * Read values from the given XMLAttributes set into their specific fields.
 */
void
DefaultTerm::readAttributes (const XMLAttributes& attributes,
                             const ExpectedAttributes& expectedAttributes)
{
  const unsigned int sbmlLevel   = getLevel  ();
  const unsigned int sbmlVersion = getVersion();

  unsigned int numErrs;

  SBase::readAttributes(attributes, expectedAttributes);

  // look to see whether an unknown attribute error was logged
  if (getErrorLog() != NULL)
  {
    numErrs = getErrorLog()->getNumErrors();
    for (int n = (int)numErrs-1; n >= 0; n--)
    {
      if (getErrorLog()->getError((unsigned int)n)->getErrorId() == UnknownPackageAttribute)
      {
        const std::string details =
                          getErrorLog()->getError((unsigned int)n)->getMessage();
        getErrorLog()->remove(UnknownPackageAttribute);
        getErrorLog()->logPackageError("qual", QualDefaultTermAllowedAttributes,
                       getPackageVersion(), sbmlLevel, sbmlVersion, details);
      }
      else if (getErrorLog()->getError((unsigned int)n)->getErrorId() == UnknownCoreAttribute)
      {
        const std::string details =
                          getErrorLog()->getError((unsigned int)n)->getMessage();
        getErrorLog()->remove(UnknownCoreAttribute);
        getErrorLog()->logPackageError("qual", QualDefaultTermAllowedCoreAttributes,
                       getPackageVersion(), sbmlLevel, sbmlVersion, details);
      }
    }
  }

  //
  // resultLevel int   ( use = "required" )
  //
  numErrs = getErrorLog()->getNumErrors();
  mIsSetResultLevel = attributes.readInto("resultLevel", mResultLevel);

  if (mIsSetResultLevel == false)
  {
    if (getErrorLog() != NULL)
    {
      if (getErrorLog()->getNumErrors() == numErrs + 1 &&
              getErrorLog()->contains(XMLAttributeTypeMismatch))
      {
        getErrorLog()->remove(XMLAttributeTypeMismatch);
        getErrorLog()->logPackageError("qual", QualDefaultTermResultMustBeInteger,
                     getPackageVersion(), sbmlLevel, sbmlVersion);
      }
      else
      {
        std::string message = "Qual attribute 'resultLevel' is missing.";
        getErrorLog()->logPackageError("qual", QualDefaultTermAllowedAttributes,
                       getPackageVersion(), sbmlLevel, sbmlVersion, message);
      }
    }
  }
  else
  {
    if (mResultLevel < 0)
    {
      std::stringstream msg;
      msg << "The resultLevel of the <defaultTerm> ";
      if (isSetId()) {
        msg << "with id '" << getId() << "' ";
      }
      msg << "is '" << mResultLevel << "', which is negative.";
      getErrorLog()->logPackageError("qual", QualDefaultTermResultMustBeNonNeg,
                   getPackageVersion(), sbmlLevel, sbmlVersion, msg.str());
    }
  }

}
/** @endcond */


  /** @cond doxygenLibsbmlInternal */
/*
 * Write values of XMLAttributes to the output stream.
 */
  void
DefaultTerm::writeAttributes (XMLOutputStream& stream) const
{
  SBase::writeAttributes(stream);

  if (isSetResultLevel() == true)
    stream.writeAttribute("resultLevel", getPrefix(), mResultLevel);

  SBase::writeExtensionAttributes(stream);

}
/** @endcond */


#endif /* __cplusplus */  
/** @cond doxygenIgnored */
LIBSBML_EXTERN
DefaultTerm_t *
DefaultTerm_create(unsigned int level, unsigned int version,
                   unsigned int pkgVersion)
{
  return new DefaultTerm(level, version, pkgVersion);
}


LIBSBML_EXTERN
void
DefaultTerm_free(DefaultTerm_t * dt)
{
  if (dt != NULL)
    delete dt;
}


LIBSBML_EXTERN
DefaultTerm_t *
DefaultTerm_clone(DefaultTerm_t * dt)
{
  if (dt != NULL)
  {
    return static_cast<DefaultTerm_t*>(dt->clone());
  }
  else
  {
    return NULL;
  }
}


LIBSBML_EXTERN
int
DefaultTerm_getResultLevel(DefaultTerm_t * dt)
{
  return (dt != NULL) ? dt->getResultLevel() : SBML_INT_MAX;
}


LIBSBML_EXTERN
int
DefaultTerm_isSetResultLevel(DefaultTerm_t * dt)
{
  return (dt != NULL) ? static_cast<int>(dt->isSetResultLevel()) : 0;
}


LIBSBML_EXTERN
int
DefaultTerm_setResultLevel(DefaultTerm_t * dt, int resultLevel)
{
  return (dt != NULL) ? dt->setResultLevel(resultLevel) : LIBSBML_INVALID_OBJECT;
}


LIBSBML_EXTERN
int
DefaultTerm_unsetResultLevel(DefaultTerm_t * dt)
{
  return (dt != NULL) ? dt->unsetResultLevel() : LIBSBML_INVALID_OBJECT;
}


LIBSBML_EXTERN
int
DefaultTerm_hasRequiredAttributes(DefaultTerm_t * dt)
{
  return (dt != NULL) ? static_cast<int>(dt->hasRequiredAttributes()) : 0;
}
/** @endcond */
LIBSBML_CPP_NAMESPACE_END


