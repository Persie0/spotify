package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fc71 {

    /* JADX INFO: renamed from: a */
    public final elt0 f68022a;

    /* JADX INFO: renamed from: b */
    public final boolean f68023b;

    /* JADX INFO: renamed from: c */
    public final eh00 f68024c;

    public fc71(elt0 elt0Var, boolean z, eh00 eh00Var) {
        this.f68022a = elt0Var;
        this.f68023b = z;
        this.f68024c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc71)) {
            return false;
        }
        fc71 fc71Var = (fc71) obj;
        return wj50.m88271j(this.f68022a, fc71Var.f68022a) && this.f68023b == fc71Var.f68023b && wj50.m88271j(this.f68024c, fc71Var.f68024c);
    }

    public final int hashCode() {
        return this.f68024c.hashCode() + s571.m77245d(this.f68022a.f60752a.hashCode() * 31, 31, this.f68023b);
    }
}
