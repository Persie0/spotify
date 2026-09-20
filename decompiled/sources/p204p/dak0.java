package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dak0 {

    /* JADX INFO: renamed from: a */
    public final aak0 f47073a;

    /* JADX INFO: renamed from: b */
    public final Integer f47074b;

    public dak0(aak0 aak0Var, Integer num) {
        this.f47073a = aak0Var;
        this.f47074b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dak0)) {
            return false;
        }
        dak0 dak0Var = (dak0) obj;
        return wj50.m88271j(this.f47073a, dak0Var.f47073a) && wj50.m88271j(this.f47074b, dak0Var.f47074b);
    }

    public final int hashCode() {
        int iHashCode = this.f47073a.hashCode() * 31;
        Integer num = this.f47074b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
