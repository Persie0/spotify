package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qgw0 {

    /* JADX INFO: renamed from: a */
    public final String f188575a;

    /* JADX INFO: renamed from: b */
    public final k1n0 f188576b;

    /* JADX INFO: renamed from: c */
    public final boolean f188577c;

    public qgw0(String str, k1n0 k1n0Var, boolean z) {
        this.f188575a = str;
        this.f188576b = k1n0Var;
        this.f188577c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgw0)) {
            return false;
        }
        qgw0 qgw0Var = (qgw0) obj;
        return wj50.m88271j(this.f188575a, qgw0Var.f188575a) && this.f188576b == qgw0Var.f188576b && this.f188577c == qgw0Var.f188577c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188577c) + ((this.f188576b.hashCode() + (this.f188575a.hashCode() * 31)) * 31);
    }
}
