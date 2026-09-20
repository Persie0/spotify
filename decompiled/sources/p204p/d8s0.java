package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d8s0 {

    /* JADX INFO: renamed from: a */
    public final int f46511a;

    /* JADX INFO: renamed from: b */
    public final String f46512b;

    /* JADX INFO: renamed from: c */
    public final String f46513c;

    /* JADX INFO: renamed from: d */
    public final int f46514d;

    /* JADX INFO: renamed from: e */
    public final int f46515e;

    /* JADX INFO: renamed from: f */
    public final boolean f46516f;

    public d8s0(int i, int i2, int i3, String str, String str2, boolean z) {
        this.f46511a = i;
        this.f46512b = str;
        this.f46513c = str2;
        this.f46514d = i2;
        this.f46515e = i3;
        this.f46516f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8s0)) {
            return false;
        }
        d8s0 d8s0Var = (d8s0) obj;
        return this.f46511a == d8s0Var.f46511a && wj50.m88271j(this.f46512b, d8s0Var.f46512b) && wj50.m88271j(this.f46513c, d8s0Var.f46513c) && this.f46514d == d8s0Var.f46514d && this.f46515e == d8s0Var.f46515e && this.f46516f == d8s0Var.f46516f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46516f) + mt60.m62800g(this.f46515e, mt60.m62800g(this.f46514d, s571.m77243b(s571.m77243b(Integer.hashCode(this.f46511a) * 31, 31, this.f46512b), 31, this.f46513c), 31), 31);
    }
}
