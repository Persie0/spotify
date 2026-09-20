package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pij0 {

    /* JADX INFO: renamed from: a */
    public final String f177977a;

    /* JADX INFO: renamed from: b */
    public final int f177978b;

    public pij0(String str, int i) {
        this.f177977a = str;
        this.f177978b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pij0)) {
            return false;
        }
        pij0 pij0Var = (pij0) obj;
        return wj50.m88271j(this.f177977a, pij0Var.f177977a) && this.f177978b == pij0Var.f177978b;
    }

    public final int hashCode() {
        String str = this.f177977a;
        return edb.m38547C(this.f177978b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
