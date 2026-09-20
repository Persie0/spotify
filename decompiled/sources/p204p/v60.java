package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class v60 implements dut {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237692a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f237693b;

    /* JADX INFO: renamed from: c */
    public final wxh0 f237694c;

    /* JADX INFO: renamed from: d */
    public final j2a1 f237695d;

    /* JADX INFO: renamed from: e */
    public final cph f237696e;

    public v60(int i, ArrayList arrayList) {
        this.f237692a = i;
        int i2 = 3;
        int i3 = 6;
        switch (i) {
            case 1:
                this.f237693b = arrayList;
                this.f237694c = uuf1.m83998r(r2r.f195204c, null, r2r.f195207e, k9q.f120661b1, 2);
                this.f237695d = new j2a1();
                fyf fyfVar = new fyf(new m7q(this, 11), true, -439512922);
                wpi0 wpi0Var = xwt.f266743a;
                this.f237696e = new cph(fyfVar, i2);
                break;
            case 2:
                this.f237693b = arrayList;
                this.f237694c = uuf1.m83998r(etq0.f62769W0, null, null, kwp0.f127157Z0, 6);
                this.f237695d = new j2a1();
                fyf fyfVar2 = new fyf(new uwn0(this, 29), true, 541456026);
                wpi0 wpi0Var2 = xwt.f266743a;
                this.f237696e = new cph(fyfVar2, i2);
                break;
            default:
                this.f237693b = arrayList;
                this.f237694c = uuf1.m83998r(C1717bt.f30478t, null, null, C2322r1.f194619S0, 6);
                this.f237695d = new j2a1();
                fyf fyfVar3 = new fyf(new C2479v1(this, i3), true, 993127638);
                wpi0 wpi0Var3 = xwt.f266743a;
                this.f237696e = new cph(fyfVar3, i2);
                break;
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f237692a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f237695d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f237692a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f237696e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f237692a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f237694c;
    }
}
