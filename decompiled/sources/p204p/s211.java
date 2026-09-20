package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s211 extends w211 {

    /* JADX INFO: renamed from: a */
    public final boolean f204875a;

    public s211(boolean z) {
        this.f204875a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s211) && this.f204875a == ((s211) obj).f204875a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204875a);
    }
}
