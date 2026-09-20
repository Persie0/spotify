package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class lg6 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mg6 f133098b;

    public /* synthetic */ lg6(mg6 mg6Var, int i) {
        this.f133097a = i;
        this.f133098b = mg6Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f133097a) {
            case 0:
                mg6 mg6Var = this.f133098b;
                mg6Var.f143337X.onNext((tco) obj);
                mg6Var.m35106i();
                break;
            default:
                this.f133098b.m35105h((Throwable) obj);
                break;
        }
    }
}
