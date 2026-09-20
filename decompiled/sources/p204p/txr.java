package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class txr implements tn61 {

    /* JADX INFO: renamed from: a */
    public final up60 f224746a;

    /* JADX INFO: renamed from: b */
    public final int f224747b;

    public txr(up60 up60Var) {
        this.f224746a = up60Var;
        this.f224747b = up60Var.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txr) && wj50.m88271j(this.f224746a, ((txr) obj).f224746a);
    }

    public final int hashCode() {
        return this.f224747b;
    }

    public final String toString() {
        return s571.m77251j("DistributionTraitsTable<", this.f224746a.mo29111F(), ">");
    }
}
