package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public final class g3b0 implements jo70 {

    /* JADX INFO: renamed from: a */
    public final f3b0 f76165a;

    public g3b0(f3b0 f3b0Var) {
        this.f76165a = f3b0Var;
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: C */
    public final jo70 mo29993C() {
        f3b0 f3b0VarMo30015Y0;
        if (!mo30016a()) {
            mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bnj0 bnj0Var = this.f76165a.m40641N0().f28850M0.f135674c1.f263386d.f28854Q0;
        if (bnj0Var == null || (f3b0VarMo30015Y0 = bnj0Var.mo30015Y0()) == null) {
            return null;
        }
        return f3b0VarMo30015Y0.mo30034o0();
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: F */
    public final long mo29996F(jo70 jo70Var, long j) {
        return mo30033o(jo70Var, j, true);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: I */
    public final tiv0 mo30001I(jo70 jo70Var, boolean z) {
        return this.f76165a.m40641N0().mo30001I(jo70Var, z);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: K */
    public final long mo30006K(long j) {
        return this.f76165a.m40641N0().mo30006K(Offset.m257g(j, m43476c()));
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: N */
    public final void mo30008N(jo70 jo70Var, float[] fArr) {
        this.f76165a.m40641N0().mo30008N(jo70Var, fArr);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: a */
    public final boolean mo30016a() {
        return this.f76165a.m40641N0().mo30020b1().f63766L0;
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: b */
    public final long mo30018b() {
        f3b0 f3b0Var = this.f76165a;
        return (((long) f3b0Var.f217322a) << 32) | (((long) f3b0Var.f217323b) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public final long m43476c() {
        f3b0 f3b0Var = this.f76165a;
        f3b0 f3b0VarM47042m = hbg1.m47042m(f3b0Var);
        return Offset.m256f(mo30033o(f3b0VarM47042m.mo30034o0(), 0L, true), f3b0Var.m40641N0().mo30033o(f3b0VarM47042m.m40641N0(), 0L, true));
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: f */
    public final long mo30023f(long j) {
        return Offset.m257g(this.f76165a.m40641N0().mo30023f(j), m43476c());
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: k */
    public final long mo30028k(long j) {
        return Offset.m257g(this.f76165a.m40641N0().mo30028k(j), m43476c());
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: m */
    public final long mo30029m(long j) {
        return this.f76165a.m40641N0().mo30029m(Offset.m257g(j, m43476c()));
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: o */
    public final long mo30033o(jo70 jo70Var, long j, boolean z) {
        boolean z2 = jo70Var instanceof g3b0;
        f3b0 f3b0Var = this.f76165a;
        if (!z2) {
            f3b0 f3b0VarM47042m = hbg1.m47042m(f3b0Var);
            long jMo30033o = mo30033o(f3b0VarM47042m.m40642Q0(), j, z);
            long jMo30050z0 = f3b0VarM47042m.mo30050z0();
            long jM256f = Offset.m256f(jMo30033o, (((long) Float.floatToRawIntBits((int) (jMo30050z0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo30050z0 >> 32)) << 32));
            bnj0 bnj0VarM40641N0 = f3b0VarM47042m.m40641N0();
            if (!bnj0VarM40641N0.mo30020b1().f63766L0) {
                mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            bnj0VarM40641N0.m30036q1();
            bnj0 bnj0VarM40641N1 = bnj0VarM40641N0.f28854Q0;
            if (bnj0VarM40641N1 == null) {
                bnj0VarM40641N1 = f3b0VarM47042m.m40641N0();
                bnj0VarM40641N1.getClass();
            }
            return Offset.m257g(jM256f, bnj0VarM40641N1.mo30033o(jo70Var, 0L, z));
        }
        f3b0 f3b0Var2 = ((g3b0) jo70Var).f76165a;
        f3b0Var2.m40641N0().m30036q1();
        f3b0 f3b0VarMo30015Y0 = f3b0Var.m40641N0().m30013V0(f3b0Var2.m40641N0()).mo30015Y0();
        if (f3b0VarMo30015Y0 != null) {
            boolean z3 = !z;
            long jM92730c = y350.m92730c(y350.m92731d(f3b0Var2.m40648Y0(f3b0VarMo30015Y0, z3), grl0.m45518N(j)), f3b0Var.m40648Y0(f3b0VarMo30015Y0, z3));
            return (((long) Float.floatToRawIntBits((int) (jM92730c >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM92730c & 4294967295L))) & 4294967295L);
        }
        f3b0 f3b0VarM47042m2 = hbg1.m47042m(f3b0Var2);
        boolean z4 = !z;
        long jM92731d = y350.m92731d(y350.m92731d(f3b0Var2.m40648Y0(f3b0VarM47042m2, z4), f3b0VarM47042m2.mo30050z0()), grl0.m45518N(j));
        f3b0 f3b0VarM47042m3 = hbg1.m47042m(f3b0Var);
        long jM92730c2 = y350.m92730c(jM92731d, y350.m92731d(f3b0Var.m40648Y0(f3b0VarM47042m3, z4), f3b0VarM47042m3.mo30050z0()));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM92730c2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM92730c2 & 4294967295L))) & 4294967295L;
        bnj0 bnj0Var = f3b0VarM47042m3.m40641N0().f28854Q0;
        wj50.m88279p(bnj0Var);
        bnj0 bnj0Var2 = f3b0VarM47042m2.m40641N0().f28854Q0;
        wj50.m88279p(bnj0Var2);
        return bnj0Var.mo30033o(bnj0Var2, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: s */
    public final void mo30039s(float[] fArr) {
        this.f76165a.m40641N0().mo30039s(fArr);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: x */
    public final long mo30046x(long j) {
        return this.f76165a.m40641N0().mo30046x(Offset.m257g(0L, m43476c()));
    }
}
