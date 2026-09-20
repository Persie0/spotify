package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ur01 {

    /* JADX INFO: renamed from: a */
    public final String f233168a;

    /* JADX INFO: renamed from: b */
    public final String f233169b;

    /* JADX INFO: renamed from: c */
    public final int f233170c;

    /* JADX INFO: renamed from: d */
    public final String f233171d;

    /* JADX INFO: renamed from: e */
    public final String f233172e;

    public ur01(int i, String str, String str2, String str3, String str4) {
        this.f233168a = str;
        this.f233169b = str2;
        this.f233170c = i;
        this.f233171d = str3;
        this.f233172e = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m83825a() {
        return this.f233169b;
    }

    /* JADX INFO: renamed from: b */
    public final int m83826b() {
        return this.f233170c;
    }

    /* JADX INFO: renamed from: c */
    public final String m83827c() {
        return this.f233171d;
    }

    /* JADX INFO: renamed from: d */
    public final String m83828d() {
        return this.f233172e;
    }

    /* JADX INFO: renamed from: e */
    public final String m83829e() {
        return this.f233168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur01)) {
            return false;
        }
        ur01 ur01Var = (ur01) obj;
        return wj50.m88271j(this.f233168a, ur01Var.f233168a) && wj50.m88271j(this.f233169b, ur01Var.f233169b) && this.f233170c == ur01Var.f233170c && wj50.m88271j(this.f233171d, ur01Var.f233171d) && wj50.m88271j(this.f233172e, ur01Var.f233172e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f233170c, s571.m77243b(this.f233168a.hashCode() * 31, 31, this.f233169b), 31), 31, this.f233171d);
        String str = this.f233172e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
