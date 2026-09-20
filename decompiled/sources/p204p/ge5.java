package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ge5 {

    /* JADX INFO: renamed from: a */
    public final double f79017a;

    /* JADX INFO: renamed from: b */
    public final boolean f79018b;

    /* JADX INFO: renamed from: c */
    public final api f79019c;

    /* JADX INFO: renamed from: d */
    public final y5p f79020d;

    /* JADX INFO: renamed from: e */
    public final String f79021e;

    /* JADX INFO: renamed from: f */
    public final boolean f79022f;

    public ge5(double d, boolean z, api apiVar, y5p y5pVar, String str, boolean z2) {
        this.f79017a = d;
        this.f79018b = z;
        this.f79019c = apiVar;
        this.f79020d = y5pVar;
        this.f79021e = str;
        this.f79022f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge5)) {
            return false;
        }
        ge5 ge5Var = (ge5) obj;
        return Double.compare(this.f79017a, ge5Var.f79017a) == 0 && this.f79018b == ge5Var.f79018b && wj50.m88271j(this.f79019c, ge5Var.f79019c) && wj50.m88271j(this.f79020d, ge5Var.f79020d) && wj50.m88271j(this.f79021e, ge5Var.f79021e) && this.f79022f == ge5Var.f79022f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Double.hashCode(this.f79017a) * 31, 31, this.f79018b);
        api apiVar = this.f79019c;
        int iHashCode = (iM77245d + (apiVar == null ? 0 : apiVar.hashCode())) * 31;
        y5p y5pVar = this.f79020d;
        return Boolean.hashCode(this.f79022f) + s571.m77243b((iHashCode + (y5pVar != null ? y5pVar.hashCode() : 0)) * 31, 31, this.f79021e);
    }
}
