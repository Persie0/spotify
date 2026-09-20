package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o7q0 implements u7q0 {

    /* JADX INFO: renamed from: a */
    public final boolean f162599a;

    public o7q0(boolean z) {
        this.f162599a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7q0) && this.f162599a == ((o7q0) obj).f162599a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162599a);
    }
}
