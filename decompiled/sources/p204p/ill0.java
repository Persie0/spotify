package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ill0 {

    /* JADX INFO: renamed from: a */
    public final String f103398a;

    /* JADX INFO: renamed from: b */
    public final f5r f103399b;

    public ill0(String str, f5r f5rVar) {
        this.f103398a = str;
        this.f103399b = f5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ill0)) {
            return false;
        }
        ill0 ill0Var = (ill0) obj;
        return wj50.m88271j(this.f103398a, ill0Var.f103398a) && wj50.m88271j(this.f103399b, ill0Var.f103399b);
    }

    public final int hashCode() {
        return this.f103399b.hashCode() + (this.f103398a.hashCode() * 31);
    }
}
