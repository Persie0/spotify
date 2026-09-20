package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ihb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f102225a;

    /* JADX INFO: renamed from: b */
    public final String f102226b;

    /* JADX INFO: renamed from: c */
    public final String f102227c;

    /* JADX INFO: renamed from: d */
    public final String f102228d;

    public ihb(String str, String str2, String str3, boolean z) {
        this.f102225a = z;
        this.f102226b = str;
        this.f102227c = str2;
        this.f102228d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihb)) {
            return false;
        }
        ihb ihbVar = (ihb) obj;
        return this.f102225a == ihbVar.f102225a && wj50.m88271j(this.f102226b, ihbVar.f102226b) && wj50.m88271j(this.f102227c, ihbVar.f102227c) && wj50.m88271j(this.f102228d, ihbVar.f102228d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Boolean.hashCode(this.f102225a) * 31, 31, this.f102226b), 31, this.f102227c);
        String str = this.f102228d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
