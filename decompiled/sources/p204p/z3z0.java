package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class z3z0 extends mic1 {

    /* JADX INFO: renamed from: l */
    public static final urv0 f279066l = new urv0("(?<=step=).*(?=&)");

    /* JADX INFO: renamed from: b */
    public final sr31 f279067b;

    /* JADX INFO: renamed from: c */
    public final ltx0 f279068c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f279069d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f279070e;

    /* JADX INFO: renamed from: h */
    public Disposable f279073h;

    /* JADX INFO: renamed from: i */
    public Disposable f279074i;

    /* JADX INFO: renamed from: f */
    public String f279071f = "";

    /* JADX INFO: renamed from: g */
    public List f279072g = lau.f131415a;

    /* JADX INFO: renamed from: j */
    public final xoi0 f279075j = new xoi0(new mnc1(255, null, null, null, null, false));

    /* JADX INFO: renamed from: k */
    public SearchConfiguration f279076k = new SearchConfiguration("", "", "");

    public z3z0(sr31 sr31Var, ltx0 ltx0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f279067b = sr31Var;
        this.f279068c = ltx0Var;
        this.f279069d = scheduler;
        this.f279070e = scheduler2;
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        Disposable disposable = this.f279073h;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f279074i;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m95298e(String str) {
        List list;
        Disposable disposable = this.f279073h;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f279074i;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        boolean zM88460J0 = wl51.m88460J0(str);
        xoi0 xoi0Var = this.f279075j;
        if (zM88460J0 || str.length() > 500) {
            mnc1 mnc1Var = (mnc1) xoi0Var.mo33098e();
            xoi0Var.mo33104m(mnc1Var != null ? mnc1.m62355a(mnc1Var, str, null, null, 254) : null);
            return;
        }
        String placeholder = this.f279076k.getPlaceholder();
        String initialText = this.f279076k.getInitialText();
        mnc1 mnc1Var2 = (mnc1) xoi0Var.mo33098e();
        if (mnc1Var2 == null || (list = mnc1Var2.f145400d) == null) {
            list = lau.f131415a;
        }
        xoi0Var.m33101j(new mnc1(224, str, initialText, placeholder, list, false));
        Observable<Long> observableTimer = Observable.timer(250L, TimeUnit.MILLISECONDS);
        Scheduler scheduler = this.f279070e;
        Observable<Long> observableSubscribeOn = observableTimer.subscribeOn(scheduler);
        Scheduler scheduler2 = this.f279069d;
        this.f279074i = observableSubscribeOn.observeOn(scheduler2).subscribe(new x3z0(this, 0));
        this.f279073h = this.f279068c.m59920o(0, this.f279076k.getUrl(), str).map(new azu0(20, this, str)).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new x3z0(this, 1));
    }

    /* JADX INFO: renamed from: f */
    public final mnc1 m95299f(Object obj, String str, List list) {
        if (s6x0.m77348a(obj) != null) {
            return new mnc1(176, str, this.f279076k.getInitialText(), this.f279076k.getPlaceholder(), list, false);
        }
        List list2 = (List) obj;
        return new mnc1(ContentType.LONG_FORM_ON_DEMAND, str, this.f279076k.getInitialText(), this.f279076k.getPlaceholder(), g6f.m43700N0(list2, list), list2.size() >= 10);
    }
}
