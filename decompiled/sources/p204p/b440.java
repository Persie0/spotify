package p204p;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class b440 extends m400 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f23218d = 1;

    /* JADX INFO: renamed from: e */
    public final Object f23219e;

    public b440(ua40 ua40Var) {
        super(ua40Var);
        this.f23219e = new AtomicBoolean(false);
    }

    @Override // p204p.m400, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.f23218d) {
            case 1:
                if (!((AtomicBoolean) this.f23219e).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public b440(ua40 ua40Var, c440 c440Var) {
        super(ua40Var);
        this.f23219e = new WeakReference(c440Var);
        m60747a(new a440(this, 0));
    }
}
