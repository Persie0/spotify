package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cp8 {

    /* JADX INFO: renamed from: a */
    public final g800 f40489a;

    /* JADX INFO: renamed from: b */
    public final h600 f40490b;

    public cp8(g800 g800Var, h600 h600Var) {
        this.f40489a = g800Var;
        this.f40490b = h600Var;
    }

    /* JADX INFO: renamed from: a */
    public final h600 m33546a() {
        return this.f40490b;
    }

    /* JADX INFO: renamed from: b */
    public final g800 m33547b() {
        return this.f40489a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp8)) {
            return false;
        }
        cp8 cp8Var = (cp8) obj;
        return wj50.m88271j(this.f40489a, cp8Var.f40489a) && wj50.m88271j(this.f40490b, cp8Var.f40490b);
    }

    public final int hashCode() {
        return this.f40490b.hashCode() + (this.f40489a.hashCode() * 31);
    }
}
