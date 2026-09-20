package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p7a implements q7a {

    /* JADX INFO: renamed from: a */
    public final jvz0 f174629a;

    /* JADX INFO: renamed from: b */
    public final String f174630b;

    public p7a(jvz0 jvz0Var, String str) {
        this.f174629a = jvz0Var;
        this.f174630b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7a)) {
            return false;
        }
        p7a p7aVar = (p7a) obj;
        return wj50.m88271j(this.f174629a, p7aVar.f174629a) && wj50.m88271j(this.f174630b, p7aVar.f174630b);
    }

    public final int hashCode() {
        return this.f174630b.hashCode() + (this.f174629a.hashCode() * 31);
    }
}
