package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a21 extends k21 {

    /* JADX INFO: renamed from: a */
    public final hy0 f11549a;

    /* JADX INFO: renamed from: b */
    public final boolean f11550b;

    /* JADX INFO: renamed from: c */
    public final mrl f11551c;

    public a21(hy0 hy0Var, boolean z, mrl mrlVar) {
        this.f11549a = hy0Var;
        this.f11550b = z;
        this.f11551c = mrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a21)) {
            return false;
        }
        a21 a21Var = (a21) obj;
        return wj50.m88271j(this.f11549a, a21Var.f11549a) && this.f11550b == a21Var.f11550b && wj50.m88271j(this.f11551c, a21Var.f11551c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f11549a.hashCode() * 31, 31, this.f11550b);
        mrl mrlVar = this.f11551c;
        return iM77245d + (mrlVar == null ? 0 : mrlVar.hashCode());
    }
}
