package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tie0 {

    /* JADX INFO: renamed from: a */
    public final String f220661a;

    /* JADX INFO: renamed from: b */
    public final String f220662b;

    /* JADX INFO: renamed from: c */
    public final String f220663c;

    /* JADX INFO: renamed from: d */
    public final String f220664d;

    public tie0(String str, String str2, String str3, String str4) {
        this.f220661a = str;
        this.f220662b = str2;
        this.f220663c = str3;
        this.f220664d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tie0)) {
            return false;
        }
        tie0 tie0Var = (tie0) obj;
        return wj50.m88271j(this.f220661a, tie0Var.f220661a) && wj50.m88271j(this.f220662b, tie0Var.f220662b) && wj50.m88271j(this.f220663c, tie0Var.f220663c) && wj50.m88271j(this.f220664d, tie0Var.f220664d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f220661a.hashCode() * 31, 31, this.f220662b);
        String str = this.f220663c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f220664d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
