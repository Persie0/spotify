package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s90 implements u90 {

    /* JADX INFO: renamed from: a */
    public final c3e1 f206811a;

    /* JADX INFO: renamed from: b */
    public final int f206812b;

    public s90(c3e1 c3e1Var, int i) {
        this.f206811a = c3e1Var;
        this.f206812b = i;
    }

    @Override // p204p.u90
    /* JADX INFO: renamed from: a */
    public final c3e1 mo77540a() {
        return this.f206811a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s90)) {
            return false;
        }
        s90 s90Var = (s90) obj;
        return wj50.m88271j(this.f206811a, s90Var.f206811a) && this.f206812b == s90Var.f206812b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f206812b) + (this.f206811a.hashCode() * 31);
    }
}
