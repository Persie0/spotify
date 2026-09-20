package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ued {

    /* JADX INFO: renamed from: a */
    public final String f229486a;

    /* JADX INFO: renamed from: b */
    public final sed f229487b;

    /* JADX INFO: renamed from: c */
    public final red f229488c;

    public ued(String str, sed sedVar, red redVar) {
        this.f229486a = str;
        this.f229487b = sedVar;
        this.f229488c = redVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ued)) {
            return false;
        }
        ued uedVar = (ued) obj;
        return wj50.m88271j(this.f229486a, uedVar.f229486a) && wj50.m88271j(this.f229487b, uedVar.f229487b) && wj50.m88271j(this.f229488c, uedVar.f229488c);
    }

    public final int hashCode() {
        int iHashCode = this.f229486a.hashCode() * 31;
        sed sedVar = this.f229487b;
        return this.f229488c.hashCode() + ((iHashCode + (sedVar == null ? 0 : sedVar.hashCode())) * 31);
    }
}
