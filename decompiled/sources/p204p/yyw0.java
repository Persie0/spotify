package p204p;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class yyw0 {
    public static final xyw0 Companion = new xyw0();

    /* JADX INFO: renamed from: a */
    public final String f277592a;

    /* JADX INFO: renamed from: b */
    public final String f277593b;

    /* JADX INFO: renamed from: c */
    public final String f277594c;

    /* JADX INFO: renamed from: d */
    public final byo0 f277595d;

    /* JADX INFO: renamed from: e */
    public final String f277596e;

    /* JADX INFO: renamed from: f */
    public final boolean f277597f;

    /* JADX INFO: renamed from: g */
    public final boolean f277598g;

    public /* synthetic */ yyw0(int i, String str, String str2, String str3, byo0 byo0Var, String str4, boolean z, boolean z2) {
        if (127 != (i & 127)) {
            edo.m38617p(i, 127, wyw0.f256367a.getDescriptor());
            throw null;
        }
        this.f277592a = str;
        this.f277593b = str2;
        this.f277594c = str3;
        this.f277595d = byo0Var;
        this.f277596e = str4;
        this.f277597f = z;
        this.f277598g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyw0)) {
            return false;
        }
        yyw0 yyw0Var = (yyw0) obj;
        return wj50.m88271j(this.f277592a, yyw0Var.f277592a) && wj50.m88271j(this.f277593b, yyw0Var.f277593b) && wj50.m88271j(this.f277594c, yyw0Var.f277594c) && wj50.m88271j(this.f277595d, yyw0Var.f277595d) && wj50.m88271j(this.f277596e, yyw0Var.f277596e) && this.f277597f == yyw0Var.f277597f && this.f277598g == yyw0Var.f277598g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277598g) + s571.m77245d(s571.m77243b((this.f277595d.hashCode() + s571.m77243b(s571.m77243b(this.f277592a.hashCode() * 31, 31, this.f277593b), 31, this.f277594c)) * 31, 31, this.f277596e), 31, this.f277597f);
    }
}
