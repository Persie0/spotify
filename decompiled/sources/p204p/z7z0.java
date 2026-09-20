package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z7z0 {

    /* JADX INFO: renamed from: a */
    public final String f280301a;

    /* JADX INFO: renamed from: b */
    public final boolean f280302b;

    public z7z0(String str, boolean z) {
        this.f280301a = str;
        this.f280302b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7z0)) {
            return false;
        }
        z7z0 z7z0Var = (z7z0) obj;
        return wj50.m88271j(this.f280301a, z7z0Var.f280301a) && this.f280302b == z7z0Var.f280302b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280302b) + (this.f280301a.hashCode() * 31);
    }
}
