package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e2q0 {

    /* JADX INFO: renamed from: a */
    public final String f55501a;

    /* JADX INFO: renamed from: b */
    public final String f55502b;

    public e2q0(String str, String str2) {
        this.f55501a = str;
        this.f55502b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2q0)) {
            return false;
        }
        e2q0 e2q0Var = (e2q0) obj;
        return wj50.m88271j(this.f55501a, e2q0Var.f55501a) && this.f55502b.equals(e2q0Var.f55502b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77243b(this.f55501a.hashCode() * 31, 31, this.f55502b);
    }
}
