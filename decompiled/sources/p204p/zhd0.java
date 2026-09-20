package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zhd0 {

    /* JADX INFO: renamed from: a */
    public final vsd0 f282883a;

    /* JADX INFO: renamed from: b */
    public final long f282884b;

    /* JADX INFO: renamed from: c */
    public final long f282885c;

    /* JADX INFO: renamed from: d */
    public final long f282886d;

    /* JADX INFO: renamed from: e */
    public final long f282887e;

    /* JADX INFO: renamed from: f */
    public final boolean f282888f;

    /* JADX INFO: renamed from: g */
    public final boolean f282889g;

    /* JADX INFO: renamed from: h */
    public final boolean f282890h;

    /* JADX INFO: renamed from: i */
    public final boolean f282891i;

    public zhd0(vsd0 vsd0Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        c95.m31843i(!z4 || z2);
        c95.m31843i(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        c95.m31843i(z5);
        this.f282883a = vsd0Var;
        this.f282884b = j;
        this.f282885c = j2;
        this.f282886d = j3;
        this.f282887e = j4;
        this.f282888f = z;
        this.f282889g = z2;
        this.f282890h = z3;
        this.f282891i = z4;
    }

    /* JADX INFO: renamed from: a */
    public final zhd0 m96124a(long j) {
        if (j == this.f282886d) {
            return this;
        }
        return new zhd0(this.f282883a, this.f282884b, this.f282885c, j, this.f282887e, this.f282888f, this.f282889g, this.f282890h, this.f282891i);
    }

    /* JADX INFO: renamed from: b */
    public final zhd0 m96125b(long j, long j2) {
        if (j == this.f282884b && j2 == this.f282885c) {
            return this;
        }
        return new zhd0(this.f282883a, j, j2, this.f282886d, this.f282887e, this.f282888f, this.f282889g, this.f282890h, this.f282891i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zhd0.class == obj.getClass()) {
            zhd0 zhd0Var = (zhd0) obj;
            if (this.f282884b == zhd0Var.f282884b && this.f282886d == zhd0Var.f282886d && this.f282887e == zhd0Var.f282887e && this.f282888f == zhd0Var.f282888f && this.f282889g == zhd0Var.f282889g && this.f282890h == zhd0Var.f282890h && this.f282891i == zhd0Var.f282891i && Objects.equals(this.f282883a, zhd0Var.f282883a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f282883a.hashCode() + 527) * 31) + ((int) this.f282884b)) * 31) + ((int) this.f282886d)) * 31) + ((int) this.f282887e)) * 31) + (this.f282888f ? 1 : 0)) * 31) + (this.f282889g ? 1 : 0)) * 31) + (this.f282890h ? 1 : 0)) * 31) + (this.f282891i ? 1 : 0);
    }
}
