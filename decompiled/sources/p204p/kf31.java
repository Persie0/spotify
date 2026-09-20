package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kf31 extends ag31 {

    /* JADX INFO: renamed from: a */
    public final boolean f122049a;

    public kf31(boolean z) {
        this.f122049a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf31) && this.f122049a == ((kf31) obj).f122049a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122049a);
    }
}
