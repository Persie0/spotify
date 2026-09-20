package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class m590 implements o590 {

    /* JADX INFO: renamed from: a */
    public final long f140168a;

    public m590(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f140168a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m590) || this.f140168a != ((m590) obj).f140168a) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.MILLISECONDS.hashCode() + (Long.hashCode(this.f140168a) * 31);
    }
}
