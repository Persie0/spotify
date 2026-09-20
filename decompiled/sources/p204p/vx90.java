package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vx90 {

    /* JADX INFO: renamed from: a */
    public final String f245662a;

    /* JADX INFO: renamed from: b */
    public final ul71 f245663b;

    /* JADX INFO: renamed from: c */
    public final ay90 f245664c;

    /* JADX INFO: renamed from: d */
    public final bc30 f245665d;

    /* JADX INFO: renamed from: e */
    public final bc30 f245666e;

    /* JADX INFO: renamed from: f */
    public final wx90 f245667f;

    /* JADX INFO: renamed from: g */
    public final fy90 f245668g;

    public vx90(String str, ul71 ul71Var, ay90 ay90Var, bc30 bc30Var, bc30 bc30Var2, wx90 wx90Var, fy90 fy90Var) {
        this.f245662a = str;
        this.f245663b = ul71Var;
        this.f245664c = ay90Var;
        this.f245665d = bc30Var;
        this.f245666e = bc30Var2;
        this.f245667f = wx90Var;
        this.f245668g = fy90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx90)) {
            return false;
        }
        vx90 vx90Var = (vx90) obj;
        return wj50.m88271j(this.f245662a, vx90Var.f245662a) && wj50.m88271j(this.f245663b, vx90Var.f245663b) && wj50.m88271j(this.f245664c, vx90Var.f245664c) && wj50.m88271j(this.f245665d, vx90Var.f245665d) && wj50.m88271j(this.f245666e, vx90Var.f245666e) && wj50.m88271j(this.f245667f, vx90Var.f245667f) && wj50.m88271j(this.f245668g, vx90Var.f245668g);
    }

    public final int hashCode() {
        String str = this.f245662a;
        int iHashCode = (this.f245663b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        ay90 ay90Var = this.f245664c;
        int iHashCode2 = (iHashCode + (ay90Var == null ? 0 : ay90Var.hashCode())) * 31;
        bc30 bc30Var = this.f245665d;
        int iHashCode3 = (iHashCode2 + (bc30Var == null ? 0 : bc30Var.hashCode())) * 31;
        bc30 bc30Var2 = this.f245666e;
        int iHashCode4 = (iHashCode3 + (bc30Var2 == null ? 0 : bc30Var2.hashCode())) * 31;
        wx90 wx90Var = this.f245667f;
        int iHashCode5 = (iHashCode4 + (wx90Var == null ? 0 : wx90Var.hashCode())) * 31;
        fy90 fy90Var = this.f245668g;
        return iHashCode5 + (fy90Var != null ? fy90Var.hashCode() : 0);
    }
}
