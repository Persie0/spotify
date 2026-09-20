package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ps00 implements rs00 {

    /* JADX INFO: renamed from: a */
    public final e8v f180707a;

    public ps00(e8v e8vVar) {
        this.f180707a = e8vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps00) && wj50.m88271j(this.f180707a, ((ps00) obj).f180707a);
    }

    public final int hashCode() {
        return this.f180707a.hashCode();
    }
}
