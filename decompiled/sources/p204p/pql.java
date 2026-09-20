package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pql {

    /* JADX INFO: renamed from: a */
    public final j15 f180347a;

    /* JADX INFO: renamed from: b */
    public final String f180348b;

    public pql(j15 j15Var, String str) {
        this.f180347a = j15Var;
        this.f180348b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pql)) {
            return false;
        }
        pql pqlVar = (pql) obj;
        return wj50.m88271j(this.f180347a, pqlVar.f180347a) && wj50.m88271j(this.f180348b, pqlVar.f180348b);
    }

    public final int hashCode() {
        return this.f180348b.hashCode() + (this.f180347a.hashCode() * 31);
    }
}
