package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ld71 {

    /* JADX INFO: renamed from: a */
    public final String f132088a;

    /* JADX INFO: renamed from: b */
    public final boolean f132089b;

    /* JADX INFO: renamed from: c */
    public final String f132090c;

    public ld71(String str, int i, String str2, boolean z) {
        z = (i & 2) != 0 ? false : z;
        str2 = (i & 4) != 0 ? null : str2;
        this.f132088a = str;
        this.f132089b = z;
        this.f132090c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld71)) {
            return false;
        }
        ld71 ld71Var = (ld71) obj;
        return wj50.m88271j(this.f132088a, ld71Var.f132088a) && this.f132089b == ld71Var.f132089b && wj50.m88271j(this.f132090c, ld71Var.f132090c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f132088a.hashCode() * 31, 31, this.f132089b);
        String str = this.f132090c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
