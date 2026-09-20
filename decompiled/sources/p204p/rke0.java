package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rke0 extends yke0 {

    /* JADX INFO: renamed from: a */
    public final String f200058a;

    /* JADX INFO: renamed from: b */
    public final String f200059b;

    /* JADX INFO: renamed from: c */
    public final long f200060c;

    /* JADX INFO: renamed from: d */
    public final long f200061d;

    /* JADX INFO: renamed from: e */
    public final mke0 f200062e;

    public rke0(String str, String str2, long j, long j2, mke0 mke0Var) {
        this.f200058a = str;
        this.f200059b = str2;
        this.f200060c = j;
        this.f200061d = j2;
        this.f200062e = mke0Var;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: a */
    public final String mo26293a() {
        return this.f200058a;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: b */
    public final mke0 mo26294b() {
        return this.f200062e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rke0)) {
            return false;
        }
        rke0 rke0Var = (rke0) obj;
        return wj50.m88271j(this.f200058a, rke0Var.f200058a) && wj50.m88271j(this.f200059b, rke0Var.f200059b) && this.f200060c == rke0Var.f200060c && this.f200061d == rke0Var.f200061d && wj50.m88271j(this.f200062e, rke0Var.f200062e);
    }

    public final int hashCode() {
        return this.f200062e.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f200058a.hashCode() * 31, 31, this.f200059b), this.f200060c, 31), this.f200061d, 31);
    }
}
