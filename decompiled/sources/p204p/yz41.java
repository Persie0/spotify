package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yz41 {

    /* JADX INFO: renamed from: a */
    public final String f277683a;

    /* JADX INFO: renamed from: b */
    public final String f277684b;

    public yz41(String str, String str2) {
        this.f277683a = str;
        this.f277684b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz41)) {
            return false;
        }
        yz41 yz41Var = (yz41) obj;
        return wj50.m88271j(this.f277683a, yz41Var.f277683a) && wj50.m88271j(this.f277684b, yz41Var.f277684b);
    }

    public final int hashCode() {
        return this.f277684b.hashCode() + (this.f277683a.hashCode() * 31);
    }
}
