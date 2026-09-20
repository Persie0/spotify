package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z20 {

    /* JADX INFO: renamed from: a */
    public final String f278453a;

    /* JADX INFO: renamed from: b */
    public final qf40 f278454b;

    public z20(String str, qf40 qf40Var) {
        this.f278453a = str;
        this.f278454b = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m95171a() {
        return this.f278453a;
    }

    /* JADX INFO: renamed from: b */
    public final qf40 m95172b() {
        return this.f278454b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj;
        return wj50.m88271j(this.f278453a, z20Var.f278453a) && wj50.m88271j(this.f278454b, z20Var.f278454b);
    }

    public final int hashCode() {
        return this.f278454b.hashCode() + (this.f278453a.hashCode() * 31);
    }
}
