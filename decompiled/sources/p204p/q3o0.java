package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q3o0 {

    /* JADX INFO: renamed from: a */
    public final p4e1 f184903a;

    /* JADX INFO: renamed from: b */
    public final String f184904b;

    /* JADX INFO: renamed from: c */
    public final Boolean f184905c;

    /* JADX INFO: renamed from: d */
    public final int f184906d;

    /* JADX INFO: renamed from: e */
    public final int f184907e;

    public q3o0(p4e1 p4e1Var, String str, Boolean bool, int i, int i2) {
        this.f184903a = p4e1Var;
        this.f184904b = str;
        this.f184905c = bool;
        this.f184906d = i;
        this.f184907e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3o0)) {
            return false;
        }
        q3o0 q3o0Var = (q3o0) obj;
        return wj50.m88271j(this.f184903a, q3o0Var.f184903a) && wj50.m88271j(this.f184904b, q3o0Var.f184904b) && wj50.m88271j(this.f184905c, q3o0Var.f184905c) && this.f184906d == q3o0Var.f184906d && this.f184907e == q3o0Var.f184907e;
    }

    public final int hashCode() {
        int iHashCode = this.f184903a.hashCode() * 31;
        String str = this.f184904b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f184905c;
        return Integer.hashCode(this.f184907e) + mt60.m62800g(this.f184906d, (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }
}
