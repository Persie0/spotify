package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sun0 implements xun0 {

    /* JADX INFO: renamed from: a */
    public final long f214150a;

    /* JADX INFO: renamed from: b */
    public final long f214151b;

    /* JADX INFO: renamed from: c */
    public final String f214152c;

    /* JADX INFO: renamed from: d */
    public final String f214153d;

    /* JADX INFO: renamed from: e */
    public final String f214154e;

    /* JADX INFO: renamed from: f */
    public final String f214155f;

    public sun0(long j, long j2, String str, String str2, String str3, String str4) {
        this.f214150a = j;
        this.f214151b = j2;
        this.f214152c = str;
        this.f214153d = str2;
        this.f214154e = str3;
        this.f214155f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sun0)) {
            return false;
        }
        sun0 sun0Var = (sun0) obj;
        return this.f214150a == sun0Var.f214150a && this.f214151b == sun0Var.f214151b && wj50.m88271j(this.f214152c, sun0Var.f214152c) && wj50.m88271j(this.f214153d, sun0Var.f214153d) && wj50.m88271j(this.f214154e, sun0Var.f214154e) && wj50.m88271j(this.f214155f, sun0Var.f214155f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(dq60.m36605e(Long.hashCode(this.f214150a) * 31, this.f214151b, 31), 31, this.f214152c);
        String str = this.f214153d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f214154e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f214155f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
