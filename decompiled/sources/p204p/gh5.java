package p204p;

import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class gh5 implements eh5, o6d0, j3b0 {

    /* JADX INFO: renamed from: a */
    public final gp70 f79804a;

    /* JADX INFO: renamed from: b */
    public a911 f79805b;

    /* JADX INFO: renamed from: c */
    public boolean f79806c;

    public gh5(gp70 gp70Var, a911 a911Var) {
        this.f79804a = gp70Var;
        this.f79805b = a911Var;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: D */
    public final float mo26962D(long j) {
        return this.f79804a.mo26962D(j);
    }

    @Override // p204p.o6d0
    /* JADX INFO: renamed from: G */
    public final n6d0 mo34817G(int i, int i2, Map map, gh00 gh00Var, gh00 gh00Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mt40.m62791c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new fh5(i, i2, map, gh00Var, gh00Var2, this);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: L */
    public final long mo35985L(int i) {
        return this.f79804a.mo35985L(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O */
    public final long mo35986O(float f) {
        return this.f79804a.mo35986O(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O0 */
    public final float mo35987O0(int i) {
        return this.f79804a.mo35987O0(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: P0 */
    public final float mo35988P0(float f) {
        return f / this.f79804a.mo24619j();
    }

    @Override // p204p.o6d0
    /* JADX INFO: renamed from: T */
    public final n6d0 mo44714T(int i, int i2, Map map, gh00 gh00Var) {
        return this.f79804a.mo34817G(i, i2, map, null, gh00Var);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f79804a.mo24617W0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: Z0 */
    public final float mo35989Z0(float f) {
        return this.f79804a.mo24619j() * f;
    }

    @Override // p204p.j3b0
    /* JADX INFO: renamed from: a */
    public final jo70 mo44327a(jo70 jo70Var) {
        g3b0 g3b0Var;
        if (jo70Var instanceof g3b0) {
            return jo70Var;
        }
        if (jo70Var instanceof bnj0) {
            f3b0 f3b0VarMo30015Y0 = ((bnj0) jo70Var).mo30015Y0();
            return (f3b0VarMo30015Y0 == null || (g3b0Var = f3b0VarMo30015Y0.f65446P0) == null) ? jo70Var : g3b0Var;
        }
        mt40.m62790b("Unsupported LayoutCoordinates");
        throw new KotlinNothingValueException();
    }

    @Override // p204p.rj50
    /* JADX INFO: renamed from: a0 */
    public final boolean mo34819a0() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44715c() {
        return this.f79806c;
    }

    /* JADX INFO: renamed from: d */
    public final a911 m44716d() {
        return this.f79805b;
    }

    /* JADX INFO: renamed from: e */
    public final void m44717e() {
        ep70 ep70Var = this.f79804a.f83098u1;
        wj50.m88279p(ep70Var);
        n6d0 n6d0VarMo30043v0 = ep70Var.mo30043v0();
        n6d0VarMo30043v0.mo27122d();
        n6d0VarMo30043v0.mo27120b();
    }

    /* JADX INFO: renamed from: f */
    public final void m44718f(boolean z) {
        this.f79806c = z;
    }

    /* JADX INFO: renamed from: g */
    public final void m44719g(a911 a911Var) {
        this.f79805b = a911Var;
    }

    @Override // p204p.rj50
    public final ko70 getLayoutDirection() {
        return this.f79804a.f28850M0.f135666Y0;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f79804a.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l0 */
    public final int mo35990l0(float f) {
        return this.f79804a.mo35990l0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l1 */
    public final long mo35991l1(long j) {
        return this.f79804a.mo35991l1(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: t0 */
    public final float mo28377t0(long j) {
        return this.f79804a.mo28377t0(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: y */
    public final long mo26963y(float f) {
        return this.f79804a.mo26963y(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: z */
    public final long mo35992z(long j) {
        return this.f79804a.mo35992z(j);
    }
}
