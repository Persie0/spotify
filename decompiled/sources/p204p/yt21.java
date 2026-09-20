package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yt21 implements au21 {

    /* JADX INFO: renamed from: a */
    public final tu21 f275930a;

    /* JADX INFO: renamed from: b */
    public final String f275931b;

    public yt21(String str, tu21 tu21Var) {
        this.f275930a = tu21Var;
        this.f275931b = str;
    }

    @Override // p204p.au21
    public final String breadcrumb() {
        return "RetrySlot: " + this.f275930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt21)) {
            return false;
        }
        yt21 yt21Var = (yt21) obj;
        return this.f275930a == yt21Var.f275930a && wj50.m88271j(this.f275931b, yt21Var.f275931b);
    }

    public final int hashCode() {
        int iHashCode = this.f275930a.hashCode() * 31;
        String str = this.f275931b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
