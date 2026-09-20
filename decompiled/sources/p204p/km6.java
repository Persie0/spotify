package p204p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class km6 implements AutoCloseable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f124056c = 0;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f124057d = 0;

    /* JADX INFO: renamed from: a */
    public final dte f124058a;

    /* JADX INFO: renamed from: b */
    public final yg30 f124059b;

    public km6(yg30 yg30Var, dte dteVar) {
        this.f124059b = yg30Var;
        this.f124058a = dteVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = this.f124058a;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
