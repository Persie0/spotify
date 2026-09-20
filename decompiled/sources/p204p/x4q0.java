package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x4q0 {

    /* JADX INFO: renamed from: a */
    public final iyy f258184a;

    /* JADX INFO: renamed from: b */
    public final dq31 f258185b;

    /* JADX INFO: renamed from: c */
    public final l6w f258186c;

    public x4q0(iyy iyyVar, dq31 dq31Var, l6w l6wVar) {
        this.f258184a = iyyVar;
        this.f258185b = dq31Var;
        this.f258186c = l6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4q0)) {
            return false;
        }
        x4q0 x4q0Var = (x4q0) obj;
        return this.f258184a.equals(x4q0Var.f258184a) && this.f258185b.equals(x4q0Var.f258185b) && this.f258186c.equals(x4q0Var.f258186c);
    }

    public final int hashCode() {
        return this.f258186c.hashCode() + ((this.f258185b.hashCode() + (this.f258184a.hashCode() * 31)) * 31);
    }
}
