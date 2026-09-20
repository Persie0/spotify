package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public enum lfa0 implements Serializable {
    /* JADX INFO: Fake field, exist only in values array */
    ARGUMENT_OUTSIDE_DOMAIN("Argument {0} outside domain [{1} ; {2}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_SIZE_EXCEEDS_MAX_VARIABLES("array size cannot be greater than {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1("array sizes should have difference 1 ({0} != {1} + 1)"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_SUMS_TO_ZERO("array sums to zero"),
    /* JADX INFO: Fake field, exist only in values array */
    ASSYMETRIC_EIGEN_NOT_SUPPORTED("eigen decomposition of assymetric matrices not supported yet"),
    /* JADX INFO: Fake field, exist only in values array */
    AT_LEAST_ONE_COLUMN("matrix must have at least one column"),
    /* JADX INFO: Fake field, exist only in values array */
    AT_LEAST_ONE_ROW("matrix must have at least one row"),
    /* JADX INFO: Fake field, exist only in values array */
    BANDWIDTH("bandwidth ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    BESSEL_FUNCTION_BAD_ARGUMENT("Bessel function of order {0} cannot be computed for x = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    BESSEL_FUNCTION_FAILED_CONVERGENCE("Bessel function of order {0} failed to converge for x = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    BINOMIAL_INVALID_PARAMETERS_ORDER("must have n >= k for binomial coefficient (n, k), got k = {0}, n = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    BINOMIAL_NEGATIVE_PARAMETER("must have n >= 0 for binomial coefficient (n, k), got n = {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("statistics constructed from external moments cannot be cleared"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot compute 0-th root of unity, indefinite result"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot compute beta density at 0 when alpha = {0,number}"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("cannot compute beta density at 1 when beta = %.3g"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot compute nth root for null or negative n: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot discard a negative number of elements ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("cannot format a {0} instance as a 3D vector"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot format a {0} instance as a complex number"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot format a {0} instance as a real vector"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("cannot format given object as a fraction number"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("statistics constructed from external moments cannot be incremented"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot normalize a zero norm vector"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("elements cannot be retrieved from a negative array index {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot set an element at a negative index {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot substitute an element from an empty array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Conversion Exception in Transformation: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Cardan angles singularity"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("class ({0}) does not implement Comparable"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("too close vertices near point ({0}, {1}, {2})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("the closest orthogonal matrix has a negative determinant {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("column index {0} out of allowed range [{1}, {2}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("column index ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("constraint"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Continued fraction convergents diverged to +/- infinity for value {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Continued fraction diverged to NaN for value {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("contraction criteria ({0}) smaller than the expansion factor ({1}).  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction."),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("contraction criteria smaller than one ({0}).  This would lead to a never ending loop of expansion and contraction as an internal storage array length equal to the number of elements would satisfy the contraction criteria."),
    CONVERGENCE_FAILED("convergence failed"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("some outline boundary loops cross each other"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("crossover rate ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Cumulative probability function returned NaN for argument {0} p = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("some rows have length {0} while others have length {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("original and permuted data must contain the same elements"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("digest not initialized"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("got {0}x{1} but expected {2}x{3}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} != {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("dimensions mismatch"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Discrete cumulative probability function returned NaN for argument {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("distribution not loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("duplicated abscissa {0} causes division by zero"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("edge joining points ({0}, {1}, {2}) and ({3}, {4}, {5}) is connected to one facet only"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("elitism rate ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("empty cluster in k-means"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("sample for interpolation is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("empty polynomials coefficients array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("empty selected column index array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("empty selected row index array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("empty string for imaginary character"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("endpoints do not specify an interval: [{0}, {1}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("equal vertices {0} and {1} in simplex configuration"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Euler angles singularity"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("evaluation"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("expansion factor smaller than one ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("facets orientation mismatch around edge joining points ({0}, {1}, {2}) and ({3}, {4}, {5})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("must have n >= 0 for n!, got n = {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of iterations={4}, maximum iterations={5}, initial={6}, lower bound={7}, upper bound={8}, final a value={0}, final b value={1}, f(a)={2}, f(b)={3}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Unable to convert {0} to fraction after {1} iterations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("first {0} columns are not initialized yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("first element is not 0: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("first {0} rows are not initialized yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Overflow trying to convert {0} to fraction ({1}/{2})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("function is not differentiable"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("function is not polynomial"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("overflow: gcd({0}, {1}) is 2^31"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("overflow: gcd({0}, {1}) is 2^63"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} wide hole between models time ranges"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("condition number {1} is too high "),
    INCONSISTENT_STATE_AT_2_PI_WRAPPING("inconsistent state at 2π wrapping"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("the index specified: {0} is larger than the current maximal index {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("index ({0}) is not positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("index {0} out of allowed range [{1}, {2}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("index ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} is not a finite number"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("interval bounds must be finite"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("value {0} at index {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Array contains an infinite element, {0} at index {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot convert infinite value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("initial capacity ({0}) is not positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("initial column {1} after final column {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("initial row {1} after final row {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("input data comes from unsupported datasource: {0}, supported sources: {1}, {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("instance of class {0} not comparable to existing values"),
    INSUFFICIENT_DATA("insufficient data"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("insufficient data for t statistic, needs at least 2, got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("insufficient dimension {0}, must be at least {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("dimension ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("sample contains {0} observed points, at least {1} are required"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("insufficient data: only {0} rows and {1} columns."),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("multistep method needs at least {0} previous steps, got {1}"),
    INTERNAL_ERROR("internal error, please fill a bug report at {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("invalid binary digit: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("binary mutation works on BinaryChromosome only"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("one-point crossover only works with fixed-length chromosomes"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("required functionality is missing in {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("invalid interval, initial value parameters:  lower={0}, initial={1}, upper={2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("invalid iteration limits: min={0}, max={1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("bad value for maximum iterations number: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("the number of observations is not sufficient to conduct regression"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("input data array length = {0} does not match the number of observations = {1} and the number of regressors = {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("length of regressor array = {0} does not match the number of variables = {1} in the model"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("invalid rounding method {0}, valid methods: {1} ({2}), {3} ({4}), {5} ({6}), {7} ({8}), {9} ({10}), {11} ({12}), {13} ({14}), {15} ({16})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("iterator exhausted"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("iterations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("overflow: lcm({0}, {1}) is 2^31"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("overflow: lcm({0}, {1}) is 2^63"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("list of chromosomes bigger than maxPopulationSize"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Loess expects at least 1 point"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("lower bound ({0}) must be strictly less than upper bound ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("lower endpoint ({0}) must be less than or equal to upper endpoint ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("map has been modified while iterating"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("evaluations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("maximal count ({0}) exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("maximal number of iterations ({0}) exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("minimal step size ({1,number,0.00E00}) reached, integration needs {0,number,0.00E00}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Loess expects the abscissa and ordinate arrays to be of the same size, but got {0} abscissae and {1} ordinatae"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("mutation rate ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("element {0} is NaN"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot convert NaN value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("brightness exponent should be positive or null, but got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("negative complex module {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("element ({0}, {1}) is negative: {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("element {0} is negative: {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of successes must be non-negative ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("number of successes ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of trials must be non-negative ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("number of interpolation points ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of trials ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("vertices do not form a convex hull in CCW winding"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of robustness iterations ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("start position ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Continued fraction convergents failed to converge (in less than {0} iterations) for value {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("non-invertible affine transform collapses some lines into single points"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of microsphere elements must be positive, but got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("polynomial degree must be positive: degree={0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("all abscissae must be finite real numbers, but {0}-th is {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("all ordinatae must be finite real numbers, but {0}-th is {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("all weights must be finite real numbers, but {0}-th is {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("non square ({0}x{1}) matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Norm ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Cannot normalize to an infinite value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("Cannot normalize to NaN"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0}x{1} and {2}x{3} matrices are not addition compatible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("points {0} and {1} are not decreasing ({2} < {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("points {3} and {2} are not decreasing ({1} < {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("not enough data ({0} rows) for this many predictors ({1} predictors)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("spline partition must have at least {0} points, got {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("points {0} and {1} are not increasing ({2} > {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("points {3} and {2} are not increasing ({1} > {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0}x{1} and {2}x{3} matrices are not multiplication compatible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("not positive definite matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("not positive definite matrix: diagonal element at ({1},{1}) is smaller than {2} ({0})"),
    NON_POSITIVE_DEFINITE_OPERATOR("non positive definite linear operator"),
    NON_SELF_ADJOINT_OPERATOR("non self-adjoint linear operator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("non square ({0}x{1}) linear operator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("degrees of freedom ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("degrees of freedom must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("element {0} is not positive: {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("invalid exponent {0} (must be positive)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of elements should be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("base ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("exponent ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("length must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("length ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("mean must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("mean ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("number of sample is not positive: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of samples ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("permutation k ({0}) must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("permutation size ({0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("the Poisson mean must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("population size must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("population size ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("invalid row dimension: {0} (must be positive)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("sample size must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("scale must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("scale ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("shape must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("shape ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("standard deviation must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("standard deviation ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("upper bound must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("window size must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} is not a power of 2"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} is not a power of 2, consider padding for fix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} is not a power of 2 plus one"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("points {0} and {1} are not strictly decreasing ({2} <= {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("points {3} and {2} are not strictly decreasing ({1} <= {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("knot values must be strictly increasing"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("points {0} and {1} are not strictly increasing ({2} >= {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("points {3} and {2} are not strictly increasing ({1} >= {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0}x{1} and {2}x{3} matrices are not subtraction compatible"),
    NOT_SUPPORTED_IN_DIMENSION_N("method not supported in dimension {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("not symmetric matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("non symmetric matrix: the difference between entries at ({0},{1}) and ({1},{0}) is larger than {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("no bin selected"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("none of the {0} start points lead to convergence"),
    NO_DATA("no data"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("no degrees of freedom ({0} measurements, {1} parameters)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("This distribution does not have a density function implemented"),
    NO_FEASIBLE_SOLUTION("no feasible solution"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("no optimum computed yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("Regression model must include at least one regressor"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("no result available"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("no entry at indices ({0}, {1}) in a {2}x{3} matrix"),
    NAN_NOT_ALLOWED("NaN is not allowed"),
    NULL_NOT_ALLOWED("null is not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("a null or zero length array not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("covariance matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("denominator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("denominator format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("fraction"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("function"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("imaginary format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("input array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("numerator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("numerator format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("conversion exception in transformation"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("real format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("whole format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} is larger than the maximum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} is smaller than the minimum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} is larger than, or equal to, the maximum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} is smaller than, or equal to, the minimum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("number of successes ({0}) must be less than or equal to population size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("overflow, numerator too large after multiply: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} points Legendre-Gauss integrator not supported, number of points must be in the {1}-{2} range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("observed counts are all 0 in observed array {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("observed counts are both zero for entry {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("the difference between the upper and lower bound must be larger than twice the initial trust region radius ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("out of bounds quantile value: {0}, must be in (0, 100]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("out of bounds confidence level {0}, must be between {1} and {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("out of bounds significance level {0}, must be between {1} and {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("significance level ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("the abscissae array must be sorted in a strictly increasing order, but the {0}-th element is {1} whereas {2}-th is {3}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("point ({0}, {1}, {2}) is out of plane"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("out of range root of unity index {0} (must be in [{1};{2}])"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("out of range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} out of [{1}, {2}] range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} out of ({1}, {2}] range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} out of [{1}, {2}) range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("an outline boundary loop is open"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("overflow"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("overflow in fraction {0}/{1}, cannot negate"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("overflow in addition: {0} + {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("overflow in subtraction: {0} - {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("overflow in multiplication: {0} * {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot access {0} method in percentile implementation {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("percentile implementation {0} does not support {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("permutation size ({0}) exceeds permuation domain ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("polynomial"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("number of polynomial interpolants must match the number of segments ({0} != {1} - 1)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("population limit has to be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("cannot raise an integral value to a negative power ({0}^{1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("propagation direction mismatch"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("RandomKeyMutation works only with RandomKeys, not {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("roots of unity have not been computed yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("a {0}x{1} matrix cannot be a rotation matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("row index {0} out of allowed range [{1}, {2}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("row index ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("function values at endpoints do not have different signs, endpoints: [{0}, {1}], values: [{2}, {3}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("sample size ({0}) exceeds collection size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("sample size ({0}) must be less than or equal to population size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("simplex must contain at least one point"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0}"),
    SINGULAR_MATRIX("matrix is singular"),
    SINGULAR_OPERATOR("operator is singular"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("subarray ends after array end"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cutoff singular value is {0}, should be at most {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("tournament arity ({0}) cannot be bigger than population size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cannot discard {0} elements from a {1} elements array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("too many regressors ({0}) specified, only {1} in the model"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("cost relative tolerance is too small ({0}), no further reduction in the sum of squares is possible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("too small integration interval: length = {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("orthogonality tolerance is too small ({0}), solution is orthogonal to the jacobian"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("parameters relative tolerance is too small ({0}), no further improvement in the approximate solution is possible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("trust region step has failed to reduce Q"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("two or more categories required, got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("two or more values required in each category, one has {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("unable to bracket optimum in line search"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("unable to compute covariances: singular problem"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("unable to first guess the harmonic coefficients"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("unable to orthogonalize matrix in {0} iterations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("unable to perform Q.R decomposition on the {0}x{1} jacobian matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("unable to solve: singular problem"),
    UNBOUNDED_SOLUTION("unbounded solution"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("unknown mode {0}, known modes: {1} ({2}), {3} ({4}), {5} ({6}), {7} ({8}), {9} ({10}) and {11} ({12})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("unknown parameter {0}"),
    UNMATCHED_ODE_IN_EXPANDED_SET("ode does not match the main ode set in the extended set"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("string \"{0}\" unparseable (from position {1}) as an object of type {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("string \"{0}\" unparseable (from position {1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("unparseable 3D vector: \"{0}\""),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("unparseable complex number: \"{0}\""),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("unparseable real vector: \"{0}\""),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("unsupported expansion mode {0}, supported modes are {1} ({2}) and {3} ({4})"),
    UNSUPPORTED_OPERATION("unsupported operation"),
    ARITHMETIC_EXCEPTION("arithmetic exception"),
    ILLEGAL_STATE("illegal state"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("exception generated in user code"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("URL {0} contains no data"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("{0} values have been added before statistic is configured"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("vector length mismatch: got {0} but expected {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("vector must have at least one element"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("weigth array must contain at least one non-zero value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("wrong array shape (block length = {0}, expected {1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("{0} points are required, got only {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("number of points ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("denominator must be different from 0"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("zero denominator in fraction {0}/{1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("the fraction to divide by must not be zero: {0}/{1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("zero norm"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("zero norm for rotation axis"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("zero norm for rotation defining vector"),
    ZERO_NOT_ALLOWED("zero not allowed here");


    /* JADX INFO: renamed from: a */
    public final String f132879a;

    lfa0(String str) {
        this.f132879a = str;
    }
}
