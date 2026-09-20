package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t4b {

    /* JADX INFO: renamed from: a */
    public final String f216958a;

    /* JADX INFO: renamed from: b */
    public final z4b f216959b;

    public t4b(String str, z4b z4bVar) {
        this.f216958a = str;
        this.f216959b = z4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4b)) {
            return false;
        }
        t4b t4bVar = (t4b) obj;
        return wj50.m88271j(this.f216958a, t4bVar.f216958a) && wj50.m88271j(this.f216959b, t4bVar.f216959b);
    }

    public final int hashCode() {
        int iHashCode = this.f216958a.hashCode() * 31;
        z4b z4bVar = this.f216959b;
        return iHashCode + (z4bVar == null ? 0 : z4bVar.hashCode());
    }
}
