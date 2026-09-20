package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pf81 {

    /* JADX INFO: renamed from: a */
    public final String f176995a;

    /* JADX INFO: renamed from: b */
    public final int f176996b;

    public pf81(String str, int i) {
        this.f176995a = str;
        this.f176996b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf81)) {
            return false;
        }
        pf81 pf81Var = (pf81) obj;
        return this.f176995a.equals(pf81Var.f176995a) && this.f176996b == pf81Var.f176996b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f176996b) + (this.f176995a.hashCode() * 31);
    }
}
