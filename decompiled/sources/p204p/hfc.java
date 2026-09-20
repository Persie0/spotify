package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hfc extends ifc {

    /* JADX INFO: renamed from: a */
    public final kmc f90673a;

    /* JADX INFO: renamed from: b */
    public final boolean f90674b;

    public hfc(kmc kmcVar, boolean z) {
        this.f90673a = kmcVar;
        this.f90674b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfc)) {
            return false;
        }
        hfc hfcVar = (hfc) obj;
        return this.f90673a == hfcVar.f90673a && this.f90674b == hfcVar.f90674b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90674b) + (this.f90673a.hashCode() * 31);
    }
}
