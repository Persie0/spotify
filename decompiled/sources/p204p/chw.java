package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum chw {
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Unresolved type for %s", true),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Unresolved type parameter type", true),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_CLASS_TYPE("Unresolved class %s", true),
    UNRESOLVED_JAVA_CLASS("Unresolved java class %s", true),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_DECLARATION("Unresolved declaration %s", true),
    UNRESOLVED_KCLASS_CONSTANT_VALUE("Unresolved type for %s (arrayDimensions=%s)", true),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_TYPE_ALIAS("Unresolved type alias %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_TYPE("Return type for %s cannot be resolved", false),
    RETURN_TYPE_FOR_FUNCTION("Return type for function cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_TYPE_FOR_PROPERTY("Return type for property %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_TYPE_FOR_CONSTRUCTOR("Return type for constructor %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    IMPLICIT_RETURN_TYPE_FOR_FUNCTION("Implicit return type for function %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    IMPLICIT_RETURN_TYPE_FOR_PROPERTY("Implicit return type for property %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR("Implicit return type for property accessor %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT("%s() return type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Recursive type", false),
    RECURSIVE_TYPE_ALIAS("Recursive type alias %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Recursive annotation's type", false),
    CYCLIC_UPPER_BOUNDS("Cyclic upper bounds", false),
    CYCLIC_SUPERTYPES("Cyclic supertypes", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Cannot infer a lambda context receiver type", false),
    UNINFERRED_LAMBDA_PARAMETER_TYPE("Cannot infer a lambda parameter type", false),
    UNINFERRED_TYPE_VARIABLE("Cannot infer a type variable %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Resolution error type (%s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Error expected type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error type for data flow", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Failed to reconstruct type %s", false),
    UNABLE_TO_SUBSTITUTE_TYPE("Unable to substitute type (%s)", false),
    DONT_CARE("Special DONT_CARE type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Stub type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Function placeholder type (arguments: %s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error type for a compiler exception while analyzing %s", false),
    ERROR_FLEXIBLE_TYPE("Error java flexible type with id %s. (%s..%s)", false),
    ERROR_RAW_TYPE("Error raw type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Illegal type range for dynamic type %s..%s", false),
    CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false),
    CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME("Couldn't deserialize type parameter %s in %s", false),
    INCONSISTENT_SUSPEND_FUNCTION("Inconsistent suspend function type in metadata with constructor %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Unexpected id of a flexible type %s. (%s..%s)", false),
    UNKNOWN_TYPE("Unknown type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("No type specified for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Loop range has no type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Loop parameter has no type", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Missed a type for a value parameter %s", false),
    MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER("Missed a type argument for a type parameter %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Error type for parse error argument %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error type for star projection directly passing as a call type argument", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Dynamic type in a not allowed context", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Not an annotation type %s in the annotation context", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Unit type returned by inc or dec", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Return not allowed", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNRESOLVED_PARCEL_TYPE("Unresolved 'Parcel' type", true),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Kapt error type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Error type for synthetic element", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error type in ad hoc resolve for lighter classes", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Error expression type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error receiver type for %s", false),
    ERROR_CONSTANT_VALUE("Error constant value %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Empty callable reference", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Unsupported callable reference type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error delegation type for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Type is unavailable for declaration %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error type parameter", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Error type projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Error super type", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Supertype of error type %s", false),
    ERROR_PROPERTY_TYPE("Error property type", false),
    ERROR_CLASS("Error class", false),
    TYPE_FOR_ERROR_TYPE_CONSTRUCTOR("Type for error type constructor (%s)", false),
    INTERSECTION_OF_ERROR_TYPES("Intersection of error types %s", false),
    CANNOT_COMPUTE_ERASED_BOUND("Cannot compute erased upper bound of a type parameter %s", false),
    NOT_FOUND_UNSIGNED_TYPE("Unsigned type %s not found", false),
    ERROR_ENUM_TYPE("Not found the corresponding enum class for given enum entry %s.%s", false),
    NO_RECORDED_TYPE("Not found recorded type for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Descriptor not found for function %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Cannot build class type, descriptor not found for builder %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Cannot build type parameter type, descriptor not found for builder %s", false),
    UNMAPPED_ANNOTATION_TARGET_TYPE("Type for unmapped Java annotation target to Kotlin one", false),
    UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT("Unknown type for an array element of a java annotation argument", false),
    NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION("No fqName for annotation %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND_FQNAME("No fqName for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_FOR_GENERATED_ERROR_EXPRESSION("Type for generated error expression", false);


    /* JADX INFO: renamed from: a */
    public final String f38123a;

    /* JADX INFO: renamed from: b */
    public final boolean f38124b;

    chw(String str, boolean z) {
        this.f38123a = str;
        this.f38124b = z;
    }
}
