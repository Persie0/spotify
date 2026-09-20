package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kkb implements nkb {

    /* JADX INFO: renamed from: a */
    public final pck f123553a;

    /* JADX INFO: renamed from: b */
    public final pck f123554b;

    public kkb(pck pckVar, pck pckVar2) {
        this.f123553a = pckVar;
        this.f123554b = pckVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkb)) {
            return false;
        }
        kkb kkbVar = (kkb) obj;
        return wj50.m88271j(this.f123553a, kkbVar.f123553a) && wj50.m88271j(this.f123554b, kkbVar.f123554b);
    }

    public final int hashCode() {
        return this.f123554b.hashCode() + (this.f123553a.hashCode() * 31);
    }
}
