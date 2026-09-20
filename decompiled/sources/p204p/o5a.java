package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o5a {

    /* JADX INFO: renamed from: a */
    public final l5a f161924a;

    /* JADX INFO: renamed from: b */
    public final dwg1 f161925b;

    public o5a(l5a l5aVar, dwg1 dwg1Var) {
        this.f161924a = l5aVar;
        this.f161925b = dwg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5a)) {
            return false;
        }
        o5a o5aVar = (o5a) obj;
        return wj50.m88271j(this.f161924a, o5aVar.f161924a) && wj50.m88271j(this.f161925b, o5aVar.f161925b);
    }

    public final int hashCode() {
        return this.f161925b.hashCode() + (this.f161924a.hashCode() * 31);
    }
}
