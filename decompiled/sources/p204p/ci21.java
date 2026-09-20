package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ci21 {

    /* JADX INFO: renamed from: c */
    public static final ci21 f38193c;

    /* JADX INFO: renamed from: a */
    public final tjr f38194a;

    /* JADX INFO: renamed from: b */
    public final tjr f38195b;

    static {
        pjr pjrVar = pjr.f178301a;
        f38193c = new ci21(pjrVar, pjrVar);
    }

    public ci21(tjr tjrVar, tjr tjrVar2) {
        this.f38194a = tjrVar;
        this.f38195b = tjrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci21)) {
            return false;
        }
        ci21 ci21Var = (ci21) obj;
        return wj50.m88271j(this.f38194a, ci21Var.f38194a) && wj50.m88271j(this.f38195b, ci21Var.f38195b);
    }

    public final int hashCode() {
        return this.f38195b.hashCode() + (this.f38194a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f38194a + ", height=" + this.f38195b + ')';
    }
}
