package p204p;

import android.net.TrafficStats;
import java.util.concurrent.Executor;
import org.chromium.net.ThreadStatsUid;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ne60 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f152934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f152935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f152936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f152937d;

    public /* synthetic */ ne60(Executor executor, int i, boolean z, int i2) {
        this.f152934a = executor;
        this.f152935b = i;
        this.f152936c = z;
        this.f152937d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final int i = this.f152935b;
        final boolean z = this.f152936c;
        final int i2 = this.f152937d;
        this.f152934a.execute(new Runnable() { // from class: p.pe60
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(i);
                boolean z2 = z;
                if (z2) {
                    ThreadStatsUid.set(i2);
                }
                try {
                    runnable2.run();
                } finally {
                    if (z2) {
                        ThreadStatsUid.clear();
                    }
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            }
        });
    }
}
