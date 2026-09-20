package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class svd0 extends d6a0 {

    /* JADX INFO: renamed from: L0 */
    public final zv41 f214396L0;

    /* JADX INFO: renamed from: M0 */
    public final zv41 f214397M0;

    /* JADX INFO: renamed from: N0 */
    public di41 f214398N0;

    /* JADX INFO: renamed from: O0 */
    public final tjo f214399O0;

    /* JADX INFO: renamed from: P0 */
    public final tjo f214400P0;

    /* JADX INFO: renamed from: Q0 */
    public final tjo f214401Q0;

    /* JADX INFO: renamed from: R0 */
    public final tjo f214402R0;

    /* JADX INFO: renamed from: X */
    public final vwd0 f214403X;

    /* JADX INFO: renamed from: Y */
    public final fh4 f214404Y;

    /* JADX INFO: renamed from: Z */
    public final c9k f214405Z = kk40.m56661c(qlg1.m73202g());

    /* JADX INFO: renamed from: d */
    public final pgo f214406d;

    /* JADX INFO: renamed from: e */
    public final aud0 f214407e;

    /* JADX INFO: renamed from: f */
    public final utu0 f214408f;

    /* JADX INFO: renamed from: g */
    public final hwd0 f214409g;

    /* JADX INFO: renamed from: h */
    public final y6m0 f214410h;

    /* JADX INFO: renamed from: i */
    public final luk f214411i;

    /* JADX INFO: renamed from: t */
    public final hi41 f214412t;

    public svd0(pgo pgoVar, aud0 aud0Var, utu0 utu0Var, hwd0 hwd0Var, y6m0 y6m0Var, luk lukVar, hi41 hi41Var, vwd0 vwd0Var, fh4 fh4Var) {
        this.f214406d = pgoVar;
        this.f214407e = aud0Var;
        this.f214408f = utu0Var;
        this.f214409g = hwd0Var;
        this.f214410h = y6m0Var;
        this.f214411i = lukVar;
        this.f214412t = hi41Var;
        this.f214403X = vwd0Var;
        this.f214404Y = fh4Var;
        zv41 zv41VarM52819d = jag1.m52819d(new evd0(null, 0L, 0L, 0L, null, null, tvd0.f224147b, false, null, true, 0L, Long.MAX_VALUE));
        this.f214396L0 = zv41VarM52819d;
        this.f214397M0 = zv41VarM52819d;
        jqv0 jqv0Var = qpv0.f191387a;
        this.f214399O0 = pag1.m69483s(new rko(new jqx(jqv0Var.mo54112b(o5p0.class)), 2, bud0.f31087M0, new pko(bud0.f31111f), bud0.f31088N0), new rko(new jqx(jqv0Var.mo54112b(erc1.class)), 2, bud0.f31089O0, new pko(bud0.f31112g), bud0.f31090P0), new rko(new jqx(jqv0Var.mo54112b(yfj.class)), 1, bud0.f31094T0, new pko(bud0.f31113h), bud0.f31095U0), new rko(new jqx(jqv0Var.mo54112b(daj.class)), 1, bud0.f31096V0, new pko(bud0.f31114i), bud0.f31097W0), new rko(new jqx(jqv0Var.mo54112b(bw20.class)), 1, bud0.f31099X0, new pko(bud0.f31115t), bud0.f31101Y0), kih.f122974Z);
        this.f214400P0 = pag1.m69487w(new rko(xzk.f267695Z0, 1, bud0.f31103Z0, new pko(bud0.f31102Z), bud0.f31104a1), bud0.f31086L0);
        this.f214401Q0 = pag1.m69487w(new rko(new jqx(jqv0Var.mo54112b(v140.class)), 1, bud0.f31106b1, new pko(bud0.f31098X), bud0.f31091Q0), bud0.f31100Y);
        this.f214402R0 = pag1.m69487w(new rko(new jqx(jqv0Var.mo54112b(gh71.class)), 1, bud0.f31092R0, new pko(bud0.f31108c1), bud0.f31093S0), pvd0.f181713b);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:101:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:107:0x02df  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:110:0x030c  */
    /* JADX WARN: Code duplicated, block: B:111:0x030f A[PHI: r3 r5 r18 r26 r27 r28
      0x030f: PHI (r3v9 long) = (r3v7 long), (r3v14 long) binds: [B:116:0x032a, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r5v7 long) = (r5v5 long), (r5v9 long) binds: [B:116:0x032a, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r18v2 boolean) = (r18v0 boolean), (r18v5 boolean) binds: [B:116:0x032a, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r26v3 p.tvd0) = (r26v1 p.tvd0), (r26v5 p.tvd0) binds: [B:116:0x032a, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r27v2 boolean) = (r27v0 boolean), (r27v4 boolean) binds: [B:116:0x032a, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r28v2 java.lang.String) = (r28v0 java.lang.String), (r28v4 java.lang.String) binds: [B:116:0x032a, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x0314  */
    /* JADX WARN: Code duplicated, block: B:115:0x031a  */
    /* JADX WARN: Code duplicated, block: B:118:0x032d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0340  */
    /* JADX WARN: Code duplicated, block: B:125:0x0377  */
    /* JADX WARN: Code duplicated, block: B:126:0x037d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0390  */
    /* JADX WARN: Code duplicated, block: B:132:0x0392  */
    /* JADX WARN: Code duplicated, block: B:136:0x03db  */
    /* JADX WARN: Code duplicated, block: B:139:0x040a  */
    /* JADX WARN: Code duplicated, block: B:140:0x040c  */
    /* JADX WARN: Code duplicated, block: B:142:0x040f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0416  */
    /* JADX WARN: Code duplicated, block: B:146:0x041c  */
    /* JADX WARN: Code duplicated, block: B:147:0x041f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0425  */
    /* JADX WARN: Code duplicated, block: B:152:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x016b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0181  */
    /* JADX WARN: Code duplicated, block: B:42:0x019f  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0203  */
    /* JADX WARN: Code duplicated, block: B:58:0x0215  */
    /* JADX WARN: Code duplicated, block: B:60:0x0218  */
    /* JADX WARN: Code duplicated, block: B:63:0x0221  */
    /* JADX WARN: Code duplicated, block: B:66:0x022b  */
    /* JADX WARN: Code duplicated, block: B:69:0x023d A[LOOP:0: B:64:0x0225->B:69:0x023d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0240  */
    /* JADX WARN: Code duplicated, block: B:73:0x0247  */
    /* JADX WARN: Code duplicated, block: B:75:0x024c  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c  */
    /* JADX WARN: Code duplicated, block: B:78:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0262  */
    /* JADX WARN: Code duplicated, block: B:83:0x0296  */
    /* JADX WARN: Code duplicated, block: B:85:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x029b  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02af  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d0  */
    /* JADX INFO: renamed from: k */
    public static final Object m79431k(svd0 svd0Var, ibk ibkVar) {
        jvd0 jvd0Var;
        long j;
        String str;
        int i;
        Object obj;
        String str2;
        fvd0 fvd0Var;
        long jM33199r;
        erc1 erc1Var;
        String str3;
        Object objM56684z;
        fvd0 fvd0Var2;
        long j2;
        String str4;
        m340 m340Var;
        z240 z240VarM60640a;
        d171 d171Var;
        long jM33199r2;
        boolean z;
        Serializable serializableM79438q;
        long j3;
        d171 d171Var2;
        Object obj2;
        String str5;
        int i2;
        String str6;
        fvd0 fvd0Var3;
        long j4;
        long j5;
        long j6;
        long jLongValue;
        long jLongValue2;
        o5p0 o5p0Var;
        wfj wfjVar;
        boolean z2;
        boolean z3;
        tvd0 tvd0Var;
        tvd0 tvd0Var2;
        tvd0 tvd0Var3;
        String str7;
        long j7;
        boolean z4;
        luk lukVar;
        int iOrdinal;
        w2a1 w2a1Var;
        boolean z5;
        long j8;
        String str8;
        long j9;
        boolean z6;
        tvd0 tvd0Var4;
        String strM79433p;
        Object objM89557A;
        long j10;
        fvd0 fvd0Var4;
        long j11;
        tvd0 tvd0Var5;
        String str9;
        boolean z7;
        long j12;
        boolean z8;
        Iterable iterable;
        Iterator it;
        String str10;
        y67 y67Var;
        u67 u67Var;
        ArrayList arrayList;
        Iterator it2;
        Iterator it3;
        fvd0 fvd0Var5;
        String strM79433p2;
        Object objM47619a;
        Object obj3;
        long j13;
        String str11;
        fvd0 fvd0Var6;
        boolean z9;
        tvd0 tvd0Var6;
        long j14;
        boolean z10;
        String str12;
        ocz0 ocz0Var;
        boolean z11;
        long j15;
        tvd0 tvd0Var7;
        String str13;
        ocz0 ocz0Var2;
        long j16;
        boolean z12;
        long j17;
        fvd0 fvd0Var7;
        long j18;
        int i3;
        long j19;
        Long l;
        Long l2;
        long jLongValue3;
        boolean z13;
        svd0 svd0Var2 = svd0Var;
        aud0 aud0Var = svd0Var2.f214407e;
        if (ibkVar instanceof jvd0) {
            jvd0Var = (jvd0) ibkVar;
            int i4 = jvd0Var.f116322N0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jvd0Var.f116322N0 = i4 - Integer.MIN_VALUE;
            } else {
                jvd0Var = new jvd0(svd0Var2, ibkVar);
            }
        } else {
            jvd0Var = new jvd0(svd0Var2, ibkVar);
        }
        jvd0 jvd0Var2 = jvd0Var;
        Object objM79437o = jvd0Var2.f116320L0;
        int i5 = jvd0Var2.f116322N0;
        tvd0 tvd0Var8 = tvd0.f224146a;
        yuk yukVar = yuk.f276404a;
        switch (i5) {
            case 0:
                j = 0;
                bga.m29073P(objM79437o);
                str = aud0Var.f19916a;
                Set set = dd41.f47702f;
                int i6 = r46.m74726U(str).f47709c == gn80.SHOW_EPISODE ? 1 : 0;
                jvd0Var2.f116326a = str;
                jvd0Var2.f116332g = i6;
                jvd0Var2.f116322N0 = 1;
                Object objM79436n = svd0Var2.m79436n(str, jvd0Var2);
                if (objM79436n != yukVar) {
                    i = i6;
                    obj = objM79436n;
                    str2 = str;
                    fvd0Var = (fvd0) obj;
                    jM33199r = cks.m33199r(fvd0Var.f73761d.f47050a, ils.MILLISECONDS);
                    if (jM33199r > j) {
                        throw new IllegalStateException(edb.m38564m("Invalid total duration for entity: ", str2));
                    }
                    erc1Var = fvd0Var.f73759b;
                    if (erc1Var != null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11862c)) == null) {
                        str3 = null;
                    } else {
                        str3 = z240VarM60640a.f278475a.f198763a;
                    }
                    jvd0Var2.f116326a = str2;
                    jvd0Var2.f116327b = fvd0Var;
                    jvd0Var2.f116328c = str3;
                    jvd0Var2.f116332g = i;
                    jvd0Var2.f116333h = jM33199r;
                    jvd0Var2.f116322N0 = 2;
                    objM56684z = kk40.m56684z(new ogg1(fvd0Var, svd0Var, jM33199r, str2, null), jvd0Var2);
                    if (objM56684z != yukVar) {
                        fvd0Var2 = fvd0Var;
                        j2 = jM33199r;
                        str4 = str2;
                        d171Var = (d171) objM56684z;
                        jM33199r2 = cks.m33199r(fvd0Var2.f73762e.f31502b, ils.MILLISECONDS);
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jvd0Var2.f116326a = str4;
                        jvd0Var2.f116327b = fvd0Var2;
                        jvd0Var2.f116328c = str3;
                        jvd0Var2.f116329d = d171Var;
                        jvd0Var2.f116332g = i;
                        jvd0Var2.f116333h = j2;
                        jvd0Var2.f116334i = jM33199r2;
                        jvd0Var2.f116322N0 = 3;
                        serializableM79438q = svd0Var.m79438q(j2, d171Var, z, jM33199r2, jvd0Var2);
                        j3 = j2;
                        if (serializableM79438q != yukVar) {
                            fvd0 fvd0Var8 = fvd0Var2;
                            d171Var2 = d171Var;
                            obj2 = serializableM79438q;
                            str5 = str4;
                            i2 = i;
                            str6 = str3;
                            fvd0Var3 = fvd0Var8;
                            j4 = j3;
                            j5 = jM33199r2;
                            pqm0 pqm0Var = (pqm0) obj2;
                            j6 = j5;
                            jLongValue = ((Number) pqm0Var.f180350a).longValue();
                            jLongValue2 = ((Number) pqm0Var.f180351b).longValue();
                            yfj yfjVar = fvd0Var3.f73760c;
                            o5p0Var = fvd0Var3.f73758a;
                            wfjVar = yfjVar.f272269d;
                            if (!wfjVar.equals(sfj.f208603a) || wfjVar.equals(vfj.f240990a) || wfjVar.equals(tfj.f219998a)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (o5p0Var != null) {
                                arrayList = o5p0Var.f162046a;
                                if (arrayList.isEmpty()) {
                                    z3 = false;
                                } else {
                                    it2 = arrayList.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            it3 = it2;
                                            if (((n07) it2.next()).f148920a instanceof v67) {
                                                z3 = true;
                                            } else {
                                                it2 = it3;
                                            }
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            tvd0Var = aud0Var.f19919d;
                            tvd0 tvd0Var9 = tvd0.f224147b;
                            if (!z2) {
                                Set set2 = dd41.f47702f;
                                tvd0Var2 = tvd0Var8;
                                if (r46.m74726U(str5).f47709c != gn80.TRACK) {
                                    tvd0Var3 = tvd0Var2;
                                } else if (tvd0Var == null) {
                                    tvd0Var3 = tvd0Var;
                                }
                                jvd0Var2.f116326a = str5;
                                jvd0Var2.f116327b = fvd0Var3;
                                jvd0Var2.f116328c = str6;
                                jvd0Var2.f116329d = d171Var2;
                                jvd0Var2.f116330e = tvd0Var3;
                                jvd0Var2.f116332g = i2;
                                jvd0Var2.f116333h = j4;
                                str7 = str5;
                                j7 = j4;
                                jvd0Var2.f116334i = j6;
                                jvd0Var2.f116335t = jLongValue;
                                jvd0Var2.f116323X = jLongValue2;
                                jvd0Var2.f116324Y = z2;
                                jvd0Var2.f116325Z = z3;
                                jvd0Var2.f116322N0 = 4;
                                z4 = z3;
                                lukVar = svd0Var.f214411i;
                                iOrdinal = tvd0Var3.ordinal();
                                w2a1Var = w2a1.f247311a;
                                if (iOrdinal != 0) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    str8 = str7;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                    strM79433p = m79433p(fvd0Var3);
                                    if (strM79433p == null) {
                                        svd0Var2 = svd0Var;
                                    } else {
                                        svd0Var2 = svd0Var;
                                        objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                                        if (objM89557A != yukVar) {
                                        }
                                    }
                                    objM89557A = w2a1Var;
                                } else {
                                    if (iOrdinal == 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (z4) {
                                        z5 = z2;
                                        j8 = jLongValue;
                                        str8 = str7;
                                        objM89557A = w2a1Var;
                                        z6 = true;
                                        svd0Var2 = svd0Var;
                                        tvd0Var4 = tvd0Var3;
                                        j9 = jLongValue2;
                                    } else {
                                        if (o5p0Var != null) {
                                            iterable = o5p0Var.f162046a;
                                        } else {
                                            iterable = null;
                                        }
                                        if (iterable == null) {
                                            iterable = lau.f131415a;
                                        }
                                        it = iterable.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                y67Var = ((n07) it.next()).f148920a;
                                                if (y67Var instanceof u67) {
                                                    u67Var = (u67) y67Var;
                                                } else {
                                                    u67Var = null;
                                                }
                                                if (u67Var != null) {
                                                    str10 = u67Var.f227234a;
                                                } else {
                                                    str10 = null;
                                                }
                                            } else {
                                                str10 = null;
                                            }
                                            if (str10 == null) {
                                                z5 = z2;
                                                j8 = jLongValue;
                                                svd0Var2 = svd0Var;
                                                str8 = str7;
                                                objM89557A = w2a1Var;
                                                j9 = jLongValue2;
                                                z6 = true;
                                                tvd0Var4 = tvd0Var3;
                                            } else {
                                                str8 = str7;
                                                z5 = z2;
                                                j8 = jLongValue;
                                                j9 = jLongValue2;
                                                z6 = true;
                                                tvd0Var4 = tvd0Var3;
                                                objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                                if (objM89557A == yukVar) {
                                                    svd0Var2 = svd0Var;
                                                } else {
                                                    svd0Var2 = svd0Var;
                                                    objM89557A = w2a1Var;
                                                }
                                            }
                                        } while (str10 == null);
                                        if (str10 == null) {
                                            z5 = z2;
                                            j8 = jLongValue;
                                            svd0Var2 = svd0Var;
                                            str8 = str7;
                                            objM89557A = w2a1Var;
                                            j9 = jLongValue2;
                                            z6 = true;
                                            tvd0Var4 = tvd0Var3;
                                        } else {
                                            str8 = str7;
                                            z5 = z2;
                                            j8 = jLongValue;
                                            j9 = jLongValue2;
                                            z6 = true;
                                            tvd0Var4 = tvd0Var3;
                                            objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                            if (objM89557A == yukVar) {
                                                svd0Var2 = svd0Var;
                                            } else {
                                                svd0Var2 = svd0Var;
                                                objM89557A = w2a1Var;
                                            }
                                        }
                                    }
                                }
                                if (objM89557A != yukVar) {
                                    j10 = j8;
                                    fvd0Var4 = fvd0Var3;
                                    j11 = j7;
                                    tvd0Var5 = tvd0Var4;
                                    str9 = str8;
                                    z7 = z5;
                                    j12 = j6;
                                    z8 = z4;
                                    jvd0Var2.f116326a = str9;
                                    jvd0Var2.f116327b = fvd0Var4;
                                    jvd0Var2.f116328c = str6;
                                    jvd0Var2.f116329d = d171Var2;
                                    jvd0Var2.f116330e = tvd0Var5;
                                    jvd0Var2.f116332g = i2;
                                    jvd0Var2.f116333h = j11;
                                    jvd0Var2.f116334i = j12;
                                    jvd0Var2.f116335t = j10;
                                    jvd0Var2.f116323X = j9;
                                    fvd0Var5 = fvd0Var4;
                                    jvd0Var2.f116324Y = z7;
                                    jvd0Var2.f116325Z = z8;
                                    jvd0Var2.f116322N0 = 5;
                                    if (tvd0Var5 == tvd0Var2 || (strM79433p2 = m79433p(fvd0Var5)) == null) {
                                        objM47619a = null;
                                    } else {
                                        objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                                    }
                                    if (objM47619a == yukVar) {
                                        return yukVar;
                                    }
                                    boolean z14 = z8;
                                    obj3 = objM47619a;
                                    j13 = j11;
                                    str11 = str6;
                                    fvd0Var6 = fvd0Var5;
                                    z9 = z14;
                                    tvd0Var6 = tvd0Var5;
                                    j14 = j10;
                                    z10 = z7;
                                    str12 = str9;
                                    ocz0Var = (ocz0) obj3;
                                    jvd0Var2.f116326a = null;
                                    jvd0Var2.f116327b = fvd0Var6;
                                    jvd0Var2.f116328c = str11;
                                    jvd0Var2.f116329d = d171Var2;
                                    jvd0Var2.f116330e = tvd0Var6;
                                    jvd0Var2.f116331f = ocz0Var;
                                    jvd0Var2.f116332g = i2;
                                    jvd0Var2.f116333h = j13;
                                    jvd0Var2.f116334i = j12;
                                    jvd0Var2.f116335t = j14;
                                    jvd0Var2.f116323X = j9;
                                    jvd0Var2.f116324Y = z10;
                                    z11 = z9;
                                    jvd0Var2.f116325Z = z11;
                                    j15 = j13;
                                    jvd0Var2.f116322N0 = 6;
                                    objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                                    if (objM79437o == yukVar) {
                                        return yukVar;
                                    }
                                    tvd0Var7 = tvd0Var6;
                                    str13 = str11;
                                    ocz0Var2 = ocz0Var;
                                    j16 = j9;
                                    z12 = z11;
                                    j17 = j14;
                                    fvd0Var7 = fvd0Var6;
                                    j18 = j12;
                                    i3 = i2;
                                    j19 = j15;
                                    d171 d171Var3 = d171Var2;
                                    gh71 gh71Var = (gh71) objM79437o;
                                    l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                                    if (l.longValue() > j) {
                                        l2 = l;
                                    } else {
                                        l2 = null;
                                    }
                                    if (l2 != null) {
                                        jLongValue3 = l2.longValue();
                                    } else {
                                        jLongValue3 = j19;
                                    }
                                    if (i3 != 0) {
                                        z13 = z6;
                                    } else {
                                        z13 = false;
                                    }
                                    return new evd0(d171Var3, j19, j17, j16, ocz0Var2, gh71Var, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                                }
                            } else {
                                tvd0Var2 = tvd0Var8;
                            }
                            tvd0Var3 = tvd0Var9;
                            jvd0Var2.f116326a = str5;
                            jvd0Var2.f116327b = fvd0Var3;
                            jvd0Var2.f116328c = str6;
                            jvd0Var2.f116329d = d171Var2;
                            jvd0Var2.f116330e = tvd0Var3;
                            jvd0Var2.f116332g = i2;
                            jvd0Var2.f116333h = j4;
                            str7 = str5;
                            j7 = j4;
                            jvd0Var2.f116334i = j6;
                            jvd0Var2.f116335t = jLongValue;
                            jvd0Var2.f116323X = jLongValue2;
                            jvd0Var2.f116324Y = z2;
                            jvd0Var2.f116325Z = z3;
                            jvd0Var2.f116322N0 = 4;
                            z4 = z3;
                            lukVar = svd0Var.f214411i;
                            iOrdinal = tvd0Var3.ordinal();
                            w2a1Var = w2a1.f247311a;
                            if (iOrdinal != 0) {
                                z5 = z2;
                                j8 = jLongValue;
                                str8 = str7;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                                strM79433p = m79433p(fvd0Var3);
                                if (strM79433p == null) {
                                    svd0Var2 = svd0Var;
                                } else {
                                    svd0Var2 = svd0Var;
                                    objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                                    if (objM89557A != yukVar) {
                                    }
                                }
                                objM89557A = w2a1Var;
                            } else {
                                if (iOrdinal == 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (z4) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    str8 = str7;
                                    objM89557A = w2a1Var;
                                    z6 = true;
                                    svd0Var2 = svd0Var;
                                    tvd0Var4 = tvd0Var3;
                                    j9 = jLongValue2;
                                } else {
                                    if (o5p0Var != null) {
                                        iterable = o5p0Var.f162046a;
                                    } else {
                                        iterable = null;
                                    }
                                    if (iterable == null) {
                                        iterable = lau.f131415a;
                                    }
                                    it = iterable.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            y67Var = ((n07) it.next()).f148920a;
                                            if (y67Var instanceof u67) {
                                                u67Var = (u67) y67Var;
                                            } else {
                                                u67Var = null;
                                            }
                                            if (u67Var != null) {
                                                str10 = u67Var.f227234a;
                                            } else {
                                                str10 = null;
                                            }
                                        } else {
                                            str10 = null;
                                        }
                                        if (str10 == null) {
                                            z5 = z2;
                                            j8 = jLongValue;
                                            svd0Var2 = svd0Var;
                                            str8 = str7;
                                            objM89557A = w2a1Var;
                                            j9 = jLongValue2;
                                            z6 = true;
                                            tvd0Var4 = tvd0Var3;
                                        } else {
                                            str8 = str7;
                                            z5 = z2;
                                            j8 = jLongValue;
                                            j9 = jLongValue2;
                                            z6 = true;
                                            tvd0Var4 = tvd0Var3;
                                            objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                            if (objM89557A == yukVar) {
                                                svd0Var2 = svd0Var;
                                            } else {
                                                svd0Var2 = svd0Var;
                                                objM89557A = w2a1Var;
                                            }
                                        }
                                    } while (str10 == null);
                                    if (str10 == null) {
                                        z5 = z2;
                                        j8 = jLongValue;
                                        svd0Var2 = svd0Var;
                                        str8 = str7;
                                        objM89557A = w2a1Var;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                    } else {
                                        str8 = str7;
                                        z5 = z2;
                                        j8 = jLongValue;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                        objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                        if (objM89557A == yukVar) {
                                            svd0Var2 = svd0Var;
                                        } else {
                                            svd0Var2 = svd0Var;
                                            objM89557A = w2a1Var;
                                        }
                                    }
                                }
                            }
                            if (objM89557A != yukVar) {
                                j10 = j8;
                                fvd0Var4 = fvd0Var3;
                                j11 = j7;
                                tvd0Var5 = tvd0Var4;
                                str9 = str8;
                                z7 = z5;
                                j12 = j6;
                                z8 = z4;
                                jvd0Var2.f116326a = str9;
                                jvd0Var2.f116327b = fvd0Var4;
                                jvd0Var2.f116328c = str6;
                                jvd0Var2.f116329d = d171Var2;
                                jvd0Var2.f116330e = tvd0Var5;
                                jvd0Var2.f116332g = i2;
                                jvd0Var2.f116333h = j11;
                                jvd0Var2.f116334i = j12;
                                jvd0Var2.f116335t = j10;
                                jvd0Var2.f116323X = j9;
                                fvd0Var5 = fvd0Var4;
                                jvd0Var2.f116324Y = z7;
                                jvd0Var2.f116325Z = z8;
                                jvd0Var2.f116322N0 = 5;
                                if (tvd0Var5 == tvd0Var2) {
                                    objM47619a = null;
                                } else {
                                    objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                                }
                                if (objM47619a == yukVar) {
                                    return yukVar;
                                }
                                boolean z15 = z8;
                                obj3 = objM47619a;
                                j13 = j11;
                                str11 = str6;
                                fvd0Var6 = fvd0Var5;
                                z9 = z15;
                                tvd0Var6 = tvd0Var5;
                                j14 = j10;
                                z10 = z7;
                                str12 = str9;
                                ocz0Var = (ocz0) obj3;
                                jvd0Var2.f116326a = null;
                                jvd0Var2.f116327b = fvd0Var6;
                                jvd0Var2.f116328c = str11;
                                jvd0Var2.f116329d = d171Var2;
                                jvd0Var2.f116330e = tvd0Var6;
                                jvd0Var2.f116331f = ocz0Var;
                                jvd0Var2.f116332g = i2;
                                jvd0Var2.f116333h = j13;
                                jvd0Var2.f116334i = j12;
                                jvd0Var2.f116335t = j14;
                                jvd0Var2.f116323X = j9;
                                jvd0Var2.f116324Y = z10;
                                z11 = z9;
                                jvd0Var2.f116325Z = z11;
                                j15 = j13;
                                jvd0Var2.f116322N0 = 6;
                                objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                                if (objM79437o == yukVar) {
                                    return yukVar;
                                }
                                tvd0Var7 = tvd0Var6;
                                str13 = str11;
                                ocz0Var2 = ocz0Var;
                                j16 = j9;
                                z12 = z11;
                                j17 = j14;
                                fvd0Var7 = fvd0Var6;
                                j18 = j12;
                                i3 = i2;
                                j19 = j15;
                                d171 d171Var4 = d171Var2;
                                gh71 gh71Var2 = (gh71) objM79437o;
                                l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                                if (l.longValue() > j) {
                                    l2 = l;
                                } else {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    jLongValue3 = l2.longValue();
                                } else {
                                    jLongValue3 = j19;
                                }
                                if (i3 != 0) {
                                    z13 = z6;
                                } else {
                                    z13 = false;
                                }
                                return new evd0(d171Var4, j19, j17, j16, ocz0Var2, gh71Var2, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                            }
                        }
                    }
                }
                return yukVar;
            case 1:
                j = 0;
                int i7 = jvd0Var2.f116332g;
                str = jvd0Var2.f116326a;
                bga.m29073P(objM79437o);
                i = i7;
                obj = objM79437o;
                str2 = str;
                fvd0Var = (fvd0) obj;
                jM33199r = cks.m33199r(fvd0Var.f73761d.f47050a, ils.MILLISECONDS);
                if (jM33199r > j) {
                    throw new IllegalStateException(edb.m38564m("Invalid total duration for entity: ", str2));
                }
                erc1Var = fvd0Var.f73759b;
                if (erc1Var != null) {
                    str3 = null;
                } else {
                    str3 = null;
                }
                jvd0Var2.f116326a = str2;
                jvd0Var2.f116327b = fvd0Var;
                jvd0Var2.f116328c = str3;
                jvd0Var2.f116332g = i;
                jvd0Var2.f116333h = jM33199r;
                jvd0Var2.f116322N0 = 2;
                objM56684z = kk40.m56684z(new ogg1(fvd0Var, svd0Var, jM33199r, str2, null), jvd0Var2);
                if (objM56684z != yukVar) {
                    fvd0Var2 = fvd0Var;
                    j2 = jM33199r;
                    str4 = str2;
                    d171Var = (d171) objM56684z;
                    jM33199r2 = cks.m33199r(fvd0Var2.f73762e.f31502b, ils.MILLISECONDS);
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jvd0Var2.f116326a = str4;
                    jvd0Var2.f116327b = fvd0Var2;
                    jvd0Var2.f116328c = str3;
                    jvd0Var2.f116329d = d171Var;
                    jvd0Var2.f116332g = i;
                    jvd0Var2.f116333h = j2;
                    jvd0Var2.f116334i = jM33199r2;
                    jvd0Var2.f116322N0 = 3;
                    serializableM79438q = svd0Var.m79438q(j2, d171Var, z, jM33199r2, jvd0Var2);
                    j3 = j2;
                    if (serializableM79438q != yukVar) {
                        fvd0 fvd0Var9 = fvd0Var2;
                        d171Var2 = d171Var;
                        obj2 = serializableM79438q;
                        str5 = str4;
                        i2 = i;
                        str6 = str3;
                        fvd0Var3 = fvd0Var9;
                        j4 = j3;
                        j5 = jM33199r2;
                        pqm0 pqm0Var2 = (pqm0) obj2;
                        j6 = j5;
                        jLongValue = ((Number) pqm0Var2.f180350a).longValue();
                        jLongValue2 = ((Number) pqm0Var2.f180351b).longValue();
                        yfj yfjVar2 = fvd0Var3.f73760c;
                        o5p0Var = fvd0Var3.f73758a;
                        wfjVar = yfjVar2.f272269d;
                        if (wfjVar.equals(sfj.f208603a)) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (o5p0Var != null) {
                            arrayList = o5p0Var.f162046a;
                            if (arrayList.isEmpty()) {
                                z3 = false;
                            } else {
                                it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        it3 = it2;
                                        if (((n07) it2.next()).f148920a instanceof v67) {
                                            z3 = true;
                                        } else {
                                            it2 = it3;
                                        }
                                    } else {
                                        z3 = false;
                                    }
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        tvd0Var = aud0Var.f19919d;
                        tvd0 tvd0Var10 = tvd0.f224147b;
                        if (!z2) {
                            tvd0Var2 = tvd0Var8;
                        } else {
                            Set set3 = dd41.f47702f;
                            tvd0Var2 = tvd0Var8;
                            if (r46.m74726U(str5).f47709c != gn80.TRACK) {
                                tvd0Var3 = tvd0Var2;
                            } else if (tvd0Var == null) {
                                tvd0Var3 = tvd0Var;
                            }
                            jvd0Var2.f116326a = str5;
                            jvd0Var2.f116327b = fvd0Var3;
                            jvd0Var2.f116328c = str6;
                            jvd0Var2.f116329d = d171Var2;
                            jvd0Var2.f116330e = tvd0Var3;
                            jvd0Var2.f116332g = i2;
                            jvd0Var2.f116333h = j4;
                            str7 = str5;
                            j7 = j4;
                            jvd0Var2.f116334i = j6;
                            jvd0Var2.f116335t = jLongValue;
                            jvd0Var2.f116323X = jLongValue2;
                            jvd0Var2.f116324Y = z2;
                            jvd0Var2.f116325Z = z3;
                            jvd0Var2.f116322N0 = 4;
                            z4 = z3;
                            lukVar = svd0Var.f214411i;
                            iOrdinal = tvd0Var3.ordinal();
                            w2a1Var = w2a1.f247311a;
                            if (iOrdinal != 0) {
                                z5 = z2;
                                j8 = jLongValue;
                                str8 = str7;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                                strM79433p = m79433p(fvd0Var3);
                                if (strM79433p == null) {
                                    svd0Var2 = svd0Var;
                                } else {
                                    svd0Var2 = svd0Var;
                                    objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                                    if (objM89557A != yukVar) {
                                    }
                                }
                                objM89557A = w2a1Var;
                            } else {
                                if (iOrdinal == 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (z4) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    str8 = str7;
                                    objM89557A = w2a1Var;
                                    z6 = true;
                                    svd0Var2 = svd0Var;
                                    tvd0Var4 = tvd0Var3;
                                    j9 = jLongValue2;
                                } else {
                                    if (o5p0Var != null) {
                                        iterable = o5p0Var.f162046a;
                                    } else {
                                        iterable = null;
                                    }
                                    if (iterable == null) {
                                        iterable = lau.f131415a;
                                    }
                                    it = iterable.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            y67Var = ((n07) it.next()).f148920a;
                                            if (y67Var instanceof u67) {
                                                u67Var = (u67) y67Var;
                                            } else {
                                                u67Var = null;
                                            }
                                            if (u67Var != null) {
                                                str10 = u67Var.f227234a;
                                            } else {
                                                str10 = null;
                                            }
                                        } else {
                                            str10 = null;
                                        }
                                        if (str10 == null) {
                                            z5 = z2;
                                            j8 = jLongValue;
                                            svd0Var2 = svd0Var;
                                            str8 = str7;
                                            objM89557A = w2a1Var;
                                            j9 = jLongValue2;
                                            z6 = true;
                                            tvd0Var4 = tvd0Var3;
                                        } else {
                                            str8 = str7;
                                            z5 = z2;
                                            j8 = jLongValue;
                                            j9 = jLongValue2;
                                            z6 = true;
                                            tvd0Var4 = tvd0Var3;
                                            objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                            if (objM89557A == yukVar) {
                                                svd0Var2 = svd0Var;
                                            } else {
                                                svd0Var2 = svd0Var;
                                                objM89557A = w2a1Var;
                                            }
                                        }
                                    } while (str10 == null);
                                    if (str10 == null) {
                                        z5 = z2;
                                        j8 = jLongValue;
                                        svd0Var2 = svd0Var;
                                        str8 = str7;
                                        objM89557A = w2a1Var;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                    } else {
                                        str8 = str7;
                                        z5 = z2;
                                        j8 = jLongValue;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                        objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                        if (objM89557A == yukVar) {
                                            svd0Var2 = svd0Var;
                                        } else {
                                            svd0Var2 = svd0Var;
                                            objM89557A = w2a1Var;
                                        }
                                    }
                                }
                            }
                            if (objM89557A != yukVar) {
                                j10 = j8;
                                fvd0Var4 = fvd0Var3;
                                j11 = j7;
                                tvd0Var5 = tvd0Var4;
                                str9 = str8;
                                z7 = z5;
                                j12 = j6;
                                z8 = z4;
                                jvd0Var2.f116326a = str9;
                                jvd0Var2.f116327b = fvd0Var4;
                                jvd0Var2.f116328c = str6;
                                jvd0Var2.f116329d = d171Var2;
                                jvd0Var2.f116330e = tvd0Var5;
                                jvd0Var2.f116332g = i2;
                                jvd0Var2.f116333h = j11;
                                jvd0Var2.f116334i = j12;
                                jvd0Var2.f116335t = j10;
                                jvd0Var2.f116323X = j9;
                                fvd0Var5 = fvd0Var4;
                                jvd0Var2.f116324Y = z7;
                                jvd0Var2.f116325Z = z8;
                                jvd0Var2.f116322N0 = 5;
                                if (tvd0Var5 == tvd0Var2) {
                                    objM47619a = null;
                                } else {
                                    objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                                }
                                if (objM47619a == yukVar) {
                                    return yukVar;
                                }
                                boolean z16 = z8;
                                obj3 = objM47619a;
                                j13 = j11;
                                str11 = str6;
                                fvd0Var6 = fvd0Var5;
                                z9 = z16;
                                tvd0Var6 = tvd0Var5;
                                j14 = j10;
                                z10 = z7;
                                str12 = str9;
                                ocz0Var = (ocz0) obj3;
                                jvd0Var2.f116326a = null;
                                jvd0Var2.f116327b = fvd0Var6;
                                jvd0Var2.f116328c = str11;
                                jvd0Var2.f116329d = d171Var2;
                                jvd0Var2.f116330e = tvd0Var6;
                                jvd0Var2.f116331f = ocz0Var;
                                jvd0Var2.f116332g = i2;
                                jvd0Var2.f116333h = j13;
                                jvd0Var2.f116334i = j12;
                                jvd0Var2.f116335t = j14;
                                jvd0Var2.f116323X = j9;
                                jvd0Var2.f116324Y = z10;
                                z11 = z9;
                                jvd0Var2.f116325Z = z11;
                                j15 = j13;
                                jvd0Var2.f116322N0 = 6;
                                objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                                if (objM79437o == yukVar) {
                                    return yukVar;
                                }
                                tvd0Var7 = tvd0Var6;
                                str13 = str11;
                                ocz0Var2 = ocz0Var;
                                j16 = j9;
                                z12 = z11;
                                j17 = j14;
                                fvd0Var7 = fvd0Var6;
                                j18 = j12;
                                i3 = i2;
                                j19 = j15;
                                d171 d171Var5 = d171Var2;
                                gh71 gh71Var3 = (gh71) objM79437o;
                                l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                                if (l.longValue() > j) {
                                    l2 = l;
                                } else {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    jLongValue3 = l2.longValue();
                                } else {
                                    jLongValue3 = j19;
                                }
                                if (i3 != 0) {
                                    z13 = z6;
                                } else {
                                    z13 = false;
                                }
                                return new evd0(d171Var5, j19, j17, j16, ocz0Var2, gh71Var3, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                            }
                        }
                        tvd0Var3 = tvd0Var10;
                        jvd0Var2.f116326a = str5;
                        jvd0Var2.f116327b = fvd0Var3;
                        jvd0Var2.f116328c = str6;
                        jvd0Var2.f116329d = d171Var2;
                        jvd0Var2.f116330e = tvd0Var3;
                        jvd0Var2.f116332g = i2;
                        jvd0Var2.f116333h = j4;
                        str7 = str5;
                        j7 = j4;
                        jvd0Var2.f116334i = j6;
                        jvd0Var2.f116335t = jLongValue;
                        jvd0Var2.f116323X = jLongValue2;
                        jvd0Var2.f116324Y = z2;
                        jvd0Var2.f116325Z = z3;
                        jvd0Var2.f116322N0 = 4;
                        z4 = z3;
                        lukVar = svd0Var.f214411i;
                        iOrdinal = tvd0Var3.ordinal();
                        w2a1Var = w2a1.f247311a;
                        if (iOrdinal != 0) {
                            z5 = z2;
                            j8 = jLongValue;
                            str8 = str7;
                            j9 = jLongValue2;
                            z6 = true;
                            tvd0Var4 = tvd0Var3;
                            strM79433p = m79433p(fvd0Var3);
                            if (strM79433p == null) {
                                svd0Var2 = svd0Var;
                            } else {
                                svd0Var2 = svd0Var;
                                objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                                if (objM89557A != yukVar) {
                                }
                            }
                            objM89557A = w2a1Var;
                        } else {
                            if (iOrdinal == 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z4) {
                                z5 = z2;
                                j8 = jLongValue;
                                str8 = str7;
                                objM89557A = w2a1Var;
                                z6 = true;
                                svd0Var2 = svd0Var;
                                tvd0Var4 = tvd0Var3;
                                j9 = jLongValue2;
                            } else {
                                if (o5p0Var != null) {
                                    iterable = o5p0Var.f162046a;
                                } else {
                                    iterable = null;
                                }
                                if (iterable == null) {
                                    iterable = lau.f131415a;
                                }
                                it = iterable.iterator();
                                do {
                                    if (it.hasNext()) {
                                        y67Var = ((n07) it.next()).f148920a;
                                        if (y67Var instanceof u67) {
                                            u67Var = (u67) y67Var;
                                        } else {
                                            u67Var = null;
                                        }
                                        if (u67Var != null) {
                                            str10 = u67Var.f227234a;
                                        } else {
                                            str10 = null;
                                        }
                                    } else {
                                        str10 = null;
                                    }
                                    if (str10 == null) {
                                        z5 = z2;
                                        j8 = jLongValue;
                                        svd0Var2 = svd0Var;
                                        str8 = str7;
                                        objM89557A = w2a1Var;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                    } else {
                                        str8 = str7;
                                        z5 = z2;
                                        j8 = jLongValue;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                        objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                        if (objM89557A == yukVar) {
                                            svd0Var2 = svd0Var;
                                        } else {
                                            svd0Var2 = svd0Var;
                                            objM89557A = w2a1Var;
                                        }
                                    }
                                } while (str10 == null);
                                if (str10 == null) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    svd0Var2 = svd0Var;
                                    str8 = str7;
                                    objM89557A = w2a1Var;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                } else {
                                    str8 = str7;
                                    z5 = z2;
                                    j8 = jLongValue;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                    objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                    if (objM89557A == yukVar) {
                                        svd0Var2 = svd0Var;
                                    } else {
                                        svd0Var2 = svd0Var;
                                        objM89557A = w2a1Var;
                                    }
                                }
                            }
                        }
                        if (objM89557A != yukVar) {
                            j10 = j8;
                            fvd0Var4 = fvd0Var3;
                            j11 = j7;
                            tvd0Var5 = tvd0Var4;
                            str9 = str8;
                            z7 = z5;
                            j12 = j6;
                            z8 = z4;
                            jvd0Var2.f116326a = str9;
                            jvd0Var2.f116327b = fvd0Var4;
                            jvd0Var2.f116328c = str6;
                            jvd0Var2.f116329d = d171Var2;
                            jvd0Var2.f116330e = tvd0Var5;
                            jvd0Var2.f116332g = i2;
                            jvd0Var2.f116333h = j11;
                            jvd0Var2.f116334i = j12;
                            jvd0Var2.f116335t = j10;
                            jvd0Var2.f116323X = j9;
                            fvd0Var5 = fvd0Var4;
                            jvd0Var2.f116324Y = z7;
                            jvd0Var2.f116325Z = z8;
                            jvd0Var2.f116322N0 = 5;
                            if (tvd0Var5 == tvd0Var2) {
                                objM47619a = null;
                            } else {
                                objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                            }
                            if (objM47619a == yukVar) {
                                return yukVar;
                            }
                            boolean z17 = z8;
                            obj3 = objM47619a;
                            j13 = j11;
                            str11 = str6;
                            fvd0Var6 = fvd0Var5;
                            z9 = z17;
                            tvd0Var6 = tvd0Var5;
                            j14 = j10;
                            z10 = z7;
                            str12 = str9;
                            ocz0Var = (ocz0) obj3;
                            jvd0Var2.f116326a = null;
                            jvd0Var2.f116327b = fvd0Var6;
                            jvd0Var2.f116328c = str11;
                            jvd0Var2.f116329d = d171Var2;
                            jvd0Var2.f116330e = tvd0Var6;
                            jvd0Var2.f116331f = ocz0Var;
                            jvd0Var2.f116332g = i2;
                            jvd0Var2.f116333h = j13;
                            jvd0Var2.f116334i = j12;
                            jvd0Var2.f116335t = j14;
                            jvd0Var2.f116323X = j9;
                            jvd0Var2.f116324Y = z10;
                            z11 = z9;
                            jvd0Var2.f116325Z = z11;
                            j15 = j13;
                            jvd0Var2.f116322N0 = 6;
                            objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                            if (objM79437o == yukVar) {
                                return yukVar;
                            }
                            tvd0Var7 = tvd0Var6;
                            str13 = str11;
                            ocz0Var2 = ocz0Var;
                            j16 = j9;
                            z12 = z11;
                            j17 = j14;
                            fvd0Var7 = fvd0Var6;
                            j18 = j12;
                            i3 = i2;
                            j19 = j15;
                            d171 d171Var6 = d171Var2;
                            gh71 gh71Var4 = (gh71) objM79437o;
                            l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                            if (l.longValue() > j) {
                                l2 = l;
                            } else {
                                l2 = null;
                            }
                            if (l2 != null) {
                                jLongValue3 = l2.longValue();
                            } else {
                                jLongValue3 = j19;
                            }
                            if (i3 != 0) {
                                z13 = z6;
                            } else {
                                z13 = false;
                            }
                            return new evd0(d171Var6, j19, j17, j16, ocz0Var2, gh71Var4, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                        }
                    }
                }
                return yukVar;
            case 2:
                j = 0;
                long j20 = jvd0Var2.f116333h;
                int i8 = jvd0Var2.f116332g;
                String str14 = jvd0Var2.f116328c;
                fvd0 fvd0Var10 = jvd0Var2.f116327b;
                String str15 = jvd0Var2.f116326a;
                bga.m29073P(objM79437o);
                i = i8;
                j2 = j20;
                str3 = str14;
                fvd0Var2 = fvd0Var10;
                str4 = str15;
                objM56684z = objM79437o;
                d171Var = (d171) objM56684z;
                jM33199r2 = cks.m33199r(fvd0Var2.f73762e.f31502b, ils.MILLISECONDS);
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                jvd0Var2.f116326a = str4;
                jvd0Var2.f116327b = fvd0Var2;
                jvd0Var2.f116328c = str3;
                jvd0Var2.f116329d = d171Var;
                jvd0Var2.f116332g = i;
                jvd0Var2.f116333h = j2;
                jvd0Var2.f116334i = jM33199r2;
                jvd0Var2.f116322N0 = 3;
                serializableM79438q = svd0Var.m79438q(j2, d171Var, z, jM33199r2, jvd0Var2);
                j3 = j2;
                if (serializableM79438q != yukVar) {
                    fvd0 fvd0Var11 = fvd0Var2;
                    d171Var2 = d171Var;
                    obj2 = serializableM79438q;
                    str5 = str4;
                    i2 = i;
                    str6 = str3;
                    fvd0Var3 = fvd0Var11;
                    j4 = j3;
                    j5 = jM33199r2;
                    pqm0 pqm0Var3 = (pqm0) obj2;
                    j6 = j5;
                    jLongValue = ((Number) pqm0Var3.f180350a).longValue();
                    jLongValue2 = ((Number) pqm0Var3.f180351b).longValue();
                    yfj yfjVar3 = fvd0Var3.f73760c;
                    o5p0Var = fvd0Var3.f73758a;
                    wfjVar = yfjVar3.f272269d;
                    if (wfjVar.equals(sfj.f208603a)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (o5p0Var != null) {
                        arrayList = o5p0Var.f162046a;
                        if (arrayList.isEmpty()) {
                            z3 = false;
                        } else {
                            it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = it2;
                                    if (((n07) it2.next()).f148920a instanceof v67) {
                                        z3 = true;
                                    } else {
                                        it2 = it3;
                                    }
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    tvd0Var = aud0Var.f19919d;
                    tvd0 tvd0Var11 = tvd0.f224147b;
                    if (!z2) {
                        tvd0Var2 = tvd0Var8;
                    } else {
                        Set set4 = dd41.f47702f;
                        tvd0Var2 = tvd0Var8;
                        if (r46.m74726U(str5).f47709c != gn80.TRACK) {
                            tvd0Var3 = tvd0Var2;
                        } else if (tvd0Var == null) {
                            tvd0Var3 = tvd0Var;
                        }
                        jvd0Var2.f116326a = str5;
                        jvd0Var2.f116327b = fvd0Var3;
                        jvd0Var2.f116328c = str6;
                        jvd0Var2.f116329d = d171Var2;
                        jvd0Var2.f116330e = tvd0Var3;
                        jvd0Var2.f116332g = i2;
                        jvd0Var2.f116333h = j4;
                        str7 = str5;
                        j7 = j4;
                        jvd0Var2.f116334i = j6;
                        jvd0Var2.f116335t = jLongValue;
                        jvd0Var2.f116323X = jLongValue2;
                        jvd0Var2.f116324Y = z2;
                        jvd0Var2.f116325Z = z3;
                        jvd0Var2.f116322N0 = 4;
                        z4 = z3;
                        lukVar = svd0Var.f214411i;
                        iOrdinal = tvd0Var3.ordinal();
                        w2a1Var = w2a1.f247311a;
                        if (iOrdinal != 0) {
                            z5 = z2;
                            j8 = jLongValue;
                            str8 = str7;
                            j9 = jLongValue2;
                            z6 = true;
                            tvd0Var4 = tvd0Var3;
                            strM79433p = m79433p(fvd0Var3);
                            if (strM79433p == null) {
                                svd0Var2 = svd0Var;
                            } else {
                                svd0Var2 = svd0Var;
                                objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                                if (objM89557A != yukVar) {
                                }
                            }
                            objM89557A = w2a1Var;
                        } else {
                            if (iOrdinal == 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z4) {
                                z5 = z2;
                                j8 = jLongValue;
                                str8 = str7;
                                objM89557A = w2a1Var;
                                z6 = true;
                                svd0Var2 = svd0Var;
                                tvd0Var4 = tvd0Var3;
                                j9 = jLongValue2;
                            } else {
                                if (o5p0Var != null) {
                                    iterable = o5p0Var.f162046a;
                                } else {
                                    iterable = null;
                                }
                                if (iterable == null) {
                                    iterable = lau.f131415a;
                                }
                                it = iterable.iterator();
                                do {
                                    if (it.hasNext()) {
                                        y67Var = ((n07) it.next()).f148920a;
                                        if (y67Var instanceof u67) {
                                            u67Var = (u67) y67Var;
                                        } else {
                                            u67Var = null;
                                        }
                                        if (u67Var != null) {
                                            str10 = u67Var.f227234a;
                                        } else {
                                            str10 = null;
                                        }
                                    } else {
                                        str10 = null;
                                    }
                                    if (str10 == null) {
                                        z5 = z2;
                                        j8 = jLongValue;
                                        svd0Var2 = svd0Var;
                                        str8 = str7;
                                        objM89557A = w2a1Var;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                    } else {
                                        str8 = str7;
                                        z5 = z2;
                                        j8 = jLongValue;
                                        j9 = jLongValue2;
                                        z6 = true;
                                        tvd0Var4 = tvd0Var3;
                                        objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                        if (objM89557A == yukVar) {
                                            svd0Var2 = svd0Var;
                                        } else {
                                            svd0Var2 = svd0Var;
                                            objM89557A = w2a1Var;
                                        }
                                    }
                                } while (str10 == null);
                                if (str10 == null) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    svd0Var2 = svd0Var;
                                    str8 = str7;
                                    objM89557A = w2a1Var;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                } else {
                                    str8 = str7;
                                    z5 = z2;
                                    j8 = jLongValue;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                    objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                    if (objM89557A == yukVar) {
                                        svd0Var2 = svd0Var;
                                    } else {
                                        svd0Var2 = svd0Var;
                                        objM89557A = w2a1Var;
                                    }
                                }
                            }
                        }
                        if (objM89557A != yukVar) {
                            j10 = j8;
                            fvd0Var4 = fvd0Var3;
                            j11 = j7;
                            tvd0Var5 = tvd0Var4;
                            str9 = str8;
                            z7 = z5;
                            j12 = j6;
                            z8 = z4;
                            jvd0Var2.f116326a = str9;
                            jvd0Var2.f116327b = fvd0Var4;
                            jvd0Var2.f116328c = str6;
                            jvd0Var2.f116329d = d171Var2;
                            jvd0Var2.f116330e = tvd0Var5;
                            jvd0Var2.f116332g = i2;
                            jvd0Var2.f116333h = j11;
                            jvd0Var2.f116334i = j12;
                            jvd0Var2.f116335t = j10;
                            jvd0Var2.f116323X = j9;
                            fvd0Var5 = fvd0Var4;
                            jvd0Var2.f116324Y = z7;
                            jvd0Var2.f116325Z = z8;
                            jvd0Var2.f116322N0 = 5;
                            if (tvd0Var5 == tvd0Var2) {
                                objM47619a = null;
                            } else {
                                objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                            }
                            if (objM47619a == yukVar) {
                                return yukVar;
                            }
                            boolean z18 = z8;
                            obj3 = objM47619a;
                            j13 = j11;
                            str11 = str6;
                            fvd0Var6 = fvd0Var5;
                            z9 = z18;
                            tvd0Var6 = tvd0Var5;
                            j14 = j10;
                            z10 = z7;
                            str12 = str9;
                            ocz0Var = (ocz0) obj3;
                            jvd0Var2.f116326a = null;
                            jvd0Var2.f116327b = fvd0Var6;
                            jvd0Var2.f116328c = str11;
                            jvd0Var2.f116329d = d171Var2;
                            jvd0Var2.f116330e = tvd0Var6;
                            jvd0Var2.f116331f = ocz0Var;
                            jvd0Var2.f116332g = i2;
                            jvd0Var2.f116333h = j13;
                            jvd0Var2.f116334i = j12;
                            jvd0Var2.f116335t = j14;
                            jvd0Var2.f116323X = j9;
                            jvd0Var2.f116324Y = z10;
                            z11 = z9;
                            jvd0Var2.f116325Z = z11;
                            j15 = j13;
                            jvd0Var2.f116322N0 = 6;
                            objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                            if (objM79437o == yukVar) {
                                return yukVar;
                            }
                            tvd0Var7 = tvd0Var6;
                            str13 = str11;
                            ocz0Var2 = ocz0Var;
                            j16 = j9;
                            z12 = z11;
                            j17 = j14;
                            fvd0Var7 = fvd0Var6;
                            j18 = j12;
                            i3 = i2;
                            j19 = j15;
                            d171 d171Var7 = d171Var2;
                            gh71 gh71Var5 = (gh71) objM79437o;
                            l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                            if (l.longValue() > j) {
                                l2 = l;
                            } else {
                                l2 = null;
                            }
                            if (l2 != null) {
                                jLongValue3 = l2.longValue();
                            } else {
                                jLongValue3 = j19;
                            }
                            if (i3 != 0) {
                                z13 = z6;
                            } else {
                                z13 = false;
                            }
                            return new evd0(d171Var7, j19, j17, j16, ocz0Var2, gh71Var5, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                        }
                    }
                    tvd0Var3 = tvd0Var11;
                    jvd0Var2.f116326a = str5;
                    jvd0Var2.f116327b = fvd0Var3;
                    jvd0Var2.f116328c = str6;
                    jvd0Var2.f116329d = d171Var2;
                    jvd0Var2.f116330e = tvd0Var3;
                    jvd0Var2.f116332g = i2;
                    jvd0Var2.f116333h = j4;
                    str7 = str5;
                    j7 = j4;
                    jvd0Var2.f116334i = j6;
                    jvd0Var2.f116335t = jLongValue;
                    jvd0Var2.f116323X = jLongValue2;
                    jvd0Var2.f116324Y = z2;
                    jvd0Var2.f116325Z = z3;
                    jvd0Var2.f116322N0 = 4;
                    z4 = z3;
                    lukVar = svd0Var.f214411i;
                    iOrdinal = tvd0Var3.ordinal();
                    w2a1Var = w2a1.f247311a;
                    if (iOrdinal != 0) {
                        z5 = z2;
                        j8 = jLongValue;
                        str8 = str7;
                        j9 = jLongValue2;
                        z6 = true;
                        tvd0Var4 = tvd0Var3;
                        strM79433p = m79433p(fvd0Var3);
                        if (strM79433p == null) {
                            svd0Var2 = svd0Var;
                        } else {
                            svd0Var2 = svd0Var;
                            objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                            if (objM89557A != yukVar) {
                            }
                        }
                        objM89557A = w2a1Var;
                    } else {
                        if (iOrdinal == 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (z4) {
                            z5 = z2;
                            j8 = jLongValue;
                            str8 = str7;
                            objM89557A = w2a1Var;
                            z6 = true;
                            svd0Var2 = svd0Var;
                            tvd0Var4 = tvd0Var3;
                            j9 = jLongValue2;
                        } else {
                            if (o5p0Var != null) {
                                iterable = o5p0Var.f162046a;
                            } else {
                                iterable = null;
                            }
                            if (iterable == null) {
                                iterable = lau.f131415a;
                            }
                            it = iterable.iterator();
                            do {
                                if (it.hasNext()) {
                                    y67Var = ((n07) it.next()).f148920a;
                                    if (y67Var instanceof u67) {
                                        u67Var = (u67) y67Var;
                                    } else {
                                        u67Var = null;
                                    }
                                    if (u67Var != null) {
                                        str10 = u67Var.f227234a;
                                    } else {
                                        str10 = null;
                                    }
                                } else {
                                    str10 = null;
                                }
                                if (str10 == null) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    svd0Var2 = svd0Var;
                                    str8 = str7;
                                    objM89557A = w2a1Var;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                } else {
                                    str8 = str7;
                                    z5 = z2;
                                    j8 = jLongValue;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                    objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                    if (objM89557A == yukVar) {
                                        svd0Var2 = svd0Var;
                                    } else {
                                        svd0Var2 = svd0Var;
                                        objM89557A = w2a1Var;
                                    }
                                }
                            } while (str10 == null);
                            if (str10 == null) {
                                z5 = z2;
                                j8 = jLongValue;
                                svd0Var2 = svd0Var;
                                str8 = str7;
                                objM89557A = w2a1Var;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                            } else {
                                str8 = str7;
                                z5 = z2;
                                j8 = jLongValue;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                                objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                if (objM89557A == yukVar) {
                                    svd0Var2 = svd0Var;
                                } else {
                                    svd0Var2 = svd0Var;
                                    objM89557A = w2a1Var;
                                }
                            }
                        }
                    }
                    if (objM89557A != yukVar) {
                        j10 = j8;
                        fvd0Var4 = fvd0Var3;
                        j11 = j7;
                        tvd0Var5 = tvd0Var4;
                        str9 = str8;
                        z7 = z5;
                        j12 = j6;
                        z8 = z4;
                        jvd0Var2.f116326a = str9;
                        jvd0Var2.f116327b = fvd0Var4;
                        jvd0Var2.f116328c = str6;
                        jvd0Var2.f116329d = d171Var2;
                        jvd0Var2.f116330e = tvd0Var5;
                        jvd0Var2.f116332g = i2;
                        jvd0Var2.f116333h = j11;
                        jvd0Var2.f116334i = j12;
                        jvd0Var2.f116335t = j10;
                        jvd0Var2.f116323X = j9;
                        fvd0Var5 = fvd0Var4;
                        jvd0Var2.f116324Y = z7;
                        jvd0Var2.f116325Z = z8;
                        jvd0Var2.f116322N0 = 5;
                        if (tvd0Var5 == tvd0Var2) {
                            objM47619a = null;
                        } else {
                            objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                        }
                        if (objM47619a == yukVar) {
                            return yukVar;
                        }
                        boolean z19 = z8;
                        obj3 = objM47619a;
                        j13 = j11;
                        str11 = str6;
                        fvd0Var6 = fvd0Var5;
                        z9 = z19;
                        tvd0Var6 = tvd0Var5;
                        j14 = j10;
                        z10 = z7;
                        str12 = str9;
                        ocz0Var = (ocz0) obj3;
                        jvd0Var2.f116326a = null;
                        jvd0Var2.f116327b = fvd0Var6;
                        jvd0Var2.f116328c = str11;
                        jvd0Var2.f116329d = d171Var2;
                        jvd0Var2.f116330e = tvd0Var6;
                        jvd0Var2.f116331f = ocz0Var;
                        jvd0Var2.f116332g = i2;
                        jvd0Var2.f116333h = j13;
                        jvd0Var2.f116334i = j12;
                        jvd0Var2.f116335t = j14;
                        jvd0Var2.f116323X = j9;
                        jvd0Var2.f116324Y = z10;
                        z11 = z9;
                        jvd0Var2.f116325Z = z11;
                        j15 = j13;
                        jvd0Var2.f116322N0 = 6;
                        objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                        if (objM79437o == yukVar) {
                            return yukVar;
                        }
                        tvd0Var7 = tvd0Var6;
                        str13 = str11;
                        ocz0Var2 = ocz0Var;
                        j16 = j9;
                        z12 = z11;
                        j17 = j14;
                        fvd0Var7 = fvd0Var6;
                        j18 = j12;
                        i3 = i2;
                        j19 = j15;
                        d171 d171Var8 = d171Var2;
                        gh71 gh71Var6 = (gh71) objM79437o;
                        l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                        if (l.longValue() > j) {
                            l2 = l;
                        } else {
                            l2 = null;
                        }
                        if (l2 != null) {
                            jLongValue3 = l2.longValue();
                        } else {
                            jLongValue3 = j19;
                        }
                        if (i3 != 0) {
                            z13 = z6;
                        } else {
                            z13 = false;
                        }
                        return new evd0(d171Var8, j19, j17, j16, ocz0Var2, gh71Var6, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                    }
                }
                return yukVar;
            case 3:
                j = 0;
                j5 = jvd0Var2.f116334i;
                long j21 = jvd0Var2.f116333h;
                int i9 = jvd0Var2.f116332g;
                d171 d171Var9 = jvd0Var2.f116329d;
                str6 = jvd0Var2.f116328c;
                fvd0Var3 = jvd0Var2.f116327b;
                String str16 = jvd0Var2.f116326a;
                bga.m29073P(objM79437o);
                d171Var2 = d171Var9;
                j4 = j21;
                str5 = str16;
                i2 = i9;
                obj2 = objM79437o;
                pqm0 pqm0Var4 = (pqm0) obj2;
                j6 = j5;
                jLongValue = ((Number) pqm0Var4.f180350a).longValue();
                jLongValue2 = ((Number) pqm0Var4.f180351b).longValue();
                yfj yfjVar4 = fvd0Var3.f73760c;
                o5p0Var = fvd0Var3.f73758a;
                wfjVar = yfjVar4.f272269d;
                if (wfjVar.equals(sfj.f208603a)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (o5p0Var != null) {
                    arrayList = o5p0Var.f162046a;
                    if (arrayList.isEmpty()) {
                        z3 = false;
                    } else {
                        it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = it2;
                                if (((n07) it2.next()).f148920a instanceof v67) {
                                    z3 = true;
                                } else {
                                    it2 = it3;
                                }
                            } else {
                                z3 = false;
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
                tvd0Var = aud0Var.f19919d;
                tvd0 tvd0Var12 = tvd0.f224147b;
                if (!z2) {
                    Set set5 = dd41.f47702f;
                    tvd0Var2 = tvd0Var8;
                    if (r46.m74726U(str5).f47709c != gn80.TRACK) {
                        tvd0Var3 = tvd0Var2;
                    } else if (tvd0Var == null) {
                        tvd0Var3 = tvd0Var;
                    }
                    jvd0Var2.f116326a = str5;
                    jvd0Var2.f116327b = fvd0Var3;
                    jvd0Var2.f116328c = str6;
                    jvd0Var2.f116329d = d171Var2;
                    jvd0Var2.f116330e = tvd0Var3;
                    jvd0Var2.f116332g = i2;
                    jvd0Var2.f116333h = j4;
                    str7 = str5;
                    j7 = j4;
                    jvd0Var2.f116334i = j6;
                    jvd0Var2.f116335t = jLongValue;
                    jvd0Var2.f116323X = jLongValue2;
                    jvd0Var2.f116324Y = z2;
                    jvd0Var2.f116325Z = z3;
                    jvd0Var2.f116322N0 = 4;
                    z4 = z3;
                    lukVar = svd0Var.f214411i;
                    iOrdinal = tvd0Var3.ordinal();
                    w2a1Var = w2a1.f247311a;
                    if (iOrdinal != 0) {
                        z5 = z2;
                        j8 = jLongValue;
                        str8 = str7;
                        j9 = jLongValue2;
                        z6 = true;
                        tvd0Var4 = tvd0Var3;
                        strM79433p = m79433p(fvd0Var3);
                        if (strM79433p == null) {
                            svd0Var2 = svd0Var;
                        } else {
                            svd0Var2 = svd0Var;
                            objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                            if (objM89557A != yukVar) {
                            }
                        }
                        objM89557A = w2a1Var;
                    } else {
                        if (iOrdinal == 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (z4) {
                            z5 = z2;
                            j8 = jLongValue;
                            str8 = str7;
                            objM89557A = w2a1Var;
                            z6 = true;
                            svd0Var2 = svd0Var;
                            tvd0Var4 = tvd0Var3;
                            j9 = jLongValue2;
                        } else {
                            if (o5p0Var != null) {
                                iterable = o5p0Var.f162046a;
                            } else {
                                iterable = null;
                            }
                            if (iterable == null) {
                                iterable = lau.f131415a;
                            }
                            it = iterable.iterator();
                            do {
                                if (it.hasNext()) {
                                    y67Var = ((n07) it.next()).f148920a;
                                    if (y67Var instanceof u67) {
                                        u67Var = (u67) y67Var;
                                    } else {
                                        u67Var = null;
                                    }
                                    if (u67Var != null) {
                                        str10 = u67Var.f227234a;
                                    } else {
                                        str10 = null;
                                    }
                                } else {
                                    str10 = null;
                                }
                                if (str10 == null) {
                                    z5 = z2;
                                    j8 = jLongValue;
                                    svd0Var2 = svd0Var;
                                    str8 = str7;
                                    objM89557A = w2a1Var;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                } else {
                                    str8 = str7;
                                    z5 = z2;
                                    j8 = jLongValue;
                                    j9 = jLongValue2;
                                    z6 = true;
                                    tvd0Var4 = tvd0Var3;
                                    objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                    if (objM89557A == yukVar) {
                                        svd0Var2 = svd0Var;
                                    } else {
                                        svd0Var2 = svd0Var;
                                        objM89557A = w2a1Var;
                                    }
                                }
                            } while (str10 == null);
                            if (str10 == null) {
                                z5 = z2;
                                j8 = jLongValue;
                                svd0Var2 = svd0Var;
                                str8 = str7;
                                objM89557A = w2a1Var;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                            } else {
                                str8 = str7;
                                z5 = z2;
                                j8 = jLongValue;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                                objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                if (objM89557A == yukVar) {
                                    svd0Var2 = svd0Var;
                                } else {
                                    svd0Var2 = svd0Var;
                                    objM89557A = w2a1Var;
                                }
                            }
                        }
                    }
                    if (objM89557A != yukVar) {
                        j10 = j8;
                        fvd0Var4 = fvd0Var3;
                        j11 = j7;
                        tvd0Var5 = tvd0Var4;
                        str9 = str8;
                        z7 = z5;
                        j12 = j6;
                        z8 = z4;
                        jvd0Var2.f116326a = str9;
                        jvd0Var2.f116327b = fvd0Var4;
                        jvd0Var2.f116328c = str6;
                        jvd0Var2.f116329d = d171Var2;
                        jvd0Var2.f116330e = tvd0Var5;
                        jvd0Var2.f116332g = i2;
                        jvd0Var2.f116333h = j11;
                        jvd0Var2.f116334i = j12;
                        jvd0Var2.f116335t = j10;
                        jvd0Var2.f116323X = j9;
                        fvd0Var5 = fvd0Var4;
                        jvd0Var2.f116324Y = z7;
                        jvd0Var2.f116325Z = z8;
                        jvd0Var2.f116322N0 = 5;
                        if (tvd0Var5 == tvd0Var2) {
                            objM47619a = null;
                        } else {
                            objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                        }
                        if (objM47619a == yukVar) {
                            return yukVar;
                        }
                        boolean z110 = z8;
                        obj3 = objM47619a;
                        j13 = j11;
                        str11 = str6;
                        fvd0Var6 = fvd0Var5;
                        z9 = z110;
                        tvd0Var6 = tvd0Var5;
                        j14 = j10;
                        z10 = z7;
                        str12 = str9;
                        ocz0Var = (ocz0) obj3;
                        jvd0Var2.f116326a = null;
                        jvd0Var2.f116327b = fvd0Var6;
                        jvd0Var2.f116328c = str11;
                        jvd0Var2.f116329d = d171Var2;
                        jvd0Var2.f116330e = tvd0Var6;
                        jvd0Var2.f116331f = ocz0Var;
                        jvd0Var2.f116332g = i2;
                        jvd0Var2.f116333h = j13;
                        jvd0Var2.f116334i = j12;
                        jvd0Var2.f116335t = j14;
                        jvd0Var2.f116323X = j9;
                        jvd0Var2.f116324Y = z10;
                        z11 = z9;
                        jvd0Var2.f116325Z = z11;
                        j15 = j13;
                        jvd0Var2.f116322N0 = 6;
                        objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                        if (objM79437o == yukVar) {
                            return yukVar;
                        }
                        tvd0Var7 = tvd0Var6;
                        str13 = str11;
                        ocz0Var2 = ocz0Var;
                        j16 = j9;
                        z12 = z11;
                        j17 = j14;
                        fvd0Var7 = fvd0Var6;
                        j18 = j12;
                        i3 = i2;
                        j19 = j15;
                        d171 d171Var10 = d171Var2;
                        gh71 gh71Var7 = (gh71) objM79437o;
                        l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                        if (l.longValue() > j) {
                            l2 = l;
                        } else {
                            l2 = null;
                        }
                        if (l2 != null) {
                            jLongValue3 = l2.longValue();
                        } else {
                            jLongValue3 = j19;
                        }
                        if (i3 != 0) {
                            z13 = z6;
                        } else {
                            z13 = false;
                        }
                        return new evd0(d171Var10, j19, j17, j16, ocz0Var2, gh71Var7, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                    }
                    return yukVar;
                }
                tvd0Var2 = tvd0Var8;
                tvd0Var3 = tvd0Var12;
                jvd0Var2.f116326a = str5;
                jvd0Var2.f116327b = fvd0Var3;
                jvd0Var2.f116328c = str6;
                jvd0Var2.f116329d = d171Var2;
                jvd0Var2.f116330e = tvd0Var3;
                jvd0Var2.f116332g = i2;
                jvd0Var2.f116333h = j4;
                str7 = str5;
                j7 = j4;
                jvd0Var2.f116334i = j6;
                jvd0Var2.f116335t = jLongValue;
                jvd0Var2.f116323X = jLongValue2;
                jvd0Var2.f116324Y = z2;
                jvd0Var2.f116325Z = z3;
                jvd0Var2.f116322N0 = 4;
                z4 = z3;
                lukVar = svd0Var.f214411i;
                iOrdinal = tvd0Var3.ordinal();
                w2a1Var = w2a1.f247311a;
                if (iOrdinal != 0) {
                    z5 = z2;
                    j8 = jLongValue;
                    str8 = str7;
                    j9 = jLongValue2;
                    z6 = true;
                    tvd0Var4 = tvd0Var3;
                    strM79433p = m79433p(fvd0Var3);
                    if (strM79433p == null) {
                        svd0Var2 = svd0Var;
                    } else {
                        svd0Var2 = svd0Var;
                        objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var2, strM79433p, j8, j9, null, 0), jvd0Var2);
                        if (objM89557A != yukVar) {
                        }
                    }
                    objM89557A = w2a1Var;
                } else {
                    if (iOrdinal == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (z4) {
                        z5 = z2;
                        j8 = jLongValue;
                        str8 = str7;
                        objM89557A = w2a1Var;
                        z6 = true;
                        svd0Var2 = svd0Var;
                        tvd0Var4 = tvd0Var3;
                        j9 = jLongValue2;
                    } else {
                        if (o5p0Var != null) {
                            iterable = o5p0Var.f162046a;
                        } else {
                            iterable = null;
                        }
                        if (iterable == null) {
                            iterable = lau.f131415a;
                        }
                        it = iterable.iterator();
                        do {
                            if (it.hasNext()) {
                                y67Var = ((n07) it.next()).f148920a;
                                if (y67Var instanceof u67) {
                                    u67Var = (u67) y67Var;
                                } else {
                                    u67Var = null;
                                }
                                if (u67Var != null) {
                                    str10 = u67Var.f227234a;
                                } else {
                                    str10 = null;
                                }
                            } else {
                                str10 = null;
                            }
                            if (str10 == null) {
                                z5 = z2;
                                j8 = jLongValue;
                                svd0Var2 = svd0Var;
                                str8 = str7;
                                objM89557A = w2a1Var;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                            } else {
                                str8 = str7;
                                z5 = z2;
                                j8 = jLongValue;
                                j9 = jLongValue2;
                                z6 = true;
                                tvd0Var4 = tvd0Var3;
                                objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                                if (objM89557A == yukVar) {
                                    svd0Var2 = svd0Var;
                                } else {
                                    svd0Var2 = svd0Var;
                                    objM89557A = w2a1Var;
                                }
                            }
                        } while (str10 == null);
                        if (str10 == null) {
                            z5 = z2;
                            j8 = jLongValue;
                            svd0Var2 = svd0Var;
                            str8 = str7;
                            objM89557A = w2a1Var;
                            j9 = jLongValue2;
                            z6 = true;
                            tvd0Var4 = tvd0Var3;
                        } else {
                            str8 = str7;
                            z5 = z2;
                            j8 = jLongValue;
                            j9 = jLongValue2;
                            z6 = true;
                            tvd0Var4 = tvd0Var3;
                            objM89557A = x0h1.m89557A(lukVar, new ivd0(svd0Var, str10, j8, j9, null, 1), jvd0Var2);
                            if (objM89557A == yukVar) {
                                svd0Var2 = svd0Var;
                            } else {
                                svd0Var2 = svd0Var;
                                objM89557A = w2a1Var;
                            }
                        }
                    }
                }
                if (objM89557A != yukVar) {
                    j10 = j8;
                    fvd0Var4 = fvd0Var3;
                    j11 = j7;
                    tvd0Var5 = tvd0Var4;
                    str9 = str8;
                    z7 = z5;
                    j12 = j6;
                    z8 = z4;
                    jvd0Var2.f116326a = str9;
                    jvd0Var2.f116327b = fvd0Var4;
                    jvd0Var2.f116328c = str6;
                    jvd0Var2.f116329d = d171Var2;
                    jvd0Var2.f116330e = tvd0Var5;
                    jvd0Var2.f116332g = i2;
                    jvd0Var2.f116333h = j11;
                    jvd0Var2.f116334i = j12;
                    jvd0Var2.f116335t = j10;
                    jvd0Var2.f116323X = j9;
                    fvd0Var5 = fvd0Var4;
                    jvd0Var2.f116324Y = z7;
                    jvd0Var2.f116325Z = z8;
                    jvd0Var2.f116322N0 = 5;
                    if (tvd0Var5 == tvd0Var2) {
                        objM47619a = null;
                    } else {
                        objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                    }
                    if (objM47619a == yukVar) {
                        return yukVar;
                    }
                    boolean z111 = z8;
                    obj3 = objM47619a;
                    j13 = j11;
                    str11 = str6;
                    fvd0Var6 = fvd0Var5;
                    z9 = z111;
                    tvd0Var6 = tvd0Var5;
                    j14 = j10;
                    z10 = z7;
                    str12 = str9;
                    ocz0Var = (ocz0) obj3;
                    jvd0Var2.f116326a = null;
                    jvd0Var2.f116327b = fvd0Var6;
                    jvd0Var2.f116328c = str11;
                    jvd0Var2.f116329d = d171Var2;
                    jvd0Var2.f116330e = tvd0Var6;
                    jvd0Var2.f116331f = ocz0Var;
                    jvd0Var2.f116332g = i2;
                    jvd0Var2.f116333h = j13;
                    jvd0Var2.f116334i = j12;
                    jvd0Var2.f116335t = j14;
                    jvd0Var2.f116323X = j9;
                    jvd0Var2.f116324Y = z10;
                    z11 = z9;
                    jvd0Var2.f116325Z = z11;
                    j15 = j13;
                    jvd0Var2.f116322N0 = 6;
                    objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                    if (objM79437o == yukVar) {
                        return yukVar;
                    }
                    tvd0Var7 = tvd0Var6;
                    str13 = str11;
                    ocz0Var2 = ocz0Var;
                    j16 = j9;
                    z12 = z11;
                    j17 = j14;
                    fvd0Var7 = fvd0Var6;
                    j18 = j12;
                    i3 = i2;
                    j19 = j15;
                    d171 d171Var11 = d171Var2;
                    gh71 gh71Var8 = (gh71) objM79437o;
                    l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                    if (l.longValue() > j) {
                        l2 = l;
                    } else {
                        l2 = null;
                    }
                    if (l2 != null) {
                        jLongValue3 = l2.longValue();
                    } else {
                        jLongValue3 = j19;
                    }
                    if (i3 != 0) {
                        z13 = z6;
                    } else {
                        z13 = false;
                    }
                    return new evd0(d171Var11, j19, j17, j16, ocz0Var2, gh71Var8, tvd0Var7, z12, str13, z13, j18, jLongValue3);
                }
                return yukVar;
            case 4:
                j = 0;
                boolean z20 = jvd0Var2.f116325Z;
                boolean z21 = jvd0Var2.f116324Y;
                long j22 = jvd0Var2.f116323X;
                long j23 = jvd0Var2.f116335t;
                long j24 = jvd0Var2.f116334i;
                long j25 = jvd0Var2.f116333h;
                int i10 = jvd0Var2.f116332g;
                tvd0 tvd0Var13 = jvd0Var2.f116330e;
                d171 d171Var12 = jvd0Var2.f116329d;
                String str17 = jvd0Var2.f116328c;
                fvd0 fvd0Var12 = jvd0Var2.f116327b;
                String str18 = jvd0Var2.f116326a;
                bga.m29073P(objM79437o);
                z7 = z21;
                tvd0Var2 = tvd0Var8;
                tvd0Var5 = tvd0Var13;
                z8 = z20;
                z6 = true;
                str9 = str18;
                jvd0Var2 = jvd0Var2;
                fvd0Var4 = fvd0Var12;
                j12 = j24;
                str6 = str17;
                i2 = i10;
                j10 = j23;
                d171Var2 = d171Var12;
                j9 = j22;
                j11 = j25;
                jvd0Var2.f116326a = str9;
                jvd0Var2.f116327b = fvd0Var4;
                jvd0Var2.f116328c = str6;
                jvd0Var2.f116329d = d171Var2;
                jvd0Var2.f116330e = tvd0Var5;
                jvd0Var2.f116332g = i2;
                jvd0Var2.f116333h = j11;
                jvd0Var2.f116334i = j12;
                jvd0Var2.f116335t = j10;
                jvd0Var2.f116323X = j9;
                fvd0Var5 = fvd0Var4;
                jvd0Var2.f116324Y = z7;
                jvd0Var2.f116325Z = z8;
                jvd0Var2.f116322N0 = 5;
                if (tvd0Var5 == tvd0Var2) {
                    objM47619a = null;
                } else {
                    objM47619a = svd0Var2.f214412t.m47619a(strM79433p2, jvd0Var2);
                }
                if (objM47619a == yukVar) {
                    return yukVar;
                }
                boolean z112 = z8;
                obj3 = objM47619a;
                j13 = j11;
                str11 = str6;
                fvd0Var6 = fvd0Var5;
                z9 = z112;
                tvd0Var6 = tvd0Var5;
                j14 = j10;
                z10 = z7;
                str12 = str9;
                ocz0Var = (ocz0) obj3;
                jvd0Var2.f116326a = null;
                jvd0Var2.f116327b = fvd0Var6;
                jvd0Var2.f116328c = str11;
                jvd0Var2.f116329d = d171Var2;
                jvd0Var2.f116330e = tvd0Var6;
                jvd0Var2.f116331f = ocz0Var;
                jvd0Var2.f116332g = i2;
                jvd0Var2.f116333h = j13;
                jvd0Var2.f116334i = j12;
                jvd0Var2.f116335t = j14;
                jvd0Var2.f116323X = j9;
                jvd0Var2.f116324Y = z10;
                z11 = z9;
                jvd0Var2.f116325Z = z11;
                j15 = j13;
                jvd0Var2.f116322N0 = 6;
                objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                if (objM79437o == yukVar) {
                    return yukVar;
                }
                tvd0Var7 = tvd0Var6;
                str13 = str11;
                ocz0Var2 = ocz0Var;
                j16 = j9;
                z12 = z11;
                j17 = j14;
                fvd0Var7 = fvd0Var6;
                j18 = j12;
                i3 = i2;
                j19 = j15;
                d171 d171Var13 = d171Var2;
                gh71 gh71Var9 = (gh71) objM79437o;
                l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                if (l.longValue() > j) {
                    l2 = l;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    jLongValue3 = l2.longValue();
                } else {
                    jLongValue3 = j19;
                }
                if (i3 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new evd0(d171Var13, j19, j17, j16, ocz0Var2, gh71Var9, tvd0Var7, z12, str13, z13, j18, jLongValue3);
            case 5:
                j = 0;
                boolean z22 = jvd0Var2.f116325Z;
                boolean z23 = jvd0Var2.f116324Y;
                long j26 = jvd0Var2.f116323X;
                j14 = jvd0Var2.f116335t;
                long j27 = jvd0Var2.f116334i;
                long j28 = jvd0Var2.f116333h;
                int i11 = jvd0Var2.f116332g;
                tvd0 tvd0Var14 = jvd0Var2.f116330e;
                d171 d171Var14 = jvd0Var2.f116329d;
                String str19 = jvd0Var2.f116328c;
                fvd0 fvd0Var13 = jvd0Var2.f116327b;
                String str20 = jvd0Var2.f116326a;
                bga.m29073P(objM79437o);
                z9 = z22;
                tvd0Var6 = tvd0Var14;
                jvd0Var2 = jvd0Var2;
                z10 = z23;
                str11 = str19;
                obj3 = objM79437o;
                z6 = true;
                str12 = str20;
                j13 = j28;
                d171Var2 = d171Var14;
                i2 = i11;
                j9 = j26;
                j12 = j27;
                fvd0Var6 = fvd0Var13;
                ocz0Var = (ocz0) obj3;
                jvd0Var2.f116326a = null;
                jvd0Var2.f116327b = fvd0Var6;
                jvd0Var2.f116328c = str11;
                jvd0Var2.f116329d = d171Var2;
                jvd0Var2.f116330e = tvd0Var6;
                jvd0Var2.f116331f = ocz0Var;
                jvd0Var2.f116332g = i2;
                jvd0Var2.f116333h = j13;
                jvd0Var2.f116334i = j12;
                jvd0Var2.f116335t = j14;
                jvd0Var2.f116323X = j9;
                jvd0Var2.f116324Y = z10;
                z11 = z9;
                jvd0Var2.f116325Z = z11;
                j15 = j13;
                jvd0Var2.f116322N0 = 6;
                objM79437o = svd0Var.m79437o(str12, jvd0Var2);
                if (objM79437o == yukVar) {
                    return yukVar;
                }
                tvd0Var7 = tvd0Var6;
                str13 = str11;
                ocz0Var2 = ocz0Var;
                j16 = j9;
                z12 = z11;
                j17 = j14;
                fvd0Var7 = fvd0Var6;
                j18 = j12;
                i3 = i2;
                j19 = j15;
                d171 d171Var15 = d171Var2;
                gh71 gh71Var10 = (gh71) objM79437o;
                l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                if (l.longValue() > j) {
                    l2 = l;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    jLongValue3 = l2.longValue();
                } else {
                    jLongValue3 = j19;
                }
                if (i3 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new evd0(d171Var15, j19, j17, j16, ocz0Var2, gh71Var10, tvd0Var7, z12, str13, z13, j18, jLongValue3);
            case 6:
                boolean z24 = jvd0Var2.f116325Z;
                long j29 = jvd0Var2.f116323X;
                long j30 = jvd0Var2.f116335t;
                long j31 = jvd0Var2.f116334i;
                j = 0;
                long j32 = jvd0Var2.f116333h;
                i3 = jvd0Var2.f116332g;
                ocz0 ocz0Var3 = jvd0Var2.f116331f;
                tvd0 tvd0Var15 = jvd0Var2.f116330e;
                d171Var2 = jvd0Var2.f116329d;
                String str21 = jvd0Var2.f116328c;
                fvd0Var7 = jvd0Var2.f116327b;
                bga.m29073P(objM79437o);
                z12 = z24;
                j16 = j29;
                j17 = j30;
                j18 = j31;
                j19 = j32;
                ocz0Var2 = ocz0Var3;
                tvd0Var7 = tvd0Var15;
                str13 = str21;
                z6 = true;
                d171 d171Var16 = d171Var2;
                gh71 gh71Var11 = (gh71) objM79437o;
                l = new Long(cks.m33199r(fvd0Var7.f73762e.f31503c, ils.MILLISECONDS));
                if (l.longValue() > j) {
                    l2 = l;
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    jLongValue3 = l2.longValue();
                } else {
                    jLongValue3 = j19;
                }
                if (i3 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new evd0(d171Var16, j19, j17, j16, ocz0Var2, gh71Var11, tvd0Var7, z12, str13, z13, j18, jLongValue3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public static final Serializable m79432l(svd0 svd0Var, String str, ibk ibkVar) {
        kvd0 kvd0Var;
        List list;
        if (ibkVar instanceof kvd0) {
            kvd0Var = (kvd0) ibkVar;
            int i = kvd0Var.f126836d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kvd0Var.f126836d = i - Integer.MIN_VALUE;
            } else {
                kvd0Var = new kvd0(svd0Var, ibkVar);
            }
        } else {
            kvd0Var = new kvd0(svd0Var, ibkVar);
        }
        Object objM79435m = kvd0Var.f126834b;
        int i2 = kvd0Var.f126836d;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79435m);
                tjo tjoVar = svd0Var.f214400P0;
                kvd0Var.f126836d = 1;
                objM79435m = svd0Var.m79435m(tjoVar, str, kvd0Var);
                if (objM79435m == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM79435m);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = kvd0Var.f126833a;
                bga.m29073P(objM79435m);
            }
            return qlk.m73241t(list, (Map) objM79435m);
            List list2 = (List) objM79435m;
            if (list2.isEmpty()) {
                return lau.f131415a;
            }
            aab0 aab0Var = new aab0(list2, svd0Var, (fbk) null, 20);
            kvd0Var.f126833a = list2;
            kvd0Var.f126836d = 2;
            objM79435m = kk40.m56684z(aab0Var, kvd0Var);
            if (objM79435m != yukVar) {
                list = list2;
                return qlk.m73241t(list, (Map) objM79435m);
            }
            return yukVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m79433p(fvd0 fvd0Var) {
        o5p0 o5p0Var = fvd0Var.f73758a;
        Iterable iterable = o5p0Var != null ? o5p0Var.f162047b : null;
        if (iterable == null) {
            iterable = lau.f131415a;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return ((yzb1) it.next()).f277755b.f186565a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public static final Object m79434s(svd0 svd0Var, pu71 pu71Var, ibk ibkVar) {
        rvd0 rvd0Var;
        long jMo40100a;
        String str;
        if (ibkVar instanceof rvd0) {
            rvd0Var = (rvd0) ibkVar;
            int i = rvd0Var.f203070c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rvd0Var.f203070c = i - Integer.MIN_VALUE;
            } else {
                rvd0Var = new rvd0(ibkVar);
            }
        } else {
            rvd0Var = new rvd0(ibkVar);
        }
        Object objM83938F = rvd0Var.f203069b;
        int i2 = rvd0Var.f203070c;
        if (i2 == 0) {
            bga.m29073P(objM83938F);
            if (pu71Var instanceof mu71) {
                jMo40100a = ((mu71) pu71Var).f147265a;
            } else {
                if (!(pu71Var instanceof nu71)) {
                    throw new NoWhenBranchMatchedException();
                }
                utu0 utu0Var = svd0Var.f214408f;
                String str2 = svd0Var.f214407e.f19916a;
                long jM87008m = w1h1.m87008m(pu71Var);
                rvd0Var.f203068a = svd0Var;
                rvd0Var.f203070c = 1;
                objM83938F = utu0Var.m83938F(jM87008m, str2, rvd0Var);
                yuk yukVar = yuk.f276404a;
                if (objM83938F == yukVar) {
                    return yukVar;
                }
            }
            return new Long(jMo40100a);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        svd0Var = rvd0Var.f203068a;
        bga.m29073P(objM83938F);
        gv71 gv71Var = (gv71) objM83938F;
        if (gv71Var instanceof ev71) {
            int i3 = ((ev71) gv71Var).f63176b;
            if (i3 == 1) {
                str = "error";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str = "timeout";
            }
            svd0Var.f214410h.mo32278c(new z6m0("timestamp_conversion_error", str));
        }
        jMo40100a = gv71Var.mo40100a();
        return new Long(jMo40100a);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        this.f214398N0 = x0h1.m89578u(this.f214405Z, null, 0, new sqc0(this, (fbk) null, 13), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f214398N0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f214398N0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m79435m(tjo tjoVar, Object obj, ibk ibkVar) {
        hvd0 hvd0Var;
        if (ibkVar instanceof hvd0) {
            hvd0Var = (hvd0) ibkVar;
            int i = hvd0Var.f95662c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvd0Var.f95662c = i - Integer.MIN_VALUE;
            } else {
                hvd0Var = new hvd0(this, ibkVar);
            }
        } else {
            hvd0Var = new hvd0(this, ibkVar);
        }
        Object objM86755t = hvd0Var.f95660a;
        int i2 = hvd0Var.f95662c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            f2a0 f2a0Var = new f2a0(fag1.m41173v(this.f214406d, tjoVar, obj), 4);
            hvd0Var.f95662c = 1;
            objM86755t = vyf1.m86755t(f2a0Var, hvd0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        qho qhoVar = (qho) objM86755t;
        if (qhoVar instanceof oho) {
            return ((oho) qhoVar).f165512a;
        }
        if (qhoVar instanceof nho) {
            throw new IllegalStateException(((nho) qhoVar).f154041a.getMessage());
        }
        throw new IllegalStateException("Unexpected DataResult state");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m79436n(String str, ibk ibkVar) throws Exception {
        lvd0 lvd0Var;
        Exception e;
        String str2;
        svd0 svd0Var;
        if (ibkVar instanceof lvd0) {
            lvd0Var = (lvd0) ibkVar;
            int i = lvd0Var.f137286e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvd0Var.f137286e = i - Integer.MIN_VALUE;
            } else {
                lvd0Var = new lvd0(this, ibkVar);
            }
        } else {
            lvd0Var = new lvd0(this, ibkVar);
        }
        Object obj = lvd0Var.f137284c;
        int i2 = lvd0Var.f137286e;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                try {
                    tjo tjoVar = this.f214399O0;
                    lvd0Var.f137282a = this;
                    lvd0Var.f137283b = "metadata_error";
                    lvd0Var.f137286e = 1;
                    Object objM79435m = m79435m(tjoVar, str, lvd0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM79435m == yukVar) {
                        return yukVar;
                    }
                    obj = objM79435m;
                    str2 = "metadata_error";
                    svd0Var = this;
                } catch (Exception e2) {
                    e = e2;
                    str2 = "metadata_error";
                    svd0Var = this;
                    svd0Var.f214410h.mo32278c(new z6m0(str2, e.getClass().getSimpleName()));
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = lvd0Var.f137283b;
                svd0Var = lvd0Var.f137282a;
                try {
                    bga.m29073P(obj);
                } catch (Exception e3) {
                    e = e3;
                    svd0Var.f214410h.mo32278c(new z6m0(str2, e.getClass().getSimpleName()));
                    throw e;
                }
            }
            return (fvd0) obj;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m79437o(String str, ibk ibkVar) {
        nvd0 nvd0Var;
        if (ibkVar instanceof nvd0) {
            nvd0Var = (nvd0) ibkVar;
            int i = nvd0Var.f158869c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvd0Var.f158869c = i - Integer.MIN_VALUE;
            } else {
                nvd0Var = new nvd0(this, ibkVar);
            }
        } else {
            nvd0Var = new nvd0(this, ibkVar);
        }
        Object objM79435m = nvd0Var.f158867a;
        int i2 = nvd0Var.f158869c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79435m);
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c != gn80.TRACK) {
                    return null;
                }
                tjo tjoVar = this.f214402R0;
                nvd0Var.f158869c = 1;
                objM79435m = m79435m(tjoVar, str, nvd0Var);
                Object obj = yuk.f276404a;
                if (objM79435m == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM79435m);
            }
            return (gh71) objM79435m;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: q */
    public final Serializable m79438q(long j, d171 d171Var, boolean z, long j2, ibk ibkVar) {
        ovd0 ovd0Var;
        long j3;
        long j4;
        d171 d171Var2;
        boolean z2;
        char c;
        pu71 pu71VarMo92011n;
        long j5;
        Object objPrevious;
        Object obj;
        if (ibkVar instanceof ovd0) {
            ovd0Var = (ovd0) ibkVar;
            int i = ovd0Var.f170488g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovd0Var.f170488g = i - Integer.MIN_VALUE;
            } else {
                ovd0Var = new ovd0(this, ibkVar);
            }
        } else {
            ovd0Var = new ovd0(this, ibkVar);
        }
        Object objM79439r = ovd0Var.f170486e;
        int i2 = ovd0Var.f170488g;
        if (i2 == 0) {
            bga.m29073P(objM79439r);
            ztd0 ztd0VarMo81501T0 = this.f214407e.f19917b.mo81501T0();
            ovd0Var.f170484c = d171Var;
            j3 = j;
            ovd0Var.f170482a = j3;
            ovd0Var.f170485d = z;
            j4 = j2;
            ovd0Var.f170483b = j4;
            ovd0Var.f170488g = 1;
            objM79439r = m79439r(ztd0VarMo81501T0, ovd0Var);
            yuk yukVar = yuk.f276404a;
            if (objM79439r == yukVar) {
                return yukVar;
            }
            d171Var2 = d171Var;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j6 = ovd0Var.f170483b;
            z2 = ovd0Var.f170485d;
            long j7 = ovd0Var.f170482a;
            d171Var2 = ovd0Var.f170484c;
            bga.m29073P(objM79439r);
            j4 = j6;
            j3 = j7;
        }
        ztd0 ztd0Var = (ztd0) objM79439r;
        long j8 = ((mu71) ztd0Var.mo92011n()).f147265a;
        if (d171Var2 == null || !z2) {
            return new pqm0(new Long(j8), new Long(Math.min(j8 + 10000, j3)));
        }
        if (ztd0Var instanceof ytd0) {
            c = 1;
        } else {
            if (!(ztd0Var instanceof xtd0)) {
                throw new NoWhenBranchMatchedException();
            }
            c = 2;
        }
        xtd0 xtd0Var = ztd0Var instanceof xtd0 ? (xtd0) ztd0Var : null;
        if (xtd0Var == null || (pu71VarMo92011n = xtd0Var.f265845b) == null) {
            pu71VarMo92011n = ztd0Var.mo92011n();
        }
        long j9 = ((mu71) pu71VarMo92011n).f147265a;
        ArrayList arrayList = d171Var2.f44179c;
        if (arrayList.isEmpty()) {
            if (c == 1) {
                return new pqm0(Long.valueOf(j8), Long.valueOf(j3));
            }
            return j8 == j9 ? new pqm0(Long.valueOf(j8), Long.valueOf(j3)) : new pqm0(Long.valueOf(j8), Long.valueOf(j9));
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                j5 = j9;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            j5 = j9;
            if (((jd71) objPrevious).f111278a <= j8) {
                break;
            }
            j9 = j5;
        }
        jd71 jd71Var = (jd71) objPrevious;
        if (jd71Var == null) {
            jd71Var = (jd71) g6f.m43741q0(arrayList);
        }
        if (c == 1) {
            return new pqm0(Long.valueOf(jd71Var.f111278a), Long.valueOf(j3));
        }
        if (j8 != j5) {
            ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    obj = null;
                    break;
                }
                Object objPrevious2 = listIterator2.previous();
                if (((jd71) objPrevious2).f111278a < j5) {
                    obj = objPrevious2;
                    break;
                }
            }
            jd71 jd71Var2 = (jd71) obj;
            return new pqm0(Long.valueOf(jd71Var.f111278a), Long.valueOf(jd71Var2 != null ? jd71Var2.f111279b : jd71Var.f111279b));
        }
        Long lValueOf = Long.valueOf(jd71Var.f111278a);
        long j10 = jd71Var.f111279b;
        long j11 = jd71Var.f111278a;
        if (j4 > 0 && j10 - j11 < j4) {
            for (int iIndexOf = arrayList.indexOf(jd71Var) + 1; iIndexOf < arrayList.size() && j10 - j11 < j4; iIndexOf++) {
                j10 = ((jd71) arrayList.get(iIndexOf)).f111279b;
            }
        }
        return new pqm0(lValueOf, Long.valueOf(j10));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m79439r(ztd0 ztd0Var, ibk ibkVar) {
        qvd0 qvd0Var;
        xtd0 xtd0Var;
        ytd0 ytd0Var;
        mu71 mu71Var;
        pu71 pu71Var;
        Object objM79434s;
        mu71 mu71Var2;
        if (ibkVar instanceof qvd0) {
            qvd0Var = (qvd0) ibkVar;
            int i = qvd0Var.f192980g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qvd0Var.f192980g = i - Integer.MIN_VALUE;
            } else {
                qvd0Var = new qvd0(this, ibkVar);
            }
        } else {
            qvd0Var = new qvd0(this, ibkVar);
        }
        Object objM79434s2 = qvd0Var.f192978e;
        int i2 = qvd0Var.f192980g;
        mu71 mu71Var3 = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM79434s2);
            if (ztd0Var instanceof ytd0) {
                ytd0Var = (ytd0) ztd0Var;
                pu71 pu71Var2 = ytd0Var.f276098a;
                qvd0Var.f192974a = null;
                qvd0Var.f192975b = ytd0Var;
                qvd0Var.f192980g = 1;
                objM79434s2 = m79434s(this, pu71Var2, qvd0Var);
            } else {
                if (!(ztd0Var instanceof xtd0)) {
                    throw new NoWhenBranchMatchedException();
                }
                xtd0 xtd0Var2 = (xtd0) ztd0Var;
                pu71 pu71Var3 = xtd0Var2.f265844a;
                qvd0Var.f192974a = xtd0Var2;
                qvd0Var.f192975b = xtd0Var2;
                qvd0Var.f192980g = 2;
                Object objM79434s3 = m79434s(this, pu71Var3, qvd0Var);
                if (objM79434s3 != yukVar) {
                    xtd0Var = xtd0Var2;
                    objM79434s2 = objM79434s3;
                    mu71Var = new mu71(((Number) objM79434s2).longValue());
                    pu71Var = ((xtd0) ztd0Var).f265845b;
                    if (pu71Var != null) {
                        qvd0Var.f192974a = null;
                        qvd0Var.f192975b = null;
                        qvd0Var.f192976c = xtd0Var;
                        qvd0Var.f192977d = mu71Var;
                        qvd0Var.f192980g = 3;
                        objM79434s = m79434s(this, pu71Var, qvd0Var);
                        if (objM79434s != yukVar) {
                            objM79434s2 = objM79434s;
                            mu71Var2 = mu71Var;
                            mu71Var3 = new mu71(((Number) objM79434s2).longValue());
                            mu71Var = mu71Var2;
                        }
                    }
                }
            }
            return yukVar;
        }
        if (i2 == 1) {
            ytd0Var = (ytd0) qvd0Var.f192975b;
            bga.m29073P(objM79434s2);
            mu71 mu71Var4 = new mu71(((Number) objM79434s2).longValue());
            ytd0Var.getClass();
            return new ytd0(mu71Var4);
        }
        if (i2 == 2) {
            xtd0 xtd0Var3 = (xtd0) qvd0Var.f192975b;
            xtd0 xtd0Var4 = qvd0Var.f192974a;
            bga.m29073P(objM79434s2);
            xtd0Var = xtd0Var3;
            ztd0Var = xtd0Var4;
            mu71Var = new mu71(((Number) objM79434s2).longValue());
            pu71Var = ((xtd0) ztd0Var).f265845b;
            if (pu71Var != null) {
                qvd0Var.f192974a = null;
                qvd0Var.f192975b = null;
                qvd0Var.f192976c = xtd0Var;
                qvd0Var.f192977d = mu71Var;
                qvd0Var.f192980g = 3;
                objM79434s = m79434s(this, pu71Var, qvd0Var);
                if (objM79434s != yukVar) {
                    objM79434s2 = objM79434s;
                    mu71Var2 = mu71Var;
                }
                return yukVar;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mu71Var2 = qvd0Var.f192977d;
            xtd0Var = qvd0Var.f192976c;
            bga.m29073P(objM79434s2);
        }
        mu71Var3 = new mu71(((Number) objM79434s2).longValue());
        mu71Var = mu71Var2;
        xtd0Var.getClass();
        return new xtd0(mu71Var, mu71Var3);
    }
}
