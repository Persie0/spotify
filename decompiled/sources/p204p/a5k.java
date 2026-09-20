package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class a5k implements g5k {

    /* JADX INFO: renamed from: a */
    public final String f12531a;

    /* JADX INFO: renamed from: b */
    public final String f12532b;

    /* JADX INFO: renamed from: c */
    public final String f12533c;

    public a5k(String str, String str2, String str3) {
        this.f12531a = str;
        this.f12532b = str2;
        this.f12533c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5k)) {
            return false;
        }
        a5k a5kVar = (a5k) obj;
        return wj50.m88271j(this.f12531a, a5kVar.f12531a) && wj50.m88271j(this.f12532b, a5kVar.f12532b) && wj50.m88271j(this.f12533c, a5kVar.f12533c);
    }

    public final int hashCode() {
        return this.f12533c.hashCode() + s571.m77243b(this.f12531a.hashCode() * 31, 31, this.f12532b);
    }
}
