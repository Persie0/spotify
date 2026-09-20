package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sqq extends uqq {

    /* JADX INFO: renamed from: a */
    public final String f213129a;

    /* JADX INFO: renamed from: b */
    public final String f213130b;

    /* JADX INFO: renamed from: c */
    public final String f213131c;

    public sqq(String str, String str2, String str3) {
        this.f213129a = str;
        this.f213130b = str2;
        this.f213131c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqq)) {
            return false;
        }
        sqq sqqVar = (sqq) obj;
        return wj50.m88271j(this.f213129a, sqqVar.f213129a) && wj50.m88271j(this.f213130b, sqqVar.f213130b) && wj50.m88271j(this.f213131c, sqqVar.f213131c);
    }

    public final int hashCode() {
        return this.f213131c.hashCode() + s571.m77243b(this.f213129a.hashCode() * 31, 31, this.f213130b);
    }
}
