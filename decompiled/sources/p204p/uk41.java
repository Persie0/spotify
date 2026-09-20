package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uk41 {

    /* JADX INFO: renamed from: a */
    public final String f231219a;

    /* JADX INFO: renamed from: b */
    public final boolean f231220b;

    public uk41(String str, boolean z) {
        this.f231219a = str;
        this.f231220b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk41)) {
            return false;
        }
        uk41 uk41Var = (uk41) obj;
        return wj50.m88271j(this.f231219a, uk41Var.f231219a) && this.f231220b == uk41Var.f231220b;
    }

    public final int hashCode() {
        String str = this.f231219a;
        return Boolean.hashCode(this.f231220b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
