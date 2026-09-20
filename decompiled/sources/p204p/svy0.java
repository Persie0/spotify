package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class svy0 implements dut {

    /* JADX INFO: renamed from: a */
    public boolean f214534a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f214535b = new kzs0(oxr0.f171513V0);

    /* JADX INFO: renamed from: c */
    public final i5x f214536c;

    /* JADX INFO: renamed from: d */
    public final cph f214537d;

    public svy0(wuy0 wuy0Var) {
        i5x i5xVarM94133b;
        int i = 1;
        if (wuy0Var.equals(vuy0.f245096a)) {
            i5xVarM94133b = mhf1.m61771p(this).m94133b(t4y0.f217149O0, new rvy0(this, 0));
        } else if (wuy0Var.equals(uuy0.f234299a)) {
            i5xVarM94133b = mhf1.m61771p(this).m94133b(t4y0.f217153S0, new rvy0(this, i));
        } else {
            if (!wuy0Var.equals(tuy0.f223978a)) {
                throw new NoWhenBranchMatchedException();
            }
            i5xVarM94133b = mhf1.m61771p(this).m94133b(t4y0.f217154T0, new rvy0(this, 2));
        }
        this.f214536c = i5xVarM94133b;
        fyf fyfVar = new fyf(new fqv0(this, 20), true, 1881749214);
        wpi0 wpi0Var = xwt.f266743a;
        this.f214537d = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f214536c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f214537d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f214535b;
    }
}
