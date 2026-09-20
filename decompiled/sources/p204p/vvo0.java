package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f245259a;

    /* JADX INFO: renamed from: b */
    public final awo0 f245260b;

    /* JADX INFO: renamed from: c */
    public final boolean f245261c;

    public vvo0(String str, awo0 awo0Var, boolean z) {
        this.f245259a = str;
        this.f245260b = awo0Var;
        this.f245261c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvo0)) {
            return false;
        }
        vvo0 vvo0Var = (vvo0) obj;
        return wj50.m88271j(this.f245259a, vvo0Var.f245259a) && this.f245260b == vvo0Var.f245260b && this.f245261c == vvo0Var.f245261c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245261c) + ((this.f245260b.hashCode() + (this.f245259a.hashCode() * 31)) * 31);
    }
}
