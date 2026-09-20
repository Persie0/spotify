package p204p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class iqi0 extends oa31 {

    /* JADX INFO: renamed from: n */
    public static final int[] f104786n = new int[0];

    /* JADX INFO: renamed from: e */
    public final gh00 f104787e;

    /* JADX INFO: renamed from: f */
    public final gh00 f104788f;

    /* JADX INFO: renamed from: g */
    public int f104789g;

    /* JADX INFO: renamed from: h */
    public dqi0 f104790h;

    /* JADX INFO: renamed from: i */
    public ArrayList f104791i;

    /* JADX INFO: renamed from: j */
    public sa31 f104792j;

    /* JADX INFO: renamed from: k */
    public int[] f104793k;

    /* JADX INFO: renamed from: l */
    public int f104794l;

    /* JADX INFO: renamed from: m */
    public boolean f104795m;

    public iqi0(long j, sa31 sa31Var, gh00 gh00Var, gh00 gh00Var2) {
        super(j, sa31Var);
        this.f104787e = gh00Var;
        this.f104788f = gh00Var2;
        this.f104792j = sa31.f207125e;
        this.f104793k = f104786n;
        this.f104794l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m51381A(long j) {
        synchronized (ua31.f228351c) {
            this.f104792j = this.f104792j.m77609f(j);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo28811B(dqi0 dqi0Var) {
        this.f104790h = dqi0Var;
    }

    /* JADX INFO: renamed from: C */
    public iqi0 mo28812C(gh00 gh00Var, gh00 gh00Var2) throws Throwable {
        if (this.f163203c) {
            lfq0.m58913a("Cannot use a disposed snapshot");
        }
        if (this.f104795m && this.f163204d < 0) {
            lfq0.m58914b("Unsupported operation on a disposed or applied snapshot");
        }
        m51381A(mo28818g());
        Object obj = ua31.f228351c;
        synchronized (obj) {
            try {
                long j = ua31.f228353e;
                long j2 = 1;
                ua31.f228353e = j + j2;
                ua31.f228352d = ua31.f228352d.m77609f(j);
                sa31 sa31VarMo28815d = mo28815d();
                mo28825r(sa31VarMo28815d.m77609f(j));
                try {
                    qfj0 qfj0Var = new qfj0(j, ua31.m82668d(sa31VarMo28815d, mo28818g() + j2, j), ua31.m82675k(gh00Var, mo28816e(), true), ua31.m82676l(gh00Var2, mo28820i()), this);
                    if (this.f104795m || this.f163203c) {
                        return qfj0Var;
                    }
                    long jMo28818g = mo28818g();
                    synchronized (obj) {
                        long j3 = ua31.f228353e;
                        ua31.f228353e = j3 + j2;
                        mo28826s(j3);
                        ua31.f228352d = ua31.f228352d.m77609f(mo28818g());
                    }
                    mo28825r(ua31.m82668d(mo28815d(), jMo28818g + j2, mo28818g()));
                    return qfj0Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: b */
    public final void mo51382b() {
        ua31.f228352d = ua31.f228352d.m77606b(mo28818g()).m77605a(this.f104792j);
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: c */
    public void mo28814c() {
        if (this.f163203c) {
            return;
        }
        this.f163203c = true;
        synchronized (ua31.f228351c) {
            m66516o();
        }
        mo28822l();
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: f */
    public boolean mo28817f() {
        return false;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: h */
    public int mo28819h() {
        return this.f104789g;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: i */
    public gh00 mo28820i() {
        return this.f104788f;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: k */
    public void mo28821k() {
        this.f104794l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p204p.oa31
    /* JADX INFO: renamed from: l */
    public void mo28822l() {
        if (this.f104794l <= 0) {
            lfq0.m58913a("no pending nested snapshots");
        }
        int i = this.f104794l - 1;
        this.f104794l = i;
        if (i != 0 || this.f104795m) {
            return;
        }
        dqi0 dqi0VarMo28830x = mo28830x();
        if (dqi0VarMo28830x != null) {
            if (this.f104795m) {
                lfq0.m58914b("Unsupported operation on a snapshot that has been applied");
            }
            mo28811B(null);
            long jMo28818g = mo28818g();
            Object[] objArr = dqi0VarMo28830x.f52019b;
            long[] jArr = dqi0VarMo28830x.f52018a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (ax41 ax41VarMo44200j = ((vw41) objArr[(i2 << 3) + i4]).mo44200j(); ax41VarMo44200j != null; ax41VarMo44200j = ax41VarMo44200j.f20764b) {
                                    long j2 = ax41VarMo44200j.f20763a;
                                    if (j2 == jMo28818g || g6f.m43725i0(this.f104792j, Long.valueOf(j2))) {
                                        u9y0 u9y0Var = ua31.f228349a;
                                        ax41VarMo44200j.f20763a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        m66514a();
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: m */
    public void mo28823m() {
        if (this.f104795m || this.f163203c) {
            return;
        }
        m51384v();
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: n */
    public void mo28824n(vw41 vw41Var) {
        dqi0 dqi0VarMo28830x = mo28830x();
        if (dqi0VarMo28830x == null) {
            dqi0 dqi0Var = sdy0.f208112a;
            dqi0VarMo28830x = new dqi0();
            mo28811B(dqi0VarMo28830x);
        }
        dqi0VarMo28830x.m36642a(vw41Var);
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: p */
    public final void mo51383p() {
        int length = this.f104793k.length;
        for (int i = 0; i < length; i++) {
            ua31.f228354f.m82821i(this.f104793k[i]);
        }
        m66516o();
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: t */
    public void mo28827t(int i) {
        this.f104789g = i;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: u */
    public oa31 mo28828u(gh00 gh00Var) throws Throwable {
        if (this.f163203c) {
            lfq0.m58913a("Cannot use a disposed snapshot");
        }
        if (this.f104795m && this.f163204d < 0) {
            lfq0.m58914b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo28818g = mo28818g();
        m51381A(mo28818g());
        Object obj = ua31.f228351c;
        synchronized (obj) {
            try {
                long j = ua31.f228353e;
                long j2 = 1;
                ua31.f228353e = j + j2;
                ua31.f228352d = ua31.f228352d.m77609f(j);
                try {
                    tfj0 tfj0Var = new tfj0(j, ua31.m82668d(mo28815d(), jMo28818g + j2, j), ua31.m82675k(gh00Var, mo28816e(), true), this);
                    if (this.f104795m || this.f163203c) {
                        return tfj0Var;
                    }
                    long jMo28818g2 = mo28818g();
                    synchronized (obj) {
                        long j3 = ua31.f228353e;
                        ua31.f228353e = j3 + j2;
                        mo28826s(j3);
                        ua31.f228352d = ua31.f228352d.m77609f(mo28818g());
                    }
                    mo28825r(ua31.m82668d(mo28815d(), jMo28818g2 + j2, mo28818g()));
                    return tfj0Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m51384v() {
        long j;
        m51381A(mo28818g());
        if (this.f104795m || this.f163203c) {
            return;
        }
        long jMo28818g = mo28818g();
        synchronized (ua31.f228351c) {
            long j2 = ua31.f228353e;
            j = 1;
            ua31.f228353e = j2 + j;
            mo28826s(j2);
            ua31.f228352d = ua31.f228352d.m77609f(mo28818g());
        }
        mo28825r(ua31.m82668d(mo28815d(), jMo28818g + j, mo28818g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: w */
    public l7l mo28829w() {
        HashMap mapM82666b;
        ?? r3;
        dqi0 dqi0Var;
        long j;
        long j2;
        dqi0 dqi0VarMo28830x = mo28830x();
        if (dqi0VarMo28830x != null) {
            long j3 = ua31.f228358j.f163202b;
            mapM82666b = ua31.m82666b(j3, this, ua31.f228352d.m77606b(j3));
        } else {
            mapM82666b = null;
        }
        lau lauVar = lau.f131415a;
        synchronized (ua31.f228351c) {
            try {
                ua31.m82667c(this);
                if (dqi0VarMo28830x == null || dqi0VarMo28830x.f52021d == 0) {
                    mo51382b();
                    sg10 sg10Var = ua31.f228358j;
                    dqi0 dqi0Var2 = sg10Var.f104790h;
                    ua31.m82685u(sg10Var, ua31.f228349a);
                    if (dqi0Var2 == null || !dqi0Var2.m36649h()) {
                        r3 = lauVar;
                        dqi0Var = null;
                    } else {
                        r3 = ua31.f228356h;
                        dqi0Var = dqi0Var2;
                    }
                } else {
                    sg10 sg10Var2 = ua31.f228358j;
                    l7l l7lVarM51385z = m51385z(ua31.f228353e, dqi0VarMo28830x, mapM82666b, ua31.f228352d.m77606b(sg10Var2.f163202b));
                    if (!l7lVarM51385z.equals(qa31.f186735e)) {
                        return l7lVarM51385z;
                    }
                    mo51382b();
                    dqi0Var = sg10Var2.f104790h;
                    ua31.m82685u(sg10Var2, ua31.f228349a);
                    mo28811B(null);
                    sg10Var2.f104790h = null;
                    r3 = ua31.f228356h;
                }
                this.f104795m = true;
                if (dqi0Var != null) {
                    tdy0 tdy0VarM62930p = mvf1.m62930p(dqi0Var);
                    if (!tdy0VarM62930p.f219529a.m36648g()) {
                        int size = r3.size();
                        for (int i = 0; i < size; i++) {
                            ((th00) r3.get(i)).invoke(tdy0VarM62930p, this);
                        }
                    }
                }
                if (dqi0VarMo28830x != null && dqi0VarMo28830x.m36649h()) {
                    tdy0 tdy0VarM62930p2 = mvf1.m62930p(dqi0VarMo28830x);
                    int size2 = r3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((th00) r3.get(i2)).invoke(tdy0VarM62930p2, this);
                    }
                }
                synchronized (ua31.f228351c) {
                    try {
                        mo51383p();
                        ua31.m82670f();
                        if (dqi0Var != null) {
                            Object[] objArr = dqi0Var.f52019b;
                            long[] jArr = dqi0Var.f52018a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                ua31.m82681q((vw41) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (dqi0VarMo28830x != null) {
                            Object[] objArr2 = dqi0VarMo28830x.f52019b;
                            long[] jArr2 = dqi0VarMo28830x.f52018a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                ua31.m82681q((vw41) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f104791i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                ua31.m82681q((vw41) arrayList.get(i9));
                            }
                        }
                        this.f104791i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qa31.f186735e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public dqi0 mo28830x() {
        return this.f104790h;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public gh00 mo28816e() {
        return this.f104787e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a5 A[LOOP:3: B:79:0x01a3->B:80:0x01a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final l7l m51385z(long j, dqi0 dqi0Var, HashMap map, sa31 sa31Var) {
        ArrayList arrayList;
        ArrayList arrayListM43700N0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        vw41 vw41Var;
        ax41 ax41Var;
        sa31 sa31Var2;
        Object[] objArr;
        long[] jArr;
        sa31 sa31Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        ax41 ax41VarMo63800u;
        sa31 sa31VarM77608e = mo28815d().m77609f(mo28818g()).m77608e(this.f104792j);
        Object[] objArr3 = dqi0Var.f52019b;
        long[] jArr3 = dqi0Var.f52018a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListM43700N0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            vw41 vw41Var2 = (vw41) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            ax41 ax41VarMo44200j = vw41Var2.mo44200j();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            ax41 ax41VarM82683s = ua31.m82683s(ax41VarMo44200j, j, sa31Var);
                            if (ax41VarM82683s == null) {
                                sa31Var3 = sa31VarM77608e;
                                arrayList4 = arrayListM43700N0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListM43700N0;
                                j2 = j3;
                                ax41 ax41VarM82683s2 = ua31.m82683s(ax41VarMo44200j, mo28818g(), sa31VarM77608e);
                                if (ax41VarM82683s2 == null) {
                                    sa31Var3 = sa31VarM77608e;
                                } else {
                                    sa31Var3 = sa31VarM77608e;
                                    if (ax41VarM82683s2.f20763a != 1 && !ax41VarM82683s.equals(ax41VarM82683s2)) {
                                        ax41 ax41VarM82683s3 = ua31.m82683s(ax41VarMo44200j, mo28818g(), mo28815d());
                                        if (ax41VarM82683s3 == null) {
                                            ua31.m82682r();
                                            throw null;
                                        }
                                        if (map == null || (ax41VarMo63800u = (ax41) map.get(ax41VarM82683s)) == null) {
                                            ax41VarMo63800u = vw41Var2.mo63800u(ax41VarM82683s2, ax41VarM82683s, ax41VarM82683s3);
                                        }
                                        if (ax41VarMo63800u == null) {
                                            return new pa31(this);
                                        }
                                        if (!ax41VarMo63800u.equals(ax41VarM82683s3)) {
                                            if (ax41VarMo63800u.equals(ax41VarM82683s)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(pft0.m69840u(vw41Var2, ax41VarM82683s.mo27361c(mo28818g())));
                                                arrayListM43700N0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListM43700N0.add(vw41Var2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!ax41VarMo63800u.equals(ax41VarM82683s2) ? pft0.m69840u(vw41Var2, ax41VarMo63800u) : pft0.m69840u(vw41Var2, ax41VarM82683s2.mo27361c(mo28818g())));
                                            }
                                        }
                                        arrayListM43700N0 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListM43700N0 = arrayList4;
                        } else {
                            sa31Var3 = sa31VarM77608e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        sa31VarM77608e = sa31Var3;
                    }
                    sa31Var2 = sa31VarM77608e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    sa31Var2 = sa31VarM77608e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    sa31VarM77608e = sa31Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                m51384v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    pqm0 pqm0Var = (pqm0) arrayList2.get(i2);
                    vw41Var = (vw41) pqm0Var.f180350a;
                    ax41Var = (ax41) pqm0Var.f180351b;
                    ax41Var.f20763a = j;
                    synchronized (ua31.f228351c) {
                        ax41Var.f20764b = vw41Var.mo44200j();
                        vw41Var.mo44202q(ax41Var);
                    }
                }
            }
            if (arrayListM43700N0 != null) {
                size = arrayListM43700N0.size();
                for (i = 0; i < size; i++) {
                    dqi0Var.m36653l((vw41) arrayListM43700N0.get(i));
                }
                arrayList3 = this.f104791i;
                if (arrayList3 != null) {
                    arrayListM43700N0 = g6f.m43700N0(arrayListM43700N0, arrayList3);
                }
                this.f104791i = arrayListM43700N0;
            }
            return qa31.f186735e;
        }
        arrayList = null;
        arrayListM43700N0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m51384v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                pqm0 pqm0Var2 = (pqm0) arrayList2.get(i2);
                vw41Var = (vw41) pqm0Var2.f180350a;
                ax41Var = (ax41) pqm0Var2.f180351b;
                ax41Var.f20763a = j;
                synchronized (ua31.f228351c) {
                    ax41Var.f20764b = vw41Var.mo44200j();
                    vw41Var.mo44202q(ax41Var);
                }
            }
        }
        if (arrayListM43700N0 != null) {
            size = arrayListM43700N0.size();
            while (i < size) {
                dqi0Var.m36653l((vw41) arrayListM43700N0.get(i));
            }
            arrayList3 = this.f104791i;
            if (arrayList3 != null) {
                arrayListM43700N0 = g6f.m43700N0(arrayListM43700N0, arrayList3);
            }
            this.f104791i = arrayListM43700N0;
        }
        return qa31.f186735e;
    }
}
