package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final boolean f162692a;

    public o821(boolean z) {
        this.f162692a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o821) && this.f162692a == ((o821) obj).f162692a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162692a);
    }
}
