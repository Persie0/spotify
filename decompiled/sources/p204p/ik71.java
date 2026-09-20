package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class ik71 {

    /* JADX INFO: renamed from: a */
    public final long f103051a;

    public ik71(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f103051a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m50925a() {
        return this.f103051a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik71)) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f103051a == ((ik71) obj).f103051a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f103051a) + (TimeUnit.MILLISECONDS.hashCode() * 31);
    }
}
