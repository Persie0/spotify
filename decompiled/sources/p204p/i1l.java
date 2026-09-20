package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f97543a;

    public i1l(boolean z) {
        this.f97543a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1l) && this.f97543a == ((i1l) obj).f97543a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97543a);
    }
}
