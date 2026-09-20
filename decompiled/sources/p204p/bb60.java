package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bb60 implements db60 {

    /* JADX INFO: renamed from: a */
    public final String f25442a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 f25443b;

    /* JADX INFO: renamed from: c */
    public final String f25444c;

    public bb60(String str, AbstractC2524w8 abstractC2524w8, String str2) {
        this.f25442a = str;
        this.f25443b = abstractC2524w8;
        this.f25444c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb60)) {
            return false;
        }
        bb60 bb60Var = (bb60) obj;
        return wj50.m88271j(this.f25442a, bb60Var.f25442a) && wj50.m88271j(this.f25443b, bb60Var.f25443b) && wj50.m88271j(this.f25444c, bb60Var.f25444c);
    }

    public final int hashCode() {
        int iHashCode = (this.f25443b.hashCode() + (this.f25442a.hashCode() * 31)) * 31;
        String str = this.f25444c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
