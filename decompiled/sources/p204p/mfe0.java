package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mfe0 {

    /* JADX INFO: renamed from: a */
    public final String f143056a;

    /* JADX INFO: renamed from: b */
    public final String f143057b;

    /* JADX INFO: renamed from: c */
    public final String f143058c;

    /* JADX INFO: renamed from: d */
    public final String f143059d;

    /* JADX INFO: renamed from: e */
    public final int f143060e;

    /* JADX INFO: renamed from: f */
    public final jk11 f143061f;

    public /* synthetic */ mfe0(String str) {
        this("", str, "", "", 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfe0)) {
            return false;
        }
        mfe0 mfe0Var = (mfe0) obj;
        return wj50.m88271j(this.f143056a, mfe0Var.f143056a) && wj50.m88271j(this.f143057b, mfe0Var.f143057b) && wj50.m88271j(this.f143058c, mfe0Var.f143058c) && wj50.m88271j(this.f143059d, mfe0Var.f143059d) && this.f143060e == mfe0Var.f143060e && wj50.m88271j(this.f143061f, mfe0Var.f143061f);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f143060e, s571.m77243b(s571.m77243b(s571.m77243b(this.f143056a.hashCode() * 31, 31, this.f143057b), 31, this.f143058c), 31, this.f143059d), 31);
        jk11 jk11Var = this.f143061f;
        return iM62800g + (jk11Var == null ? 0 : jk11Var.hashCode());
    }

    public mfe0(String str, String str2, String str3, String str4, int i, jk11 jk11Var) {
        this.f143056a = str;
        this.f143057b = str2;
        this.f143058c = str3;
        this.f143059d = str4;
        this.f143060e = i;
        this.f143061f = jk11Var;
    }
}
