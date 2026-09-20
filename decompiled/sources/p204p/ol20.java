package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ol20 {

    /* JADX INFO: renamed from: a */
    public final ji30 f166733a;

    public ol20(ji30 ji30Var) {
        this.f166733a = ji30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol20) && wj50.m88271j(this.f166733a, ((ol20) obj).f166733a);
    }

    public final int hashCode() {
        ji30 ji30Var = this.f166733a;
        if (ji30Var == null) {
            return 0;
        }
        return edb.m38547C(ji30Var.f112633a);
    }
}
