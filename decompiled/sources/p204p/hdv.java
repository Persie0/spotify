package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hdv {

    /* JADX INFO: renamed from: a */
    public final String f90231a;

    /* JADX INFO: renamed from: b */
    public final gdv f90232b;

    /* JADX INFO: renamed from: c */
    public final kmv f90233c;

    /* JADX INFO: renamed from: d */
    public final boolean f90234d;

    public hdv(String str, gdv gdvVar, kmv kmvVar, boolean z) {
        this.f90231a = str;
        this.f90232b = gdvVar;
        this.f90233c = kmvVar;
        this.f90234d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdv)) {
            return false;
        }
        hdv hdvVar = (hdv) obj;
        return wj50.m88271j(this.f90231a, hdvVar.f90231a) && wj50.m88271j(this.f90232b, hdvVar.f90232b) && wj50.m88271j(this.f90233c, hdvVar.f90233c) && this.f90234d == hdvVar.f90234d;
    }

    public final int hashCode() {
        String str = this.f90231a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        gdv gdvVar = this.f90232b;
        int iHashCode2 = (iHashCode + (gdvVar == null ? 0 : gdvVar.hashCode())) * 31;
        kmv kmvVar = this.f90233c;
        return Boolean.hashCode(this.f90234d) + ((iHashCode2 + (kmvVar != null ? kmvVar.hashCode() : 0)) * 31);
    }
}
