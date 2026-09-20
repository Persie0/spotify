package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ae3 extends s95 {

    /* JADX INFO: renamed from: j */
    public final String f14732j;

    /* JADX INFO: renamed from: k */
    public final boolean f14733k;

    /* JADX INFO: renamed from: l */
    public final String f14734l;

    /* JADX INFO: renamed from: m */
    public final z650 f14735m;

    public ae3(String str, boolean z, String str2, z650 z650Var) {
        this.f14732j = str;
        this.f14733k = z;
        this.f14734l = str2;
        this.f14735m = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae3)) {
            return false;
        }
        ae3 ae3Var = (ae3) obj;
        return wj50.m88271j(this.f14732j, ae3Var.f14732j) && this.f14733k == ae3Var.f14733k && wj50.m88271j(this.f14734l, ae3Var.f14734l) && wj50.m88271j(this.f14735m, ae3Var.f14735m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(this.f14732j.hashCode() * 31, 31, this.f14733k), 31, this.f14734l);
        z650 z650Var = this.f14735m;
        return iM77243b + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
