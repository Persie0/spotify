package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qkc1 {

    /* JADX INFO: renamed from: a */
    public final int f189531a;

    /* JADX INFO: renamed from: b */
    public final int f189532b;

    /* JADX INFO: renamed from: c */
    public Integer f189533c;

    /* JADX INFO: renamed from: d */
    public int f189534d;

    public qkc1(int i, int i2) {
        this.f189531a = i;
        this.f189532b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m73042a(int i) {
        this.f189534d = Math.max(0, i - (this.f189532b / 2));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73043b(int i) {
        int iIntValue;
        Integer num = this.f189533c;
        if (num == null) {
            return true;
        }
        if ((num != null ? num.intValue() : 0) > 0) {
            int i2 = this.f189534d;
            int i3 = this.f189531a;
            if (i < (i2 == 0 ? i2 : i2 + i3)) {
                return true;
            }
            int i4 = i2 + this.f189532b;
            Integer num2 = this.f189533c;
            if (i4 >= (num2 != null ? num2.intValue() : 0)) {
                Integer num3 = this.f189533c;
                iIntValue = num3 != null ? num3.intValue() : 0;
            } else {
                iIntValue = i4 - i3;
            }
            if (i > iIntValue) {
                return true;
            }
        }
        return false;
    }
}
