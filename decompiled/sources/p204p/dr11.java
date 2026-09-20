package p204p;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes9.dex */
public final class dr11 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52147a;

    /* JADX INFO: renamed from: b */
    public final Object f52148b;

    /* JADX INFO: renamed from: c */
    public final boolean f52149c;

    /* JADX INFO: renamed from: d */
    public final Object f52150d;

    public dr11(zsf zsfVar, bi50 bi50Var, boolean z) {
        this.f52147a = 4;
        this.f52148b = zsfVar;
        this.f52150d = bi50Var;
        this.f52149c = z;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f52147a) {
            case 0:
                return observable.flatMap(new fus0(this, 28));
            case 1:
                return observable.flatMap(new b9v0(this, 23));
            case 2:
                return observable.flatMap(new jhz0(this, 6));
            case 3:
                return observable.flatMap(new gjv0(this, 23));
            default:
                return !this.f52149c ? observable.map(mzx.f148819Y0) : Observable.combineLatest(new ObservableFromPublisher((bi50) this.f52150d), observable, zzx.f288137X0).switchMap(new bcm0(this, 9));
        }
    }

    public dr11(tgw tgwVar, boolean z, int i) {
        this.f52147a = i;
        switch (i) {
            case 1:
                this.f52148b = tgwVar;
                this.f52149c = z;
                this.f52150d = new Handler(Looper.getMainLooper());
                break;
            case 2:
                this.f52148b = tgwVar;
                this.f52149c = z;
                this.f52150d = new Handler(Looper.getMainLooper());
                break;
            case 3:
                this.f52148b = tgwVar;
                this.f52149c = z;
                this.f52150d = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f52148b = tgwVar;
                this.f52149c = z;
                this.f52150d = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
