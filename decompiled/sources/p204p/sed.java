package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sed {

    /* JADX INFO: renamed from: a */
    public final ted f208276a;

    /* JADX INFO: renamed from: b */
    public final ted f208277b;

    public sed(ted tedVar, ted tedVar2) {
        this.f208276a = tedVar;
        this.f208277b = tedVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sed)) {
            return false;
        }
        sed sedVar = (sed) obj;
        return wj50.m88271j(this.f208276a, sedVar.f208276a) && wj50.m88271j(this.f208277b, sedVar.f208277b);
    }

    public final int hashCode() {
        return this.f208277b.hashCode() + (this.f208276a.hashCode() * 31);
    }
}
