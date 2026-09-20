package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mnr extends pnr {

    /* JADX INFO: renamed from: a */
    public final String f145468a;

    /* JADX INFO: renamed from: b */
    public final String f145469b;

    /* JADX INFO: renamed from: c */
    public final String f145470c;

    /* JADX INFO: renamed from: d */
    public final String f145471d;

    public mnr(String str, String str2, String str3, String str4) {
        this.f145468a = str;
        this.f145469b = str2;
        this.f145470c = str3;
        this.f145471d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnr)) {
            return false;
        }
        mnr mnrVar = (mnr) obj;
        return wj50.m88271j(this.f145468a, mnrVar.f145468a) && wj50.m88271j(this.f145469b, mnrVar.f145469b) && wj50.m88271j(this.f145470c, mnrVar.f145470c) && wj50.m88271j(this.f145471d, mnrVar.f145471d);
    }

    public final int hashCode() {
        return this.f145471d.hashCode() + s571.m77243b(s571.m77243b(this.f145468a.hashCode() * 31, 31, this.f145469b), 31, this.f145470c);
    }
}
