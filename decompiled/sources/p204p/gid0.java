package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gid0 implements iid0 {

    /* JADX INFO: renamed from: a */
    public final wxd0 f80143a;

    /* JADX INFO: renamed from: b */
    public final int f80144b;

    public gid0(wxd0 wxd0Var, int i) {
        this.f80143a = wxd0Var;
        this.f80144b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gid0)) {
            return false;
        }
        gid0 gid0Var = (gid0) obj;
        return this.f80143a == gid0Var.f80143a && this.f80144b == gid0Var.f80144b;
    }

    public final int hashCode() {
        return Integer.hashCode(200) + mt60.m62800g(this.f80144b, this.f80143a.hashCode() * 31, 31);
    }
}
