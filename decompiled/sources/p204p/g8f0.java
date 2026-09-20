package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g8f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f77474a = true;

    /* JADX INFO: renamed from: b */
    public final f5a0 f77475b;

    public g8f0(f5a0 f5a0Var) {
        this.f77475b = f5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8f0)) {
            return false;
        }
        g8f0 g8f0Var = (g8f0) obj;
        return this.f77474a == g8f0Var.f77474a && wj50.m88271j(this.f77475b, g8f0Var.f77475b);
    }

    public final int hashCode() {
        return this.f77475b.hashCode() + (Boolean.hashCode(this.f77474a) * 31);
    }
}
