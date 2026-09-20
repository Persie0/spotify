package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fk11 extends azg1 {

    /* JADX INFO: renamed from: b */
    public final String f70446b;

    /* JADX INFO: renamed from: c */
    public final String f70447c;

    /* JADX INFO: renamed from: d */
    public final String f70448d;

    /* JADX INFO: renamed from: e */
    public final String f70449e;

    /* JADX INFO: renamed from: f */
    public final String f70450f;

    /* JADX INFO: renamed from: g */
    public final String f70451g;

    /* JADX INFO: renamed from: h */
    public final String f70452h;

    /* JADX INFO: renamed from: i */
    public final bk11 f70453i;

    /* JADX INFO: renamed from: j */
    public final boolean f70454j;

    public fk11(String str, String str2, String str3, String str4, String str5, String str6, String str7, bk11 bk11Var, boolean z) {
        this.f70446b = str;
        this.f70447c = str2;
        this.f70448d = str3;
        this.f70449e = str4;
        this.f70450f = str5;
        this.f70451g = str6;
        this.f70452h = str7;
        this.f70453i = bk11Var;
        this.f70454j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk11)) {
            return false;
        }
        fk11 fk11Var = (fk11) obj;
        return wj50.m88271j(this.f70446b, fk11Var.f70446b) && wj50.m88271j(this.f70447c, fk11Var.f70447c) && wj50.m88271j(this.f70448d, fk11Var.f70448d) && wj50.m88271j(this.f70449e, fk11Var.f70449e) && wj50.m88271j(this.f70450f, fk11Var.f70450f) && wj50.m88271j(this.f70451g, fk11Var.f70451g) && wj50.m88271j(this.f70452h, fk11Var.f70452h) && wj50.m88271j(this.f70453i, fk11Var.f70453i) && this.f70454j == fk11Var.f70454j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f70446b.hashCode() * 31, 31, this.f70447c), 31, this.f70448d), 31, this.f70449e), 31, this.f70450f);
        String str = this.f70451g;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70452h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bk11 bk11Var = this.f70453i;
        return Boolean.hashCode(this.f70454j) + ((iHashCode2 + (bk11Var != null ? bk11Var.hashCode() : 0)) * 31);
    }
}
