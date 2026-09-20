package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes7.dex */
public final class hc9 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vc9 f89722a;

    public hc9(vc9 vc9Var) {
        this.f89722a = vc9Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        vc9 vc9Var = this.f89722a;
        Disposable disposable = vc9Var.f240088m;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = vc9Var.f240087l;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }
}
