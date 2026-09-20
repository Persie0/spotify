package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e5r0 {

    /* JADX INFO: renamed from: a */
    public final String f56456a;

    /* JADX INFO: renamed from: b */
    public final vwh0 f56457b;

    /* JADX INFO: renamed from: c */
    public final String f56458c;

    public e5r0(String str, vwh0 vwh0Var, String str2) {
        this.f56456a = str;
        this.f56457b = vwh0Var;
        this.f56458c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5r0)) {
            return false;
        }
        e5r0 e5r0Var = (e5r0) obj;
        return wj50.m88271j(this.f56456a, e5r0Var.f56456a) && wj50.m88271j(this.f56457b, e5r0Var.f56457b) && wj50.m88271j(this.f56458c, e5r0Var.f56458c);
    }

    public final int hashCode() {
        int iHashCode = this.f56456a.hashCode() * 31;
        vwh0 vwh0Var = this.f56457b;
        int iHashCode2 = (iHashCode + (vwh0Var == null ? 0 : vwh0Var.f245500a.hashCode())) * 31;
        String str = this.f56458c;
        return Boolean.hashCode(false) + s571.m77245d(mt60.m62800g(0, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 961, 31), 31, true);
    }
}
