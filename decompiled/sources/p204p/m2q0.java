package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m2q0 {

    /* JADX INFO: renamed from: a */
    public final String f139444a;

    /* JADX INFO: renamed from: b */
    public final String f139445b;

    /* JADX INFO: renamed from: c */
    public final long f139446c;

    /* JADX INFO: renamed from: d */
    public final String f139447d;

    /* JADX INFO: renamed from: e */
    public final Long f139448e;

    /* JADX INFO: renamed from: f */
    public final Long f139449f;

    public m2q0(String str, String str2, long j, String str3, Long l, Long l2) {
        this.f139444a = str;
        this.f139445b = str2;
        this.f139446c = j;
        this.f139447d = str3;
        this.f139448e = l;
        this.f139449f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2q0)) {
            return false;
        }
        m2q0 m2q0Var = (m2q0) obj;
        return wj50.m88271j(this.f139444a, m2q0Var.f139444a) && wj50.m88271j(this.f139445b, m2q0Var.f139445b) && this.f139446c == m2q0Var.f139446c && wj50.m88271j(this.f139447d, m2q0Var.f139447d) && wj50.m88271j(this.f139448e, m2q0Var.f139448e) && wj50.m88271j(this.f139449f, m2q0Var.f139449f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(dq60.m36605e(s571.m77243b(this.f139444a.hashCode() * 31, 31, this.f139445b), this.f139446c, 31), 31, this.f139447d);
        Long l = this.f139448e;
        int iHashCode = (iM77243b + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f139449f;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
