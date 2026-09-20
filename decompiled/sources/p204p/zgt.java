package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zgt implements ymt {

    /* JADX INFO: renamed from: a */
    public final String f282706a;

    /* JADX INFO: renamed from: b */
    public final String f282707b;

    /* JADX INFO: renamed from: c */
    public final String f282708c;

    public zgt(String str, String str2, String str3) {
        this.f282706a = str;
        this.f282707b = str2;
        this.f282708c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgt)) {
            return false;
        }
        zgt zgtVar = (zgt) obj;
        return wj50.m88271j(this.f282706a, zgtVar.f282706a) && wj50.m88271j(this.f282707b, zgtVar.f282707b) && wj50.m88271j(this.f282708c, zgtVar.f282708c);
    }

    public final int hashCode() {
        return this.f282708c.hashCode() + s571.m77243b(this.f282706a.hashCode() * 31, 31, this.f282707b);
    }
}
