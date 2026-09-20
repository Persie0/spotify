package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ttj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f223623a;

    /* JADX INFO: renamed from: b */
    public final String f223624b;

    /* JADX INFO: renamed from: c */
    public final String f223625c;

    /* JADX INFO: renamed from: d */
    public final String f223626d;

    public ttj(String str, String str2, String str3, String str4) {
        this.f223623a = str;
        this.f223624b = str2;
        this.f223625c = str3;
        this.f223626d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttj)) {
            return false;
        }
        ttj ttjVar = (ttj) obj;
        return wj50.m88271j(this.f223623a, ttjVar.f223623a) && wj50.m88271j(this.f223624b, ttjVar.f223624b) && wj50.m88271j(this.f223625c, ttjVar.f223625c) && wj50.m88271j(this.f223626d, ttjVar.f223626d);
    }

    public final int hashCode() {
        return this.f223626d.hashCode() + s571.m77243b(s571.m77243b(this.f223623a.hashCode() * 31, 31, this.f223624b), 31, this.f223625c);
    }
}
