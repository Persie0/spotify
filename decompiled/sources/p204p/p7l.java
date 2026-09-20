package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p7l implements q7l {

    /* JADX INFO: renamed from: a */
    public final String f174716a;

    /* JADX INFO: renamed from: b */
    public final gh00 f174717b;

    public p7l(String str, gh00 gh00Var) {
        this.f174716a = str;
        this.f174717b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7l)) {
            return false;
        }
        p7l p7lVar = (p7l) obj;
        return wj50.m88271j(this.f174716a, p7lVar.f174716a) && wj50.m88271j(this.f174717b, p7lVar.f174717b);
    }

    public final int hashCode() {
        return this.f174717b.hashCode() + (this.f174716a.hashCode() * 31);
    }
}
