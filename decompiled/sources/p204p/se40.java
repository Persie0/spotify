package p204p;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class se40 implements u790 {

    /* JADX INFO: renamed from: c */
    public static final se40 f208191c = new se40(null, 0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208192a;

    /* JADX INFO: renamed from: b */
    public final Object f208193b;

    public /* synthetic */ se40(Object obj, int i) {
        this.f208192a = i;
        this.f208193b = obj;
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            vie1.m85627i("ImmediateFuture");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f208192a) {
            case 0:
                return this.f208193b;
            default:
                throw new ExecutionException((Throwable) this.f208193b);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f208192a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("[status=SUCCESS, result=[");
                return edb.m38568q(sb, this.f208193b, "]]");
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f208193b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
