package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class qyp {

    /* JADX INFO: renamed from: a */
    public final z9j0 f193956a;

    /* JADX INFO: renamed from: b */
    public final bz41 f193957b;

    /* JADX INFO: renamed from: c */
    public final xmv f193958c;

    /* JADX INFO: renamed from: d */
    public final ybn f193959d;

    /* JADX INFO: renamed from: e */
    public final xt7 f193960e;

    /* JADX INFO: renamed from: f */
    public final ct7 f193961f;

    /* JADX INFO: renamed from: g */
    public final ht7 f193962g;

    /* JADX INFO: renamed from: h */
    public final k7q f193963h;

    /* JADX INFO: renamed from: i */
    public final sip f193964i;

    /* JADX INFO: renamed from: j */
    public final gcp f193965j;

    /* JADX INFO: renamed from: k */
    public final boolean f193966k;

    /* JADX INFO: renamed from: l */
    public final boolean f193967l;

    /* JADX INFO: renamed from: m */
    public final raa1 f193968m;

    /* JADX INFO: renamed from: n */
    public final xda1 f193969n;

    /* JADX INFO: renamed from: o */
    public final d5l0 f193970o;

    /* JADX INFO: renamed from: p */
    public final luk f193971p;

    /* JADX INFO: renamed from: q */
    public final Scheduler f193972q;

    /* JADX INFO: renamed from: r */
    public final PublishSubject f193973r = new PublishSubject();

    /* JADX INFO: renamed from: s */
    public final BehaviorSubject f193974s = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: t */
    public final BehaviorSubject f193975t = BehaviorSubject.m23796g(Boolean.FALSE);

    /* JADX INFO: renamed from: u */
    public final BehaviorSubject f193976u = BehaviorSubject.m23796g(i4q0.f98574a);

    /* JADX INFO: renamed from: v */
    public final CompositeDisposable f193977v = new CompositeDisposable();

    public qyp(z9j0 z9j0Var, bz41 bz41Var, xmv xmvVar, ybn ybnVar, xt7 xt7Var, ct7 ct7Var, ht7 ht7Var, k7q k7qVar, sip sipVar, gcp gcpVar, boolean z, boolean z2, raa1 raa1Var, xda1 xda1Var, d5l0 d5l0Var, luk lukVar, Scheduler scheduler) {
        this.f193956a = z9j0Var;
        this.f193957b = bz41Var;
        this.f193958c = xmvVar;
        this.f193959d = ybnVar;
        this.f193960e = xt7Var;
        this.f193961f = ct7Var;
        this.f193962g = ht7Var;
        this.f193963h = k7qVar;
        this.f193964i = sipVar;
        this.f193965j = gcpVar;
        this.f193966k = z;
        this.f193967l = z2;
        this.f193968m = raa1Var;
        this.f193969n = xda1Var;
        this.f193970o = d5l0Var;
        this.f193971p = lukVar;
        this.f193972q = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final void m74215a() {
        this.f193977v.m23396g();
        gcp gcpVar = this.f193965j;
        di41 di41Var = gcpVar.f78632e;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        gcpVar.f78632e = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m74216b(String str, u7n u7nVar) {
        fbk fbkVar = null;
        oyp oypVar = new oyp(this, str, fbkVar, 1);
        luk lukVar = this.f193971p;
        Single singleM85770t = vjf1.m85770t(lukVar, oypVar);
        Boolean bool = Boolean.FALSE;
        Single singleOnErrorReturnItem = singleM85770t.onErrorReturnItem(bool);
        BehaviorSubject behaviorSubject = this.f193974s;
        Disposable disposableSubscribe = singleOnErrorReturnItem.subscribe(new ir5(behaviorSubject, 8));
        CompositeDisposable compositeDisposable = this.f193977v;
        compositeDisposable.mo23393b(disposableSubscribe);
        if (this.f193966k || this.f193967l) {
            compositeDisposable.mo23393b(vjf1.m85770t(lukVar, new oyp(this, str, fbkVar, 2)).onErrorReturnItem(bool).subscribe(new tjp(2, this, str)));
        }
        bz41 bz41Var = this.f193957b;
        boolean z = bz41Var.f32407b;
        Resources resources = bz41Var.f32408c;
        za01 za01Var = new za01(va01.f239077a, z, resources.getString(R.string.podcast_settings_header), resources.getString(R.string.podcast_settings_item_mark_as_finished), str.concat(":markasplayed"));
        czo czoVar = bz41Var.f32406a;
        fzo fzoVar = (fzo) czoVar.f43599a;
        compositeDisposable.mo23393b(Observable.combineLatest(Single.zip(((rwx0) fzoVar.f75134d).m76591b("offline").map(p4h1.f173932T0).first(bool), fzoVar.f75132b.m89603c(Collections.singletonList(str), fzo.f75130f), ((jpx) fzoVar.f75135e).m53978b(new C1668ai("autodownload-content-experience", false, (gh00) new eml(str, 8))).filter(g2h1.f75941R0).map(new d7f1(str, 4)).first(rhj.f199233a), new p7o(9, str, fzoVar)).flatMapObservable(o5h1.f161981T0).flatMapSingle(new bzo(czoVar, 0)).map(opg1.f167911T0).map(new w221(za01Var, 8)).onErrorReturnItem(za01Var), this.f193958c.m91475a(str, gn80.SHOW_SHOW).toObservable(), behaviorSubject.distinctUntilChanged(), this.f193975t.distinctUntilChanged(), this.f193976u.distinctUntilChanged(), new ze8(this, str)).observeOn(this.f193972q).subscribe(new ujp(u7nVar, 11)));
        compositeDisposable.mo23393b(this.f193973r.flatMapCompletable(new xvo(this, 12)).subscribe());
        u7nVar.f227731f = new dxl(27, this, str);
    }
}
