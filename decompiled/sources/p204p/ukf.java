package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ukf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f231281a;

    /* JADX INFO: renamed from: b */
    public final hp7 f231282b;

    /* JADX INFO: renamed from: c */
    public final z650 f231283c;

    /* JADX INFO: renamed from: d */
    public final boolean f231284d;

    public ukf(String str, hp7 hp7Var, z650 z650Var, boolean z) {
        this.f231281a = str;
        this.f231282b = hp7Var;
        this.f231283c = z650Var;
        this.f231284d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukf)) {
            return false;
        }
        ukf ukfVar = (ukf) obj;
        return wj50.m88271j(this.f231281a, ukfVar.f231281a) && this.f231282b.equals(ukfVar.f231282b) && wj50.m88271j(this.f231283c, ukfVar.f231283c) && this.f231284d == ukfVar.f231284d;
    }

    public final int hashCode() {
        int iHashCode = (this.f231282b.hashCode() + (this.f231281a.hashCode() * 31)) * 31;
        z650 z650Var = this.f231283c;
        return Boolean.hashCode(this.f231284d) + ((iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode())) * 31);
    }
}
