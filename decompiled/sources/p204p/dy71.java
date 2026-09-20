package p204p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class dy71 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qr60[] f54227d = {new spi0(dy71.class, "impressionLogger", "getImpressionLogger()Lkotlin/jvm/functions/Function0;", 0), new spi0(dy71.class, x09.f256832d, "getEnabled()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final cy71 f54228a = new cy71(this, 0);

    /* JADX INFO: renamed from: b */
    public final cy71 f54229b = new cy71(this, 1);

    /* JADX INFO: renamed from: c */
    public AutoCloseable f54230c;

    /* JADX INFO: renamed from: a */
    public static final void m37324a(dy71 dy71Var) {
        boolean zIsTerminated;
        cy71 cy71Var = dy71Var.f54228a;
        qr60[] qr60VarArr = f54227d;
        boolean z = false;
        qr60 qr60Var = qr60VarArr[0];
        eh00 eh00Var = (eh00) cy71Var.f61172a;
        if (eh00Var != null) {
            cy71 cy71Var2 = dy71Var.f54229b;
            qr60 qr60Var2 = qr60VarArr[1];
            if (((Boolean) cy71Var2.f61172a).booleanValue()) {
                if (dy71Var.f54230c != null) {
                    return;
                }
                dy71Var.f54230c = (AutoCloseable) eh00Var.invoke();
                return;
            }
        }
        AutoCloseable autoCloseable = dy71Var.f54230c;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        dy71Var.f54230c = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m37325b(boolean z) {
        this.f54229b.m39516c(f54227d[1], this, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public final void m37326c(eh00 eh00Var) {
        this.f54228a.m39516c(f54227d[0], this, eh00Var);
    }
}
