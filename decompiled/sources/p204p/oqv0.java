package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oqv0 {

    /* JADX INFO: renamed from: a */
    public final String f168390a;

    /* JADX INFO: renamed from: b */
    public final int f168391b;

    public oqv0(String str, int i) {
        this.f168390a = str;
        this.f168391b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqv0)) {
            return false;
        }
        oqv0 oqv0Var = (oqv0) obj;
        return this.f168390a.equals(oqv0Var.f168390a) && this.f168391b == oqv0Var.f168391b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168391b) + (this.f168390a.hashCode() * 31);
    }
}
