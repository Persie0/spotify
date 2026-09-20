package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cf00 {

    /* JADX INFO: renamed from: a */
    public final String f37228a;

    /* JADX INFO: renamed from: b */
    public final String f37229b;

    /* JADX INFO: renamed from: c */
    public final boolean f37230c;

    /* JADX INFO: renamed from: d */
    public final String f37231d;

    public cf00(String str, String str2, boolean z, String str3) {
        this.f37228a = str;
        this.f37229b = str2;
        this.f37230c = z;
        this.f37231d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf00)) {
            return false;
        }
        cf00 cf00Var = (cf00) obj;
        return wj50.m88271j(this.f37228a, cf00Var.f37228a) && wj50.m88271j(this.f37229b, cf00Var.f37229b) && this.f37230c == cf00Var.f37230c && wj50.m88271j(this.f37231d, cf00Var.f37231d);
    }

    public final int hashCode() {
        int iHashCode = this.f37228a.hashCode() * 31;
        String str = this.f37229b;
        return this.f37231d.hashCode() + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f37230c);
    }
}
