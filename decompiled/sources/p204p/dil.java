package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dil {

    /* JADX INFO: renamed from: a */
    public final String f49409a;

    /* JADX INFO: renamed from: b */
    public final String f49410b;

    /* JADX INFO: renamed from: c */
    public final String f49411c;

    /* JADX INFO: renamed from: d */
    public final String f49412d;

    public /* synthetic */ dil(String str, String str2, int i, String str3) {
        this((i & 1) != 0 ? "" : str, "", str2, (i & 8) != 0 ? "" : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dil)) {
            return false;
        }
        dil dilVar = (dil) obj;
        return wj50.m88271j(this.f49409a, dilVar.f49409a) && wj50.m88271j(this.f49410b, dilVar.f49410b) && wj50.m88271j(this.f49411c, dilVar.f49411c) && wj50.m88271j(this.f49412d, dilVar.f49412d);
    }

    public final int hashCode() {
        return this.f49412d.hashCode() + s571.m77243b(s571.m77243b(this.f49409a.hashCode() * 31, 31, this.f49410b), 31, this.f49411c);
    }

    public dil(String str, String str2, String str3, String str4) {
        this.f49409a = str;
        this.f49410b = str2;
        this.f49411c = str3;
        this.f49412d = str4;
    }
}
