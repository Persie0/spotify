package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f118377a;

    public k1l(boolean z) {
        this.f118377a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1l) && this.f118377a == ((k1l) obj).f118377a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118377a);
    }
}
