package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v7k0 {

    /* JADX INFO: renamed from: a */
    public final dut f238275a;

    /* JADX INFO: renamed from: b */
    public final Object f238276b;

    public v7k0(Object obj, dut dutVar) {
        this.f238275a = dutVar;
        this.f238276b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7k0)) {
            return false;
        }
        v7k0 v7k0Var = (v7k0) obj;
        return wj50.m88271j(this.f238275a, v7k0Var.f238275a) && wj50.m88271j(this.f238276b, v7k0Var.f238276b);
    }

    public final int hashCode() {
        int iHashCode = this.f238275a.hashCode() * 31;
        Object obj = this.f238276b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
