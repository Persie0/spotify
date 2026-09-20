package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fgf0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f69314a;

    public fgf0(boolean z) {
        this.f69314a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgf0) && this.f69314a == ((fgf0) obj).f69314a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69314a);
    }
}
