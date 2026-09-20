package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e1w0 {

    /* JADX INFO: renamed from: a */
    public final String f55265a;

    /* JADX INFO: renamed from: b */
    public final String f55266b;

    public e1w0(String str, String str2) {
        this.f55265a = str;
        this.f55266b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1w0)) {
            return false;
        }
        e1w0 e1w0Var = (e1w0) obj;
        return wj50.m88271j(this.f55265a, e1w0Var.f55265a) && wj50.m88271j(this.f55266b, e1w0Var.f55266b);
    }

    public final int hashCode() {
        return this.f55266b.hashCode() + (this.f55265a.hashCode() * 31);
    }
}
