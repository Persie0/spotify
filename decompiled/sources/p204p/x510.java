package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x510 extends v510 {

    /* JADX INFO: renamed from: a */
    public final String f258242a;

    /* JADX INFO: renamed from: b */
    public final String f258243b;

    /* JADX INFO: renamed from: c */
    public final boolean f258244c;

    public x510(String str, String str2, boolean z) {
        this.f258242a = str;
        this.f258243b = str2;
        this.f258244c = z;
    }

    @Override // p204p.v510
    /* JADX INFO: renamed from: a */
    public final String mo84671a() {
        return this.f258243b;
    }

    @Override // p204p.v510
    /* JADX INFO: renamed from: b */
    public final String mo84672b() {
        return this.f258242a;
    }

    @Override // p204p.v510
    /* JADX INFO: renamed from: c */
    public final boolean mo84673c() {
        return this.f258244c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x510)) {
            return false;
        }
        x510 x510Var = (x510) obj;
        return wj50.m88271j(this.f258242a, x510Var.f258242a) && wj50.m88271j(this.f258243b, x510Var.f258243b) && this.f258244c == x510Var.f258244c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258244c) + s571.m77243b(this.f258242a.hashCode() * 31, 31, this.f258243b);
    }
}
