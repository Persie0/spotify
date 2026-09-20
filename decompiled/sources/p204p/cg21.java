package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class cg21 {

    /* JADX INFO: renamed from: a */
    public final k7i0 f37537a;

    /* JADX INFO: renamed from: b */
    public final int f37538b;

    /* JADX INFO: renamed from: c */
    public final long f37539c;

    /* JADX INFO: renamed from: d */
    public final long f37540d;

    /* JADX INFO: renamed from: e */
    public final long f37541e;

    /* JADX INFO: renamed from: f */
    public final float f37542f;

    /* JADX INFO: renamed from: g */
    public final boolean f37543g;

    /* JADX INFO: renamed from: h */
    public final ig21 f37544h;

    /* JADX INFO: renamed from: i */
    public final jg21 f37545i;

    public /* synthetic */ cg21() {
        this(null, 0, 0L, 0L, 0L, 0.0f, true, fg21.f69183a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg21)) {
            return false;
        }
        cg21 cg21Var = (cg21) obj;
        return wj50.m88271j(this.f37537a, cg21Var.f37537a) && this.f37538b == cg21Var.f37538b && this.f37539c == cg21Var.f37539c && this.f37540d == cg21Var.f37540d && this.f37541e == cg21Var.f37541e && Float.compare(this.f37542f, cg21Var.f37542f) == 0 && this.f37543g == cg21Var.f37543g && wj50.m88271j(this.f37544h, cg21Var.f37544h) && wj50.m88271j(this.f37545i, cg21Var.f37545i);
    }

    public final int hashCode() {
        k7i0 k7i0Var = this.f37537a;
        int iHashCode = (k7i0Var == null ? 0 : k7i0Var.hashCode()) * 31;
        int i = this.f37538b;
        int iHashCode2 = (this.f37544h.hashCode() + s571.m77245d(AbstractC0000a.m8g(dq60.m36605e(dq60.m36605e(dq60.m36605e((iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31, this.f37539c, 31), this.f37540d, 31), this.f37541e, 31), 31, this.f37542f), 31, this.f37543g)) * 31;
        jg21 jg21Var = this.f37545i;
        return iHashCode2 + (jg21Var != null ? jg21Var.hashCode() : 0);
    }

    public cg21(k7i0 k7i0Var, int i, long j, long j2, long j3, float f, boolean z, ig21 ig21Var, jg21 jg21Var) {
        this.f37537a = k7i0Var;
        this.f37538b = i;
        this.f37539c = j;
        this.f37540d = j2;
        this.f37541e = j3;
        this.f37542f = f;
        this.f37543g = z;
        this.f37544h = ig21Var;
        this.f37545i = jg21Var;
    }
}
