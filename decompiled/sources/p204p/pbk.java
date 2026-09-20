package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pbk {

    /* JADX INFO: renamed from: a */
    public final d0w f175864a;

    public pbk(d0w d0wVar) {
        this.f175864a = d0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbk) && wj50.m88271j(this.f175864a, ((pbk) obj).f175864a);
    }

    public final int hashCode() {
        d0w d0wVar = this.f175864a;
        if (d0wVar == null) {
            return 0;
        }
        return d0wVar.hashCode();
    }
}
