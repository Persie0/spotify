package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class la61 {

    /* JADX INFO: renamed from: a */
    public final String f131281a;

    /* JADX INFO: renamed from: b */
    public final String f131282b;

    /* JADX INFO: renamed from: c */
    public final boolean f131283c;

    /* JADX INFO: renamed from: d */
    public final boolean f131284d;

    public la61(String str, boolean z, String str2, boolean z2) {
        this.f131281a = str;
        this.f131282b = str2;
        this.f131283c = z;
        this.f131284d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static la61 m58542a(la61 la61Var, boolean z) {
        String str = la61Var.f131281a;
        String str2 = la61Var.f131282b;
        boolean z2 = la61Var.f131283c;
        la61Var.getClass();
        return new la61(str, z2, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la61)) {
            return false;
        }
        la61 la61Var = (la61) obj;
        return wj50.m88271j(this.f131281a, la61Var.f131281a) && wj50.m88271j(this.f131282b, la61Var.f131282b) && this.f131283c == la61Var.f131283c && this.f131284d == la61Var.f131284d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131284d) + s571.m77245d(s571.m77243b(this.f131281a.hashCode() * 31, 31, this.f131282b), 31, this.f131283c);
    }
}
