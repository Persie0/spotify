package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class oy1 {

    /* JADX INFO: renamed from: a */
    public final py1 f171634a;

    /* JADX INFO: renamed from: b */
    public final int f171635b;

    /* JADX INFO: renamed from: c */
    public final wwu f171636c;

    /* JADX INFO: renamed from: d */
    public final wy1 f171637d;

    /* JADX INFO: renamed from: e */
    public final ny1 f171638e;

    public oy1(py1 py1Var, int i, wwu wwuVar, wy1 wy1Var, ny1 ny1Var) {
        this.f171634a = py1Var;
        this.f171635b = i;
        this.f171636c = wwuVar;
        this.f171637d = wy1Var;
        this.f171638e = ny1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy1)) {
            return false;
        }
        oy1 oy1Var = (oy1) obj;
        return this.f171634a == oy1Var.f171634a && this.f171635b == oy1Var.f171635b && wj50.m88271j(this.f171636c, oy1Var.f171636c) && wj50.m88271j(this.f171637d, oy1Var.f171637d) && wj50.m88271j(this.f171638e, oy1Var.f171638e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f171635b, this.f171634a.hashCode() * 31, 31);
        wwu wwuVar = this.f171636c;
        return this.f171638e.hashCode() + ((this.f171637d.hashCode() + ((iM62800g + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ oy1(py1 py1Var, int i, wwu wwuVar, ny1 ny1Var, int i2) {
        wy1 wy1Var;
        wwu wwuVar2 = (i2 & 4) != 0 ? null : wwuVar;
        if ((i2 & 8) != 0) {
            wy1Var = vy1.f245889a;
        } else {
            wy1Var = uy1.f235083a;
        }
        this(py1Var, i, wwuVar2, wy1Var, ny1Var);
    }
}
