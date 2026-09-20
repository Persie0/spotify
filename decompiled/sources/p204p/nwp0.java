package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class nwp0 implements k2s0 {

    /* JADX INFO: renamed from: a */
    public final gun f159257a;

    /* JADX INFO: renamed from: b */
    public final w8q0 f159258b;

    /* JADX INFO: renamed from: c */
    public final r3n0 f159259c;

    /* JADX INFO: renamed from: d */
    public final Context f159260d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f159261e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f159262f;

    /* JADX INFO: renamed from: g */
    public final hgn f159263g;

    /* JADX INFO: renamed from: h */
    public final CompletableSubject f159264h = CompletableSubject.m23801B();

    /* JADX INFO: renamed from: i */
    public final CompositeDisposable f159265i = new CompositeDisposable();

    /* JADX INFO: renamed from: j */
    public vnf f159266j;

    public nwp0(gun gunVar, w8q0 w8q0Var, r3n0 r3n0Var, Context context, Scheduler scheduler, Scheduler scheduler2, hgn hgnVar) {
        this.f159257a = gunVar;
        this.f159258b = w8q0Var;
        this.f159259c = r3n0Var;
        this.f159260d = context;
        this.f159261e = scheduler;
        this.f159262f = scheduler2;
        this.f159263g = hgnVar;
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: a */
    public final String mo32193a() {
        return "playlists";
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: b */
    public final hjv0 mo32194b() {
        vnf vnfVar = this.f159266j;
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
        boolean zM87842p = wdg1.m87842p(p2s0Var);
        String strM87843q = wdg1.m87843q(p2s0Var);
        if (this.f159266j == null) {
            this.f159266j = gun.m45787a(this.f159257a, "playlists", p2s0Var.f173428a, this.f159263g.m47476a(p2s0Var.f173431d), new e0m0(this, p2s0Var, strM87843q, 18), new mwp0(this, p2s0Var, 0), new znn0(17, this, p2s0Var), null, new mwp0(this, p2s0Var, 1), 64);
        }
        this.f159259c.m74699v(strM87843q, zM87842p).subscribeOn(this.f159261e).observeOn(this.f159262f).subscribe(new ao90(25, p2s0Var, this), new o4n0(this, 14), ah4.f15596O0, this.f159265i);
    }

    @Override // p204p.k2s0
    /* JADX INFO: renamed from: e */
    public final CompletableSubject mo32197e() {
        return this.f159264h;
    }

    @Override // p204p.k2s0
    public final void stop() {
        this.f159265i.m23396g();
    }
}
