package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vzx {

    /* JADX INFO: renamed from: a */
    public final Flowable f246561a;

    /* JADX INFO: renamed from: b */
    public final qzx f246562b;

    /* JADX INFO: renamed from: c */
    public final i2v f246563c;

    /* JADX INFO: renamed from: d */
    public final xxx f246564d;

    /* JADX INFO: renamed from: e */
    public final azx f246565e;

    /* JADX INFO: renamed from: f */
    public final fzx f246566f;

    /* JADX INFO: renamed from: g */
    public final ezx f246567g;

    /* JADX INFO: renamed from: h */
    public final xzx f246568h;

    /* JADX INFO: renamed from: i */
    public final g0y f246569i;

    /* JADX INFO: renamed from: j */
    public final e0y f246570j;

    /* JADX INFO: renamed from: k */
    public final vnt0 f246571k;

    /* JADX INFO: renamed from: l */
    public final ozx f246572l;

    /* JADX INFO: renamed from: o */
    public final z140 f246575o;

    /* JADX INFO: renamed from: p */
    public final Scheduler f246576p;

    /* JADX INFO: renamed from: u */
    public ObservableRefCount f246581u;

    /* JADX INFO: renamed from: v */
    public final Observable f246582v;

    /* JADX INFO: renamed from: w */
    public final Observable f246583w;

    /* JADX INFO: renamed from: m */
    public final uzx f246573m = new uzx(this);

    /* JADX INFO: renamed from: n */
    public final iwr f246574n = new iwr();

    /* JADX INFO: renamed from: q */
    public Disposable f246577q = EmptyDisposable.f7220a;

    /* JADX INFO: renamed from: r */
    public final ArrayList f246578r = new ArrayList(2);

    /* JADX INFO: renamed from: s */
    public final PublishSubject f246579s = new PublishSubject();

    /* JADX INFO: renamed from: t */
    public fts f246580t = null;

    public vzx(z140 z140Var, Scheduler scheduler, Flowable flowable, azx azxVar, fzx fzxVar, ezx ezxVar, xzx xzxVar, g0y g0yVar, e0y e0yVar, qzx qzxVar, i2v i2vVar, xxx xxxVar, vnt0 vnt0Var, ozx ozxVar, Observable observable, Observable observable2) {
        this.f246575o = z140Var;
        this.f246576p = scheduler;
        this.f246561a = flowable;
        this.f246565e = azxVar;
        this.f246566f = fzxVar;
        this.f246567g = ezxVar;
        this.f246568h = xzxVar;
        this.f246569i = g0yVar;
        this.f246570j = e0yVar;
        this.f246562b = qzxVar;
        this.f246563c = i2vVar;
        this.f246564d = xxxVar;
        this.f246571k = vnt0Var;
        this.f246572l = ozxVar;
        this.f246582v = observable;
        this.f246583w = observable2;
    }

    /* JADX INFO: renamed from: a */
    public final Flowable m86914a(final String str) {
        ((h240) this.f246575o).m46471b(rdi0.f198153a);
        if (this.f246581u == null) {
            this.f246581u = this.f246582v.filter(new eqp(26)).takeUntil(this.f246579s).map(new its(this, 26)).doOnNext(new tzx(this, 0)).doFinally(new vv2(this, 4)).replay(1).m23778f();
        }
        return this.f246581u.subscribeOn(this.f246576p).doOnSubscribe(new rzx(0, this, str)).doFinally(new Action() { // from class: p.szx
            @Override // io.reactivex.rxjava3.functions.Action
            public final void run() {
                ArrayList arrayList = this.f215688a.f246578r;
                String str2 = str;
                arrayList.remove(str2);
                Logger.m3965a("Client disconnected: %s - all connected clients: %s", str2, arrayList);
            }
        }).toFlowable(BackpressureStrategy.f7190d);
    }
}
