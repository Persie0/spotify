package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zw0 {

    /* JADX INFO: renamed from: a */
    public final String f286863a;

    /* JADX INFO: renamed from: b */
    public final long f286864b;

    /* JADX INFO: renamed from: c */
    public final long f286865c;

    /* JADX INFO: renamed from: d */
    public final Long f286866d;

    /* JADX INFO: renamed from: e */
    public final boolean f286867e;

    /* JADX INFO: renamed from: f */
    public final it91 f286868f;

    public zw0(String str, long j, long j2, Long l, boolean z, it91 it91Var) {
        this.f286863a = str;
        this.f286864b = j;
        this.f286865c = j2;
        this.f286866d = l;
        this.f286867e = z;
        this.f286868f = it91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw0)) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return wj50.m88271j(this.f286863a, zw0Var.f286863a) && this.f286864b == zw0Var.f286864b && this.f286865c == zw0Var.f286865c && wj50.m88271j(this.f286866d, zw0Var.f286866d) && this.f286867e == zw0Var.f286867e && wj50.m88271j(this.f286868f, zw0Var.f286868f);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(this.f286863a.hashCode() * 31, this.f286864b, 31), this.f286865c, 31);
        Long l = this.f286866d;
        int iM77245d = s571.m77245d((iM36605e + (l == null ? 0 : l.hashCode())) * 31, 31, this.f286867e);
        it91 it91Var = this.f286868f;
        return iM77245d + (it91Var != null ? it91Var.hashCode() : 0);
    }
}
