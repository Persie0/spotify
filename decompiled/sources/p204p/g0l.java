package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f75389a;

    public g0l(boolean z) {
        this.f75389a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0l) && this.f75389a == ((g0l) obj).f75389a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75389a);
    }
}
