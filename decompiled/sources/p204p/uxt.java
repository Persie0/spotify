package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uxt {

    /* JADX INFO: renamed from: a */
    public final fiz f235037a;

    /* JADX INFO: renamed from: b */
    public final fiz f235038b;

    /* JADX INFO: renamed from: c */
    public final vxt f235039c;

    public uxt(fiz fizVar, fiz fizVar2, vxt vxtVar) {
        this.f235037a = fizVar;
        this.f235038b = fizVar2;
        this.f235039c = vxtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxt)) {
            return false;
        }
        uxt uxtVar = (uxt) obj;
        return wj50.m88271j(this.f235037a, uxtVar.f235037a) && wj50.m88271j(this.f235038b, uxtVar.f235038b) && wj50.m88271j(this.f235039c, uxtVar.f235039c);
    }

    public final int hashCode() {
        return this.f235039c.hashCode() + ((this.f235038b.hashCode() + (this.f235037a.hashCode() * 31)) * 31);
    }
}
