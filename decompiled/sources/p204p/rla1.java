package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rla1 {

    /* JADX INFO: renamed from: a */
    public final String f200258a;

    /* JADX INFO: renamed from: b */
    public final String f200259b;

    /* JADX INFO: renamed from: c */
    public final String f200260c;

    public rla1(String str, String str2, String str3) {
        this.f200258a = str;
        this.f200259b = str2;
        this.f200260c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rla1)) {
            return false;
        }
        rla1 rla1Var = (rla1) obj;
        return wj50.m88271j(this.f200258a, rla1Var.f200258a) && wj50.m88271j(this.f200259b, rla1Var.f200259b) && wj50.m88271j(this.f200260c, rla1Var.f200260c);
    }

    public final int hashCode() {
        int iHashCode = this.f200258a.hashCode() * 31;
        String str = this.f200259b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f200260c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
