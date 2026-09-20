package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yyc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f277465a;

    /* JADX INFO: renamed from: b */
    public final b250 f277466b;

    /* JADX INFO: renamed from: c */
    public final String f277467c;

    /* JADX INFO: renamed from: d */
    public final String f277468d;

    /* JADX INFO: renamed from: e */
    public final String f277469e;

    /* JADX INFO: renamed from: f */
    public final boolean f277470f;

    public /* synthetic */ yyc0(String str, String str2, String str3, String str4) {
        this(str, null, str2, str3, str4, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyc0)) {
            return false;
        }
        yyc0 yyc0Var = (yyc0) obj;
        return wj50.m88271j(this.f277465a, yyc0Var.f277465a) && wj50.m88271j(this.f277466b, yyc0Var.f277466b) && wj50.m88271j(this.f277467c, yyc0Var.f277467c) && wj50.m88271j(this.f277468d, yyc0Var.f277468d) && wj50.m88271j(this.f277469e, yyc0Var.f277469e) && this.f277470f == yyc0Var.f277470f;
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f277465a;
    }

    public final int hashCode() {
        int iHashCode = this.f277465a.hashCode() * 31;
        b250 b250Var = this.f277466b;
        return Boolean.hashCode(this.f277470f) + s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (b250Var == null ? 0 : b250Var.hashCode())) * 31, 31, this.f277467c), 31, this.f277468d), 31, this.f277469e);
    }

    public yyc0(String str, b250 b250Var, String str2, String str3, String str4, boolean z) {
        this.f277465a = str;
        this.f277466b = b250Var;
        this.f277467c = str2;
        this.f277468d = str3;
        this.f277469e = str4;
        this.f277470f = z;
    }
}
