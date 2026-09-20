package p204p;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lx8 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f137752a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(vuc.f244913a);

    /* JADX INFO: renamed from: a */
    public static final String m60172a(byte[] bArr) {
        int i;
        byte[] bArr2;
        int i2;
        int i3;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Not a 16 byte value");
        }
        int i4 = 0;
        int iM60173b = m60173b(bArr, 0);
        int iM60173b2 = m60173b(bArr, 4);
        int iM60173b3 = m60173b(bArr, 8);
        int iM60173b4 = m60173b(bArr, 12);
        byte[] bArr3 = new byte[22];
        while (true) {
            i = 6;
            bArr2 = f137752a;
            if (i4 >= 6) {
                break;
            }
            long j = ((long) iM60173b) & 4294967295L;
            long j2 = 62;
            byte[] bArr4 = bArr3;
            long j3 = ((j % j2) << 32) | (((long) iM60173b2) & 4294967295L);
            iM60173b2 = (int) (j3 / j2);
            long j4 = ((j3 % j2) << 32) | (((long) iM60173b3) & 4294967295L);
            iM60173b3 = (int) (j4 / j2);
            long j5 = ((j4 % j2) << 32) | (((long) iM60173b4) & 4294967295L);
            iM60173b4 = (int) (j5 / j2);
            bArr4[21 - i4] = bArr2[(int) (j5 % j2)];
            i4++;
            iM60173b = (int) (j / j2);
            bArr3 = bArr4;
        }
        byte[] bArr5 = bArr3;
        while (true) {
            i2 = 11;
            if (i >= 11) {
                break;
            }
            long j6 = ((long) iM60173b2) & 4294967295L;
            long j7 = 62;
            iM60173b2 = (int) (j6 / j7);
            long j8 = ((j6 % j7) << 32) | (((long) iM60173b3) & 4294967295L);
            int i5 = (int) (j8 / j7);
            long j9 = ((j8 % j7) << 32) | (((long) iM60173b4) & 4294967295L);
            iM60173b4 = (int) (j9 / j7);
            bArr5[21 - i] = bArr2[(int) (j9 % j7)];
            i++;
            iM60173b3 = i5;
        }
        while (true) {
            if (i2 >= 17) {
                break;
            }
            long j10 = ((long) iM60173b3) & 4294967295L;
            long j11 = 62;
            int i6 = (int) (j10 / j11);
            long j12 = ((j10 % j11) << 32) | (((long) iM60173b4) & 4294967295L);
            iM60173b4 = (int) (j12 / j11);
            bArr5[21 - i2] = bArr2[(int) (j12 % j11)];
            i2++;
            iM60173b3 = i6;
        }
        for (i3 = 17; i3 < 22; i3++) {
            bArr5[21 - i3] = bArr2[iM60173b4 % 62];
            iM60173b4 /= 62;
        }
        return new String(bArr5, vuc.f244913a);
    }

    /* JADX INFO: renamed from: b */
    public static int m60173b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
