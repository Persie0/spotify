package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class unb0 {

    /* JADX INFO: renamed from: a */
    public final String f232125a;

    /* JADX INFO: renamed from: b */
    public final String f232126b;

    /* JADX INFO: renamed from: c */
    public final vdb0 f232127c;

    /* JADX INFO: renamed from: d */
    public final boolean f232128d;

    /* JADX INFO: renamed from: e */
    public final sab0 f232129e;

    /* JADX INFO: renamed from: f */
    public final int f232130f;

    /* JADX INFO: renamed from: g */
    public final boolean f232131g;

    public unb0(int i, String str, String str2, sab0 sab0Var, vdb0 vdb0Var, boolean z, boolean z2) {
        this.f232125a = str;
        this.f232126b = str2;
        this.f232127c = vdb0Var;
        this.f232128d = z;
        this.f232129e = sab0Var;
        this.f232130f = i;
        this.f232131g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unb0)) {
            return false;
        }
        unb0 unb0Var = (unb0) obj;
        return wj50.m88271j(this.f232125a, unb0Var.f232125a) && wj50.m88271j(this.f232126b, unb0Var.f232126b) && this.f232127c == unb0Var.f232127c && this.f232128d == unb0Var.f232128d && wj50.m88271j(this.f232129e, unb0Var.f232129e) && this.f232130f == unb0Var.f232130f && this.f232131g == unb0Var.f232131g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232131g) + f710.m40938f(this.f232130f, (this.f232129e.hashCode() + s571.m77245d((this.f232127c.hashCode() + s571.m77243b(this.f232125a.hashCode() * 31, 31, this.f232126b)) * 31, 31, this.f232128d)) * 31, 31);
    }
}
