package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes5.dex */
public final class u3w implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ot7 f226477b;

    public /* synthetic */ u3w(ot7 ot7Var, int i) {
        this.f226476a = i;
        this.f226477b = ot7Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f226476a) {
            case 0:
                return observable.switchMap(new yps(this.f226477b, 6));
            case 1:
                return observable.flatMapCompletable(new h7u(this.f226477b, 5)).m23307y();
            case 2:
                return observable.flatMapCompletable(new urt0(this.f226477b, 21)).m23307y();
            default:
                return observable.switchMap(new frv0(this.f226477b, 17));
        }
    }
}
