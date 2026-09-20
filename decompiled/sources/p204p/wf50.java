package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class wf50 {

    /* JADX INFO: renamed from: a */
    public final v9x0 f250743a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f250744b;

    public wf50(v9x0 v9x0Var, Flowable flowable) {
        this.f250743a = v9x0Var;
        AtomicReference atomicReference = new AtomicReference();
        this.f250744b = atomicReference;
        flowable.subscribe(new xg7(atomicReference, 2), frz.f72688P0);
    }
}
