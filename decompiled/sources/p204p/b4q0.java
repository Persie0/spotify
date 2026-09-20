package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b4q0 extends c4q0 {

    /* JADX INFO: renamed from: a */
    public final String f23401a;

    /* JADX INFO: renamed from: b */
    public final boolean f23402b;

    public b4q0(String str, boolean z) {
        this.f23401a = str;
        this.f23402b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4q0)) {
            return false;
        }
        b4q0 b4q0Var = (b4q0) obj;
        return wj50.m88271j(this.f23401a, b4q0Var.f23401a) && this.f23402b == b4q0Var.f23402b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23402b) + (this.f23401a.hashCode() * 31);
    }
}
