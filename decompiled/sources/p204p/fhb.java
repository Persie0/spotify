package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fhb {

    /* JADX INFO: renamed from: a */
    public final String f69617a;

    /* JADX INFO: renamed from: b */
    public final String f69618b;

    public fhb(String str, String str2) {
        this.f69617a = str;
        this.f69618b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhb)) {
            return false;
        }
        fhb fhbVar = (fhb) obj;
        return wj50.m88271j(this.f69617a, fhbVar.f69617a) && wj50.m88271j(this.f69618b, fhbVar.f69618b);
    }

    public final int hashCode() {
        return this.f69618b.hashCode() + (this.f69617a.hashCode() * 31);
    }
}
