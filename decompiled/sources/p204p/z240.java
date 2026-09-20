package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z240 {

    /* JADX INFO: renamed from: a */
    public final rfz f278475a;

    /* JADX INFO: renamed from: b */
    public final a340 f278476b;

    public z240(rfz rfzVar, a340 a340Var) {
        this.f278475a = rfzVar;
        this.f278476b = a340Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z240)) {
            return false;
        }
        z240 z240Var = (z240) obj;
        return wj50.m88271j(this.f278475a, z240Var.f278475a) && this.f278476b == z240Var.f278476b;
    }

    public final int hashCode() {
        return this.f278476b.hashCode() + (this.f278475a.f198763a.hashCode() * 31);
    }
}
