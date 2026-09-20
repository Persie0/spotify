package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes10.dex */
public final class exz0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final Context f63874a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f63875b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f63876c;

    /* JADX INFO: renamed from: d */
    public final e74 f63877d;

    /* JADX INFO: renamed from: e */
    public final x4b f63878e;

    public exz0(Context context, Scheduler scheduler, Scheduler scheduler2, e74 e74Var, x4b x4bVar) {
        this.f63874a = context;
        this.f63875b = scheduler;
        this.f63876c = scheduler2;
        this.f63877d = e74Var;
        this.f63878e = x4bVar;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new utu0(this));
    }
}
