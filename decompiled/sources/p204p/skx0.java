package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class skx0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f210217a;

    public skx0(boolean z) {
        this.f210217a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skx0) && this.f210217a == ((skx0) obj).f210217a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210217a);
    }
}
