package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f244608a;

    public vtc0(boolean z) {
        this.f244608a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtc0) && this.f244608a == ((vtc0) obj).f244608a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244608a);
    }
}
