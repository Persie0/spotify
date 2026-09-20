package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f3b0 extends d3b0 implements h6d0 {

    /* JADX INFO: renamed from: M0 */
    public final bnj0 f65443M0;

    /* JADX INFO: renamed from: O0 */
    public LinkedHashMap f65445O0;

    /* JADX INFO: renamed from: Q0 */
    public n6d0 f65447Q0;

    /* JADX INFO: renamed from: R0 */
    public final fpi0 f65448R0;

    /* JADX INFO: renamed from: N0 */
    public long f65444N0 = 0;

    /* JADX INFO: renamed from: P0 */
    public final g3b0 f65446P0 = new g3b0(this);

    public f3b0(bnj0 bnj0Var) {
        this.f65443M0 = bnj0Var;
        fpi0 fpi0Var = cmk0.f39726a;
        this.f65448R0 = new fpi0();
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m40638I0(f3b0 f3b0Var, n6d0 n6d0Var) {
        LinkedHashMap linkedHashMap;
        if (n6d0Var != null) {
            f3b0Var.m80119c0((((long) n6d0Var.mo27120b()) & 4294967295L) | (((long) n6d0Var.mo27122d()) << 32));
        } else {
            f3b0Var.m80119c0(0L);
        }
        if (!wj50.m88271j(f3b0Var.f65447Q0, n6d0Var) && n6d0Var != null && ((((linkedHashMap = f3b0Var.f65445O0) != null && !linkedHashMap.isEmpty()) || !n6d0Var.mo27121c().isEmpty()) && !wj50.m88271j(n6d0Var.mo27121c(), f3b0Var.f65445O0))) {
            i3b0 i3b0Var = f3b0Var.f65443M0.f28850M0.f135676d1.f179938q;
            wj50.m88279p(i3b0Var);
            i3b0Var.f98095Q0.m85097j();
            LinkedHashMap linkedHashMap2 = f3b0Var.f65445O0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                f3b0Var.f65445O0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(n6d0Var.mo27121c());
        }
        f3b0Var.f65447Q0 = n6d0Var;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: H0 */
    public final void mo29999H0() {
        mo40646X(this.f65444N0, 0.0f, null);
    }

    /* JADX INFO: renamed from: J0 */
    public final int m40639J0(pb3 pb3Var) {
        fpi0 fpi0Var = this.f65448R0;
        int iM42375d = fpi0Var.m42375d(pb3Var);
        if (iM42375d >= 0) {
            return fpi0Var.f71879c[iM42375d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: M0 */
    public final long m40640M0() {
        return this.f217325d;
    }

    /* JADX INFO: renamed from: N0 */
    public final bnj0 m40641N0() {
        return this.f65443M0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final g3b0 m40642Q0() {
        return this.f65446P0;
    }

    /* JADX INFO: renamed from: R0 */
    public final long m40643R0() {
        return (((long) this.f217323b) & 4294967295L) | (((long) this.f217322a) << 32);
    }

    /* JADX INFO: renamed from: S0 */
    public void mo40644S0() {
        mo30043v0().mo27119a();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m40645V0(long j) {
        if (!y350.m92729b(this.f65444N0, j)) {
            this.f65444N0 = j;
            bnj0 bnj0Var = this.f65443M0;
            i3b0 i3b0Var = bnj0Var.f28850M0.f135676d1.f179938q;
            if (i3b0Var != null) {
                i3b0Var.m49594m0();
            }
            d3b0.m34814D0(bnj0Var);
        }
        if (this.f44837X) {
            return;
        }
        m34824m0(mo30043v0());
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f65443M0.mo24617W0();
    }

    @Override // p204p.t5o0
    /* JADX INFO: renamed from: X */
    public final void mo40646X(long j, float f, gh00 gh00Var) {
        m40645V0(j);
        if (this.f44844t) {
            return;
        }
        mo40644S0();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m40647X0(long j) {
        m40645V0(y350.m92731d(j, this.f217326e));
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m40648Y0(f3b0 f3b0Var, boolean z) {
        long jM92731d = 0;
        f3b0 f3b0VarMo30015Y0 = this;
        while (!f3b0VarMo30015Y0.equals(f3b0Var)) {
            if (!f3b0VarMo30015Y0.f44843i || !z) {
                jM92731d = y350.m92731d(jM92731d, f3b0VarMo30015Y0.f65444N0);
            }
            bnj0 bnj0Var = f3b0VarMo30015Y0.f65443M0.f28854Q0;
            wj50.m88279p(bnj0Var);
            f3b0VarMo30015Y0 = bnj0Var.mo30015Y0();
            wj50.m88279p(f3b0VarMo30015Y0);
        }
        return jM92731d;
    }

    @Override // p204p.d3b0, p204p.rj50
    /* JADX INFO: renamed from: a0 */
    public final boolean mo34819a0() {
        return true;
    }

    @Override // p204p.t5o0, p204p.h6d0
    /* JADX INFO: renamed from: g */
    public final Object mo30025g() {
        return this.f65443M0.mo30025g();
    }

    @Override // p204p.rj50
    public final ko70 getLayoutDirection() {
        return this.f65443M0.f28850M0.f135666Y0;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f65443M0.mo24619j();
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: n0 */
    public final d3b0 mo30031n0() {
        bnj0 bnj0Var = this.f65443M0.f28853P0;
        if (bnj0Var != null) {
            return bnj0Var.mo30015Y0();
        }
        return null;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: o0 */
    public final jo70 mo30034o0() {
        return this.f65446P0;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: r0 */
    public final boolean mo30037r0() {
        return this.f65447Q0 != null;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: u0 */
    public final lp70 mo30041u0() {
        return this.f65443M0.f28850M0;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: v0 */
    public final n6d0 mo30043v0() {
        n6d0 n6d0Var = this.f65447Q0;
        if (n6d0Var != null) {
            return n6d0Var;
        }
        throw edb.m38576y("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: y0 */
    public final d3b0 mo30048y0() {
        bnj0 bnj0Var = this.f65443M0.f28854Q0;
        if (bnj0Var != null) {
            return bnj0Var.mo30015Y0();
        }
        return null;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: z0 */
    public final long mo30050z0() {
        return this.f65444N0;
    }
}
