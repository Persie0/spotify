package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bnq0 {

    /* JADX INFO: renamed from: a */
    public final String f28913a;

    /* JADX INFO: renamed from: b */
    public final String f28914b;

    /* JADX INFO: renamed from: c */
    public final String f28915c;

    public bnq0(String str, String str2, String str3) {
        this.f28913a = str;
        this.f28914b = str2;
        this.f28915c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnq0)) {
            return false;
        }
        bnq0 bnq0Var = (bnq0) obj;
        return wj50.m88271j(this.f28913a, bnq0Var.f28913a) && wj50.m88271j(this.f28914b, bnq0Var.f28914b) && wj50.m88271j(this.f28915c, bnq0Var.f28915c);
    }

    public final int hashCode() {
        String str = this.f28913a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28914b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28915c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
