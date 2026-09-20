package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ig61 {

    /* JADX INFO: renamed from: a */
    public final long f101902a;

    public ig61(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f101902a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig61) || this.f101902a != ((ig61) obj).f101902a) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.MILLISECONDS.hashCode() + (Long.hashCode(this.f101902a) * 31);
    }
}
