package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f131064a;

    /* JADX INFO: renamed from: b */
    public final pcu0 f131065b;

    public l9d(String str, pcu0 pcu0Var) {
        this.f131064a = str;
        this.f131065b = pcu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9d)) {
            return false;
        }
        l9d l9dVar = (l9d) obj;
        return wj50.m88271j(this.f131064a, l9dVar.f131064a) && wj50.m88271j(this.f131065b, l9dVar.f131065b);
    }

    public final int hashCode() {
        return this.f131065b.hashCode() + (this.f131064a.hashCode() * 31);
    }
}
