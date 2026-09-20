package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ame0 {

    /* JADX INFO: renamed from: a */
    public final String f17115a;

    /* JADX INFO: renamed from: b */
    public final String f17116b;

    /* JADX INFO: renamed from: c */
    public final String f17117c;

    /* JADX INFO: renamed from: d */
    public final String f17118d;

    /* JADX INFO: renamed from: e */
    public final wwu f17119e;

    /* JADX INFO: renamed from: f */
    public final boolean f17120f;

    /* JADX INFO: renamed from: g */
    public final boolean f17121g;

    /* JADX INFO: renamed from: h */
    public final boolean f17122h;

    /* JADX INFO: renamed from: i */
    public final zle0 f17123i;

    /* JADX INFO: renamed from: j */
    public final boolean f17124j;

    /* JADX INFO: renamed from: k */
    public final gh00 f17125k;

    public ame0(String str, String str2, String str3, String str4, wwu wwuVar, boolean z, boolean z2, boolean z3, zle0 zle0Var, boolean z4, gh00 gh00Var) {
        this.f17115a = str;
        this.f17116b = str2;
        this.f17117c = str3;
        this.f17118d = str4;
        this.f17119e = wwuVar;
        this.f17120f = z;
        this.f17121g = z2;
        this.f17122h = z3;
        this.f17123i = zle0Var;
        this.f17124j = z4;
        this.f17125k = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ame0)) {
            return false;
        }
        ame0 ame0Var = (ame0) obj;
        return wj50.m88271j(this.f17115a, ame0Var.f17115a) && wj50.m88271j(this.f17116b, ame0Var.f17116b) && wj50.m88271j(this.f17117c, ame0Var.f17117c) && wj50.m88271j(this.f17118d, ame0Var.f17118d) && wj50.m88271j(this.f17119e, ame0Var.f17119e) && this.f17120f == ame0Var.f17120f && this.f17121g == ame0Var.f17121g && this.f17122h == ame0Var.f17122h && wj50.m88271j(this.f17123i, ame0Var.f17123i) && this.f17124j == ame0Var.f17124j && wj50.m88271j(this.f17125k, ame0Var.f17125k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f17115a.hashCode() * 31, 31, this.f17116b), 31, this.f17117c), 31, this.f17118d);
        wwu wwuVar = this.f17119e;
        return this.f17125k.hashCode() + s571.m77245d((this.f17123i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31, 31, this.f17120f), 31, this.f17121g), 31, this.f17122h)) * 31, 31, this.f17124j);
    }
}
