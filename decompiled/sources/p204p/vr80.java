package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vr80 implements ds80 {

    /* JADX INFO: renamed from: a */
    public final bs80 f244107a;

    /* JADX INFO: renamed from: b */
    public final sp80 f244108b;

    public vr80(bs80 bs80Var, sp80 sp80Var) {
        this.f244107a = bs80Var;
        this.f244108b = sp80Var;
    }

    @Override // p204p.ds80
    /* JADX INFO: renamed from: a */
    public final bs80 mo33758a() {
        return this.f244107a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr80)) {
            return false;
        }
        vr80 vr80Var = (vr80) obj;
        return wj50.m88271j(this.f244107a, vr80Var.f244107a) && wj50.m88271j(this.f244108b, vr80Var.f244108b);
    }

    public final int hashCode() {
        return this.f244108b.hashCode() + (this.f244107a.hashCode() * 31);
    }
}
