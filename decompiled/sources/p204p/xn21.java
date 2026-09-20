package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xn21 implements zn21 {

    /* JADX INFO: renamed from: a */
    public final String f263497a;

    /* JADX INFO: renamed from: b */
    public final long f263498b;

    /* JADX INFO: renamed from: c */
    public final long f263499c;

    /* JADX INFO: renamed from: d */
    public final it91 f263500d;

    public xn21(String str, long j, long j2, it91 it91Var) {
        this.f263497a = str;
        this.f263498b = j;
        this.f263499c = j2;
        this.f263500d = it91Var;
    }

    @Override // p204p.zn21
    /* JADX INFO: renamed from: a */
    public final it91 mo88575a() {
        return this.f263500d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn21)) {
            return false;
        }
        xn21 xn21Var = (xn21) obj;
        return wj50.m88271j(this.f263497a, xn21Var.f263497a) && this.f263498b == xn21Var.f263498b && this.f263499c == xn21Var.f263499c && wj50.m88271j(this.f263500d, xn21Var.f263500d);
    }

    public final int hashCode() {
        return this.f263500d.hashCode() + dq60.m36605e(dq60.m36605e(this.f263497a.hashCode() * 31, this.f263498b, 31), this.f263499c, 31);
    }
}
