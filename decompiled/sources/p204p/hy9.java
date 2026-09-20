package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hy9 implements iy9 {

    /* JADX INFO: renamed from: a */
    public final mzq f96503a;

    /* JADX INFO: renamed from: b */
    public final String f96504b;

    public hy9(mzq mzqVar, String str) {
        this.f96503a = mzqVar;
        this.f96504b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy9)) {
            return false;
        }
        hy9 hy9Var = (hy9) obj;
        return this.f96503a == hy9Var.f96503a && wj50.m88271j(this.f96504b, hy9Var.f96504b);
    }

    public final int hashCode() {
        int iHashCode = this.f96503a.hashCode() * 31;
        String str = this.f96504b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
