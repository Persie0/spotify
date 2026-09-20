package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a1u {

    /* JADX INFO: renamed from: a */
    public final String f11477a;

    /* JADX INFO: renamed from: b */
    public final String f11478b;

    /* JADX INFO: renamed from: c */
    public final String f11479c;

    public a1u(String str, String str2, String str3) {
        this.f11477a = str;
        this.f11478b = str2;
        this.f11479c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1u)) {
            return false;
        }
        a1u a1uVar = (a1u) obj;
        return wj50.m88271j(this.f11477a, a1uVar.f11477a) && wj50.m88271j(this.f11478b, a1uVar.f11478b) && wj50.m88271j(this.f11479c, a1uVar.f11479c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f11477a.hashCode() * 31, 31, this.f11478b);
        String str = this.f11479c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return s571.m77251j("EmailLinkData(username: ", this.f11477a, ")");
    }
}
