package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ek50 implements o6d0, rj50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rj50 f60387a;

    /* JADX INFO: renamed from: b */
    public final ko70 f60388b;

    public ek50(rj50 rj50Var, ko70 ko70Var) {
        this.f60387a = rj50Var;
        this.f60388b = ko70Var;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: D */
    public final float mo26962D(long j) {
        return this.f60387a.mo26962D(j);
    }

    @Override // p204p.o6d0
    /* JADX INFO: renamed from: G */
    public final n6d0 mo34817G(int i, int i2, Map map, gh00 gh00Var, gh00 gh00Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mt40.m62791c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dk50(i, i2, map, gh00Var);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: L */
    public final long mo35985L(int i) {
        return this.f60387a.mo35985L(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O */
    public final long mo35986O(float f) {
        return this.f60387a.mo35986O(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O0 */
    public final float mo35987O0(int i) {
        return this.f60387a.mo35987O0(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: P0 */
    public final float mo35988P0(float f) {
        return this.f60387a.mo35988P0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f60387a.mo24617W0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: Z0 */
    public final float mo35989Z0(float f) {
        return this.f60387a.mo35989Z0(f);
    }

    @Override // p204p.rj50
    /* JADX INFO: renamed from: a0 */
    public final boolean mo34819a0() {
        return this.f60387a.mo34819a0();
    }

    @Override // p204p.rj50
    public final ko70 getLayoutDirection() {
        return this.f60388b;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f60387a.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l0 */
    public final int mo35990l0(float f) {
        return this.f60387a.mo35990l0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l1 */
    public final long mo35991l1(long j) {
        return this.f60387a.mo35991l1(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: t0 */
    public final float mo28377t0(long j) {
        return this.f60387a.mo28377t0(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: y */
    public final long mo26963y(float f) {
        return this.f60387a.mo26963y(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: z */
    public final long mo35992z(long j) {
        return this.f60387a.mo35992z(j);
    }
}
