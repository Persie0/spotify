package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class crv0 implements i4e {

    /* JADX INFO: renamed from: a */
    public final String f41413a;

    /* JADX INFO: renamed from: b */
    public final boolean f41414b;

    public crv0(String str, boolean z) {
        this.f41413a = str;
        this.f41414b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crv0)) {
            return false;
        }
        crv0 crv0Var = (crv0) obj;
        return wj50.m88271j(this.f41413a, crv0Var.f41413a) && this.f41414b == crv0Var.f41414b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41414b) + (this.f41413a.hashCode() * 31);
    }
}
