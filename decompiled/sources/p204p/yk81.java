package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yk81 {

    /* JADX INFO: renamed from: a */
    public final String f273639a;

    /* JADX INFO: renamed from: b */
    public final String f273640b;

    /* JADX INFO: renamed from: c */
    public final String f273641c;

    /* JADX INFO: renamed from: d */
    public final boolean f273642d;

    /* JADX INFO: renamed from: e */
    public final boolean f273643e;

    /* JADX INFO: renamed from: f */
    public final cg21 f273644f;

    public yk81(String str, String str2, String str3, boolean z, boolean z2, cg21 cg21Var) {
        this.f273639a = str;
        this.f273640b = str2;
        this.f273641c = str3;
        this.f273642d = z;
        this.f273643e = z2;
        this.f273644f = cg21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk81)) {
            return false;
        }
        yk81 yk81Var = (yk81) obj;
        return wj50.m88271j(this.f273639a, yk81Var.f273639a) && wj50.m88271j(this.f273640b, yk81Var.f273640b) && wj50.m88271j(this.f273641c, yk81Var.f273641c) && this.f273642d == yk81Var.f273642d && this.f273643e == yk81Var.f273643e && wj50.m88271j(this.f273644f, yk81Var.f273644f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f273639a.hashCode() * 31, 31, this.f273640b);
        String str = this.f273641c;
        return this.f273644f.hashCode() + s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f273642d), 31, this.f273643e);
    }
}
