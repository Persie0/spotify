package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z9c1 implements bac1 {

    /* JADX INFO: renamed from: a */
    public final String f280743a;

    /* JADX INFO: renamed from: b */
    public final boolean f280744b;

    public z9c1(String str, boolean z) {
        this.f280743a = str;
        this.f280744b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9c1)) {
            return false;
        }
        z9c1 z9c1Var = (z9c1) obj;
        return wj50.m88271j(this.f280743a, z9c1Var.f280743a) && this.f280744b == z9c1Var.f280744b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280744b) + (this.f280743a.hashCode() * 31);
    }
}
