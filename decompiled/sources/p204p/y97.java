package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y97 {

    /* JADX INFO: renamed from: a */
    public final ag1 f270521a;

    /* JADX INFO: renamed from: b */
    public final String f270522b;

    public y97(ag1 ag1Var, String str) {
        this.f270521a = ag1Var;
        this.f270522b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97Var = (y97) obj;
        return this.f270521a == y97Var.f270521a && wj50.m88271j(this.f270522b, y97Var.f270522b);
    }

    public final int hashCode() {
        return this.f270522b.hashCode() + (this.f270521a.hashCode() * 31);
    }
}
