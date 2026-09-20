package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class uk11 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231199a;

    /* JADX INFO: renamed from: b */
    public final wr9 f231200b;

    public /* synthetic */ uk11(wr9 wr9Var, int i) {
        this.f231199a = i;
        this.f231200b = wr9Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f231199a) {
            case 0:
                this.f231200b.m88811a(((mj6) obj).f144167g, false);
                break;
            default:
                this.f231200b.m88811a(((mjt) obj).f144329a, false);
                break;
        }
    }
}
