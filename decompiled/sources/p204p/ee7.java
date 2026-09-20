package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ee7 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f58688a;

    /* JADX INFO: renamed from: b */
    public final String f58689b;

    /* JADX INFO: renamed from: c */
    public final psl f58690c;

    /* JADX INFO: renamed from: d */
    public final String f58691d;

    /* JADX INFO: renamed from: e */
    public final long f58692e;

    /* JADX INFO: renamed from: f */
    public final long f58693f;

    /* JADX INFO: renamed from: g */
    public final String f58694g;

    /* JADX INFO: renamed from: h */
    public final String f58695h;

    /* JADX INFO: renamed from: i */
    public final String f58696i;

    /* JADX INFO: renamed from: j */
    public final int f58697j;

    public ee7(String str, String str2, psl pslVar, String str3, long j, long j2, String str4, String str5, String str6) {
        this.f58688a = str;
        this.f58689b = str2;
        this.f58690c = pslVar;
        this.f58691d = str3;
        this.f58692e = j;
        this.f58693f = j2;
        this.f58694g = str4;
        this.f58695h = str5;
        this.f58696i = str6;
        this.f58697j = wj50.m88271j(str3, "Unabridged") ? 1 : wj50.m88271j(str3, "Abridged") ? 2 : 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee7)) {
            return false;
        }
        ee7 ee7Var = (ee7) obj;
        return wj50.m88271j(this.f58688a, ee7Var.f58688a) && wj50.m88271j(this.f58689b, ee7Var.f58689b) && wj50.m88271j(this.f58690c, ee7Var.f58690c) && wj50.m88271j(this.f58691d, ee7Var.f58691d) && this.f58692e == ee7Var.f58692e && this.f58693f == ee7Var.f58693f && wj50.m88271j(this.f58694g, ee7Var.f58694g) && wj50.m88271j(this.f58695h, ee7Var.f58695h) && wj50.m88271j(this.f58696i, ee7Var.f58696i);
    }

    public final int hashCode() {
        return this.f58696i.hashCode() + s571.m77243b(s571.m77243b(dq60.m36605e(dq60.m36605e(s571.m77243b((this.f58690c.hashCode() + s571.m77243b(this.f58688a.hashCode() * 31, 31, this.f58689b)) * 31, 31, this.f58691d), this.f58692e, 31), this.f58693f, 31), 31, this.f58694g), 31, this.f58695h);
    }
}
