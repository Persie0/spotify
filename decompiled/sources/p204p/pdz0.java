package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pdz0 implements qdz0 {

    /* JADX INFO: renamed from: a */
    public final long f176577a;

    public pdz0(long j) {
        this.f176577a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdz0) && this.f176577a == ((pdz0) obj).f176577a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f176577a);
    }
}
