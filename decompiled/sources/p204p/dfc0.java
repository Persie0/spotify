package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dfc0 implements ffc0 {

    /* JADX INFO: renamed from: a */
    public final sec0 f48566a;

    /* JADX INFO: renamed from: b */
    public final sec0 f48567b;

    /* JADX INFO: renamed from: c */
    public final iqg1 f48568c;

    /* JADX INFO: renamed from: d */
    public final boolean f48569d;

    /* JADX INFO: renamed from: e */
    public final long f48570e;

    /* JADX INFO: renamed from: f */
    public final boolean f48571f;

    /* JADX INFO: renamed from: g */
    public final long f48572g;

    /* JADX INFO: renamed from: h */
    public final Integer f48573h;

    /* JADX INFO: renamed from: i */
    public final Integer f48574i;

    /* JADX INFO: renamed from: j */
    public final gu5 f48575j;

    public dfc0(sec0 sec0Var, sec0 sec0Var2, iqg1 iqg1Var, boolean z, long j, boolean z2, long j2, Integer num, Integer num2, gu5 gu5Var) {
        this.f48566a = sec0Var;
        this.f48567b = sec0Var2;
        this.f48568c = iqg1Var;
        this.f48569d = z;
        this.f48570e = j;
        this.f48571f = z2;
        this.f48572g = j2;
        this.f48573h = num;
        this.f48574i = num2;
        this.f48575j = gu5Var;
    }

    @Override // p204p.ffc0
    /* JADX INFO: renamed from: a */
    public final long mo35879a() {
        return this.f48570e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfc0)) {
            return false;
        }
        dfc0 dfc0Var = (dfc0) obj;
        if (!this.f48566a.equals(dfc0Var.f48566a) || !this.f48567b.equals(dfc0Var.f48567b) || !this.f48568c.equals(dfc0Var.f48568c) || this.f48569d != dfc0Var.f48569d) {
            return false;
        }
        long j = dfc0Var.f48570e;
        int i = n6f.f150872l;
        return as91.m27074b(this.f48570e, j) && this.f48571f == dfc0Var.f48571f && as91.m27074b(this.f48572g, dfc0Var.f48572g) && wj50.m88271j(this.f48573h, dfc0Var.f48573h) && wj50.m88271j(this.f48574i, dfc0Var.f48574i) && wj50.m88271j(this.f48575j, dfc0Var.f48575j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f48568c.hashCode() + ((this.f48567b.hashCode() + (this.f48566a.hashCode() * 31)) * 31)) * 31, 31, this.f48569d);
        int i = n6f.f150872l;
        int iM36605e = dq60.m36605e(s571.m77245d(dq60.m36605e(iM77245d, this.f48570e, 31), 31, this.f48571f), this.f48572g, 31);
        Integer num = this.f48573h;
        int iHashCode = (iM36605e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f48574i;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        gu5 gu5Var = this.f48575j;
        return iHashCode2 + (gu5Var != null ? gu5Var.hashCode() : 0);
    }
}
