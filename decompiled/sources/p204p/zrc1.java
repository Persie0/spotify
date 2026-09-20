package p204p;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zrc1 {

    /* JADX INFO: renamed from: d */
    public boolean f285622d;

    /* JADX INFO: renamed from: e */
    public boolean f285623e;

    /* JADX INFO: renamed from: f */
    public int[] f285624f;

    /* JADX INFO: renamed from: g */
    public int f285625g;

    /* JADX INFO: renamed from: h */
    public int f285626h;

    /* JADX INFO: renamed from: i */
    public Rect f285627i;

    /* JADX INFO: renamed from: b */
    public long f285620b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public long f285621c = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final int[] f285619a = new int[4];

    /* JADX INFO: renamed from: j */
    public int f285628j = -1;

    /* JADX INFO: renamed from: k */
    public int f285629k = -1;

    /* JADX INFO: renamed from: a */
    public static int m96757a(int[] iArr, int i) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* JADX INFO: renamed from: c */
    public static int m96758c(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX INFO: renamed from: b */
    public final void m96759b(ohc ohcVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 1;
                int iM66954g = 0;
                while (true) {
                    if (iM66954g >= i6 || i6 > 64) {
                        i = iM66954g & 3;
                        if (iM66954g >= 4) {
                            i2 = iM66954g >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (ohcVar.m66949b() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    } else {
                        iM66954g = (iM66954g << 4) | ohcVar.m66954g(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.f285619a[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            ohcVar.m66950c();
        }
    }
}
