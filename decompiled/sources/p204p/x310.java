package p204p;

import com.comscore.streaming.ContentFeedType;

/* JADX INFO: loaded from: classes4.dex */
public final class x310 {

    /* JADX INFO: renamed from: g */
    public static final x310 f257653g = new x310(4201, 4096, 1);

    /* JADX INFO: renamed from: h */
    public static final x310 f257654h = new x310(1033, 1024, 1);

    /* JADX INFO: renamed from: i */
    public static final x310 f257655i = new x310(67, 64, 1);

    /* JADX INFO: renamed from: j */
    public static final x310 f257656j = new x310(19, 16, 1);

    /* JADX INFO: renamed from: k */
    public static final x310 f257657k = new x310(285, 256, 0);

    /* JADX INFO: renamed from: l */
    public static final x310 f257658l = new x310(ContentFeedType.EAST_HD, 256, 1);

    /* JADX INFO: renamed from: a */
    public final int[] f257659a;

    /* JADX INFO: renamed from: b */
    public final int[] f257660b;

    /* JADX INFO: renamed from: c */
    public final y310 f257661c;

    /* JADX INFO: renamed from: d */
    public final int f257662d;

    /* JADX INFO: renamed from: e */
    public final int f257663e;

    /* JADX INFO: renamed from: f */
    public final int f257664f;

    public x310(int i, int i2, int i3) {
        this.f257663e = i;
        this.f257662d = i2;
        this.f257664f = i3;
        this.f257659a = new int[i2];
        this.f257660b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f257659a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f257660b[this.f257659a[i6]] = i6;
        }
        this.f257661c = new y310(this, new int[]{0});
    }

    /* JADX INFO: renamed from: a */
    public final int m89772a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f257660b;
        return this.f257659a[(iArr[i] + iArr[i2]) % (this.f257662d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f257663e));
        sb.append(',');
        return edb.m38567p(sb, this.f257662d, ')');
    }
}
