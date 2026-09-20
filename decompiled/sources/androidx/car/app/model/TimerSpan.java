package androidx.car.app.model;

import java.util.concurrent.TimeUnit;
import p204p.ikc0;
import p204p.rzb;
import p204p.s571;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class TimerSpan extends CarSpan {
    private static final long TWENTY_YEARS_IN_MS = TimeUnit.DAYS.toMillis(7300);
    private final long mElapsedRealtimeMillis;

    private TimerSpan(long j) {
        this.mElapsedRealtimeMillis = j;
    }

    public static TimerSpan create(long j) {
        long j2 = TWENTY_YEARS_IN_MS;
        if (j <= j2) {
            return new TimerSpan(j);
        }
        StringBuilder sbM77254m = s571.m77254m(j, "The given start time [", "] cannot be larger than ");
        sbM77254m.append(j2);
        throw new IllegalArgumentException(sbM77254m.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimerSpan) && this.mElapsedRealtimeMillis == ((TimerSpan) obj).mElapsedRealtimeMillis;
    }

    public long getElapsedRealtimeMillis() {
        return this.mElapsedRealtimeMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.mElapsedRealtimeMillis);
    }

    public String toString() {
        return ikc0.m50938j(this.mElapsedRealtimeMillis, "]", new StringBuilder("[start: "));
    }

    private TimerSpan() {
        this.mElapsedRealtimeMillis = 0L;
    }
}
