package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zl2 {

    /* JADX INFO: renamed from: a */
    public final String f283893a;

    /* JADX INFO: renamed from: b */
    public final dl2 f283894b;

    /* JADX INFO: renamed from: c */
    public final String f283895c;

    /* JADX INFO: renamed from: d */
    public final String f283896d;

    public zl2(String str, dl2 dl2Var, String str2, String str3) {
        this.f283893a = str;
        this.f283894b = dl2Var;
        this.f283895c = str2;
        this.f283896d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m96354a() {
        return this.f283895c;
    }

    /* JADX INFO: renamed from: b */
    public final String m96355b() {
        return this.f283893a;
    }

    /* JADX INFO: renamed from: c */
    public final String m96356c() {
        return this.f283896d;
    }

    /* JADX INFO: renamed from: d */
    public final dl2 m96357d() {
        return this.f283894b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return wj50.m88271j(this.f283893a, zl2Var.f283893a) && wj50.m88271j(this.f283894b, zl2Var.f283894b) && wj50.m88271j(this.f283895c, zl2Var.f283895c) && wj50.m88271j(this.f283896d, zl2Var.f283896d);
    }

    public final int hashCode() {
        int iHashCode = this.f283893a.hashCode() * 31;
        dl2 dl2Var = this.f283894b;
        int iHashCode2 = (iHashCode + (dl2Var == null ? 0 : dl2Var.hashCode())) * 31;
        String str = this.f283895c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283896d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
