package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lo31 {

    /* JADX INFO: renamed from: a */
    public final String f135292a;

    /* JADX INFO: renamed from: b */
    public final int f135293b;

    public lo31(String str, int i) {
        this.f135292a = str;
        this.f135293b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo31)) {
            return false;
        }
        lo31 lo31Var = (lo31) obj;
        return wj50.m88271j(this.f135292a, lo31Var.f135292a) && this.f135293b == lo31Var.f135293b;
    }

    public final int hashCode() {
        String str = this.f135292a;
        return Integer.hashCode(this.f135293b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
