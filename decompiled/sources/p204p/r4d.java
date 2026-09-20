package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f195717a;

    /* JADX INFO: renamed from: b */
    public final String f195718b;

    /* JADX INFO: renamed from: c */
    public final pck f195719c;

    /* JADX INFO: renamed from: d */
    public final boolean f195720d;

    /* JADX INFO: renamed from: e */
    public final boolean f195721e;

    public r4d(String str, String str2, pck pckVar, boolean z, boolean z2) {
        this.f195717a = str;
        this.f195718b = str2;
        this.f195719c = pckVar;
        this.f195720d = z;
        this.f195721e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4d)) {
            return false;
        }
        r4d r4dVar = (r4d) obj;
        return wj50.m88271j(this.f195717a, r4dVar.f195717a) && wj50.m88271j(this.f195718b, r4dVar.f195718b) && wj50.m88271j(this.f195719c, r4dVar.f195719c) && this.f195720d == r4dVar.f195720d && this.f195721e == r4dVar.f195721e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195721e) + s571.m77245d((this.f195719c.hashCode() + s571.m77243b(this.f195717a.hashCode() * 31, 31, this.f195718b)) * 31, 31, this.f195720d);
    }
}
