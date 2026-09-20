package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes11.dex */
public final class k0o0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yse1 f118128b;

    public /* synthetic */ k0o0(yse1 yse1Var, int i) {
        this.f118127a = i;
        this.f118128b = yse1Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f118127a) {
            case 0:
                return observable.switchMapMaybe(new xuk0(this.f118128b, 10));
            default:
                return observable.switchMapCompletable(new hvj0(this.f118128b, 13)).m23307y();
        }
    }
}
