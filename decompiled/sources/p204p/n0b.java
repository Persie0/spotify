package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n0b {

    /* JADX INFO: renamed from: a */
    public final String f148959a;

    /* JADX INFO: renamed from: b */
    public final String f148960b;

    /* JADX INFO: renamed from: c */
    public final String f148961c;

    /* JADX INFO: renamed from: d */
    public final d850 f148962d;

    /* JADX INFO: renamed from: e */
    public final boolean f148963e;

    /* JADX INFO: renamed from: f */
    public final boolean f148964f;

    /* JADX INFO: renamed from: g */
    public final Long f148965g;

    /* JADX INFO: renamed from: h */
    public final boolean f148966h;

    public n0b(String str, String str2, String str3, d850 d850Var, boolean z, boolean z2, Long l, boolean z3) {
        this.f148959a = str;
        this.f148960b = str2;
        this.f148961c = str3;
        this.f148962d = d850Var;
        this.f148963e = z;
        this.f148964f = z2;
        this.f148965g = l;
        this.f148966h = z3;
    }

    /* JADX INFO: renamed from: a */
    public static n0b m63333a(n0b n0bVar, String str, Long l, int i) {
        if ((i & 1) != 0) {
            str = n0bVar.f148959a;
        }
        String str2 = str;
        String str3 = n0bVar.f148960b;
        String str4 = n0bVar.f148961c;
        d850 d850Var = n0bVar.f148962d;
        boolean z = n0bVar.f148963e;
        boolean z2 = n0bVar.f148964f;
        if ((i & 64) != 0) {
            l = n0bVar.f148965g;
        }
        Long l2 = l;
        boolean z3 = (i & 128) != 0 ? n0bVar.f148966h : false;
        n0bVar.getClass();
        return new n0b(str2, str3, str4, d850Var, z, z2, l2, z3);
    }

    /* JADX INFO: renamed from: b */
    public final String m63334b() {
        return this.f148961c;
    }

    /* JADX INFO: renamed from: c */
    public final String m63335c() {
        return this.f148959a;
    }

    /* JADX INFO: renamed from: d */
    public final d850 m63336d() {
        return this.f148962d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m63337e() {
        return this.f148966h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0b)) {
            return false;
        }
        n0b n0bVar = (n0b) obj;
        return wj50.m88271j(this.f148959a, n0bVar.f148959a) && wj50.m88271j(this.f148960b, n0bVar.f148960b) && wj50.m88271j(this.f148961c, n0bVar.f148961c) && wj50.m88271j(this.f148962d, n0bVar.f148962d) && this.f148963e == n0bVar.f148963e && this.f148964f == n0bVar.f148964f && wj50.m88271j(this.f148965g, n0bVar.f148965g) && this.f148966h == n0bVar.f148966h;
    }

    /* JADX INFO: renamed from: f */
    public final Long m63338f() {
        return this.f148965g;
    }

    /* JADX INFO: renamed from: g */
    public final String m63339g() {
        return this.f148960b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m63340h() {
        return this.f148964f;
    }

    public final int hashCode() {
        int iHashCode = this.f148959a.hashCode() * 31;
        String str = this.f148960b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f148961c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d850 d850Var = this.f148962d;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode3 + (d850Var == null ? 0 : d850Var.hashCode())) * 31, 31, this.f148963e), 31, this.f148964f);
        Long l = this.f148965g;
        return Boolean.hashCode(this.f148966h) + ((iM77245d + (l != null ? l.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m63341i() {
        return this.f148963e;
    }

    public /* synthetic */ n0b(String str, String str2, d850 d850Var, boolean z, boolean z2, Long l, int i) {
        this(str, str2, null, d850Var, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : l, false);
    }
}
