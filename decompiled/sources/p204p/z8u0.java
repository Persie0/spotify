package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z8u0 {

    /* JADX INFO: renamed from: a */
    public final String f280568a;

    /* JADX INFO: renamed from: b */
    public final Integer f280569b;

    public z8u0(Integer num, String str) {
        this.f280568a = str;
        this.f280569b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8u0)) {
            return false;
        }
        z8u0 z8u0Var = (z8u0) obj;
        return wj50.m88271j(this.f280568a, z8u0Var.f280568a) && wj50.m88271j(this.f280569b, z8u0Var.f280569b);
    }

    public final int hashCode() {
        int iHashCode = this.f280568a.hashCode() * 31;
        Integer num = this.f280569b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
