package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class yxp0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f277300b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ayp0 f277301c;

    public /* synthetic */ yxp0(AtomicReference atomicReference, ayp0 ayp0Var, int i) {
        this.f277299a = i;
        this.f277300b = atomicReference;
        this.f277301c = ayp0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f277299a) {
            case 0:
                Disposable disposable = (Disposable) this.f277300b.get();
                if (disposable != null) {
                    this.f277301c.f21342g.mo23392a(disposable);
                }
                break;
            default:
                Disposable disposable2 = (Disposable) this.f277300b.get();
                if (disposable2 != null) {
                    this.f277301c.f21342g.mo23392a(disposable2);
                }
                break;
        }
    }
}
