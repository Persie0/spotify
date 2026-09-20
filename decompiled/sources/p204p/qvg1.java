package p204p;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qvg1 {

    /* JADX INFO: renamed from: a */
    public Object[] f193017a;

    /* JADX INFO: renamed from: b */
    public int f193018b;

    /* JADX INFO: renamed from: c */
    public boolean f193019c;

    /* JADX INFO: renamed from: d */
    public Object[] f193020d;

    /* JADX INFO: renamed from: e */
    public int f193021e;

    /* JADX INFO: renamed from: b */
    public static int m74030b(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m74031a(Object obj) {
        int length = this.f193017a.length;
        int iM74030b = m74030b(length, this.f193018b + 1);
        if (iM74030b > length || this.f193019c) {
            this.f193017a = Arrays.copyOf(this.f193017a, iM74030b);
            this.f193019c = false;
        }
        Object[] objArr = this.f193017a;
        int i = this.f193018b;
        this.f193018b = i + 1;
        objArr[i] = obj;
    }
}
