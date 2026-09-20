package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ag90 {

    /* JADX INFO: renamed from: a */
    public final boolean f15317a;

    public ag90(boolean z) {
        this.f15317a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag90) && this.f15317a == ((ag90) obj).f15317a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15317a);
    }
}
