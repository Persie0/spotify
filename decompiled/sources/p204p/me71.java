package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class me71 {

    /* JADX INFO: renamed from: a */
    public final long f142627a;

    public me71(long j) {
        this.f142627a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me71) && this.f142627a == ((me71) obj).f142627a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f142627a);
    }
}
