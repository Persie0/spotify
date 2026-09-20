package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rt11 extends xt11 {

    /* JADX INFO: renamed from: a */
    public final boolean f202471a;

    /* JADX INFO: renamed from: b */
    public final boolean f202472b;

    public rt11(boolean z, boolean z2) {
        this.f202471a = z;
        this.f202472b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt11)) {
            return false;
        }
        rt11 rt11Var = (rt11) obj;
        return this.f202471a == rt11Var.f202471a && this.f202472b == rt11Var.f202472b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202472b) + (Boolean.hashCode(this.f202471a) * 31);
    }
}
