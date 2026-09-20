package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jt20 {

    /* JADX INFO: renamed from: a */
    public final String f115695a;

    /* JADX INFO: renamed from: b */
    public final int f115696b;

    /* JADX INFO: renamed from: c */
    public final vs20 f115697c;

    /* JADX INFO: renamed from: d */
    public final us20 f115698d;

    /* JADX INFO: renamed from: e */
    public final bt20 f115699e;

    /* JADX INFO: renamed from: f */
    public final boolean f115700f;

    public jt20(String str, int i, vs20 vs20Var, us20 us20Var, bt20 bt20Var, boolean z) {
        this.f115695a = str;
        this.f115696b = i;
        this.f115697c = vs20Var;
        this.f115698d = us20Var;
        this.f115699e = bt20Var;
        this.f115700f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt20)) {
            return false;
        }
        jt20 jt20Var = (jt20) obj;
        return wj50.m88271j(this.f115695a, jt20Var.f115695a) && this.f115696b == jt20Var.f115696b && wj50.m88271j(this.f115697c, jt20Var.f115697c) && wj50.m88271j(this.f115698d, jt20Var.f115698d) && wj50.m88271j(this.f115699e, jt20Var.f115699e) && this.f115700f == jt20Var.f115700f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115700f) + ((this.f115699e.hashCode() + s571.m77243b((this.f115697c.hashCode() + mt60.m62800g(this.f115696b, this.f115695a.hashCode() * 31, 31)) * 31, 31, this.f115698d.f233514a)) * 31);
    }
}
