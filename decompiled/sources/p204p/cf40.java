package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf40 {
    /* JADX INFO: renamed from: b */
    public static int m32617b(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        return iHighestOneBit < 0 ? Alert.DURATION_SHOW_INDEFINITELY : iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public abstract cf40 mo32618a(Object obj);
}
