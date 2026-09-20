package p204p;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class vgx implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241333a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f241334b;

    public vgx(Runnable runnable) {
        this.f241334b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.f241333a) {
            case 0:
                ((Runnable) this.f241334b).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.f241334b;
                try {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public vgx(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f241334b = executorService;
    }
}
