package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ht00 {

    /* JADX INFO: renamed from: a */
    public final boolean f94890a;

    /* JADX INFO: renamed from: b */
    public final String f94891b;

    public ht00(boolean z, String str) {
        this.f94890a = z;
        this.f94891b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht00)) {
            return false;
        }
        ht00 ht00Var = (ht00) obj;
        return this.f94890a == ht00Var.f94890a && wj50.m88271j(this.f94891b, ht00Var.f94891b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f94890a) * 31;
        String str = this.f94891b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
