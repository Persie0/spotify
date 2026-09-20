package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zni {

    /* JADX INFO: renamed from: a */
    public final String f284505a;

    /* JADX INFO: renamed from: b */
    public final String f284506b;

    /* JADX INFO: renamed from: c */
    public final String f284507c;

    public zni(String str, String str2, String str3) {
        this.f284505a = str;
        this.f284506b = str2;
        this.f284507c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zni)) {
            return false;
        }
        zni zniVar = (zni) obj;
        return wj50.m88271j(this.f284505a, zniVar.f284505a) && wj50.m88271j(this.f284506b, zniVar.f284506b) && wj50.m88271j(this.f284507c, zniVar.f284507c);
    }

    public final int hashCode() {
        return this.f284507c.hashCode() + s571.m77243b(this.f284505a.hashCode() * 31, 31, this.f284506b);
    }
}
