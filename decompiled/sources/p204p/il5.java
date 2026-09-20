package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class il5 {

    /* JADX INFO: renamed from: a */
    public final String f103288a;

    /* JADX INFO: renamed from: b */
    public final String f103289b;

    public il5(String str, String str2) {
        this.f103288a = str;
        this.f103289b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il5)) {
            return false;
        }
        il5 il5Var = (il5) obj;
        return wj50.m88271j(this.f103288a, il5Var.f103288a) && wj50.m88271j(this.f103289b, il5Var.f103289b);
    }

    public final int hashCode() {
        int iHashCode = this.f103288a.hashCode() * 31;
        String str = this.f103289b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
