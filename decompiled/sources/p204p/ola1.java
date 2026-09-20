package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ola1 {

    /* JADX INFO: renamed from: a */
    public final String f166803a;

    /* JADX INFO: renamed from: b */
    public final String f166804b;

    /* JADX INFO: renamed from: c */
    public final String f166805c;

    public ola1(String str, String str2, String str3) {
        this.f166803a = str;
        this.f166804b = str2;
        this.f166805c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ola1)) {
            return false;
        }
        ola1 ola1Var = (ola1) obj;
        return wj50.m88271j(this.f166803a, ola1Var.f166803a) && wj50.m88271j(this.f166804b, ola1Var.f166804b) && wj50.m88271j(this.f166805c, ola1Var.f166805c);
    }

    public final int hashCode() {
        int iHashCode = this.f166803a.hashCode() * 31;
        String str = this.f166804b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166805c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
