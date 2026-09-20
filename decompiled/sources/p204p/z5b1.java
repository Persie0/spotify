package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z5b1 {

    /* JADX INFO: renamed from: a */
    public final String f279531a;

    /* JADX INFO: renamed from: b */
    public final String f279532b;

    /* JADX INFO: renamed from: c */
    public final String f279533c;

    /* JADX INFO: renamed from: d */
    public final String f279534d;

    /* JADX INFO: renamed from: e */
    public final String f279535e;

    /* JADX INFO: renamed from: f */
    public final String f279536f;

    public z5b1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f279531a = str;
        this.f279532b = str2;
        this.f279533c = str3;
        this.f279534d = str4;
        this.f279535e = str5;
        this.f279536f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5b1)) {
            return false;
        }
        z5b1 z5b1Var = (z5b1) obj;
        return wj50.m88271j(this.f279531a, z5b1Var.f279531a) && wj50.m88271j(this.f279532b, z5b1Var.f279532b) && wj50.m88271j(this.f279533c, z5b1Var.f279533c) && wj50.m88271j(this.f279534d, z5b1Var.f279534d) && wj50.m88271j(this.f279535e, z5b1Var.f279535e) && wj50.m88271j(this.f279536f, z5b1Var.f279536f);
    }

    public final int hashCode() {
        return this.f279536f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f279531a.hashCode() * 31, 31, this.f279532b), 31, this.f279533c), 31, this.f279534d), 31, this.f279535e);
    }
}
