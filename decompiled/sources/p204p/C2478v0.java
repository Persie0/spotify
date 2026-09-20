package p204p;

/* JADX INFO: renamed from: p.v0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C2478v0 {

    /* JADX INFO: renamed from: a */
    public final String f235862a;

    /* JADX INFO: renamed from: b */
    public final String f235863b;

    public C2478v0(String str, String str2) {
        this.f235862a = str;
        this.f235863b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2478v0)) {
            return false;
        }
        C2478v0 c2478v0 = (C2478v0) obj;
        return wj50.m88271j(this.f235862a, c2478v0.f235862a) && wj50.m88271j(this.f235863b, c2478v0.f235863b);
    }

    public final int hashCode() {
        return (this.f235862a.hashCode() * 31) + this.f235863b.hashCode();
    }
}
