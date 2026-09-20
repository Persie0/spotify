package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dzc {

    /* JADX INFO: renamed from: a */
    public final String f54615a;

    /* JADX INFO: renamed from: b */
    public final knd f54616b;

    /* JADX INFO: renamed from: c */
    public final boolean f54617c;

    /* JADX INFO: renamed from: d */
    public final String f54618d;

    /* JADX INFO: renamed from: e */
    public final abd f54619e;

    public dzc(String str, String str2, abd abdVar, knd kndVar, boolean z) {
        this.f54615a = str;
        this.f54616b = kndVar;
        this.f54617c = z;
        this.f54618d = str2;
        this.f54619e = abdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzc)) {
            return false;
        }
        dzc dzcVar = (dzc) obj;
        return wj50.m88271j(this.f54615a, dzcVar.f54615a) && this.f54616b == dzcVar.f54616b && this.f54617c == dzcVar.f54617c && wj50.m88271j(this.f54618d, dzcVar.f54618d) && wj50.m88271j(this.f54619e, dzcVar.f54619e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d((this.f54616b.hashCode() + (this.f54615a.hashCode() * 31)) * 31, 31, this.f54617c), 31, this.f54618d);
        abd abdVar = this.f54619e;
        return iM77243b + (abdVar == null ? 0 : abdVar.hashCode());
    }
}
