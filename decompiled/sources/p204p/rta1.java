package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rta1 {

    /* JADX INFO: renamed from: a */
    public final String f202555a;

    /* JADX INFO: renamed from: b */
    public final String f202556b;

    public rta1(String str, String str2) {
        this.f202555a = str;
        this.f202556b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rta1)) {
            return false;
        }
        rta1 rta1Var = (rta1) obj;
        return wj50.m88271j(this.f202555a, rta1Var.f202555a) && wj50.m88271j(this.f202556b, rta1Var.f202556b);
    }

    public final int hashCode() {
        return this.f202556b.hashCode() + (this.f202555a.hashCode() * 31);
    }
}
