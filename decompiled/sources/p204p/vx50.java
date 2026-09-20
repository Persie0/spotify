package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vx50 {

    /* JADX INFO: renamed from: a */
    public final boolean f245619a;

    /* JADX INFO: renamed from: b */
    public final boolean f245620b;

    /* JADX INFO: renamed from: c */
    public final wx50 f245621c;

    public vx50(boolean z, boolean z2, wx50 wx50Var) {
        this.f245619a = z;
        this.f245620b = z2;
        this.f245621c = wx50Var;
    }

    /* JADX INFO: renamed from: a */
    public final wx50 m86632a() {
        return this.f245621c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx50)) {
            return false;
        }
        vx50 vx50Var = (vx50) obj;
        return this.f245619a == vx50Var.f245619a && this.f245620b == vx50Var.f245620b && wj50.m88271j(this.f245621c, vx50Var.f245621c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f245619a) * 31, 31, this.f245620b);
        wx50 wx50Var = this.f245621c;
        return iM77245d + (wx50Var == null ? 0 : wx50Var.f255937a.hashCode());
    }
}
