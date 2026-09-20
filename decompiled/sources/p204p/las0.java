package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class las0 {

    /* JADX INFO: renamed from: a */
    public final kas0 f131403a;

    /* JADX INFO: renamed from: b */
    public final long f131404b;

    /* JADX INFO: renamed from: c */
    public final long f131405c;

    /* JADX INFO: renamed from: d */
    public final long f131406d;

    /* JADX INFO: renamed from: e */
    public final boolean f131407e;

    /* JADX INFO: renamed from: f */
    public final long f131408f;

    /* JADX INFO: renamed from: g */
    public final long f131409g;

    /* JADX INFO: renamed from: h */
    public final long f131410h;

    /* JADX INFO: renamed from: i */
    public final boolean f131411i;

    public las0(kas0 kas0Var, long j, long j2, long j3, boolean z, long j4, long j5, long j6, boolean z2) {
        this.f131403a = kas0Var;
        this.f131404b = j;
        this.f131405c = j2;
        this.f131406d = j3;
        this.f131407e = z;
        this.f131408f = j4;
        this.f131409g = j5;
        this.f131410h = j6;
        this.f131411i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof las0)) {
            return false;
        }
        las0 las0Var = (las0) obj;
        if (this.f131403a != las0Var.f131403a) {
            return false;
        }
        long j = las0Var.f131404b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f131404b, j) && as91.m27074b(this.f131405c, las0Var.f131405c) && as91.m27074b(this.f131406d, las0Var.f131406d) && this.f131407e == las0Var.f131407e && as91.m27074b(this.f131408f, las0Var.f131408f) && as91.m27074b(this.f131409g, las0Var.f131409g) && as91.m27074b(this.f131410h, las0Var.f131410h) && this.f131411i == las0Var.f131411i;
    }

    public final int hashCode() {
        int iHashCode = this.f131403a.hashCode() * 31;
        int i = n6f.f150872l;
        return Boolean.hashCode(this.f131411i) + dq60.m36605e(dq60.m36605e(dq60.m36605e(s571.m77245d(dq60.m36605e(dq60.m36605e(dq60.m36605e(iHashCode, this.f131404b, 31), this.f131405c, 31), this.f131406d, 31), 31, this.f131407e), this.f131408f, 31), this.f131409g, 31), this.f131410h, 31);
    }
}
