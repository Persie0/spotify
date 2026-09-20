package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes5.dex */
public final class gj51 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f80375b;

    public /* synthetic */ gj51(rlv0 rlv0Var, int i) {
        this.f80374a = i;
        this.f80375b = rlv0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f80374a) {
            case 0:
                Disposable disposable = (Disposable) this.f80375b.f200373a;
                if (disposable != null) {
                    disposable.dispose();
                }
                break;
            case 1:
                Disposable disposable2 = (Disposable) this.f80375b.f200373a;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                break;
            default:
                Disposable disposable3 = (Disposable) this.f80375b.f200373a;
                if (disposable3 != null) {
                    disposable3.dispose();
                }
                break;
        }
    }
}
