package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t86 {

    /* JADX INFO: renamed from: a */
    public final String f217979a;

    /* JADX INFO: renamed from: b */
    public final boolean f217980b;

    public t86(String str, boolean z) {
        this.f217979a = str;
        this.f217980b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t86)) {
            return false;
        }
        t86 t86Var = (t86) obj;
        return wj50.m88271j(this.f217979a, t86Var.f217979a) && this.f217980b == t86Var.f217980b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217980b) + (this.f217979a.hashCode() * 31);
    }
}
