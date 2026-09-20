package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zxt {

    /* JADX INFO: renamed from: a */
    public final String f287391a;

    /* JADX INFO: renamed from: b */
    public final String f287392b;

    public zxt(String str, String str2) {
        this.f287391a = str;
        this.f287392b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxt)) {
            return false;
        }
        zxt zxtVar = (zxt) obj;
        return wj50.m88271j(this.f287391a, zxtVar.f287391a) && wj50.m88271j(this.f287392b, zxtVar.f287392b);
    }

    public final int hashCode() {
        return this.f287392b.hashCode() + (this.f287391a.hashCode() * 31);
    }
}
