package p204p;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ayh0 {

    /* JADX INFO: renamed from: a */
    public final xre f21245a;

    public ayh0(xre xreVar) {
        this.f21245a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m27521a() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        ((wy3) this.f21245a).getClass();
        return timeUnit.toMicros(SystemClock.elapsedRealtimeNanos());
    }
}
