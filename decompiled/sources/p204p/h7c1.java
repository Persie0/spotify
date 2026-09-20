package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h7c1 {

    /* JADX INFO: renamed from: a */
    public final boolean f88406a;

    public h7c1(boolean z) {
        this.f88406a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7c1) && this.f88406a == ((h7c1) obj).f88406a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88406a);
    }
}
