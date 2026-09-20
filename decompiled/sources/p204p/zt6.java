package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zt6 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ twz0 f286075b;

    public /* synthetic */ zt6(twz0 twz0Var, int i) {
        this.f286074a = i;
        this.f286075b = twz0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) throws InterruptedException {
        switch (this.f286074a) {
            case 0:
                ((LinkedBlockingDeque) this.f286075b.f224525b).putLast((ByteBuffer) obj);
                break;
            default:
                ((AtomicBoolean) this.f286075b.f224526c).set(false);
                break;
        }
    }
}
