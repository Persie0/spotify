package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class t33 extends w33 {

    /* JADX INFO: renamed from: a */
    public final boolean f216692a;

    public t33(boolean z) {
        this.f216692a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t33) && this.f216692a == ((t33) obj).f216692a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216692a);
    }
}
