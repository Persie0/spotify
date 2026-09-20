package p204p;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class qv11 {

    /* JADX INFO: renamed from: a */
    public final Random f192855a;

    /* JADX INFO: renamed from: b */
    public final int[] f192856b;

    /* JADX INFO: renamed from: c */
    public final int[] f192857c;

    public qv11() {
        this(new Random());
    }

    /* JADX INFO: renamed from: a */
    public final qv11 m73958a() {
        return new qv11(new Random(this.f192855a.nextLong()));
    }

    /* JADX INFO: renamed from: b */
    public final qv11 m73959b(int i, int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.f192856b;
            random = this.f192855a;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int iNextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[iNextInt];
            iArr3[iNextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr2[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr3[i5];
                i5++;
            }
        }
        return new qv11(iArr4, new Random(random.nextLong()));
    }

    public qv11(int[] iArr, Random random) {
        this.f192856b = iArr;
        this.f192855a = random;
        this.f192857c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f192857c[iArr[i]] = i;
        }
    }

    public qv11(Random random) {
        this(new int[0], random);
    }
}
