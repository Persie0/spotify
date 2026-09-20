package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zle1 {

    /* JADX INFO: renamed from: a */
    public final String f283997a;

    /* JADX INFO: renamed from: b */
    public final boolean f283998b;

    public zle1(String str, boolean z) {
        this.f283997a = str;
        this.f283998b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zle1)) {
            return false;
        }
        zle1 zle1Var = (zle1) obj;
        return wj50.m88271j(this.f283997a, zle1Var.f283997a) && this.f283998b == zle1Var.f283998b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283998b) + (this.f283997a.hashCode() * 31);
    }
}
