package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rl00 {

    /* JADX INFO: renamed from: a */
    public final String f200187a;

    /* JADX INFO: renamed from: b */
    public final String f200188b;

    /* JADX INFO: renamed from: c */
    public final String f200189c;

    /* JADX INFO: renamed from: d */
    public final String f200190d;

    public rl00(String str, String str2, String str3, String str4) {
        this.f200187a = str;
        this.f200188b = str2;
        this.f200189c = str3;
        this.f200190d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl00)) {
            return false;
        }
        rl00 rl00Var = (rl00) obj;
        return wj50.m88271j(this.f200187a, rl00Var.f200187a) && wj50.m88271j(this.f200188b, rl00Var.f200188b) && wj50.m88271j(this.f200189c, rl00Var.f200189c) && wj50.m88271j(this.f200190d, rl00Var.f200190d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f200187a.hashCode() * 31, 31, this.f200188b), 31, this.f200189c);
        String str = this.f200190d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
