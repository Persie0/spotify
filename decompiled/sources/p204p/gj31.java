package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class gj31 implements t160 {

    /* JADX INFO: renamed from: a */
    public final Context f80346a;

    /* JADX INFO: renamed from: b */
    public final tc31 f80347b;

    /* JADX INFO: renamed from: c */
    public final mb80 f80348c;

    /* JADX INFO: renamed from: d */
    public final voi f80349d;

    /* JADX INFO: renamed from: e */
    public final Observable f80350e;

    /* JADX INFO: renamed from: f */
    public final q831 f80351f;

    /* JADX INFO: renamed from: g */
    public final a660 f80352g;

    /* JADX INFO: renamed from: h */
    public final g2q f80353h;

    /* JADX INFO: renamed from: i */
    public final lkp f80354i;

    /* JADX INFO: renamed from: j */
    public final a7p f80355j;

    /* JADX INFO: renamed from: k */
    public final mcu0 f80356k;

    /* JADX INFO: renamed from: l */
    public final jdp0 f80357l;

    /* JADX INFO: renamed from: m */
    public final Scheduler f80358m;

    /* JADX INFO: renamed from: n */
    public final iwr f80359n = new iwr();

    /* JADX INFO: renamed from: o */
    public final iwr f80360o = new iwr();

    public gj31(Context context, tc31 tc31Var, mb80 mb80Var, voi voiVar, Observable observable, q831 q831Var, a660 a660Var, g2q g2qVar, lkp lkpVar, a7p a7pVar, mcu0 mcu0Var, jdp0 jdp0Var, Scheduler scheduler) {
        this.f80346a = context;
        this.f80347b = tc31Var;
        this.f80348c = mb80Var;
        this.f80349d = voiVar;
        this.f80350e = observable;
        this.f80351f = q831Var;
        this.f80352g = a660Var;
        this.f80353h = g2qVar;
        this.f80354i = lkpVar;
        this.f80355j = a7pVar;
        this.f80356k = mcu0Var;
        this.f80357l = jdp0Var;
        this.f80358m = scheduler;
    }

    @Override // p204p.t160
    public final void start() {
        this.f80359n.m51848b(k0e1.m54988g(this.f80348c.f141820e.mo61350a(), dau.f47107a).map(fkr0.f70589O0).distinctUntilChanged().filter(hkr0.f92478P0).subscribe(new sc01(this, 25)));
    }

    @Override // p204p.t160
    public final void stop() {
        this.f80360o.m51847a();
        this.f80359n.m51847a();
    }
}
