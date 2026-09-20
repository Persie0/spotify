package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kbu {

    /* JADX INFO: renamed from: a */
    public final String f121279a;

    /* JADX INFO: renamed from: b */
    public final String f121280b;

    /* JADX INFO: renamed from: c */
    public final String f121281c;

    /* JADX INFO: renamed from: d */
    public final String f121282d;

    /* JADX INFO: renamed from: e */
    public final int f121283e;

    /* JADX INFO: renamed from: f */
    public final String f121284f;

    public kbu(int i, String str, String str2, String str3, String str4, String str5) {
        this.f121279a = str;
        this.f121280b = str2;
        this.f121281c = str3;
        this.f121282d = str4;
        this.f121283e = i;
        this.f121284f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbu)) {
            return false;
        }
        kbu kbuVar = (kbu) obj;
        return wj50.m88271j(this.f121279a, kbuVar.f121279a) && wj50.m88271j(this.f121280b, kbuVar.f121280b) && wj50.m88271j(this.f121281c, kbuVar.f121281c) && wj50.m88271j(this.f121282d, kbuVar.f121282d) && this.f121283e == kbuVar.f121283e && wj50.m88271j(this.f121284f, kbuVar.f121284f);
    }

    public final int hashCode() {
        return this.f121284f.hashCode() + mt60.m62800g(this.f121283e, s571.m77243b(s571.m77243b(s571.m77243b(this.f121279a.hashCode() * 31, 31, this.f121280b), 31, this.f121281c), 31, this.f121282d), 31);
    }
}
