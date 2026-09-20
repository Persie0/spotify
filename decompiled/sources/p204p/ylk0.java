package p204p;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ylk0 {

    /* JADX INFO: renamed from: a */
    public transient Object[] f274037a;

    /* JADX INFO: renamed from: b */
    public transient int[] f274038b;

    /* JADX INFO: renamed from: c */
    public transient int f274039c;

    /* JADX INFO: renamed from: d */
    public transient int[] f274040d;

    /* JADX INFO: renamed from: e */
    public transient long[] f274041e;

    /* JADX INFO: renamed from: f */
    public transient float f274042f;

    /* JADX INFO: renamed from: g */
    public transient int f274043g;

    /* JADX INFO: renamed from: a */
    public final void m94164a(int i) {
        if (i > this.f274041e.length) {
            m94169f(i);
        }
        if (i >= this.f274043g) {
            m94170g(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m94165b(Object obj) {
        int iM94166c = m94166c(obj);
        if (iM94166c == -1) {
            return 0;
        }
        return this.f274038b[iM94166c];
    }

    /* JADX INFO: renamed from: c */
    public final int m94166c(Object obj) {
        int iM30841r = bxg1.m30841r(obj);
        int[] iArr = this.f274040d;
        int i = iArr[(iArr.length - 1) & iM30841r];
        while (i != -1) {
            long j = this.f274041e[i];
            if (((int) (j >>> 32)) == iM30841r && upf.m83705v(obj, this.f274037a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m94167d(int i) {
        c95.m31844j(i >= 0, "Initial capacity must be non-negative");
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) 1.0f) * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.f274040d = iArr;
        this.f274042f = 1.0f;
        this.f274037a = new Object[i];
        this.f274038b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f274041e = jArr;
        this.f274043g = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m94168e(int i, Object obj) {
        long j;
        if (i <= 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "count must be positive but was: "));
        }
        long[] jArr = this.f274041e;
        Object[] objArr = this.f274037a;
        int[] iArr = this.f274038b;
        int iM30841r = bxg1.m30841r(obj);
        int[] iArr2 = this.f274040d;
        int length = (iArr2.length - 1) & iM30841r;
        int i2 = this.f274039c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
            j = 4294967295L;
        } else {
            while (true) {
                long j2 = jArr[i3];
                j = 4294967295L;
                if (((int) (j2 >>> 32)) == iM30841r && upf.m83705v(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j2;
                    if (i5 == -1) {
                        jArr[i3] = ((-4294967296L) & j2) | (((long) i2) & 4294967295L);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i2 + 1;
        int length2 = this.f274041e.length;
        if (i7 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax >= 0) {
                i6 = iMax;
            }
            if (i6 != length2) {
                m94169f(i6);
            }
        }
        this.f274041e[i2] = (((long) iM30841r) << 32) | j;
        this.f274037a[i2] = obj;
        this.f274038b[i2] = i;
        this.f274039c = i7;
        if (i2 >= this.f274043g) {
            m94170g(this.f274040d.length * 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m94169f(int i) {
        this.f274037a = Arrays.copyOf(this.f274037a, i);
        this.f274038b = Arrays.copyOf(this.f274038b, i);
        long[] jArr = this.f274041e;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f274041e = jArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    public final void m94170g(int i) {
        if (this.f274040d.length >= 1073741824) {
            this.f274043g = Alert.DURATION_SHOW_INDEFINITELY;
            return;
        }
        int i2 = ((int) (i * this.f274042f)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f274041e;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.f274039c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.f274043g = i2;
        this.f274040d = iArr;
    }
}
