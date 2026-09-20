package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s730 {

    /* JADX INFO: renamed from: a */
    public final u730 f206266a;

    /* JADX INFO: renamed from: b */
    public final u730 f206267b;

    /* JADX INFO: renamed from: c */
    public final xx50 f206268c;

    /* JADX INFO: renamed from: d */
    public final String f206269d;

    public s730(u730 u730Var, u730 u730Var2, xx50 xx50Var, String str) {
        this.f206266a = u730Var;
        this.f206267b = u730Var2;
        this.f206268c = xx50Var;
        this.f206269d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s730)) {
            return false;
        }
        s730 s730Var = (s730) obj;
        return wj50.m88271j(this.f206266a, s730Var.f206266a) && wj50.m88271j(this.f206267b, s730Var.f206267b) && this.f206268c.equals(s730Var.f206268c) && this.f206269d.equals(s730Var.f206269d);
    }

    public final int hashCode() {
        return edb.m38547C(1) + s571.m77243b((this.f206268c.hashCode() + ((this.f206267b.hashCode() + (this.f206266a.hashCode() * 31)) * 31)) * 31, 31, this.f206269d);
    }
}
