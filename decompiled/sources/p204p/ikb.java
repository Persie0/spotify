package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ikb implements nkb {

    /* JADX INFO: renamed from: a */
    public final pck f103081a;

    public ikb(pck pckVar) {
        this.f103081a = pckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ikb) && wj50.m88271j(this.f103081a, ((ikb) obj).f103081a);
    }

    public final int hashCode() {
        return this.f103081a.hashCode();
    }
}
