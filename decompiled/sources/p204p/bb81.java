package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bb81 {

    /* JADX INFO: renamed from: a */
    public final String f25472a;

    /* JADX INFO: renamed from: b */
    public final uzk f25473b;

    public bb81(String str, uzk uzkVar) {
        this.f25472a = str;
        this.f25473b = uzkVar;
    }

    /* JADX INFO: renamed from: a */
    public final uzk m28628a() {
        return this.f25473b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb81)) {
            return false;
        }
        bb81 bb81Var = (bb81) obj;
        return wj50.m88271j(this.f25472a, bb81Var.f25472a) && wj50.m88271j(this.f25473b, bb81Var.f25473b);
    }

    public final int hashCode() {
        return this.f25473b.hashCode() + (this.f25472a.hashCode() * 31);
    }

    public /* synthetic */ bb81(uzk uzkVar, int i) {
        this("", (i & 2) != 0 ? new uzk() : uzkVar);
    }
}
