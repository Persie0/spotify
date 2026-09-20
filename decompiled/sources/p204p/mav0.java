package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class mav0 {

    /* JADX INFO: renamed from: a */
    public final voc1 f141687a;

    /* JADX INFO: renamed from: b */
    public final ud80 f141688b;

    /* JADX INFO: renamed from: c */
    public final wt80 f141689c;

    /* JADX INFO: renamed from: d */
    public final yz80 f141690d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f141691e;

    /* JADX INFO: renamed from: f */
    public final i431 f141692f;

    /* JADX INFO: renamed from: g */
    public final gjv0 f141693g;

    /* JADX INFO: renamed from: h */
    public final z5f f141694h;

    /* JADX INFO: renamed from: i */
    public final luk f141695i;

    /* JADX INFO: renamed from: j */
    public final luk f141696j;

    /* JADX INFO: renamed from: k */
    public final PublishSubject f141697k = new PublishSubject();

    /* JADX INFO: renamed from: l */
    public final PublishSubject f141698l = new PublishSubject();

    /* JADX INFO: renamed from: m */
    public final g130 f141699m = new g130(1);

    /* JADX INFO: renamed from: n */
    public final wg61 f141700n = new wg61(new gst0(this, 16));

    public mav0(xre xreVar, voc1 voc1Var, ud80 ud80Var, wt80 wt80Var, yz80 yz80Var, Scheduler scheduler, i431 i431Var, gjv0 gjv0Var, z5f z5fVar, luk lukVar, luk lukVar2) {
        this.f141687a = voc1Var;
        this.f141688b = ud80Var;
        this.f141689c = wt80Var;
        this.f141690d = yz80Var;
        this.f141691e = scheduler;
        this.f141692f = i431Var;
        this.f141693g = gjv0Var;
        this.f141694h = z5fVar;
        this.f141695i = lukVar;
        this.f141696j = lukVar2;
    }

    /* JADX INFO: renamed from: a */
    public final Single m61329a(String str) {
        g130 g130Var = this.f141699m;
        Single single = (Single) g130Var.get(str);
        if (single != null) {
            return single;
        }
        Single singleCache = vjf1.m85770t(this.f141695i, new kav0(this, str, null, 1)).map(alq0.f16941g).cache();
        g130Var.put(str, singleCache);
        return singleCache;
    }

    /* JADX INFO: renamed from: b */
    public final Observable m61330b(Set set) {
        List listM43728j1 = g6f.m43728j1(set);
        this.f141693g.m44968h();
        return Observable.combineLatest(this.f141694h.m95459c("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", listM43728j1, false), (Observable) this.f141700n.getValue(), new qst0(set, 5));
    }
}
