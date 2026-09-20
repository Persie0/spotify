package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m140 {

    /* JADX INFO: renamed from: a */
    public final String f138841a;

    /* JADX INFO: renamed from: b */
    public final String f138842b;

    /* JADX INFO: renamed from: c */
    public final String f138843c;

    public /* synthetic */ m140(String str, String str2, int i, String str3) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m140)) {
            return false;
        }
        m140 m140Var = (m140) obj;
        return wj50.m88271j(this.f138841a, m140Var.f138841a) && wj50.m88271j(this.f138842b, m140Var.f138842b) && wj50.m88271j(this.f138843c, m140Var.f138843c);
    }

    public final int hashCode() {
        int iHashCode = this.f138841a.hashCode() * 31;
        String str = this.f138842b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138843c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public m140(String str, String str2, String str3) {
        this.f138841a = str;
        this.f138842b = str2;
        this.f138843c = str3;
    }
}
