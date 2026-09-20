package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zg50 {

    /* JADX INFO: renamed from: a */
    public final ulv f282494a;

    /* JADX INFO: renamed from: b */
    public final nfu f282495b;

    /* JADX INFO: renamed from: c */
    public final anv f282496c;

    /* JADX INFO: renamed from: d */
    public final twv f282497d;

    /* JADX INFO: renamed from: e */
    public final ug50 f282498e;

    /* JADX INFO: renamed from: f */
    public final yg50 f282499f;

    /* JADX INFO: renamed from: g */
    public final hdv f282500g;

    /* JADX INFO: renamed from: h */
    public final pcv f282501h;

    /* JADX INFO: renamed from: i */
    public final iyu f282502i;

    /* JADX INFO: renamed from: j */
    public final bjv f282503j;

    /* JADX INFO: renamed from: k */
    public final nhv f282504k;

    public zg50(ulv ulvVar, nfu nfuVar, anv anvVar, twv twvVar, ug50 ug50Var, yg50 yg50Var, hdv hdvVar, pcv pcvVar, iyu iyuVar, bjv bjvVar, nhv nhvVar) {
        this.f282494a = ulvVar;
        this.f282495b = nfuVar;
        this.f282496c = anvVar;
        this.f282497d = twvVar;
        this.f282498e = ug50Var;
        this.f282499f = yg50Var;
        this.f282500g = hdvVar;
        this.f282501h = pcvVar;
        this.f282502i = iyuVar;
        this.f282503j = bjvVar;
        this.f282504k = nhvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg50)) {
            return false;
        }
        zg50 zg50Var = (zg50) obj;
        return wj50.m88271j(this.f282494a, zg50Var.f282494a) && wj50.m88271j(this.f282495b, zg50Var.f282495b) && wj50.m88271j(this.f282496c, zg50Var.f282496c) && wj50.m88271j(this.f282497d, zg50Var.f282497d) && wj50.m88271j(this.f282498e, zg50Var.f282498e) && wj50.m88271j(this.f282499f, zg50Var.f282499f) && wj50.m88271j(this.f282500g, zg50Var.f282500g) && wj50.m88271j(this.f282501h, zg50Var.f282501h) && this.f282502i == zg50Var.f282502i && wj50.m88271j(this.f282503j, zg50Var.f282503j) && wj50.m88271j(this.f282504k, zg50Var.f282504k);
    }

    public final int hashCode() {
        ulv ulvVar = this.f282494a;
        int iHashCode = (this.f282495b.hashCode() + ((ulvVar == null ? 0 : ulvVar.hashCode()) * 31)) * 31;
        anv anvVar = this.f282496c;
        int iHashCode2 = (this.f282497d.hashCode() + ((iHashCode + (anvVar == null ? 0 : anvVar.hashCode())) * 31)) * 31;
        ug50 ug50Var = this.f282498e;
        int iHashCode3 = (iHashCode2 + (ug50Var == null ? 0 : ug50Var.hashCode())) * 31;
        yg50 yg50Var = this.f282499f;
        int iHashCode4 = (iHashCode3 + (yg50Var == null ? 0 : yg50Var.hashCode())) * 31;
        hdv hdvVar = this.f282500g;
        int iHashCode5 = (iHashCode4 + (hdvVar == null ? 0 : hdvVar.hashCode())) * 31;
        pcv pcvVar = this.f282501h;
        int iHashCode6 = (this.f282503j.hashCode() + ((this.f282502i.hashCode() + ((iHashCode5 + (pcvVar == null ? 0 : pcvVar.hashCode())) * 31)) * 31)) * 31;
        nhv nhvVar = this.f282504k;
        return iHashCode6 + (nhvVar != null ? nhvVar.hashCode() : 0);
    }
}
