package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mil {

    /* JADX INFO: renamed from: a */
    public final vil f144042a;

    /* JADX INFO: renamed from: b */
    public final String f144043b;

    public mil(vil vilVar, String str) {
        this.f144042a = vilVar;
        this.f144043b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mil)) {
            return false;
        }
        mil milVar = (mil) obj;
        return wj50.m88271j(this.f144042a, milVar.f144042a) && wj50.m88271j(this.f144043b, milVar.f144043b);
    }

    public final int hashCode() {
        return this.f144043b.hashCode() + (this.f144042a.hashCode() * 31);
    }
}
