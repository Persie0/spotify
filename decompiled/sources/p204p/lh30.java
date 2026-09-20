package p204p;

import com.spotify.cosmos.cosmos.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lh30 {

    /* JADX INFO: renamed from: a */
    public final yuw0 f133357a;

    /* JADX INFO: renamed from: b */
    public final w8b f133358b;

    /* JADX INFO: renamed from: c */
    public final tpk f133359c;

    public lh30(yuw0 yuw0Var, w8b w8bVar, tpk tpkVar) {
        this.f133357a = yuw0Var;
        this.f133358b = w8bVar;
        this.f133359c = tpkVar;
    }

    /* JADX WARN: Code duplicated, block: B:385:0x08e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:386:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:588:0x0901 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08ec A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static lh30 m58944b(ccx0 ccx0Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        lqg1 lqg1Var;
        int i;
        int i2;
        lqg1[] lqg1VarArr;
        int i3;
        int i4;
        lqg1 otm0Var;
        lqg1 ktm0Var;
        etm0 etm0VarM59758s;
        xuw0 xuw0Var = new xuw0(ccx0Var, cls, method);
        Annotation[] annotationArr = xuw0Var.f266191d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            lqg1 lqg1Var2 = null;
            if (i6 >= length) {
                if (xuw0Var.f266202o == null) {
                    throw zn91.m96540a0(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!xuw0Var.f266203p) {
                    if (xuw0Var.f266205r) {
                        throw zn91.m96540a0(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (xuw0Var.f266204q) {
                        throw zn91.m96540a0(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = xuw0Var.f266192e;
                int length2 = annotationArr2.length;
                xuw0Var.f266210w = new lqg1[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    lqg1[] lqg1VarArr2 = xuw0Var.f266210w;
                    Type type = xuw0Var.f266193f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        lqg1Var = lqg1Var2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof jka1) {
                                xuw0Var.m92207c(i8, type);
                                if (xuw0Var.f266201n) {
                                    throw zn91.m96550f0(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (xuw0Var.f266197j) {
                                    throw zn91.m96550f0(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (xuw0Var.f266198k) {
                                    throw zn91.m96550f0(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (xuw0Var.f266199l) {
                                    throw zn91.m96550f0(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (xuw0Var.f266200m) {
                                    throw zn91.m96550f0(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (xuw0Var.f266206s != null) {
                                    throw zn91.m96550f0(method, i8, "@Url cannot be used with @%s URL", xuw0Var.f266202o);
                                }
                                xuw0Var.f266201n = true;
                                if (type != ph30.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw zn91.m96550f0(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                otm0Var = new jtm0(method, i8, 1);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof ubn0;
                                ccx0 ccx0Var2 = xuw0Var.f266188a;
                                if (z5) {
                                    xuw0Var.m92207c(i8, type);
                                    if (xuw0Var.f266198k) {
                                        throw zn91.m96550f0(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (xuw0Var.f266199l) {
                                        throw zn91.m96550f0(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (xuw0Var.f266200m) {
                                        throw zn91.m96550f0(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (xuw0Var.f266201n) {
                                        throw zn91.m96550f0(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (xuw0Var.f266206s == null) {
                                        throw zn91.m96550f0(method, i8, "@Path can only be used with relative url on @%s", xuw0Var.f266202o);
                                    }
                                    xuw0Var.f266197j = true;
                                    ubn0 ubn0Var = (ubn0) annotation;
                                    String strValue = ubn0Var.value();
                                    if (!xuw0.f266187z.matcher(strValue).matches()) {
                                        throw zn91.m96550f0(method, i8, "@Path parameter name must match %s. Found: %s", xuw0.f266186y.pattern(), strValue);
                                    }
                                    if (!xuw0Var.f266209v.contains(strValue)) {
                                        throw zn91.m96550f0(method, i8, "URL \"%s\" does not contain \"{%s}\".", xuw0Var.f266206s, strValue);
                                    }
                                    ccx0Var2.m32332e(type, annotationArr3);
                                    otm0Var = new ltm0(xuw0Var.f266190c, i8, strValue, ubn0Var.encoded());
                                } else {
                                    i2 = i10;
                                    lqg1VarArr = lqg1VarArr2;
                                    if (annotation instanceof hit0) {
                                        xuw0Var.m92207c(i8, type);
                                        hit0 hit0Var = (hit0) annotation;
                                        String strValue2 = hit0Var.value();
                                        boolean zEncoded = hit0Var.encoded();
                                        i3 = i9;
                                        Class clsM96525M = zn91.m96525M(type);
                                        i4 = length3;
                                        xuw0Var.f266198k = true;
                                        if (Iterable.class.isAssignableFrom(clsM96525M)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw zn91.m96550f0(method, i8, clsM96525M.getSimpleName() + " must include generic type (e.g., " + clsM96525M.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            ccx0Var2.m32332e(zn91.m96522J(0, (ParameterizedType) type), annotationArr3);
                                            otm0Var = new itm0(strValue2, zEncoded, 1).m59759z();
                                        } else if (clsM96525M.isArray()) {
                                            ccx0Var2.m32332e(xuw0.m92205a(clsM96525M.getComponentType()), annotationArr3);
                                            otm0Var = new itm0(strValue2, zEncoded, 1).m59758s();
                                        } else {
                                            ccx0Var2.m32332e(type, annotationArr3);
                                            otm0Var = new itm0(strValue2, zEncoded, 1);
                                        }
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof qit0) {
                                            xuw0Var.m92207c(i8, type);
                                            boolean zEncoded2 = ((qit0) annotation).encoded();
                                            Class clsM96525M2 = zn91.m96525M(type);
                                            xuw0Var.f266199l = true;
                                            if (Iterable.class.isAssignableFrom(clsM96525M2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw zn91.m96550f0(method, i8, clsM96525M2.getSimpleName() + " must include generic type (e.g., " + clsM96525M2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                ccx0Var2.m32332e(zn91.m96522J(0, (ParameterizedType) type), annotationArr3);
                                                otm0Var = new mtm0(zEncoded2).m59759z();
                                            } else if (clsM96525M2.isArray()) {
                                                ccx0Var2.m32332e(xuw0.m92205a(clsM96525M2.getComponentType()), annotationArr3);
                                                otm0Var = new mtm0(zEncoded2).m59758s();
                                            } else {
                                                ccx0Var2.m32332e(type, annotationArr3);
                                                otm0Var = new mtm0(zEncoded2);
                                            }
                                        } else if (annotation instanceof pit0) {
                                            xuw0Var.m92207c(i8, type);
                                            Class clsM96525M3 = zn91.m96525M(type);
                                            xuw0Var.f266200m = true;
                                            if (!Map.class.isAssignableFrom(clsM96525M3)) {
                                                throw zn91.m96550f0(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeM96527O = zn91.m96527O(type, clsM96525M3);
                                            if (!(typeM96527O instanceof ParameterizedType)) {
                                                throw zn91.m96550f0(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeM96527O;
                                            Type typeM96522J = zn91.m96522J(0, parameterizedType);
                                            if (String.class != typeM96522J) {
                                                throw zn91.m96550f0(method, i8, "@QueryMap keys must be of type String: " + typeM96522J, new Object[0]);
                                            }
                                            ccx0Var2.m32332e(zn91.m96522J(1, parameterizedType), annotationArr3);
                                            otm0Var = new htm0(method, i8, ((pit0) annotation).encoded(), 2);
                                        } else {
                                            str = str;
                                            if (annotation instanceof xe20) {
                                                xuw0Var.m92207c(i8, type);
                                                xe20 xe20Var = (xe20) annotation;
                                                String strValue3 = xe20Var.value();
                                                Class clsM96525M4 = zn91.m96525M(type);
                                                if (Iterable.class.isAssignableFrom(clsM96525M4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw zn91.m96550f0(method, i8, clsM96525M4.getSimpleName() + " must include generic type (e.g., " + clsM96525M4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    ccx0Var2.m32332e(zn91.m96522J(0, (ParameterizedType) type), annotationArr3);
                                                    otm0Var = new itm0(strValue3, xe20Var.allowUnsafeNonAsciiValues(), 0).m59759z();
                                                } else if (clsM96525M4.isArray()) {
                                                    ccx0Var2.m32332e(xuw0.m92205a(clsM96525M4.getComponentType()), annotationArr3);
                                                    ktm0Var = new itm0(strValue3, xe20Var.allowUnsafeNonAsciiValues(), 0).m59758s();
                                                    otm0Var = ktm0Var;
                                                } else {
                                                    ccx0Var2.m32332e(type, annotationArr3);
                                                    otm0Var = new itm0(strValue3, xe20Var.allowUnsafeNonAsciiValues(), 0);
                                                }
                                            } else if (annotation instanceof il20) {
                                                if (type == sn20.class) {
                                                    otm0Var = new jtm0(method, i8, 0);
                                                } else {
                                                    xuw0Var.m92207c(i8, type);
                                                    Class clsM96525M5 = zn91.m96525M(type);
                                                    if (!Map.class.isAssignableFrom(clsM96525M5)) {
                                                        throw zn91.m96550f0(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM96527O2 = zn91.m96527O(type, clsM96525M5);
                                                    if (!(typeM96527O2 instanceof ParameterizedType)) {
                                                        throw zn91.m96550f0(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM96527O2;
                                                    Type typeM96522J2 = zn91.m96522J(0, parameterizedType2);
                                                    if (String.class != typeM96522J2) {
                                                        throw zn91.m96550f0(method, i8, "@HeaderMap keys must be of type String: " + typeM96522J2, new Object[0]);
                                                    }
                                                    ccx0Var2.m32332e(zn91.m96522J(1, parameterizedType2), annotationArr3);
                                                    otm0Var = new htm0(method, i8, ((il20) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof cuy) {
                                                xuw0Var.m92207c(i8, type);
                                                if (!xuw0Var.f266204q) {
                                                    throw zn91.m96550f0(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                cuy cuyVar = (cuy) annotation;
                                                String strValue4 = cuyVar.value();
                                                boolean zEncoded3 = cuyVar.encoded();
                                                xuw0Var.f266194g = true;
                                                Class clsM96525M6 = zn91.m96525M(type);
                                                if (Iterable.class.isAssignableFrom(clsM96525M6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw zn91.m96550f0(method, i8, clsM96525M6.getSimpleName() + " must include generic type (e.g., " + clsM96525M6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    ccx0Var2.m32332e(zn91.m96522J(0, (ParameterizedType) type), annotationArr3);
                                                    otm0Var = new gtm0(strValue4, zEncoded3).m59759z();
                                                } else if (clsM96525M6.isArray()) {
                                                    ccx0Var2.m32332e(xuw0.m92205a(clsM96525M6.getComponentType()), annotationArr3);
                                                    otm0Var = new gtm0(strValue4, zEncoded3).m59758s();
                                                } else {
                                                    ccx0Var2.m32332e(type, annotationArr3);
                                                    otm0Var = new gtm0(strValue4, zEncoded3);
                                                }
                                            } else if (annotation instanceof iuy) {
                                                xuw0Var.m92207c(i8, type);
                                                if (!xuw0Var.f266204q) {
                                                    throw zn91.m96550f0(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM96525M7 = zn91.m96525M(type);
                                                if (!Map.class.isAssignableFrom(clsM96525M7)) {
                                                    throw zn91.m96550f0(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM96527O3 = zn91.m96527O(type, clsM96525M7);
                                                if (!(typeM96527O3 instanceof ParameterizedType)) {
                                                    throw zn91.m96550f0(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM96527O3;
                                                int i12 = 0;
                                                Type typeM96522J3 = zn91.m96522J(0, parameterizedType3);
                                                if (String.class != typeM96522J3) {
                                                    throw zn91.m96550f0(method, i8, "@FieldMap keys must be of type String: " + typeM96522J3, new Object[0]);
                                                }
                                                ccx0Var2.m32332e(zn91.m96522J(1, parameterizedType3), annotationArr3);
                                                xuw0Var.f266194g = true;
                                                otm0Var = new htm0(method, i8, ((iuy) annotation).encoded(), i12);
                                            } else if (annotation instanceof x2n0) {
                                                xuw0Var.m92207c(i8, type);
                                                if (!xuw0Var.f266205r) {
                                                    throw zn91.m96550f0(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                x2n0 x2n0Var = (x2n0) annotation;
                                                xuw0Var.f266195h = true;
                                                String strValue5 = x2n0Var.value();
                                                Class clsM96525M8 = zn91.m96525M(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsM96525M8);
                                                    ntm0 ntm0Var = ntm0.f158103g;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw zn91.m96550f0(method, i8, clsM96525M8.getSimpleName() + " must include generic type (e.g., " + clsM96525M8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!jai0.class.isAssignableFrom(zn91.m96525M(zn91.m96522J(0, (ParameterizedType) type)))) {
                                                            throw zn91.m96550f0(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        otm0Var = ntm0Var.m59759z();
                                                    } else if (clsM96525M8.isArray()) {
                                                        if (!jai0.class.isAssignableFrom(clsM96525M8.getComponentType())) {
                                                            throw zn91.m96550f0(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        otm0Var = ntm0Var.m59758s();
                                                    } else {
                                                        if (!jai0.class.isAssignableFrom(clsM96525M8)) {
                                                            throw zn91.m96550f0(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        otm0Var = ntm0Var;
                                                    }
                                                } else {
                                                    sn20 sn20VarM39668D = epv0.m39668D("Content-Disposition", s571.m77251j("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", x2n0Var.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsM96525M8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw zn91.m96550f0(method, i8, clsM96525M8.getSimpleName() + " must include generic type (e.g., " + clsM96525M8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeM96522J4 = zn91.m96522J(0, (ParameterizedType) type);
                                                        if (jai0.class.isAssignableFrom(zn91.m96525M(typeM96522J4))) {
                                                            throw zn91.m96550f0(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        etm0VarM59758s = new ktm0(method, i8, sn20VarM39668D, ccx0Var2.m32330c(typeM96522J4, annotationArr3, annotationArr)).m59759z();
                                                    } else if (clsM96525M8.isArray()) {
                                                        Class clsM92205a = xuw0.m92205a(clsM96525M8.getComponentType());
                                                        if (jai0.class.isAssignableFrom(clsM92205a)) {
                                                            throw zn91.m96550f0(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        etm0VarM59758s = new ktm0(method, i8, sn20VarM39668D, ccx0Var2.m32330c(clsM92205a, annotationArr3, annotationArr)).m59758s();
                                                    } else {
                                                        if (jai0.class.isAssignableFrom(clsM96525M8)) {
                                                            throw zn91.m96550f0(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        ktm0Var = new ktm0(method, i8, sn20VarM39668D, ccx0Var2.m32330c(type, annotationArr3, annotationArr));
                                                        otm0Var = ktm0Var;
                                                    }
                                                    otm0Var = etm0VarM59758s;
                                                }
                                            } else if (annotation instanceof y2n0) {
                                                xuw0Var.m92207c(i8, type);
                                                if (!xuw0Var.f266205r) {
                                                    throw zn91.m96550f0(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                xuw0Var.f266195h = true;
                                                Class clsM96525M9 = zn91.m96525M(type);
                                                if (!Map.class.isAssignableFrom(clsM96525M9)) {
                                                    throw zn91.m96550f0(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM96527O4 = zn91.m96527O(type, clsM96525M9);
                                                if (!(typeM96527O4 instanceof ParameterizedType)) {
                                                    throw zn91.m96550f0(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM96527O4;
                                                Type typeM96522J5 = zn91.m96522J(0, parameterizedType4);
                                                if (String.class != typeM96522J5) {
                                                    throw zn91.m96550f0(method, i8, "@PartMap keys must be of type String: " + typeM96522J5, new Object[0]);
                                                }
                                                Type typeM96522J6 = zn91.m96522J(1, parameterizedType4);
                                                if (jai0.class.isAssignableFrom(zn91.m96525M(typeM96522J6))) {
                                                    throw zn91.m96550f0(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                otm0Var = new ktm0(method, i8, ccx0Var2.m32330c(typeM96522J6, annotationArr3, annotationArr), ((y2n0) annotation).encoding());
                                            } else if (annotation instanceof h4a) {
                                                xuw0Var.m92207c(i8, type);
                                                if (xuw0Var.f266204q || xuw0Var.f266205r) {
                                                    throw zn91.m96550f0(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (xuw0Var.f266196i) {
                                                    throw zn91.m96550f0(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    tpk tpkVarM32330c = ccx0Var2.m32330c(type, annotationArr3, annotationArr);
                                                    xuw0Var.f266196i = true;
                                                    otm0Var = new ftm0(method, i8, tpkVarM32330c);
                                                } catch (RuntimeException e) {
                                                    throw zn91.m96552g0(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof ds61) {
                                                xuw0Var.m92207c(i8, type);
                                                Class clsM92205a2 = xuw0.m92205a(zn91.m96525M(type));
                                                for (int i13 = i8 - 1; i13 >= 0; i13--) {
                                                    lqg1 lqg1Var3 = xuw0Var.f266210w[i13];
                                                    if ((lqg1Var3 instanceof otm0) && ((otm0) lqg1Var3).f169203g.equals(clsM92205a2)) {
                                                        throw zn91.m96550f0(method, i8, "@Tag type " + clsM92205a2.getName() + " is duplicate of " + xco0.f260271b.mo70597c(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                otm0Var = new otm0(clsM92205a2);
                                            } else {
                                                otm0Var = null;
                                            }
                                        }
                                    }
                                    str = str;
                                }
                                if (otm0Var != null) {
                                    if (lqg1Var == null) {
                                        throw zn91.m96550f0(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    lqg1Var = otm0Var;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                lqg1VarArr2 = lqg1VarArr;
                                length3 = i4;
                                str = str;
                            }
                            i2 = i10;
                            lqg1VarArr = lqg1VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (otm0Var != null) {
                                if (lqg1Var == null) {
                                    throw zn91.m96550f0(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                lqg1Var = otm0Var;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            lqg1VarArr2 = lqg1VarArr;
                            length3 = i4;
                            str = str;
                        }
                    } else {
                        lqg1Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length2;
                    String str2 = str;
                    int i15 = i7;
                    lqg1[] lqg1VarArr3 = lqg1VarArr2;
                    int i16 = i9;
                    if (lqg1Var == null) {
                        if (i16 != 0) {
                            try {
                                if (zn91.m96525M(type) == fbk.class) {
                                    xuw0Var.f266211x = true;
                                    lqg1Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw zn91.m96550f0(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    lqg1VarArr3[i8] = lqg1Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i15;
                    length2 = i14;
                    str = str2;
                    i5 = 0;
                    lqg1Var2 = null;
                }
                String str3 = str;
                if (xuw0Var.f266206s == null && !xuw0Var.f266201n) {
                    throw zn91.m96540a0(method, null, "Missing either @%s URL or @Url parameter.", xuw0Var.f266202o);
                }
                boolean z6 = xuw0Var.f266204q;
                if (!z6 && !xuw0Var.f266205r && !xuw0Var.f266203p && xuw0Var.f266196i) {
                    throw zn91.m96540a0(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !xuw0Var.f266194g) {
                    throw zn91.m96540a0(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (xuw0Var.f266205r && !xuw0Var.f266195h) {
                    throw zn91.m96540a0(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                yuw0 yuw0Var = new yuw0(xuw0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (zn91.m96530R(genericReturnType2)) {
                    throw zn91.m96540a0(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw zn91.m96540a0(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = yuw0Var.f276496l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM96522J7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM96522J7 instanceof WildcardType) {
                        typeM96522J7 = ((WildcardType) typeM96522J7).getLowerBounds()[0];
                    }
                    if (zn91.m96525M(typeM96522J7) == o2x0.class && (typeM96522J7 instanceof ParameterizedType)) {
                        typeM96522J7 = zn91.m96522J(0, (ParameterizedType) typeM96522J7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (zn91.m96525M(typeM96522J7) == x8b.class) {
                            throw zn91.m96540a0(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", zn91.m96522J(0, (ParameterizedType) typeM96522J7));
                        }
                        z3 = zn91.f284443b && typeM96522J7 == w2a1.class;
                        z2 = false;
                    }
                    genericReturnType = new r0b1(null, x8b.class, typeM96522J7);
                    if (!zn91.m96531S(annotations, yk21.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = zk21.f283597a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    a9b a9bVarM32328a = ccx0Var.m32328a(genericReturnType, annotations);
                    Type typeMo25103a = a9bVarM32328a.mo25103a();
                    if (typeMo25103a == n2x0.class) {
                        throw zn91.m96540a0(method, null, "'" + zn91.m96525M(typeMo25103a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo25103a == o2x0.class) {
                        throw zn91.m96540a0(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (yuw0Var.f276488d.equals(str3) && !Void.class.equals(typeMo25103a) && (!zn91.f284443b || typeMo25103a != w2a1.class)) {
                        throw zn91.m96540a0(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        tpk tpkVarM32331d = ccx0Var.m32331d(typeMo25103a, method.getAnnotations());
                        w8b w8bVar = ccx0Var.f36658b;
                        if (z7) {
                            return z2 ? new jh30(yuw0Var, w8bVar, tpkVarM32331d, a9bVarM32328a, 1) : new kh30(yuw0Var, w8bVar, tpkVarM32331d, a9bVarM32328a, z);
                        }
                        return new jh30(yuw0Var, w8bVar, tpkVarM32331d, a9bVarM32328a, 0);
                    } catch (RuntimeException e2) {
                        throw zn91.m96540a0(method, e2, "Unable to create converter for %s", typeMo25103a);
                    }
                } catch (RuntimeException e3) {
                    throw zn91.m96540a0(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof pem) {
                xuw0Var.m92206b(Request.DELETE, ((pem) annotation2).value(), false);
            } else if (annotation2 instanceof zk00) {
                xuw0Var.m92206b(Request.GET, ((zk00) annotation2).value(), false);
            } else if (annotation2 instanceof db20) {
                xuw0Var.m92206b("HEAD", ((db20) annotation2).value(), false);
            } else if (annotation2 instanceof n2m0) {
                xuw0Var.m92206b("PATCH", ((n2m0) annotation2).value(), true);
            } else if (annotation2 instanceof j3m0) {
                xuw0Var.m92206b(Request.POST, ((j3m0) annotation2).value(), true);
            } else if (annotation2 instanceof l3m0) {
                xuw0Var.m92206b(Request.PUT, ((l3m0) annotation2).value(), true);
            } else if (annotation2 instanceof tlk0) {
                xuw0Var.m92206b("OPTIONS", ((tlk0) annotation2).value(), false);
            } else if (annotation2 instanceof fb20) {
                fb20 fb20Var = (fb20) annotation2;
                xuw0Var.m92206b(fb20Var.method(), fb20Var.path(), fb20Var.hasBody());
            } else if (annotation2 instanceof rn20) {
                rn20 rn20Var = (rn20) annotation2;
                String[] strArrValue = rn20Var.value();
                if (strArrValue.length == 0) {
                    throw zn91.m96540a0(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = rn20Var.allowUnsafeNonAsciiValues();
                sep sepVar = new sep(1, false);
                int length4 = strArrValue.length;
                int i17 = 0;
                while (i17 < length4) {
                    String str4 = strArrValue[i17];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw zn91.m96540a0(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            urv0 urv0Var = ayd0.f21209e;
                            xuw0Var.f266208u = zn91.m96520H(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw zn91.m96540a0(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        q0f1.m71819F(strSubstring);
                        q0f1.m71841p(sepVar, strSubstring, strTrim);
                    } else {
                        sepVar.m77929c(strSubstring, strTrim);
                    }
                    i17++;
                    z4 = z8;
                }
                xuw0Var.f266207t = sepVar.m77935i();
            } else if (annotation2 instanceof iai0) {
                if (xuw0Var.f266204q) {
                    throw zn91.m96540a0(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                xuw0Var.f266205r = true;
            } else if (!(annotation2 instanceof o300)) {
                continue;
            } else {
                if (xuw0Var.f266205r) {
                    throw zn91.m96540a0(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                xuw0Var.f266204q = true;
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo53326a(x4l0 x4l0Var, Object[] objArr);
}
