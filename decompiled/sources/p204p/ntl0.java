package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ntl0 extends wtl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f158099a;

    /* JADX INFO: renamed from: b */
    public final String f158100b;

    public ntl0(zo20 zo20Var, String str) {
        this.f158099a = zo20Var;
        this.f158100b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntl0)) {
            return false;
        }
        ntl0 ntl0Var = (ntl0) obj;
        return wj50.m88271j(this.f158099a, ntl0Var.f158099a) && wj50.m88271j(this.f158100b, ntl0Var.f158100b);
    }

    public final int hashCode() {
        return this.f158100b.hashCode() + (this.f158099a.hashCode() * 31);
    }
}
