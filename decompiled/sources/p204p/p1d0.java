package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class p1d0 extends gfe1 {

    /* JADX INFO: renamed from: L0 */
    public final bp71 f173052L0;

    /* JADX INFO: renamed from: M0 */
    public n1d0 f173053M0;

    /* JADX INFO: renamed from: N0 */
    public m1d0 f173054N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f173055O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f173056P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f173057Q0;

    /* JADX INFO: renamed from: Y */
    public final boolean f173058Y;

    /* JADX INFO: renamed from: Z */
    public final mp71 f173059Z;

    public p1d0(wz8 wz8Var, boolean z) {
        super(wz8Var);
        this.f173058Y = z && wz8Var.mo44608n();
        this.f173059Z = new mp71();
        this.f173052L0 = new bp71();
        qp71 qp71VarMo44607k = wz8Var.mo44607k();
        if (qp71VarMo44607k == null) {
            this.f173053M0 = new n1d0(new o1d0(wz8Var.mo27868l()), mp71.f145916q, n1d0.f149395i);
        } else {
            this.f173053M0 = new n1d0(qp71VarMo44607k, (Object) null, (Object) null);
            this.f173057Q0 = true;
        }
    }

    @Override // p204p.gfe1, p204p.wz8
    /* JADX INFO: renamed from: A */
    public final void mo27864A(ufd0 ufd0Var) {
        if (this.f173057Q0) {
            n1d0 n1d0Var = this.f173053M0;
            qp71 qp71Var = n1d0Var.f247672e;
            this.f173053M0 = new n1d0(qp71Var instanceof yt71 ? new yt71(((yt71) qp71Var).f247672e, ufd0Var) : new yt71(qp71Var, ufd0Var), n1d0Var.f149397g, n1d0Var.f149398h);
        } else {
            this.f173053M0 = new n1d0(new o1d0(ufd0Var), mp71.f145916q, n1d0.f149395i);
        }
        this.f79345X.mo27864A(ufd0Var);
    }

    @Override // p204p.gfe1
    /* JADX INFO: renamed from: I */
    public final vsd0 mo44605I(vsd0 vsd0Var) {
        Object obj = vsd0Var.f244408a;
        Object obj2 = this.f173053M0.f149398h;
        if (obj2 != null && obj2.equals(obj)) {
            obj = n1d0.f149395i;
        }
        return vsd0Var.m86307a(obj);
    }

    @Override // p204p.gfe1
    /* JADX INFO: renamed from: J */
    public final void mo44606J() {
        if (this.f173058Y) {
            return;
        }
        this.f173055O0 = true;
        m67694H(null, this.f79345X);
    }

    @Override // p204p.gfe1, p204p.wz8
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final m1d0 mo27867f(vsd0 vsd0Var, mn3 mn3Var, long j) {
        m1d0 m1d0Var = new m1d0(vsd0Var, mn3Var, j);
        c95.m31855u(m1d0Var.f138942d == null);
        wz8 wz8Var = this.f79345X;
        m1d0Var.f138942d = wz8Var;
        if (!this.f173056P0) {
            this.f173054N0 = m1d0Var;
            if (!this.f173055O0) {
                this.f173055O0 = true;
                m67694H(null, wz8Var);
            }
            return m1d0Var;
        }
        Object obj = vsd0Var.f244408a;
        if (this.f173053M0.f149398h != null && obj.equals(n1d0.f149395i)) {
            obj = this.f173053M0.f149398h;
        }
        m1d0Var.m60536a(vsd0Var.m86307a(obj));
        return m1d0Var;
    }

    /* JADX INFO: renamed from: L */
    public final n1d0 m68786L() {
        return this.f173053M0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m68787M(long j) {
        m1d0 m1d0Var = this.f173054N0;
        int iMo26650b = this.f173053M0.mo26650b(m1d0Var.f138939a.f244408a);
        if (iMo26650b == -1) {
            return false;
        }
        n1d0 n1d0Var = this.f173053M0;
        bp71 bp71Var = this.f173052L0;
        n1d0Var.mo26651f(iMo26650b, bp71Var, false);
        long j2 = bp71Var.f29346d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        m1d0Var.f138945g = j;
        return true;
    }

    @Override // p204p.gfe1, p204p.wz8
    /* JADX INFO: renamed from: c */
    public final boolean mo27866c(ufd0 ufd0Var) {
        return this.f79345X.mo27866c(ufd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p204p.wz8
    /* JADX INFO: renamed from: p */
    public final void mo33612p(qp71 qp71Var) {
        long j;
        n1d0 n1d0Var;
        vsd0 vsd0VarM86307a;
        n1d0 n1d0Var2;
        if (this.f173056P0) {
            n1d0 n1d0Var3 = this.f173053M0;
            this.f173053M0 = new n1d0(qp71Var, n1d0Var3.f149397g, n1d0Var3.f149398h);
            m1d0 m1d0Var = this.f173054N0;
            if (m1d0Var != null) {
                m68787M(m1d0Var.f138945g);
            }
        } else {
            if (!qp71Var.m73436p()) {
                mp71 mp71Var = this.f173059Z;
                qp71Var.m73435m(0, mp71Var);
                long j2 = mp71Var.f145937l;
                Object obj = mp71Var.f145926a;
                m1d0 m1d0Var2 = this.f173054N0;
                if (m1d0Var2 != null) {
                    long j3 = m1d0Var2.f138940b;
                    n1d0 n1d0Var4 = this.f173053M0;
                    Object obj2 = m1d0Var2.f138939a.f244408a;
                    bp71 bp71Var = this.f173052L0;
                    n1d0Var4.mo46978g(obj2, bp71Var);
                    long j4 = bp71Var.f29347e + j3;
                    this.f173053M0.mo26654n(0, mp71Var, 0L);
                    if (j4 != mp71Var.f145937l) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairM73433i = qp71Var.m73433i(this.f173059Z, this.f173052L0, 0, j);
                Object obj3 = pairM73433i.first;
                long jLongValue = ((Long) pairM73433i.second).longValue();
                if (this.f173057Q0) {
                    n1d0 n1d0Var5 = this.f173053M0;
                    n1d0Var = new n1d0(qp71Var, n1d0Var5.f149397g, n1d0Var5.f149398h);
                } else {
                    n1d0Var = new n1d0(qp71Var, obj, obj3);
                }
                this.f173053M0 = n1d0Var;
                m1d0 m1d0Var3 = this.f173054N0;
                if (m1d0Var3 != null && m68787M(jLongValue)) {
                    vsd0 vsd0Var = m1d0Var3.f138939a;
                    Object obj4 = vsd0Var.f244408a;
                    if (this.f173053M0.f149398h != null && obj4.equals(n1d0.f149395i)) {
                        obj4 = this.f173053M0.f149398h;
                    }
                    vsd0VarM86307a = vsd0Var.m86307a(obj4);
                }
                this.f173057Q0 = true;
                this.f173056P0 = true;
                m89412t(this.f173053M0);
                if (vsd0VarM86307a != null) {
                    m1d0 m1d0Var4 = this.f173054N0;
                    m1d0Var4.getClass();
                    m1d0Var4.m60536a(vsd0VarM86307a);
                }
            }
            if (this.f173057Q0) {
                n1d0 n1d0Var6 = this.f173053M0;
                n1d0Var2 = new n1d0(qp71Var, n1d0Var6.f149397g, n1d0Var6.f149398h);
            } else {
                n1d0Var2 = new n1d0(qp71Var, mp71.f145916q, n1d0.f149395i);
            }
            this.f173053M0 = n1d0Var2;
        }
        vsd0VarM86307a = null;
        this.f173057Q0 = true;
        this.f173056P0 = true;
        m89412t(this.f173053M0);
        if (vsd0VarM86307a != null) {
            m1d0 m1d0Var5 = this.f173054N0;
            m1d0Var5.getClass();
            m1d0Var5.m60536a(vsd0VarM86307a);
        }
    }

    @Override // p204p.gfe1, p204p.wz8
    /* JADX INFO: renamed from: v */
    public final void mo27871v(xhd0 xhd0Var) {
        m1d0 m1d0Var = (m1d0) xhd0Var;
        if (m1d0Var.f138943e != null) {
            wz8 wz8Var = m1d0Var.f138942d;
            wz8Var.getClass();
            wz8Var.mo27871v(m1d0Var.f138943e);
        }
        if (xhd0Var == this.f173054N0) {
            this.f173054N0 = null;
        }
    }

    @Override // p204p.orh, p204p.wz8
    /* JADX INFO: renamed from: x */
    public final void mo27872x() {
        this.f173056P0 = false;
        this.f173055O0 = false;
        super.mo27872x();
    }
}
