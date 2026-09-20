package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nke0 implements pke0 {

    /* JADX INFO: renamed from: a */
    public final String f154860a;

    /* JADX INFO: renamed from: b */
    public final ocj0 f154861b;

    public nke0(String str, ocj0 ocj0Var) {
        this.f154860a = str;
        this.f154861b = ocj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nke0)) {
            return false;
        }
        nke0 nke0Var = (nke0) obj;
        return wj50.m88271j(this.f154860a, nke0Var.f154860a) && this.f154861b.equals(nke0Var.f154861b);
    }

    public final int hashCode() {
        String str = this.f154860a;
        return this.f154861b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
