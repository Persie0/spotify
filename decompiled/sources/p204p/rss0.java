package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rss0 {

    /* JADX INFO: renamed from: a */
    public final String f202400a;

    /* JADX INFO: renamed from: b */
    public final String f202401b;

    /* JADX INFO: renamed from: c */
    public final boolean f202402c;

    public rss0(String str, String str2, boolean z) {
        this.f202400a = str;
        this.f202401b = str2;
        this.f202402c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rss0)) {
            return false;
        }
        rss0 rss0Var = (rss0) obj;
        return wj50.m88271j(this.f202400a, rss0Var.f202400a) && wj50.m88271j(this.f202401b, rss0Var.f202401b) && this.f202402c == rss0Var.f202402c;
    }

    public final int hashCode() {
        int iHashCode = this.f202400a.hashCode() * 31;
        String str = this.f202401b;
        return Boolean.hashCode(this.f202402c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
