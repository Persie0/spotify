package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class su0 {

    /* JADX INFO: renamed from: a */
    public final String f213967a;

    /* JADX INFO: renamed from: b */
    public final boolean f213968b;

    public su0(String str, boolean z) {
        this.f213967a = str;
        this.f213968b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return wj50.m88271j(this.f213967a, su0Var.f213967a) && this.f213968b == su0Var.f213968b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213968b) + (this.f213967a.hashCode() * 31);
    }
}
