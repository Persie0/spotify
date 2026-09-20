package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oq50 extends fr50 {

    /* JADX INFO: renamed from: a */
    public final String f168079a;

    /* JADX INFO: renamed from: b */
    public final Integer f168080b;

    /* JADX INFO: renamed from: c */
    public final Integer f168081c;

    public oq50(String str, Integer num, Integer num2) {
        this.f168079a = str;
        this.f168080b = num;
        this.f168081c = num2;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m67606a() {
        return this.f168081c;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m67607b() {
        return this.f168080b;
    }

    /* JADX INFO: renamed from: c */
    public final String m67608c() {
        return this.f168079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq50)) {
            return false;
        }
        oq50 oq50Var = (oq50) obj;
        return wj50.m88271j(this.f168079a, oq50Var.f168079a) && wj50.m88271j(this.f168080b, oq50Var.f168080b) && wj50.m88271j(this.f168081c, oq50Var.f168081c);
    }

    public final int hashCode() {
        int iHashCode = this.f168079a.hashCode() * 31;
        Integer num = this.f168080b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f168081c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
