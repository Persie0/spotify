package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qh21 {

    /* JADX INFO: renamed from: a */
    public final String f188603a;

    /* JADX INFO: renamed from: b */
    public final int f188604b;

    /* JADX INFO: renamed from: c */
    public final String f188605c;

    /* JADX INFO: renamed from: d */
    public final String f188606d;

    /* JADX INFO: renamed from: e */
    public final String f188607e;

    /* JADX INFO: renamed from: f */
    public final String f188608f;

    /* JADX INFO: renamed from: g */
    public final String f188609g;

    public qh21(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f188603a = str;
        this.f188604b = i;
        this.f188605c = str2;
        this.f188606d = str3;
        this.f188607e = str4;
        this.f188608f = str5;
        this.f188609g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh21)) {
            return false;
        }
        qh21 qh21Var = (qh21) obj;
        return this.f188603a.equals(qh21Var.f188603a) && this.f188604b == qh21Var.f188604b && this.f188605c.equals(qh21Var.f188605c) && this.f188606d.equals(qh21Var.f188606d) && this.f188607e.equals(qh21Var.f188607e) && this.f188608f.equals(qh21Var.f188608f) && this.f188609g.equals(qh21Var.f188609g);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(dq60.m36605e(mt60.m62800g(this.f188604b, this.f188603a.hashCode() * 31, 31), 0L, 961), 31, this.f188605c), 31, this.f188606d), 31, this.f188607e), 31, this.f188608f), 31, this.f188609g);
    }
}
