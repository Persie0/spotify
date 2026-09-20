package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final vbc f194343a;

    /* JADX INFO: renamed from: b */
    public final boolean f194344b;

    public r001(vbc vbcVar, boolean z) {
        this.f194343a = vbcVar;
        this.f194344b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r001)) {
            return false;
        }
        r001 r001Var = (r001) obj;
        return wj50.m88271j(this.f194343a, r001Var.f194343a) && this.f194344b == r001Var.f194344b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194344b) + (this.f194343a.hashCode() * 31);
    }
}
