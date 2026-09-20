package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bbd1 {

    /* JADX INFO: renamed from: a */
    public final vsb1 f25539a;

    /* JADX INFO: renamed from: b */
    public final String f25540b;

    /* JADX INFO: renamed from: c */
    public final boolean f25541c;

    public bbd1(vsb1 vsb1Var, String str, boolean z) {
        this.f25539a = vsb1Var;
        this.f25540b = str;
        this.f25541c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbd1)) {
            return false;
        }
        bbd1 bbd1Var = (bbd1) obj;
        return wj50.m88271j(this.f25539a, bbd1Var.f25539a) && wj50.m88271j(this.f25540b, bbd1Var.f25540b) && this.f25541c == bbd1Var.f25541c;
    }

    public final int hashCode() {
        vsb1 vsb1Var = this.f25539a;
        return Boolean.hashCode(this.f25541c) + s571.m77243b((vsb1Var == null ? 0 : vsb1Var.hashCode()) * 31, 31, this.f25540b);
    }
}
