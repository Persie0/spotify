package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qla1 {

    /* JADX INFO: renamed from: a */
    public final String f189802a;

    /* JADX INFO: renamed from: b */
    public final String f189803b;

    /* JADX INFO: renamed from: c */
    public final String f189804c;

    /* JADX INFO: renamed from: d */
    public final boolean f189805d;

    /* JADX INFO: renamed from: e */
    public final String f189806e;

    /* JADX INFO: renamed from: f */
    public final String f189807f;

    /* JADX INFO: renamed from: g */
    public final Integer f189808g;

    /* JADX INFO: renamed from: h */
    public final String f189809h;

    public qla1(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f189802a = str;
        this.f189803b = str2;
        this.f189804c = str3;
        this.f189805d = z;
        this.f189806e = str4;
        this.f189807f = str5;
        this.f189808g = num;
        if (z && str3 != null && str3.length() != 0) {
            str2 = str3;
        }
        this.f189809h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qla1)) {
            return false;
        }
        qla1 qla1Var = (qla1) obj;
        return wj50.m88271j(this.f189802a, qla1Var.f189802a) && wj50.m88271j(this.f189803b, qla1Var.f189803b) && wj50.m88271j(this.f189804c, qla1Var.f189804c) && this.f189805d == qla1Var.f189805d && wj50.m88271j(this.f189806e, qla1Var.f189806e) && wj50.m88271j(this.f189807f, qla1Var.f189807f) && wj50.m88271j(this.f189808g, qla1Var.f189808g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f189802a.hashCode() * 31, 31, this.f189803b);
        String str = this.f189804c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f189805d);
        String str2 = this.f189806e;
        int iHashCode = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f189807f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f189808g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ qla1(int i, Integer num, String str, String str2, String str3, String str4) {
        this((i & 64) != 0 ? null : num, (i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 16) != 0 ? null : str4, null, false);
    }
}
