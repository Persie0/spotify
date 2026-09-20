package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class joa0 extends loa0 {

    /* JADX INFO: renamed from: a */
    public final rma0 f114380a;

    /* JADX INFO: renamed from: b */
    public final String f114381b;

    public joa0(rma0 rma0Var, String str) {
        this.f114380a = rma0Var;
        this.f114381b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joa0)) {
            return false;
        }
        joa0 joa0Var = (joa0) obj;
        return wj50.m88271j(this.f114380a, joa0Var.f114380a) && wj50.m88271j(this.f114381b, joa0Var.f114381b);
    }

    public final int hashCode() {
        rma0 rma0Var = this.f114380a;
        return this.f114381b.hashCode() + ((rma0Var == null ? 0 : rma0Var.hashCode()) * 31);
    }
}
