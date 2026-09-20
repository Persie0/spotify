package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class hr40 {

    /* JADX INFO: renamed from: a */
    public final zy5 f94343a;

    /* JADX INFO: renamed from: b */
    public final nx90 f94344b;

    /* JADX INFO: renamed from: c */
    public final tw90 f94345c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f94346d;

    /* JADX INFO: renamed from: e */
    public final sc01 f94347e;

    /* JADX INFO: renamed from: f */
    public final bi1 f94348f;

    /* JADX INFO: renamed from: g */
    public final s8w0 f94349g;

    /* JADX INFO: renamed from: h */
    public final agt0 f94350h;

    /* JADX INFO: renamed from: i */
    public final agt0 f94351i;

    /* JADX INFO: renamed from: j */
    public final cz90 f94352j;

    /* JADX INFO: renamed from: k */
    public final fp9 f94353k;

    /* JADX INFO: renamed from: l */
    public final s8w0 f94354l;

    /* JADX INFO: renamed from: m */
    public final sc01 f94355m;

    /* JADX INFO: renamed from: n */
    public final wk6 f94356n;

    /* JADX INFO: renamed from: o */
    public final fp9 f94357o;

    /* JADX INFO: renamed from: p */
    public final ynb0 f94358p;

    /* JADX INFO: renamed from: q */
    public final ynb0 f94359q;

    /* JADX INFO: renamed from: r */
    public final ig1 f94360r;

    /* JADX INFO: renamed from: s */
    public final z9j0 f94361s;

    /* JADX INFO: renamed from: t */
    public final q831 f94362t;

    /* JADX INFO: renamed from: u */
    public final kx90 f94363u;

    public hr40(zy5 zy5Var, nx90 nx90Var, tw90 tw90Var, Scheduler scheduler, sc01 sc01Var, bi1 bi1Var, s8w0 s8w0Var, agt0 agt0Var, agt0 agt0Var2, cz90 cz90Var, fp9 fp9Var, s8w0 s8w0Var2, sc01 sc01Var2, wk6 wk6Var, fp9 fp9Var2, ynb0 ynb0Var, ynb0 ynb0Var2, ig1 ig1Var, z9j0 z9j0Var, q831 q831Var, kx90 kx90Var) {
        this.f94343a = zy5Var;
        this.f94344b = nx90Var;
        this.f94345c = tw90Var;
        this.f94346d = scheduler;
        this.f94347e = sc01Var;
        this.f94348f = bi1Var;
        this.f94349g = s8w0Var;
        this.f94350h = agt0Var;
        this.f94351i = agt0Var2;
        this.f94352j = cz90Var;
        this.f94353k = fp9Var;
        this.f94354l = s8w0Var2;
        this.f94355m = sc01Var2;
        this.f94356n = wk6Var;
        this.f94357o = fp9Var2;
        this.f94358p = ynb0Var;
        this.f94359q = ynb0Var2;
        this.f94360r = ig1Var;
        this.f94361s = z9j0Var;
        this.f94362t = q831Var;
        this.f94363u = kx90Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Builder m48323a() {
        gr40 gr40Var = new gr40();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        sc01 sc01Var = this.f94347e;
        Scheduler scheduler = this.f94346d;
        subtypeEffectHandlerBuilderM15658c.m15662d(vu90.class, sc01Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(uu90.class, this.f94353k, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(cv90.class, this.f94355m, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(fv90.class, this.f94356n, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(tu90.class, this.f94357o, scheduler);
        ig1 ig1Var = this.f94360r;
        subtypeEffectHandlerBuilderM15658c.m15662d(pu90.class, ig1Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15665g(bv90.class, this.f94354l);
        subtypeEffectHandlerBuilderM15658c.m15665g(qu90.class, this.f94348f);
        subtypeEffectHandlerBuilderM15658c.m15665g(av90.class, this.f94349g);
        subtypeEffectHandlerBuilderM15658c.m15665g(gv90.class, this.f94350h);
        subtypeEffectHandlerBuilderM15658c.m15665g(hv90.class, this.f94351i);
        final int i = 0;
        final cz90 cz90Var = this.f94352j;
        subtypeEffectHandlerBuilderM15658c.m15665g(xu90.class, new ObservableTransformer() { // from class: p.jv90
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                switch (i) {
                    case 0:
                        return observable.flatMapSingle(new csy(cz90Var, 22));
                    default:
                        return observable.switchMap(new mm90(cz90Var, 2));
                }
            }
        });
        final int i2 = 1;
        subtypeEffectHandlerBuilderM15658c.m15665g(wu90.class, new ObservableTransformer() { // from class: p.jv90
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                switch (i2) {
                    case 0:
                        return observable.flatMapSingle(new csy(cz90Var, 22));
                    default:
                        return observable.switchMap(new mm90(cz90Var, 2));
                }
            }
        });
        subtypeEffectHandlerBuilderM15658c.m15665g(zu90.class, this.f94358p);
        subtypeEffectHandlerBuilderM15658c.m15665g(yu90.class, this.f94359q);
        z9j0 z9j0Var = this.f94361s;
        subtypeEffectHandlerBuilderM15658c.m15660b(su90.class, new gp9(z9j0Var, 2), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15660b(ru90.class, new gp9(z9j0Var, 3), scheduler);
        q831 q831Var = this.f94362t;
        kx90 kx90Var = this.f94363u;
        subtypeEffectHandlerBuilderM15658c.m15662d(dv90.class, new kv90(q831Var, kx90Var, ig1Var, 0), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(ev90.class, new kv90(q831Var, kx90Var, ig1Var, 1), scheduler);
        return Mobius.m15582d(gr40Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15594f(this.f94344b).mo15597i(this.f94345c);
    }
}
