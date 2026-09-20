package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f86310a;

    public h0l(boolean z) {
        this.f86310a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0l) && this.f86310a == ((h0l) obj).f86310a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86310a);
    }
}
