package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ev00 implements jv00 {

    /* JADX INFO: renamed from: a */
    public final String f63116a;

    /* JADX INFO: renamed from: b */
    public final boolean f63117b;

    public ev00(String str, boolean z) {
        this.f63116a = str;
        this.f63117b = z;
    }

    @Override // p204p.jv00
    /* JADX INFO: renamed from: a */
    public final boolean mo40080a() {
        return this.f63117b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev00)) {
            return false;
        }
        ev00 ev00Var = (ev00) obj;
        return wj50.m88271j(this.f63116a, ev00Var.f63116a) && this.f63117b == ev00Var.f63117b;
    }

    public final int hashCode() {
        String str = this.f63116a;
        return Boolean.hashCode(this.f63117b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
