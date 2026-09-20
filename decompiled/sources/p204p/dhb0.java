package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dhb0 implements fhb0 {

    /* JADX INFO: renamed from: a */
    public final int f49045a;

    /* JADX INFO: renamed from: b */
    public final boolean f49046b;

    public dhb0(int i, boolean z) {
        this.f49045a = i;
        this.f49046b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhb0)) {
            return false;
        }
        dhb0 dhb0Var = (dhb0) obj;
        return this.f49045a == dhb0Var.f49045a && this.f49046b == dhb0Var.f49046b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49046b) + (Integer.hashCode(this.f49045a) * 31);
    }
}
