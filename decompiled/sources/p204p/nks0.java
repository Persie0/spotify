package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nks0 {

    /* JADX INFO: renamed from: a */
    public final String f154936a;

    /* JADX INFO: renamed from: b */
    public final String f154937b;

    public nks0(String str, String str2) {
        this.f154936a = str;
        this.f154937b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nks0)) {
            return false;
        }
        nks0 nks0Var = (nks0) obj;
        return wj50.m88271j(this.f154936a, nks0Var.f154936a) && wj50.m88271j(this.f154937b, nks0Var.f154937b);
    }

    public final int hashCode() {
        return this.f154937b.hashCode() + (this.f154936a.hashCode() * 31);
    }
}
