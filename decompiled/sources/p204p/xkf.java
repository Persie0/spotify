package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xkf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f262361a;

    /* JADX INFO: renamed from: b */
    public final String f262362b;

    /* JADX INFO: renamed from: c */
    public final Throwable f262363c;

    public xkf(String str, String str2, Throwable th) {
        this.f262361a = str;
        this.f262362b = str2;
        this.f262363c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkf)) {
            return false;
        }
        xkf xkfVar = (xkf) obj;
        return wj50.m88271j(this.f262361a, xkfVar.f262361a) && wj50.m88271j(this.f262362b, xkfVar.f262362b) && wj50.m88271j(this.f262363c, xkfVar.f262363c);
    }

    public final int hashCode() {
        int iHashCode = this.f262361a.hashCode() * 31;
        String str = this.f262362b;
        return this.f262363c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
