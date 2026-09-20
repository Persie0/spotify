package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ck60 {

    /* JADX INFO: renamed from: a */
    public final kbm0 f38821a;

    /* JADX INFO: renamed from: b */
    public final long f38822b;

    /* JADX INFO: renamed from: c */
    public final String f38823c;

    /* JADX INFO: renamed from: d */
    public final String f38824d;

    /* JADX INFO: renamed from: e */
    public final String f38825e;

    /* JADX INFO: renamed from: f */
    public final String f38826f;

    public ck60(kbm0 kbm0Var, long j, String str, String str2, String str3, String str4) {
        this.f38821a = kbm0Var;
        this.f38822b = j;
        this.f38823c = str;
        this.f38824d = str2;
        this.f38825e = str3;
        this.f38826f = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m33076a() {
        return this.f38823c;
    }

    /* JADX INFO: renamed from: b */
    public final String m33077b() {
        return this.f38825e;
    }

    /* JADX INFO: renamed from: c */
    public final String m33078c() {
        return this.f38824d;
    }

    /* JADX INFO: renamed from: d */
    public final kbm0 m33079d() {
        return this.f38821a;
    }

    /* JADX INFO: renamed from: e */
    public final long m33080e() {
        return this.f38822b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck60)) {
            return false;
        }
        ck60 ck60Var = (ck60) obj;
        return wj50.m88271j(this.f38821a, ck60Var.f38821a) && this.f38822b == ck60Var.f38822b && wj50.m88271j(this.f38823c, ck60Var.f38823c) && wj50.m88271j(this.f38824d, ck60Var.f38824d) && wj50.m88271j(this.f38825e, ck60Var.f38825e) && wj50.m88271j(this.f38826f, ck60Var.f38826f);
    }

    public final int hashCode() {
        kbm0 kbm0Var = this.f38821a;
        int iM36605e = dq60.m36605e((kbm0Var == null ? 0 : kbm0Var.f121231a.hashCode()) * 31, this.f38822b, 31);
        String str = this.f38823c;
        int iHashCode = (iM36605e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f38824d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38825e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f38826f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
