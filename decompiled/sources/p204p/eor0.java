package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eor0 {

    /* JADX INFO: renamed from: a */
    public final String f61464a;

    /* JADX INFO: renamed from: b */
    public final String f61465b;

    public eor0(String str, String str2) {
        this.f61464a = str;
        this.f61465b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eor0)) {
            return false;
        }
        eor0 eor0Var = (eor0) obj;
        return wj50.m88271j(this.f61464a, eor0Var.f61464a) && wj50.m88271j(this.f61465b, eor0Var.f61465b);
    }

    public final int hashCode() {
        String str = this.f61464a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61465b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
