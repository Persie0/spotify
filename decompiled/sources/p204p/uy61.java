package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uy61 {

    /* JADX INFO: renamed from: a */
    public final String f235189a;

    /* JADX INFO: renamed from: b */
    public final eh00 f235190b;

    public uy61(String str, eh00 eh00Var) {
        this.f235189a = str;
        this.f235190b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy61)) {
            return false;
        }
        uy61 uy61Var = (uy61) obj;
        return wj50.m88271j(this.f235189a, uy61Var.f235189a) && wj50.m88271j(this.f235190b, uy61Var.f235190b);
    }

    public final int hashCode() {
        return this.f235190b.hashCode() + (this.f235189a.hashCode() * 31);
    }
}
