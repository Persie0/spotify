package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hfr0 implements jfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f90796a;

    public hfr0(boolean z) {
        this.f90796a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfr0) && this.f90796a == ((hfr0) obj).f90796a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90796a);
    }
}
