package p204p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xq00 {

    /* JADX INFO: renamed from: A */
    public int f264790A;

    /* JADX INFO: renamed from: B */
    public int f264791B;

    /* JADX INFO: renamed from: C */
    public boolean f264792C;

    /* JADX INFO: renamed from: D */
    public final wq00 f264793D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f264794E;

    /* JADX INFO: renamed from: F */
    public boolean f264795F;

    /* JADX INFO: renamed from: G */
    public nu21 f264796G;

    /* JADX INFO: renamed from: H */
    public ou21 f264797H;

    /* JADX INFO: renamed from: I */
    public wu21 f264798I;

    /* JADX INFO: renamed from: J */
    public boolean f264799J;

    /* JADX INFO: renamed from: K */
    public wpn0 f264800K;

    /* JADX INFO: renamed from: L */
    public dkc f264801L;

    /* JADX INFO: renamed from: M */
    public final qph f264802M;

    /* JADX INFO: renamed from: N */
    public rq00 f264803N;

    /* JADX INFO: renamed from: O */
    public pez f264804O;

    /* JADX INFO: renamed from: P */
    public ej11 f264805P;

    /* JADX INFO: renamed from: Q */
    public final ksh f264806Q;

    /* JADX INFO: renamed from: R */
    public final juk f264807R;

    /* JADX INFO: renamed from: S */
    public boolean f264808S;

    /* JADX INFO: renamed from: T */
    public long f264809T;

    /* JADX INFO: renamed from: U */
    public yq00 f264810U;

    /* JADX INFO: renamed from: a */
    public final ug5 f264811a;

    /* JADX INFO: renamed from: b */
    public final hsh f264812b;

    /* JADX INFO: renamed from: c */
    public final ou21 f264813c;

    /* JADX INFO: renamed from: d */
    public final fqi0 f264814d;

    /* JADX INFO: renamed from: e */
    public final dkc f264815e;

    /* JADX INFO: renamed from: f */
    public final dkc f264816f;

    /* JADX INFO: renamed from: g */
    public final C1668ai f264817g;

    /* JADX INFO: renamed from: h */
    public final msh f264818h;

    /* JADX INFO: renamed from: j */
    public ar00 f264820j;

    /* JADX INFO: renamed from: k */
    public int f264821k;

    /* JADX INFO: renamed from: l */
    public int f264822l;

    /* JADX INFO: renamed from: m */
    public int f264823m;

    /* JADX INFO: renamed from: o */
    public int[] f264825o;

    /* JADX INFO: renamed from: p */
    public roi0 f264826p;

    /* JADX INFO: renamed from: q */
    public boolean f264827q;

    /* JADX INFO: renamed from: r */
    public boolean f264828r;

    /* JADX INFO: renamed from: u */
    public wpn0 f264831u;

    /* JADX INFO: renamed from: v */
    public toi0 f264832v;

    /* JADX INFO: renamed from: w */
    public boolean f264833w;

    /* JADX INFO: renamed from: x */
    public final sgz f264834x;

    /* JADX INFO: renamed from: y */
    public boolean f264835y;

    /* JADX INFO: renamed from: z */
    public int f264836z;

    /* JADX INFO: renamed from: i */
    public final ArrayList f264819i = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final sgz f264824n = new sgz(2, (byte) 0);

    /* JADX INFO: renamed from: s */
    public final ArrayList f264829s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final sgz f264830t = new sgz(2, (byte) 0);

    public xq00(ug5 ug5Var, hsh hshVar, ou21 ou21Var, fqi0 fqi0Var, dkc dkcVar, dkc dkcVar2, C1668ai c1668ai, msh mshVar) {
        this.f264811a = ug5Var;
        this.f264812b = hshVar;
        this.f264813c = ou21Var;
        this.f264814d = fqi0Var;
        this.f264815e = dkcVar;
        this.f264816f = dkcVar2;
        this.f264817g = c1668ai;
        this.f264818h = mshVar;
        mwg1.m63037q();
        this.f264831u = vpn0.f243731d;
        this.f264834x = new sgz(2, (byte) 0);
        this.f264836z = -1;
        this.f264792C = hshVar.mo48465g() || hshVar.mo48463e();
        this.f264793D = new wq00(this);
        this.f264794E = new ArrayList();
        nu21 nu21VarM68079f = ou21Var.m68079f();
        nu21VarM68079f.m65649c();
        this.f264796G = nu21VarM68079f;
        ou21 ou21Var2 = new ou21();
        if (hshVar.mo48465g()) {
            ou21Var2.m68077b();
        }
        if (hshVar.mo48463e()) {
            ou21Var2.f170145X = new toi0();
        }
        this.f264797H = ou21Var2;
        wu21 wu21VarM68080i = ou21Var2.m68080i();
        wu21VarM68080i.m88991e(true);
        this.f264798I = wu21VarM68080i;
        this.f264802M = new qph(this, dkcVar);
        nu21 nu21VarM68079f2 = this.f264797H.m68079f();
        try {
            rq00 rq00VarM65647a = nu21VarM68079f2.m65647a(0);
            nu21VarM68079f2.m65649c();
            this.f264803N = rq00VarM65647a;
            this.f264804O = new pez();
            this.f264806Q = new ksh(this);
            juk jukVarMo48469k = hshVar.mo48469k();
            juk jukVarM91736F = m91736F();
            this.f264807R = jukVarMo48469k.mo26608y(jukVarM91736F == null ? dau.f47107a : jukVarM91736F);
        } catch (Throwable th) {
            nu21VarM68079f2.m65649c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: V */
    public static final q2i0 m91728V(int i, xq00 xq00Var) {
        ArrayList arrayList;
        int iM65655i = xq00Var.f264796G.m65655i(i);
        nu21 nu21Var = xq00Var.f264796G;
        Object objM65662p = nu21Var.m65662p(nu21Var.f158490b, i);
        if (iM65655i != 126665345 || !(objM65662p instanceof o2i0)) {
            return null;
        }
        if (xq00Var.f264796G.m65650d(i)) {
            ArrayList arrayList2 = new ArrayList();
            m91729W(i, arrayList2, xq00Var);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        nu21 nu21Var2 = xq00Var.f264796G;
        o2i0 o2i0Var = (o2i0) nu21Var2.m65662p(nu21Var2.f158490b, i);
        Object objM65654h = xq00Var.f264796G.m65654h(i, 0);
        rq00 rq00VarM65647a = xq00Var.f264796G.m65647a(i);
        int i2 = xq00Var.f264796G.f158490b[(i * 5) + 3] + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = xq00Var.f264829s;
        for (int iM75622p = riw0.m75622p(i, arrayList4); iM75622p < arrayList4.size(); iM75622p++) {
            sl50 sl50Var = (sl50) arrayList4.get(iM75622p);
            if (sl50Var.f210301b >= i2) {
                break;
            }
            arrayList3.add(pft0.m69840u(sl50Var.f210300a, sl50Var.f210302c));
        }
        return new q2i0(o2i0Var, objM65654h, xq00Var.f264818h, xq00Var.f264813c, rq00VarM65647a, arrayList3, xq00Var.m91780n(i), arrayList);
    }

    /* JADX INFO: renamed from: W */
    public static final void m91729W(int i, ArrayList arrayList, xq00 xq00Var) {
        int i2 = xq00Var.f264796G.f158490b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (xq00Var.f264796G.m65656j(i3)) {
                q2i0 q2i0VarM91728V = m91728V(i3, xq00Var);
                if (q2i0VarM91728V != null) {
                    arrayList.add(q2i0VarM91728V);
                }
            } else if (xq00Var.f264796G.m65650d(i3)) {
                m91729W(i3, arrayList, xq00Var);
            }
            i3 += xq00Var.f264796G.f158490b[(i3 * 5) + 3];
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX INFO: renamed from: X */
    public static final int m91730X(int i, int i2, int i3, xq00 xq00Var, boolean z) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        int i6;
        nu21 nu21Var = xq00Var.f264796G;
        hsh hshVar = xq00Var.f264812b;
        qph qphVar = xq00Var.f264802M;
        boolean zM65656j = nu21Var.m65656j(i2);
        int[] iArr = nu21Var.f158490b;
        int i7 = 0;
        if (zM65656j) {
            int iM65655i = nu21Var.m65655i(i2);
            Object objM65662p = nu21Var.m65662p(iArr, i2);
            if (iM65655i == 126665345 && (objM65662p instanceof o2i0)) {
                q2i0 q2i0VarM91728V = m91728V(i2, xq00Var);
                if (q2i0VarM91728V != null) {
                    hshVar.mo48461c(q2i0VarM91728V);
                    qphVar.m73444e();
                    msh mshVar = xq00Var.f264818h;
                    hsh hshVar2 = xq00Var.f264812b;
                    frl0 frl0Var = qphVar.f191306b.f49953c;
                    frl0Var.m42500p(xpl0.f264684c);
                    fag1.m41177z(frl0Var, mshVar, hshVar2, q2i0VarM91728V);
                }
                if (!z || i2 == i) {
                    return nu21Var.m65661o(i2);
                }
                qphVar.m73442c();
                qphVar.m73441b();
                xq00 xq00Var2 = qphVar.f191305a;
                int iM65661o = xq00Var2.f264796G.m65658l(i2) ? 1 : xq00Var2.f264796G.m65661o(i2);
                if (iM65661o > 0) {
                    qphVar.m73445f(i3, iM65661o);
                }
                return 0;
            }
            if (iM65655i == 206 && wj50.m88271j(objM65662p, vph.f243695e)) {
                Object objM65654h = nu21Var.m65654h(i2, 0);
                f9w0 f9w0Var = objM65654h instanceof f9w0 ? (f9w0) objM65654h : null;
                e9w0 e9w0VarMo30283a = f9w0Var != null ? f9w0Var.mo30283a() : null;
                uq00 uq00Var = e9w0VarMo30283a instanceof uq00 ? (uq00) e9w0VarMo30283a : null;
                if (uq00Var != null) {
                    dqi0 dqi0Var = uq00Var.f232880a.f243825f;
                    Object[] objArr2 = dqi0Var.f52019b;
                    long[] jArr2 = dqi0Var.f52018a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i7;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        xq00 xq00Var3 = (xq00) objArr2[(i8 << 3) + i11];
                                        qph qphVar2 = xq00Var3.f264802M;
                                        msh mshVar2 = xq00Var3.f264818h;
                                        ou21 ou21Var = xq00Var3.f264813c;
                                        if (ou21Var.f170147b <= 0 || (ou21Var.f170146a[1] & 67108864) == 0) {
                                            i6 = 0;
                                        } else {
                                            synchronized (mshVar2.f146794d) {
                                                mshVar2.m62761r();
                                                cqi0 cqi0Var = mshVar2.f146778L0;
                                                mshVar2.f146778L0 = y85.m93063h();
                                                try {
                                                    mshVar2.f146786T0.m91785p0(cqi0Var);
                                                } catch (Throwable th) {
                                                    mshVar2.f146778L0 = cqi0Var;
                                                    throw th;
                                                }
                                            }
                                            dkc dkcVar = new dkc();
                                            xq00Var3.f264801L = dkcVar;
                                            nu21 nu21VarM68079f = ou21Var.m68079f();
                                            try {
                                                xq00Var3.f264796G = nu21VarM68079f;
                                                dkc dkcVar2 = qphVar2.f191306b;
                                                try {
                                                    qphVar2.f191306b = dkcVar;
                                                    xq00Var3.m91751U(0);
                                                    qphVar2.m73441b();
                                                    if (qphVar2.f191307c) {
                                                        qphVar2.f191306b.f49953c.m42500p(eql0.f61917c);
                                                        if (qphVar2.f191307c) {
                                                            i6 = 0;
                                                            qphVar2.m73443d(false);
                                                            qphVar2.m73443d(false);
                                                            qphVar2.f191306b.f49953c.m42500p(npl0.f157029c);
                                                            qphVar2.f191307c = false;
                                                        } else {
                                                            i6 = 0;
                                                        }
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    qphVar2.f191306b = dkcVar2;
                                                    nu21VarM68079f.m65649c();
                                                } catch (Throwable th2) {
                                                    qphVar2.f191306b = dkcVar2;
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                nu21VarM68079f.m65649c();
                                                throw th3;
                                            }
                                        }
                                        hshVar.mo48480v(mshVar2);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr2;
                                        i6 = i7;
                                    }
                                    j >>= i9;
                                    i11++;
                                    jArr2 = jArr2;
                                    i7 = i6;
                                    objArr2 = objArr2;
                                    i9 = i9;
                                }
                                jArr = jArr2;
                                objArr = objArr2;
                                int i12 = i9;
                                i5 = i7;
                                if (i10 != i12) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr2;
                                i5 = i7;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            jArr2 = jArr;
                            i7 = i5;
                            objArr2 = objArr;
                        }
                    }
                }
                return nu21Var.m65661o(i2);
            }
            i4 = 1;
            if (!nu21Var.m65658l(i2)) {
                return nu21Var.m65661o(i2);
            }
        } else {
            i4 = 1;
            if (nu21Var.m65650d(i2)) {
                int i13 = iArr[(i2 * 5) + 3] + i2;
                int iM91730X = 0;
                for (int i14 = i2 + 1; i14 < i13; i14 += iArr[(i14 * 5) + 3]) {
                    boolean zM65658l = nu21Var.m65658l(i14);
                    if (zM65658l) {
                        qphVar.m73442c();
                        Object objM65660n = nu21Var.m65660n(i14);
                        qphVar.m73442c();
                        qphVar.f191312h.add(objM65660n);
                    }
                    iM91730X += m91730X(i, i14, zM65658l ? 0 : i3 + iM91730X, xq00Var, zM65658l || z);
                    if (zM65658l) {
                        qphVar.m73442c();
                        qphVar.m73440a();
                    }
                }
                if (!nu21Var.m65658l(i2)) {
                    return iM91730X;
                }
            } else if (!nu21Var.m65658l(i2)) {
                return nu21Var.m65661o(i2);
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: A */
    public final ug5 m91731A() {
        return this.f264811a;
    }

    /* JADX INFO: renamed from: B */
    public final jsh m91732B() {
        yq00 yq00Var = this.f264810U;
        if (yq00Var != null) {
            return yq00Var;
        }
        yq00 yq00Var2 = new yq00(this.f264818h);
        this.f264810U = yq00Var2;
        return yq00Var2;
    }

    /* JADX INFO: renamed from: C */
    public final rsh m91733C() {
        return m91778m();
    }

    /* JADX INFO: renamed from: D */
    public final pgv0 m91734D() {
        if (this.f264790A != 0) {
            return null;
        }
        ArrayList arrayList = this.f264794E;
        if (zn91.m96536X(arrayList)) {
            return (pgv0) edb.m38559h(1, arrayList);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m91735E() {
        if (!m91738H() || this.f264833w) {
            return true;
        }
        pgv0 pgv0VarM91734D = m91734D();
        return (pgv0VarM91734D == null || (pgv0VarM91734D.f177417b & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public final ksh m91736F() {
        if (this.f264812b.mo48471m()) {
            return this.f264806Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m91737G() {
        return this.f264808S;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m91738H() {
        pgv0 pgv0VarM91734D;
        return (this.f264808S || this.f264835y || this.f264833w || (pgv0VarM91734D = m91734D()) == null || (pgv0VarM91734D.f177417b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0132 A[Catch: all -> 0x00b6, TryCatch #10 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x0057, B:9:0x005f, B:11:0x0065, B:12:0x006a, B:13:0x006d, B:24:0x00aa, B:88:0x01f0, B:31:0x00c0, B:32:0x00c3, B:33:0x00c4, B:35:0x00cc, B:37:0x00d2, B:40:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f1, B:50:0x00fb, B:52:0x0108, B:58:0x0124, B:60:0x0132, B:62:0x013d, B:64:0x014e, B:66:0x0154, B:68:0x0167, B:87:0x01ed, B:120:0x023d, B:121:0x0240, B:57:0x0122, B:53:0x0114, B:49:0x00f6, B:122:0x0241), top: B:147:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013d A[Catch: all -> 0x00b6, TryCatch #10 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x0057, B:9:0x005f, B:11:0x0065, B:12:0x006a, B:13:0x006d, B:24:0x00aa, B:88:0x01f0, B:31:0x00c0, B:32:0x00c3, B:33:0x00c4, B:35:0x00cc, B:37:0x00d2, B:40:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f1, B:50:0x00fb, B:52:0x0108, B:58:0x0124, B:60:0x0132, B:62:0x013d, B:64:0x014e, B:66:0x0154, B:68:0x0167, B:87:0x01ed, B:120:0x023d, B:121:0x0240, B:57:0x0122, B:53:0x0114, B:49:0x00f6, B:122:0x0241), top: B:147:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154 A[Catch: all -> 0x00b6, TryCatch #10 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x0057, B:9:0x005f, B:11:0x0065, B:12:0x006a, B:13:0x006d, B:24:0x00aa, B:88:0x01f0, B:31:0x00c0, B:32:0x00c3, B:33:0x00c4, B:35:0x00cc, B:37:0x00d2, B:40:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f1, B:50:0x00fb, B:52:0x0108, B:58:0x0124, B:60:0x0132, B:62:0x013d, B:64:0x014e, B:66:0x0154, B:68:0x0167, B:87:0x01ed, B:120:0x023d, B:121:0x0240, B:57:0x0122, B:53:0x0114, B:49:0x00f6, B:122:0x0241), top: B:147:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x01db A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #2 {all -> 0x0204, blocks: (B:83:0x01d0, B:85:0x01db, B:112:0x022c, B:113:0x022e), top: B:131:0x01d0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: I */
    public final void m91739I(ArrayList arrayList) {
        int i;
        int i2;
        rq00 rq00Var;
        rq00 rq00VarM73117n;
        ArrayList arrayListM75621o;
        nu21 nu21VarM68079f;
        nu21 nu21Var;
        int[] iArr;
        toi0 toi0Var;
        toi0 toi0Var2;
        dkc dkcVar;
        dkc dkcVar2;
        boolean z;
        boolean z2;
        dkc dkcVar3;
        ou21 ou21VarM68952a;
        ?? r1;
        nu21 nu21Var2;
        xq00 xq00Var = this;
        hsh hshVar = xq00Var.f264812b;
        ou21 ou21Var = xq00Var.f264813c;
        dkc dkcVar4 = xq00Var.f264816f;
        qph qphVar = xq00Var.f264802M;
        dkc dkcVar5 = qphVar.f191306b;
        try {
            qphVar.f191306b = dkcVar4;
            dkcVar4.f49953c.m42500p(cql0.f40923c);
            int size = arrayList.size();
            int i3 = 0;
            xq00 xq00Var2 = xq00Var;
            while (i3 < size) {
                pqm0 pqm0Var = (pqm0) arrayList.get(i3);
                q2i0 q2i0Var = (q2i0) pqm0Var.f180350a;
                q2i0 q2i0Var2 = (q2i0) pqm0Var.f180351b;
                rq00 rq00VarM73117n2 = qkg1.m73117n(q2i0Var.f184647e);
                ou21 ou21VarM73870d = qu21.m73870d(q2i0Var.f184646d);
                int iM68076a = ou21VarM73870d.m68076a(rq00VarM73117n2);
                d450 d450Var = new d450();
                qphVar.m73441b();
                frl0 frl0Var = qphVar.f191306b.f49953c;
                frl0Var.m42500p(kpl0.f125088c);
                fag1.m41176y(frl0Var, 0, d450Var, 1, rq00VarM73117n2);
                if (q2i0Var2 == null) {
                    if (ou21VarM73870d.equals(xq00Var2.f264797H)) {
                        if (!xq00Var2.f264798I.f255092w) {
                            vph.m86124a("Check failed");
                        }
                        xq00Var2.m91802z();
                    }
                    nu21 nu21VarM68079f2 = ou21VarM73870d.m68079f();
                    try {
                        nu21VarM68079f2.m65664r(iM68076a);
                        qphVar.f191310f = iM68076a;
                        dkc dkcVar6 = new dkc();
                        tq00 tq00Var = new tq00(xq00Var2, dkcVar6, nu21VarM68079f2, q2i0Var, 0);
                        nu21Var2 = nu21VarM68079f2;
                        try {
                            xq00 xq00Var3 = this;
                            try {
                                xq00Var3.m91745O(null, null, null, lau.f131415a, tq00Var);
                                dkc dkcVar7 = qphVar.f191306b;
                                dkcVar7.getClass();
                                if (dkcVar6.m36267s()) {
                                    frl0 frl0Var2 = dkcVar7.f49953c;
                                    frl0Var2.m42500p(gpl0.f83220c);
                                    fag1.m41176y(frl0Var2, 0, dkcVar6, 1, d450Var);
                                }
                                nu21Var2.m65649c();
                                i = size;
                                i2 = i3;
                                r1 = xq00Var3;
                            } catch (Throwable th) {
                                th = th;
                                nu21Var2.m65649c();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        nu21Var2 = nu21VarM68079f2;
                    }
                } else {
                    p2i0 p2i0VarMo48475q = hshVar.mo48475q(q2i0Var2);
                    ou21 ou21VarM73870d2 = (p2i0VarMo48475q == null || (ou21VarM68952a = p2i0VarMo48475q.m68952a()) == null) ? null : qu21.m73870d(ou21VarM68952a);
                    ou21 ou21VarM73870d3 = ou21VarM73870d2 == null ? qu21.m73870d(q2i0Var2.f184646d) : ou21VarM73870d2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (ou21VarM73870d2 != null) {
                                                                    i = size;
                                                                    if (ou21VarM73870d2.f170152g) {
                                                                        vph.m86124a("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (ou21VarM73870d2.f170147b <= 0) {
                                                                        lfq0.m58913a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList arrayList2 = ou21VarM73870d2.f170154i;
                                                                    i2 = i3;
                                                                    int iM73871e = qu21.m73871e(arrayList2, 0, ou21VarM73870d2.f170147b);
                                                                    if (iM73871e < 0) {
                                                                        rq00Var = new rq00(0);
                                                                        arrayList2.add(-(iM73871e + 1), rq00Var);
                                                                    } else {
                                                                        rq00Var = (rq00) arrayList2.get(iM73871e);
                                                                    }
                                                                    if (rq00Var != null) {
                                                                    }
                                                                    rq00VarM73117n = qkg1.m73117n(rq00Var);
                                                                    arrayListM75621o = riw0.m75621o(ou21VarM73870d3, rq00VarM73117n);
                                                                    if (arrayListM75621o.isEmpty()) {
                                                                        rq00VarM73117n = rq00VarM73117n;
                                                                    } else {
                                                                        dkcVar3 = qphVar.f191306b;
                                                                        dkcVar3.getClass();
                                                                        if (!arrayListM75621o.isEmpty()) {
                                                                            frl0 frl0Var3 = dkcVar3.f49953c;
                                                                            frl0Var3.m42500p(hpl0.f93802c);
                                                                            fag1.m41176y(frl0Var3, 1, arrayListM75621o, 0, d450Var);
                                                                        }
                                                                        if (ou21VarM73870d.equals(ou21Var)) {
                                                                            int iM68076a2 = ou21Var.m68076a(rq00VarM73117n2);
                                                                            xq00Var2.m91787q0(iM68076a2, xq00Var2.m91797v0(iM68076a2) + arrayListM75621o.size());
                                                                        }
                                                                    }
                                                                    frl0 frl0Var4 = qphVar.f191306b.f49953c;
                                                                    frl0Var4.m42500p(ipl0.f104532c);
                                                                    fag1.m41150A(frl0Var4, p2i0VarMo48475q, hshVar, q2i0Var, q2i0Var2);
                                                                    nu21VarM68079f = ou21VarM73870d3.m68079f();
                                                                    nu21Var = xq00Var2.f264796G;
                                                                    iArr = xq00Var2.f264825o;
                                                                    toi0Var = xq00Var2.f264832v;
                                                                    xq00Var2.f264825o = null;
                                                                    xq00Var2.f264832v = null;
                                                                    xq00Var2.f264796G = nu21VarM68079f;
                                                                    int iM68076a3 = ou21VarM73870d3.m68076a(qkg1.m73117n(rq00VarM73117n));
                                                                    nu21VarM68079f.m65664r(iM68076a3);
                                                                    qphVar.f191310f = iM68076a3;
                                                                    dkcVar = new dkc();
                                                                    dkcVar2 = qphVar.f191306b;
                                                                    qphVar.f191306b = dkcVar;
                                                                    z = qphVar.f191309e;
                                                                    qphVar.f191309e = false;
                                                                    msh mshVar = q2i0Var2.f184645c;
                                                                    msh mshVar2 = q2i0Var.f184645c;
                                                                    Integer numValueOf = Integer.valueOf(nu21VarM68079f.f158495g);
                                                                    dkcVar2 = dkcVar2;
                                                                    toi0Var2 = toi0Var;
                                                                    nu21VarM68079f = nu21VarM68079f;
                                                                    z2 = z;
                                                                    xq00Var2.m91745O(mshVar, mshVar2, numValueOf, q2i0Var2.f184648f, new C2570xf(14, xq00Var2, q2i0Var));
                                                                    qphVar.f191309e = z2;
                                                                    qphVar.f191306b = dkcVar2;
                                                                    dkcVar2.getClass();
                                                                    if (dkcVar.m36267s()) {
                                                                        frl0 frl0Var5 = dkcVar2.f49953c;
                                                                        frl0Var5.m42500p(gpl0.f83220c);
                                                                        fag1.m41176y(frl0Var5, 0, dkcVar, 1, d450Var);
                                                                    }
                                                                    xq00Var2.f264796G = nu21Var;
                                                                    xq00Var2.f264825o = iArr;
                                                                    xq00Var2.f264832v = toi0Var2;
                                                                    nu21VarM68079f.m65649c();
                                                                    r1 = xq00Var2;
                                                                } else {
                                                                    i = size;
                                                                    i2 = i3;
                                                                }
                                                                xq00Var2.f264796G = nu21Var;
                                                                xq00Var2.f264825o = iArr;
                                                                xq00Var2.f264832v = toi0Var2;
                                                                nu21VarM68079f.m65649c();
                                                                r1 = xq00Var2;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                nu21VarM68079f.m65649c();
                                                                throw th;
                                                            }
                                                            qphVar.f191306b = dkcVar2;
                                                            dkcVar2.getClass();
                                                            if (dkcVar.m36267s()) {
                                                                frl0 frl0Var6 = dkcVar2.f49953c;
                                                                frl0Var6.m42500p(gpl0.f83220c);
                                                                fag1.m41176y(frl0Var6, 0, dkcVar, 1, d450Var);
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            xq00Var2.f264796G = nu21Var;
                                                            xq00Var2.f264825o = iArr;
                                                            xq00Var2.f264832v = toi0Var2;
                                                            throw th;
                                                        }
                                                        qphVar.f191309e = z2;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        qphVar.f191306b = dkcVar2;
                                                        throw th;
                                                    }
                                                    xq00Var2.m91745O(mshVar, mshVar2, numValueOf, q2i0Var2.f184648f, new C2570xf(14, xq00Var2, q2i0Var));
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    qphVar.f191309e = z2;
                                                    throw th;
                                                }
                                                dkcVar2 = dkcVar2;
                                                toi0Var2 = toi0Var;
                                                nu21VarM68079f = nu21VarM68079f;
                                                z2 = z;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                dkcVar2 = dkcVar2;
                                                toi0Var2 = toi0Var;
                                                z2 = z;
                                                qphVar.f191309e = z2;
                                                throw th;
                                            }
                                            msh mshVar3 = q2i0Var.f184645c;
                                            Integer numValueOf2 = Integer.valueOf(nu21VarM68079f.f158495g);
                                        } catch (Throwable th9) {
                                            th = th9;
                                            toi0Var2 = toi0Var;
                                            dkcVar2 = dkcVar2;
                                        }
                                        msh mshVar4 = q2i0Var2.f184645c;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        toi0Var2 = toi0Var;
                                        z2 = z;
                                        qphVar.f191309e = z2;
                                        throw th;
                                    }
                                    qphVar.f191309e = false;
                                } catch (Throwable th11) {
                                    th = th11;
                                    toi0Var2 = toi0Var;
                                }
                                qphVar.f191306b = dkcVar;
                                z = qphVar.f191309e;
                            } catch (Throwable th12) {
                                th = th12;
                                toi0Var2 = toi0Var;
                                dkcVar2 = dkcVar2;
                                nu21VarM68079f = nu21VarM68079f;
                            }
                            xq00Var2.f264796G = nu21VarM68079f;
                            int iM68076a4 = ou21VarM73870d3.m68076a(qkg1.m73117n(rq00VarM73117n));
                            nu21VarM68079f.m65664r(iM68076a4);
                            qphVar.f191310f = iM68076a4;
                            dkcVar = new dkc();
                            dkcVar2 = qphVar.f191306b;
                        } catch (Throwable th13) {
                            th = th13;
                            toi0Var2 = toi0Var;
                            nu21VarM68079f = nu21VarM68079f;
                        }
                        nu21Var = xq00Var2.f264796G;
                        iArr = xq00Var2.f264825o;
                        toi0Var = xq00Var2.f264832v;
                        xq00Var2.f264825o = null;
                        xq00Var2.f264832v = null;
                    } catch (Throwable th14) {
                        th = th14;
                        nu21VarM68079f = nu21VarM68079f;
                    }
                    rq00Var = q2i0Var2.f184647e;
                    rq00VarM73117n = qkg1.m73117n(rq00Var);
                    arrayListM75621o = riw0.m75621o(ou21VarM73870d3, rq00VarM73117n);
                    if (arrayListM75621o.isEmpty()) {
                        dkcVar3 = qphVar.f191306b;
                        dkcVar3.getClass();
                        if (!arrayListM75621o.isEmpty()) {
                            frl0 frl0Var7 = dkcVar3.f49953c;
                            frl0Var7.m42500p(hpl0.f93802c);
                            fag1.m41176y(frl0Var7, 1, arrayListM75621o, 0, d450Var);
                        }
                        if (ou21VarM73870d.equals(ou21Var)) {
                            int iM68076a5 = ou21Var.m68076a(rq00VarM73117n2);
                            xq00Var2.m91787q0(iM68076a5, xq00Var2.m91797v0(iM68076a5) + arrayListM75621o.size());
                        }
                    } else {
                        rq00VarM73117n = rq00VarM73117n;
                    }
                    frl0 frl0Var8 = qphVar.f191306b.f49953c;
                    frl0Var8.m42500p(ipl0.f104532c);
                    fag1.m41150A(frl0Var8, p2i0VarMo48475q, hshVar, q2i0Var, q2i0Var2);
                    nu21VarM68079f = ou21VarM73870d3.m68079f();
                }
                qphVar.f191306b.f49953c.m42500p(eql0.f61917c);
                i3 = i2 + 1;
                hshVar = hshVar;
                ou21Var = ou21Var;
                size = i;
                xq00Var2 = r1;
            }
            qphVar.m73441b();
            qphVar.f191306b.f49953c.m42500p(opl0.f167967c);
            qphVar.f191310f = 0;
            qphVar.f191306b = dkcVar5;
        } catch (Throwable th15) {
            qphVar.f191306b = dkcVar5;
            throw th15;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m91740J(o2i0 o2i0Var, wpn0 wpn0Var, Object obj, boolean z) {
        m91765f0(126665345, o2i0Var);
        m91742L();
        m91795u0(obj);
        long j = this.f264809T;
        try {
            this.f264809T = 126665345;
            if (this.f264808S) {
                wu21.m88962z(this.f264798I);
            }
            boolean z2 = (this.f264808S || wj50.m88271j(this.f264796G.m65652f(), wpn0Var)) ? false : true;
            if (z2) {
                m91748R(wpn0Var);
            }
            m91759c0(202, vph.f243693c, wpn0Var, 0);
            this.f264800K = null;
            if (!this.f264808S || z) {
                boolean z3 = this.f264833w;
                this.f264833w = z2;
                fyf fyfVarM75763o = rkk.m75763o(new cr3(11, o2i0Var, obj), true, -59194059);
                zn91.m96579u(2, fyfVarM75763o);
                fyfVarM75763o.invoke(this, 1);
                this.f264833w = z3;
            } else {
                this.f264799J = true;
                wu21 wu21Var = this.f264798I;
                this.f264812b.mo48472n(new q2i0(o2i0Var, obj, this.f264818h, this.f264797H, wu21Var.m88988b(wu21Var.m88969G(wu21Var.f255071b, wu21Var.f255091v)), lau.f131415a, m91778m(), null));
            }
            m91788r(false);
            this.f264800K = null;
            this.f264809T = j;
            m91788r(false);
        } catch (Throwable th) {
            try {
                ipg1.m51271i(th, new mo4(this, 24));
                throw th;
            } catch (Throwable th2) {
                m91788r(false);
                this.f264800K = null;
                this.f264809T = j;
                m91788r(false);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final Object m91741K(Object obj, Object obj2) {
        nu21 nu21Var = this.f264796G;
        int i = nu21Var.f158495g;
        Object objM75603F = riw0.m75603F(i < nu21Var.f158496h ? nu21Var.m65662p(nu21Var.f158490b, i) : null, obj, obj2);
        return objM75603F == null ? new xj60(obj, obj2) : objM75603F;
    }

    /* JADX INFO: renamed from: L */
    public final Object m91742L() {
        ia7 ia7Var = t6x0.f217647t;
        if (!this.f264808S) {
            Object objM65659m = this.f264796G.m65659m();
            if (!this.f264835y || (objM65659m instanceof edx0)) {
                return objM65659m;
            }
        } else if (this.f264828r) {
            vph.m86124a("A call to createNode(), emitNode() or useNode() expected");
            return ia7Var;
        }
        return ia7Var;
    }

    /* JADX INFO: renamed from: M */
    public final List m91743M() {
        hsh hshVar = this.f264812b;
        gsh gshVarMo48467i = hshVar.mo48467i();
        msh mshVar = gshVarMo48467i instanceof msh ? (msh) gshVarMo48467i : null;
        if (mshVar != null) {
            ou21 ou21Var = mshVar.f146796f;
            Integer numM48168l = hpg1.m48168l(qu21.m73870d(ou21Var), hshVar);
            if (numM48168l != null) {
                nu21 nu21VarM68079f = qu21.m73870d(ou21Var).m68079f();
                try {
                    return g6f.m43700N0(mshVar.f146786T0.m91743M(), hpg1.m48172p(nu21VarM68079f, numM48168l.intValue(), 0));
                } finally {
                    nu21VarM68079f.m65649c();
                }
            }
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: N */
    public final int m91744N(int i) {
        int iM65663q = this.f264796G.m65663q(i) + 1;
        int i2 = 0;
        while (iM65663q < i) {
            if (!this.f264796G.m65657k(iM65663q)) {
                i2++;
            }
            iM65663q += this.f264796G.f158490b[(iM65663q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: O */
    public final Object m91745O(msh mshVar, msh mshVar2, Integer num, List list, eh00 eh00Var) {
        Object objInvoke;
        boolean z = this.f264795F;
        int i = this.f264821k;
        try {
            this.f264795F = true;
            this.f264821k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                pqm0 pqm0Var = (pqm0) list.get(i2);
                pgv0 pgv0Var = (pgv0) pqm0Var.f180350a;
                Object obj = pqm0Var.f180351b;
                if (obj != null) {
                    m91783o0(pgv0Var, obj);
                } else {
                    m91783o0(pgv0Var, null);
                }
            }
            if (mshVar == null) {
                objInvoke = eh00Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (mshVar2 == null || mshVar2.equals(mshVar) || iIntValue < 0) {
                    objInvoke = eh00Var.invoke();
                } else {
                    mshVar.f146782P0 = mshVar2;
                    mshVar.f146783Q0 = iIntValue;
                    try {
                        objInvoke = eh00Var.invoke();
                        mshVar.f146782P0 = null;
                        mshVar.f146783Q0 = 0;
                    } catch (Throwable th) {
                        mshVar.f146782P0 = null;
                        mshVar.f146783Q0 = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = eh00Var.invoke();
                }
            }
            this.f264795F = z;
            this.f264821k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.f264795F = z;
            this.f264821k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[LOOP:5: B:25:0x0097->B:44:0x00fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:62:0x0151
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: P */
    public final void m91746P() {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.xq00.m91746P():void");
    }

    /* JADX INFO: renamed from: Q */
    public final void m91747Q() {
        m91751U(this.f264796G.f158495g);
        qph qphVar = this.f264802M;
        qphVar.m73443d(false);
        qphVar.m73444e();
        qphVar.f191306b.f49953c.m42500p(aql0.f18274c);
        int i = qphVar.f191310f;
        nu21 nu21Var = qphVar.f191305a.f264796G;
        qphVar.f191310f = nu21Var.f158490b[(nu21Var.f158495g * 5) + 3] + i;
    }

    /* JADX INFO: renamed from: R */
    public final void m91748R(wpn0 wpn0Var) {
        toi0 toi0Var = this.f264832v;
        if (toi0Var == null) {
            toi0Var = new toi0();
            this.f264832v = toi0Var;
        }
        toi0Var.m81201i(this.f264796G.f158495g, wpn0Var);
    }

    /* JADX INFO: renamed from: S */
    public final void m91749S(int i, int i2, int i3) {
        nu21 nu21Var = this.f264796G;
        int iM75628v = riw0.m75628v(nu21Var, i, i2, i3);
        while (i > 0 && i != iM75628v) {
            if (nu21Var.m65658l(i)) {
                this.f264802M.m73440a();
            }
            i = nu21Var.m65663q(i);
        }
        m91786q(i2, iM75628v);
    }

    /* JADX INFO: renamed from: T */
    public final Object m91750T() {
        ia7 ia7Var = t6x0.f217647t;
        if (!this.f264808S) {
            Object objM65659m = this.f264796G.m65659m();
            if (!this.f264835y || (objM65659m instanceof edx0)) {
                return objM65659m instanceof f9w0 ? ((f9w0) objM65659m).mo30283a() : objM65659m;
            }
        } else if (this.f264828r) {
            vph.m86124a("A call to createNode(), emitNode() or useNode() expected");
            return ia7Var;
        }
        return ia7Var;
    }

    /* JADX INFO: renamed from: U */
    public final void m91751U(int i) {
        boolean zM65658l = this.f264796G.m65658l(i);
        qph qphVar = this.f264802M;
        if (zM65658l) {
            qphVar.m73442c();
            Object objM65660n = this.f264796G.m65660n(i);
            qphVar.m73442c();
            qphVar.f191312h.add(objM65660n);
        }
        m91730X(i, i, 0, this, zM65658l);
        qphVar.m73442c();
        if (zM65658l) {
            qphVar.m73440a();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m91752Y(int i, boolean z) {
        pgv0 pgv0VarM91734D;
        if ((i & 1) == 0 && (this.f264808S || this.f264835y)) {
            ej11 ej11Var = this.f264805P;
            if (ej11Var == null || (pgv0VarM91734D = m91734D()) == null || !ej11Var.mo25401f() || (pgv0VarM91734D.f177417b & 512) != 0) {
                return true;
            }
            pgv0VarM91734D.m69930g();
            boolean z2 = this.f264835y;
            int i2 = pgv0VarM91734D.f177417b;
            pgv0VarM91734D.f177417b = (z2 ? i2 | 128 : i2 & (-129)) | 256;
            frl0 frl0Var = this.f264802M.f191306b.f49953c;
            frl0Var.m42500p(zpl0.f285176c);
            fag1.m41175x(frl0Var, 0, pgv0VarM91734D);
            this.f264812b.mo48479u(pgv0VarM91734D);
            return false;
        }
        if (!z && m91738H()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX INFO: renamed from: Z */
    public final void m91753Z() {
        int i;
        long jRotateLeft;
        long jRotateLeft2;
        ia7 ia7Var = t6x0.f217647t;
        if (this.f264829s.isEmpty()) {
            this.f264822l = this.f264796G.m65665s() + this.f264822l;
            return;
        }
        nu21 nu21Var = this.f264796G;
        int iM65653g = nu21Var.m65653g();
        int[] iArr = nu21Var.f158490b;
        int i2 = nu21Var.f158495g;
        Object objM65662p = i2 < nu21Var.f158496h ? nu21Var.m65662p(iArr, i2) : null;
        Object objM65652f = nu21Var.m65652f();
        int i3 = this.f264823m;
        if (objM65662p == null) {
            if (objM65652f == null || iM65653g != 207 || objM65652f.equals(ia7Var)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.f264809T, 3) ^ ((long) iM65653g), 3) ^ ((long) i3);
            } else {
                this.f264809T = Long.rotateLeft(((long) objM65652f.hashCode()) ^ Long.rotateLeft(this.f264809T, 3), 3) ^ ((long) i3);
            }
            m91769h0(null, (iArr[(nu21Var.f158495g * 5) + 1] & 1073741824) != 0);
            m91746P();
            nu21Var.m65651e();
            if (objM65662p != null) {
                if (objM65662p instanceof Enum) {
                    this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) 0), 3) ^ ((long) ((Enum) objM65662p).ordinal()), 3);
                } else {
                    this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) 0), 3) ^ ((long) objM65662p.hashCode()), 3);
                }
            }
            if (objM65652f == null && iM65653g == 207 && !objM65652f.equals(ia7Var)) {
                this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) i3), 3) ^ ((long) objM65652f.hashCode()), 3);
                return;
            } else {
                this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) i3), 3) ^ ((long) iM65653g), 3);
            }
        }
        if (objM65662p instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objM65662p).ordinal()) ^ Long.rotateLeft(this.f264809T, 3), 3);
            i = 0;
        } else {
            i = 0;
            jRotateLeft = Long.rotateLeft(((long) objM65662p.hashCode()) ^ Long.rotateLeft(this.f264809T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i);
        this.f264809T = jRotateLeft2;
        m91769h0(null, (iArr[(nu21Var.f158495g * 5) + 1] & 1073741824) != 0);
        m91746P();
        nu21Var.m65651e();
        if (objM65662p != null) {
            if (objM65652f == null) {
            }
            this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) i3), 3) ^ ((long) iM65653g), 3);
        } else if (objM65662p instanceof Enum) {
            this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) 0), 3) ^ ((long) ((Enum) objM65662p).ordinal()), 3);
        } else {
            this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) 0), 3) ^ ((long) objM65662p.hashCode()), 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m91754a() {
        m91772j();
        this.f264819i.clear();
        this.f264824n.f208958b = 0;
        this.f264830t.f208958b = 0;
        this.f264834x.f208958b = 0;
        this.f264832v = null;
        pez pezVar = this.f264804O;
        pezVar.f176891e.m42497m();
        pezVar.f176890d.m42497m();
        this.f264809T = 0;
        this.f264790A = 0;
        this.f264828r = false;
        this.f264808S = false;
        this.f264835y = false;
        this.f264795F = false;
        this.f264836z = -1;
        nu21 nu21Var = this.f264796G;
        if (!nu21Var.f158494f) {
            nu21Var.m65649c();
        }
        if (this.f264798I.f255092w) {
            return;
        }
        m91802z();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m91755a0() {
        nu21 nu21Var = this.f264796G;
        int i = nu21Var.f158497i;
        this.f264822l = i >= 0 ? nu21Var.f158490b[(i * 5) + 1] & 67108863 : 0;
        nu21Var.m65666t();
    }

    /* JADX INFO: renamed from: b */
    public final void m91756b(Object obj, th00 th00Var) {
        if (this.f264808S) {
            frl0 frl0Var = this.f264804O.f176890d;
            frl0Var.m42500p(lql0.f136086c);
            fag1.m41175x(frl0Var, 0, obj);
            zn91.m96579u(2, th00Var);
            fag1.m41175x(frl0Var, 1, th00Var);
            return;
        }
        qph qphVar = this.f264802M;
        qphVar.m73441b();
        frl0 frl0Var2 = qphVar.f191306b.f49953c;
        frl0Var2.m42500p(lql0.f136086c);
        zn91.m96579u(2, th00Var);
        fag1.m41176y(frl0Var2, 0, obj, 1, th00Var);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m91757b0() {
        if (this.f264822l != 0) {
            vph.m86124a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f264808S) {
            return;
        }
        pgv0 pgv0VarM91734D = m91734D();
        if (pgv0VarM91734D != null) {
            int i = pgv0VarM91734D.f177417b;
            if ((i & 128) == 0) {
                pgv0VarM91734D.f177417b = i | 16;
            }
        }
        if (this.f264829s.isEmpty()) {
            m91755a0();
        } else {
            m91746P();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91758c(double d) {
        Object objM91742L = m91742L();
        if ((objM91742L instanceof Double) && d == ((Number) objM91742L).doubleValue()) {
            return false;
        }
        m91795u0(Double.valueOf(d));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:167:0x0316  */
    /* JADX WARN: Code duplicated, block: B:168:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x031e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0322  */
    /* JADX WARN: Code duplicated, block: B:173:0x0329  */
    /* JADX WARN: Code duplicated, block: B:175:0x032c  */
    /* JADX WARN: Code duplicated, block: B:176:0x032e  */
    /* JADX WARN: Code duplicated, block: B:180:0x035a  */
    /* JADX WARN: Code duplicated, block: B:181:0x035c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    /* JADX INFO: renamed from: c0 */
    public final void m91759c0(int i, Object obj, Object obj2, int i2) {
        long jRotateLeft;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        ar00 ar00Var;
        ar00 ar00Var2;
        ArrayList arrayList;
        toi0 toi0Var;
        int i3;
        Object objValueOf;
        cqi0 cqi0Var;
        Object objM33623g;
        jpi0 jpi0Var;
        wu21 wu21Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        nu21 nu21Var;
        int[] iArr;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        nu21 nu21Var2;
        int i12;
        Object objM65662p;
        wu21 wu21Var2;
        int i13;
        ar00 ar00Var3;
        Object obj4 = obj;
        Object obj5 = t6x0.f217647t;
        if (this.f264828r) {
            vph.m86124a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.f264823m;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f264809T, 3) ^ ((long) i), 3);
                j = i14;
            } else {
                this.f264809T = Long.rotateLeft(Long.rotateLeft(this.f264809T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i14);
            }
            if (obj4 == null) {
                this.f264823m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f264808S) {
                this.f264796G.f158499k++;
                wu21Var2 = this.f264798I;
                i13 = wu21Var2.f255089t;
                if (z) {
                    wu21Var2.m88981S(obj5, obj5, true, i);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    wu21Var2.m88981S(obj4, obj2, false, i);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    wu21Var2.m88981S(obj4, obj5, false, i);
                }
                ar00Var3 = this.f264820j;
                if (ar00Var3 != null) {
                    int i15 = (-2) - i13;
                    hu60 hu60Var = new hu60(i, i15, -1, -1);
                    ar00Var3.f18890e.m81201i(i15, new m520(-1, this.f264821k - ar00Var3.f18887b, 0));
                    ar00Var3.f18889d.add(hu60Var);
                }
                m91801y(z, null);
                return;
            }
            if (i2 != 1 && this.f264835y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f264820j == null) {
                int iM65653g = this.f264796G.m65653g();
                if (!z2 && iM65653g == i) {
                    nu21Var2 = this.f264796G;
                    i12 = nu21Var2.f158495g;
                    if (i12 < nu21Var2.f158496h) {
                        objM65662p = nu21Var2.m65662p(nu21Var2.f158490b, i12);
                    } else {
                        objM65662p = null;
                    }
                    if (wj50.m88271j(obj4, objM65662p)) {
                        m91769h0(obj2, z);
                        z3 = z2;
                    }
                }
                nu21Var = this.f264796G;
                iArr = nu21Var.f158490b;
                arrayList2 = new ArrayList();
                if (nu21Var.f158499k <= 0) {
                    i9 = nu21Var.f158495g;
                    while (i9 < nu21Var.f158496h) {
                        int i16 = i9 * 5;
                        int i17 = iArr[i16];
                        Object objM65662p2 = nu21Var.m65662p(iArr, i9);
                        i10 = iArr[i16 + 1];
                        if ((i10 & 1073741824) != 0) {
                            i11 = 1;
                        } else {
                            i11 = i10 & 67108863;
                        }
                        arrayList2.add(new hu60(i17, i9, objM65662p2, i11));
                        i9 += iArr[i16 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.f264820j = new ar00(this.f264821k, arrayList2);
            } else {
                z3 = z2;
            }
            ar00Var = this.f264820j;
            if (ar00Var != null) {
                arrayList = ar00Var.f18889d;
                toi0Var = ar00Var.f18890e;
                i3 = ar00Var.f18887b;
                if (obj4 != null) {
                    objValueOf = new xj60(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                cqi0Var = ((cai0) ar00Var.f18891f.getValue()).f35822a;
                objM33623g = cqi0Var.m33623g(objValueOf);
                if (objM33623g == null) {
                    objM33623g = null;
                } else if (objM33623g instanceof jpi0) {
                    jpi0Var = (jpi0) objM33623g;
                    Object objM53964k = jpi0Var.m53964k(0);
                    if (jpi0Var.m53961h()) {
                        cqi0Var.m33627k(objValueOf);
                    }
                    if (jpi0Var.f114676b == 1) {
                        cqi0Var.m33629m(objValueOf, jpi0Var.m53958e());
                    }
                    objM33623g = objM53964k;
                } else {
                    cqi0Var.m33627k(objValueOf);
                }
                hu60 hu60Var2 = (hu60) objM33623g;
                if (!z3 || hu60Var2 == null) {
                    this.f264796G.f158499k++;
                    this.f264808S = true;
                    this.f264800K = null;
                    if (this.f264798I.f255092w) {
                        wu21 wu21VarM68080i = this.f264797H.m68080i();
                        this.f264798I = wu21VarM68080i;
                        wu21VarM68080i.m88977O();
                        this.f264799J = false;
                        this.f264800K = null;
                    }
                    this.f264798I.m88990d();
                    wu21Var = this.f264798I;
                    int i18 = wu21Var.f255089t;
                    if (z) {
                        wu21Var.m88981S(obj5, obj5, true, i);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        wu21Var.m88981S(obj5, obj2, false, i);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        wu21Var.m88981S(obj3, obj5, false, i);
                    }
                    this.f264803N = this.f264798I.m88988b(i18);
                    int i19 = (-2) - i18;
                    hu60 hu60Var3 = new hu60(i, i19, -1, -1);
                    toi0Var.m81201i(i19, new m520(-1, this.f264821k - i3, i4));
                    arrayList.add(hu60Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.f264821k;
                    }
                    ar00Var2 = new ar00(i5, arrayList3);
                } else {
                    int i20 = hu60Var2.f95330c;
                    arrayList.add(hu60Var2);
                    m520 m520Var = (m520) toi0Var.m87103b(i20);
                    this.f264821k = (m520Var != null ? m520Var.f140081b : -1) + i3;
                    m520 m520Var2 = (m520) toi0Var.m87103b(i20);
                    int i21 = m520Var2 != null ? m520Var2.f140080a : -1;
                    int i22 = ar00Var.f18888c;
                    int i23 = i21 - i22;
                    int i24 = 8;
                    if (i21 <= i22) {
                        i6 = i23;
                        if (i22 > i21) {
                            Object[] objArr3 = toi0Var.f247488c;
                            long[] jArr = toi0Var.f247486a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j2 = jArr[i25];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j2 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                m520 m520Var3 = (m520) objArr3[(i25 << 3) + i27];
                                                int i28 = m520Var3.f140080a;
                                                if (i28 == i21) {
                                                    m520Var3.f140080a = i22;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i21 + 1 <= i28 && i28 < i22) {
                                                        m520Var3.f140080a = i28 - 1;
                                                    }
                                                }
                                            }
                                            j2 >>= 8;
                                            i27++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = toi0Var.f247488c;
                        long[] jArr2 = toi0Var.f247486a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j3 = jArr2[i29];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j3 & 255) < 128) {
                                            i8 = i24;
                                            m520 m520Var4 = (m520) objArr4[(i29 << 3) + i31];
                                            i7 = i23;
                                            int i32 = m520Var4.f140080a;
                                            if (i32 == i21) {
                                                m520Var4.f140080a = i22;
                                            } else if (i22 <= i32 && i32 < i21) {
                                                m520Var4.f140080a = i32 + 1;
                                            }
                                        } else {
                                            i7 = i23;
                                            i8 = i24;
                                        }
                                        j3 >>= i8;
                                        i31++;
                                        i23 = i7;
                                        i24 = i8;
                                    }
                                    i6 = i23;
                                    if (i30 != i24) {
                                        break;
                                    }
                                } else {
                                    i6 = i23;
                                }
                                if (i29 == length2) {
                                    break;
                                }
                                i29++;
                                i23 = i6;
                                i24 = 8;
                            }
                        } else {
                            i6 = i23;
                        }
                    }
                    qph qphVar = this.f264802M;
                    qphVar.f191310f = (i20 - qphVar.f191305a.f264796G.f158495g) + qphVar.f191310f;
                    this.f264796G.m65664r(i20);
                    if (i6 > 0) {
                        qphVar.m73443d(false);
                        qphVar.m73444e();
                        frl0 frl0Var = qphVar.f191306b.f49953c;
                        frl0Var.m42500p(vpl0.f243725c);
                        frl0Var.f72503f[frl0Var.f72504g - frl0Var.f72501d[frl0Var.f72502e - 1].f201843a] = i6;
                    }
                    m91769h0(obj2, z);
                    ar00Var2 = null;
                }
            } else {
                ar00Var2 = null;
            }
            m91801y(z, ar00Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f264809T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j = 0;
        this.f264809T = jRotateLeft ^ j;
        if (obj4 == null) {
            this.f264823m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f264808S) {
            this.f264796G.f158499k++;
            wu21Var2 = this.f264798I;
            i13 = wu21Var2.f255089t;
            if (z) {
                wu21Var2.m88981S(obj5, obj5, true, i);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                wu21Var2.m88981S(obj4, obj2, false, i);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                wu21Var2.m88981S(obj4, obj5, false, i);
            }
            ar00Var3 = this.f264820j;
            if (ar00Var3 != null) {
                int i110 = (-2) - i13;
                hu60 hu60Var4 = new hu60(i, i110, -1, -1);
                ar00Var3.f18890e.m81201i(i110, new m520(-1, this.f264821k - ar00Var3.f18887b, 0));
                ar00Var3.f18889d.add(hu60Var4);
            }
            m91801y(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f264820j == null) {
            int iM65653g2 = this.f264796G.m65653g();
            if (!z2) {
                nu21Var2 = this.f264796G;
                i12 = nu21Var2.f158495g;
                if (i12 < nu21Var2.f158496h) {
                    objM65662p = nu21Var2.m65662p(nu21Var2.f158490b, i12);
                } else {
                    objM65662p = null;
                }
                if (wj50.m88271j(obj4, objM65662p)) {
                    m91769h0(obj2, z);
                    z3 = z2;
                }
            }
            nu21Var = this.f264796G;
            iArr = nu21Var.f158490b;
            arrayList2 = new ArrayList();
            if (nu21Var.f158499k <= 0) {
                i9 = nu21Var.f158495g;
                while (i9 < nu21Var.f158496h) {
                    int i111 = i9 * 5;
                    int i112 = iArr[i111];
                    Object objM65662p3 = nu21Var.m65662p(iArr, i9);
                    i10 = iArr[i111 + 1];
                    if ((i10 & 1073741824) != 0) {
                        i11 = 1;
                    } else {
                        i11 = i10 & 67108863;
                    }
                    arrayList2.add(new hu60(i112, i9, objM65662p3, i11));
                    i9 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.f264820j = new ar00(this.f264821k, arrayList2);
        } else {
            z3 = z2;
        }
        ar00Var = this.f264820j;
        if (ar00Var != null) {
            arrayList = ar00Var.f18889d;
            toi0Var = ar00Var.f18890e;
            i3 = ar00Var.f18887b;
            if (obj4 != null) {
                objValueOf = new xj60(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            cqi0Var = ((cai0) ar00Var.f18891f.getValue()).f35822a;
            objM33623g = cqi0Var.m33623g(objValueOf);
            if (objM33623g == null) {
                objM33623g = null;
            } else if (objM33623g instanceof jpi0) {
                jpi0Var = (jpi0) objM33623g;
                Object objM53964k2 = jpi0Var.m53964k(0);
                if (jpi0Var.m53961h()) {
                    cqi0Var.m33627k(objValueOf);
                }
                if (jpi0Var.f114676b == 1) {
                    cqi0Var.m33629m(objValueOf, jpi0Var.m53958e());
                }
                objM33623g = objM53964k2;
            } else {
                cqi0Var.m33627k(objValueOf);
            }
            hu60 hu60Var5 = (hu60) objM33623g;
            if (z3) {
            }
            this.f264796G.f158499k++;
            this.f264808S = true;
            this.f264800K = null;
            if (this.f264798I.f255092w) {
                wu21 wu21VarM68080i2 = this.f264797H.m68080i();
                this.f264798I = wu21VarM68080i2;
                wu21VarM68080i2.m88977O();
                this.f264799J = false;
                this.f264800K = null;
            }
            this.f264798I.m88990d();
            wu21Var = this.f264798I;
            int i113 = wu21Var.f255089t;
            if (z) {
                wu21Var.m88981S(obj5, obj5, true, i);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                wu21Var.m88981S(obj5, obj2, false, i);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                wu21Var.m88981S(obj3, obj5, false, i);
            }
            this.f264803N = this.f264798I.m88988b(i113);
            int i114 = (-2) - i113;
            hu60 hu60Var6 = new hu60(i, i114, -1, -1);
            toi0Var.m81201i(i114, new m520(-1, this.f264821k - i3, i4));
            arrayList.add(hu60Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.f264821k;
            }
            ar00Var2 = new ar00(i5, arrayList4);
        } else {
            ar00Var2 = null;
        }
        m91801y(z, ar00Var2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m91760d(float f) {
        Object objM91742L = m91742L();
        if ((objM91742L instanceof Float) && f == ((Number) objM91742L).floatValue()) {
            return false;
        }
        m91795u0(Float.valueOf(f));
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m91761d0() {
        m91759c0(-127, null, null, 0);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91762e(int i) {
        Object objM91742L = m91742L();
        if ((objM91742L instanceof Integer) && i == ((Number) objM91742L).intValue()) {
            return false;
        }
        m91795u0(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m91763e0(int i, mol0 mol0Var) {
        m91759c0(i, mol0Var, null, 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m91764f(long j) {
        Object objM91742L = m91742L();
        if ((objM91742L instanceof Long) && j == ((Number) objM91742L).longValue()) {
            return false;
        }
        m91795u0(Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m91765f0(int i, Object obj) {
        m91759c0(i, obj, null, 0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m91766g(Object obj) {
        if (wj50.m88271j(m91742L(), obj)) {
            return false;
        }
        m91795u0(obj);
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m91767g0() {
        m91759c0(125, null, null, 1);
        this.f264828r = true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m91768h(boolean z) {
        Object objM91742L = m91742L();
        if ((objM91742L instanceof Boolean) && z == ((Boolean) objM91742L).booleanValue()) {
            return false;
        }
        m91795u0(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m91769h0(Object obj, boolean z) {
        if (z) {
            nu21 nu21Var = this.f264796G;
            if (nu21Var.f158499k <= 0) {
                if ((nu21Var.f158490b[(nu21Var.f158495g * 5) + 1] & 1073741824) == 0) {
                    lfq0.m58913a("Expected a node group");
                }
                nu21Var.m65667u();
                return;
            }
            return;
        }
        if (obj != null && this.f264796G.m65652f() != obj) {
            qph qphVar = this.f264802M;
            qphVar.getClass();
            qphVar.m73443d(false);
            frl0 frl0Var = qphVar.f191306b.f49953c;
            frl0Var.m42500p(kql0.f125347c);
            fag1.m41175x(frl0Var, 0, obj);
        }
        this.f264796G.m65667u();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91770i(Object obj) {
        if (m91742L() == obj) {
            return false;
        }
        m91795u0(obj);
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m91771i0(int i) {
        int i2;
        int i3;
        ia7 ia7Var = t6x0.f217647t;
        if (this.f264820j != null) {
            m91759c0(i, null, null, 0);
            return;
        }
        if (this.f264828r) {
            vph.m86124a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f264809T = Long.rotateLeft(Long.rotateLeft(this.f264809T, 3) ^ ((long) i), 3) ^ ((long) this.f264823m);
        this.f264823m++;
        nu21 nu21Var = this.f264796G;
        if (this.f264808S) {
            nu21Var.f158499k++;
            this.f264798I.m88981S(ia7Var, ia7Var, false, i);
            m91801y(false, null);
            return;
        }
        if (nu21Var.m65653g() == i && ((i3 = nu21Var.f158495g) >= nu21Var.f158496h || (nu21Var.f158490b[(i3 * 5) + 1] & 536870912) == 0)) {
            nu21Var.m65667u();
            m91801y(false, null);
            return;
        }
        if (nu21Var.f158499k <= 0 && (i2 = nu21Var.f158495g) != nu21Var.f158496h) {
            int i4 = this.f264821k;
            m91747Q();
            this.f264802M.m73445f(i4, nu21Var.m65665s());
            riw0.m75630x(i2, nu21Var.f158495g, this.f264829s);
        }
        nu21Var.f158499k++;
        this.f264808S = true;
        this.f264800K = null;
        if (this.f264798I.f255092w) {
            wu21 wu21VarM68080i = this.f264797H.m68080i();
            this.f264798I = wu21VarM68080i;
            wu21VarM68080i.m88977O();
            this.f264799J = false;
            this.f264800K = null;
        }
        wu21 wu21Var = this.f264798I;
        wu21Var.m88990d();
        int i5 = wu21Var.f255089t;
        wu21Var.m88981S(ia7Var, ia7Var, false, i);
        this.f264803N = wu21Var.m88988b(i5);
        m91801y(false, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m91772j() {
        this.f264820j = null;
        this.f264821k = 0;
        this.f264822l = 0;
        this.f264809T = 0L;
        this.f264828r = false;
        qph qphVar = this.f264802M;
        qphVar.f191307c = false;
        qphVar.f191308d.f208958b = 0;
        qphVar.f191310f = 0;
        qphVar.f191309e = true;
        qphVar.f191311g = 0;
        qphVar.f191312h.clear();
        qphVar.f191313i = -1;
        qphVar.f191314j = -1;
        qphVar.f191315k = -1;
        qphVar.f191316l = 0;
        this.f264794E.clear();
        this.f264825o = null;
        this.f264826p = null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m91773j0(int i) {
        m91759c0(i, null, null, 0);
    }

    /* JADX INFO: renamed from: k */
    public final Object m91774k(v3t0 v3t0Var) {
        return rqg1.m76244o(m91778m(), v3t0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX INFO: renamed from: k0 */
    public final xq00 m91775k0(int i) {
        pgv0 pgv0Var;
        boolean z;
        m91771i0(i);
        boolean z2 = this.f264808S;
        C1668ai c1668ai = this.f264817g;
        ArrayList arrayList = this.f264794E;
        msh mshVar = this.f264818h;
        if (z2) {
            pgv0 pgv0Var2 = new pgv0(mshVar);
            arrayList.add(pgv0Var2);
            m91795u0(pgv0Var2);
            pgv0Var2.f177420e = this.f264791B;
            pgv0Var2.f177417b &= -17;
            c1668ai.m26044w();
            return this;
        }
        sl50 sl50VarM75629w = riw0.m75629w(this.f264796G.f158497i, this.f264829s);
        Object objM65659m = this.f264796G.m65659m();
        if (wj50.m88271j(objM65659m, t6x0.f217647t)) {
            pgv0Var = new pgv0(mshVar);
            m91795u0(pgv0Var);
        } else {
            pgv0Var = (pgv0) objM65659m;
        }
        if (sl50VarM75629w == null) {
            int i2 = pgv0Var.f177417b;
            boolean z3 = (i2 & 64) != 0;
            if (z3) {
                pgv0Var.f177417b = i2 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i3 = pgv0Var.f177417b;
        pgv0Var.f177417b = z ? i3 | 8 : i3 & (-9);
        arrayList.add(pgv0Var);
        pgv0Var.f177420e = this.f264791B;
        pgv0Var.f177417b &= -17;
        c1668ai.m26044w();
        int i4 = pgv0Var.f177417b;
        if ((i4 & 256) != 0) {
            pgv0Var.f177417b = (i4 & (-257)) | 512;
            frl0 frl0Var = this.f264802M.f191306b.f49953c;
            frl0Var.m42500p(fql0.f72233c);
            fag1.m41175x(frl0Var, 0, pgv0Var);
            if (!this.f264835y) {
                int i5 = pgv0Var.f177417b;
                if ((i5 & 128) != 0) {
                    this.f264835y = true;
                    this.f264836z = this.f264796G.f158497i;
                    pgv0Var.f177417b = i5 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final void m91776l(eh00 eh00Var) {
        if (!this.f264828r) {
            vph.m86124a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f264828r = false;
        if (!this.f264808S) {
            vph.m86124a("createNode() can only be called when inserting");
        }
        sgz sgzVar = this.f264824n;
        int i = ((int[]) sgzVar.f208959c)[sgzVar.f208958b - 1];
        wu21 wu21Var = this.f264798I;
        rq00 rq00VarM88988b = wu21Var.m88988b(wu21Var.f255091v);
        this.f264822l++;
        pez pezVar = this.f264804O;
        frl0 frl0Var = pezVar.f176890d;
        frl0Var.m42500p(spl0.f212895d);
        fag1.m41175x(frl0Var, 0, eh00Var);
        frl0Var.f72503f[frl0Var.f72504g - frl0Var.f72501d[frl0Var.f72502e - 1].f201843a] = i;
        fag1.m41175x(frl0Var, 1, rq00VarM88988b);
        frl0 frl0Var2 = pezVar.f176891e;
        frl0Var2.m42500p(spl0.f212896e);
        frl0Var2.f72503f[frl0Var2.f72504g - frl0Var2.f72501d[frl0Var2.f72502e - 1].f201843a] = i;
        fag1.m41175x(frl0Var2, 0, rq00VarM88988b);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m91777l0(Object obj) {
        if (!this.f264808S && this.f264796G.m65653g() == 207 && !wj50.m88271j(this.f264796G.m65652f(), obj) && this.f264836z < 0) {
            this.f264836z = this.f264796G.f158495g;
            this.f264835y = true;
        }
        m91759c0(207, null, obj, 0);
    }

    /* JADX INFO: renamed from: m */
    public final wpn0 m91778m() {
        wpn0 wpn0Var = this.f264800K;
        return wpn0Var != null ? wpn0Var : m91780n(this.f264796G.f158497i);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m91779m0() {
        m91759c0(125, null, null, 2);
        this.f264828r = true;
    }

    /* JADX INFO: renamed from: n */
    public final wpn0 m91780n(int i) {
        wpn0 wpn0Var;
        boolean z = this.f264808S;
        mol0 mol0Var = vph.f243693c;
        if (z && this.f264799J) {
            int iM88969G = this.f264798I.f255091v;
            while (iM88969G > 0) {
                if (this.f264798I.m89004s(iM88969G) == 202 && wj50.m88271j(this.f264798I.m89005t(iM88969G), mol0Var)) {
                    wpn0 wpn0Var2 = (wpn0) this.f264798I.m89002q(iM88969G);
                    this.f264800K = wpn0Var2;
                    return wpn0Var2;
                }
                wu21 wu21Var = this.f264798I;
                iM88969G = wu21Var.m88969G(wu21Var.f255071b, iM88969G);
            }
        }
        if (this.f264796G.f158491c > 0) {
            while (i > 0) {
                if (this.f264796G.m65655i(i) == 202) {
                    nu21 nu21Var = this.f264796G;
                    if (wj50.m88271j(nu21Var.m65662p(nu21Var.f158490b, i), mol0Var)) {
                        toi0 toi0Var = this.f264832v;
                        if (toi0Var == null || (wpn0Var = (wpn0) toi0Var.m87103b(i)) == null) {
                            nu21 nu21Var2 = this.f264796G;
                            wpn0Var = (wpn0) nu21Var2.m65648b(nu21Var2.f158490b, i);
                        }
                        this.f264800K = wpn0Var;
                        return wpn0Var;
                    }
                }
                i = this.f264796G.m65663q(i);
            }
        }
        wpn0 wpn0Var3 = this.f264831u;
        this.f264800K = wpn0Var3;
        return wpn0Var3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n0 */
    public final void m91781n0() {
        this.f264823m = 0;
        this.f264796G = this.f264813c.m68079f();
        m91759c0(100, null, null, 0);
        hsh hshVar = this.f264812b;
        hshVar.mo48482x();
        wpn0 wpn0VarMo48468j = hshVar.mo48468j();
        this.f264834x.m78119f(this.f264833w ? 1 : 0);
        this.f264833w = m91766g(wpn0VarMo48468j);
        this.f264800K = null;
        if (!this.f264827q) {
            this.f264827q = hshVar.mo48464f();
        }
        if (!this.f264792C) {
            this.f264792C = hshVar.mo48465g();
        }
        if (this.f264792C) {
            wpn0VarMo48468j = ((vpn0) wpn0VarMo48468j).m86165h(lsh.m59835a(), new cz41(m91736F()));
        }
        this.f264831u = wpn0VarMo48468j;
        Set set = (Set) rqg1.m76244o(wpn0VarMo48468j, qz40.f194111a);
        if (set != null) {
            set.add(m91732B());
            hshVar.mo48477s(set);
        }
        m91759c0(Long.hashCode(hshVar.mo48466h()), null, null, 0);
    }

    /* JADX INFO: renamed from: o */
    public final joh m91782o() {
        if (!this.f264812b.mo48471m()) {
            return null;
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.addAll(hpg1.m48166j(this.f264798I));
        ro80VarM44508o.addAll(hpg1.m48164h(this.f264796G));
        ro80VarM44508o.addAll(m91743M());
        return new joh(geg1.m44506m(ro80VarM44508o), this.f264792C);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m91783o0(pgv0 pgv0Var, Object obj) {
        rq00 rq00Var = pgv0Var.f177418c;
        if (rq00Var == null) {
            return false;
        }
        int iM68076a = this.f264796G.f158489a.m68076a(qkg1.m73117n(rq00Var));
        if (!this.f264795F || iM68076a < this.f264796G.f158495g) {
            return false;
        }
        riw0.m75626t(this.f264829s, iM68076a, pgv0Var, obj);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m91784p(cqi0 cqi0Var, th00 th00Var) {
        ArrayList arrayList = this.f264829s;
        if (this.f264795F) {
            vph.m86124a("Reentrant composition is not supported");
        }
        bxb bxbVarM26044w = this.f264817g.m26044w();
        th1.m80803e("Compose:recompose");
        try {
            this.f264791B = Long.hashCode(ua31.m82674j().mo28818g());
            this.f264832v = null;
            m91785p0(cqi0Var);
            this.f264821k = 0;
            this.f264795F = true;
            try {
                m91781n0();
                Object objM91742L = m91742L();
                if (objM91742L != th00Var && th00Var != null) {
                    m91795u0(th00Var);
                }
                wq00 wq00Var = this.f264793D;
                qqi0 qqi0VarM77673l = sam.m77673l();
                try {
                    qqi0VarM77673l.m73556b(wq00Var);
                    mol0 mol0Var = vph.f243691a;
                    if (th00Var != null) {
                        m91763e0(200, mol0Var);
                        zn91.m96579u(2, th00Var);
                        th00Var.invoke(this, 1);
                        m91788r(false);
                    } else if (!this.f264833w || objM91742L == null || objM91742L.equals(t6x0.f217647t)) {
                        m91753Z();
                    } else {
                        m91763e0(200, mol0Var);
                        zn91.m96579u(2, objM91742L);
                        th00 th00Var2 = (th00) objM91742L;
                        zn91.m96579u(2, th00Var2);
                        th00Var2.invoke(this, 1);
                        m91788r(false);
                    }
                    qqi0VarM77673l.m73565l(qqi0VarM77673l.f191610c - 1);
                    m91800x();
                    if (bxbVarM26044w != null) {
                        bxbVarM26044w.m30779J();
                    }
                    this.f264795F = false;
                    arrayList.clear();
                    if (!this.f264798I.f255092w) {
                        vph.m86124a("Check failed");
                    }
                    m91802z();
                    th1.m80805g();
                } catch (Throwable th) {
                    qqi0VarM77673l.m73565l(qqi0VarM77673l.f191610c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    ipg1.m51271i(th2, new es3(this, 1));
                    throw th2;
                } catch (Throwable th3) {
                    if (bxbVarM26044w != null) {
                        bxbVarM26044w.m30779J();
                    }
                    this.f264795F = false;
                    arrayList.clear();
                    m91754a();
                    if (!this.f264798I.f255092w) {
                        vph.m86124a("Check failed");
                    }
                    m91802z();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th1.m80805g();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[LOOP:1: B:20:0x0042->B:35:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[EDGE_INSN: B:43:0x0092->B:36:0x0092 BREAK  A[LOOP:1: B:20:0x0042->B:35:0x008f], SYNTHETIC] */
    /* JADX INFO: renamed from: p0 */
    public final void m91785p0(cqi0 cqi0Var) {
        ArrayList arrayList = this.f264829s;
        for (int iM46714K = h6f.m46714K(arrayList); -1 < iM46714K; iM46714K--) {
            sl50 sl50Var = (sl50) arrayList.get(iM46714K);
            rq00 rq00Var = sl50Var.f210300a.f177418c;
            rq00 rq00VarM73117n = rq00Var != null ? qkg1.m73117n(rq00Var) : null;
            if (rq00VarM73117n == null || !rq00VarM73117n.m76206a()) {
                arrayList.remove(iM46714K);
            } else {
                int i = sl50Var.f210301b;
                int i2 = rq00VarM73117n.f201675a;
                if (i != i2) {
                    sl50Var.f210301b = i2;
                }
            }
        }
        Object[] objArr = cqi0Var.f40897b;
        Object[] objArr2 = cqi0Var.f40898c;
        long[] jArr = cqi0Var.f40896a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            pgv0 pgv0Var = (pgv0) obj;
                            rq00 rq00Var2 = pgv0Var.f177418c;
                            if (rq00Var2 != null) {
                                int i7 = qkg1.m73117n(rq00Var2).f201675a;
                                if (obj2 == unq0.f232230X) {
                                    obj2 = null;
                                }
                                arrayList.add(new sl50(pgv0Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        j6f.m52572d0(arrayList, riw0.f199644a);
    }

    /* JADX INFO: renamed from: q */
    public final void m91786q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m91786q(this.f264796G.m65663q(i), i2);
        if (this.f264796G.m65658l(i)) {
            Object objM65660n = this.f264796G.m65660n(i);
            qph qphVar = this.f264802M;
            qphVar.m73442c();
            qphVar.f191312h.add(objM65660n);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m91787q0(int i, int i2) {
        if (m91797v0(i) != i2) {
            if (i < 0) {
                roi0 roi0Var = this.f264826p;
                if (roi0Var == null) {
                    roi0Var = new roi0();
                    this.f264826p = roi0Var;
                }
                roi0Var.m76059f(i, i2);
                return;
            }
            int[] iArr = this.f264825o;
            if (iArr == null) {
                iArr = new int[this.f264796G.f158491c];
                bk5.m29579B0(-1, 0, 6, iArr);
                this.f264825o = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x038d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public final void m91788r(boolean z) {
        long jRotateRight;
        sgz sgzVar;
        int i;
        ArrayList arrayList;
        int i2;
        ?? r4;
        int i3;
        sgz sgzVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i8;
        int i9;
        Object[] objArr;
        long[] jArr;
        int i10;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        int i12;
        long[] jArr3;
        int i13;
        int i14;
        long[] jArr4;
        long jRotateRight2;
        ia7 ia7Var = t6x0.f217647t;
        sgz sgzVar3 = this.f264824n;
        int i15 = ((int[]) sgzVar3.f208959c)[sgzVar3.f208958b - 2] - 1;
        if (this.f264808S) {
            wu21 wu21Var = this.f264798I;
            int i16 = wu21Var.f255091v;
            int iM89004s = wu21Var.m89004s(i16);
            Object objM89005t = this.f264798I.m89005t(i16);
            Object objM89002q = this.f264798I.m89002q(i16);
            if (objM89005t != null) {
                jRotateRight2 = Long.rotateRight(this.f264809T ^ ((long) 0), 3) ^ ((long) (objM89005t instanceof Enum ? ((Enum) objM89005t).ordinal() : objM89005t.hashCode()));
            } else if (objM89002q == null || iM89004s != 207 || objM89002q.equals(ia7Var)) {
                jRotateRight2 = ((long) iM89004s) ^ Long.rotateRight(this.f264809T ^ ((long) i15), 3);
            } else {
                this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) i15), 3) ^ ((long) objM89002q.hashCode()), 3);
            }
            this.f264809T = Long.rotateRight(jRotateRight2, 3);
        } else {
            nu21 nu21Var = this.f264796G;
            int i17 = nu21Var.f158497i;
            int iM65655i = nu21Var.m65655i(i17);
            nu21 nu21Var2 = this.f264796G;
            Object objM65662p = nu21Var2.m65662p(nu21Var2.f158490b, i17);
            nu21 nu21Var3 = this.f264796G;
            Object objM65648b = nu21Var3.m65648b(nu21Var3.f158490b, i17);
            if (objM65662p != null) {
                jRotateRight = Long.rotateRight(this.f264809T ^ ((long) 0), 3) ^ ((long) (objM65662p instanceof Enum ? ((Enum) objM65662p).ordinal() : objM65662p.hashCode()));
            } else if (objM65648b == null || iM65655i != 207 || objM65648b.equals(ia7Var)) {
                jRotateRight = ((long) iM65655i) ^ Long.rotateRight(this.f264809T ^ ((long) i15), 3);
            } else {
                this.f264809T = Long.rotateRight(Long.rotateRight(this.f264809T ^ ((long) i15), 3) ^ ((long) objM65648b.hashCode()), 3);
            }
            this.f264809T = Long.rotateRight(jRotateRight, 3);
        }
        int i18 = this.f264822l;
        ar00 ar00Var = this.f264820j;
        ArrayList arrayList4 = this.f264829s;
        qph qphVar = this.f264802M;
        if (ar00Var != null) {
            toi0 toi0Var = ar00Var.f18890e;
            int i19 = ar00Var.f18887b;
            ArrayList arrayList5 = ar00Var.f18886a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = ar00Var.f18889d;
                HashSet hashSetM41465m = fem.m41465m(arrayList6);
                dqi0 dqi0Var = sdy0.f208112a;
                dqi0 dqi0Var2 = new dqi0();
                int size = arrayList6.size();
                i2 = -1;
                int size2 = arrayList5.size();
                i = 1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < size2) {
                    hu60 hu60Var = (hu60) arrayList5.get(i20);
                    if (hashSetM41465m.contains(hu60Var)) {
                        sgzVar2 = sgzVar3;
                        i4 = i20;
                        if (!dqi0Var2.m36644c(hu60Var)) {
                            int i23 = i21;
                            if (i23 < size) {
                                hu60 hu60Var2 = (hu60) arrayList6.get(i23);
                                if (hu60Var2 != hu60Var) {
                                    m520 m520Var = (m520) toi0Var.m87103b(hu60Var2.f95330c);
                                    int i24 = m520Var != null ? m520Var.f140081b : -1;
                                    dqi0Var2.m36642a(hu60Var2);
                                    i8 = i22;
                                    if (i24 != i8) {
                                        m520 m520Var2 = (m520) toi0Var.m87103b(hu60Var2.f95330c);
                                        int i25 = m520Var2 != null ? m520Var2.f140082c : hu60Var2.f95331d;
                                        i5 = size2;
                                        int i26 = i24 + i19;
                                        i6 = size;
                                        int i27 = i8 + i19;
                                        if (i25 > 0) {
                                            i7 = i19;
                                            int i28 = qphVar.f191316l;
                                            if (i28 > 0) {
                                                arrayList2 = arrayList5;
                                                if (qphVar.f191314j == i26 - i28 && qphVar.f191315k == i27 - i28) {
                                                    qphVar.f191316l = i28 + i25;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            qphVar.m73442c();
                                            qphVar.f191314j = i26;
                                            qphVar.f191315k = i27;
                                            qphVar.f191316l = i25;
                                        } else {
                                            i7 = i19;
                                            arrayList2 = arrayList5;
                                            qphVar.getClass();
                                        }
                                        if (i24 <= i8) {
                                            int i29 = i25;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSetM41465m;
                                            if (i8 > i24) {
                                                Object[] objArr3 = toi0Var.f247488c;
                                                long[] jArr5 = toi0Var.f247486a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i30 = 0;
                                                    while (true) {
                                                        long j = jArr5[i30];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i31 = 8 - ((~(i30 - length)) >>> 31);
                                                            int i32 = 0;
                                                            while (i32 < i31) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr3;
                                                                    m520 m520Var3 = (m520) objArr3[(i30 << 3) + i32];
                                                                    jArr2 = jArr5;
                                                                    int i33 = m520Var3.f140081b;
                                                                    i11 = i24;
                                                                    if (i24 <= i33 && i33 < i11 + i29) {
                                                                        m520Var3.f140081b = (i33 - i11) + i8;
                                                                    } else if (i11 + 1 <= i33 && i33 < i8) {
                                                                        m520Var3.f140081b = i33 - i29;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr3;
                                                                    jArr2 = jArr5;
                                                                    i11 = i24;
                                                                }
                                                                j >>= 8;
                                                                i32++;
                                                                jArr5 = jArr2;
                                                                objArr3 = objArr2;
                                                                i24 = i11;
                                                            }
                                                            objArr = objArr3;
                                                            jArr = jArr5;
                                                            i10 = i24;
                                                            if (i31 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr3;
                                                            jArr = jArr5;
                                                            i10 = i24;
                                                        }
                                                        if (i30 == length) {
                                                            break;
                                                        }
                                                        i30++;
                                                        jArr5 = jArr;
                                                        objArr3 = objArr;
                                                        i24 = i10;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr4 = toi0Var.f247488c;
                                            long[] jArr6 = toi0Var.f247486a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSetM41465m;
                                                int i34 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i34];
                                                    arrayList4 = arrayList4;
                                                    Object[] objArr5 = objArr4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i34 - length2)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j2 & 255) < 128) {
                                                                i13 = i25;
                                                                m520 m520Var4 = (m520) objArr5[(i34 << 3) + i36];
                                                                i14 = i36;
                                                                int i37 = m520Var4.f140081b;
                                                                jArr4 = jArr6;
                                                                if (i24 <= i37 && i37 < i24 + i13) {
                                                                    m520Var4.f140081b = (i37 - i24) + i8;
                                                                } else if (i8 <= i37 && i37 < i24) {
                                                                    m520Var4.f140081b = i37 + i13;
                                                                }
                                                            } else {
                                                                i13 = i25;
                                                                i14 = i36;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i36 = i14 + 1;
                                                            i25 = i13;
                                                            jArr6 = jArr4;
                                                        }
                                                        i12 = i25;
                                                        jArr3 = jArr6;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        i12 = i25;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i34 == length2) {
                                                        break;
                                                    }
                                                    i34++;
                                                    arrayList4 = arrayList4;
                                                    objArr4 = objArr5;
                                                    i25 = i12;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i9 = i4;
                                    } else {
                                        i5 = size2;
                                        i6 = size;
                                        i7 = i19;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSetM41465m;
                                    i9 = i4;
                                } else {
                                    arrayList4 = arrayList4;
                                    i5 = size2;
                                    i6 = size;
                                    i7 = i19;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSetM41465m;
                                    i8 = i22;
                                    i9 = i4 + 1;
                                }
                                i21 = i23 + 1;
                                m520 m520Var5 = (m520) toi0Var.m87103b(hu60Var2.f95330c);
                                int i38 = i8 + (m520Var5 != null ? m520Var5.f140082c : hu60Var2.f95331d);
                                i20 = i9;
                                ar00Var = ar00Var;
                                size2 = i5;
                                size = i6;
                                i19 = i7;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSetM41465m = hashSet;
                                arrayList4 = arrayList4;
                                i22 = i38;
                                sgzVar3 = sgzVar2;
                            } else {
                                i21 = i23;
                                sgzVar3 = sgzVar2;
                                i20 = i4;
                            }
                        }
                    } else {
                        sgzVar2 = sgzVar3;
                        m520 m520Var6 = (m520) toi0Var.m87103b(hu60Var.f95330c);
                        int i39 = m520Var6 != null ? m520Var6.f140081b : -1;
                        int i40 = hu60Var.f95330c;
                        i4 = i20;
                        qphVar.m73445f(i39 + i19, hu60Var.f95331d);
                        ar00Var.m26909a(i40, 0);
                        qphVar.f191310f = (i40 - qphVar.f191305a.f264796G.f158495g) + qphVar.f191310f;
                        this.f264796G.m65664r(i40);
                        m91747Q();
                        this.f264796G.m65665s();
                        riw0.m75630x(i40, this.f264796G.f158490b[(i40 * 5) + 3] + i40, arrayList4);
                    }
                    i20 = i4 + 1;
                    sgzVar3 = sgzVar2;
                }
                sgzVar = sgzVar3;
                arrayList = arrayList4;
                qphVar.m73442c();
                if (arrayList5.size() > 0) {
                    nu21 nu21Var4 = this.f264796G;
                    qphVar.f191310f = (nu21Var4.f158496h - qphVar.f191305a.f264796G.f158495g) + qphVar.f191310f;
                    nu21Var4.m65666t();
                }
            } else {
                sgzVar = sgzVar3;
                i = 1;
                arrayList = arrayList4;
                i2 = -1;
            }
        } else {
            sgzVar = sgzVar3;
            i = 1;
            arrayList = arrayList4;
            i2 = -1;
        }
        boolean z2 = this.f264808S;
        if (!z2) {
            nu21 nu21Var5 = this.f264796G;
            int i41 = nu21Var5.f158501m - nu21Var5.f158500l;
            if (i41 > 0) {
                if (i41 > 0) {
                    qphVar.m73443d(false);
                    qphVar.m73444e();
                    frl0 frl0Var = qphVar.f191306b.f49953c;
                    frl0Var.m42500p(jql0.f114926c);
                    frl0Var.f72503f[frl0Var.f72504g - frl0Var.f72501d[frl0Var.f72502e - 1].f201843a] = i41;
                } else {
                    qphVar.getClass();
                }
            }
        }
        int i42 = this.f264821k;
        while (true) {
            nu21 nu21Var6 = this.f264796G;
            if (nu21Var6.f158499k > 0 || (i3 = nu21Var6.f158495g) == nu21Var6.f158496h) {
                break;
            }
            m91747Q();
            qphVar.m73445f(i42, this.f264796G.m65665s());
            riw0.m75630x(i3, this.f264796G.f158495g, arrayList);
        }
        if (z2) {
            if (z) {
                pez pezVar = this.f264804O;
                frl0 frl0Var2 = pezVar.f176891e;
                if (frl0Var2.f72502e == 0) {
                    vph.m86124a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                frl0 frl0Var3 = pezVar.f176890d;
                rql0[] rql0VarArr = frl0Var2.f72501d;
                int i43 = frl0Var2.f72502e - 1;
                frl0Var2.f72502e = i43;
                rql0 rql0Var = rql0VarArr[i43];
                rql0VarArr[i43] = null;
                frl0Var3.m42500p(rql0Var);
                Object[] objArr6 = frl0Var2.f72505h;
                Object[] objArr7 = frl0Var3.f72505h;
                int i44 = frl0Var3.f72506i;
                int i45 = rql0Var.f201844b;
                int i46 = frl0Var2.f72506i;
                int i47 = i46 - i45;
                System.arraycopy(objArr6, i47, objArr7, i44 - i45, i46 - i47);
                Object[] objArr8 = frl0Var2.f72505h;
                int i48 = frl0Var2.f72506i;
                bk5.m29578A0(objArr8, null, i48 - i45, i48);
                int[] iArr = frl0Var2.f72503f;
                int[] iArr2 = frl0Var3.f72503f;
                int i49 = frl0Var3.f72504g;
                int i50 = rql0Var.f201843a;
                int i51 = frl0Var2.f72504g;
                bk5.m29627o0(i49 - i50, i51 - i50, i51, iArr, iArr2);
                frl0Var2.f72506i -= i45;
                frl0Var2.f72504g -= i50;
                i18 = i;
            }
            nu21 nu21Var7 = this.f264796G;
            if (nu21Var7.f158499k <= 0) {
                lfq0.m58913a("Unbalanced begin/end empty");
            }
            nu21Var7.f158499k--;
            wu21 wu21Var2 = this.f264798I;
            int i52 = wu21Var2.f255091v;
            wu21Var2.m88995j();
            if (this.f264796G.f158499k <= 0) {
                int i53 = (-2) - i52;
                this.f264798I.m88996k();
                this.f264798I.m88991e(i);
                rq00 rq00Var = this.f264803N;
                if (this.f264804O.f176890d.m42499o()) {
                    ou21 ou21Var = this.f264797H;
                    qphVar.m73441b();
                    qphVar.m73443d(false);
                    qphVar.m73444e();
                    qphVar.m73442c();
                    frl0 frl0Var4 = qphVar.f191306b.f49953c;
                    frl0Var4.m42500p(tpl0.f222564c);
                    fag1.m41176y(frl0Var4, 0, rq00Var, 1, ou21Var);
                    r4 = 0;
                } else {
                    ou21 ou21Var2 = this.f264797H;
                    pez pezVar2 = this.f264804O;
                    qphVar.m73441b();
                    qphVar.m73443d(false);
                    qphVar.m73444e();
                    qphVar.m73442c();
                    frl0 frl0Var5 = qphVar.f191306b.f49953c;
                    frl0Var5.m42500p(upl0.f232728c);
                    fag1.m41177z(frl0Var5, rq00Var, ou21Var2, pezVar2);
                    this.f264804O = new pez();
                    r4 = 0;
                }
                this.f264808S = r4;
                if (this.f264813c.f170147b != 0) {
                    m91787q0(i53, r4);
                    m91789r0(i53, i18);
                }
            }
        } else {
            if (z) {
                qphVar.m73440a();
            }
            int i54 = qphVar.f191305a.f264796G.f158497i;
            sgz sgzVar4 = qphVar.f191308d;
            int i55 = i2;
            if (sgzVar4.m78117d(i55) > i54) {
                vph.m86124a("Missed recording an endGroup");
            }
            if (sgzVar4.m78117d(i55) == i54) {
                qphVar.m73443d(false);
                sgzVar4.m78118e();
                qphVar.f191306b.f49953c.m42500p(npl0.f157029c);
            }
            int i56 = this.f264796G.f158497i;
            if (i18 != m91797v0(i56)) {
                m91789r0(i56, i18);
            }
            if (z) {
                i18 = 1;
            }
            this.f264796G.m65651e();
            qphVar.m73442c();
        }
        ar00 ar00Var2 = (ar00) zn91.m96554h0(this.f264819i);
        if (ar00Var2 != null && !z2) {
            ar00Var2.f18888c++;
        }
        this.f264820j = ar00Var2;
        this.f264821k = sgzVar.m78118e() + i18;
        this.f264823m = sgzVar.m78118e();
        this.f264822l = sgzVar.m78118e() + i18;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m91789r0(int i, int i2) {
        int iM91797v0 = m91797v0(i);
        if (iM91797v0 != i2) {
            int i3 = i2 - iM91797v0;
            ArrayList arrayList = this.f264819i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM91797v1 = m91797v0(i) + i3;
                m91787q0(i, iM91797v1);
                for (int i4 = size; -1 < i4; i4--) {
                    ar00 ar00Var = (ar00) arrayList.get(i4);
                    if (ar00Var != null && ar00Var.m26909a(i, iM91797v1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f264796G.f158497i;
                } else if (this.f264796G.m65658l(i)) {
                    return;
                } else {
                    i = this.f264796G.m65663q(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m91790s() {
        m91788r(false);
        pgv0 pgv0VarM91734D = m91734D();
        if (pgv0VarM91734D != null) {
            int i = pgv0VarM91734D.f177417b;
            if ((i & 1) != 0) {
                pgv0VarM91734D.f177417b = i | 2;
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final vpn0 m91791s0(wpn0 wpn0Var, vpn0 vpn0Var) {
        upn0 upn0VarBuilder = ((vpn0) wpn0Var).builder();
        upn0VarBuilder.putAll(vpn0Var);
        vpn0 vpn0VarM83729g = upn0VarBuilder.build();
        m91763e0(204, vph.f243694d);
        m91742L();
        m91795u0(vpn0VarM83729g);
        m91742L();
        m91795u0(vpn0Var);
        m91788r(false);
        return vpn0VarM83729g;
    }

    /* JADX INFO: renamed from: t */
    public final void m91792t() {
        m91788r(true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m91793t0(Object obj) {
        if (obj instanceof e9w0) {
            br00 br00Var = new br00((e9w0) obj, this.f264823m - 1);
            if (this.f264808S) {
                frl0 frl0Var = this.f264802M.f191306b.f49953c;
                frl0Var.m42500p(ypl0.f274987c);
                fag1.m41175x(frl0Var, 0, br00Var);
            }
            this.f264814d.add(obj);
            obj = br00Var;
        }
        m91795u0(obj);
    }

    /* JADX INFO: renamed from: u */
    public final void m91794u() {
        m91788r(false);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m91795u0(Object obj) {
        if (this.f264808S) {
            this.f264798I.m88983U(obj);
            return;
        }
        nu21 nu21Var = this.f264796G;
        boolean z = nu21Var.f158502n;
        qph qphVar = this.f264802M;
        if (!z) {
            rq00 rq00VarM65647a = nu21Var.m65647a(nu21Var.f158497i);
            frl0 frl0Var = qphVar.f191306b.f49953c;
            frl0Var.m42500p(fpl0.f71931c);
            fag1.m41176y(frl0Var, 0, rq00VarM65647a, 1, obj);
            return;
        }
        int iM73868b = (nu21Var.f158500l - qu21.m73868b(nu21Var.f158490b, nu21Var.f158497i)) - 1;
        if (qphVar.f191305a.f264796G.f158497i - qphVar.f191310f >= 0) {
            qphVar.m73443d(true);
            frl0 frl0Var2 = qphVar.f191306b.f49953c;
            frl0Var2.m42500p(mql0.f146311c);
            fag1.m41175x(frl0Var2, 0, obj);
            frl0Var2.f72503f[frl0Var2.f72504g - frl0Var2.f72501d[frl0Var2.f72502e - 1].f201843a] = iM73868b;
            return;
        }
        nu21 nu21Var2 = this.f264796G;
        rq00 rq00VarM65647a2 = nu21Var2.m65647a(nu21Var2.f158497i);
        frl0 frl0Var3 = qphVar.f191306b.f49953c;
        frl0Var3.m42500p(spl0.f212897f);
        fag1.m41176y(frl0Var3, 0, obj, 1, rq00VarM65647a2);
        frl0Var3.f72503f[frl0Var3.f72504g - frl0Var3.f72501d[frl0Var3.f72502e - 1].f201843a] = iM73868b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[EDGE_INSN: B:11:0x0031->B:28:0x0084 BREAK  A[LOOP:0: B:15:0x003f->B:27:0x0081]] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[LOOP:0: B:15:0x003f->B:27:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0031 A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final pgv0 m91796v() {
        pgv0 pgv0Var;
        rq00 rq00VarM65647a;
        le40 le40Var;
        ArrayList arrayList = this.f264794E;
        pgv0 pgv0Var2 = zn91.m96536X(arrayList) ? (pgv0) arrayList.remove(arrayList.size() - 1) : null;
        if (pgv0Var2 != null) {
            pgv0Var2.f177417b &= -9;
            this.f264817g.m26044w();
            int i = this.f264791B;
            fpi0 fpi0Var = pgv0Var2.f177421f;
            if (fpi0Var == null || (pgv0Var2.f177417b & 16) != 0) {
                le40Var = null;
                break;
            }
            Object[] objArr = fpi0Var.f71878b;
            int[] iArr = fpi0Var.f71879c;
            long[] jArr = fpi0Var.f71877a;
            int length = jArr.length - 2;
            if (length < 0) {
                le40Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                le40Var = new le40(pgv0Var2, i, fpi0Var, 1);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    le40Var = null;
                    break;
                }
                if (i2 == length) {
                    le40Var = null;
                    break;
                }
                i2++;
            }
            qph qphVar = this.f264802M;
            if (le40Var != null) {
                frl0 frl0Var = qphVar.f191306b.f49953c;
                frl0Var.m42500p(mpl0.f146049c);
                fag1.m41176y(frl0Var, 0, le40Var, 1, this.f264818h);
            }
            int i6 = pgv0Var2.f177417b;
            if ((i6 & 512) != 0) {
                pgv0Var2.f177417b = i6 & (-513);
                frl0 frl0Var2 = qphVar.f191306b.f49953c;
                frl0Var2.m42500p(ppl0.f180065c);
                fag1.m41175x(frl0Var2, 0, pgv0Var2);
                int i7 = pgv0Var2.f177417b;
                pgv0Var2.f177417b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    pgv0Var2.f177417b = i7 & (-1153);
                    if (this.f264836z == this.f264796G.f158497i) {
                        this.f264835y = false;
                        this.f264836z = -1;
                    }
                }
            }
        }
        if (pgv0Var2 != null) {
            int i8 = pgv0Var2.f177417b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.f264827q)) {
                if (pgv0Var2.f177418c == null) {
                    if (this.f264808S) {
                        wu21 wu21Var = this.f264798I;
                        rq00VarM65647a = wu21Var.m88988b(wu21Var.f255091v);
                    } else {
                        nu21 nu21Var = this.f264796G;
                        rq00VarM65647a = nu21Var.m65647a(nu21Var.f158497i);
                    }
                    pgv0Var2.f177418c = rq00VarM65647a;
                }
                pgv0Var2.f177417b &= -5;
                pgv0Var = pgv0Var2;
            } else {
                pgv0Var = null;
            }
        } else {
            pgv0Var = null;
        }
        m91788r(false);
        return pgv0Var;
    }

    /* JADX INFO: renamed from: v0 */
    public final int m91797v0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f264825o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f264796G.m65661o(i) : i2;
        }
        roi0 roi0Var = this.f264826p;
        if (roi0Var == null || roi0Var.m76056c(i) < 0) {
            return 0;
        }
        int iM76056c = roi0Var.m76056c(i);
        if (iM76056c >= 0) {
            return roi0Var.f201272c[iM76056c];
        }
        throw new NoSuchElementException(s571.m77246e(i, "Cannot find value for key "));
    }

    /* JADX INFO: renamed from: w */
    public final void m91798w() {
        if (this.f264795F || this.f264836z != 0) {
            lfq0.m58913a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f264836z = -1;
        this.f264835y = false;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m91799w0() {
        if (!this.f264828r) {
            vph.m86124a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f264828r = false;
        if (this.f264808S) {
            vph.m86124a("useNode() called while inserting");
        }
        nu21 nu21Var = this.f264796G;
        Object objM65660n = nu21Var.m65660n(nu21Var.f158497i);
        qph qphVar = this.f264802M;
        qphVar.m73442c();
        qphVar.f191312h.add(objM65660n);
        if (this.f264835y && (objM65660n instanceof glh)) {
            qphVar.m73441b();
            qphVar.f191306b.f49953c.m42500p(oql0.f168315c);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m91800x() {
        m91788r(false);
        this.f264812b.mo48462d();
        m91788r(false);
        qph qphVar = this.f264802M;
        if (qphVar.f191307c) {
            qphVar.m73443d(false);
            qphVar.m73443d(false);
            qphVar.f191306b.f49953c.m42500p(npl0.f157029c);
            qphVar.f191307c = false;
        }
        qphVar.m73441b();
        if (qphVar.f191308d.f208958b != 0) {
            vph.m86124a("Missed recording an endGroup()");
        }
        if (!this.f264819i.isEmpty()) {
            vph.m86124a("Start/end imbalance");
        }
        m91772j();
        this.f264796G.m65649c();
        this.f264833w = riw0.m75619m(this.f264834x.m78118e());
    }

    /* JADX INFO: renamed from: y */
    public final void m91801y(boolean z, ar00 ar00Var) {
        this.f264819i.add(this.f264820j);
        this.f264820j = ar00Var;
        int i = this.f264822l;
        sgz sgzVar = this.f264824n;
        sgzVar.m78119f(i);
        sgzVar.m78119f(this.f264823m);
        sgzVar.m78119f(this.f264821k);
        if (z) {
            this.f264821k = 0;
        }
        this.f264822l = 0;
        this.f264823m = 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m91802z() {
        ou21 ou21Var = new ou21();
        if (this.f264792C) {
            ou21Var.m68077b();
        }
        if (this.f264812b.mo48463e()) {
            ou21Var.f170145X = new toi0();
        }
        this.f264797H = ou21Var;
        wu21 wu21VarM68080i = ou21Var.m68080i();
        wu21VarM68080i.m88991e(true);
        this.f264798I = wu21VarM68080i;
    }
}
