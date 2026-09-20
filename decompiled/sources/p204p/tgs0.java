package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f220245a;

    /* JADX INFO: renamed from: b */
    public final long f220246b;

    /* JADX INFO: renamed from: c */
    public final long f220247c;

    /* JADX INFO: renamed from: d */
    public final long f220248d;

    /* JADX INFO: renamed from: e */
    public final boolean f220249e;

    public tgs0(String str, long j, long j2, long j3, boolean z) {
        this.f220245a = str;
        this.f220246b = j;
        this.f220247c = j2;
        this.f220248d = j3;
        this.f220249e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgs0)) {
            return false;
        }
        tgs0 tgs0Var = (tgs0) obj;
        return wj50.m88271j(this.f220245a, tgs0Var.f220245a) && this.f220246b == tgs0Var.f220246b && this.f220247c == tgs0Var.f220247c && this.f220248d == tgs0Var.f220248d && this.f220249e == tgs0Var.f220249e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220249e) + dq60.m36605e(dq60.m36605e(dq60.m36605e(this.f220245a.hashCode() * 31, this.f220246b, 31), this.f220247c, 31), this.f220248d, 31);
    }
}
