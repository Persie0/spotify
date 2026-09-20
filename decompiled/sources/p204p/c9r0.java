package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c9r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f35623a;

    /* JADX INFO: renamed from: b */
    public final boolean f35624b;

    /* JADX INFO: renamed from: c */
    public final boolean f35625c;

    public c9r0(String str, boolean z, boolean z2) {
        this.f35623a = str;
        this.f35624b = z;
        this.f35625c = z2;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return "";
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f35625c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9r0)) {
            return false;
        }
        c9r0 c9r0Var = (c9r0) obj;
        return wj50.m88271j(this.f35623a, c9r0Var.f35623a) && this.f35624b == c9r0Var.f35624b && this.f35625c == c9r0Var.f35625c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35625c) + s571.m77245d(this.f35623a.hashCode() * 961, 31, this.f35624b);
    }
}
