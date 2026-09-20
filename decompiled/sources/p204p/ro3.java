package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ro3 {

    /* JADX INFO: renamed from: a */
    public final String f201059a;

    /* JADX INFO: renamed from: b */
    public final String f201060b;

    public ro3(String str, String str2) {
        this.f201059a = str;
        this.f201060b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro3)) {
            return false;
        }
        ro3 ro3Var = (ro3) obj;
        return wj50.m88271j(this.f201059a, ro3Var.f201059a) && wj50.m88271j(this.f201060b, ro3Var.f201060b);
    }

    public final int hashCode() {
        return this.f201060b.hashCode() + (this.f201059a.hashCode() * 31);
    }
}
