package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r5a0 implements s5a0 {

    /* JADX INFO: renamed from: a */
    public final String f196005a;

    /* JADX INFO: renamed from: b */
    public final String f196006b;

    public r5a0(String str, String str2) {
        this.f196005a = str;
        this.f196006b = str2;
    }

    @Override // p204p.s5a0
    /* JADX INFO: renamed from: a */
    public final String mo72192a() {
        return this.f196005a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5a0)) {
            return false;
        }
        r5a0 r5a0Var = (r5a0) obj;
        return wj50.m88271j(this.f196005a, r5a0Var.f196005a) && wj50.m88271j(this.f196006b, r5a0Var.f196006b);
    }

    @Override // p204p.s5a0
    public final String getUri() {
        return this.f196006b;
    }

    public final int hashCode() {
        return this.f196006b.hashCode() + (this.f196005a.hashCode() * 31);
    }
}
