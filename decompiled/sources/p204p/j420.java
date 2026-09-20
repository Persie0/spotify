package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j420 {

    /* JADX INFO: renamed from: a */
    public final n420 f108554a;

    /* JADX INFO: renamed from: b */
    public final String f108555b;

    /* JADX INFO: renamed from: c */
    public final yfr f108556c;

    /* JADX INFO: renamed from: d */
    public final String f108557d;

    /* JADX INFO: renamed from: e */
    public final k420 f108558e;

    /* JADX INFO: renamed from: f */
    public final y920 f108559f;

    /* JADX INFO: renamed from: g */
    public final o420 f108560g;

    public j420(n420 n420Var, String str, yfr yfrVar, String str2, k420 k420Var, y920 y920Var, o420 o420Var) {
        this.f108554a = n420Var;
        this.f108555b = str;
        this.f108556c = yfrVar;
        this.f108557d = str2;
        this.f108558e = k420Var;
        this.f108559f = y920Var;
        this.f108560g = o420Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j420)) {
            return false;
        }
        j420 j420Var = (j420) obj;
        return wj50.m88271j(this.f108554a, j420Var.f108554a) && wj50.m88271j(this.f108555b, j420Var.f108555b) && this.f108556c == j420Var.f108556c && wj50.m88271j(this.f108557d, j420Var.f108557d) && wj50.m88271j(this.f108558e, j420Var.f108558e) && this.f108559f == j420Var.f108559f && wj50.m88271j(this.f108560g, j420Var.f108560g);
    }

    public final int hashCode() {
        int iHashCode = (this.f108559f.hashCode() + ((this.f108558e.hashCode() + s571.m77243b((this.f108556c.hashCode() + s571.m77243b(this.f108554a.hashCode() * 31, 31, this.f108555b)) * 31, 31, this.f108557d)) * 31)) * 31;
        o420 o420Var = this.f108560g;
        return iHashCode + (o420Var == null ? 0 : o420Var.hashCode());
    }
}
