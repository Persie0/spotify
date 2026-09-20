package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;

/* JADX INFO: loaded from: classes10.dex */
public final class pvo0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final gu61 f181804a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f181805b;

    /* JADX INFO: renamed from: c */
    public final dii0 f181806c;

    /* JADX INFO: renamed from: d */
    public final u4l0 f181807d;

    /* JADX INFO: renamed from: e */
    public final mqr f181808e;

    public pvo0(gu61 gu61Var, Scheduler scheduler, dii0 dii0Var, u4l0 u4l0Var, szd1 szd1Var, mqr mqrVar) {
        this.f181804a = gu61Var;
        this.f181805b = scheduler;
        this.f181806c = dii0Var;
        this.f181807d = u4l0Var;
        this.f181808e = mqrVar;
    }

    /* JADX INFO: renamed from: d */
    public static final CompletableOnErrorComplete m71197d(pvo0 pvo0Var, qko0 qko0Var) {
        qko0Var.getClass();
        Logger.m3969e("Go: Received playback command: %s", 1);
        gu61 gu61Var = pvo0Var.f181804a;
        Boolean bool = null;
        qko0 qko0Var2 = qko0Var instanceof qko0 ? qko0Var : null;
        if (qko0Var2 != null && bm51.m29797h0(qko0Var2.f189628c, "Ray-Ban", true) && bm51.m29797h0(qko0Var2.f189627b, "Ray-Ban Stories 2 Voice", true)) {
            bool = Boolean.FALSE;
        }
        Completable completableIgnoreElement = gu61Var.m45729b(bool).observeOn(pvo0Var.f181805b).doOnSuccess(new ch8(6, pvo0Var, qko0Var)).doOnError(new ao90(22, qko0Var, pvo0Var)).ignoreElement();
        dii0 dii0Var = pvo0Var.f181806c;
        completableIgnoreElement.getClass();
        return Completable.m23284A(completableIgnoreElement.m23300q(new l3d0(dii0Var, 17))).m23299p(jey.f111734Z0);
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new mab0(this, 18)).doFinally(new p12(this, 5));
    }
}
