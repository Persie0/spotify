package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d3y {

    /* JADX INFO: renamed from: a */
    public final acs0 f45026a;

    /* JADX INFO: renamed from: b */
    public final ok11 f45027b;

    /* JADX INFO: renamed from: c */
    public final t8k f45028c;

    /* JADX INFO: renamed from: d */
    public final z4m f45029d;

    public d3y(acs0 acs0Var, ok11 ok11Var, t8k t8kVar, z4m z4mVar) {
        this.f45026a = acs0Var;
        this.f45027b = ok11Var;
        this.f45028c = t8kVar;
        this.f45029d = z4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3y)) {
            return false;
        }
        d3y d3yVar = (d3y) obj;
        return wj50.m88271j(this.f45026a, d3yVar.f45026a) && wj50.m88271j(this.f45027b, d3yVar.f45027b) && wj50.m88271j(this.f45028c, d3yVar.f45028c) && wj50.m88271j(this.f45029d, d3yVar.f45029d);
    }

    public final int hashCode() {
        int iHashCode = this.f45026a.hashCode() * 31;
        ok11 ok11Var = this.f45027b;
        int iHashCode2 = (iHashCode + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        t8k t8kVar = this.f45028c;
        int iHashCode3 = (iHashCode2 + (t8kVar == null ? 0 : t8kVar.hashCode())) * 31;
        z4m z4mVar = this.f45029d;
        return iHashCode3 + (z4mVar != null ? z4mVar.hashCode() : 0);
    }
}
