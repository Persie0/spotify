package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vx91 {

    /* JADX INFO: renamed from: a */
    public final boolean f245669a;

    /* JADX INFO: renamed from: b */
    public final boolean f245670b;

    /* JADX INFO: renamed from: c */
    public final boolean f245671c;

    public vx91(boolean z, boolean z2, boolean z3) {
        this.f245669a = z;
        this.f245670b = z2;
        this.f245671c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx91)) {
            return false;
        }
        vx91 vx91Var = (vx91) obj;
        return this.f245669a == vx91Var.f245669a && this.f245670b == vx91Var.f245670b && this.f245671c == vx91Var.f245671c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245671c) + s571.m77245d(Boolean.hashCode(this.f245669a) * 31, 31, this.f245670b);
    }
}
