package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iv00 implements jv00 {

    /* JADX INFO: renamed from: a */
    public final String f106060a;

    /* JADX INFO: renamed from: b */
    public final boolean f106061b;

    public iv00(String str, boolean z) {
        this.f106060a = str;
        this.f106061b = z;
    }

    @Override // p204p.jv00
    /* JADX INFO: renamed from: a */
    public final boolean mo40080a() {
        return this.f106061b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv00)) {
            return false;
        }
        iv00 iv00Var = (iv00) obj;
        return wj50.m88271j(this.f106060a, iv00Var.f106060a) && this.f106061b == iv00Var.f106061b;
    }

    public final int hashCode() {
        String str = this.f106060a;
        return Boolean.hashCode(this.f106061b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
