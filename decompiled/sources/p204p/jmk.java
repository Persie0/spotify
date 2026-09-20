package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jmk implements mmk {

    /* JADX INFO: renamed from: a */
    public final boolean f113901a;

    public jmk(boolean z) {
        this.f113901a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmk) && this.f113901a == ((jmk) obj).f113901a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113901a);
    }
}
