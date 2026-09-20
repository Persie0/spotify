package p204p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class hsc1 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eu6 f94671b;

    public /* synthetic */ hsc1(eu6 eu6Var, int i) {
        this.f94670a = i;
        this.f94671b = eu6Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f94670a) {
            case 0:
                ((AtomicBoolean) this.f94671b.f62885j).set(false);
                break;
            default:
                ((AtomicBoolean) this.f94671b.f62885j).set(true);
                break;
        }
    }
}
