package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f77153a;

    /* JADX INFO: renamed from: b */
    public final ss8 f77154b;

    public g71(String str, ss8 ss8Var) {
        this.f77153a = str;
        this.f77154b = ss8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g71)) {
            return false;
        }
        g71 g71Var = (g71) obj;
        return wj50.m88271j(this.f77153a, g71Var.f77153a) && this.f77154b == g71Var.f77154b;
    }

    public final int hashCode() {
        return this.f77154b.hashCode() + (this.f77153a.hashCode() * 31);
    }
}
