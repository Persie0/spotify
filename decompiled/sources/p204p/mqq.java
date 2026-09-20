package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mqq {

    /* JADX INFO: renamed from: a */
    public final String f146335a;

    /* JADX INFO: renamed from: b */
    public final String f146336b;

    /* JADX INFO: renamed from: c */
    public final String f146337c;

    /* JADX INFO: renamed from: d */
    public final int f146338d;

    /* JADX INFO: renamed from: e */
    public final String f146339e;

    /* JADX INFO: renamed from: f */
    public final int f146340f;

    /* JADX INFO: renamed from: g */
    public final boolean f146341g;

    public mqq(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.f146335a = str;
        this.f146336b = str2;
        this.f146337c = str3;
        this.f146338d = i;
        this.f146339e = str4;
        this.f146340f = i2;
        this.f146341g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqq)) {
            return false;
        }
        mqq mqqVar = (mqq) obj;
        return wj50.m88271j(this.f146335a, mqqVar.f146335a) && wj50.m88271j(this.f146336b, mqqVar.f146336b) && wj50.m88271j(this.f146337c, mqqVar.f146337c) && this.f146338d == mqqVar.f146338d && wj50.m88271j(this.f146339e, mqqVar.f146339e) && this.f146340f == mqqVar.f146340f && this.f146341g == mqqVar.f146341g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146341g) + mt60.m62800g(this.f146340f, s571.m77243b(f710.m40938f(this.f146338d, s571.m77243b(s571.m77243b(this.f146335a.hashCode() * 31, 31, this.f146336b), 31, this.f146337c), 31), 31, this.f146339e), 31);
    }
}
