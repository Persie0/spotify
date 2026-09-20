package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u7w {

    /* JADX INFO: renamed from: a */
    public final String f227762a;

    /* JADX INFO: renamed from: b */
    public final String f227763b;

    /* JADX INFO: renamed from: c */
    public final String f227764c;

    /* JADX INFO: renamed from: d */
    public final qsj f227765d;

    /* JADX INFO: renamed from: e */
    public final m8w f227766e;

    public u7w(String str, String str2, String str3, qsj qsjVar, m8w m8wVar) {
        this.f227762a = str;
        this.f227763b = str2;
        this.f227764c = str3;
        this.f227765d = qsjVar;
        this.f227766e = m8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7w)) {
            return false;
        }
        u7w u7wVar = (u7w) obj;
        return wj50.m88271j(this.f227762a, u7wVar.f227762a) && wj50.m88271j(this.f227763b, u7wVar.f227763b) && wj50.m88271j(this.f227764c, u7wVar.f227764c) && this.f227765d == u7wVar.f227765d && wj50.m88271j(this.f227766e, u7wVar.f227766e);
    }

    public final int hashCode() {
        int iHashCode = this.f227762a.hashCode() * 31;
        String str = this.f227763b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f227764c;
        return this.f227766e.hashCode() + xl81.m91401j(this.f227765d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }
}
