package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pna0 extends tna0 {

    /* JADX INFO: renamed from: a */
    public final String f179353a;

    /* JADX INFO: renamed from: b */
    public final boolean f179354b;

    public pna0(String str, boolean z) {
        this.f179353a = str;
        this.f179354b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pna0)) {
            return false;
        }
        pna0 pna0Var = (pna0) obj;
        return wj50.m88271j(this.f179353a, pna0Var.f179353a) && this.f179354b == pna0Var.f179354b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179354b) + (this.f179353a.hashCode() * 31);
    }
}
