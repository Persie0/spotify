package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class an40 {

    /* JADX INFO: renamed from: a */
    public final String f17294a;

    /* JADX INFO: renamed from: b */
    public final cn40 f17295b;

    public an40(String str, cn40 cn40Var) {
        this.f17294a = str;
        this.f17295b = cn40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an40)) {
            return false;
        }
        an40 an40Var = (an40) obj;
        return wj50.m88271j(this.f17294a, an40Var.f17294a) && this.f17295b == an40Var.f17295b;
    }

    public final int hashCode() {
        return this.f17295b.hashCode() + (this.f17294a.hashCode() * 31);
    }
}
