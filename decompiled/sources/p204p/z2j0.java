package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z2j0 extends b3j0 {

    /* JADX INFO: renamed from: a */
    public final z650 f278597a;

    /* JADX INFO: renamed from: b */
    public final String f278598b;

    public z2j0(String str, z650 z650Var) {
        this.f278597a = z650Var;
        this.f278598b = str;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: a */
    public final boolean mo28034a() {
        return false;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: b */
    public final String mo28035b() {
        return s571.m77251j("user_interaction(", this.f278597a.f279709a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2j0)) {
            return false;
        }
        z2j0 z2j0Var = (z2j0) obj;
        return wj50.m88271j(this.f278597a, z2j0Var.f278597a) && wj50.m88271j(this.f278598b, z2j0Var.f278598b);
    }

    public final int hashCode() {
        int iHashCode = this.f278597a.f279709a.hashCode() * 31;
        String str = this.f278598b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
