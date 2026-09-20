package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class la0 implements na0 {

    /* JADX INFO: renamed from: a */
    public final int f131205a;

    /* JADX INFO: renamed from: b */
    public final int f131206b;

    /* JADX INFO: renamed from: c */
    public final String f131207c;

    public la0(int i, int i2, String str) {
        this.f131205a = i;
        this.f131206b = i2;
        this.f131207c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        return this.f131205a == la0Var.f131205a && this.f131206b == la0Var.f131206b && wj50.m88271j(this.f131207c, la0Var.f131207c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f131206b, mt60.m62800g(this.f131205a, Integer.hashCode(0) * 31, 31), 31);
        String str = this.f131207c;
        return iM62800g + (str != null ? str.hashCode() : 0);
    }
}
