package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class ftx implements dut {

    /* JADX INFO: renamed from: L0 */
    public final cph f73327L0;

    /* JADX INFO: renamed from: X */
    public final en2 f73328X;

    /* JADX INFO: renamed from: Y */
    public final mmh0 f73329Y;

    /* JADX INFO: renamed from: Z */
    public final i5x f73330Z = mhf1.m61771p(this).m94133b(new a5s(this, 19), nhx.f154099N0);

    /* JADX INFO: renamed from: a */
    public final voc1 f73331a;

    /* JADX INFO: renamed from: b */
    public final zam0 f73332b;

    /* JADX INFO: renamed from: c */
    public final yho f73333c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f73334d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f73335e;

    /* JADX INFO: renamed from: f */
    public final bzm f73336f;

    /* JADX INFO: renamed from: g */
    public final boolean f73337g;

    /* JADX INFO: renamed from: h */
    public final boolean f73338h;

    /* JADX INFO: renamed from: i */
    public final boolean f73339i;

    /* JADX INFO: renamed from: t */
    public final pgo f73340t;

    public ftx(esq esqVar, yym yymVar, voc1 voc1Var, zam0 zam0Var, yho yhoVar, zym zymVar, ll9 ll9Var, azm azmVar, Scheduler scheduler, Scheduler scheduler2, ae4 ae4Var, bzm bzmVar, xre xreVar, boolean z, boolean z2, boolean z3) {
        this.f73331a = voc1Var;
        this.f73332b = zam0Var;
        this.f73333c = yhoVar;
        this.f73334d = scheduler;
        this.f73335e = scheduler2;
        this.f73336f = bzmVar;
        this.f73337g = z;
        this.f73338h = z2;
        this.f73339i = z3;
        this.f73340t = esqVar.f62453a;
        this.f73328X = yymVar.m94948a();
        String str = null;
        String str2 = null;
        boolean z4 = false;
        boolean z5 = false;
        String str3 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        LinkedHashSet linkedHashSet = null;
        LinkedHashSet linkedHashSet2 = null;
        boolean z9 = false;
        LinkedHashSet linkedHashSet3 = null;
        boolean z10 = false;
        aaa0 aaa0Var = null;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        this.f73329Y = alf1.m26339v(new pvh0(str, str2, z4, z5, str3, z6, z7, z8, linkedHashSet, linkedHashSet2, ae4Var.m25653a(), z9, linkedHashSet3, z10, aaa0Var, z11, z12, arrayList, String.valueOf(System.currentTimeMillis()), 0, 1833983), new eaq(4), ll9Var, mtv.f147162O0, new c7x(this, 11));
        int i = 3;
        fyf fyfVar = new fyf(new ki0(zymVar, this, azmVar, i), true, 1463645695);
        wpi0 wpi0Var = xwt.f266743a;
        this.f73327L0 = new cph(fyfVar, i);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f73330Z;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f73327L0;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f73329Y;
    }
}
