package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gsf0 {

    /* JADX INFO: renamed from: a */
    public final Float f83954a;

    /* JADX INFO: renamed from: b */
    public final String f83955b;

    /* JADX INFO: renamed from: c */
    public final fsf0 f83956c;

    /* JADX INFO: renamed from: d */
    public final String f83957d;

    /* JADX INFO: renamed from: e */
    public final cks f83958e;

    /* JADX INFO: renamed from: f */
    public final boolean f83959f;

    /* JADX INFO: renamed from: g */
    public final int f83960g;

    public gsf0(Float f, String str, fsf0 fsf0Var, String str2, cks cksVar, boolean z, int i) {
        this.f83954a = f;
        this.f83955b = str;
        this.f83956c = fsf0Var;
        this.f83957d = str2;
        this.f83958e = cksVar;
        this.f83959f = z;
        this.f83960g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsf0)) {
            return false;
        }
        gsf0 gsf0Var = (gsf0) obj;
        return wj50.m88271j(this.f83954a, gsf0Var.f83954a) && wj50.m88271j(this.f83955b, gsf0Var.f83955b) && wj50.m88271j(this.f83956c, gsf0Var.f83956c) && wj50.m88271j(this.f83957d, gsf0Var.f83957d) && wj50.m88271j(this.f83958e, gsf0Var.f83958e) && this.f83959f == gsf0Var.f83959f && this.f83960g == gsf0Var.f83960g;
    }

    public final int hashCode() {
        Float f = this.f83954a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.f83955b;
        int iHashCode2 = (this.f83956c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f83957d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        cks cksVar = this.f83958e;
        int iM77245d = s571.m77245d((iHashCode3 + (cksVar == null ? 0 : Long.hashCode(cksVar.f39083a))) * 31, 31, this.f83959f);
        int i = this.f83960g;
        return iM77245d + (i != 0 ? edb.m38547C(i) : 0);
    }
}
