package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hfe0 extends f2h1 {

    /* JADX INFO: renamed from: b */
    public final boolean f90722b;

    public hfe0(boolean z) {
        this.f90722b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfe0) && this.f90722b == ((hfe0) obj).f90722b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90722b);
    }
}
