package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tht {

    /* JADX INFO: renamed from: a */
    public final String f220477a;

    /* JADX INFO: renamed from: b */
    public final String f220478b;

    /* JADX INFO: renamed from: c */
    public final String f220479c;

    /* JADX INFO: renamed from: d */
    public final boolean f220480d;

    /* JADX INFO: renamed from: e */
    public final Long f220481e;

    /* JADX INFO: renamed from: f */
    public final String f220482f;

    /* JADX INFO: renamed from: g */
    public final d850 f220483g;

    public tht(Long l, String str, String str2, String str3, String str4, d850 d850Var, boolean z) {
        this.f220477a = str;
        this.f220478b = str2;
        this.f220479c = str3;
        this.f220480d = z;
        this.f220481e = l;
        this.f220482f = str4;
        this.f220483g = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tht)) {
            return false;
        }
        tht thtVar = (tht) obj;
        return wj50.m88271j(this.f220477a, thtVar.f220477a) && wj50.m88271j(this.f220478b, thtVar.f220478b) && wj50.m88271j(this.f220479c, thtVar.f220479c) && this.f220480d == thtVar.f220480d && wj50.m88271j(this.f220481e, thtVar.f220481e) && wj50.m88271j(this.f220482f, thtVar.f220482f) && wj50.m88271j(this.f220483g, thtVar.f220483g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f220477a.hashCode() * 31, 31, this.f220478b);
        String str = this.f220479c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f220480d);
        Long l = this.f220481e;
        int iM77243b2 = s571.m77243b((iM77245d + (l == null ? 0 : l.hashCode())) * 31, 31, this.f220482f);
        d850 d850Var = this.f220483g;
        return iM77243b2 + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
