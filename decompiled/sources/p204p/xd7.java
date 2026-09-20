package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xd7 {

    /* JADX INFO: renamed from: a */
    public final boolean f260398a;

    /* JADX INFO: renamed from: b */
    public final String f260399b;

    public xd7(boolean z, String str) {
        this.f260398a = z;
        this.f260399b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd7)) {
            return false;
        }
        xd7 xd7Var = (xd7) obj;
        return this.f260398a == xd7Var.f260398a && wj50.m88271j(this.f260399b, xd7Var.f260399b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f260398a) * 31;
        String str = this.f260399b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
