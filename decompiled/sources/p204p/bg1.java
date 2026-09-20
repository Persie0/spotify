package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bg1 {

    /* JADX INFO: renamed from: a */
    public final uu41 f26815a;

    /* JADX INFO: renamed from: b */
    public final boolean f26816b;

    public bg1(uu41 uu41Var, boolean z) {
        this.f26815a = uu41Var;
        this.f26816b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg1)) {
            return false;
        }
        bg1 bg1Var = (bg1) obj;
        return wj50.m88271j(this.f26815a, bg1Var.f26815a) && this.f26816b == bg1Var.f26816b;
    }

    public final int hashCode() {
        uu41 uu41Var = this.f26815a;
        return Boolean.hashCode(this.f26816b) + ((uu41Var == null ? 0 : uu41Var.hashCode()) * 31);
    }
}
