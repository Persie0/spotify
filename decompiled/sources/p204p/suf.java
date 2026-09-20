package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class suf {

    /* JADX INFO: renamed from: a */
    public final String f214064a;

    /* JADX INFO: renamed from: b */
    public final f251 f214065b;

    public suf(String str, f251 f251Var) {
        this.f214064a = str;
        this.f214065b = f251Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suf)) {
            return false;
        }
        suf sufVar = (suf) obj;
        return wj50.m88271j(this.f214064a, sufVar.f214064a) && wj50.m88271j(this.f214065b, sufVar.f214065b);
    }

    public final int hashCode() {
        return this.f214065b.hashCode() + (this.f214064a.hashCode() * 31);
    }
}
