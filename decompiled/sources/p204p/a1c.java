package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a1c {

    /* JADX INFO: renamed from: a */
    public final qho f11378a;

    /* JADX INFO: renamed from: b */
    public final qho f11379b;

    /* JADX INFO: renamed from: c */
    public final qho f11380c;

    public a1c(qho qhoVar, qho qhoVar2, qho qhoVar3) {
        this.f11378a = qhoVar;
        this.f11379b = qhoVar2;
        this.f11380c = qhoVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1c)) {
            return false;
        }
        a1c a1cVar = (a1c) obj;
        return wj50.m88271j(this.f11378a, a1cVar.f11378a) && wj50.m88271j(this.f11379b, a1cVar.f11379b) && wj50.m88271j(this.f11380c, a1cVar.f11380c);
    }

    public final int hashCode() {
        return this.f11380c.hashCode() + ((this.f11379b.hashCode() + (this.f11378a.hashCode() * 31)) * 31);
    }
}
