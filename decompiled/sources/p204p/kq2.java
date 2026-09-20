package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kq2 {

    /* JADX INFO: renamed from: a */
    public final String f125201a;

    /* JADX INFO: renamed from: b */
    public final dl2 f125202b;

    /* JADX INFO: renamed from: c */
    public final String f125203c;

    /* JADX INFO: renamed from: d */
    public final String f125204d;

    public /* synthetic */ kq2(String str, dl2 dl2Var, String str2) {
        this(str, dl2Var, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public final dl2 m57073a() {
        return this.f125202b;
    }

    /* JADX INFO: renamed from: b */
    public final String m57074b() {
        return this.f125203c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq2)) {
            return false;
        }
        kq2 kq2Var = (kq2) obj;
        return wj50.m88271j(this.f125201a, kq2Var.f125201a) && wj50.m88271j(this.f125202b, kq2Var.f125202b) && wj50.m88271j(this.f125203c, kq2Var.f125203c) && wj50.m88271j(this.f125204d, kq2Var.f125204d);
    }

    public final int hashCode() {
        int iHashCode = this.f125201a.hashCode() * 31;
        dl2 dl2Var = this.f125202b;
        int iHashCode2 = (iHashCode + (dl2Var == null ? 0 : dl2Var.hashCode())) * 31;
        String str = this.f125203c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f125204d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public kq2(String str, dl2 dl2Var, String str2, String str3) {
        this.f125201a = str;
        this.f125202b = dl2Var;
        this.f125203c = str2;
        this.f125204d = str3;
    }
}
