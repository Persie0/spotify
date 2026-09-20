package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i8e0 {

    /* JADX INFO: renamed from: a */
    public final qla1 f99764a;

    /* JADX INFO: renamed from: b */
    public final int f99765b;

    /* JADX INFO: renamed from: c */
    public final boolean f99766c;

    /* JADX INFO: renamed from: d */
    public final int f99767d;

    /* JADX INFO: renamed from: e */
    public final f8e0 f99768e;

    /* JADX INFO: renamed from: f */
    public final lnn0 f99769f;

    public i8e0(qla1 qla1Var, int i, boolean z, int i2, f8e0 f8e0Var, lnn0 lnn0Var) {
        this.f99764a = qla1Var;
        this.f99765b = i;
        this.f99766c = z;
        this.f99767d = i2;
        this.f99768e = f8e0Var;
        this.f99769f = lnn0Var;
    }

    /* JADX INFO: renamed from: a */
    public final qla1 m49945a() {
        return this.f99764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8e0)) {
            return false;
        }
        i8e0 i8e0Var = (i8e0) obj;
        return wj50.m88271j(this.f99764a, i8e0Var.f99764a) && this.f99765b == i8e0Var.f99765b && this.f99766c == i8e0Var.f99766c && this.f99767d == i8e0Var.f99767d && this.f99768e == i8e0Var.f99768e && this.f99769f == i8e0Var.f99769f;
    }

    public final int hashCode() {
        return this.f99769f.hashCode() + ((this.f99768e.hashCode() + mt60.m62800g(this.f99767d, s571.m77245d(mt60.m62800g(this.f99765b, this.f99764a.hashCode() * 31, 31), 31, this.f99766c), 31)) * 31);
    }
}
