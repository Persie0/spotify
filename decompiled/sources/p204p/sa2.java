package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class sa2 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ va2 f207109b;

    public /* synthetic */ sa2(va2 va2Var, int i) {
        this.f207108a = i;
        this.f207109b = va2Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f207108a) {
            case 0:
                this.f207109b.f239087a.f24131T0.onNext(new r521(p4m0.f173981a));
                break;
            default:
                this.f207109b.f239092f.f23318c.m50411c(g0r.f75428a);
                break;
        }
    }
}
