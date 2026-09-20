package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zbi implements jci {

    /* JADX INFO: renamed from: a */
    public final String f281327a;

    /* JADX INFO: renamed from: b */
    public final String f281328b;

    public zbi(String str, String str2) {
        this.f281327a = str;
        this.f281328b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbi)) {
            return false;
        }
        zbi zbiVar = (zbi) obj;
        return wj50.m88271j(this.f281327a, zbiVar.f281327a) && wj50.m88271j(this.f281328b, zbiVar.f281328b);
    }

    public final int hashCode() {
        return this.f281328b.hashCode() + (this.f281327a.hashCode() * 31);
    }
}
