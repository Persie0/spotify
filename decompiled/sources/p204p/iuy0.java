package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iuy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f106053a;

    /* JADX INFO: renamed from: b */
    public final String f106054b;

    public iuy0(boolean z, String str) {
        this.f106053a = z;
        this.f106054b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuy0)) {
            return false;
        }
        iuy0 iuy0Var = (iuy0) obj;
        return this.f106053a == iuy0Var.f106053a && wj50.m88271j(this.f106054b, iuy0Var.f106054b);
    }

    public final int hashCode() {
        return this.f106054b.hashCode() + (Boolean.hashCode(this.f106053a) * 31);
    }
}
