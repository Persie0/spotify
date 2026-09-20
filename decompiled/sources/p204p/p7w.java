package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p7w implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f174775a;

    public p7w(boolean z, int i) {
        this.f174775a = (i & 2) != 0 ? true : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7w) && this.f174775a == ((p7w) obj).f174775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174775a) + (Boolean.hashCode(true) * 31);
    }
}
