package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rkc0 {

    /* JADX INFO: renamed from: a */
    public final String f200048a;

    /* JADX INFO: renamed from: b */
    public final boolean f200049b;

    /* JADX INFO: renamed from: c */
    public final st91 f200050c;

    /* JADX INFO: renamed from: d */
    public final gh00 f200051d;

    public rkc0(String str, boolean z, st91 st91Var, gh00 gh00Var) {
        this.f200048a = str;
        this.f200049b = z;
        this.f200050c = st91Var;
        this.f200051d = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkc0)) {
            return false;
        }
        rkc0 rkc0Var = (rkc0) obj;
        return wj50.m88271j(this.f200048a, rkc0Var.f200048a) && this.f200049b == rkc0Var.f200049b && wj50.m88271j(this.f200050c, rkc0Var.f200050c) && wj50.m88271j(this.f200051d, rkc0Var.f200051d);
    }

    public final int hashCode() {
        return this.f200051d.hashCode() + dq60.m36604d(s571.m77245d(this.f200048a.hashCode() * 31, 31, this.f200049b), 31, this.f200050c.f213866a);
    }
}
