package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ho20 implements un20 {

    /* JADX INFO: renamed from: a */
    public final String f93432a;

    /* JADX INFO: renamed from: b */
    public final String f93433b;

    /* JADX INFO: renamed from: c */
    public final String f93434c;

    /* JADX INFO: renamed from: d */
    public final boolean f93435d;

    /* JADX INFO: renamed from: e */
    public final String f93436e;

    public ho20(String str, int i, String str2, String str3, boolean z, String str4) {
        str3 = (i & 4) != 0 ? "" : str3;
        z = (i & 8) != 0 ? false : z;
        this.f93432a = str;
        this.f93433b = str2;
        this.f93434c = str3;
        this.f93435d = z;
        this.f93436e = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m48016c() {
        return this.f93436e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho20)) {
            return false;
        }
        ho20 ho20Var = (ho20) obj;
        return wj50.m88271j(this.f93432a, ho20Var.f93432a) && wj50.m88271j(this.f93433b, ho20Var.f93433b) && wj50.m88271j(this.f93434c, ho20Var.f93434c) && this.f93435d == ho20Var.f93435d && wj50.m88271j(this.f93436e, ho20Var.f93436e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(this.f93432a.hashCode() * 31, 31, this.f93433b), 31, this.f93434c), 31, this.f93435d);
        String str = this.f93436e;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
