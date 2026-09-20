package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cc50 extends dc50 {

    /* JADX INFO: renamed from: b */
    public final String f36314b;

    /* JADX INFO: renamed from: c */
    public final String f36315c;

    public cc50(String str, String str2) {
        this.f36314b = str;
        this.f36315c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc50)) {
            return false;
        }
        cc50 cc50Var = (cc50) obj;
        return wj50.m88271j(this.f36314b, cc50Var.f36314b) && wj50.m88271j(this.f36315c, cc50Var.f36315c);
    }

    public final int hashCode() {
        return this.f36315c.hashCode() + (this.f36314b.hashCode() * 31);
    }
}
