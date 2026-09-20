package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vk71 {

    /* JADX INFO: renamed from: a */
    public final String f242161a;

    /* JADX INFO: renamed from: b */
    public final boolean f242162b;

    public vk71(String str, boolean z) {
        this.f242161a = str;
        this.f242162b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk71)) {
            return false;
        }
        vk71 vk71Var = (vk71) obj;
        return wj50.m88271j(this.f242161a, vk71Var.f242161a) && this.f242162b == vk71Var.f242162b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242162b) + (this.f242161a.hashCode() * 31);
    }
}
