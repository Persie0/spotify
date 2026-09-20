package p204p;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class msh implements qgv0, gsh {

    /* JADX INFO: renamed from: L0 */
    public cqi0 f146778L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f146779M0;

    /* JADX INFO: renamed from: N0 */
    public ej11 f146780N0;

    /* JADX INFO: renamed from: O0 */
    public ldn0 f146781O0;

    /* JADX INFO: renamed from: P0 */
    public msh f146782P0;

    /* JADX INFO: renamed from: Q0 */
    public int f146783Q0;

    /* JADX INFO: renamed from: R0 */
    public final C1668ai f146784R0;

    /* JADX INFO: renamed from: S0 */
    public final u12 f146785S0;

    /* JADX INFO: renamed from: T0 */
    public final xq00 f146786T0;

    /* JADX INFO: renamed from: U0 */
    public int f146787U0;

    /* JADX INFO: renamed from: X */
    public final dkc f146788X;

    /* JADX INFO: renamed from: Y */
    public final dkc f146789Y;

    /* JADX INFO: renamed from: Z */
    public final cqi0 f146790Z;

    /* JADX INFO: renamed from: a */
    public final hsh f146791a;

    /* JADX INFO: renamed from: b */
    public final ug5 f146792b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f146793c = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final Object f146794d = new Object();

    /* JADX INFO: renamed from: e */
    public final fqi0 f146795e;

    /* JADX INFO: renamed from: f */
    public final ou21 f146796f;

    /* JADX INFO: renamed from: g */
    public final cqi0 f146797g;

    /* JADX INFO: renamed from: h */
    public final dqi0 f146798h;

    /* JADX INFO: renamed from: i */
    public final dqi0 f146799i;

    /* JADX INFO: renamed from: t */
    public final cqi0 f146800t;

    public msh(hsh hshVar, ug5 ug5Var) {
        this.f146791a = hshVar;
        this.f146792b = ug5Var;
        fqi0 fqi0Var = new fqi0(new dqi0());
        this.f146795e = fqi0Var;
        ou21 ou21Var = new ou21();
        if (hshVar.mo48463e()) {
            ou21Var.f170145X = new toi0();
        }
        if (hshVar.mo48465g()) {
            ou21Var.m68077b();
        }
        this.f146796f = ou21Var;
        this.f146797g = y85.m93063h();
        this.f146798h = new dqi0();
        this.f146799i = new dqi0();
        this.f146800t = y85.m93063h();
        dkc dkcVar = new dkc();
        this.f146788X = dkcVar;
        dkc dkcVar2 = new dkc();
        this.f146789Y = dkcVar2;
        this.f146790Z = y85.m93063h();
        this.f146778L0 = y85.m93063h();
        C1668ai c1668ai = new C1668ai(hshVar);
        this.f146784R0 = c1668ai;
        this.f146785S0 = new u12();
        xq00 xq00Var = new xq00(ug5Var, hshVar, qu21.m73870d(ou21Var), fqi0Var, dkcVar, dkcVar2, c1668ai, this);
        hshVar.mo48478t(xq00Var);
        this.f146786T0 = xq00Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m62743A(th00 th00Var) {
        boolean zM62755l = m62755l();
        m62762s();
        hsh hshVar = this.f146791a;
        if (!zM62755l) {
            hshVar.mo48459a(this, th00Var);
            return;
        }
        xq00 xq00Var = this.f146786T0;
        xq00Var.f264836z = 0;
        xq00Var.f264835y = true;
        hshVar.mo48459a(this, th00Var);
        xq00Var.m91798w();
    }

    @Override // p204p.qgv0
    /* JADX INFO: renamed from: a */
    public final void mo62744a() {
        this.f146779M0 = true;
        this.f146784R0.m26044w();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.qgv0
    /* JADX INFO: renamed from: b */
    public final void mo62745b(Object obj) {
        pgv0 pgv0VarM91734D;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        xq00 xq00Var = this.f146786T0;
        if (xq00Var.f264790A <= 0 && (pgv0VarM91734D = xq00Var.m91734D()) != null) {
            pgv0VarM91734D.m69930g();
            boolean z4 = true;
            if ((pgv0VarM91734D.f177417b & 32) == 0) {
                fpi0 fpi0Var = pgv0VarM91734D.f177421f;
                if (fpi0Var == null) {
                    fpi0Var = new fpi0();
                    pgv0VarM91734D.f177421f = fpi0Var;
                }
                int i2 = pgv0VarM91734D.f177420e;
                int iM42374c = fpi0Var.m42374c(obj);
                if (iM42374c < 0) {
                    iM42374c = ~iM42374c;
                    i = -1;
                } else {
                    i = fpi0Var.f71879c[iM42374c];
                }
                fpi0Var.f71878b[iM42374c] = obj;
                fpi0Var.f71879c[iM42374c] = i2;
                if (i == pgv0VarM91734D.f177420e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.f146784R0.m26044w();
            if (z) {
                return;
            }
            if (obj instanceof ww41) {
                ((ww41) obj).m89171m(1);
            }
            y85.m93060e(this.f146797g, obj, pgv0VarM91734D);
            if (obj instanceof rtq) {
                rtq rtqVar = (rtq) obj;
                qtq qtqVarM76400w = rtqVar.m76400w();
                cqi0 cqi0Var = this.f146800t;
                y85.m93045B(cqi0Var, obj);
                fpi0 fpi0Var2 = qtqVarM76400w.f192440e;
                Object[] objArr = fpi0Var2.f71878b;
                long[] jArr = fpi0Var2.f71877a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    vw41 vw41Var = (vw41) objArr[(i3 << 3) + i6];
                                    if (vw41Var instanceof ww41) {
                                        z3 = true;
                                        ((ww41) vw41Var).m89171m(1);
                                    } else {
                                        z3 = true;
                                    }
                                    y85.m93060e(cqi0Var, vw41Var, obj);
                                } else {
                                    z3 = z4;
                                }
                                j >>= i4;
                                i6++;
                                z4 = z3;
                                i4 = i4;
                            }
                            z2 = z4;
                            if (i5 != i4) {
                                break;
                            }
                        } else {
                            z2 = z4;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        z4 = z2;
                    }
                }
                Object obj2 = qtqVarM76400w.f192441f;
                cqi0 cqi0Var2 = pgv0VarM91734D.f177422g;
                if (cqi0Var2 == null) {
                    cqi0Var2 = new cqi0();
                    pgv0VarM91734D.f177422g = cqi0Var2;
                }
                cqi0Var2.m33629m(rtqVar, obj2);
            }
        }
    }

    @Override // p204p.qgv0
    /* JADX INFO: renamed from: c */
    public final int mo62746c(pgv0 pgv0Var, Object obj) {
        msh mshVar;
        int i = pgv0Var.f177417b;
        if ((i & 2) != 0) {
            pgv0Var.f177417b = i | 4;
        }
        rq00 rq00Var = pgv0Var.f177418c;
        if (rq00Var == null || !rq00Var.m76206a()) {
            return 1;
        }
        ou21 ou21Var = this.f146796f;
        ou21Var.getClass();
        rq00 rq00Var2 = pgv0Var.f177418c;
        if (rq00Var2 != null && ou21Var.m68081j(qkg1.m73117n(rq00Var2))) {
            if (pgv0Var.f177419d == null) {
                return 1;
            }
            int iM62764u = m62764u(pgv0Var, rq00Var, obj);
            if (iM62764u != 1) {
                this.f146784R0.m26044w();
            }
            return iM62764u;
        }
        synchronized (this.f146794d) {
            mshVar = this.f146782P0;
        }
        if (mshVar != null) {
            xq00 xq00Var = mshVar.f146786T0;
            if (xq00Var.f264795F && xq00Var.m91783o0(pgv0Var, obj)) {
                return 4;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m62747d() {
        this.f146793c.set(null);
        this.f146788X.m36265q();
        this.f146789Y.m36265q();
        fqi0 fqi0Var = this.f146795e;
        if (fqi0Var.f72224a.m36648g()) {
            return;
        }
        u12 u12Var = this.f146785S0;
        try {
            u12Var.m82162J(fqi0Var, this.f146786T0.m91736F());
            u12Var.m82182q();
        } finally {
            u12Var.m82175i();
        }
    }

    @Override // p204p.gsh
    public final void dispose() {
        synchronized (this.f146794d) {
            try {
                if (this.f146786T0.f264795F) {
                    lfq0.m58914b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f146787U0 != 3) {
                    this.f146787U0 = 3;
                    dkc dkcVar = this.f146786T0.f264801L;
                    if (dkcVar != null) {
                        m62751h(dkcVar);
                    }
                    boolean z = this.f146796f.f170147b == 0;
                    if (!z || !this.f146795e.f72224a.m36648g()) {
                        u12 u12Var = this.f146785S0;
                        try {
                            u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                            if (!z) {
                                this.f146792b.getClass();
                                ou21 ou21Var = this.f146796f;
                                u12 u12Var2 = this.f146785S0;
                                wu21 wu21VarM68080i = ou21Var.m68080i();
                                try {
                                    wu21VarM68080i.m88999n(wu21VarM68080i.f255089t, new nk4(u12Var2, 1));
                                    wu21VarM68080i.m88972J();
                                    wu21VarM68080i.m88991e(true);
                                    this.f146792b.clear();
                                    this.f146792b.mo53946j();
                                    u12Var.m82183r();
                                } catch (Throwable th) {
                                    wu21VarM68080i.m88991e(false);
                                    throw th;
                                }
                            }
                            u12Var.m82182q();
                            u12Var.m82175i();
                        } catch (Throwable th2) {
                            u12Var.m82175i();
                            throw th2;
                        }
                    }
                    xq00 xq00Var = this.f146786T0;
                    xq00Var.getClass();
                    th1.m80803e("Compose:Composer.dispose");
                    try {
                        xq00Var.f264812b.mo48483y(xq00Var);
                        xq00Var.f264794E.clear();
                        xq00Var.f264829s.clear();
                        xq00Var.f264815e.m36265q();
                        xq00Var.f264832v = null;
                        xq00Var.f264811a.clear();
                        th1.m80805g();
                    } catch (Throwable th3) {
                        th1.m80805g();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f146791a.mo48484z(this);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX INFO: renamed from: e */
    public final void m62748e(Object obj, boolean z) {
        int i;
        Object objM33623g = this.f146797g.m33623g(obj);
        if (objM33623g == null) {
            return;
        }
        boolean z2 = objM33623g instanceof dqi0;
        dqi0 dqi0Var = this.f146798h;
        dqi0 dqi0Var2 = this.f146799i;
        cqi0 cqi0Var = this.f146790Z;
        if (!z2) {
            pgv0 pgv0Var = (pgv0) objM33623g;
            if (y85.m93044A(cqi0Var, obj, pgv0Var) || pgv0Var.m69926c(obj) == 1) {
                return;
            }
            if (pgv0Var.f177422g == null || z) {
                dqi0Var.m36642a(pgv0Var);
                return;
            } else {
                dqi0Var2.m36642a(pgv0Var);
                return;
            }
        }
        dqi0 dqi0Var3 = (dqi0) objM33623g;
        Object[] objArr = dqi0Var3.f52019b;
        long[] jArr = dqi0Var3.f52018a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        pgv0 pgv0Var2 = (pgv0) objArr[(i2 << 3) + i5];
                        if (y85.m93044A(cqi0Var, obj, pgv0Var2)) {
                            i = i3;
                        } else {
                            i = i3;
                            if (pgv0Var2.m69926c(obj) != 1) {
                                if (pgv0Var2.f177422g == null || z) {
                                    dqi0Var.m36642a(pgv0Var2);
                                } else {
                                    dqi0Var2.m36642a(pgv0Var2);
                                }
                            }
                        }
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0233 A[LOOP:6: B:94:0x01df->B:111:0x0233, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0240 A[EDGE_INSN: B:204:0x0240->B:113:0x0240 BREAK  A[LOOP:6: B:94:0x01df->B:111:0x0233], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0122 A[EDGE_INSN: B:224:0x0122->B:219:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    /* JADX INFO: renamed from: f */
    public final void m62749f(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM36644c;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean zM36648g;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i3;
        int i4;
        boolean z2 = set instanceof tdy0;
        cqi0 cqi0Var = this.f146800t;
        Object obj = null;
        int i5 = 8;
        if (z2) {
            dqi0 dqi0Var = ((tdy0) set).f219529a;
            Object[] objArr = dqi0Var.f52019b;
            long[] jArr8 = dqi0Var.f52018a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr8[i6];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c2 = c3;
                                if (obj2 instanceof pgv0) {
                                    ((pgv0) obj2).m69926c(obj);
                                } else {
                                    m62748e(obj2, z);
                                    Object objM33623g = cqi0Var.m33623g(obj2);
                                    if (objM33623g != null) {
                                        if (objM33623g instanceof dqi0) {
                                            dqi0 dqi0Var2 = (dqi0) objM33623g;
                                            Object[] objArr2 = dqi0Var2.f52019b;
                                            long[] jArr9 = dqi0Var2.f52018a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = i5;
                                                i3 = length;
                                                int i10 = 0;
                                                while (true) {
                                                    long j10 = jArr9[i10];
                                                    j8 = j9;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i12 = 0;
                                                        while (i12 < i11) {
                                                            if ((j10 & 255) < 128) {
                                                                m62748e((rtq) objArr2[(i10 << 3) + i12], z);
                                                            }
                                                            j10 >>= i9;
                                                            i12++;
                                                            jArr8 = jArr8;
                                                        }
                                                        jArr7 = jArr8;
                                                        if (i11 != i9) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    jArr9 = jArr10;
                                                    j9 = j8;
                                                    jArr8 = jArr7;
                                                    i9 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j8 = j9;
                                            i3 = length;
                                            m62748e((rtq) objM33623g, z);
                                        }
                                    }
                                    i4 = 8;
                                }
                                jArr7 = jArr8;
                                j8 = j9;
                                i3 = length;
                                i4 = 8;
                            } else {
                                jArr7 = jArr8;
                                c2 = c3;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c3 = c2;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c = c3;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr8;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr8 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof pgv0) {
                    ((pgv0) obj3).m69926c(null);
                } else {
                    m62748e(obj3, z);
                    Object objM33623g2 = cqi0Var.m33623g(obj3);
                    if (objM33623g2 != null) {
                        if (objM33623g2 instanceof dqi0) {
                            dqi0 dqi0Var3 = (dqi0) objM33623g2;
                            Object[] objArr3 = dqi0Var3.f52019b;
                            long[] jArr11 = dqi0Var3.f52018a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr11[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 != length3) {
                                            break;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                m62748e((rtq) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        } else if (i14 != length3) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                            }
                        } else {
                            m62748e((rtq) objM33623g2, z);
                        }
                    }
                }
            }
        }
        cqi0 cqi0Var2 = this.f146797g;
        dqi0 dqi0Var4 = this.f146798h;
        if (z) {
            dqi0 dqi0Var5 = this.f146799i;
            if (dqi0Var5.m36649h()) {
                long[] jArr12 = cqi0Var2.f40896a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr12[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = cqi0Var2.f40897b[i20];
                                    Object obj5 = cqi0Var2.f40898c[i20];
                                    if (obj5 instanceof dqi0) {
                                        dqi0 dqi0Var6 = (dqi0) obj5;
                                        Object[] objArr4 = dqi0Var6.f52019b;
                                        long[] jArr13 = dqi0Var6.f52018a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr13[i21];
                                                jArr5 = jArr12;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            pgv0 pgv0Var = (pgv0) objArr4[i24];
                                                            if (dqi0Var5.m36644c(pgv0Var) || dqi0Var4.m36644c(pgv0Var)) {
                                                                dqi0Var6.m36654m(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 != length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                } else if (i21 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        zM36648g = dqi0Var6.m36648g();
                                    } else {
                                        jArr5 = jArr12;
                                        i = length4;
                                        j6 = j12;
                                        pgv0 pgv0Var2 = (pgv0) obj5;
                                        zM36648g = dqi0Var5.m36644c(pgv0Var2) || dqi0Var4.m36644c(pgv0Var2);
                                    }
                                    if (zM36648g) {
                                        cqi0Var2.m33628l(i20);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr12 = jArr4;
                    }
                }
                dqi0Var5.m36643b();
                m62754k();
                return;
            }
        }
        if (dqi0Var4.m36649h()) {
            long[] jArr14 = cqi0Var2.f40896a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr14[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = cqi0Var2.f40897b[i29];
                                Object obj7 = cqi0Var2.f40898c[i29];
                                if (obj7 instanceof dqi0) {
                                    dqi0 dqi0Var7 = (dqi0) obj7;
                                    Object[] objArr5 = dqi0Var7.f52019b;
                                    long[] jArr15 = dqi0Var7.f52018a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr15[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr14;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (dqi0Var4.m36644c((pgv0) objArr6[i33])) {
                                                            dqi0Var7.m36654m(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr14 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j4 = j14;
                                    }
                                    zM36644c = dqi0Var7.m36648g();
                                } else {
                                    jArr2 = jArr14;
                                    j4 = j14;
                                    zM36644c = dqi0Var4.m36644c((pgv0) obj7);
                                }
                                if (zM36644c) {
                                    cqi0Var2.m33628l(i29);
                                }
                            } else {
                                jArr2 = jArr14;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr14 = jArr;
                }
            }
            m62754k();
            dqi0Var4.m36643b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m62750g() {
        synchronized (this.f146794d) {
            try {
                m62751h(this.f146788X);
                m62760q();
            } catch (Throwable th) {
                try {
                    if (!this.f146795e.f72224a.m36648g()) {
                        u12 u12Var = this.f146785S0;
                        try {
                            u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                            u12Var.m82182q();
                        } finally {
                            u12Var.m82175i();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m62747d();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0145 A[EDGE_INSN: B:165:0x0145->B:83:0x0145 BREAK  A[LOOP:2: B:155:0x00f8->B:81:0x013b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x013b A[Catch: all -> 0x012b, LOOP:2: B:155:0x00f8->B:81:0x013b, LOOP_END, TryCatch #8 {all -> 0x012b, blocks: (B:65:0x00f8, B:67:0x0107, B:69:0x0111, B:71:0x0117, B:73:0x0127, B:77:0x0130, B:83:0x0145, B:91:0x0164, B:94:0x0177, B:81:0x013b, B:86:0x014f, B:100:0x0195, B:102:0x01a1), top: B:155:0x00f8 }] */
    /* JADX INFO: renamed from: h */
    public final void m62751h(dkc dkcVar) throws Throwable {
        ug5 ug5VarM58750d;
        u12 u12VarM58751e;
        u12 u12Var;
        long[] jArr;
        int i;
        long[] jArr2;
        u12 u12Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM36648g;
        long j3;
        dkc dkcVar2 = this.f146789Y;
        xq00 xq00Var = this.f146786T0;
        ksh kshVarM91736F = xq00Var.m91736F();
        u12 u12Var3 = this.f146785S0;
        u12Var3.m82162J(this.f146795e, kshVarM91736F);
        try {
            if (dkcVar.f49953c.m42499o()) {
                try {
                    if (dkcVar2.f49953c.m42499o() && this.f146781O0 == null) {
                        u12Var3.m82182q();
                    }
                    return;
                } finally {
                    u12Var3.m82175i();
                }
            }
            ldn0 ldn0Var = this.f146781O0;
            if (ldn0Var == null || (ug5VarM58750d = ldn0Var.m58750d()) == null) {
                ug5VarM58750d = this.f146792b;
            }
            ldn0 ldn0Var2 = this.f146781O0;
            try {
                th1.m80803e(wj50.m88271j(ug5VarM58750d, ldn0Var2 != null ? ldn0Var2.m58750d() : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    ldn0 ldn0Var3 = this.f146781O0;
                    if (ldn0Var3 == null || (u12VarM58751e = ldn0Var3.m58751e()) == null) {
                        u12VarM58751e = u12Var3;
                    }
                    ug5VarM58750d.getClass();
                    ou21 ou21Var = this.f146796f;
                    ksh kshVarM91736F2 = xq00Var.m91736F();
                    wu21 wu21VarM68080i = qu21.m73870d(ou21Var).m68080i();
                    int i3 = 0;
                    try {
                        dkcVar.m36266r(ug5VarM58750d, wu21VarM68080i, u12VarM58751e, kshVarM91736F2);
                        wu21VarM68080i.m88991e(true);
                        ug5VarM58750d.mo53946j();
                        th1.m80805g();
                        u12Var3.m82183r();
                        u12Var3.m82184s();
                        if (this.f146779M0) {
                            th1.m80803e("Compose:unobserve");
                            try {
                                this.f146779M0 = false;
                                cqi0 cqi0Var = this.f146797g;
                                long[] jArr3 = cqi0Var.f40896a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = cqi0Var.f40897b[i8];
                                                    Object obj2 = cqi0Var.f40898c[i8];
                                                    if (obj2 instanceof dqi0) {
                                                        dqi0 dqi0Var = (dqi0) obj2;
                                                        Object[] objArr = dqi0Var.f52019b;
                                                        long[] jArr4 = dqi0Var.f52018a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        u12Var2 = u12Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((pgv0) objArr[i13]).m69924a()) {
                                                                                    dqi0Var.m36654m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    th1.m80805g();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zM36648g = dqi0Var.m36648g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        u12Var2 = u12Var3;
                                                        j = j4;
                                                        zM36648g = !((pgv0) obj2).m69924a();
                                                    }
                                                    if (zM36648g) {
                                                        cqi0Var.m33628l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    u12Var2 = u12Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                u12Var3 = u12Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            u12Var = u12Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            u12Var = u12Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        u12Var3 = u12Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    u12Var = u12Var3;
                                }
                                m62754k();
                                th1.m80805g();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            u12Var = u12Var3;
                        }
                        try {
                            if (dkcVar2.f49953c.m42499o() && this.f146781O0 == null) {
                                u12Var.m82182q();
                            }
                            return;
                        } finally {
                            u12Var.m82175i();
                        }
                    } catch (Throwable th3) {
                        try {
                            wu21VarM68080i.m88991e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            th1.m80805g();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (dkcVar2.f49953c.m42499o() && this.f146781O0 == null) {
                u12Var3.m82182q();
            }
            throw th;
        } finally {
            u12Var3.m82175i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m62752i() {
        synchronized (this.f146794d) {
            try {
                if (this.f146789Y.m36267s()) {
                    m62751h(this.f146789Y);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f146795e.f72224a.m36648g()) {
                        u12 u12Var = this.f146785S0;
                        try {
                            u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                            u12Var.m82182q();
                        } finally {
                            u12Var.m82175i();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m62747d();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m62753j() {
        synchronized (this.f146794d) {
            try {
                this.f146786T0.f264832v = null;
                if (!this.f146795e.f72224a.m36648g()) {
                    u12 u12Var = this.f146785S0;
                    try {
                        u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                        u12Var.m82182q();
                        u12Var.m82175i();
                    } catch (Throwable th) {
                        u12Var.m82175i();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f146795e.f72224a.m36648g()) {
                        u12 u12Var2 = this.f146785S0;
                        try {
                            u12Var2.m82162J(this.f146795e, this.f146786T0.m91736F());
                            u12Var2.m82182q();
                        } finally {
                            u12Var2.m82175i();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    m62747d();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m62754k() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zM36648g;
        int i3;
        long j7;
        cqi0 cqi0Var = this.f146800t;
        long[] jArr3 = cqi0Var.f40896a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = cqi0Var.f40897b[i8];
                            Object obj2 = cqi0Var.f40898c[i8];
                            boolean z = obj2 instanceof dqi0;
                            cqi0 cqi0Var2 = this.f146797g;
                            if (z) {
                                dqi0 dqi0Var = (dqi0) obj2;
                                Object[] objArr = dqi0Var.f52019b;
                                long[] jArr4 = dqi0Var.f52018a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) == j5) {
                                            if (i10 != length2) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        } else {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!cqi0Var2.m33619c((rtq) objArr[i13])) {
                                                        dqi0Var.m36654m(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 != length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zM36648g = dqi0Var.m36648g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                zM36648g = !cqi0Var2.m33619c((rtq) obj2);
                            }
                            if (zM36648g) {
                                cqi0Var.m33628l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        dqi0 dqi0Var2 = this.f146799i;
        if (!dqi0Var2.m36649h()) {
            return;
        }
        Object[] objArr2 = dqi0Var2.f52019b;
        long[] jArr5 = dqi0Var2.f52018a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((pgv0) objArr2[i18]).f177422g != null)) {
                            dqi0Var2.m36654m(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m62755l() {
        boolean z;
        synchronized (this.f146794d) {
            z = true;
            if (this.f146787U0 != 1) {
                z = false;
            }
            if (z) {
                this.f146787U0 = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final void m62756m(th00 th00Var) {
        try {
            synchronized (this.f146794d) {
                m62759p();
                cqi0 cqi0Var = this.f146778L0;
                this.f146778L0 = y85.m93063h();
                try {
                    xq00 xq00Var = this.f146786T0;
                    ej11 ej11Var = this.f146780N0;
                    if (!xq00Var.f264815e.f49953c.m42499o()) {
                        vph.m86124a("Expected applyChanges() to have been called");
                    }
                    xq00Var.f264805P = ej11Var;
                    try {
                        xq00Var.m91784p(cqi0Var, th00Var);
                        xq00Var.f264805P = null;
                    } catch (Throwable th) {
                        xq00Var.f264805P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f146778L0 = cqi0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f146795e.f72224a.m36648g()) {
                    u12 u12Var = this.f146785S0;
                    try {
                        u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                        u12Var.m82182q();
                    } finally {
                        u12Var.m82175i();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m62747d();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final ldn0 m62757n(boolean z, th00 th00Var) {
        if (this.f146781O0 != null) {
            lfq0.m58914b("A pausable composition is in progress");
        }
        ldn0 ldn0Var = new ldn0(this, this.f146791a, this.f146786T0, this.f146795e, th00Var, z, this.f146792b, this.f146794d);
        this.f146781O0 = ldn0Var;
        return ldn0Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m62758o() {
        synchronized (this.f146794d) {
            try {
                if (this.f146781O0 != null) {
                    lfq0.m58914b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f146796f.f170147b == 0;
                if (!z || !this.f146795e.f72224a.m36648g()) {
                    th1.m80803e("Compose:deactivate");
                    try {
                        u12 u12Var = this.f146785S0;
                        try {
                            u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                            if (!z) {
                                this.f146792b.getClass();
                                ou21 ou21Var = this.f146796f;
                                u12 u12Var2 = this.f146785S0;
                                wu21 wu21VarM68080i = ou21Var.m68080i();
                                try {
                                    riw0.m75600C(wu21VarM68080i, u12Var2);
                                    wu21VarM68080i.m88991e(true);
                                    this.f146792b.mo53946j();
                                    u12Var.m82183r();
                                } catch (Throwable th) {
                                    wu21VarM68080i.m88991e(false);
                                    throw th;
                                }
                            }
                            u12Var.m82182q();
                            u12Var.m82175i();
                            th1.m80805g();
                        } catch (Throwable th2) {
                            u12Var.m82175i();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th1.m80805g();
                        throw th3;
                    }
                }
                this.f146797g.m33617a();
                this.f146800t.m33617a();
                this.f146778L0.m33617a();
                this.f146788X.m36265q();
                this.f146789Y.m36265q();
                xq00 xq00Var = this.f146786T0;
                xq00Var.f264794E.clear();
                xq00Var.f264829s.clear();
                xq00Var.f264815e.m36265q();
                xq00Var.f264832v = null;
                this.f146787U0 = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m62759p() {
        AtomicReference atomicReference = this.f146793c;
        Object obj = b9m.f24974a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                vph.m86125b("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                m62749f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                vph.m86125b("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                m62749f(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m62760q() {
        AtomicReference atomicReference = this.f146793c;
        Object andSet = atomicReference.getAndSet(null);
        if (wj50.m88271j(andSet, b9m.f24974a)) {
            return;
        }
        if (andSet instanceof Set) {
            m62749f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m62749f(set, false);
            }
            return;
        }
        if (andSet != null) {
            vph.m86125b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        if (this.f146781O0 == null) {
            vph.m86124a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m62761r() {
        gbu gbuVar = gbu.f78413a;
        AtomicReference atomicReference = this.f146793c;
        Object andSet = atomicReference.getAndSet(gbuVar);
        if (wj50.m88271j(andSet, b9m.f24974a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m62749f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            vph.m86125b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            m62749f(set, false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m62762s() {
        String str;
        int i = this.f146787U0;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            lfq0.m58914b(str);
        }
        if (this.f146781O0 == null) {
            return;
        }
        lfq0.m58914b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: t */
    public final void m62763t(ArrayList arrayList) {
        fqi0 fqi0Var = this.f146795e;
        xq00 xq00Var = this.f146786T0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((q2i0) ((pqm0) arrayList.get(i)).f180350a).f184645c.equals(this)) {
                vph.m86124a("Check failed");
                break;
            }
        }
        try {
            xq00Var.getClass();
            th1.m80803e("Compose:insertMovableContent");
            try {
                try {
                    xq00Var.m91739I(arrayList);
                    xq00Var.m91772j();
                    th1.m80805g();
                } catch (Throwable th) {
                    xq00Var.m91754a();
                    throw th;
                }
            } catch (Throwable th2) {
                th1.m80805g();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!fqi0Var.f72224a.m36648g()) {
                    u12 u12Var = this.f146785S0;
                    try {
                        u12Var.m82162J(fqi0Var, xq00Var.m91736F());
                        u12Var.m82182q();
                    } finally {
                        u12Var.m82175i();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m62747d();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX INFO: renamed from: u */
    public final int m62764u(pgv0 pgv0Var, rq00 rq00Var, Object obj) {
        int i;
        int i2;
        synchronized (this.f146794d) {
            try {
                msh mshVar = this.f146782P0;
                int i3 = 3;
                msh mshVar2 = null;
                if (mshVar != null) {
                    ou21 ou21Var = this.f146796f;
                    int i4 = this.f146783Q0;
                    if (ou21Var.f170152g) {
                        vph.m86124a("Writer is active");
                    }
                    if (i4 < 0 || i4 >= ou21Var.f170147b) {
                        vph.m86124a("Invalid group index");
                    }
                    rq00 rq00VarM73117n = qkg1.m73117n(rq00Var);
                    if (ou21Var.m68081j(rq00VarM73117n)) {
                        int i5 = ou21Var.f170146a[(i4 * 5) + 3] + i4;
                        int i6 = rq00VarM73117n.f201675a;
                        if (i4 > i6 || i6 >= i5) {
                            mshVar = null;
                        }
                    } else {
                        mshVar = null;
                    }
                    mshVar2 = mshVar;
                }
                int i7 = 2;
                if (mshVar2 == null) {
                    xq00 xq00Var = this.f146786T0;
                    if (xq00Var.f264795F && xq00Var.m91783o0(pgv0Var, obj)) {
                        return 4;
                    }
                    if (obj != null && (obj instanceof rtq)) {
                        Object objM33623g = this.f146778L0.m33623g(pgv0Var);
                        if (objM33623g != null) {
                            if (!(objM33623g instanceof dqi0)) {
                                i = 2;
                                i2 = 3;
                                if (objM33623g != unq0.f232230X) {
                                    y85.m93060e(this.f146778L0, pgv0Var, obj);
                                    break;
                                }
                            } else {
                                dqi0 dqi0Var = (dqi0) objM33623g;
                                Object[] objArr = dqi0Var.f52019b;
                                long[] jArr = dqi0Var.f52018a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i8 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i8];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                                            i = i7;
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                if ((j & 255) < 128) {
                                                    i2 = i3;
                                                    if (objArr[(i8 << 3) + i10] == unq0.f232230X) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i2 = i3;
                                                }
                                                j >>= 8;
                                                i10++;
                                                i3 = i2;
                                            }
                                            i2 = i3;
                                            if (i9 == 8) {
                                            }
                                        } else {
                                            i = i7;
                                            i2 = i3;
                                        }
                                        if (i8 != length) {
                                            i8++;
                                            i7 = i;
                                            i3 = i2;
                                        }
                                    }
                                } else {
                                    i = 2;
                                    i2 = 3;
                                }
                                y85.m93060e(this.f146778L0, pgv0Var, obj);
                                break;
                            }
                        } else {
                            i = 2;
                            i2 = 3;
                            y85.m93060e(this.f146778L0, pgv0Var, obj);
                            break;
                        }
                    } else {
                        this.f146778L0.m33629m(pgv0Var, unq0.f232230X);
                        i = 2;
                        i2 = 3;
                    }
                } else {
                    i = 2;
                    i2 = 3;
                }
                if (mshVar2 != null) {
                    return mshVar2.m62764u(pgv0Var, rq00Var, obj);
                }
                this.f146791a.mo48473o(this);
                return this.f146786T0.f264795F ? i2 : i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m62765v(Object obj) {
        Object objM33623g = this.f146797g.m33623g(obj);
        if (objM33623g == null) {
            return;
        }
        boolean z = objM33623g instanceof dqi0;
        cqi0 cqi0Var = this.f146790Z;
        if (!z) {
            pgv0 pgv0Var = (pgv0) objM33623g;
            if (pgv0Var.m69926c(obj) == 4) {
                y85.m93060e(cqi0Var, obj, pgv0Var);
                return;
            }
            return;
        }
        dqi0 dqi0Var = (dqi0) objM33623g;
        Object[] objArr = dqi0Var.f52019b;
        long[] jArr = dqi0Var.f52018a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        pgv0 pgv0Var2 = (pgv0) objArr[(i << 3) + i3];
                        if (pgv0Var2.m69926c(obj) == 4) {
                            y85.m93060e(cqi0Var, obj, pgv0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final boolean m62766w(Set set) {
        boolean z = set instanceof tdy0;
        cqi0 cqi0Var = this.f146800t;
        cqi0 cqi0Var2 = this.f146797g;
        if (z) {
            dqi0 dqi0Var = ((tdy0) set).f219529a;
            Object[] objArr = dqi0Var.f52019b;
            long[] jArr = dqi0Var.f52018a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (cqi0Var2.m33619c(obj) || cqi0Var.m33619c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (cqi0Var2.m33619c(obj2) || cqi0Var.m33619c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m62767x() {
        synchronized (this.f146794d) {
            ldn0 ldn0Var = this.f146781O0;
            boolean zM36267s = false;
            if (ldn0Var != null && !ldn0Var.m58753g()) {
                ldn0Var.m58755i();
                ldn0Var.m58750d().m87546N();
                return false;
            }
            m62759p();
            try {
                cqi0 cqi0Var = this.f146778L0;
                this.f146778L0 = y85.m93063h();
                try {
                    xq00 xq00Var = this.f146786T0;
                    ej11 ej11Var = this.f146780N0;
                    dkc dkcVar = xq00Var.f264815e;
                    if (!dkcVar.f49953c.m42499o()) {
                        vph.m86124a("Expected applyChanges() to have been called");
                    }
                    if (cqi0Var.f40900e > 0 || !xq00Var.f264829s.isEmpty()) {
                        xq00Var.f264805P = ej11Var;
                        try {
                            xq00Var.m91784p(cqi0Var, null);
                            xq00Var.f264805P = null;
                            zM36267s = dkcVar.m36267s();
                        } catch (Throwable th) {
                            xq00Var.f264805P = null;
                            throw th;
                        }
                    }
                    if (!zM36267s) {
                        m62760q();
                    }
                    return zM36267s;
                } catch (Throwable th2) {
                    this.f146778L0 = cqi0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f146795e.f72224a.m36648g()) {
                        u12 u12Var = this.f146785S0;
                        try {
                            u12Var.m82162J(this.f146795e, this.f146786T0.m91736F());
                            u12Var.m82182q();
                        } finally {
                            u12Var.m82175i();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    m62747d();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m62768y(tdy0 tdy0Var) {
        Object obj;
        Object objM29598U0;
        do {
            obj = this.f146793c.get();
            if (obj == null || obj.equals(b9m.f24974a)) {
                objM29598U0 = tdy0Var;
            } else if (obj instanceof Set) {
                objM29598U0 = new Set[]{obj, tdy0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f146793c).toString());
                }
                objM29598U0 = bk5.m29598U0((Set[]) obj, tdy0Var);
            }
        } while (!tfe.m80660r(this.f146793c, obj, objM29598U0));
        if (obj == null) {
            synchronized (this.f146794d) {
                m62760q();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final void m62769z(Object obj) {
        synchronized (this.f146794d) {
            try {
                m62765v(obj);
                Object objM33623g = this.f146800t.m33623g(obj);
                if (objM33623g != null) {
                    if (objM33623g instanceof dqi0) {
                        dqi0 dqi0Var = (dqi0) objM33623g;
                        Object[] objArr = dqi0Var.f52019b;
                        long[] jArr = dqi0Var.f52018a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            m62765v((rtq) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        m62765v((rtq) objM33623g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
