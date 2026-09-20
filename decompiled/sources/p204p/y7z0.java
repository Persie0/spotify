package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y7z0 {

    /* JADX INFO: renamed from: a */
    public final String f270151a;

    /* JADX INFO: renamed from: b */
    public final String f270152b;

    /* JADX INFO: renamed from: c */
    public final String f270153c;

    /* JADX INFO: renamed from: d */
    public final String f270154d;

    public y7z0(int i, String str, String str2, String str3, String str4) {
        str2 = (i & 2) != 0 ? null : str2;
        this.f270151a = str;
        this.f270152b = str2;
        this.f270153c = str3;
        this.f270154d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7z0)) {
            return false;
        }
        y7z0 y7z0Var = (y7z0) obj;
        return wj50.m88271j(this.f270151a, y7z0Var.f270151a) && wj50.m88271j(this.f270152b, y7z0Var.f270152b) && wj50.m88271j(this.f270153c, y7z0Var.f270153c) && wj50.m88271j(this.f270154d, y7z0Var.f270154d);
    }

    public final int hashCode() {
        int iHashCode = this.f270151a.hashCode() * 31;
        String str = this.f270152b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f270153c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f270154d;
        return Boolean.hashCode(false) + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31);
    }
}
