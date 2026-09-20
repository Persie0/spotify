package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t570 {

    /* JADX INFO: renamed from: a */
    public final String f217227a;

    /* JADX INFO: renamed from: b */
    public final String f217228b;

    /* JADX INFO: renamed from: c */
    public final String f217229c;

    /* JADX INFO: renamed from: d */
    public final boolean f217230d;

    /* JADX INFO: renamed from: e */
    public final Long f217231e;

    public t570(String str, String str2, String str3, boolean z, Long l) {
        this.f217227a = str;
        this.f217228b = str2;
        this.f217229c = str3;
        this.f217230d = z;
        this.f217231e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t570)) {
            return false;
        }
        t570 t570Var = (t570) obj;
        return wj50.m88271j(this.f217227a, t570Var.f217227a) && wj50.m88271j(this.f217228b, t570Var.f217228b) && wj50.m88271j(this.f217229c, t570Var.f217229c) && this.f217230d == t570Var.f217230d && wj50.m88271j(this.f217231e, t570Var.f217231e);
    }

    public final int hashCode() {
        int iHashCode = this.f217227a.hashCode() * 31;
        String str = this.f217228b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f217229c;
        int iM77245d = s571.m77245d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f217230d);
        Long l = this.f217231e;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
