package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jkb implements nkb {

    /* JADX INFO: renamed from: a */
    public final pck f113258a;

    /* JADX INFO: renamed from: b */
    public final pck f113259b;

    public jkb(pck pckVar, pck pckVar2) {
        this.f113258a = pckVar;
        this.f113259b = pckVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkb)) {
            return false;
        }
        jkb jkbVar = (jkb) obj;
        return wj50.m88271j(this.f113258a, jkbVar.f113258a) && wj50.m88271j(this.f113259b, jkbVar.f113259b);
    }

    public final int hashCode() {
        return this.f113259b.hashCode() + (this.f113258a.hashCode() * 31);
    }
}
