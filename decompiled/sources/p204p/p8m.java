package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p8m {

    /* JADX INFO: renamed from: a */
    public final boolean f175002a;

    public p8m(boolean z) {
        this.f175002a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8m) && this.f175002a == ((p8m) obj).f175002a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175002a);
    }
}
