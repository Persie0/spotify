package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes9.dex */
public final class zh1 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282764a;

    /* JADX INFO: renamed from: b */
    public final bdu0 f282765b;

    public /* synthetic */ zh1(bdu0 bdu0Var, int i) {
        this.f282764a = i;
        this.f282765b = bdu0Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f282764a) {
            case 0:
                return observable.switchMapSingle(new ckx0(this, 9));
            default:
                return observable.switchMapSingle(new prv0(this, 3));
        }
    }
}
