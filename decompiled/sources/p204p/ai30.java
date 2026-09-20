package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ai30 implements ei30 {

    /* JADX INFO: renamed from: a */
    public final String f15864a;

    /* JADX INFO: renamed from: b */
    public final String f15865b;

    public ai30(String str, String str2) {
        this.f15864a = str;
        this.f15865b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai30)) {
            return false;
        }
        ai30 ai30Var = (ai30) obj;
        return wj50.m88271j(this.f15864a, ai30Var.f15864a) && wj50.m88271j(this.f15865b, ai30Var.f15865b);
    }

    public final int hashCode() {
        return this.f15865b.hashCode() + (this.f15864a.hashCode() * 31);
    }
}
