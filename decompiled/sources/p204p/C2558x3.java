package p204p;

/* JADX INFO: renamed from: p.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2558x3 {

    /* JADX INFO: renamed from: a */
    public final String f257606a;

    /* JADX INFO: renamed from: b */
    public final String f257607b;

    public C2558x3(String str, String str2) {
        this.f257606a = str;
        this.f257607b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2558x3)) {
            return false;
        }
        C2558x3 c2558x3 = (C2558x3) obj;
        return wj50.m88271j(this.f257606a, c2558x3.f257606a) && wj50.m88271j(this.f257607b, c2558x3.f257607b);
    }

    public final int hashCode() {
        return this.f257607b.hashCode() + (this.f257606a.hashCode() * 31);
    }
}
