package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l1s0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final String f128780a;

    /* JADX INFO: renamed from: b */
    public final String f128781b;

    public l1s0(String str, String str2) {
        this.f128780a = str;
        this.f128781b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1s0)) {
            return false;
        }
        l1s0 l1s0Var = (l1s0) obj;
        return wj50.m88271j(this.f128780a, l1s0Var.f128780a) && wj50.m88271j(this.f128781b, l1s0Var.f128781b);
    }

    public final int hashCode() {
        return this.f128781b.hashCode() + (this.f128780a.hashCode() * 31);
    }
}
