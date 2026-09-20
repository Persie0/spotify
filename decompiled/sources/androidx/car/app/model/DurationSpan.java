package androidx.car.app.model;

import android.annotation.SuppressLint;
import java.util.Objects;
import p196j$.time.Duration;
import p204p.ikc0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    @SuppressLint({"MethodNameUnits"})
    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return ikc0.m50938j(this.mDurationSeconds, "]", new StringBuilder("[seconds: "));
    }

    public static DurationSpan create(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }
}
