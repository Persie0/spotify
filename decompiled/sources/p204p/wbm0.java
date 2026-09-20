package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wbm0 extends ehg1 {

    /* JADX INFO: renamed from: e */
    public final boolean f249787e;

    public wbm0(boolean z) {
        this.f249787e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbm0) && this.f249787e == ((wbm0) obj).f249787e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249787e);
    }
}
