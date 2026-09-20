package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class af9 {

    /* JADX INFO: renamed from: a */
    public final String f15092a;

    /* JADX INFO: renamed from: b */
    public final String f15093b;

    /* JADX INFO: renamed from: c */
    public final boolean f15094c;

    public af9(String str, String str2, boolean z) {
        this.f15092a = str;
        this.f15093b = str2;
        this.f15094c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af9)) {
            return false;
        }
        af9 af9Var = (af9) obj;
        return wj50.m88271j(this.f15092a, af9Var.f15092a) && wj50.m88271j(this.f15093b, af9Var.f15093b) && this.f15094c == af9Var.f15094c;
    }

    public final int hashCode() {
        int iHashCode = this.f15092a.hashCode() * 31;
        String str = this.f15093b;
        return Boolean.hashCode(this.f15094c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
