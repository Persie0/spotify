package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ct00 {

    /* JADX INFO: renamed from: a */
    public final String f41729a;

    /* JADX INFO: renamed from: b */
    public final String f41730b;

    /* JADX INFO: renamed from: c */
    public final String f41731c;

    public ct00(String str, String str2, String str3) {
        this.f41729a = str;
        this.f41730b = str2;
        this.f41731c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct00)) {
            return false;
        }
        ct00 ct00Var = (ct00) obj;
        return wj50.m88271j(this.f41729a, ct00Var.f41729a) && wj50.m88271j(this.f41730b, ct00Var.f41730b) && wj50.m88271j(this.f41731c, ct00Var.f41731c);
    }

    public final int hashCode() {
        return this.f41731c.hashCode() + s571.m77243b(this.f41729a.hashCode() * 31, 31, this.f41730b);
    }
}
