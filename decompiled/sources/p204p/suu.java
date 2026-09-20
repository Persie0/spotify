package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class suu {

    /* JADX INFO: renamed from: a */
    public final sd40 f214218a;

    /* JADX INFO: renamed from: b */
    public final sd40 f214219b;

    public suu(sd40 sd40Var, sd40 sd40Var2) {
        this.f214218a = sd40Var;
        this.f214219b = sd40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suu)) {
            return false;
        }
        suu suuVar = (suu) obj;
        return wj50.m88271j(this.f214218a, suuVar.f214218a) && wj50.m88271j(this.f214219b, suuVar.f214219b);
    }

    public final int hashCode() {
        return this.f214219b.hashCode() + (this.f214218a.hashCode() * 31);
    }
}
