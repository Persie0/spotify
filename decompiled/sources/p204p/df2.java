package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class df2 {

    /* JADX INFO: renamed from: a */
    public final adb1 f48219a;

    /* JADX INFO: renamed from: b */
    public final String f48220b;

    /* JADX INFO: renamed from: c */
    public final int f48221c;

    public df2(adb1 adb1Var, String str, int i) {
        this.f48219a = adb1Var;
        this.f48220b = str;
        this.f48221c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        return this.f48219a == df2Var.f48219a && wj50.m88271j(this.f48220b, df2Var.f48220b) && this.f48221c == df2Var.f48221c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48221c) + s571.m77243b(this.f48219a.hashCode() * 31, 31, this.f48220b);
    }
}
