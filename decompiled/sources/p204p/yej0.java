package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yej0 {

    /* JADX INFO: renamed from: a */
    public final xul0 f272002a;

    /* JADX INFO: renamed from: b */
    public final xul0 f272003b;

    public yej0(xul0 xul0Var, xul0 xul0Var2) {
        this.f272002a = xul0Var;
        this.f272003b = xul0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yej0)) {
            return false;
        }
        yej0 yej0Var = (yej0) obj;
        return wj50.m88271j(this.f272002a, yej0Var.f272002a) && wj50.m88271j(this.f272003b, yej0Var.f272003b);
    }

    public final int hashCode() {
        return this.f272003b.hashCode() + (this.f272002a.hashCode() * 31);
    }
}
