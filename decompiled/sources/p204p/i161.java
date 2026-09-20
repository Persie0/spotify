package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f97421a;

    /* JADX INFO: renamed from: b */
    public final String f97422b;

    /* JADX INFO: renamed from: c */
    public final String f97423c;

    public i161(String str, String str2, String str3) {
        this.f97421a = str;
        this.f97422b = str2;
        this.f97423c = str3;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f97422b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f97421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i161)) {
            return false;
        }
        i161 i161Var = (i161) obj;
        return wj50.m88271j(this.f97421a, i161Var.f97421a) && wj50.m88271j(this.f97422b, i161Var.f97422b) && wj50.m88271j(this.f97423c, i161Var.f97423c);
    }

    public final int hashCode() {
        return this.f97423c.hashCode() + s571.m77243b(this.f97421a.hashCode() * 31, 31, this.f97422b);
    }
}
