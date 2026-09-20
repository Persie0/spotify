package p204p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class ul3 extends AbstractC2248p9 {

    /* JADX INFO: renamed from: c */
    public final ic3 f231419c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f231420d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f231421e;

    public ul3(ic3 ic3Var, Scheduler scheduler, Scheduler scheduler2, h9y0 h9y0Var) {
        super(h9y0Var);
        this.f231419c = ic3Var;
        this.f231420d = scheduler;
        this.f231421e = scheduler2;
    }

    @Override // p204p.AbstractC2248p9
    /* JADX INFO: renamed from: e */
    public final mic1 mo42754e(x8y0 x8y0Var) {
        return new cd3(new tl3(this), x8y0Var);
    }
}
