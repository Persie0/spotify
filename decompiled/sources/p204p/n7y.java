package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n7y {

    /* JADX INFO: renamed from: a */
    public final String f151269a;

    /* JADX INFO: renamed from: b */
    public final String f151270b;

    /* JADX INFO: renamed from: c */
    public final String f151271c;

    public n7y(String str, String str2, String str3) {
        this.f151269a = str;
        this.f151270b = str2;
        this.f151271c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7y)) {
            return false;
        }
        n7y n7yVar = (n7y) obj;
        return wj50.m88271j(this.f151269a, n7yVar.f151269a) && wj50.m88271j(this.f151270b, n7yVar.f151270b) && wj50.m88271j(this.f151271c, n7yVar.f151271c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f151269a.hashCode() * 31, 31, this.f151270b);
        String str = this.f151271c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
