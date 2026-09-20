package p204p;

import java.util.Arrays;

/* JADX INFO: renamed from: p.iw */
/* JADX INFO: loaded from: classes18.dex */
public final class C1993iw {

    /* JADX INFO: renamed from: a */
    public final wi7 f106304a;

    /* JADX INFO: renamed from: b */
    public final String f106305b;

    /* JADX INFO: renamed from: c */
    public final String f106306c;

    /* JADX INFO: renamed from: d */
    public final Integer f106307d;

    /* JADX INFO: renamed from: e */
    public final boolean f106308e;

    /* JADX INFO: renamed from: f */
    public final Long f106309f;

    /* JADX INFO: renamed from: g */
    public final Long f106310g;

    public /* synthetic */ C1993iw(wi7 wi7Var, String str, String str2, Integer num, Long l, int i) {
        this(wi7Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) == 0, null, (i & 64) != 0 ? null : l);
    }

    /* JADX INFO: renamed from: a */
    public static C1993iw m51771a(C1993iw c1993iw, wi7 wi7Var, Long l, int i) {
        String str = c1993iw.f106305b;
        String str2 = c1993iw.f106306c;
        Integer num = c1993iw.f106307d;
        boolean z = c1993iw.f106308e;
        Long l2 = c1993iw.f106309f;
        if ((i & 64) != 0) {
            l = c1993iw.f106310g;
        }
        c1993iw.getClass();
        return new C1993iw(wi7Var, str, str2, num, z, l2, l);
    }

    /* JADX INFO: renamed from: b */
    public final wi7 m51772b() {
        return this.f106304a;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m51773c() {
        return this.f106307d;
    }

    /* JADX INFO: renamed from: d */
    public final String m51774d() {
        return this.f106306c;
    }

    /* JADX INFO: renamed from: e */
    public final String m51775e() {
        return this.f106305b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if (java.util.Arrays.equals(r4.f59235b, r1.f59235b) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1993iw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C1993iw c1993iw = (C1993iw) obj;
        wi7 wi7Var = c1993iw.f106304a;
        wi7 wi7Var2 = this.f106304a;
        if (wi7Var2 != wi7Var) {
            if (wi7Var2.getClass().equals(wi7Var != null ? wi7.class : null) && wj50.m88271j(wi7Var2.f251542a, wi7Var.f251542a) && wj50.m88271j(wi7Var2.f251543b, wi7Var.f251543b)) {
                eg7 eg7Var = wi7Var2.f251544c;
                eg7 eg7Var2 = wi7Var.f251544c;
                if (!(eg7Var instanceof eg7)) {
                    eg7Var = null;
                }
                if (eg7Var != null) {
                    eg7 eg7Var3 = eg7Var2 instanceof eg7 ? eg7Var2 : null;
                    if (eg7Var3 != null) {
                        if (wj50.m88271j(eg7Var.f59234a, eg7Var3.f59234a)) {
                        }
                    }
                }
            }
            return false;
        }
        return wj50.m88271j(this.f106305b, c1993iw.f106305b) && wj50.m88271j(this.f106306c, c1993iw.f106306c) && wj50.m88271j(this.f106309f, c1993iw.f106309f);
    }

    /* JADX INFO: renamed from: f */
    public final Long m51776f() {
        return this.f106310g;
    }

    /* JADX INFO: renamed from: g */
    public final Long m51777g() {
        return this.f106309f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m51778h() {
        return this.f106308e;
    }

    public final int hashCode() {
        wi7 wi7Var = this.f106304a;
        int iHashCode = wi7Var.f251542a.hashCode() * 31;
        C1856fd c1856fd = wi7Var.f251543b;
        int iHashCode2 = (iHashCode + (c1856fd != null ? c1856fd.hashCode() : 0)) * 31;
        eg7 eg7Var = wi7Var.f251544c;
        eg7 eg7Var2 = eg7Var instanceof eg7 ? eg7Var : null;
        int iHashCode3 = (iHashCode2 + (eg7Var2 != null ? (eg7Var.f59234a.hashCode() * 31) + Arrays.hashCode(eg7Var2.f59235b) : eg7Var.hashCode())) * 31;
        String str = this.f106305b;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f106306c;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f106309f;
        return iHashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
    }

    public C1993iw(wi7 wi7Var, String str, String str2, Integer num, boolean z, Long l, Long l2) {
        this.f106304a = wi7Var;
        this.f106305b = str;
        this.f106306c = str2;
        this.f106307d = num;
        this.f106308e = z;
        this.f106309f = l;
        this.f106310g = l2;
    }
}
