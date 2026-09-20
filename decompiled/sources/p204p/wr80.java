package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wr80 implements ds80 {

    /* JADX INFO: renamed from: a */
    public final bs80 f254292a;

    /* JADX INFO: renamed from: b */
    public final sp80 f254293b;

    public wr80(bs80 bs80Var, sp80 sp80Var) {
        this.f254292a = bs80Var;
        this.f254293b = sp80Var;
    }

    @Override // p204p.ds80
    /* JADX INFO: renamed from: a */
    public final bs80 mo33758a() {
        return this.f254292a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr80)) {
            return false;
        }
        wr80 wr80Var = (wr80) obj;
        return wj50.m88271j(this.f254292a, wr80Var.f254292a) && wj50.m88271j(this.f254293b, wr80Var.f254293b);
    }

    public final int hashCode() {
        return this.f254293b.hashCode() + (this.f254292a.hashCode() * 31);
    }
}
