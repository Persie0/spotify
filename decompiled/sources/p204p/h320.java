package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h320 implements i320 {

    /* JADX INFO: renamed from: a */
    public final boolean f87117a;

    public h320(boolean z) {
        this.f87117a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h320) && this.f87117a == ((h320) obj).f87117a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87117a);
    }
}
