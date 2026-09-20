package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class han0 implements kan0 {

    /* JADX INFO: renamed from: a */
    public final String f89247a;

    /* JADX INFO: renamed from: b */
    public final String f89248b;

    /* JADX INFO: renamed from: c */
    public final String f89249c;

    /* JADX INFO: renamed from: d */
    public final String f89250d;

    /* JADX INFO: renamed from: e */
    public final fan0 f89251e;

    /* JADX INFO: renamed from: f */
    public final long f89252f;

    public han0(String str, String str2, String str3, String str4, fan0 fan0Var, long j) {
        this.f89247a = str;
        this.f89248b = str2;
        this.f89249c = str3;
        this.f89250d = str4;
        this.f89251e = fan0Var;
        this.f89252f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof han0)) {
            return false;
        }
        han0 han0Var = (han0) obj;
        return wj50.m88271j(this.f89247a, han0Var.f89247a) && wj50.m88271j(this.f89248b, han0Var.f89248b) && wj50.m88271j(this.f89249c, han0Var.f89249c) && wj50.m88271j(this.f89250d, han0Var.f89250d) && wj50.m88271j(this.f89251e, han0Var.f89251e) && this.f89252f == han0Var.f89252f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f89247a.hashCode() * 31, 31, this.f89248b), 31, this.f89249c);
        String str = this.f89250d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        fan0 fan0Var = this.f89251e;
        return Long.hashCode(this.f89252f) + ((iHashCode + (fan0Var != null ? fan0Var.hashCode() : 0)) * 31);
    }
}
