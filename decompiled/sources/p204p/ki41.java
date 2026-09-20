package p204p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ki41 {

    /* JADX INFO: renamed from: a */
    public static final y400 f122790a;

    /* JADX INFO: renamed from: b */
    public static final y400 f122791b;

    /* JADX INFO: renamed from: c */
    public static final y400 f122792c;

    /* JADX INFO: renamed from: d */
    public static final y400 f122793d;

    /* JADX INFO: renamed from: e */
    public static final y400 f122794e;

    /* JADX INFO: renamed from: f */
    public static final vfe f122795f;

    /* JADX INFO: renamed from: g */
    public static final vfe f122796g;

    /* JADX INFO: renamed from: h */
    public static final vfe f122797h;

    /* JADX INFO: renamed from: i */
    public static final vfe f122798i;

    /* JADX INFO: renamed from: j */
    public static final vfe f122799j;

    /* JADX INFO: renamed from: k */
    public static final vfe f122800k;

    /* JADX INFO: renamed from: l */
    public static final vfe f122801l;

    /* JADX INFO: renamed from: m */
    public static final vfe f122802m;

    /* JADX INFO: renamed from: n */
    public static final vfe f122803n;

    /* JADX INFO: renamed from: o */
    public static final vfe f122804o;

    /* JADX INFO: renamed from: p */
    public static final vfe f122805p;

    /* JADX INFO: renamed from: q */
    public static final vfe f122806q;

    /* JADX INFO: renamed from: r */
    public static final vfe f122807r;

    /* JADX INFO: renamed from: s */
    public static final Set f122808s;

    /* JADX INFO: renamed from: t */
    public static final Set f122809t;

    /* JADX INFO: renamed from: u */
    public static final vfe f122810u;

    /* JADX INFO: renamed from: v */
    public static final vfe f122811v;

    /* JADX INFO: renamed from: w */
    public static final vfe f122812w;

    /* JADX INFO: renamed from: x */
    public static final vfe f122813x;

    /* JADX INFO: renamed from: y */
    public static final Object f122814y;

    /* JADX INFO: renamed from: z */
    public static final Object f122815z;

    static {
        y400 y400Var = new y400("kotlin");
        f122790a = y400Var;
        y400 y400VarM92785a = y400Var.m92785a(qti0.m73841e("reflect"));
        f122791b = y400VarM92785a;
        y400Var.m92785a(qti0.m73841e("experimental"));
        y400 y400VarM92785a2 = y400Var.m92785a(qti0.m73841e("collections"));
        f122792c = y400VarM92785a2;
        y400Var.m92785a(qti0.m73841e("sequences"));
        y400 y400VarM92785a3 = y400Var.m92785a(qti0.m73841e("ranges"));
        y400 y400VarM92785a4 = y400Var.m92785a(qti0.m73841e("jvm"));
        y400Var.m92785a(qti0.m73841e("js"));
        y400Var.m92785a(qti0.m73841e("annotations")).m92785a(qti0.m73841e("jvm"));
        y400VarM92785a4.m92785a(qti0.m73841e("internal"));
        y400VarM92785a4.m92785a(qti0.m73841e("functions"));
        y400 y400VarM92785a5 = y400Var.m92785a(qti0.m73841e("annotation"));
        y400 y400VarM92785a6 = y400Var.m92785a(qti0.m73841e("internal"));
        y400VarM92785a6.m92785a(qti0.m73841e("ir"));
        y400 y400VarM92785a7 = y400Var.m92785a(qti0.m73841e("coroutines"));
        y400VarM92785a7.m92785a(qti0.m73841e("intrinsics"));
        f122793d = y400Var.m92785a(qti0.m73841e("enums"));
        y400Var.m92785a(qti0.m73841e("contracts"));
        y400 y400VarM92785a8 = y400Var.m92785a(qti0.m73841e("concurrent")).m92785a(qti0.m73841e("atomics"));
        f122794e = y400VarM92785a8;
        y400Var.m92785a(qti0.m73841e("test"));
        y400Var.m92785a(qti0.m73841e("text"));
        s601.m77310m0(y400Var, y400VarM92785a2, y400VarM92785a3, y400VarM92785a5);
        s601.m77310m0(y400Var, y400VarM92785a2, y400VarM92785a3, y400VarM92785a5, y400VarM92785a, y400VarM92785a6, y400VarM92785a7, y400VarM92785a8);
        ckf1.m33154c("Nothing");
        f122795f = ckf1.m33154c("Unit");
        f122796g = ckf1.m33154c("Any");
        f122797h = ckf1.m33154c("Enum");
        ckf1.m33154c("Annotation");
        f122798i = ckf1.m33154c("Array");
        vfe vfeVarM33154c = ckf1.m33154c("Boolean");
        f122799j = vfeVarM33154c;
        vfe vfeVarM33154c2 = ckf1.m33154c("Char");
        vfe vfeVarM33154c3 = ckf1.m33154c("Byte");
        vfe vfeVarM33154c4 = ckf1.m33154c("Short");
        vfe vfeVarM33154c5 = ckf1.m33154c("Int");
        f122800k = vfeVarM33154c5;
        vfe vfeVarM33154c6 = ckf1.m33154c("Long");
        f122801l = vfeVarM33154c6;
        vfe vfeVarM33154c7 = ckf1.m33154c("Float");
        vfe vfeVarM33154c8 = ckf1.m33154c("Double");
        f122802m = ckf1.m33164m(vfeVarM33154c3);
        f122803n = ckf1.m33164m(vfeVarM33154c4);
        f122804o = ckf1.m33164m(vfeVarM33154c5);
        f122805p = ckf1.m33164m(vfeVarM33154c6);
        ckf1.m33154c("CharSequence");
        f122806q = ckf1.m33154c("String");
        ckf1.m33154c("Throwable");
        ckf1.m33154c("Cloneable");
        ckf1.m33162k("KProperty");
        ckf1.m33162k("KMutableProperty");
        ckf1.m33162k("KProperty0");
        ckf1.m33162k("KMutableProperty0");
        ckf1.m33162k("KProperty1");
        ckf1.m33162k("KMutableProperty1");
        ckf1.m33162k("KProperty2");
        ckf1.m33162k("KMutableProperty2");
        f122807r = ckf1.m33162k("KFunction");
        ckf1.m33162k("KClass");
        ckf1.m33162k("KCallable");
        ckf1.m33162k("KType");
        ckf1.m33163l();
        ckf1.m33154c("Comparable");
        ckf1.m33154c("Number");
        ckf1.m33154c("Function");
        ckf1.m33156e("SuspendFunction");
        Set setM77310m0 = s601.m77310m0(vfeVarM33154c, vfeVarM33154c2, vfeVarM33154c3, vfeVarM33154c4, vfeVarM33154c5, vfeVarM33154c6, vfeVarM33154c7, vfeVarM33154c8);
        f122808s = setM77310m0;
        s601.m77310m0(vfeVarM33154c3, vfeVarM33154c4, vfeVarM33154c5, vfeVarM33154c6);
        Set set = setM77310m0;
        int iM31820L = c95.m31820L(i6f.m49804T(set, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : set) {
            linkedHashMap.put(obj, ckf1.m33160i(((vfe) obj).m85358f()));
        }
        ckf1.m33158g(linkedHashMap);
        Set setM77310m1 = s601.m77310m0(f122802m, f122803n, f122804o, f122805p);
        f122809t = setM77310m1;
        Set set2 = setM77310m1;
        int iM31820L2 = c95.m31820L(i6f.m49804T(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, ckf1.m33160i(((vfe) obj2).m85358f()));
        }
        ckf1.m33158g(linkedHashMap2);
        Set set3 = f122808s;
        Set set4 = f122809t;
        LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(set3, set4);
        vfe vfeVar = f122806q;
        s601.m77308k0(vfeVar, linkedHashSetM77309l0);
        ckf1.m33156e("Continuation");
        ckf1.m33155d("Iterator");
        ckf1.m33155d("Iterable");
        ckf1.m33155d("Collection");
        ckf1.m33155d("List");
        ckf1.m33155d("ListIterator");
        ckf1.m33155d("Set");
        vfe vfeVarM33155d = ckf1.m33155d("Map");
        ckf1.m33155d("AbstractMap");
        ckf1.m33155d("MutableIterator");
        ckf1.m33155d("CharIterator");
        ckf1.m33155d("MutableIterable");
        ckf1.m33155d("MutableCollection");
        f122810u = ckf1.m33155d("MutableList");
        ckf1.m33155d("MutableListIterator");
        f122811v = ckf1.m33155d("MutableSet");
        vfe vfeVarM33155d2 = ckf1.m33155d("MutableMap");
        f122812w = vfeVarM33155d2;
        vfeVarM33155d.m85356d(qti0.m73841e("Entry"));
        vfeVarM33155d2.m85356d(qti0.m73841e("MutableEntry"));
        ckf1.m33154c("Result");
        ckf1.m33161j("IntRange");
        ckf1.m33161j("LongRange");
        ckf1.m33161j("CharRange");
        ckf1.m33152a("AnnotationRetention");
        ckf1.m33152a("AnnotationTarget");
        ckf1.m33154c("DeprecationLevel");
        f122813x = ckf1.m33157f();
        vfe vfeVarM33153b = ckf1.m33153b("AtomicBoolean");
        vfe vfeVarM33153b2 = ckf1.m33153b("AtomicInt");
        vfe vfeVarM33153b3 = ckf1.m33153b("AtomicLong");
        ckf1.m33153b("AtomicReference");
        pqm0 pqm0VarM69840u = pft0.m69840u(f122799j, vfeVarM33153b);
        vfe vfeVar2 = f122800k;
        pqm0 pqm0VarM69840u2 = pft0.m69840u(vfeVar2, vfeVarM33153b2);
        vfe vfeVar3 = f122801l;
        f122814y = kkc0.m56695h0(pqm0VarM69840u, pqm0VarM69840u2, pft0.m69840u(vfeVar3, vfeVarM33153b3));
        ckf1.m33153b("AtomicArray");
        f122815z = kkc0.m56695h0(pft0.m69840u(vfeVar2, ckf1.m33153b("AtomicIntArray")), pft0.m69840u(vfeVar3, ckf1.m33153b("AtomicLongArray")));
        s601.m77308k0(f122797h, s601.m77308k0(f122796g, s601.m77308k0(f122795f, s601.m77308k0(vfeVar, s601.m77309l0(set3, set4)))));
    }
}
