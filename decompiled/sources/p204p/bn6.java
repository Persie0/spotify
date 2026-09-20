package p204p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class bn6 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28708a;

    /* JADX INFO: renamed from: b */
    public final Handler f28709b;

    public /* synthetic */ bn6(Handler handler, int i) {
        this.f28708a = i;
        this.f28709b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28708a) {
            case 0:
                this.f28709b.post(runnable);
                return;
            case 1:
                this.f28709b.post(runnable);
                return;
            case 2:
                runnable.getClass();
                Handler handler = this.f28709b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f28709b.post(runnable);
                return;
        }
    }

    public bn6(int i) {
        this.f28708a = i;
        switch (i) {
            case 1:
                this.f28709b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f28709b = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
