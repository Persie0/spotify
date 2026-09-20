package p204p;

import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: renamed from: p.fv */
/* JADX INFO: loaded from: classes4.dex */
public final class C1874fv extends AbstractC2248p9 {

    /* JADX INFO: renamed from: c */
    public final C2467uq f73608c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f73609d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f73610e;

    public C1874fv(C2467uq c2467uq, Scheduler scheduler, Scheduler scheduler2, h9y0 h9y0Var) {
        super(h9y0Var);
        this.f73608c = c2467uq;
        this.f73609d = scheduler;
        this.f73610e = scheduler2;
    }

    @Override // p204p.AbstractC2248p9
    /* JADX INFO: renamed from: e */
    public final mic1 mo42754e(x8y0 x8y0Var) {
        C1828ev c1828ev = new C1828ev(this);
        l6q l6qVar = l6q.f130452b;
        C2509vu c2509vu = (C2509vu) x8y0Var.m90232b("VIEW_STATE");
        if (c2509vu == null) {
            c2509vu = C2509vu.f244797b;
        }
        return new C1956hv(c1828ev, c2509vu, l6qVar, MainThreadWorkRunner.m15627a());
    }
}
