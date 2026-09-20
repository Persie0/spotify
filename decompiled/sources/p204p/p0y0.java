package p204p;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class p0y0 implements ck81 {

    /* JADX INFO: renamed from: A */
    public boolean f172834A;

    /* JADX INFO: renamed from: B */
    public boolean f172835B;

    /* JADX INFO: renamed from: C */
    public boolean f172836C;

    /* JADX INFO: renamed from: D */
    public r300 f172837D;

    /* JADX INFO: renamed from: E */
    public r300 f172838E;

    /* JADX INFO: renamed from: F */
    public long f172839F;

    /* JADX INFO: renamed from: G */
    public boolean f172840G;

    /* JADX INFO: renamed from: H */
    public boolean f172841H;

    /* JADX INFO: renamed from: I */
    public long f172842I;

    /* JADX INFO: renamed from: J */
    public boolean f172843J;

    /* JADX INFO: renamed from: a */
    public final oix f172844a;

    /* JADX INFO: renamed from: c */
    public final ob31 f172846c;

    /* JADX INFO: renamed from: d */
    public final ihs f172847d;

    /* JADX INFO: renamed from: e */
    public final ehs f172848e;

    /* JADX INFO: renamed from: f */
    public Object f172849f;

    /* JADX INFO: renamed from: g */
    public r300 f172850g;

    /* JADX INFO: renamed from: h */
    public bhs f172851h;

    /* JADX INFO: renamed from: p */
    public int f172859p;

    /* JADX INFO: renamed from: q */
    public int f172860q;

    /* JADX INFO: renamed from: r */
    public int f172861r;

    /* JADX INFO: renamed from: s */
    public int f172862s;

    /* JADX INFO: renamed from: t */
    public long f172863t;

    /* JADX INFO: renamed from: u */
    public long f172864u;

    /* JADX INFO: renamed from: v */
    public long f172865v;

    /* JADX INFO: renamed from: w */
    public long f172866w;

    /* JADX INFO: renamed from: x */
    public int f172867x;

    /* JADX INFO: renamed from: y */
    public int f172868y;

    /* JADX INFO: renamed from: z */
    public boolean f172869z;

    /* JADX INFO: renamed from: b */
    public final y2a f172845b = new y2a();

    /* JADX INFO: renamed from: i */
    public int f172852i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f172853j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f172854k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f172857n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f172856m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f172855l = new int[1000];

    /* JADX INFO: renamed from: o */
    public bk81[] f172858o = new bk81[1000];

    public p0y0(mn3 mn3Var, ihs ihsVar, ehs ehsVar) {
        this.f172847d = ihsVar;
        this.f172848e = ehsVar;
        this.f172844a = new oix(mn3Var);
        x4t0 x4t0Var = new x4t0(19);
        ob31 ob31Var = new ob31();
        ob31Var.f163529b = new SparseArray();
        ob31Var.f163530c = x4t0Var;
        ob31Var.f163528a = -1;
        this.f172846c = ob31Var;
        this.f172863t = Long.MIN_VALUE;
        this.f172865v = Long.MIN_VALUE;
        this.f172866w = Long.MIN_VALUE;
        this.f172835B = true;
        this.f172834A = true;
        this.f172840G = true;
        this.f172864u = Long.MIN_VALUE;
        this.f172867x = -1;
        this.f172868y = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m68732A(boolean z) {
        oix oixVar = this.f172844a;
        iha ihaVar = (iha) oixVar.f165909e;
        mn3 mn3Var = (mn3) oixVar.f165907c;
        if (((vl3) ihaVar.f102217c) != null) {
            mn3Var.mo62343b(ihaVar);
            ihaVar.f102217c = null;
            ihaVar.f102218d = null;
        }
        iha ihaVar2 = (iha) oixVar.f165909e;
        int i = oixVar.f165905a;
        c95.m31855u(((vl3) ihaVar2.f102217c) == null);
        ihaVar2.f102215a = 0L;
        ihaVar2.f102216b = i;
        iha ihaVar3 = (iha) oixVar.f165909e;
        oixVar.f165910f = ihaVar3;
        oixVar.f165911g = ihaVar3;
        oixVar.f165906b = 0L;
        mn3Var.mo62344c();
        this.f172859p = 0;
        this.f172860q = 0;
        this.f172861r = 0;
        this.f172862s = 0;
        this.f172867x = -1;
        this.f172868y = -1;
        this.f172834A = true;
        this.f172863t = Long.MIN_VALUE;
        this.f172865v = Long.MIN_VALUE;
        this.f172866w = Long.MIN_VALUE;
        this.f172869z = false;
        ob31 ob31Var = this.f172846c;
        SparseArray sparseArray = (SparseArray) ob31Var.f163529b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((x4t0) ob31Var.f163530c).accept(sparseArray.valueAt(i2));
        }
        ob31Var.f163528a = -1;
        sparseArray.clear();
        if (z) {
            this.f172837D = null;
            this.f172838E = null;
            this.f172835B = true;
            this.f172840G = true;
        }
    }

    /* JADX INFO: renamed from: B */
    public final synchronized boolean m68733B(int i) {
        synchronized (this) {
            this.f172862s = 0;
            oix oixVar = this.f172844a;
            oixVar.f165910f = (iha) oixVar.f165909e;
        }
        int i2 = this.f172860q;
        if (i >= i2 && i <= this.f172859p + i2) {
            int i3 = this.f172867x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            int i4 = this.f172868y;
            if (i4 != -1 && i >= i4) {
                return false;
            }
            this.f172863t = Long.MIN_VALUE;
            this.f172862s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final synchronized boolean m68734C(long j, boolean z) throws Throwable {
        Throwable th;
        long jMin;
        p0y0 p0y0Var;
        long j2;
        int iM68743m;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f172862s = 0;
                        oix oixVar = this.f172844a;
                        oixVar.f165910f = (iha) oixVar.f165909e;
                        int iM68747q = m68747q(0);
                        long j3 = this.f172864u;
                        if (j3 != Long.MIN_VALUE) {
                            try {
                                jMin = Math.min(this.f172866w, j3);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            jMin = this.f172866w;
                        }
                        int i = this.f172862s;
                        int i2 = this.f172859p;
                        if (!(i != i2) || j < this.f172857n[iM68747q] || (j > jMin && !z)) {
                            return false;
                        }
                        if (this.f172840G) {
                            iM68743m = i2 - i;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= iM68743m) {
                                    if (!z) {
                                        iM68743m = -1;
                                        break;
                                    }
                                    break;
                                }
                                if (this.f172857n[iM68747q] >= j) {
                                    iM68743m = i3;
                                    break;
                                }
                                iM68747q++;
                                if (iM68747q == this.f172852i) {
                                    iM68747q = 0;
                                }
                                i3++;
                            }
                            p0y0Var = this;
                            j2 = j;
                        } else {
                            int i4 = i2 - i;
                            p0y0Var = this;
                            j2 = j;
                            iM68743m = p0y0Var.m68743m(iM68747q, i4, j2, true);
                        }
                        if (iM68743m == -1) {
                            return false;
                        }
                        p0y0Var.f172863t = j2;
                        p0y0Var.f172862s += iM68743m;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                }
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m68735D(long j) {
        if (j == this.f172864u) {
            return;
        }
        this.f172864u = j;
        this.f172867x = -1;
        this.f172868y = -1;
        if (j != Long.MIN_VALUE && j <= this.f172866w) {
            for (int i = 0; i < this.f172859p; i++) {
                int iM68747q = m68747q(i);
                m68737F(this.f172860q + i, this.f172857n[iM68747q], this.f172856m[iM68747q]);
                if (this.f172867x != -1) {
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: E */
    public final synchronized void m68736E(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f172862s + i <= this.f172859p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        c95.m31843i(z);
        this.f172862s += i;
    }

    /* JADX INFO: renamed from: F */
    public final void m68737F(int i, long j, int i2) {
        int i3;
        long j2 = this.f172864u;
        if (j2 != Long.MIN_VALUE && this.f172867x == -1) {
            if (j < j2) {
                this.f172868y = -1;
                return;
            }
            if (this.f172868y == -1) {
                this.f172868y = i;
            }
            int i4 = this.f172868y;
            int i5 = (i - i4) + 1;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 536870912) != 0;
            r300 r300Var = this.f172838E;
            if (r300Var == null || (i3 = r300Var.f195389r) == -1) {
                i3 = 16;
            }
            if (i5 >= i3 + 1 || z || z2) {
                this.f172867x = i4;
                this.f172868y = -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:21:0x0069, B:25:0x0072, B:18:0x0059), top: B:35:0x000a }] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, p.o0y0] */
    @Override // p204p.ck81
    /* JADX INFO: renamed from: a */
    public final void mo33087a(r300 r300Var) {
        r300 r300VarMo68744n = mo68744n(r300Var);
        boolean z = false;
        this.f172836C = false;
        this.f172837D = r300Var;
        synchronized (this) {
            try {
                this.f172835B = false;
                if (!Objects.equals(r300VarMo68744n, this.f172838E)) {
                    if (((SparseArray) this.f172846c.f163529b).size() == 0) {
                        this.f172838E = r300VarMo68744n;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f172846c.f163529b;
                        if (((n0y0) sparseArray.valueAt(sparseArray.size() - 1)).f149202a.equals(r300VarMo68744n)) {
                            SparseArray sparseArray2 = (SparseArray) this.f172846c.f163529b;
                            this.f172838E = ((n0y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f149202a;
                        } else {
                            this.f172838E = r300VarMo68744n;
                        }
                    }
                    boolean z2 = this.f172840G;
                    r300 r300Var2 = this.f172838E;
                    String str = r300Var2.f195387p;
                    this.f172840G = z2 & (def0.m35792i(str) == 1 && def0.m35784a(str, r300Var2.f195383l));
                    this.f172841H = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r6 = this.f172849f;
        if (r6 == 0 || !z) {
            return;
        }
        r6.mo66028a();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0190 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:91:0x014d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0154 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0169 A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0129, B:110:0x01a3, B:112:0x01ac, B:89:0x0144, B:91:0x014d, B:93:0x0156, B:95:0x0169, B:99:0x0172, B:100:0x0177, B:102:0x017d, B:106:0x018b, B:108:0x0190, B:109:0x01a0, B:92:0x0154), top: B:118:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    @Override // p204p.ck81
    /* JADX INFO: renamed from: b */
    public void mo33088b(long j, int i, int i2, int i3, bk81 bk81Var) {
        int i4;
        r300 r300Var;
        ihs ihsVar;
        hhs hhsVarMo50670a;
        ob31 ob31Var;
        int iM68750t;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f172836C) {
            r300 r300Var2 = this.f172837D;
            r300Var2.getClass();
            mo33087a(r300Var2);
        }
        int i5 = i & 1;
        boolean z4 = i5 != 0;
        if (this.f172834A) {
            if (!z4) {
                return;
            } else {
                this.f172834A = false;
            }
        }
        long j2 = j + this.f172842I;
        if (!this.f172840G) {
            i4 = i;
        } else {
            if (j2 < this.f172863t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f172841H) {
                    yif1.m93819w0("Overriding unexpected non-sync sample for format: " + this.f172838E);
                    this.f172841H = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f172843J) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f172859p == 0) {
                        z3 = j2 > this.f172865v;
                    } else {
                        synchronized (this) {
                            long jMax = Math.max(this.f172865v, m68745o(this.f172862s));
                            if (jMax >= j2) {
                                z3 = false;
                            } else {
                                int i6 = this.f172859p;
                                int iM68747q = m68747q(i6 - 1);
                                while (i6 > this.f172862s && this.f172857n[iM68747q] >= j2) {
                                    i6--;
                                    iM68747q--;
                                    if (iM68747q == -1) {
                                        iM68747q = this.f172852i - 1;
                                    }
                                }
                                m68741k(this.f172860q + i6);
                                z3 = true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3) {
                return;
            } else {
                this.f172843J = false;
            }
        }
        long j3 = (this.f172844a.f165906b - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i7 = this.f172859p;
                if (i7 > 0) {
                    int iM68747q2 = m68747q(i7 - 1);
                    c95.m31843i(this.f172854k[iM68747q2] + ((long) this.f172855l[iM68747q2]) <= j3);
                }
                this.f172869z = (536870912 & i4) != 0;
                this.f172866w = Math.max(this.f172866w, j2);
                m68737F(m68750t(), j2, i4);
                int iM68747q3 = m68747q(this.f172859p);
                this.f172857n[iM68747q3] = j2;
                this.f172854k[iM68747q3] = j3;
                this.f172855l[iM68747q3] = i2;
                this.f172856m[iM68747q3] = i4;
                this.f172858o[iM68747q3] = bk81Var;
                this.f172853j[iM68747q3] = this.f172839F;
                if (((SparseArray) this.f172846c.f163529b).size() == 0) {
                    r300Var = this.f172838E;
                    r300Var.getClass();
                    ihsVar = this.f172847d;
                    if (ihsVar != null) {
                        hhsVarMo50670a = ihsVar.mo50670a(this.f172848e, r300Var);
                    } else {
                        hhsVarMo50670a = hhs.f91575F;
                    }
                    ob31Var = this.f172846c;
                    iM68750t = m68750t();
                    n0y0 n0y0Var = new n0y0(r300Var, hhsVarMo50670a);
                    sparseArray = (SparseArray) ob31Var.f163529b;
                    if (ob31Var.f163528a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c95.m31855u(z2);
                        ob31Var.f163528a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (iM68750t >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c95.m31843i(z);
                        if (iKeyAt == iM68750t) {
                            ((x4t0) ob31Var.f163530c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(iM68750t, n0y0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f172846c.f163529b;
                    if (!((n0y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f149202a.equals(this.f172838E)) {
                        r300Var = this.f172838E;
                        r300Var.getClass();
                        ihsVar = this.f172847d;
                        if (ihsVar != null) {
                            hhsVarMo50670a = ihsVar.mo50670a(this.f172848e, r300Var);
                        } else {
                            hhsVarMo50670a = hhs.f91575F;
                        }
                        ob31Var = this.f172846c;
                        iM68750t = m68750t();
                        n0y0 n0y0Var2 = new n0y0(r300Var, hhsVarMo50670a);
                        sparseArray = (SparseArray) ob31Var.f163529b;
                        if (ob31Var.f163528a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c95.m31855u(z2);
                            ob31Var.f163528a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (iM68750t >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c95.m31843i(z);
                            if (iKeyAt == iM68750t) {
                                ((x4t0) ob31Var.f163530c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(iM68750t, n0y0Var2);
                    }
                }
                int i8 = this.f172859p + 1;
                this.f172859p = i8;
                int i9 = this.f172852i;
                if (i8 == i9) {
                    int i10 = i9 + 1000;
                    long[] jArr = new long[i10];
                    long[] jArr2 = new long[i10];
                    long[] jArr3 = new long[i10];
                    int[] iArr = new int[i10];
                    int[] iArr2 = new int[i10];
                    bk81[] bk81VarArr = new bk81[i10];
                    int i11 = this.f172861r;
                    int i12 = i9 - i11;
                    System.arraycopy(this.f172854k, i11, jArr2, 0, i12);
                    System.arraycopy(this.f172857n, this.f172861r, jArr3, 0, i12);
                    System.arraycopy(this.f172856m, this.f172861r, iArr, 0, i12);
                    System.arraycopy(this.f172855l, this.f172861r, iArr2, 0, i12);
                    System.arraycopy(this.f172858o, this.f172861r, bk81VarArr, 0, i12);
                    System.arraycopy(this.f172853j, this.f172861r, jArr, 0, i12);
                    int i13 = this.f172861r;
                    System.arraycopy(this.f172854k, 0, jArr2, i12, i13);
                    System.arraycopy(this.f172857n, 0, jArr3, i12, i13);
                    System.arraycopy(this.f172856m, 0, iArr, i12, i13);
                    System.arraycopy(this.f172855l, 0, iArr2, i12, i13);
                    System.arraycopy(this.f172858o, 0, bk81VarArr, i12, i13);
                    System.arraycopy(this.f172853j, 0, jArr, i12, i13);
                    this.f172854k = jArr2;
                    this.f172857n = jArr3;
                    this.f172856m = iArr;
                    this.f172855l = iArr2;
                    this.f172858o = bk81VarArr;
                    this.f172853j = jArr;
                    this.f172861r = 0;
                    this.f172852i = i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: c */
    public final void mo33089c(l2n0 l2n0Var, int i, int i2) {
        while (true) {
            oix oixVar = this.f172844a;
            if (i <= 0) {
                oixVar.getClass();
                return;
            }
            int iM67063b = oixVar.m67063b(i);
            iha ihaVar = (iha) oixVar.f165911g;
            vl3 vl3Var = (vl3) ihaVar.f102217c;
            l2n0Var.m57943o(((int) (oixVar.f165906b - ihaVar.f102215a)) + vl3Var.f242371b, vl3Var.f242370a, iM67063b);
            i -= iM67063b;
            long j = oixVar.f165906b + ((long) iM67063b);
            oixVar.f165906b = j;
            iha ihaVar2 = (iha) oixVar.f165911g;
            if (j == ihaVar2.f102216b) {
                oixVar.f165911g = (iha) ihaVar2.f102218d;
            }
        }
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: d */
    public final int mo33090d(fho fhoVar, int i, boolean z) throws EOFException {
        oix oixVar = this.f172844a;
        int iM67063b = oixVar.m67063b(i);
        iha ihaVar = (iha) oixVar.f165911g;
        vl3 vl3Var = (vl3) ihaVar.f102217c;
        int i2 = fhoVar.read(vl3Var.f242370a, ((int) (oixVar.f165906b - ihaVar.f102215a)) + vl3Var.f242371b, iM67063b);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = oixVar.f165906b + ((long) i2);
        oixVar.f165906b = j;
        iha ihaVar2 = (iha) oixVar.f165911g;
        if (j == ihaVar2.f102216b) {
            oixVar.f165911g = (iha) ihaVar2.f102218d;
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public final long m68738h(int i) {
        this.f172865v = Math.max(this.f172865v, m68745o(i));
        this.f172859p -= i;
        int i2 = this.f172860q + i;
        this.f172860q = i2;
        int i3 = this.f172861r + i;
        this.f172861r = i3;
        int i4 = this.f172852i;
        if (i3 >= i4) {
            this.f172861r = i3 - i4;
        }
        int i5 = this.f172862s - i;
        this.f172862s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f172862s = 0;
        }
        ob31 ob31Var = this.f172846c;
        SparseArray sparseArray = (SparseArray) ob31Var.f163529b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((x4t0) ob31Var.f163530c).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = ob31Var.f163528a;
            if (i8 > 0) {
                ob31Var.f163528a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f172859p != 0) {
            return this.f172854k[this.f172861r];
        }
        int i9 = this.f172861r;
        if (i9 == 0) {
            i9 = this.f172852i;
        }
        int i10 = i9 - 1;
        return this.f172854k[i10] + ((long) this.f172855l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: i */
    public final void m68739i(long j, boolean z) throws Throwable {
        Throwable th;
        oix oixVar = this.f172844a;
        synchronized (this) {
            try {
                try {
                    int i = this.f172859p;
                    long jM68738h = -1;
                    if (i != 0) {
                        long[] jArr = this.f172857n;
                        int i2 = this.f172861r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.f172862s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iM68743m = m68743m(i2, i, j, false);
                            if (iM68743m != -1) {
                                jM68738h = m68738h(iM68743m);
                            }
                        }
                    }
                    oixVar.m67062a(jM68738h);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m68740j() {
        long jM68738h;
        oix oixVar = this.f172844a;
        synchronized (this) {
            int i = this.f172859p;
            jM68738h = i == 0 ? -1L : m68738h(i);
        }
        oixVar.m67062a(jM68738h);
    }

    /* JADX INFO: renamed from: k */
    public final long m68741k(int i) {
        int iM68750t = m68750t() - i;
        boolean z = false;
        c95.m31843i(iM68750t >= 0 && iM68750t <= this.f172859p - this.f172862s);
        int i2 = this.f172859p - iM68750t;
        this.f172859p = i2;
        this.f172866w = Math.max(this.f172865v, m68745o(i2));
        if (iM68750t == 0 && this.f172869z) {
            z = true;
        }
        this.f172869z = z;
        int i3 = this.f172867x;
        if (i3 != -1 && i < i3) {
            this.f172867x = -1;
        }
        int i4 = this.f172868y;
        if (i4 != -1 && i < i4) {
            this.f172868y = -1;
        }
        ob31 ob31Var = this.f172846c;
        SparseArray sparseArray = (SparseArray) ob31Var.f163529b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((x4t0) ob31Var.f163530c).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        ob31Var.f163528a = sparseArray.size() > 0 ? Math.min(ob31Var.f163528a, sparseArray.size() - 1) : -1;
        int i5 = this.f172859p;
        if (i5 == 0) {
            return 0L;
        }
        int iM68747q = m68747q(i5 - 1);
        return this.f172854k[iM68747q] + ((long) this.f172855l[iM68747q]);
    }

    /* JADX INFO: renamed from: l */
    public final void m68742l(int i) {
        long jM68741k = m68741k(i);
        oix oixVar = this.f172844a;
        int i2 = oixVar.f165905a;
        mn3 mn3Var = (mn3) oixVar.f165907c;
        c95.m31843i(jM68741k <= oixVar.f165906b);
        oixVar.f165906b = jM68741k;
        if (jM68741k != 0) {
            iha ihaVar = (iha) oixVar.f165909e;
            if (jM68741k != ihaVar.f102215a) {
                while (oixVar.f165906b > ihaVar.f102216b) {
                    ihaVar = (iha) ihaVar.f102218d;
                }
                iha ihaVar2 = (iha) ihaVar.f102218d;
                ihaVar2.getClass();
                if (((vl3) ihaVar2.f102217c) != null) {
                    mn3Var.mo62343b(ihaVar2);
                    ihaVar2.f102217c = null;
                    ihaVar2.f102218d = null;
                }
                iha ihaVar3 = new iha(i2, ihaVar.f102216b);
                ihaVar.f102218d = ihaVar3;
                if (oixVar.f165906b == ihaVar.f102216b) {
                    ihaVar = ihaVar3;
                }
                oixVar.f165911g = ihaVar;
                if (((iha) oixVar.f165910f) == ihaVar2) {
                    oixVar.f165910f = ihaVar3;
                    return;
                }
                return;
            }
        }
        iha ihaVar4 = (iha) oixVar.f165909e;
        if (((vl3) ihaVar4.f102217c) != null) {
            mn3Var.mo62343b(ihaVar4);
            ihaVar4.f102217c = null;
            ihaVar4.f102218d = null;
        }
        iha ihaVar5 = new iha(i2, oixVar.f165906b);
        oixVar.f165909e = ihaVar5;
        oixVar.f165910f = ihaVar5;
        oixVar.f165911g = ihaVar5;
    }

    /* JADX INFO: renamed from: m */
    public final int m68743m(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f172857n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f172856m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f172852i) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public r300 mo68744n(r300 r300Var) {
        if (this.f172842I == 0 || r300Var.f195392u == Long.MAX_VALUE) {
            return r300Var;
        }
        p300 p300VarM74564a = r300Var.m74564a();
        p300VarM74564a.f173532t = r300Var.f195392u + this.f172842I;
        return new r300(p300VarM74564a);
    }

    /* JADX INFO: renamed from: o */
    public final long m68745o(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM68747q = m68747q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f172857n[iM68747q]);
            if ((this.f172856m[iM68747q] & 1) != 0) {
                return jMax;
            }
            iM68747q--;
            if (iM68747q == -1) {
                iM68747q = this.f172852i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: p */
    public final int m68746p() {
        return this.f172860q + this.f172862s;
    }

    /* JADX INFO: renamed from: q */
    public final int m68747q(int i) {
        int i2 = this.f172861r + i;
        int i3 = this.f172852i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized int m68748r(long j, boolean z) throws Throwable {
        try {
            try {
                int iM68747q = m68747q(this.f172862s);
                int i = this.f172862s;
                int i2 = this.f172859p;
                if (!(i != i2) || j < this.f172857n[iM68747q]) {
                    return 0;
                }
                if (j > this.f172866w && z) {
                    return i2 - i;
                }
                int iM68743m = m68743m(iM68747q, i2 - i, j, true);
                if (iM68743m == -1) {
                    return 0;
                }
                return iM68743m;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final synchronized r300 m68749s() {
        return this.f172835B ? null : this.f172838E;
    }

    /* JADX INFO: renamed from: t */
    public final int m68750t() {
        return this.f172860q + this.f172859p;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized boolean m68751u(boolean z) {
        r300 r300Var;
        int iM68746p = m68746p();
        int i = this.f172867x;
        boolean z2 = true;
        if (i != -1 && iM68746p >= i) {
            return true;
        }
        if (this.f172862s != this.f172859p) {
            if (!(i == -1 && this.f172868y != -1 && m68746p() >= this.f172868y)) {
                if (((n0y0) this.f172846c.m66604d(iM68746p)).f149202a != this.f172850g) {
                    return true;
                }
                return m68752v(m68747q(this.f172862s));
            }
        }
        if (!z && !this.f172869z && ((r300Var = this.f172838E) == null || r300Var == this.f172850g)) {
            z2 = false;
        }
        return z2;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m68752v(int i) {
        bhs bhsVar = this.f172851h;
        if (bhsVar == null || bhsVar.getState() == 4) {
            return true;
        }
        return (this.f172856m[i] & 1073741824) == 0 && this.f172851h.mo29259c();
    }

    /* JADX INFO: renamed from: w */
    public final void m68753w() throws DrmSession$DrmSessionException {
        bhs bhsVar = this.f172851h;
        if (bhsVar == null || bhsVar.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionMo29261e = this.f172851h.mo29261e();
        drmSession$DrmSessionExceptionMo29261e.getClass();
        throw drmSession$DrmSessionExceptionMo29261e;
    }

    /* JADX INFO: renamed from: x */
    public final void m68754x(r300 r300Var, xyx xyxVar) {
        r300 r300Var2 = this.f172850g;
        boolean z = r300Var2 == null;
        ahs ahsVar = r300Var2 == null ? null : r300Var2.f195391t;
        this.f172850g = r300Var;
        ahs ahsVar2 = r300Var.f195391t;
        ihs ihsVar = this.f172847d;
        xyxVar.f267437c = ihsVar != null ? r300Var.m74565b(ihsVar.mo44756c(r300Var)) : r300Var;
        xyxVar.f267436b = this.f172851h;
        if (ihsVar == null) {
            return;
        }
        if (z || !Objects.equals(ahsVar, ahsVar2)) {
            bhs bhsVar = this.f172851h;
            ehs ehsVar = this.f172848e;
            bhs bhsVarMo44758e = ihsVar.mo44758e(ehsVar, r300Var);
            this.f172851h = bhsVarMo44758e;
            xyxVar.f267436b = bhsVarMo44758e;
            if (bhsVar != null) {
                bhsVar.mo29258b(ehsVar);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final synchronized long m68755y() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f172862s != this.f172859p ? this.f172853j[m68747q(this.f172862s)] : this.f172839F;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX INFO: renamed from: z */
    public final int m68756z(xyx xyxVar, iro iroVar, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        y2a y2aVar = this.f172845b;
        synchronized (this) {
            iroVar.f105019e = false;
            int iM68746p = m68746p();
            int i3 = this.f172867x;
            boolean z3 = i3 != -1 && iM68746p >= i3;
            i2 = -5;
            if (this.f172862s != this.f172859p) {
                if ((i3 == -1 && this.f172868y != -1 && m68746p() >= this.f172868y) || z3) {
                    if (z) {
                    }
                    iroVar.f167824a = 4;
                    iroVar.f105020f = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    r300 r300Var = ((n0y0) this.f172846c.m66604d(iM68746p)).f149202a;
                    if (z2 || r300Var != this.f172850g) {
                        m68754x(r300Var, xyxVar);
                    } else {
                        int iM68747q = m68747q(this.f172862s);
                        if (m68752v(iM68747q)) {
                            iroVar.f167824a = this.f172856m[iM68747q];
                            if (this.f172862s == this.f172859p - 1 && (z || this.f172869z)) {
                                iroVar.m67518a(536870912);
                            }
                            iroVar.f105020f = this.f172857n[iM68747q];
                            y2aVar.f268519a = this.f172855l[iM68747q];
                            y2aVar.f268520b = this.f172854k[iM68747q];
                            y2aVar.f268521c = this.f172858o[iM68747q];
                            i2 = -4;
                        } else {
                            iroVar.f105019e = true;
                            i2 = -3;
                        }
                    }
                }
            } else if (!z || this.f172869z || z3) {
                iroVar.f167824a = 4;
                iroVar.f105020f = Long.MIN_VALUE;
                i2 = -4;
            } else {
                r300 r300Var2 = this.f172838E;
                if (r300Var2 == null || (!z2 && r300Var2 == this.f172850g)) {
                    i2 = -3;
                } else {
                    m68754x(r300Var2, xyxVar);
                }
            }
        }
        if (i2 == -4 && !iroVar.m67519d(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z4) {
                    oix oixVar = this.f172844a;
                    oix.m67061f((iha) oixVar.f165910f, iroVar, this.f172845b, (l2n0) oixVar.f165908d);
                } else {
                    oix oixVar2 = this.f172844a;
                    oixVar2.f165910f = oix.m67061f((iha) oixVar2.f165910f, iroVar, this.f172845b, (l2n0) oixVar2.f165908d);
                }
            }
            if (!z4) {
                this.f172862s++;
            }
        }
        return i2;
    }
}
