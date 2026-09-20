package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes3.dex */
public final class opk0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167962a;

    /* JADX INFO: renamed from: b */
    public final oar0 f167963b;

    public /* synthetic */ opk0(oar0 oar0Var, int i) {
        this.f167962a = i;
        this.f167963b = oar0Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f167962a) {
            case 0:
                return observable.switchMap(new k0a0(this, 21)).map(yyx.f277605R0);
            default:
                return observable.flatMap(new b741(this, 3));
        }
    }
}
