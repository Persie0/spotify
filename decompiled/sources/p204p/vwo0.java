package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vwo0 {

    /* JADX INFO: renamed from: a */
    public final uwo0 f245518a;

    /* JADX INFO: renamed from: b */
    public final Object f245519b;

    public vwo0(uwo0 uwo0Var, Object obj) {
        this.f245518a = uwo0Var;
        this.f245519b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwo0)) {
            return false;
        }
        vwo0 vwo0Var = (vwo0) obj;
        return this.f245518a == vwo0Var.f245518a && wj50.m88271j(this.f245519b, vwo0Var.f245519b);
    }

    public final int hashCode() {
        int iHashCode = this.f245518a.hashCode() * 31;
        Object obj = this.f245519b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
