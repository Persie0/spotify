package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ss60 implements ts60 {

    /* JADX INFO: renamed from: a */
    public final long f213500a;

    public ss60(long j) {
        this.f213500a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss60) && this.f213500a == ((ss60) obj).f213500a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f213500a);
    }
}
