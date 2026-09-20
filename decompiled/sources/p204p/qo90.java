package p204p;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class qo90 implements jvb0, fvb0 {

    /* JADX INFO: renamed from: L0 */
    public final c9k f190842L0;

    /* JADX INFO: renamed from: M0 */
    public xn90 f190843M0;

    /* JADX INFO: renamed from: O0 */
    public boolean f190845O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f190846P0;

    /* JADX INFO: renamed from: R0 */
    public final ub80 f190848R0;

    /* JADX INFO: renamed from: S0 */
    public to90 f190849S0;

    /* JADX INFO: renamed from: X */
    public final ff4 f190854X;

    /* JADX INFO: renamed from: Y */
    public final fiz f190856Y;

    /* JADX INFO: renamed from: Z */
    public final luk f190858Z;

    /* JADX INFO: renamed from: a */
    public final m500 f190860a;

    /* JADX INFO: renamed from: b */
    public final c700 f190862b;

    /* JADX INFO: renamed from: b1 */
    public di41 f190863b1;

    /* JADX INFO: renamed from: c */
    public final er70 f190864c;

    /* JADX INFO: renamed from: d */
    public final er70 f190865d;

    /* JADX INFO: renamed from: e */
    public final er70 f190866e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f190867f;

    /* JADX INFO: renamed from: g */
    public final Scheduler f190868g;

    /* JADX INFO: renamed from: h */
    public final er70 f190869h;

    /* JADX INFO: renamed from: i */
    public final er70 f190870i;

    /* JADX INFO: renamed from: t */
    public final er70 f190871t;

    /* JADX INFO: renamed from: N0 */
    public final lwr f190844N0 = new lwr();

    /* JADX INFO: renamed from: Q0 */
    public final BehaviorSubject f190847Q0 = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: T0 */
    public final BehaviorSubject f190850T0 = BehaviorSubject.m23796g(Boolean.FALSE);

    /* JADX INFO: renamed from: U0 */
    public final wg61 f190851U0 = new wg61(new lo90(this, 0));

    /* JADX INFO: renamed from: V0 */
    public final wg61 f190852V0 = new wg61(new lo90(this, 10));

    /* JADX INFO: renamed from: W0 */
    public final wg61 f190853W0 = new wg61(new ye90(this, 1));

    /* JADX INFO: renamed from: X0 */
    public final wg61 f190855X0 = new wg61(new lo90(this, 11));

    /* JADX INFO: renamed from: Y0 */
    public final wg61 f190857Y0 = new wg61(new lo90(this, 12));

    /* JADX INFO: renamed from: Z0 */
    public final wg61 f190859Z0 = new wg61(new lo90(this, 13));

    /* JADX INFO: renamed from: a1 */
    public final wg61 f190861a1 = new wg61(new lo90(this, 14));

    public qo90(m500 m500Var, c700 c700Var, er70 er70Var, er70 er70Var2, er70 er70Var3, Scheduler scheduler, Scheduler scheduler2, er70 er70Var4, er70 er70Var5, er70 er70Var6, ff4 ff4Var, fiz fizVar, luk lukVar, c9k c9kVar) {
        this.f190860a = m500Var;
        this.f190862b = c700Var;
        this.f190864c = er70Var;
        this.f190865d = er70Var2;
        this.f190866e = er70Var3;
        this.f190867f = scheduler;
        this.f190868g = scheduler2;
        this.f190869h = er70Var4;
        this.f190870i = er70Var5;
        this.f190871t = er70Var6;
        this.f190854X = ff4Var;
        this.f190856Y = fizVar;
        this.f190858Z = lukVar;
        this.f190842L0 = c9kVar;
        this.f190848R0 = n5h1.m63737m(m500Var);
    }

    @Override // p204p.fvb0
    /* JADX INFO: renamed from: a */
    public final void mo42778a(Intent intent) {
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className != null && className.hashCode() == 461356827 && className.equals("com.spotify.music.SpotifyEntryPointForGoogleMeet")) {
            this.f190850T0.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: b */
    public final e8x m73370b() {
        if (this.f190854X.m41505a()) {
            return new e8x(this);
        }
        return null;
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: c */
    public final void mo26289c() {
        di41 di41Var = this.f190863b1;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f190863b1 = x0h1.m89578u(this.f190848R0, this.f190858Z, 0, new q950(this, fbkVar, 24), 2);
        Disposable disposableSubscribe = this.f190847Q0.distinctUntilChanged().subscribe(new qmx(this, 10));
        lwr lwrVar = this.f190844N0;
        osg1.m67729o(disposableSubscribe, lwrVar);
        Observable observableFilter = ((ro90) m73371e()).f201194d.distinctUntilChanged().filter(q2z.f184741X);
        Scheduler scheduler = this.f190868g;
        Observable observableSubscribeOn = observableFilter.subscribeOn(scheduler);
        Scheduler scheduler2 = this.f190867f;
        osg1.m67729o(observableSubscribeOn.observeOn(scheduler2).subscribe(new po90(this, 1)), lwrVar);
        Boolean boolValueOf = Boolean.valueOf(!this.f190845O0);
        BehaviorSubject behaviorSubject = this.f190850T0;
        behaviorSubject.onNext(boolValueOf);
        osg1.m67729o(Observable.combineLatest(((ro90) m73371e()).f201194d.distinctUntilChanged(), behaviorSubject.distinctUntilChanged(), uty.f234032i).distinctUntilChanged().subscribeOn(scheduler).observeOn(scheduler2).subscribe(new po90(this, 0)), lwrVar);
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: d */
    public final void mo26290d() {
        di41 di41Var = this.f190863b1;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        to90 to90Var = this.f190849S0;
        if (to90Var != null) {
            to90Var.f222206b.set(null);
        }
        this.f190849S0 = null;
        this.f190844N0.m60129c();
        xn90 xn90Var = this.f190843M0;
        if (xn90Var != null) {
            xn90Var.dismiss();
        }
        this.f190843M0 = null;
        m73373h().m39538b();
    }

    /* JADX INFO: renamed from: e */
    public final co90 m73371e() {
        return (co90) this.f190851U0.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final sn10 m73372f() {
        return (sn10) this.f190852V0.getValue();
    }

    @Override // p204p.jvb0
    /* JADX INFO: renamed from: g */
    public final void mo26291g(ViewGroup viewGroup) {
        wg61 wg61Var = this.f190861a1;
        ((f9y0) wg61Var.getValue()).m41110c("live_sharing_plugin_saved_state_registry_key", new C1982ik(this, 9));
        Bundle bundleM41108a = ((f9y0) wg61Var.getValue()).m41108a("live_sharing_plugin_saved_state_registry_key");
        if (bundleM41108a != null) {
            this.f190845O0 = bundleM41108a.getBoolean("live_sharing_session_dismissed");
            this.f190846P0 = this.f190854X.m41505a() ? bundleM41108a.getBoolean("live_sharing_banner_dismissed") : false;
            Object obj = (ko90) zn91.m96523K(bundleM41108a, "live_sharing_dialog", ko90.class);
            if (obj == null) {
                obj = ho90.f93484a;
            }
            this.f190847Q0.onNext(obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public final eo10 m73373h() {
        return (eo10) this.f190857Y0.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m73374j(xn90 xn90Var) {
        xn90 xn90Var2 = this.f190843M0;
        if (xn90Var2 != null) {
            xn90Var2.dismiss();
        }
        this.f190843M0 = xn90Var;
        xn90Var.mo67382u(this.f190862b);
    }
}
