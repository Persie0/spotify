package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hel implements jel {

    /* JADX INFO: renamed from: a */
    public final boolean f90452a;

    public hel(boolean z) {
        this.f90452a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hel) && this.f90452a == ((hel) obj).f90452a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90452a);
    }
}
