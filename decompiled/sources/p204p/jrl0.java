package p204p;

import io.ably.lib.rest.Auth;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jrl0 {

    /* JADX INFO: renamed from: a */
    public static final qti0 f115215a;

    /* JADX INFO: renamed from: b */
    public static final qti0 f115216b;

    /* JADX INFO: renamed from: c */
    public static final qti0 f115217c;

    /* JADX INFO: renamed from: d */
    public static final qti0 f115218d;

    /* JADX INFO: renamed from: e */
    public static final qti0 f115219e;

    /* JADX INFO: renamed from: f */
    public static final qti0 f115220f;

    /* JADX INFO: renamed from: g */
    public static final qti0 f115221g;

    /* JADX INFO: renamed from: h */
    public static final qti0 f115222h;

    /* JADX INFO: renamed from: i */
    public static final qti0 f115223i;

    /* JADX INFO: renamed from: j */
    public static final qti0 f115224j;

    /* JADX INFO: renamed from: k */
    public static final qti0 f115225k;

    /* JADX INFO: renamed from: l */
    public static final qti0 f115226l;

    /* JADX INFO: renamed from: m */
    public static final urv0 f115227m;

    /* JADX INFO: renamed from: n */
    public static final qti0 f115228n;

    /* JADX INFO: renamed from: o */
    public static final qti0 f115229o;

    /* JADX INFO: renamed from: p */
    public static final qti0 f115230p;

    /* JADX INFO: renamed from: q */
    public static final qti0 f115231q;

    /* JADX INFO: renamed from: r */
    public static final Set f115232r;

    /* JADX INFO: renamed from: s */
    public static final Set f115233s;

    /* JADX INFO: renamed from: t */
    public static final Set f115234t;

    /* JADX INFO: renamed from: u */
    public static final Object f115235u;

    static {
        qti0 qti0VarM73841e = qti0.m73841e("getValue");
        f115215a = qti0VarM73841e;
        qti0 qti0VarM73841e2 = qti0.m73841e("setValue");
        f115216b = qti0VarM73841e2;
        qti0 qti0VarM73841e3 = qti0.m73841e("provideDelegate");
        f115217c = qti0VarM73841e3;
        qti0 qti0VarM73841e4 = qti0.m73841e("equals");
        f115218d = qti0VarM73841e4;
        qti0.m73841e("hashCode");
        qti0 qti0VarM73841e5 = qti0.m73841e("compareTo");
        f115219e = qti0VarM73841e5;
        qti0 qti0VarM73841e6 = qti0.m73841e("contains");
        f115220f = qti0VarM73841e6;
        f115221g = qti0.m73841e("invoke");
        f115222h = qti0.m73841e("iterator");
        f115223i = qti0.m73841e("get");
        qti0 qti0VarM73841e7 = qti0.m73841e("set");
        f115224j = qti0VarM73841e7;
        f115225k = qti0.m73841e("next");
        f115226l = qti0.m73841e("hasNext");
        qti0.m73841e("of");
        qti0.m73841e("toString");
        f115227m = new urv0("component\\d+");
        qti0 qti0VarM73841e8 = qti0.m73841e("and");
        qti0 qti0VarM73841e9 = qti0.m73841e("or");
        qti0 qti0VarM73841e10 = qti0.m73841e("xor");
        qti0 qti0VarM73841e11 = qti0.m73841e("inv");
        qti0 qti0VarM73841e12 = qti0.m73841e("shl");
        qti0 qti0VarM73841e13 = qti0.m73841e("shr");
        qti0 qti0VarM73841e14 = qti0.m73841e("ushr");
        qti0 qti0VarM73841e15 = qti0.m73841e("inc");
        f115228n = qti0VarM73841e15;
        qti0 qti0VarM73841e16 = qti0.m73841e("dec");
        f115229o = qti0VarM73841e16;
        qti0 qti0VarM73841e17 = qti0.m73841e("plus");
        qti0 qti0VarM73841e18 = qti0.m73841e("minus");
        qti0 qti0VarM73841e19 = qti0.m73841e("not");
        qti0 qti0VarM73841e20 = qti0.m73841e("unaryMinus");
        qti0 qti0VarM73841e21 = qti0.m73841e("unaryPlus");
        qti0 qti0VarM73841e22 = qti0.m73841e("times");
        qti0 qti0VarM73841e23 = qti0.m73841e("div");
        qti0 qti0VarM73841e24 = qti0.m73841e("rem");
        qti0 qti0VarM73841e25 = qti0.m73841e("rangeTo");
        f115230p = qti0VarM73841e25;
        qti0 qti0VarM73841e26 = qti0.m73841e("rangeUntil");
        f115231q = qti0VarM73841e26;
        qti0 qti0VarM73841e27 = qti0.m73841e("timesAssign");
        qti0 qti0VarM73841e28 = qti0.m73841e("divAssign");
        qti0 qti0VarM73841e29 = qti0.m73841e("remAssign");
        qti0 qti0VarM73841e30 = qti0.m73841e("plusAssign");
        qti0 qti0VarM73841e31 = qti0.m73841e("minusAssign");
        qti0 qti0VarM73841e32 = qti0.m73841e("toDouble");
        qti0 qti0VarM73841e33 = qti0.m73841e("toFloat");
        qti0 qti0VarM73841e34 = qti0.m73841e("toLong");
        qti0 qti0VarM73841e35 = qti0.m73841e("toInt");
        qti0 qti0VarM73841e36 = qti0.m73841e("toChar");
        qti0 qti0VarM73841e37 = qti0.m73841e("toShort");
        qti0 qti0VarM73841e38 = qti0.m73841e("toByte");
        qti0 qti0VarM73841e39 = qti0.m73841e("toULong");
        qti0 qti0VarM73841e40 = qti0.m73841e("toUInt");
        qti0 qti0VarM73841e41 = qti0.m73841e("toUShort");
        qti0 qti0VarM73841e42 = qti0.m73841e("toUByte");
        bk5.m29624m1(new qti0[]{qti0VarM73841e15, qti0VarM73841e16, qti0VarM73841e21, qti0VarM73841e20, qti0VarM73841e19, qti0VarM73841e11});
        f115232r = bk5.m29624m1(new qti0[]{qti0VarM73841e21, qti0VarM73841e20, qti0VarM73841e19, qti0VarM73841e11});
        Set setM29624m1 = bk5.m29624m1(new qti0[]{qti0VarM73841e22, qti0VarM73841e17, qti0VarM73841e18, qti0VarM73841e23, qti0VarM73841e24, qti0VarM73841e25, qti0VarM73841e26});
        f115233s = setM29624m1;
        bk5.m29624m1(new qti0[]{qti0VarM73841e22, qti0VarM73841e17, qti0VarM73841e18, qti0VarM73841e23, qti0VarM73841e24});
        Set setM29624m2 = bk5.m29624m1(new qti0[]{qti0VarM73841e8, qti0VarM73841e9, qti0VarM73841e10, qti0VarM73841e11, qti0VarM73841e12, qti0VarM73841e13, qti0VarM73841e14});
        bk5.m29624m1(new qti0[]{qti0VarM73841e8, qti0VarM73841e9, qti0VarM73841e10, qti0VarM73841e12, qti0VarM73841e13, qti0VarM73841e14});
        s601.m77309l0(s601.m77309l0(setM29624m1, setM29624m2), bk5.m29624m1(new qti0[]{qti0VarM73841e4, qti0VarM73841e6, qti0VarM73841e5}));
        Set setM29624m3 = bk5.m29624m1(new qti0[]{qti0VarM73841e27, qti0VarM73841e28, qti0VarM73841e29, qti0VarM73841e30, qti0VarM73841e31});
        f115234t = setM29624m3;
        bk5.m29624m1(new qti0[]{qti0VarM73841e, qti0VarM73841e2, qti0VarM73841e3});
        s601.m77309l0(Collections.singleton(qti0VarM73841e7), setM29624m3);
        bk5.m29624m1(new qti0[]{qti0VarM73841e32, qti0VarM73841e33, qti0VarM73841e34, qti0VarM73841e35, qti0VarM73841e37, qti0VarM73841e38, qti0VarM73841e36});
        bk5.m29624m1(new qti0[]{qti0VarM73841e39, qti0VarM73841e40, qti0VarM73841e41, qti0VarM73841e42});
        f115235u = kkc0.m56695h0(new pqm0(qti0VarM73841e15, "++"), new pqm0(qti0VarM73841e16, "--"), new pqm0(qti0VarM73841e21, "+"), new pqm0(qti0VarM73841e20, "-"), new pqm0(qti0VarM73841e19, "!"), new pqm0(qti0VarM73841e22, Auth.WILDCARD_CLIENTID), new pqm0(qti0VarM73841e17, "+"), new pqm0(qti0VarM73841e18, "-"), new pqm0(qti0VarM73841e23, "/"), new pqm0(qti0VarM73841e24, "%"), new pqm0(qti0VarM73841e25, ".."), new pqm0(qti0VarM73841e26, "..<"));
    }
}
