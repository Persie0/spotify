package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class quq0 {

    /* JADX INFO: renamed from: a */
    public final q7z0 f192794a;

    /* JADX INFO: renamed from: b */
    public final lh90 f192795b;

    public quq0(q7z0 q7z0Var, lh90 lh90Var) {
        this.f192794a = q7z0Var;
        this.f192795b = lh90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quq0)) {
            return false;
        }
        quq0 quq0Var = (quq0) obj;
        return wj50.m88271j(this.f192794a, quq0Var.f192794a) && wj50.m88271j(this.f192795b, quq0Var.f192795b);
    }

    public final int hashCode() {
        return this.f192795b.hashCode() + (this.f192794a.hashCode() * 31);
    }
}
