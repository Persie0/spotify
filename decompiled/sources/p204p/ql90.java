package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ql90 {

    /* JADX INFO: renamed from: a */
    public final String f189775a;

    /* JADX INFO: renamed from: b */
    public final jhl0 f189776b;

    /* JADX INFO: renamed from: c */
    public final int f189777c;

    /* JADX INFO: renamed from: d */
    public final String f189778d;

    public ql90(String str, jhl0 jhl0Var, int i, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        String str2 = (i2 & 8) != 0 ? null : "";
        this.f189775a = str;
        this.f189776b = jhl0Var;
        this.f189777c = i;
        this.f189778d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql90)) {
            return false;
        }
        ql90 ql90Var = (ql90) obj;
        return wj50.m88271j(this.f189775a, ql90Var.f189775a) && this.f189776b.equals(ql90Var.f189776b) && this.f189777c == ql90Var.f189777c && wj50.m88271j(this.f189778d, ql90Var.f189778d);
    }

    public final int hashCode() {
        int iHashCode = (this.f189776b.hashCode() + (this.f189775a.hashCode() * 31)) * 31;
        int i = this.f189777c;
        int iM38547C = (iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        String str = this.f189778d;
        return Boolean.hashCode(false) + s571.m77245d((iM38547C + (str == null ? 0 : str.hashCode())) * 31, 31, false);
    }
}
