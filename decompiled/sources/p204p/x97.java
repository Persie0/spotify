package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x97 {

    /* JADX INFO: renamed from: a */
    public final ag1 f259285a;

    /* JADX INFO: renamed from: b */
    public final String f259286b;

    public x97(ag1 ag1Var, String str) {
        this.f259285a = ag1Var;
        this.f259286b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x97)) {
            return false;
        }
        x97 x97Var = (x97) obj;
        return this.f259285a == x97Var.f259285a && wj50.m88271j(this.f259286b, x97Var.f259286b);
    }

    public final int hashCode() {
        return this.f259286b.hashCode() + (this.f259285a.hashCode() * 31);
    }
}
