package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i0r implements k0r {

    /* JADX INFO: renamed from: a */
    public final boolean f97296a;

    public i0r(boolean z) {
        this.f97296a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0r) && this.f97296a == ((i0r) obj).f97296a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97296a);
    }
}
