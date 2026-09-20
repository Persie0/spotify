package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r9x0 {

    /* JADX INFO: renamed from: a */
    public final String f197135a;

    /* JADX INFO: renamed from: b */
    public final long f197136b;

    /* JADX INFO: renamed from: c */
    public final long f197137c;

    /* JADX INFO: renamed from: d */
    public final jda1 f197138d;

    public r9x0(String str, long j, long j2, jda1 jda1Var) {
        this.f197135a = str;
        this.f197136b = j;
        this.f197137c = j2;
        this.f197138d = jda1Var;
    }

    /* JADX INFO: renamed from: a */
    public static r9x0 m75089a(r9x0 r9x0Var, jda1 jda1Var) {
        String str = r9x0Var.f197135a;
        long j = r9x0Var.f197136b;
        long j2 = r9x0Var.f197137c;
        r9x0Var.getClass();
        return new r9x0(str, j, j2, jda1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9x0)) {
            return false;
        }
        r9x0 r9x0Var = (r9x0) obj;
        return wj50.m88271j(this.f197135a, r9x0Var.f197135a) && this.f197136b == r9x0Var.f197136b && this.f197137c == r9x0Var.f197137c && wj50.m88271j(this.f197138d, r9x0Var.f197138d);
    }

    public final int hashCode() {
        return this.f197138d.hashCode() + dq60.m36605e(dq60.m36605e(this.f197135a.hashCode() * 31, this.f197136b, 31), this.f197137c, 31);
    }
}
