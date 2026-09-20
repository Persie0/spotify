package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x6b implements c7b {

    /* JADX INFO: renamed from: a */
    public final String f258631a;

    /* JADX INFO: renamed from: b */
    public final String f258632b;

    /* JADX INFO: renamed from: c */
    public final String f258633c;

    public x6b(String str, String str2, String str3) {
        this.f258631a = str;
        this.f258632b = str2;
        this.f258633c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6b)) {
            return false;
        }
        x6b x6bVar = (x6b) obj;
        return wj50.m88271j(this.f258631a, x6bVar.f258631a) && wj50.m88271j(this.f258632b, x6bVar.f258632b) && wj50.m88271j(this.f258633c, x6bVar.f258633c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f258631a.hashCode() * 31, 31, this.f258632b);
        String str = this.f258633c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
