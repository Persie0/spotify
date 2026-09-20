package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class osz0 {

    /* JADX INFO: renamed from: a */
    public final String f168924a;

    /* JADX INFO: renamed from: b */
    public final int f168925b;

    public osz0(String str, int i) {
        this.f168924a = str;
        this.f168925b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osz0)) {
            return false;
        }
        osz0 osz0Var = (osz0) obj;
        return wj50.m88271j(this.f168924a, osz0Var.f168924a) && this.f168925b == osz0Var.f168925b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168925b) + (this.f168924a.hashCode() * 31);
    }
}
