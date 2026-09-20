package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c69 {

    /* JADX INFO: renamed from: a */
    public final String f34428a;

    /* JADX INFO: renamed from: b */
    public final long f34429b;

    /* JADX INFO: renamed from: c */
    public final Long f34430c;

    /* JADX INFO: renamed from: d */
    public final long f34431d;

    /* JADX INFO: renamed from: e */
    public final long f34432e;

    /* JADX INFO: renamed from: f */
    public final String f34433f;

    /* JADX INFO: renamed from: g */
    public final String f34434g;

    public c69(String str, long j, Long l, long j2, long j3, String str2, String str3) {
        this.f34428a = str;
        this.f34429b = j;
        this.f34430c = l;
        this.f34431d = j2;
        this.f34432e = j3;
        this.f34433f = str2;
        this.f34434g = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m31541a() {
        return this.f34434g;
    }

    /* JADX INFO: renamed from: b */
    public final long m31542b() {
        return this.f34429b;
    }

    /* JADX INFO: renamed from: c */
    public final long m31543c() {
        return this.f34432e;
    }

    /* JADX INFO: renamed from: d */
    public final String m31544d() {
        return this.f34428a;
    }

    /* JADX INFO: renamed from: e */
    public final long m31545e() {
        return this.f34431d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c69)) {
            return false;
        }
        c69 c69Var = (c69) obj;
        return wj50.m88271j(this.f34428a, c69Var.f34428a) && this.f34429b == c69Var.f34429b && wj50.m88271j(this.f34430c, c69Var.f34430c) && this.f34431d == c69Var.f34431d && this.f34432e == c69Var.f34432e && wj50.m88271j(this.f34433f, c69Var.f34433f) && wj50.m88271j(this.f34434g, c69Var.f34434g);
    }

    /* JADX INFO: renamed from: f */
    public final Long m31546f() {
        return this.f34430c;
    }

    /* JADX INFO: renamed from: g */
    public final String m31547g() {
        return this.f34433f;
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(this.f34428a.hashCode() * 31, this.f34429b, 31);
        Long l = this.f34430c;
        return this.f34434g.hashCode() + s571.m77243b(dq60.m36605e(dq60.m36605e((iM36605e + (l == null ? 0 : l.hashCode())) * 31, this.f34431d, 31), this.f34432e, 31), 31, this.f34433f);
    }
}
