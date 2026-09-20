package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zx8 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f287237a;

    /* JADX INFO: renamed from: b */
    public static final int[] f287238b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f287239c;

    /* JADX INFO: renamed from: d */
    public static final int[] f287240d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f287237a = bArr;
        int[] iArr = new int[256];
        int i = 0;
        bk5.m29579B0(-1, 0, 6, iArr);
        iArr[61] = -2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        f287238b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f287239c = bArr2;
        int[] iArr2 = new int[256];
        bk5.m29579B0(-1, 0, 6, iArr2);
        iArr2[61] = -2;
        int i4 = 0;
        while (i < 64) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        f287240d = iArr2;
    }
}
