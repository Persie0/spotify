package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sko0 {

    /* JADX INFO: renamed from: a */
    public final String f210172a;

    /* JADX INFO: renamed from: b */
    public final String f210173b;

    /* JADX INFO: renamed from: c */
    public final long f210174c;

    /* JADX INFO: renamed from: d */
    public final long f210175d;

    /* JADX INFO: renamed from: e */
    public final long f210176e;

    public sko0(long j, long j2, long j3, String str, String str2) {
        this.f210172a = str;
        this.f210173b = str2;
        this.f210174c = j;
        this.f210175d = j2;
        this.f210176e = j3;
    }

    /* JADX INFO: renamed from: a */
    public static sko0 m78376a(sko0 sko0Var, long j) {
        String str = sko0Var.f210172a;
        String str2 = sko0Var.f210173b;
        long j2 = sko0Var.f210174c;
        long j3 = sko0Var.f210176e;
        sko0Var.getClass();
        return new sko0(j2, j, j3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sko0)) {
            return false;
        }
        sko0 sko0Var = (sko0) obj;
        return wj50.m88271j(this.f210172a, sko0Var.f210172a) && wj50.m88271j(this.f210173b, sko0Var.f210173b) && this.f210174c == sko0Var.f210174c && this.f210175d == sko0Var.f210175d && this.f210176e == sko0Var.f210176e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f210176e) + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f210172a.hashCode() * 31, 31, this.f210173b), this.f210174c, 31), this.f210175d, 31);
    }
}
