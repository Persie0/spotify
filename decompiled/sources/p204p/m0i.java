package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m0i {

    /* JADX INFO: renamed from: a */
    public final String f138681a;

    /* JADX INFO: renamed from: b */
    public final String f138682b;

    /* JADX INFO: renamed from: c */
    public final String f138683c;

    public m0i(String str, String str2, String str3) {
        this.f138681a = str;
        this.f138682b = str2;
        this.f138683c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0i)) {
            return false;
        }
        m0i m0iVar = (m0i) obj;
        return wj50.m88271j(this.f138681a, m0iVar.f138681a) && wj50.m88271j(this.f138682b, m0iVar.f138682b) && wj50.m88271j(this.f138683c, m0iVar.f138683c);
    }

    public final int hashCode() {
        return this.f138683c.hashCode() + s571.m77243b(this.f138681a.hashCode() * 31, 31, this.f138682b);
    }
}
