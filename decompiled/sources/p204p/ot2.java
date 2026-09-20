package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ot2 {

    /* JADX INFO: renamed from: a */
    public final String f168952a;

    /* JADX INFO: renamed from: b */
    public final String f168953b;

    public ot2(String str, String str2) {
        this.f168952a = str;
        this.f168953b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot2)) {
            return false;
        }
        ot2 ot2Var = (ot2) obj;
        return wj50.m88271j(this.f168952a, ot2Var.f168952a) && wj50.m88271j(this.f168953b, ot2Var.f168953b);
    }

    public final int hashCode() {
        return this.f168953b.hashCode() + (this.f168952a.hashCode() * 31);
    }
}
