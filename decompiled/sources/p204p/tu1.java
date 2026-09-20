package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes10.dex */
public final class tu1 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223740a;

    /* JADX INFO: renamed from: b */
    public final k1v0 f223741b;

    public /* synthetic */ tu1(k1v0 k1v0Var, int i) {
        this.f223740a = i;
        this.f223741b = k1v0Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f223740a) {
            case 0:
                return observable.flatMap(new c961(this, 9));
            case 1:
                return observable.flatMap(new egb1(this, 7));
            case 2:
                return observable.flatMap(new s5f1(this, 10));
            case 3:
                return observable.flatMap(new vk9(this, 11));
            default:
                return observable.flatMap(new urt0(this, 9));
        }
    }
}
