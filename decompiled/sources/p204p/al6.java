package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class al6 {

    /* JADX INFO: renamed from: a */
    public final String f16778a;

    /* JADX INFO: renamed from: b */
    public final long f16779b;

    /* JADX INFO: renamed from: c */
    public final long f16780c;

    /* JADX INFO: renamed from: d */
    public final int f16781d;

    /* JADX INFO: renamed from: e */
    public final boolean f16782e;

    /* JADX INFO: renamed from: f */
    public final String f16783f;

    public al6(int i, long j, long j2, String str, String str2, boolean z) {
        this.f16778a = str;
        this.f16779b = j;
        this.f16780c = j2;
        this.f16781d = i;
        this.f16782e = z;
        this.f16783f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al6)) {
            return false;
        }
        al6 al6Var = (al6) obj;
        return wj50.m88271j(this.f16778a, al6Var.f16778a) && this.f16779b == al6Var.f16779b && this.f16780c == al6Var.f16780c && this.f16781d == al6Var.f16781d && this.f16782e == al6Var.f16782e && wj50.m88271j(this.f16783f, al6Var.f16783f);
    }

    public final int hashCode() {
        return this.f16783f.hashCode() + s571.m77245d(mt60.m62800g(this.f16781d, dq60.m36605e(dq60.m36605e(this.f16778a.hashCode() * 31, this.f16779b, 31), this.f16780c, 31), 31), 31, this.f16782e);
    }
}
