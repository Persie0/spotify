package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a9r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f13626a;

    /* JADX INFO: renamed from: b */
    public final String f13627b;

    /* JADX INFO: renamed from: c */
    public final boolean f13628c;

    /* JADX INFO: renamed from: d */
    public final boolean f13629d;

    /* JADX INFO: renamed from: e */
    public final boolean f13630e;

    /* JADX INFO: renamed from: f */
    public final qsj f13631f;

    public a9r0(String str, String str2, boolean z, boolean z2, boolean z3, qsj qsjVar) {
        this.f13626a = str;
        this.f13627b = str2;
        this.f13628c = z;
        this.f13629d = z2;
        this.f13630e = z3;
        this.f13631f = qsjVar;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return this.f13627b;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f13629d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9r0)) {
            return false;
        }
        a9r0 a9r0Var = (a9r0) obj;
        return wj50.m88271j(this.f13626a, a9r0Var.f13626a) && wj50.m88271j(this.f13627b, a9r0Var.f13627b) && this.f13628c == a9r0Var.f13628c && this.f13629d == a9r0Var.f13629d && this.f13630e == a9r0Var.f13630e && this.f13631f == a9r0Var.f13631f;
    }

    public final int hashCode() {
        return this.f13631f.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f13626a.hashCode() * 31, 31, this.f13627b), 31, this.f13628c), 31, this.f13629d), 31, this.f13630e);
    }
}
