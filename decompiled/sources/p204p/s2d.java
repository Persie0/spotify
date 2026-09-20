package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class s2d {

    /* JADX INFO: renamed from: a */
    public final int f204982a;

    /* JADX INFO: renamed from: b */
    public final String f204983b;

    /* JADX INFO: renamed from: c */
    public final String f204984c;

    /* JADX INFO: renamed from: d */
    public final String f204985d;

    /* JADX INFO: renamed from: e */
    public final String f204986e;

    /* JADX INFO: renamed from: f */
    public final String f204987f;

    /* JADX INFO: renamed from: g */
    public final long f204988g;

    /* JADX INFO: renamed from: h */
    public final pla1 f204989h;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public s2d(int i, String str, String str2, String str3, String str4, String str5, long j, pla1 pla1Var) {
        this.f204982a = i;
        this.f204983b = str;
        this.f204984c = str2;
        this.f204985d = str3;
        this.f204986e = str4;
        this.f204987f = str5;
        this.f204988g = j;
        this.f204989h = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2d)) {
            return false;
        }
        s2d s2dVar = (s2d) obj;
        return this.f204982a == s2dVar.f204982a && wj50.m88271j(this.f204983b, s2dVar.f204983b) && wj50.m88271j(this.f204984c, s2dVar.f204984c) && wj50.m88271j(this.f204985d, s2dVar.f204985d) && wj50.m88271j(this.f204986e, s2dVar.f204986e) && wj50.m88271j(this.f204987f, s2dVar.f204987f) && this.f204988g == s2dVar.f204988g && wj50.m88271j(this.f204989h, s2dVar.f204989h);
    }

    public final int hashCode() {
        return this.f204989h.hashCode() + dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f204982a) * 31, 31, this.f204983b), 31, this.f204984c), 31, this.f204985d), 31, this.f204986e), 31, this.f204987f), this.f204988g, 31);
    }
}
