package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes5.dex */
public final class j46 {

    /* JADX INFO: renamed from: a */
    public final String f108599a;

    /* JADX INFO: renamed from: b */
    public final String f108600b;

    /* JADX INFO: renamed from: c */
    public final String f108601c;

    /* JADX INFO: renamed from: d */
    public final boolean f108602d;

    /* JADX INFO: renamed from: e */
    public final boolean f108603e;

    /* JADX INFO: renamed from: f */
    public final boolean f108604f;

    /* JADX INFO: renamed from: g */
    public final PlayabilityRestriction f108605g;

    /* JADX INFO: renamed from: h */
    public final String f108606h;

    /* JADX INFO: renamed from: i */
    public final String f108607i;

    /* JADX INFO: renamed from: j */
    public final w9s f108608j;

    public j46(String str, String str2, String str3, boolean z, boolean z2, boolean z3, PlayabilityRestriction playabilityRestriction, String str4, String str5, w9s w9sVar) {
        this.f108599a = str;
        this.f108600b = str2;
        this.f108601c = str3;
        this.f108602d = z;
        this.f108603e = z2;
        this.f108604f = z3;
        this.f108605g = playabilityRestriction;
        this.f108606h = str4;
        this.f108607i = str5;
        this.f108608j = w9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j46)) {
            return false;
        }
        j46 j46Var = (j46) obj;
        return wj50.m88271j(this.f108599a, j46Var.f108599a) && wj50.m88271j(this.f108600b, j46Var.f108600b) && wj50.m88271j(this.f108601c, j46Var.f108601c) && this.f108602d == j46Var.f108602d && this.f108603e == j46Var.f108603e && this.f108604f == j46Var.f108604f && this.f108605g == j46Var.f108605g && wj50.m88271j(this.f108606h, j46Var.f108606h) && wj50.m88271j(this.f108607i, j46Var.f108607i) && this.f108608j == j46Var.f108608j;
    }

    public final int hashCode() {
        return this.f108608j.hashCode() + s571.m77243b(s571.m77243b((this.f108605g.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f108599a.hashCode() * 31, 31, this.f108600b), 31, this.f108601c), 31, this.f108602d), 31, this.f108603e), 31, this.f108604f)) * 31, 31, this.f108606h), 31, this.f108607i);
    }
}
