package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ccj {

    /* JADX INFO: renamed from: a */
    public final hw21 f36419a;

    /* JADX INFO: renamed from: b */
    public final boolean f36420b;

    public ccj(hw21 hw21Var, boolean z) {
        this.f36419a = hw21Var;
        this.f36420b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccj)) {
            return false;
        }
        ccj ccjVar = (ccj) obj;
        return wj50.m88271j(this.f36419a, ccjVar.f36419a) && this.f36420b == ccjVar.f36420b;
    }

    public final int hashCode() {
        hw21 hw21Var = this.f36419a;
        return Boolean.hashCode(this.f36420b) + ((hw21Var == null ? 0 : hw21Var.hashCode()) * 31);
    }
}
