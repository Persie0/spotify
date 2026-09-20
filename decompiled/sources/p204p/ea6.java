package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ea6 implements v3u {

    /* JADX INFO: renamed from: a */
    public final long f57589a;

    public ea6(long j) {
        this.f57589a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea6) && g450.m43520b(this.f57589a, ((ea6) obj).f57589a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f57589a);
    }
}
