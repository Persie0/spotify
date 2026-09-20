package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes10.dex */
public final class ftr0 {

    /* JADX INFO: renamed from: a */
    public final jyx0 f73281a;

    /* JADX INFO: renamed from: b */
    public final e3p f73282b;

    /* JADX INFO: renamed from: c */
    public final vsk f73283c;

    /* JADX INFO: renamed from: d */
    public final x4b f73284d;

    /* JADX INFO: renamed from: e */
    public final qwx0 f73285e;

    /* JADX INFO: renamed from: f */
    public final q140 f73286f;

    /* JADX INFO: renamed from: g */
    public final b2s0 f73287g;

    /* JADX INFO: renamed from: h */
    public final Scheduler f73288h;

    /* JADX INFO: renamed from: i */
    public final ynb f73289i;

    /* JADX INFO: renamed from: j */
    public final je31 f73290j;

    /* JADX INFO: renamed from: k */
    public final Scheduler f73291k;

    /* JADX INFO: renamed from: l */
    public final atr0 f73292l;

    /* JADX INFO: renamed from: m */
    public final hua1 f73293m;

    /* JADX INFO: renamed from: n */
    public final luk f73294n;

    /* JADX INFO: renamed from: o */
    public final Scheduler f73295o;

    public ftr0(jyx0 jyx0Var, e3p e3pVar, vsk vskVar, x4b x4bVar, qwx0 qwx0Var, q140 q140Var, b2s0 b2s0Var, Scheduler scheduler, ynb ynbVar, je31 je31Var, Scheduler scheduler2, atr0 atr0Var, hua1 hua1Var, luk lukVar, Scheduler scheduler3) {
        this.f73281a = jyx0Var;
        this.f73282b = e3pVar;
        this.f73283c = vskVar;
        this.f73284d = x4bVar;
        this.f73285e = qwx0Var;
        this.f73286f = q140Var;
        this.f73287g = b2s0Var;
        this.f73288h = scheduler;
        this.f73289i = ynbVar;
        this.f73290j = je31Var;
        this.f73291k = scheduler2;
        this.f73292l = atr0Var;
        this.f73293m = hua1Var;
        this.f73294n = lukVar;
        this.f73295o = scheduler3;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m42687a(String str, String str2, boolean z) {
        return Observable.defer(new etr0(this, str, str2, z));
    }
}
