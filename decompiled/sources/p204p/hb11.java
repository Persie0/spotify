package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public class hb11 extends AbstractC2330r9 implements hqi0, iqb, dk00 {

    /* JADX INFO: renamed from: X */
    public int f89358X;

    /* JADX INFO: renamed from: Y */
    public int f89359Y;

    /* JADX INFO: renamed from: e */
    public final int f89360e;

    /* JADX INFO: renamed from: f */
    public final int f89361f;

    /* JADX INFO: renamed from: g */
    public final int f89362g;

    /* JADX INFO: renamed from: h */
    public Object[] f89363h;

    /* JADX INFO: renamed from: i */
    public long f89364i;

    /* JADX INFO: renamed from: t */
    public long f89365t;

    public hb11(int i, int i2, int i3) {
        this.f89360e = i;
        this.f89361f = i2;
        this.f89362g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static void m46961m(hb11 hb11Var, niz nizVar, fbk fbkVar) throws Throwable {
        gb11 gb11Var;
        hb11 hb11Var2;
        Throwable th;
        ib11 ib11Var;
        niz nizVar2;
        tf60 tf60Var;
        if (fbkVar instanceof gb11) {
            gb11Var = (gb11) fbkVar;
            int i = gb11Var.f78171g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb11Var.f78171g = i - Integer.MIN_VALUE;
            } else {
                gb11Var = new gb11(hb11Var, fbkVar);
            }
        } else {
            gb11Var = new gb11(hb11Var, fbkVar);
        }
        Object obj = gb11Var.f78169e;
        int i2 = gb11Var.f78171g;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                ib11Var = gb11Var.f78167c;
                niz nizVar3 = gb11Var.f78166b;
                hb11 hb11Var3 = gb11Var.f78165a;
                try {
                    bga.m29073P(obj);
                    nizVar2 = nizVar3;
                    hb11Var = hb11Var3;
                    try {
                        tf60Var = (tf60) gb11Var.getContext().mo26595B(gk40.f80712X0);
                    } catch (Throwable th2) {
                        hb11Var2 = hb11Var;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    hb11Var2 = hb11Var3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tf60 tf60Var2 = gb11Var.f78168d;
                ib11Var = gb11Var.f78167c;
                niz nizVar4 = gb11Var.f78166b;
                hb11Var2 = gb11Var.f78165a;
                try {
                    bga.m29073P(obj);
                    nizVar2 = nizVar4;
                    tf60Var = tf60Var2;
                    hb11Var = hb11Var2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            hb11Var2.m74999i(ib11Var);
            throw th;
        }
        bga.m29073P(obj);
        ib11 ib11Var2 = (ib11) hb11Var.m74998f();
        try {
            if (nizVar instanceof dt51) {
                gb11Var.f78165a = hb11Var;
                gb11Var.f78166b = nizVar;
                gb11Var.f78167c = ib11Var2;
                gb11Var.f78171g = 1;
                if (((dt51) nizVar).m36805b(gb11Var) == yukVar) {
                    return;
                }
            }
            nizVar2 = nizVar;
            ib11Var = ib11Var2;
            tf60Var = (tf60) gb11Var.getContext().mo26595B(gk40.f80712X0);
        } catch (Throwable th5) {
            hb11Var2 = hb11Var;
            th = th5;
            ib11Var = ib11Var2;
        }
        while (true) {
            Object objM46975u = hb11Var.m46975u(ib11Var);
            if (objM46975u == j0g1.f107457a) {
                gb11Var.f78165a = hb11Var;
                gb11Var.f78166b = nizVar2;
                gb11Var.f78167c = ib11Var;
                gb11Var.f78168d = tf60Var;
                gb11Var.f78171g = 2;
                if (hb11Var.m46966k(ib11Var, gb11Var) == yukVar) {
                    return;
                }
            } else {
                if (tf60Var != null) {
                    qlg1.m73221z(tf60Var);
                }
                gb11Var.f78165a = hb11Var;
                gb11Var.f78166b = nizVar2;
                gb11Var.f78167c = ib11Var;
                gb11Var.f78168d = tf60Var;
                gb11Var.f78171g = 3;
                if (nizVar2.emit(objM46975u, gb11Var) == yukVar) {
                    return;
                }
            }
        }
    }

    @Override // p204p.hqi0
    /* JADX INFO: renamed from: a */
    public final boolean mo46962a(Object obj) {
        int i;
        boolean z;
        fbk[] fbkVarArrM46970p = tg1.f220101a;
        synchronized (this) {
            if (m46973s(obj)) {
                fbkVarArrM46970p = m46970p(fbkVarArrM46970p);
                z = true;
            } else {
                z = false;
            }
        }
        for (fbk fbkVar : fbkVarArrM46970p) {
            if (fbkVar != null) {
                fbkVar.resumeWith(w2a1.f247311a);
            }
        }
        return z;
    }

    @Override // p204p.dk00
    /* JADX INFO: renamed from: b */
    public final fiz mo36243b(juk jukVar, int i, int i2) {
        return j0g1.m52069F(this, jukVar, i, i2);
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        synchronized (this) {
            int iM46971q = (int) ((m46971q() + ((long) this.f89358X)) - this.f89364i);
            if (iM46971q == 0) {
                return lau.f131415a;
            }
            ArrayList arrayList = new ArrayList(iM46971q);
            Object[] objArr = this.f89363h;
            wj50.m88279p(objArr);
            for (int i = 0; i < iM46971q; i++) {
                arrayList.add(j0g1.m52066C(objArr, this.f89364i + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        m46961m(this, nizVar, fbkVar);
        return yuk.f276404a;
    }

    @Override // p204p.hqi0
    /* JADX INFO: renamed from: e */
    public final void mo46963e() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m46976v(m46971q() + ((long) this.f89358X), this.f89365t, m46971q() + ((long) this.f89358X), m46971q() + ((long) this.f89358X) + ((long) this.f89359Y));
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p204p.hqi0, p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        Throwable th;
        fbk[] fbkVarArrM46970p;
        fb11 fb11Var;
        if (mo46962a(obj)) {
            return w2a1.f247311a;
        }
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        fbk[] fbkVarArrM46970p2 = tg1.f220101a;
        synchronized (this) {
            try {
                if (m46973s(obj)) {
                    try {
                        hqbVar.resumeWith(w2a1.f247311a);
                        fbkVarArrM46970p = m46970p(fbkVarArrM46970p2);
                        fb11Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        fb11 fb11Var2 = new fb11(this, m46971q() + ((long) (this.f89358X + this.f89359Y)), obj, hqbVar);
                        m46969o(fb11Var2);
                        this.f89359Y++;
                        if (this.f89361f == 0) {
                            fbkVarArrM46970p2 = m46970p(fbkVarArrM46970p2);
                        }
                        fbkVarArrM46970p = fbkVarArrM46970p2;
                        fb11Var = fb11Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (fb11Var != null) {
                    gga.m44670i(hqbVar, fb11Var);
                }
                for (fbk fbkVar2 : fbkVarArrM46970p) {
                    if (fbkVar2 != null) {
                        fbkVar2.resumeWith(w2a1.f247311a);
                    }
                }
                Object objM48221p = hqbVar.m48221p();
                yuk yukVar = yuk.f276404a;
                if (objM48221p != yukVar) {
                    objM48221p = w2a1.f247311a;
                }
                return objM48221p == yukVar ? objM48221p : w2a1.f247311a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // p204p.AbstractC2330r9
    /* JADX INFO: renamed from: g */
    public final AbstractC2368s9 mo46964g() {
        ib11 ib11Var = new ib11();
        ib11Var.f100413a = -1L;
        return ib11Var;
    }

    @Override // p204p.AbstractC2330r9
    /* JADX INFO: renamed from: h */
    public final AbstractC2368s9[] mo46965h() {
        return new ib11[2];
    }

    /* JADX INFO: renamed from: k */
    public final Object m46966k(ib11 ib11Var, gb11 gb11Var) {
        hqb hqbVar = new hqb(1, seg1.m77914f(gb11Var));
        hqbVar.m48222q();
        synchronized (this) {
            try {
                if (m46974t(ib11Var) < 0) {
                    ib11Var.f100414b = hqbVar;
                } else {
                    hqbVar.resumeWith(w2a1.f247311a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM48221p = hqbVar.m48221p();
        return objM48221p == yuk.f276404a ? objM48221p : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: l */
    public final void m46967l() {
        if (this.f89361f != 0 || this.f89359Y > 1) {
            Object[] objArr = this.f89363h;
            wj50.m88279p(objArr);
            while (this.f89359Y > 0 && j0g1.m52066C(objArr, (m46971q() + ((long) (this.f89358X + this.f89359Y))) - 1) == j0g1.f107457a) {
                this.f89359Y--;
                j0g1.m52067D(objArr, m46971q() + ((long) (this.f89358X + this.f89359Y)), null);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m46968n() {
        AbstractC2368s9[] abstractC2368s9Arr;
        Object[] objArr = this.f89363h;
        wj50.m88279p(objArr);
        j0g1.m52067D(objArr, m46971q(), null);
        this.f89358X--;
        long jM46971q = m46971q() + 1;
        if (this.f89364i < jM46971q) {
            this.f89364i = jM46971q;
        }
        if (this.f89365t < jM46971q) {
            if (this.f196876b != 0 && (abstractC2368s9Arr = this.f196875a) != null) {
                for (AbstractC2368s9 abstractC2368s9 : abstractC2368s9Arr) {
                    if (abstractC2368s9 != null) {
                        ib11 ib11Var = (ib11) abstractC2368s9;
                        long j = ib11Var.f100413a;
                        if (0 <= j && j < jM46971q) {
                            ib11Var.f100413a = jM46971q;
                        }
                    }
                }
            }
            this.f89365t = jM46971q;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m46969o(Object obj) {
        int i = this.f89358X + this.f89359Y;
        Object[] objArrM46972r = this.f89363h;
        if (objArrM46972r == null) {
            objArrM46972r = m46972r(0, 2, null);
        } else if (i >= objArrM46972r.length) {
            objArrM46972r = m46972r(i, objArrM46972r.length * 2, objArrM46972r);
        }
        j0g1.m52067D(objArrM46972r, m46971q() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.fbk[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: p */
    public final fbk[] m46970p(fbk[] fbkVarArr) {
        AbstractC2368s9[] abstractC2368s9Arr;
        ib11 ib11Var;
        hqb hqbVar;
        int length = fbkVarArr.length;
        if (this.f196876b != 0 && (abstractC2368s9Arr = this.f196875a) != null) {
            int length2 = abstractC2368s9Arr.length;
            int i = 0;
            while (i < length2) {
                AbstractC2368s9 abstractC2368s9 = abstractC2368s9Arr[i];
                if (abstractC2368s9 == null || (hqbVar = (ib11Var = (ib11) abstractC2368s9).f100414b) == null || m46974t(ib11Var) < 0) {
                    fbkVarArr = fbkVarArr;
                } else {
                    if (length >= fbkVarArr.length) {
                        fbkVarArr = fbkVarArr;
                        fbkVarArr = fbkVarArr;
                        fbkVarArr = Arrays.copyOf((Object[]) fbkVarArr, Math.max(2, fbkVarArr.length * 2));
                    }
                    fbkVarArr = fbkVarArr;
                    fbkVarArr = fbkVarArr;
                    ((fbk[]) fbkVarArr)[length] = hqbVar;
                    ib11Var.f100414b = null;
                    length++;
                }
                i++;
                fbkVarArr = fbkVarArr;
            }
            fbkVarArr = fbkVarArr;
        }
        return (fbk[]) fbkVarArr;
    }

    /* JADX INFO: renamed from: q */
    public final long m46971q() {
        return Math.min(this.f89365t, this.f89364i);
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m46972r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f89363h = objArr2;
        if (objArr != null) {
            long jM46971q = m46971q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jM46971q;
                j0g1.m52067D(objArr2, j, j0g1.m52066C(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX INFO: renamed from: s */
    public final boolean m46973s(Object obj) {
        int i;
        long jM46971q;
        long j;
        int i2 = this.f196876b;
        int i3 = this.f89360e;
        if (i2 != 0) {
            int i4 = this.f89358X;
            int i5 = this.f89361f;
            if (i4 < i5 || this.f89365t > this.f89364i) {
                m46969o(obj);
                i = this.f89358X + 1;
                this.f89358X = i;
                if (i > i5) {
                    m46968n();
                }
                jM46971q = m46971q() + ((long) this.f89358X);
                j = this.f89364i;
                if (((int) (jM46971q - j)) > i3) {
                    m46976v(1 + j, this.f89365t, m46971q() + ((long) this.f89358X), m46971q() + ((long) this.f89358X) + ((long) this.f89359Y));
                }
            } else {
                int iM38547C = edb.m38547C(this.f89362g);
                if (iM38547C == 0) {
                    return false;
                }
                if (iM38547C == 1) {
                    m46969o(obj);
                    i = this.f89358X + 1;
                    this.f89358X = i;
                    if (i > i5) {
                        m46968n();
                    }
                    jM46971q = m46971q() + ((long) this.f89358X);
                    j = this.f89364i;
                    if (((int) (jM46971q - j)) > i3) {
                        m46976v(1 + j, this.f89365t, m46971q() + ((long) this.f89358X), m46971q() + ((long) this.f89358X) + ((long) this.f89359Y));
                    }
                } else if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (i3 != 0) {
            m46969o(obj);
            int i6 = this.f89358X + 1;
            this.f89358X = i6;
            if (i6 > i3) {
                m46968n();
            }
            this.f89365t = m46971q() + ((long) this.f89358X);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final long m46974t(ib11 ib11Var) {
        long j = ib11Var.f100413a;
        if (j < m46971q() + ((long) this.f89358X)) {
            return j;
        }
        if (this.f89361f <= 0 && j <= m46971q() && this.f89359Y != 0) {
            return j;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: u */
    public final Object m46975u(ib11 ib11Var) {
        Object obj;
        fbk[] fbkVarArrM46977w = tg1.f220101a;
        synchronized (this) {
            try {
                long jM46974t = m46974t(ib11Var);
                if (jM46974t < 0) {
                    obj = j0g1.f107457a;
                } else {
                    long j = ib11Var.f100413a;
                    Object[] objArr = this.f89363h;
                    wj50.m88279p(objArr);
                    Object objM52066C = j0g1.m52066C(objArr, jM46974t);
                    if (objM52066C instanceof fb11) {
                        objM52066C = ((fb11) objM52066C).f67690c;
                    }
                    ib11Var.f100413a = jM46974t + 1;
                    Object obj2 = objM52066C;
                    fbkVarArrM46977w = m46977w(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (fbk fbkVar : fbkVarArrM46977w) {
            if (fbkVar != null) {
                fbkVar.resumeWith(w2a1.f247311a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: v */
    public final void m46976v(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM46971q = m46971q(); jM46971q < jMin; jM46971q++) {
            Object[] objArr = this.f89363h;
            wj50.m88279p(objArr);
            j0g1.m52067D(objArr, jM46971q, null);
        }
        this.f89364i = j;
        this.f89365t = j2;
        this.f89358X = (int) (j3 - jMin);
        this.f89359Y = (int) (j4 - j3);
    }

    /* JADX INFO: renamed from: w */
    public final fbk[] m46977w(long j) {
        int i;
        long j2;
        long j3;
        fbk[] fbkVarArr;
        AbstractC2368s9[] abstractC2368s9Arr;
        long j4 = this.f89365t;
        fbk[] fbkVarArr2 = tg1.f220101a;
        if (j <= j4) {
            long jM46971q = m46971q();
            long j5 = ((long) this.f89358X) + jM46971q;
            int i2 = this.f89361f;
            if (i2 == 0 && this.f89359Y > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.f196876b != 0 && (abstractC2368s9Arr = this.f196875a) != null) {
                for (AbstractC2368s9 abstractC2368s9 : abstractC2368s9Arr) {
                    if (abstractC2368s9 != null) {
                        long j6 = ((ib11) abstractC2368s9).f100413a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.f89365t) {
                long jM46971q2 = m46971q() + ((long) this.f89358X);
                int iMin = this.f196876b > 0 ? Math.min(this.f89359Y, i2 - ((int) (jM46971q2 - j5))) : this.f89359Y;
                long j7 = ((long) this.f89359Y) + jM46971q2;
                C2617yl c2617yl = j0g1.f107457a;
                if (iMin > 0) {
                    fbk[] fbkVarArr3 = new fbk[iMin];
                    j3 = 1;
                    Object[] objArr = this.f89363h;
                    wj50.m88279p(objArr);
                    int i4 = i2;
                    long j8 = jM46971q2;
                    while (true) {
                        if (jM46971q2 >= j7) {
                            j2 = j5;
                            i = i4;
                            break;
                        }
                        j2 = j5;
                        Object objM52066C = j0g1.m52066C(objArr, jM46971q2);
                        if (objM52066C != c2617yl) {
                            fb11 fb11Var = (fb11) objM52066C;
                            int i5 = i3 + 1;
                            i = i4;
                            fbkVarArr3[i3] = fb11Var.f67691d;
                            j0g1.m52067D(objArr, jM46971q2, c2617yl);
                            j0g1.m52067D(objArr, j8, fb11Var.f67690c);
                            j8++;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i4;
                        }
                        jM46971q2++;
                        j5 = j2;
                        i4 = i;
                    }
                    jM46971q2 = j8;
                    fbkVarArr = fbkVarArr3;
                } else {
                    i = i2;
                    j2 = j5;
                    j3 = 1;
                    fbkVarArr = fbkVarArr2;
                }
                long jMax = Math.max(this.f89364i, Math.max(jM46971q, jM46971q2 - ((long) this.f89360e)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.f89363h;
                    wj50.m88279p(objArr2);
                    if (wj50.m88271j(j0g1.m52066C(objArr2, jMax), c2617yl)) {
                        jM46971q2 += j3;
                        jMax += j3;
                    }
                }
                long j9 = jM46971q2;
                m46976v(jMax, this.f196876b == 0 ? j9 : j2, j9, j7);
                m46967l();
                return fbkVarArr.length == 0 ? fbkVarArr : m46970p(fbkVarArr);
            }
        }
        return fbkVarArr2;
    }
}
