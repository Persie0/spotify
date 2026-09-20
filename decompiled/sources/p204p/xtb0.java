package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes8.dex */
public final class xtb0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f265820a;

    /* JADX INFO: renamed from: b */
    public final RetrofitMaker f265821b;

    /* JADX INFO: renamed from: c */
    public final nub0 f265822c;

    /* JADX INFO: renamed from: d */
    public final fke f265823d;

    /* JADX INFO: renamed from: e */
    public final CompositeDisposable f265824e = new CompositeDisposable();

    public xtb0(Scheduler scheduler, RetrofitMaker retrofitMaker, nub0 nub0Var, fke fkeVar) {
        this.f265820a = scheduler;
        this.f265821b = retrofitMaker;
        this.f265822c = nub0Var;
        this.f265823d = fkeVar;
    }
}
