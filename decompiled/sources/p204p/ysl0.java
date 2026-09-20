package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ysl0 extends ktl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f275812a;

    /* JADX INFO: renamed from: b */
    public final String f275813b;

    public ysl0(zo20 zo20Var, String str) {
        this.f275812a = zo20Var;
        this.f275813b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysl0)) {
            return false;
        }
        ysl0 ysl0Var = (ysl0) obj;
        return wj50.m88271j(this.f275812a, ysl0Var.f275812a) && wj50.m88271j(this.f275813b, ysl0Var.f275813b);
    }

    public final int hashCode() {
        return this.f275813b.hashCode() + (this.f275812a.hashCode() * 31);
    }
}
