package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bv9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f31308a;

    /* JADX INFO: renamed from: b */
    public final String f31309b;

    public bv9(String str, String str2) {
        this.f31308a = str;
        this.f31309b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv9)) {
            return false;
        }
        bv9 bv9Var = (bv9) obj;
        return wj50.m88271j(this.f31308a, bv9Var.f31308a) && wj50.m88271j(this.f31309b, bv9Var.f31309b);
    }

    public final int hashCode() {
        return this.f31309b.hashCode() + (this.f31308a.hashCode() * 31);
    }
}
