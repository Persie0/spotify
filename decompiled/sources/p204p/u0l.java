package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final long f225526a;

    public u0l(long j) {
        this.f225526a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0l) && this.f225526a == ((u0l) obj).f225526a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f225526a);
    }
}
