package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class v5u {

    /* JADX INFO: renamed from: a */
    public final long f237647a;

    public v5u(long j) {
        this.f237647a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5u) && this.f237647a == ((v5u) obj).f237647a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f237647a);
    }
}
