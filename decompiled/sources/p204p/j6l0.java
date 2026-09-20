package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j6l0 {

    /* JADX INFO: renamed from: a */
    public final ctj f109348a;

    /* JADX INFO: renamed from: b */
    public final pv00 f109349b;

    /* JADX INFO: renamed from: c */
    public final bso0 f109350c;

    /* JADX INFO: renamed from: d */
    public final String f109351d;

    /* JADX INFO: renamed from: e */
    public final z5l0 f109352e;

    /* JADX INFO: renamed from: f */
    public final boolean f109353f;

    /* JADX INFO: renamed from: g */
    public final boolean f109354g;

    public j6l0(ctj ctjVar, pv00 pv00Var, bso0 bso0Var, String str, z5l0 z5l0Var, boolean z, boolean z2) {
        this.f109348a = ctjVar;
        this.f109349b = pv00Var;
        this.f109350c = bso0Var;
        this.f109351d = str;
        this.f109352e = z5l0Var;
        this.f109353f = z;
        this.f109354g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6l0)) {
            return false;
        }
        j6l0 j6l0Var = (j6l0) obj;
        return wj50.m88271j(this.f109348a, j6l0Var.f109348a) && wj50.m88271j(this.f109349b, j6l0Var.f109349b) && this.f109350c == j6l0Var.f109350c && wj50.m88271j(this.f109351d, j6l0Var.f109351d) && wj50.m88271j(this.f109352e, j6l0Var.f109352e) && this.f109353f == j6l0Var.f109353f && this.f109354g == j6l0Var.f109354g;
    }

    public final int hashCode() {
        int iHashCode = (this.f109350c.hashCode() + ((this.f109349b.hashCode() + (this.f109348a.hashCode() * 31)) * 31)) * 31;
        String str = this.f109351d;
        return Boolean.hashCode(this.f109354g) + s571.m77245d((this.f109352e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f109353f);
    }
}
