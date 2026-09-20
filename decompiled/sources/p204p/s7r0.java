package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes6.dex */
public final class s7r0 {

    /* JADX INFO: renamed from: a */
    public final String f206463a;

    /* JADX INFO: renamed from: b */
    public final String f206464b;

    /* JADX INFO: renamed from: c */
    public final int f206465c;

    /* JADX INFO: renamed from: d */
    public final r7r0 f206466d;

    /* JADX INFO: renamed from: e */
    public final q7r0 f206467e;

    /* JADX INFO: renamed from: f */
    public final PlayabilityRestriction f206468f;

    public s7r0(String str, String str2, int i, r7r0 r7r0Var, q7r0 q7r0Var, PlayabilityRestriction playabilityRestriction) {
        this.f206463a = str;
        this.f206464b = str2;
        this.f206465c = i;
        this.f206466d = r7r0Var;
        this.f206467e = q7r0Var;
        this.f206468f = playabilityRestriction;
    }

    /* JADX INFO: renamed from: a */
    public static s7r0 m77390a(s7r0 s7r0Var, String str, String str2, r7r0 r7r0Var, q7r0 q7r0Var, PlayabilityRestriction playabilityRestriction, int i) {
        if ((i & 1) != 0) {
            str = s7r0Var.f206463a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = s7r0Var.f206464b;
        }
        String str4 = str2;
        int i2 = (i & 4) != 0 ? s7r0Var.f206465c : 1;
        if ((i & 8) != 0) {
            r7r0Var = s7r0Var.f206466d;
        }
        r7r0 r7r0Var2 = r7r0Var;
        if ((i & 16) != 0) {
            q7r0Var = s7r0Var.f206467e;
        }
        q7r0 q7r0Var2 = q7r0Var;
        if ((i & 32) != 0) {
            playabilityRestriction = s7r0Var.f206468f;
        }
        s7r0Var.getClass();
        return new s7r0(str3, str4, i2, r7r0Var2, q7r0Var2, playabilityRestriction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7r0)) {
            return false;
        }
        s7r0 s7r0Var = (s7r0) obj;
        return wj50.m88271j(this.f206463a, s7r0Var.f206463a) && wj50.m88271j(this.f206464b, s7r0Var.f206464b) && this.f206465c == s7r0Var.f206465c && wj50.m88271j(this.f206466d, s7r0Var.f206466d) && wj50.m88271j(this.f206467e, s7r0Var.f206467e) && this.f206468f == s7r0Var.f206468f;
    }

    public final int hashCode() {
        return this.f206468f.hashCode() + ((this.f206467e.hashCode() + ((this.f206466d.hashCode() + f710.m40938f(this.f206465c, s571.m77243b(this.f206463a.hashCode() * 31, 31, this.f206464b), 31)) * 31)) * 31);
    }
}
