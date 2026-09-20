package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yfy0 {

    /* JADX INFO: renamed from: a */
    public final String f272380a;

    /* JADX INFO: renamed from: b */
    public final ney0 f272381b;

    /* JADX INFO: renamed from: c */
    public final nks0 f272382c;

    /* JADX INFO: renamed from: d */
    public final String f272383d;

    /* JADX INFO: renamed from: e */
    public final boolean f272384e;

    /* JADX INFO: renamed from: f */
    public final dsc1 f272385f;

    /* JADX INFO: renamed from: g */
    public final boolean f272386g;

    /* JADX INFO: renamed from: h */
    public final g081 f272387h;

    /* JADX INFO: renamed from: i */
    public final String f272388i;

    public yfy0(String str, ney0 ney0Var, nks0 nks0Var, String str2, boolean z, dsc1 dsc1Var, boolean z2, g081 g081Var, String str3) {
        this.f272380a = str;
        this.f272381b = ney0Var;
        this.f272382c = nks0Var;
        this.f272383d = str2;
        this.f272384e = z;
        this.f272385f = dsc1Var;
        this.f272386g = z2;
        this.f272387h = g081Var;
        this.f272388i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfy0)) {
            return false;
        }
        yfy0 yfy0Var = (yfy0) obj;
        return wj50.m88271j(this.f272380a, yfy0Var.f272380a) && wj50.m88271j(this.f272381b, yfy0Var.f272381b) && wj50.m88271j(this.f272382c, yfy0Var.f272382c) && wj50.m88271j(this.f272383d, yfy0Var.f272383d) && this.f272384e == yfy0Var.f272384e && wj50.m88271j(this.f272385f, yfy0Var.f272385f) && this.f272386g == yfy0Var.f272386g && wj50.m88271j(this.f272387h, yfy0Var.f272387h) && wj50.m88271j(this.f272388i, yfy0Var.f272388i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b((this.f272382c.hashCode() + ((this.f272381b.hashCode() + (this.f272380a.hashCode() * 31)) * 31)) * 31, 31, this.f272383d), 31, this.f272384e);
        dsc1 dsc1Var = this.f272385f;
        int iM77244c = s571.m77244c(s571.m77245d((iM77245d + (dsc1Var == null ? 0 : dsc1Var.hashCode())) * 31, 31, this.f272386g), 31, this.f272387h.f75311a);
        String str = this.f272388i;
        return iM77244c + (str != null ? str.hashCode() : 0);
    }
}
