package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tv7 {

    /* JADX INFO: renamed from: a */
    public final hz80 f224084a;

    /* JADX INFO: renamed from: b */
    public final String f224085b;

    /* JADX INFO: renamed from: c */
    public final String f224086c;

    public tv7(String str, String str2, hz80 hz80Var) {
        this.f224084a = hz80Var;
        this.f224085b = str;
        this.f224086c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv7)) {
            return false;
        }
        tv7 tv7Var = (tv7) obj;
        return wj50.m88271j(this.f224084a, tv7Var.f224084a) && wj50.m88271j(this.f224085b, tv7Var.f224085b) && wj50.m88271j(this.f224086c, tv7Var.f224086c);
    }

    public final int hashCode() {
        int iHashCode = this.f224084a.hashCode() * 31;
        String str = this.f224085b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f224086c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
