package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b3m implements g3m {

    /* JADX INFO: renamed from: a */
    public final g3m f23074a;

    public b3m(g3m g3mVar) {
        this.f23074a = g3mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3m) && wj50.m88271j(this.f23074a, ((b3m) obj).f23074a);
    }

    public final int hashCode() {
        g3m g3mVar = this.f23074a;
        if (g3mVar == null) {
            return 0;
        }
        return g3mVar.hashCode();
    }
}
