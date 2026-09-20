package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class p2v0 implements k2s0 {

    /* JADX INFO: renamed from: a */
    public final gun f173435a;

    /* JADX INFO: renamed from: b */
    public final w8q0 f173436b;

    /* JADX INFO: renamed from: c */
    public final aaq0 f173437c;

    /* JADX INFO: renamed from: d */
    public final Context f173438d;

    /* JADX INFO: renamed from: e */
    public final hgn f173439e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f173440f;

    /* JADX INFO: renamed from: g */
    public final Scheduler f173441g;

    /* JADX INFO: renamed from: h */
    public final CompletableSubject f173442h = new CompletableSubject();

    /* JADX INFO: renamed from: i */
    public final CompositeDisposable f173443i = new CompositeDisposable();

    /* JADX INFO: renamed from: j */
    public vnf f173444j;

    public p2v0(gun gunVar, w8q0 w8q0Var, aaq0 aaq0Var, Context context, hgn hgnVar, Scheduler scheduler, Scheduler scheduler2) {
        this.f173435a = gunVar;
        this.f173436b = w8q0Var;
        this.f173437c = aaq0Var;
        this.f173438d = context;
        this.f173439e = hgnVar;
        this.f173440f = scheduler;
        this.f173441g = scheduler2;
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: a */
    public final String mo32193a() {
        return "recently-played-artists";
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: b */
    public final hjv0 mo32194b() {
        vnf vnfVar = this.f173444j;
        if (vnfVar != null) {
            return vnfVar;
        }
        wj50.m88260d0("commonAdapter");
        throw null;
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: c */
    public final boolean mo32195c(boolean z) {
        return !z;
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: d */
    public final void mo32196d(p2s0 p2s0Var) {
        String strM87843q = wdg1.m87843q(p2s0Var);
        if (this.f173444j == null) {
            this.f173444j = gun.m45787a(this.f173435a, "recently-played-artists", p2s0Var.f173428a, this.f173439e.m47476a(p2s0Var.f173431d), new gyt0(this, p2s0Var, strM87843q, 5), null, null, new dos0(12, this, p2s0Var), null, 176);
        }
        aaq0 aaq0Var = this.f173437c;
        Observable observableM54988g = k0e1.m54988g(((rq11) aaq0Var.f13909c).f201718a, dau.f47107a);
        Observable.concat(observableM54988g.take(1L), observableM54988g.skip(1L).debounce(500L, TimeUnit.MILLISECONDS)).distinctUntilChanged().flatMapSingle(new w8q0(15, aaq0Var, strM87843q)).subscribeOn(this.f173441g).observeOn(this.f173440f).subscribe(new kwr0(2, p2s0Var, this), new l2s0(this, 8), ah4.f15597P0, this.f173443i);
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: e */
    public final CompletableSubject mo32197e() {
        return this.f173442h;
    }

    @Override // p204p.k2s0
    public final void stop() {
        this.f173443i.m23396g();
    }
}
