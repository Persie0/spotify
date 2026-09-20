package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cgk {

    /* JADX INFO: renamed from: a */
    public final boolean f37703a;

    public cgk(boolean z) {
        this.f37703a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgk) && this.f37703a == ((cgk) obj).f37703a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37703a);
    }
}
