package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ps31 {

    /* JADX INFO: renamed from: a */
    public final String f180735a;

    /* JADX INFO: renamed from: b */
    public final boolean f180736b;

    public ps31(String str, boolean z) {
        this.f180735a = str;
        this.f180736b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps31)) {
            return false;
        }
        ps31 ps31Var = (ps31) obj;
        return wj50.m88271j(this.f180735a, ps31Var.f180735a) && this.f180736b == ps31Var.f180736b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180736b) + (this.f180735a.hashCode() * 31);
    }
}
