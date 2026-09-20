package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k4j0 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f119237a;

    /* JADX INFO: renamed from: b */
    public final String f119238b;

    /* JADX INFO: renamed from: c */
    public final String f119239c;

    /* JADX INFO: renamed from: d */
    public final vta f119240d;

    /* JADX INFO: renamed from: e */
    public final wwu f119241e;

    /* JADX INFO: renamed from: f */
    public final vsa f119242f;

    public k4j0(String str, String str2, String str3, vta vtaVar, wwu wwuVar, vsa vsaVar) {
        this.f119237a = str;
        this.f119238b = str2;
        this.f119239c = str3;
        this.f119240d = vtaVar;
        this.f119241e = wwuVar;
        this.f119242f = vsaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4j0)) {
            return false;
        }
        k4j0 k4j0Var = (k4j0) obj;
        return wj50.m88271j(this.f119237a, k4j0Var.f119237a) && wj50.m88271j(this.f119238b, k4j0Var.f119238b) && wj50.m88271j(this.f119239c, k4j0Var.f119239c) && this.f119240d == k4j0Var.f119240d && wj50.m88271j(this.f119241e, k4j0Var.f119241e) && this.f119242f == k4j0Var.f119242f;
    }

    public final int hashCode() {
        int iHashCode = (this.f119240d.hashCode() + s571.m77243b(s571.m77243b(this.f119237a.hashCode() * 31, 31, this.f119238b), 31, this.f119239c)) * 31;
        wwu wwuVar = this.f119241e;
        return this.f119242f.hashCode() + ((iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31);
    }
}
