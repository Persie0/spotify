package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ik01 {

    /* JADX INFO: renamed from: a */
    public final String f102944a;

    /* JADX INFO: renamed from: b */
    public final String f102945b;

    public ik01(String str, String str2) {
        this.f102944a = str;
        this.f102945b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik01)) {
            return false;
        }
        ik01 ik01Var = (ik01) obj;
        return wj50.m88271j(this.f102944a, ik01Var.f102944a) && wj50.m88271j(this.f102945b, ik01Var.f102945b);
    }

    public final int hashCode() {
        return this.f102945b.hashCode() + (this.f102944a.hashCode() * 31);
    }
}
