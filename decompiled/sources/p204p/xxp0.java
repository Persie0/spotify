package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class xxp0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f267048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ayp0 f267049c;

    public /* synthetic */ xxp0(AtomicReference atomicReference, ayp0 ayp0Var, int i) {
        this.f267047a = i;
        this.f267048b = atomicReference;
        this.f267049c = ayp0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f267047a) {
            case 0:
                Disposable disposable = (Disposable) obj;
                this.f267048b.set(disposable);
                this.f267049c.f21342g.mo23393b(disposable);
                break;
            default:
                Disposable disposable2 = (Disposable) obj;
                this.f267048b.set(disposable2);
                this.f267049c.f21342g.mo23393b(disposable2);
                break;
        }
    }
}
