package p204p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class sf4 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208458a;

    /* JADX INFO: renamed from: b */
    public final Handler f208459b;

    public sf4() {
        this.f208458a = 0;
        this.f208459b = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f208458a) {
            case 0:
                this.f208459b.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f208459b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public sf4(Handler handler) {
        this.f208458a = 1;
        this.f208459b = handler;
    }
}
