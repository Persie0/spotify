package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z3q0 extends c4q0 {

    /* JADX INFO: renamed from: a */
    public final String f279010a;

    /* JADX INFO: renamed from: b */
    public final String f279011b;

    public z3q0(String str, String str2) {
        this.f279010a = str;
        this.f279011b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3q0)) {
            return false;
        }
        z3q0 z3q0Var = (z3q0) obj;
        return wj50.m88271j(this.f279010a, z3q0Var.f279010a) && wj50.m88271j(this.f279011b, z3q0Var.f279011b);
    }

    public final int hashCode() {
        return this.f279011b.hashCode() + (this.f279010a.hashCode() * 31);
    }
}
