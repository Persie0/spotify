package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n9c1 implements o9c1 {

    /* JADX INFO: renamed from: a */
    public final long f151770a;

    public n9c1(long j) {
        this.f151770a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9c1) && this.f151770a == ((n9c1) obj).f151770a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f151770a);
    }
}
