package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class agc1 implements dgc1 {

    /* JADX INFO: renamed from: a */
    public final String f15343a;

    /* JADX INFO: renamed from: b */
    public final z650 f15344b;

    public agc1(String str, z650 z650Var) {
        this.f15343a = str;
        this.f15344b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agc1)) {
            return false;
        }
        agc1 agc1Var = (agc1) obj;
        return wj50.m88271j(this.f15343a, agc1Var.f15343a) && wj50.m88271j(this.f15344b, agc1Var.f15344b);
    }

    public final int hashCode() {
        return this.f15344b.f279709a.hashCode() + (this.f15343a.hashCode() * 31);
    }
}
