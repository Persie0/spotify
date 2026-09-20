package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l00 implements j10 {

    /* JADX INFO: renamed from: a */
    public final int f128245a;

    /* JADX INFO: renamed from: b */
    public final int f128246b;

    /* JADX INFO: renamed from: c */
    public final de71 f128247c;

    /* JADX INFO: renamed from: d */
    public final boolean f128248d;

    public l00(int i, int i2, de71 de71Var, boolean z) {
        this.f128245a = i;
        this.f128246b = i2;
        this.f128247c = de71Var;
        this.f128248d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return this.f128245a == l00Var.f128245a && this.f128246b == l00Var.f128246b && this.f128247c == l00Var.f128247c && this.f128248d == l00Var.f128248d;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f128246b, Integer.hashCode(this.f128245a) * 31, 31);
        de71 de71Var = this.f128247c;
        return Boolean.hashCode(this.f128248d) + ((iM62800g + (de71Var == null ? 0 : de71Var.hashCode())) * 31);
    }
}
