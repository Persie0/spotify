package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class u570 {

    /* JADX INFO: renamed from: a */
    public final wi7 f226927a;

    /* JADX INFO: renamed from: b */
    public final String f226928b;

    /* JADX INFO: renamed from: c */
    public final String f226929c;

    /* JADX INFO: renamed from: d */
    public final boolean f226930d;

    /* JADX INFO: renamed from: e */
    public final Long f226931e;

    /* JADX INFO: renamed from: f */
    public final Long f226932f;

    public /* synthetic */ u570(wi7 wi7Var, Long l, int i) {
        this(wi7Var, null, null, false, null, (i & 32) != 0 ? null : l);
    }

    /* JADX INFO: renamed from: a */
    public static u570 m82400a(u570 u570Var, wi7 wi7Var, Long l, int i) {
        String str = u570Var.f226928b;
        String str2 = u570Var.f226929c;
        boolean z = u570Var.f226930d;
        Long l2 = u570Var.f226931e;
        if ((i & 32) != 0) {
            l = u570Var.f226932f;
        }
        return new u570(wi7Var, str, str2, z, l2, l);
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
        if (!u570.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        u570 u570Var = (u570) obj;
        wi7 wi7Var = u570Var.f226927a;
        wi7 wi7Var2 = this.f226927a;
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
        return wj50.m88271j(this.f226928b, u570Var.f226928b) && wj50.m88271j(this.f226929c, u570Var.f226929c) && wj50.m88271j(this.f226931e, u570Var.f226931e);
    }

    public final int hashCode() {
        int iHashCode;
        wi7 wi7Var = this.f226927a;
        int iHashCode2 = wi7Var.f251542a.hashCode() * 31;
        C1856fd c1856fd = wi7Var.f251543b;
        int iHashCode3 = (iHashCode2 + (c1856fd != null ? c1856fd.hashCode() : 0)) * 31;
        eg7 eg7Var = wi7Var.f251544c;
        eg7 eg7Var2 = eg7Var instanceof eg7 ? eg7Var : null;
        if (eg7Var2 != null) {
            iHashCode = Arrays.hashCode(eg7Var2.f59235b) + (eg7Var.f59234a.hashCode() * 31);
        } else {
            iHashCode = eg7Var.hashCode();
        }
        int i = (iHashCode3 + iHashCode) * 31;
        String str = this.f226928b;
        int iHashCode4 = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f226929c;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f226931e;
        return iHashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
    }

    public u570(wi7 wi7Var, String str, String str2, boolean z, Long l, Long l2) {
        this.f226927a = wi7Var;
        this.f226928b = str;
        this.f226929c = str2;
        this.f226930d = z;
        this.f226931e = l;
        this.f226932f = l2;
    }
}
