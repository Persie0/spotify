package p204p;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class dab0 extends FutureTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47013a = 0;

    /* JADX INFO: renamed from: b */
    public Object f47014b;

    public /* synthetic */ dab0(Callable callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f47013a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((eab0) this.f47014b).m38283d((cab0) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((eab0) this.f47014b).m38283d(new cab0(e));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.f47014b = null;
                }
            default:
                en6 en6Var = (en6) this.f47014b;
                AtomicBoolean atomicBoolean = en6Var.f61080e;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    en6Var.m39472b(obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    en6Var.m39472b(null);
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dab0(en6 en6Var, ic9 ic9Var) {
        super(ic9Var);
        this.f47014b = en6Var;
    }
}
