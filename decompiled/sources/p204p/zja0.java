package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zja0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283406a;

    public zja0(boolean z) {
        this.f283406a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zja0) && this.f283406a == ((zja0) obj).f283406a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283406a);
    }
}
