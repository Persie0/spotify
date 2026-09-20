package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vkc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f242203a;

    /* JADX INFO: renamed from: b */
    public final boolean f242204b;

    /* JADX INFO: renamed from: c */
    public final String f242205c;

    /* JADX INFO: renamed from: d */
    public final boolean f242206d;

    /* JADX INFO: renamed from: e */
    public final boolean f242207e;

    public vkc1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f242203a = z;
        this.f242204b = z2;
        this.f242205c = str;
        this.f242206d = z3;
        this.f242207e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkc1)) {
            return false;
        }
        vkc1 vkc1Var = (vkc1) obj;
        return this.f242203a == vkc1Var.f242203a && this.f242204b == vkc1Var.f242204b && wj50.m88271j(this.f242205c, vkc1Var.f242205c) && this.f242206d == vkc1Var.f242206d && this.f242207e == vkc1Var.f242207e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242207e) + s571.m77245d(s571.m77243b(s571.m77245d(Boolean.hashCode(this.f242203a) * 31, 31, this.f242204b), 31, this.f242205c), 31, this.f242206d);
    }
}
