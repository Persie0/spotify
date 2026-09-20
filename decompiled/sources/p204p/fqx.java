package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fqx {

    /* JADX INFO: renamed from: a */
    public final String f72300a;

    /* JADX INFO: renamed from: b */
    public final ktx f72301b;

    /* JADX INFO: renamed from: c */
    public final eqx f72302c;

    public fqx(String str, ktx ktxVar, eqx eqxVar) {
        this.f72300a = str;
        this.f72301b = ktxVar;
        this.f72302c = eqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqx)) {
            return false;
        }
        fqx fqxVar = (fqx) obj;
        return wj50.m88271j(this.f72300a, fqxVar.f72300a) && wj50.m88271j(this.f72301b, fqxVar.f72301b) && wj50.m88271j(this.f72302c, fqxVar.f72302c);
    }

    public final int hashCode() {
        int iHashCode = this.f72300a.hashCode() * 31;
        ktx ktxVar = this.f72301b;
        return this.f72302c.hashCode() + ((iHashCode + (ktxVar == null ? 0 : ktxVar.hashCode())) * 31);
    }
}
