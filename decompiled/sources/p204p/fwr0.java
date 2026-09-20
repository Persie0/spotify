package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes10.dex */
public final class fwr0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f74139a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f74140b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f74141c;

    /* JADX INFO: renamed from: d */
    public final x4b f74142d;

    /* JADX INFO: renamed from: e */
    public final x4b f74143e;

    /* JADX INFO: renamed from: f */
    public final q831 f74144f;

    /* JADX INFO: renamed from: g */
    public final jtr0 f74145g;

    /* JADX INFO: renamed from: h */
    public final jrr0 f74146h;

    /* JADX INFO: renamed from: i */
    public final m500 f74147i;

    /* JADX INFO: renamed from: j */
    public final lwz f74148j;

    /* JADX INFO: renamed from: k */
    public final e3p f74149k;

    /* JADX INFO: renamed from: l */
    public final sdo f74150l;

    /* JADX INFO: renamed from: m */
    public final bii0 f74151m;

    /* JADX INFO: renamed from: n */
    public final hme0 f74152n;

    /* JADX INFO: renamed from: o */
    public final je31 f74153o;

    /* JADX INFO: renamed from: p */
    public final vxx f74154p;

    /* JADX INFO: renamed from: q */
    public final pq4 f74155q;

    /* JADX INFO: renamed from: r */
    public final PublishSubject f74156r = new PublishSubject();

    public fwr0(Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, x4b x4bVar, x4b x4bVar2, q831 q831Var, jtr0 jtr0Var, jrr0 jrr0Var, m500 m500Var, lwz lwzVar, e3p e3pVar, sdo sdoVar, bii0 bii0Var, hme0 hme0Var, je31 je31Var, vxx vxxVar, pq4 pq4Var) {
        this.f74139a = scheduler;
        this.f74140b = scheduler2;
        this.f74141c = scheduler3;
        this.f74142d = x4bVar;
        this.f74143e = x4bVar2;
        this.f74144f = q831Var;
        this.f74145g = jtr0Var;
        this.f74146h = jrr0Var;
        this.f74147i = m500Var;
        this.f74148j = lwzVar;
        this.f74149k = e3pVar;
        this.f74150l = sdoVar;
        this.f74151m = bii0Var;
        this.f74152n = hme0Var;
        this.f74153o = je31Var;
        this.f74154p = vxxVar;
        this.f74155q = pq4Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Builder m42982a(Observable observable) {
        cwr0 cwr0Var = new cwr0();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        int i = 2;
        subtypeEffectHandlerBuilderM15658c.m15665g(kur0.class, new csr0(2, this.f74145g, this.f74143e));
        x4b x4bVar = this.f74142d;
        int i2 = 3;
        zur0 zur0Var = new zur0(x4bVar, i2);
        Scheduler scheduler = this.f74139a;
        subtypeEffectHandlerBuilderM15658c.m15662d(dur0.class, zur0Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(cur0.class, new zur0(x4bVar, i), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(hur0.class, new zur0(x4bVar, 7), scheduler);
        int i3 = 4;
        subtypeEffectHandlerBuilderM15658c.m15662d(eur0.class, new zur0(x4bVar, i3), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(fur0.class, new zur0(x4bVar, 5), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(gur0.class, new zur0(x4bVar, 6), scheduler);
        int i4 = 0;
        subtypeEffectHandlerBuilderM15658c.m15662d(aur0.class, new zur0(x4bVar, i4), scheduler);
        int i5 = 1;
        subtypeEffectHandlerBuilderM15658c.m15665g(iur0.class, new csr0(scheduler, this.f74146h, 1));
        q831 q831Var = this.f74144f;
        subtypeEffectHandlerBuilderM15658c.m15662d(ztr0.class, new yur0(i4, q831Var), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(vur0.class, new yur0(i5, q831Var), scheduler);
        m500 m500Var = this.f74147i;
        subtypeEffectHandlerBuilderM15658c.m15662d(pur0.class, new avr0(m500Var, q831Var, i5), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(wur0.class, new avr0(m500Var, q831Var, i3), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(our0.class, new ig1(this.f74148j, m500Var, 1), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(bur0.class, new zur0(x4bVar, i5), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(mur0.class, new wk6(this.f74152n, this.f74150l, this.f74151m, 21), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(nur0.class, new zur0(x4bVar, 8), scheduler);
        e3p e3pVar = this.f74149k;
        subtypeEffectHandlerBuilderM15658c.m15665g(xtr0.class, new xur0(e3pVar, i5));
        subtypeEffectHandlerBuilderM15658c.m15665g(ytr0.class, new xur0(e3pVar, i4));
        je31 je31Var = this.f74153o;
        subtypeEffectHandlerBuilderM15658c.m15665g(jur0.class, new wrr0(je31Var, i));
        subtypeEffectHandlerBuilderM15658c.m15665g(wtr0.class, new wrr0(je31Var, i5));
        vxx vxxVar = this.f74154p;
        subtypeEffectHandlerBuilderM15658c.m15665g(tur0.class, new bvr0(scheduler, vxxVar, i4));
        subtypeEffectHandlerBuilderM15658c.m15662d(sur0.class, new wk6(q831Var, m500Var, x4bVar, 22), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(rur0.class, new avr0(q831Var, m500Var, i2), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(uur0.class, new wk6(vxxVar, m500Var, this.f74155q, 23), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(qur0.class, new avr0(q831Var, m500Var, i), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(lur0.class, new avr0(q831Var, m500Var, i4), scheduler);
        return edb.m38558g(Mobius.m15582d(cwr0Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15596h(RxEventSources.m15655a(observable.map(jbr0.f110863c), this.f74156r)).mo15590b(new dwr0(this)).mo15592d(new ewr0(this)));
    }
}
