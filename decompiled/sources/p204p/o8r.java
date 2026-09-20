package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o8r {

    /* JADX INFO: renamed from: a */
    public final wwu f162853a;

    /* JADX INFO: renamed from: b */
    public final int f162854b;

    /* JADX INFO: renamed from: c */
    public final int f162855c;

    /* JADX INFO: renamed from: d */
    public final Integer f162856d;

    public o8r(wwu wwuVar, int i, int i2, Integer num) {
        this.f162853a = wwuVar;
        this.f162854b = i;
        this.f162855c = i2;
        this.f162856d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8r)) {
            return false;
        }
        o8r o8rVar = (o8r) obj;
        return wj50.m88271j(this.f162853a, o8rVar.f162853a) && this.f162854b == o8rVar.f162854b && this.f162855c == o8rVar.f162855c && wj50.m88271j(this.f162856d, o8rVar.f162856d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f162855c, mt60.m62800g(this.f162854b, this.f162853a.hashCode() * 31, 31), 31);
        Integer num = this.f162856d;
        return iM62800g + (num == null ? 0 : num.hashCode());
    }
}
