package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.searchview.proto.Entity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class kyc1 implements ssi {

    /* JADX INFO: renamed from: X */
    public final BehaviorSubject f127789X;

    /* JADX INFO: renamed from: a */
    public final er70 f127790a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f127791b;

    /* JADX INFO: renamed from: c */
    public final BehaviorSubject f127792c;

    /* JADX INFO: renamed from: d */
    public final BehaviorSubject f127793d;

    /* JADX INFO: renamed from: e */
    public final zv41 f127794e;

    /* JADX INFO: renamed from: f */
    public final nuu0 f127795f;

    /* JADX INFO: renamed from: g */
    public final iwr f127796g;

    /* JADX INFO: renamed from: h */
    public iyc1 f127797h;

    /* JADX INFO: renamed from: i */
    public final BehaviorSubject f127798i;

    /* JADX INFO: renamed from: t */
    public final BehaviorSubject f127799t;

    public kyc1(er70 er70Var) {
        this.f127790a = er70Var;
        C2244p5 c2244p5 = C2244p5.f174033a;
        BehaviorSubject behaviorSubjectM23796g = BehaviorSubject.m23796g(c2244p5);
        this.f127791b = behaviorSubjectM23796g;
        BehaviorSubject behaviorSubjectM23796g2 = BehaviorSubject.m23796g(c2244p5);
        this.f127792c = behaviorSubjectM23796g2;
        BehaviorSubject behaviorSubjectM23796g3 = BehaviorSubject.m23796g(c2244p5);
        this.f127793d = behaviorSubjectM23796g3;
        zv41 zv41VarM52819d = jag1.m52819d(nau.f152117a);
        this.f127794e = zv41VarM52819d;
        this.f127795f = bzf1.m31021m(zv41VarM52819d);
        this.f127796g = new iwr();
        this.f127798i = behaviorSubjectM23796g;
        this.f127799t = behaviorSubjectM23796g2;
        this.f127789X = behaviorSubjectM23796g3;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f127796g.m51847a();
        BehaviorSubject behaviorSubject = this.f127791b;
        C2244p5 c2244p5 = C2244p5.f174033a;
        behaviorSubject.onNext(c2244p5);
        this.f127792c.onNext(c2244p5);
        this.f127793d.onNext(c2244p5);
        zv41 zv41Var = this.f127794e;
        zv41Var.getClass();
        zv41Var.m97091m(null, nau.f152117a);
        this.f127797h = new iyc1(false, Entity.SERP_METADATA_FIELD_NUMBER);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        xgq xgqVar = (xgq) ((byc1) this.f127790a.get());
        xgqVar.getClass();
        Observable observableNever = Observable.never();
        MobiusLoop.Builder builderM15582d = Mobius.m15582d(wgq.f251129a, RxConnectables.m15653a(exc1.m40230b(xgqVar.f261352d, xgqVar.f261355g, xgqVar.f261356h, xgqVar.f261354f, xgqVar.f261358j, xgqVar.f261359k)));
        r4x r4xVar = xgqVar.f261349a;
        r4xVar.getClass();
        Observable observableSubscribeOn = Observable.defer(new p4x(r4xVar, 0)).subscribeOn(r4xVar.f195869a);
        dxo dxoVar = xgqVar.f261350b;
        voi voiVar = xgqVar.f261351c;
        z5p z5pVar = xgqVar.f261352d;
        whp whpVar = xgqVar.f261353e;
        w2q w2qVar = xgqVar.f261360l;
        Scheduler scheduler = xgqVar.f261354f;
        BehaviorSubject behaviorSubject = xgqVar.f261357i.f231606e;
        boolean zIsEnabled = xgqVar.f261364p.isEnabled();
        dau dauVar = dau.f47107a;
        this.f127796g.m51848b(observableNever.compose(RxMobius.m15657b(edb.m38558g(builderM15582d.mo15596h(svg1.m79453G(observableSubscribeOn, dxoVar, voiVar, z5pVar, whpVar, w2qVar, scheduler, behaviorSubject, zIsEnabled ? k0e1.m54988g(xgqVar.f261362n.f258963h, dauVar) : Observable.combineLatest(k0e1.m54988g(xgqVar.f261361m.f281556b, dauVar), ((s5p) xgqVar.f261351c).m77297d(), new ia7(xgqVar, 8))))), new iyc1(xgqVar.f261363o.isEnabled(), 1791))).subscribe(new s651(this, 28)));
    }
}
