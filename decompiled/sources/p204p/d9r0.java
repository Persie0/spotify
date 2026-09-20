package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d9r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f46888a;

    /* JADX INFO: renamed from: b */
    public final boolean f46889b;

    /* JADX INFO: renamed from: c */
    public final boolean f46890c;

    public d9r0(String str, boolean z, boolean z2) {
        this.f46888a = str;
        this.f46889b = z;
        this.f46890c = z2;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return "";
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f46890c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9r0)) {
            return false;
        }
        d9r0 d9r0Var = (d9r0) obj;
        return wj50.m88271j(this.f46888a, d9r0Var.f46888a) && this.f46889b == d9r0Var.f46889b && this.f46890c == d9r0Var.f46890c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46890c) + s571.m77245d(this.f46888a.hashCode() * 961, 31, this.f46889b);
    }
}
