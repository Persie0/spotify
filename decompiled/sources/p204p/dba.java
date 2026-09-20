package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dba {

    /* JADX INFO: renamed from: a */
    public final String f47264a;

    /* JADX INFO: renamed from: b */
    public final String f47265b;

    /* JADX INFO: renamed from: c */
    public final String f47266c;

    public dba(String str, String str2, String str3) {
        this.f47264a = str;
        this.f47265b = str2;
        this.f47266c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dba)) {
            return false;
        }
        dba dbaVar = (dba) obj;
        return wj50.m88271j(this.f47264a, dbaVar.f47264a) && wj50.m88271j(this.f47265b, dbaVar.f47265b) && wj50.m88271j(this.f47266c, dbaVar.f47266c);
    }

    public final int hashCode() {
        return this.f47266c.hashCode() + s571.m77243b(((this.f47264a.hashCode() * 31) + 1971821304) * 31, 31, this.f47265b);
    }
}
