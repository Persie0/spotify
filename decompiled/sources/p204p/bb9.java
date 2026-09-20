package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bb9 {

    /* JADX INFO: renamed from: a */
    public final String f25474a;

    /* JADX INFO: renamed from: b */
    public final izl0 f25475b;

    /* JADX INFO: renamed from: c */
    public final String f25476c;

    /* JADX INFO: renamed from: d */
    public final long f25477d;

    /* JADX INFO: renamed from: e */
    public long f25478e = 0;

    /* JADX INFO: renamed from: f */
    public final sge0 f25479f;

    public bb9(String str, izl0 izl0Var, String str2, long j, sge0 sge0Var) {
        this.f25474a = str;
        this.f25475b = izl0Var;
        this.f25476c = str2;
        this.f25477d = j;
        this.f25479f = sge0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb9)) {
            return false;
        }
        bb9 bb9Var = (bb9) obj;
        return wj50.m88271j(this.f25474a, bb9Var.f25474a) && wj50.m88271j(this.f25475b, bb9Var.f25475b) && wj50.m88271j(this.f25476c, bb9Var.f25476c) && this.f25477d == bb9Var.f25477d && this.f25478e == bb9Var.f25478e && wj50.m88271j(this.f25479f, bb9Var.f25479f);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(s571.m77243b((this.f25475b.hashCode() + (this.f25474a.hashCode() * 31)) * 31, 31, this.f25476c), this.f25477d, 31), this.f25478e, 31);
        sge0 sge0Var = this.f25479f;
        return iM36605e + (sge0Var == null ? 0 : sge0Var.hashCode());
    }
}
