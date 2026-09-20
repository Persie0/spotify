package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xke0 extends yke0 {

    /* JADX INFO: renamed from: a */
    public final String f262353a;

    /* JADX INFO: renamed from: b */
    public final String f262354b;

    /* JADX INFO: renamed from: c */
    public final long f262355c;

    /* JADX INFO: renamed from: d */
    public final long f262356d;

    /* JADX INFO: renamed from: e */
    public final mke0 f262357e;

    public xke0(String str, String str2, long j, long j2, mke0 mke0Var) {
        this.f262353a = str;
        this.f262354b = str2;
        this.f262355c = j;
        this.f262356d = j2;
        this.f262357e = mke0Var;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: a */
    public final String mo26293a() {
        return this.f262353a;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: b */
    public final mke0 mo26294b() {
        return this.f262357e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xke0)) {
            return false;
        }
        xke0 xke0Var = (xke0) obj;
        return wj50.m88271j(this.f262353a, xke0Var.f262353a) && wj50.m88271j(this.f262354b, xke0Var.f262354b) && this.f262355c == xke0Var.f262355c && this.f262356d == xke0Var.f262356d && wj50.m88271j(this.f262357e, xke0Var.f262357e);
    }

    public final int hashCode() {
        return this.f262357e.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f262353a.hashCode() * 31, 31, this.f262354b), this.f262355c, 31), this.f262356d, 31);
    }
}
