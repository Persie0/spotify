package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final boolean f148170a;

    public mxs(boolean z) {
        this.f148170a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxs) && this.f148170a == ((mxs) obj).f148170a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148170a);
    }
}
