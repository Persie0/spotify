package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b9r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f24987a;

    /* JADX INFO: renamed from: b */
    public final boolean f24988b;

    /* JADX INFO: renamed from: c */
    public final boolean f24989c;

    public b9r0(String str, boolean z, boolean z2) {
        this.f24987a = str;
        this.f24988b = z;
        this.f24989c = z2;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return "";
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f24989c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9r0)) {
            return false;
        }
        b9r0 b9r0Var = (b9r0) obj;
        return wj50.m88271j(this.f24987a, b9r0Var.f24987a) && this.f24988b == b9r0Var.f24988b && this.f24989c == b9r0Var.f24989c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24989c) + s571.m77245d(this.f24987a.hashCode() * 961, 31, this.f24988b);
    }
}
