package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class m0k {

    /* JADX INFO: renamed from: a */
    public final String f138692a;

    /* JADX INFO: renamed from: b */
    public final String f138693b;

    public m0k(String str, String str2) {
        this.f138692a = str;
        this.f138693b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0k)) {
            return false;
        }
        m0k m0kVar = (m0k) obj;
        return wj50.m88271j(this.f138692a, m0kVar.f138692a) && wj50.m88271j(this.f138693b, m0kVar.f138693b);
    }

    public final int hashCode() {
        return this.f138693b.hashCode() + (this.f138692a.hashCode() * 31);
    }
}
