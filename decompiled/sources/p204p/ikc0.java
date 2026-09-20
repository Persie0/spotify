package p204p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ikc0 {
    /* JADX INFO: renamed from: a */
    public static final String m50929a(int i) {
        return m50933e(i);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m50930b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m50931c(int i) {
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "audio";
        }
        if (i == 3) {
            return "video";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m50932d(int i) {
        if (i == 1) {
            return "file";
        }
        if (i == 2) {
            return "application/x-mpegURL";
        }
        if (i == 3) {
            return "offline";
        }
        if (i == 4) {
            return "spotifyaudio";
        }
        if (i == 5) {
            return "spotifyadaptive";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m50933e(int i) {
        if (i == 1) {
            return "observation_end";
        }
        if (i == 2) {
            return "interval_end";
        }
        if (i == 3) {
            return "app_shutdown";
        }
        if (i == 4) {
            return "interval_segment_recovered";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m50934f(int i) {
        if (i == 1) {
            return "alphabetical";
        }
        if (i == 2) {
            return "recently_added_rank";
        }
        if (i == 3) {
            return "recently_played_rank";
        }
        if (i == 4) {
            return "recently_updated_rank";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static int m50935g(p68 p68Var, int i, int i2) {
        return (p68Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m50936h(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static ClassCastException m50937i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: j */
    public static String m50938j(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m50939k(String str, String str2, int i, String str3) {
        return str + i + str2 + str3;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m50940l(zt91 zt91Var, String str, zt91 zt91Var2) {
        ArrayList arrayList = new ArrayList();
        ofg1.m66846o(zt91Var, str);
        arrayList.add(zt91Var2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m50941m(MediaMetadataRetriever mediaMetadataRetriever) throws Exception {
        boolean zIsTerminated;
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
            return;
        }
        if (!(mediaMetadataRetriever instanceof ExecutorService)) {
            mediaMetadataRetriever.release();
            return;
        }
        ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
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

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m50942n(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m50943o(Stream stream) throws Exception {
        boolean zIsTerminated;
        if (stream instanceof AutoCloseable) {
            stream.close();
            return;
        }
        if (!(stream instanceof ExecutorService)) {
            if (stream instanceof TypedArray) {
                ((TypedArray) stream).recycle();
                return;
            } else if (stream instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) stream).release();
                return;
            } else {
                if (!(stream instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) stream).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) stream;
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

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m50944p(cbu0 cbu0Var) {
        if (cbu0Var != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m50945q(ebu0 ebu0Var) {
        if (ebu0Var != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m50946r(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ALL";
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m50947s(int i) {
        if (i == 1) {
            return "CIRCULAR";
        }
        if (i == 2) {
            return "ROUNDED_CORNER";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }
}
