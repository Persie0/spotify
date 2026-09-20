package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vhe0 {

    /* JADX INFO: renamed from: a */
    public final String f241502a;

    /* JADX INFO: renamed from: b */
    public final voc1 f241503b;

    /* JADX INFO: renamed from: c */
    public final String f241504c;

    /* JADX INFO: renamed from: d */
    public final hz80 f241505d;

    /* JADX INFO: renamed from: e */
    public final agy f241506e;

    /* JADX INFO: renamed from: f */
    public final ump0 f241507f;

    public vhe0(String str, voc1 voc1Var, String str2, hz80 hz80Var, agy agyVar, ump0 ump0Var) {
        this.f241502a = str;
        this.f241503b = voc1Var;
        this.f241504c = str2;
        this.f241505d = hz80Var;
        this.f241506e = agyVar;
        this.f241507f = ump0Var;
        wj50.m88271j(voc1Var.f243453a, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhe0)) {
            return false;
        }
        vhe0 vhe0Var = (vhe0) obj;
        return wj50.m88271j(this.f241502a, vhe0Var.f241502a) && wj50.m88271j(this.f241503b, vhe0Var.f241503b) && wj50.m88271j(this.f241504c, vhe0Var.f241504c) && wj50.m88271j(this.f241505d, vhe0Var.f241505d) && wj50.m88271j(this.f241506e, vhe0Var.f241506e) && wj50.m88271j(this.f241507f, vhe0Var.f241507f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f241502a.hashCode() * 31, 31, this.f241503b.f243453a), 31, this.f241504c);
        hz80 hz80Var = this.f241505d;
        return this.f241507f.hashCode() + ((this.f241506e.hashCode() + ((iM77243b + (hz80Var == null ? 0 : hz80Var.hashCode())) * 31)) * 31);
    }
}
