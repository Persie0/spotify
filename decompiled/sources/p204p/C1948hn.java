package p204p;

/* JADX INFO: renamed from: p.hn */
/* JADX INFO: loaded from: classes4.dex */
public final class C1948hn {

    /* JADX INFO: renamed from: a */
    public final String f93107a;

    /* JADX INFO: renamed from: b */
    public final String f93108b;

    /* JADX INFO: renamed from: c */
    public final String f93109c;

    public C1948hn(String str, String str2, String str3) {
        this.f93107a = str;
        this.f93108b = str2;
        this.f93109c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1948hn)) {
            return false;
        }
        C1948hn c1948hn = (C1948hn) obj;
        return wj50.m88271j(this.f93107a, c1948hn.f93107a) && wj50.m88271j(this.f93108b, c1948hn.f93108b) && wj50.m88271j(this.f93109c, c1948hn.f93109c);
    }

    public final int hashCode() {
        int iHashCode = this.f93107a.hashCode() * 31;
        String str = this.f93108b;
        return this.f93109c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
