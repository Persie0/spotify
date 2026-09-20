package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hmc {

    /* JADX INFO: renamed from: a */
    public int f92886a;

    /* JADX INFO: renamed from: b */
    public int f92887b;

    /* JADX INFO: renamed from: c */
    public int f92888c;

    /* JADX INFO: renamed from: d */
    public int f92889d;

    public hmc(int i, int i2, int i3, int i4) {
        this.f92886a = i;
        this.f92887b = i2;
        this.f92888c = i3;
        this.f92889d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmc)) {
            return false;
        }
        hmc hmcVar = (hmc) obj;
        return this.f92886a == hmcVar.f92886a && this.f92887b == hmcVar.f92887b && this.f92888c == hmcVar.f92888c && this.f92889d == hmcVar.f92889d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92889d) + mt60.m62800g(this.f92888c, mt60.m62800g(this.f92887b, Integer.hashCode(this.f92886a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Change(preStart=");
        sb.append(this.f92886a);
        sb.append(", preEnd=");
        sb.append(this.f92887b);
        sb.append(", originalStart=");
        sb.append(this.f92888c);
        sb.append(", originalEnd=");
        return edb.m38567p(sb, this.f92889d, ')');
    }
}
