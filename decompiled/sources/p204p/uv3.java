package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uv3 {

    /* JADX INFO: renamed from: a */
    public final String f234323a;

    /* JADX INFO: renamed from: b */
    public final String f234324b;

    /* JADX INFO: renamed from: c */
    public final Long f234325c;

    /* JADX INFO: renamed from: d */
    public final boolean f234326d;

    public uv3(Long l, String str, String str2, boolean z) {
        this.f234323a = str;
        this.f234324b = str2;
        this.f234325c = l;
        this.f234326d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv3)) {
            return false;
        }
        uv3 uv3Var = (uv3) obj;
        return wj50.m88271j(this.f234323a, uv3Var.f234323a) && wj50.m88271j(this.f234324b, uv3Var.f234324b) && wj50.m88271j(this.f234325c, uv3Var.f234325c) && this.f234326d == uv3Var.f234326d;
    }

    public final int hashCode() {
        String str = this.f234323a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f234324b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f234325c;
        return Boolean.hashCode(this.f234326d) + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }
}
