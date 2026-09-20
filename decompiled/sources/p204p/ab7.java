package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ab7 {

    /* JADX INFO: renamed from: a */
    public final String f14014a;

    /* JADX INFO: renamed from: b */
    public final String f14015b;

    /* JADX INFO: renamed from: c */
    public final int f14016c;

    public ab7(String str, String str2, int i) {
        this.f14014a = str;
        this.f14015b = str2;
        this.f14016c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab7)) {
            return false;
        }
        ab7 ab7Var = (ab7) obj;
        return wj50.m88271j(this.f14014a, ab7Var.f14014a) && wj50.m88271j(this.f14015b, ab7Var.f14015b) && this.f14016c == ab7Var.f14016c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14016c) + s571.m77243b(this.f14014a.hashCode() * 31, 31, this.f14015b);
    }
}
