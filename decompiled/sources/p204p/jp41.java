package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jp41 {

    /* JADX INFO: renamed from: a */
    public final String f114564a;

    /* JADX INFO: renamed from: b */
    public final String f114565b;

    /* JADX INFO: renamed from: c */
    public final int f114566c;

    public jp41(String str, String str2, int i) {
        this.f114564a = str;
        this.f114565b = str2;
        this.f114566c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp41)) {
            return false;
        }
        jp41 jp41Var = (jp41) obj;
        return wj50.m88271j(this.f114564a, jp41Var.f114564a) && wj50.m88271j(this.f114565b, jp41Var.f114565b) && this.f114566c == jp41Var.f114566c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114566c) + s571.m77243b(this.f114564a.hashCode() * 31, 31, this.f114565b);
    }
}
