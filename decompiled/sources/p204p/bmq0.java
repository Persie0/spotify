package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bmq0 {

    /* JADX INFO: renamed from: a */
    public final s920 f28596a;

    /* JADX INFO: renamed from: b */
    public final int f28597b;

    /* JADX INFO: renamed from: c */
    public final boolean f28598c;

    public bmq0(s920 s920Var, int i, boolean z) {
        this.f28596a = s920Var;
        this.f28597b = i;
        this.f28598c = z;
    }

    /* JADX INFO: renamed from: a */
    public static bmq0 m29885a(bmq0 bmq0Var, boolean z) {
        s920 s920Var = bmq0Var.f28596a;
        int i = bmq0Var.f28597b;
        bmq0Var.getClass();
        return new bmq0(s920Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmq0)) {
            return false;
        }
        bmq0 bmq0Var = (bmq0) obj;
        return wj50.m88271j(this.f28596a, bmq0Var.f28596a) && this.f28597b == bmq0Var.f28597b && this.f28598c == bmq0Var.f28598c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28598c) + mt60.m62800g(this.f28597b, this.f28596a.hashCode() * 31, 31);
    }
}
