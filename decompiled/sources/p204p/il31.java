package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class il31 {

    /* JADX INFO: renamed from: a */
    public final String f103278a;

    /* JADX INFO: renamed from: b */
    public final boolean f103279b;

    public il31(String str, boolean z) {
        this.f103278a = str;
        this.f103279b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il31)) {
            return false;
        }
        il31 il31Var = (il31) obj;
        return wj50.m88271j(this.f103278a, il31Var.f103278a) && this.f103279b == il31Var.f103279b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103279b) + (this.f103278a.hashCode() * 31);
    }
}
