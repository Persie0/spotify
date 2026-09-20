package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class szf0 {

    /* JADX INFO: renamed from: a */
    public final String f215587a;

    /* JADX INFO: renamed from: b */
    public final myf0 f215588b;

    public szf0(String str, myf0 myf0Var) {
        this.f215587a = str;
        this.f215588b = myf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szf0)) {
            return false;
        }
        szf0 szf0Var = (szf0) obj;
        return wj50.m88271j(this.f215587a, szf0Var.f215587a) && wj50.m88271j(this.f215588b, szf0Var.f215588b);
    }

    public final int hashCode() {
        return this.f215588b.hashCode() + (this.f215587a.hashCode() * 31);
    }
}
