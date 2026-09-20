package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class utq extends wtq {

    /* JADX INFO: renamed from: a */
    public final String f233967a;

    /* JADX INFO: renamed from: b */
    public final String f233968b;

    /* JADX INFO: renamed from: c */
    public final boolean f233969c;

    public utq(String str, String str2, boolean z) {
        this.f233967a = str;
        this.f233968b = str2;
        this.f233969c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utq)) {
            return false;
        }
        utq utqVar = (utq) obj;
        return wj50.m88271j(this.f233967a, utqVar.f233967a) && wj50.m88271j(this.f233968b, utqVar.f233968b) && this.f233969c == utqVar.f233969c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233969c) + s571.m77243b(this.f233967a.hashCode() * 31, 31, this.f233968b);
    }
}
