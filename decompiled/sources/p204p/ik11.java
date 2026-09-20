package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ik11 {

    /* JADX INFO: renamed from: a */
    public final String f102946a;

    /* JADX INFO: renamed from: b */
    public final String f102947b;

    public ik11(String str, String str2) {
        this.f102946a = str;
        this.f102947b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik11)) {
            return false;
        }
        ik11 ik11Var = (ik11) obj;
        return wj50.m88271j(this.f102946a, ik11Var.f102946a) && wj50.m88271j(this.f102947b, ik11Var.f102947b);
    }

    public final int hashCode() {
        return this.f102947b.hashCode() + (this.f102946a.hashCode() * 31);
    }
}
