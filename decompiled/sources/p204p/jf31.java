package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jf31 {

    /* JADX INFO: renamed from: a */
    public final Boolean f111818a;

    /* JADX INFO: renamed from: b */
    public final Boolean f111819b;

    public jf31(Boolean bool, Boolean bool2) {
        this.f111818a = bool;
        this.f111819b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf31)) {
            return false;
        }
        jf31 jf31Var = (jf31) obj;
        return wj50.m88271j(this.f111818a, jf31Var.f111818a) && wj50.m88271j(this.f111819b, jf31Var.f111819b);
    }

    public final int hashCode() {
        Boolean bool = this.f111818a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f111819b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
