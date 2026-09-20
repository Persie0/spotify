package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yqr0 implements mzs0 {

    /* JADX INFO: renamed from: a */
    public final String f275282a;

    /* JADX INFO: renamed from: b */
    public final boolean f275283b;

    /* JADX INFO: renamed from: c */
    public final qla1 f275284c;

    public yqr0(String str, boolean z, qla1 qla1Var) {
        this.f275282a = str;
        this.f275283b = z;
        this.f275284c = qla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqr0)) {
            return false;
        }
        yqr0 yqr0Var = (yqr0) obj;
        return wj50.m88271j(this.f275282a, yqr0Var.f275282a) && this.f275283b == yqr0Var.f275283b && wj50.m88271j(this.f275284c, yqr0Var.f275284c);
    }

    public final int hashCode() {
        String str = this.f275282a;
        return this.f275284c.hashCode() + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f275283b);
    }

    public /* synthetic */ yqr0(String str, qla1 qla1Var, int i) {
        this((i & 1) != 0 ? null : str, true, (i & 4) != 0 ? new qla1(127, null, null, null, null, null) : qla1Var);
    }
}
