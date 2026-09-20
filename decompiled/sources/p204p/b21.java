package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b21 extends k21 {

    /* JADX INFO: renamed from: a */
    public final cix f22465a;

    public b21(cix cixVar) {
        this.f22465a = cixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b21) && wj50.m88271j(this.f22465a, ((b21) obj).f22465a);
    }

    public final int hashCode() {
        cix cixVar = this.f22465a;
        if (cixVar == null) {
            return 0;
        }
        return cixVar.hashCode();
    }
}
