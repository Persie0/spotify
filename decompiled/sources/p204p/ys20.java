package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ys20 implements bt20 {

    /* JADX INFO: renamed from: a */
    public final String f275645a;

    /* JADX INFO: renamed from: b */
    public final pt20 f275646b;

    /* JADX INFO: renamed from: c */
    public final ts20 f275647c;

    public ys20(String str, pt20 pt20Var, ts20 ts20Var) {
        this.f275645a = str;
        this.f275646b = pt20Var;
        this.f275647c = ts20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys20)) {
            return false;
        }
        ys20 ys20Var = (ys20) obj;
        return wj50.m88271j(this.f275645a, ys20Var.f275645a) && wj50.m88271j(this.f275646b, ys20Var.f275646b) && wj50.m88271j(this.f275647c, ys20Var.f275647c);
    }

    public final int hashCode() {
        return this.f275647c.hashCode() + ((this.f275646b.hashCode() + (this.f275645a.hashCode() * 31)) * 31);
    }
}
