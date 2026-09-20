package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class kc9 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vc9 f121411b;

    public /* synthetic */ kc9(vc9 vc9Var, int i) {
        this.f121410a = i;
        this.f121411b = vc9Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f121410a) {
            case 0:
                this.f121411b.f240087l = (Disposable) obj;
                break;
            default:
                this.f121411b.f240088m = (Disposable) obj;
                break;
        }
    }
}
