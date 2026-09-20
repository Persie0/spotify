package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bje0 {

    /* JADX INFO: renamed from: a */
    public final String f27675a;

    /* JADX INFO: renamed from: b */
    public final String f27676b;

    /* JADX INFO: renamed from: c */
    public final String f27677c;

    /* JADX INFO: renamed from: d */
    public final String f27678d;

    public bje0(String str, String str2, String str3, String str4) {
        this.f27675a = str;
        this.f27676b = str2;
        this.f27677c = str3;
        this.f27678d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bje0)) {
            return false;
        }
        bje0 bje0Var = (bje0) obj;
        return wj50.m88271j(this.f27675a, bje0Var.f27675a) && wj50.m88271j(this.f27676b, bje0Var.f27676b) && wj50.m88271j(this.f27677c, bje0Var.f27677c) && wj50.m88271j(this.f27678d, bje0Var.f27678d);
    }

    public final int hashCode() {
        int iHashCode = this.f27675a.hashCode() * 31;
        String str = this.f27676b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27677c);
        String str2 = this.f27678d;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
