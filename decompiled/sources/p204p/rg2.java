package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rg2 implements ug2 {

    /* JADX INFO: renamed from: a */
    public final adb1 f198800a;

    /* JADX INFO: renamed from: b */
    public final int f198801b;

    public rg2(adb1 adb1Var, int i) {
        this.f198800a = adb1Var;
        this.f198801b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg2)) {
            return false;
        }
        rg2 rg2Var = (rg2) obj;
        return this.f198800a == rg2Var.f198800a && this.f198801b == rg2Var.f198801b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f198801b) + (this.f198800a.hashCode() * 31);
    }
}
