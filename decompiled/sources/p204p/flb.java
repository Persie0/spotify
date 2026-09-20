package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class flb implements glb {

    /* JADX INFO: renamed from: a */
    public final String f70739a;

    /* JADX INFO: renamed from: b */
    public final String f70740b;

    /* JADX INFO: renamed from: c */
    public final mlb f70741c;

    /* JADX INFO: renamed from: d */
    public final String f70742d;

    /* JADX INFO: renamed from: e */
    public final String f70743e;

    public /* synthetic */ flb(String str, String str2, String str3) {
        this(str, str2, null, null, str3);
    }

    /* JADX INFO: renamed from: a */
    public final mlb m41988a() {
        return this.f70741c;
    }

    /* JADX INFO: renamed from: b */
    public final String m41989b() {
        return this.f70739a;
    }

    /* JADX INFO: renamed from: c */
    public final String m41990c() {
        return this.f70742d;
    }

    /* JADX INFO: renamed from: d */
    public final String m41991d() {
        return this.f70740b;
    }

    /* JADX INFO: renamed from: e */
    public final String m41992e() {
        return this.f70743e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flb)) {
            return false;
        }
        flb flbVar = (flb) obj;
        return wj50.m88271j(this.f70739a, flbVar.f70739a) && wj50.m88271j(this.f70740b, flbVar.f70740b) && wj50.m88271j(this.f70741c, flbVar.f70741c) && wj50.m88271j(this.f70742d, flbVar.f70742d) && wj50.m88271j(this.f70743e, flbVar.f70743e);
    }

    public final int hashCode() {
        int iHashCode = this.f70739a.hashCode() * 31;
        String str = this.f70740b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        mlb mlbVar = this.f70741c;
        int iHashCode3 = (iHashCode2 + (mlbVar == null ? 0 : mlbVar.hashCode())) * 31;
        String str2 = this.f70742d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70743e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public flb(String str, String str2, mlb mlbVar, String str3, String str4) {
        this.f70739a = str;
        this.f70740b = str2;
        this.f70741c = mlbVar;
        this.f70742d = str3;
        this.f70743e = str4;
    }
}
