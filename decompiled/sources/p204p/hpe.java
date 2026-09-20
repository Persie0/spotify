package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hpe {

    /* JADX INFO: renamed from: a */
    public final int f93758a;

    /* JADX INFO: renamed from: b */
    public final String f93759b;

    /* JADX INFO: renamed from: c */
    public final String f93760c;

    /* JADX INFO: renamed from: d */
    public final long f93761d;

    /* JADX INFO: renamed from: e */
    public final String f93762e;

    /* JADX INFO: renamed from: f */
    public final String f93763f;

    /* JADX INFO: renamed from: g */
    public final long f93764g;

    public hpe(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.f93758a = i;
        this.f93759b = str;
        this.f93760c = str2;
        this.f93761d = j;
        this.f93762e = str3;
        this.f93763f = str4;
        this.f93764g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpe)) {
            return false;
        }
        hpe hpeVar = (hpe) obj;
        return this.f93758a == hpeVar.f93758a && wj50.m88271j(this.f93759b, hpeVar.f93759b) && wj50.m88271j(this.f93760c, hpeVar.f93760c) && this.f93761d == hpeVar.f93761d && wj50.m88271j(this.f93762e, hpeVar.f93762e) && wj50.m88271j(this.f93763f, hpeVar.f93763f) && this.f93764g == hpeVar.f93764g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(dq60.m36605e(s571.m77243b(s571.m77243b(Integer.hashCode(this.f93758a) * 31, 31, this.f93759b), 31, this.f93760c), this.f93761d, 31), 31, this.f93762e);
        String str = this.f93763f;
        return Long.hashCode(this.f93764g) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
