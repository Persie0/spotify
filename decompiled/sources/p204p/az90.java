package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class az90 {

    /* JADX INFO: renamed from: a */
    public final String f21460a;

    /* JADX INFO: renamed from: b */
    public final String f21461b;

    /* JADX INFO: renamed from: c */
    public final String f21462c;

    public az90(String str, String str2, String str3) {
        this.f21460a = str;
        this.f21461b = str2;
        this.f21462c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az90)) {
            return false;
        }
        az90 az90Var = (az90) obj;
        return wj50.m88271j(this.f21460a, az90Var.f21460a) && wj50.m88271j(this.f21461b, az90Var.f21461b) && wj50.m88271j(this.f21462c, az90Var.f21462c);
    }

    public final int hashCode() {
        return this.f21462c.hashCode() + s571.m77243b(this.f21460a.hashCode() * 31, 31, this.f21461b);
    }
}
