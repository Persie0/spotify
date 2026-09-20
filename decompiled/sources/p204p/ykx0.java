package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ykx0 {

    /* JADX INFO: renamed from: a */
    public final String f273856a;

    /* JADX INFO: renamed from: b */
    public final String f273857b;

    public ykx0(String str, String str2) {
        this.f273856a = str;
        this.f273857b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykx0)) {
            return false;
        }
        ykx0 ykx0Var = (ykx0) obj;
        return wj50.m88271j(this.f273856a, ykx0Var.f273856a) && wj50.m88271j(this.f273857b, ykx0Var.f273857b);
    }

    public final int hashCode() {
        return this.f273857b.hashCode() + (this.f273856a.hashCode() * 31);
    }
}
