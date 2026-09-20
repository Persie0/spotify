package p204p;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class qu21 {
    /* JADX INFO: renamed from: a */
    public static final int m73867a(ArrayList arrayList, int i, int i2) {
        int iM73871e = m73871e(arrayList, i, i2);
        return iM73871e >= 0 ? iM73871e : -(iM73871e + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final int m73868b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: c */
    public static final void m73869c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: d */
    public static final ou21 m73870d(ou21 ou21Var) {
        if (!(ou21Var instanceof ou21)) {
            ou21Var = null;
        }
        if (ou21Var != null) {
            return ou21Var;
        }
        vph.m86125b("Inconsistent composition");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: e */
    public static final int m73871e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((rq00) arrayList.get(i4)).f201675a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM88282u = wj50.m88282u(i5, i);
            if (iM88282u < 0) {
                i3 = i4 + 1;
            } else {
                if (iM88282u <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m73872f() {
        throw new ConcurrentModificationException();
    }
}
