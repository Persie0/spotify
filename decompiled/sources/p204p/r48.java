package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r48 extends b58 {

    /* JADX INFO: renamed from: a */
    public final z5z f195680a;

    /* JADX INFO: renamed from: b */
    public final ggq0 f195681b;

    public r48(z5z z5zVar, ggq0 ggq0Var) {
        this.f195680a = z5zVar;
        this.f195681b = ggq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r48)) {
            return false;
        }
        r48 r48Var = (r48) obj;
        return wj50.m88271j(this.f195680a, r48Var.f195680a) && wj50.m88271j(this.f195681b, r48Var.f195681b);
    }

    public final int hashCode() {
        return this.f195681b.hashCode() + (this.f195680a.hashCode() * 31);
    }
}
