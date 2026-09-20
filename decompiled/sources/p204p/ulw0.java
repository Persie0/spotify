package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ulw0 {

    /* JADX INFO: renamed from: a */
    public final gjv0 f231655a;

    /* JADX INFO: renamed from: b */
    public final xuk f231656b;

    /* JADX INFO: renamed from: c */
    public final kqi0 f231657c;

    /* JADX INFO: renamed from: d */
    public final kqi0 f231658d;

    /* JADX INFO: renamed from: e */
    public final kqi0 f231659e;

    /* JADX INFO: renamed from: f */
    public final float f231660f;

    /* JADX INFO: renamed from: g */
    public final C2326r5 f231661g;

    /* JADX INFO: renamed from: h */
    public final cny0 f231662h;

    /* JADX INFO: renamed from: i */
    public final ko70 f231663i;

    /* JADX INFO: renamed from: j */
    public final qe70 f231664j;

    /* JADX INFO: renamed from: k */
    public final lsi0 f231665k = msi0.m62770a();

    /* JADX INFO: renamed from: l */
    public final yum0 f231666l = sam.m77645B(null);

    /* JADX INFO: renamed from: m */
    public final rtq f231667m = sam.m77674m(new mlw0(this, 0));

    /* JADX INFO: renamed from: n */
    public final yum0 f231668n = sam.m77645B(new Offset(0));

    /* JADX INFO: renamed from: o */
    public final yum0 f231669o = sam.m77645B(new y350(0));

    /* JADX INFO: renamed from: p */
    public final yum0 f231670p = sam.m77645B(null);

    /* JADX INFO: renamed from: q */
    public final yum0 f231671q = sam.m77645B(null);

    /* JADX INFO: renamed from: r */
    public long f231672r = 0;

    /* JADX INFO: renamed from: s */
    public final HashSet f231673s = new HashSet();

    /* JADX INFO: renamed from: t */
    public final yum0 f231674t = sam.m77645B(null);

    /* JADX INFO: renamed from: u */
    public final gw4 f231675u = new gw4(new Offset(0), geg1.f79125f, null, 12);

    /* JADX INFO: renamed from: v */
    public final nzx0 f231676v = sam.m77655L(new mlw0(this, 1));

    /* JADX WARN: Multi-variable type inference failed */
    public ulw0(gjv0 gjv0Var, xuk xukVar, kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, float f, C2326r5 c2326r5, cny0 cny0Var, ko70 ko70Var, th00 th00Var) {
        this.f231655a = gjv0Var;
        this.f231656b = xukVar;
        this.f231657c = kqi0Var;
        this.f231658d = kqi0Var2;
        this.f231659e = kqi0Var3;
        this.f231660f = f;
        this.f231661g = c2326r5;
        this.f231662h = cny0Var;
        this.f231663i = ko70Var;
        this.f231664j = (qe70) th00Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ba, code lost:
    
        if (r3.m81078a() > r13.m81078a()) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cb, code lost:
    
        if (r3.m81078a() < r13.m81078a()) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cd, code lost:
    
        r0 = p204p.x0h1.m89578u(r23.f231656b, null, 0, new p204p.olw0(r23, r13, r3, r4, 0), 3);
        r6.mo54249c(null);
        r7.f155175a = null;
        r7.f155178d = 2;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ec, code lost:
    
        if (r0.mo26604k(r7) != r1) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ef, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f0, code lost:
    
        r6.mo54249c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f3, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r13.m81078a() == r1.m81078a()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r13.m81078a() == ((p204p.vum0) ((p204p.yw70) r2.f80569b).f276892e.f191124b).m86437v()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        r6.mo54249c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m83405a(ulw0 ulw0Var, xmy0 xmy0Var, ibk ibkVar) {
        nlw0 nlw0Var;
        xmy0 xmy0Var2;
        l5f l5fVar;
        yuk yukVar;
        ArrayList arrayList;
        xmy0 xmy0Var3;
        Object next;
        tlw0 tlw0Var;
        Object objPrevious;
        yuk yukVar2;
        vvl0 vvl0Var;
        gjv0 gjv0Var = ulw0Var.f231655a;
        lsi0 lsi0Var = ulw0Var.f231665k;
        if (ibkVar instanceof nlw0) {
            nlw0Var = (nlw0) ibkVar;
            int i = nlw0Var.f155178d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nlw0Var.f155178d = i - Integer.MIN_VALUE;
            } else {
                nlw0Var = new nlw0(ulw0Var, ibkVar);
            }
        } else {
            nlw0Var = new nlw0(ulw0Var, ibkVar);
        }
        nlw0 nlw0Var2 = nlw0Var;
        Object obj = nlw0Var2.f155176b;
        int i2 = nlw0Var2.f155178d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            nlw0Var2.f155175a = xmy0Var;
            nlw0Var2.f155178d = 1;
            if (lsi0Var.mo54248a(nlw0Var2) == yukVar3) {
                return yukVar3;
            }
            xmy0Var2 = xmy0Var;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            xmy0 xmy0Var4 = nlw0Var2.f155175a;
            bga.m29073P(obj);
            xmy0Var2 = xmy0Var4;
        }
        tlw0 tlw0VarM83408d = ulw0Var.m83408d();
        if (tlw0VarM83408d == null) {
            lsi0Var.mo54249c(null);
            return w2a1Var;
        }
        int iOrdinal = xmy0Var2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            tlw0 tlw0Var2 = (tlw0) g6f.m43689C0(gjv0Var.m44967g().m90173e());
            if (tlw0Var2 != null) {
            }
            long jM83412h = ulw0Var.m83412h(ulw0Var.m83409e());
            ulw0Var.m83413i(jM83412h);
            long jM81079b = tlw0VarM83408d.m81079b();
            long jM257g = Offset.m257g((((long) Float.floatToRawIntBits((int) (jM81079b & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jM81079b >> 32)) << 32), jM83412h);
            tiv0 tiv0VarM71834h = q0f1.m71834h(jM257g, bcg1.m28741v(jM257g, epv0.m39677M(tlw0VarM83408d.m81080c())));
            int iM38547C = edb.m38547C(1);
            if (iM38547C != 0) {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int iOrdinal2 = ulw0Var.m83410f().ordinal();
                if (iOrdinal2 == 0) {
                    vvl0Var = vvl0.f245249b;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vvl0Var = vvl0.f245248a;
                }
                int iOrdinal3 = vvl0Var.ordinal();
                if (iOrdinal3 == 0) {
                    tiv0VarM71834h = tiv0.m80929b(tiv0VarM71834h, 0.0f, Float.NEGATIVE_INFINITY, 0.0f, 5);
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tiv0VarM71834h = tiv0.m80929b(tiv0VarM71834h, Float.NEGATIVE_INFINITY, 0.0f, Float.POSITIVE_INFINITY, 10);
                }
            }
            x7q0 x7q0VarM44967g = gjv0Var.m44967g();
            C2326r5 c2326r5 = ulw0Var.f231661g;
            vvl0 vvl0VarM90171c = x7q0VarM44967g.m90171c();
            boolean z = ((sw70) x7q0VarM44967g.f258979b).f214609o;
            int iOrdinal4 = vvl0VarM90171c.ordinal();
            if (iOrdinal4 == 0) {
                l5fVar = new l5f(c2326r5.f195912c, c2326r5.f195913d);
            } else {
                if (iOrdinal4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                l5fVar = new l5f(c2326r5.f195910a, c2326r5.f195911b);
            }
            if (z) {
                l5fVar = new l5f(l5fVar.f129888b, l5fVar.f129887a);
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
            aky0 aky0VarM90172d = x7q0VarM44967g.m90172d(l5fVar);
            float f = aky0VarM90172d.f16678a;
            float f2 = aky0VarM90172d.f16679b;
            int iOrdinal5 = x7q0VarM44967g.m90171c().ordinal();
            if (iOrdinal5 == 0) {
                yukVar = yukVar3;
                ArrayList arrayListM90173e = x7q0VarM44967g.m90173e();
                arrayList = new ArrayList();
                for (Object obj2 : arrayListM90173e) {
                    tlw0 tlw0Var3 = (tlw0) obj2;
                    if (((int) (tlw0Var3.m81079b() & 4294967295L)) >= f && ((int) (tlw0Var3.m81079b() & 4294967295L)) + ((int) (tlw0Var3.m81080c() & 4294967295L)) <= f2) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                if (iOrdinal5 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayListM90173e2 = x7q0VarM44967g.m90173e();
                arrayList = new ArrayList();
                for (Object obj3 : arrayListM90173e2) {
                    tlw0 tlw0Var4 = (tlw0) obj3;
                    if (((int) (tlw0Var4.m81079b() >> 32)) >= f) {
                        yukVar2 = yukVar3;
                        if (((int) (tlw0Var4.m81079b() >> 32)) + ((int) (tlw0Var4.m81080c() >> 32)) <= f2) {
                            arrayList.add(obj3);
                        }
                    } else {
                        yukVar2 = yukVar3;
                    }
                    yukVar3 = yukVar2;
                }
                yukVar = yukVar3;
            }
            if (arrayList.isEmpty()) {
                arrayList = gjv0Var.m44967g().m90173e();
            }
            ArrayList arrayList2 = arrayList;
            int iOrdinal6 = xmy0Var2.ordinal();
            if (iOrdinal6 == 0) {
                xmy0Var3 = xmy0.f263468b;
            } else {
                if (iOrdinal6 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                xmy0Var3 = xmy0.f263467a;
            }
            tlw0 tlw0VarM83407c = m83407c(ulw0Var, tiv0VarM71834h, arrayList2, xmy0Var3, null, 8);
            if (tlw0VarM83407c == null) {
                y3w0 y3w0Var = new y3w0(11, ulw0Var, tlw0VarM83408d);
                int iOrdinal7 = xmy0Var2.ordinal();
                if (iOrdinal7 == 0) {
                    Iterator it = arrayList2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((Boolean) y3w0Var.invoke(next)).booleanValue());
                    tlw0Var = (tlw0) next;
                } else {
                    if (iOrdinal7 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!((Boolean) y3w0Var.invoke(objPrevious)).booleanValue());
                    tlw0Var = (tlw0) objPrevious;
                }
                tlw0VarM83407c = tlw0Var;
            }
            tlw0 tlw0Var5 = tlw0VarM83407c;
            if (tlw0Var5 == null) {
                lsi0Var.mo54249c(null);
                return w2a1Var;
            }
            fbk fbkVar = null;
            int iOrdinal8 = xmy0Var2.ordinal();
            if (iOrdinal8 != 0) {
                if (iOrdinal8 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:66:0x015a A[Catch: all -> 0x01ac, TRY_LEAVE, TryCatch #6 {all -> 0x01ac, blocks: (B:64:0x0150, B:66:0x015a), top: B:99:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0 A[Catch: all -> 0x01aa, TryCatch #5 {all -> 0x01aa, blocks: (B:68:0x0182, B:75:0x01ba, B:74:0x01b0), top: B:97:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX INFO: renamed from: b */
    public static final Object m83406b(ulw0 ulw0Var, tlw0 tlw0Var, tlw0 tlw0Var2, ibk ibkVar) {
        plw0 plw0Var;
        jsi0 jsi0Var;
        tlw0 tlw0Var3;
        tlw0 tlw0Var4;
        int i;
        ?? r2;
        tlw0 tlw0Var5;
        int i2;
        tlw0 tlw0Var6;
        jsi0 jsi0Var2;
        jsi0 jsi0Var3;
        tlw0 tlw0Var7;
        int i3;
        xh00 xh00Var;
        xuk xukVar;
        tw70 tw70Var;
        tw70 tw70Var2;
        tlw0 tlw0Var8;
        y350 y350Var;
        a7s0 a7s0Var;
        Object obj;
        Object obj2;
        ?? r3;
        jsi0 jsi0Var4;
        gjv0 gjv0Var = ulw0Var.f231655a;
        yum0 yum0Var = ulw0Var.f231671q;
        yum0 yum0Var2 = ulw0Var.f231670p;
        yw70 yw70Var = (yw70) gjv0Var.f80569b;
        if (ibkVar instanceof plw0) {
            plw0Var = (plw0) ibkVar;
            int i4 = plw0Var.f178804h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                plw0Var.f178804h = i4 - Integer.MIN_VALUE;
            } else {
                plw0Var = new plw0(ulw0Var, ibkVar);
            }
        } else {
            plw0Var = new plw0(ulw0Var, ibkVar);
        }
        Object obj3 = plw0Var.f178802f;
        int i5 = plw0Var.f178804h;
        int i6 = 0;
        jsi0 jsi0Var5 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    if (tlw0Var.m81078a() != tlw0Var2.m81078a()) {
                        jsi0Var = ulw0Var.f231665k;
                        tlw0Var3 = tlw0Var;
                        plw0Var.f178797a = tlw0Var3;
                        plw0Var.f178798b = tlw0Var2;
                        plw0Var.f178799c = jsi0Var;
                        plw0Var.f178800d = 0;
                        plw0Var.f178804h = 1;
                        if (jsi0Var.mo54248a(plw0Var) != yukVar) {
                            tlw0Var4 = tlw0Var2;
                            i = 0;
                        }
                        return yukVar;
                    }
                    return w2a1Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        i6 = plw0Var.f178801e;
                        i2 = plw0Var.f178800d;
                        jsi0Var2 = plw0Var.f178799c;
                        tlw0Var6 = plw0Var.f178798b;
                        tlw0Var5 = plw0Var.f178797a;
                        try {
                            bga.m29073P(obj3);
                            jsi0 jsi0Var6 = jsi0Var2;
                            i3 = i2;
                            jsi0Var3 = jsi0Var6;
                            tlw0Var4 = tlw0Var6;
                            tlw0Var7 = tlw0Var5;
                            try {
                                yum0Var2.setValue(new Integer(tlw0Var7.m81078a()));
                                xh00Var = (xh00) ulw0Var.f231658d.getValue();
                                xukVar = ulw0Var.f231656b;
                                tw70Var = tlw0Var7.f221531a;
                                tw70Var2 = tlw0Var4.f221531a;
                                plw0Var.f178797a = tlw0Var7;
                                plw0Var.f178798b = tlw0Var4;
                                plw0Var.f178799c = jsi0Var3;
                                plw0Var.f178800d = i3;
                                plw0Var.f178801e = i6;
                                plw0Var.f178804h = 3;
                                if (xh00Var.mo24818M(xukVar, tw70Var, tw70Var2, plw0Var) != yukVar) {
                                    tlw0Var8 = tlw0Var4;
                                    jsi0Var5 = jsi0Var3;
                                    jsi0Var5 = tw70Var;
                                    if (tlw0Var8.m81078a() > tlw0Var7.m81078a()) {
                                        long jM81079b = tlw0Var8.m81079b();
                                        long jM81080c = tlw0Var8.m81080c();
                                        long j = (((long) (((int) (jM81079b & 4294967295L)) + ((int) (jM81080c & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM81080c >> 32)) + ((int) (jM81079b >> 32)))) << 32);
                                        long jM81080c2 = tlw0Var7.m81080c();
                                        y350Var = new y350((((long) (((int) (j & 4294967295L)) - ((int) (jM81080c2 & 4294967295L)))) & 4294967295L) | (((long) (((int) (j >> 32)) - ((int) (jM81080c2 >> 32)))) << 32));
                                    } else {
                                        y350Var = new y350(tlw0Var8.m81079b());
                                    }
                                    yum0Var.setValue(y350Var);
                                    a7s0Var = new a7s0(ulw0Var, (fbk) null, 24);
                                    plw0Var.f178797a = null;
                                    plw0Var.f178798b = null;
                                    plw0Var.f178799c = jsi0Var5;
                                    plw0Var.f178800d = i3;
                                    plw0Var.f178801e = i6;
                                    plw0Var.f178804h = 4;
                                    if (s1h1.m76978s(1000L, a7s0Var, plw0Var) != yukVar) {
                                        jsi0Var3 = jsi0Var5;
                                        obj = null;
                                    }
                                }
                                return yukVar;
                            } catch (Throwable th) {
                                th = th;
                                r2 = jsi0Var3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            jsi0Var4 = jsi0Var2;
                        }
                    } else if (i5 == 3) {
                        int i7 = plw0Var.f178801e;
                        i3 = plw0Var.f178800d;
                        jsi0 jsi0Var7 = plw0Var.f178799c;
                        tlw0Var8 = plw0Var.f178798b;
                        tlw0Var7 = plw0Var.f178797a;
                        try {
                            bga.m29073P(obj3);
                            i6 = i7;
                            jsi0Var5 = jsi0Var7;
                            try {
                                try {
                                    if (tlw0Var8.m81078a() > tlw0Var7.m81078a()) {
                                        long jM81079b2 = tlw0Var8.m81079b();
                                        long jM81080c3 = tlw0Var8.m81080c();
                                        long j2 = (((long) (((int) (jM81079b2 & 4294967295L)) + ((int) (jM81080c3 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM81080c3 >> 32)) + ((int) (jM81079b2 >> 32)))) << 32);
                                        long jM81080c4 = tlw0Var7.m81080c();
                                        y350Var = new y350((((long) (((int) (j2 & 4294967295L)) - ((int) (jM81080c4 & 4294967295L)))) & 4294967295L) | (((long) (((int) (j2 >> 32)) - ((int) (jM81080c4 >> 32)))) << 32));
                                    } else {
                                        y350Var = new y350(tlw0Var8.m81079b());
                                    }
                                    yum0Var.setValue(y350Var);
                                    a7s0Var = new a7s0(ulw0Var, (fbk) null, 24);
                                    plw0Var.f178797a = null;
                                    plw0Var.f178798b = null;
                                    plw0Var.f178799c = jsi0Var5;
                                    plw0Var.f178800d = i3;
                                    plw0Var.f178801e = i6;
                                    plw0Var.f178804h = 4;
                                    if (s1h1.m76978s(1000L, a7s0Var, plw0Var) != yukVar) {
                                        jsi0Var3 = jsi0Var5;
                                        obj = null;
                                    }
                                    return yukVar;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r2 = jsi0Var5;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r2 = jsi0Var5;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            jsi0Var4 = jsi0Var7;
                        }
                    } else {
                        if (i5 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jsi0Var4 = plw0Var.f178799c;
                        try {
                            bga.m29073P(obj3);
                            obj = null;
                            jsi0Var3 = jsi0Var4;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    obj2 = null;
                    r3 = jsi0Var4;
                    r3.mo54249c(obj2);
                    throw th;
                }
                int i8 = plw0Var.f178800d;
                jsi0 jsi0Var8 = plw0Var.f178799c;
                tlw0Var4 = plw0Var.f178798b;
                tlw0 tlw0Var9 = plw0Var.f178797a;
                bga.m29073P(obj3);
                i = i8;
                tlw0Var3 = tlw0Var9;
                jsi0Var = jsi0Var8;
                yum0Var2.setValue(obj);
                yum0Var.setValue(obj);
                jsi0Var3.mo54249c(obj);
                return w2a1Var;
                if (!((Boolean) ulw0Var.f231667m.getValue()).booleanValue()) {
                    jsi0Var.mo54249c(null);
                    return w2a1Var;
                }
                if (tlw0Var3.m81078a() == ((vum0) yw70Var.f276892e.f191124b).m86437v() || tlw0Var4.m81078a() == ((vum0) yw70Var.f276892e.f191124b).m86437v()) {
                    int iM86437v = ((vum0) yw70Var.f276892e.f191124b).m86437v();
                    int iM86437v2 = ((vum0) yw70Var.f276892e.f191125c).m86437v();
                    plw0Var.f178797a = tlw0Var3;
                    plw0Var.f178798b = tlw0Var4;
                    plw0Var.f178799c = jsi0Var;
                    plw0Var.f178800d = i;
                    plw0Var.f178801e = 0;
                    plw0Var.f178804h = 2;
                    yw70Var.m94781j(iM86437v, iM86437v2);
                    if (w2a1Var != yukVar) {
                        tlw0Var5 = tlw0Var3;
                        i2 = i;
                        tlw0Var6 = tlw0Var4;
                        jsi0Var2 = jsi0Var;
                        jsi0 jsi0Var9 = jsi0Var2;
                        i3 = i2;
                        jsi0Var3 = jsi0Var9;
                        tlw0Var4 = tlw0Var6;
                        tlw0Var7 = tlw0Var5;
                        yum0Var2.setValue(new Integer(tlw0Var7.m81078a()));
                        xh00Var = (xh00) ulw0Var.f231658d.getValue();
                        xukVar = ulw0Var.f231656b;
                        tw70Var = tlw0Var7.f221531a;
                        tw70Var2 = tlw0Var4.f221531a;
                        plw0Var.f178797a = tlw0Var7;
                        plw0Var.f178798b = tlw0Var4;
                        plw0Var.f178799c = jsi0Var3;
                        plw0Var.f178800d = i3;
                        plw0Var.f178801e = i6;
                        plw0Var.f178804h = 3;
                        if (xh00Var.mo24818M(xukVar, tw70Var, tw70Var2, plw0Var) != yukVar) {
                            tlw0Var8 = tlw0Var4;
                            jsi0Var5 = jsi0Var3;
                            jsi0Var5 = tw70Var;
                            if (tlw0Var8.m81078a() > tlw0Var7.m81078a()) {
                                long jM81079b3 = tlw0Var8.m81079b();
                                long jM81080c5 = tlw0Var8.m81080c();
                                long j3 = (((long) (((int) (jM81079b3 & 4294967295L)) + ((int) (jM81080c5 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM81080c5 >> 32)) + ((int) (jM81079b3 >> 32)))) << 32);
                                long jM81080c6 = tlw0Var7.m81080c();
                                y350Var = new y350((((long) (((int) (j3 & 4294967295L)) - ((int) (jM81080c6 & 4294967295L)))) & 4294967295L) | (((long) (((int) (j3 >> 32)) - ((int) (jM81080c6 >> 32)))) << 32));
                            } else {
                                y350Var = new y350(tlw0Var8.m81079b());
                            }
                            yum0Var.setValue(y350Var);
                            a7s0Var = new a7s0(ulw0Var, (fbk) null, 24);
                            plw0Var.f178797a = null;
                            plw0Var.f178798b = null;
                            plw0Var.f178799c = jsi0Var5;
                            plw0Var.f178800d = i3;
                            plw0Var.f178801e = i6;
                            plw0Var.f178804h = 4;
                            if (s1h1.m76978s(1000L, a7s0Var, plw0Var) != yukVar) {
                                jsi0Var3 = jsi0Var5;
                                obj = null;
                                yum0Var2.setValue(obj);
                                yum0Var.setValue(obj);
                                jsi0Var3.mo54249c(obj);
                                return w2a1Var;
                            }
                        }
                    }
                } else {
                    jsi0Var3 = jsi0Var;
                    tlw0Var7 = tlw0Var3;
                    i3 = i;
                    yum0Var2.setValue(new Integer(tlw0Var7.m81078a()));
                    xh00Var = (xh00) ulw0Var.f231658d.getValue();
                    xukVar = ulw0Var.f231656b;
                    tw70Var = tlw0Var7.f221531a;
                    tw70Var2 = tlw0Var4.f221531a;
                    plw0Var.f178797a = tlw0Var7;
                    plw0Var.f178798b = tlw0Var4;
                    plw0Var.f178799c = jsi0Var3;
                    plw0Var.f178800d = i3;
                    plw0Var.f178801e = i6;
                    plw0Var.f178804h = 3;
                    if (xh00Var.mo24818M(xukVar, tw70Var, tw70Var2, plw0Var) != yukVar) {
                        tlw0Var8 = tlw0Var4;
                        jsi0Var5 = jsi0Var3;
                        jsi0Var5 = tw70Var;
                        if (tlw0Var8.m81078a() > tlw0Var7.m81078a()) {
                            long jM81079b4 = tlw0Var8.m81079b();
                            long jM81080c7 = tlw0Var8.m81080c();
                            long j4 = (((long) (((int) (jM81079b4 & 4294967295L)) + ((int) (jM81080c7 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM81080c7 >> 32)) + ((int) (jM81079b4 >> 32)))) << 32);
                            long jM81080c8 = tlw0Var7.m81080c();
                            y350Var = new y350((((long) (((int) (j4 & 4294967295L)) - ((int) (jM81080c8 & 4294967295L)))) & 4294967295L) | (((long) (((int) (j4 >> 32)) - ((int) (jM81080c8 >> 32)))) << 32));
                        } else {
                            y350Var = new y350(tlw0Var8.m81079b());
                        }
                        yum0Var.setValue(y350Var);
                        a7s0Var = new a7s0(ulw0Var, (fbk) null, 24);
                        plw0Var.f178797a = null;
                        plw0Var.f178798b = null;
                        plw0Var.f178799c = jsi0Var5;
                        plw0Var.f178800d = i3;
                        plw0Var.f178801e = i6;
                        plw0Var.f178804h = 4;
                        if (s1h1.m76978s(1000L, a7s0Var, plw0Var) != yukVar) {
                            jsi0Var3 = jsi0Var5;
                            obj = null;
                            yum0Var2.setValue(obj);
                            yum0Var.setValue(obj);
                            jsi0Var3.mo54249c(obj);
                            return w2a1Var;
                        }
                    }
                }
                return yukVar;
            } catch (Throwable th7) {
                th = th7;
                r2 = jsi0Var;
            }
            obj2 = null;
            r3 = r2;
            r3.mo54249c(obj2);
            throw th;
        } catch (CancellationException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static tlw0 m83407c(ulw0 ulw0Var, tiv0 tiv0Var, ArrayList arrayList, xmy0 xmy0Var, gnv0 gnv0Var, int i) {
        if ((i & 4) != 0) {
            xmy0Var = xmy0.f263468b;
        }
        Object obj = gnv0Var;
        if ((i & 8) != 0) {
            obj = gkw0.f80942d;
        }
        ulw0Var.getClass();
        jkw0 jkw0Var = new jkw0(ulw0Var, tiv0Var, obj, 1);
        int iOrdinal = xmy0Var.ordinal();
        Object obj2 = null;
        if (iOrdinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((Boolean) jkw0Var.invoke(objPrevious)).booleanValue()) {
                    obj2 = objPrevious;
                    break;
                }
            }
            return (tlw0) obj2;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        for (Object obj3 : arrayList) {
            if (((Boolean) jkw0Var.invoke(obj3)).booleanValue()) {
                obj2 = obj3;
                break;
            }
        }
        return (tlw0) obj2;
    }

    /* JADX INFO: renamed from: d */
    public final tlw0 m83408d() {
        Object value = this.f231666l.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        for (Object obj2 : this.f231655a.m44967g().m90173e()) {
            if (((tlw0) obj2).f221531a.f224336l.equals(value)) {
                obj = obj2;
                break;
            }
        }
        return (tlw0) obj;
    }

    /* JADX INFO: renamed from: e */
    public final long m83409e() {
        long jM81079b;
        tlw0 tlw0VarM83408d = m83408d();
        if (tlw0VarM83408d == null) {
            return 0L;
        }
        int iM81078a = tlw0VarM83408d.m81078a();
        yum0 yum0Var = this.f231670p;
        Integer num = (Integer) yum0Var.getValue();
        yum0 yum0Var2 = this.f231671q;
        if (num == null || iM81078a != num.intValue() || ((Integer) yum0Var.getValue()) == null) {
            yum0Var.setValue(null);
            yum0Var2.setValue(null);
            jM81079b = tlw0VarM83408d.m81079b();
        } else {
            y350 y350Var = (y350) yum0Var2.getValue();
            jM81079b = y350Var != null ? y350Var.f268755a : tlw0VarM83408d.m81079b();
        }
        long j = ((Offset) this.f231668n.getValue()).f493a;
        long j2 = ((y350) this.f231669o.getValue()).f268755a;
        long jM83412h = m83412h(Offset.m256f((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32), (((long) Float.floatToRawIntBits((int) (jM81079b & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jM81079b >> 32))) << 32)));
        m83413i(jM83412h);
        return Offset.m257g(j, jM83412h);
    }

    /* JADX INFO: renamed from: f */
    public final vvl0 m83410f() {
        return this.f231655a.m44967g().m90171c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m83411g(Object obj, long j, ibk ibkVar) {
        rlw0 rlw0Var;
        Object next;
        tlw0 tlw0Var;
        long j2;
        if (ibkVar instanceof rlw0) {
            rlw0Var = (rlw0) ibkVar;
            int i = rlw0Var.f200386f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlw0Var.f200386f = i - Integer.MIN_VALUE;
            } else {
                rlw0Var = new rlw0(this, ibkVar);
            }
        } else {
            rlw0Var = new rlw0(this, ibkVar);
        }
        Object obj2 = rlw0Var.f200384d;
        int i2 = rlw0Var.f200386f;
        if (i2 == 0) {
            bga.m29073P(obj2);
            gjv0 gjv0Var = this.f231655a;
            Iterator it = gjv0Var.m44967g().m90173e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((tlw0) next).f221531a.f224336l.equals(obj));
            tlw0Var = (tlw0) next;
            if (tlw0Var != null) {
                long jM81079b = tlw0Var.m81079b();
                int iOrdinal = m83410f().ordinal();
                if (iOrdinal == 0) {
                    j2 = jM81079b & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = jM81079b >> 32;
                }
                int i3 = (int) j2;
                if (i3 < 0) {
                    pg41 pg41VarM53286y = jg31.m53286y(0.0f, 0.0f, null, 7);
                    rlw0Var.f200381a = obj;
                    rlw0Var.f200382b = tlw0Var;
                    rlw0Var.f200383c = j;
                    rlw0Var.f200386f = 1;
                    Object objM68462g = oyf1.m68462g((yw70) gjv0Var.f80569b, i3, pg41VarM53286y, rlw0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM68462g == yukVar) {
                        return yukVar;
                    }
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = rlw0Var.f200383c;
        tlw0 tlw0Var2 = rlw0Var.f200382b;
        Object obj3 = rlw0Var.f200381a;
        bga.m29073P(obj2);
        tlw0Var = tlw0Var2;
        obj = obj3;
        this.f231666l.setValue(obj);
        this.f231669o.setValue(new y350(tlw0Var.m81079b()));
        this.f231672r = j;
        ((gh00) this.f231657c.getValue()).invoke(obj);
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public final long m83412h(long j) {
        boolean z = ((sw70) this.f231655a.m44967g().f258979b).f214609o;
        if (z) {
            j = bcg1.m28743x(j, m83410f());
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal = m83410f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = this.f231663i.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return bcg1.m28743x(j, vvl0.f245249b);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public final long m83413i(long j) {
        int iOrdinal = this.f231663i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return j;
        }
        throw new NoWhenBranchMatchedException();
    }
}
