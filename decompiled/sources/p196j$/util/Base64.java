package p196j$.util;

import java.util.Arrays;
import p196j$.sun.nio.p199cs.C1506c;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public class Base64 {

    /* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
    public static class Decoder {

        /* JADX INFO: renamed from: a */
        public static final int[] f10894a;

        /* JADX INFO: renamed from: b */
        public static final int[] f10895b;

        /* JADX INFO: renamed from: c */
        public static final Decoder f10896c;

        static {
            int[] iArr = new int[256];
            f10894a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                f10894a[Encoder.f10897c[i]] = i;
            }
            f10894a[61] = -2;
            int[] iArr2 = new int[256];
            f10895b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                f10895b[Encoder.f10898d[i2]] = i2;
            }
            f10895b[61] = -2;
            f10896c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        
            if (r9 != 18) goto L56;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i;
            int i2;
            int i3;
            char c;
            byte[] bytes = str.getBytes(C1506c.f10601a);
            int length = bytes.length;
            char c2 = 2;
            if (length == 0) {
                i2 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i = 0;
                }
                if (i == 0 && (i3 = length & 3) != 0) {
                    i = 4 - i3;
                }
                i2 = (((length + 3) / 4) * 3) - i;
            }
            byte[] bArr = new byte[i2];
            int length2 = bytes.length;
            int i4 = 18;
            int i5 = 18;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < length2) {
                int[] iArr = f10895b;
                if (i5 == i4 && i6 + 4 < length2) {
                    int i9 = ((length2 - i6) & (-4)) + i6;
                    while (true) {
                        if (i6 >= i9) {
                            c = c2;
                            break;
                        }
                        int i10 = iArr[bytes[i6] & 255];
                        c = c2;
                        int i11 = iArr[bytes[i6 + 1] & 255];
                        int i12 = iArr[bytes[i6 + 2] & 255];
                        int i13 = i6 + 4;
                        int i14 = iArr[bytes[i6 + 3] & 255];
                        if ((i10 | i11 | i12 | i14) < 0) {
                            break;
                        }
                        int i15 = (i10 << 18) | (i11 << 12) | (i12 << 6) | i14;
                        bArr[i7] = (byte) (i15 >> 16);
                        int i16 = i7 + 2;
                        bArr[i7 + 1] = (byte) (i15 >> 8);
                        i7 += 3;
                        bArr[i16] = (byte) i15;
                        i6 = i13;
                        c2 = c;
                    }
                    if (i6 < length2) {
                        break;
                    }
                    break;
                }
                c = c2;
                int i17 = i6 + 1;
                int i18 = iArr[bytes[i6] & 255];
                if (i18 >= 0) {
                    i4 = 18;
                    int i19 = (i18 << i5) | i8;
                    i5 -= 6;
                    if (i5 < 0) {
                        bArr[i7] = (byte) (i19 >> 16);
                        int i20 = i7 + 2;
                        bArr[i7 + 1] = (byte) (i19 >> 8);
                        i7 += 3;
                        bArr[i20] = (byte) i19;
                        i5 = 18;
                        i8 = 0;
                    } else {
                        i8 = i19;
                    }
                    i6 = i17;
                    c2 = c;
                } else {
                    if (i18 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i6], 16));
                    }
                    if (i5 == 6) {
                        if (i17 != length2) {
                            i6 += 2;
                            if (bytes[i17] == 61) {
                            }
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i6 = i17;
                }
            }
            if (i5 == 6) {
                bArr[i7] = (byte) (i8 >> 16);
                i7++;
            } else if (i5 == 0) {
                int i21 = i7 + 1;
                bArr[i7] = (byte) (i8 >> 16);
                i7 += 2;
                bArr[i21] = (byte) (i8 >> 8);
            } else if (i5 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            if (i6 >= length2) {
                return i7 != i2 ? Arrays.copyOf(bArr, i7) : bArr;
            }
            throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i6);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
    public static class Encoder {

        /* JADX INFO: renamed from: c */
        public static final char[] f10897c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* JADX INFO: renamed from: d */
        public static final char[] f10898d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

        /* JADX INFO: renamed from: e */
        public static final Encoder f10899e = new Encoder(false, true);

        /* JADX INFO: renamed from: f */
        public static final Encoder f10900f = new Encoder(true, true);

        /* JADX INFO: renamed from: a */
        public final boolean f10901a;

        /* JADX INFO: renamed from: b */
        public final boolean f10902b;

        public Encoder(boolean z, boolean z2) {
            this.f10901a = z;
            this.f10902b = z2;
        }

        public String encodeToString(byte[] bArr) {
            int i;
            int length = bArr.length;
            boolean z = this.f10902b;
            if (z) {
                i = ((length + 2) / 3) * 4;
            } else {
                int i2 = length % 3;
                i = ((length / 3) * 4) + (i2 == 0 ? 0 : i2 + 1);
            }
            byte[] bArrCopyOf = new byte[i];
            int length2 = bArr.length;
            char[] cArr = f10897c;
            char[] cArr2 = f10898d;
            boolean z2 = this.f10901a;
            char[] cArr3 = z2 ? cArr2 : cArr;
            int i3 = (length2 / 3) * 3;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(i4 + i3, i3);
                char[] cArr4 = z2 ? cArr2 : cArr;
                int i6 = i4;
                int i7 = i5;
                while (i6 < iMin) {
                    int i8 = i6 + 2;
                    int i9 = ((bArr[i6] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8);
                    i6 += 3;
                    int i10 = i9 | (bArr[i8] & 255);
                    bArrCopyOf[i7] = (byte) cArr4[(i10 >>> 18) & 63];
                    bArrCopyOf[i7 + 1] = (byte) cArr4[(i10 >>> 12) & 63];
                    int i11 = i7 + 3;
                    bArrCopyOf[i7 + 2] = (byte) cArr4[(i10 >>> 6) & 63];
                    i7 += 4;
                    bArrCopyOf[i11] = (byte) cArr4[i10 & 63];
                }
                int i12 = ((iMin - i4) / 3) * 4;
                i5 += i12;
                if (i12 == -1 && iMin < length2) {
                    throw null;
                }
                i4 = iMin;
            }
            if (i4 < length2) {
                int i13 = i4 + 1;
                int i14 = bArr[i4] & 255;
                int i15 = i5 + 1;
                bArrCopyOf[i5] = (byte) cArr3[i14 >> 2];
                if (i13 == length2) {
                    int i16 = i5 + 2;
                    bArrCopyOf[i15] = (byte) cArr3[(i14 << 4) & 63];
                    if (z) {
                        int i17 = i5 + 3;
                        bArrCopyOf[i16] = 61;
                        i5 += 4;
                        bArrCopyOf[i17] = 61;
                    } else {
                        i5 = i16;
                    }
                } else {
                    int i18 = bArr[i13] & 255;
                    bArrCopyOf[i15] = (byte) cArr3[((i14 << 4) & 63) | (i18 >> 4)];
                    int i19 = i5 + 3;
                    bArrCopyOf[i5 + 2] = (byte) cArr3[(i18 << 2) & 63];
                    if (z) {
                        i5 += 4;
                        bArrCopyOf[i19] = 61;
                    } else {
                        i5 = i19;
                    }
                }
            }
            if (i5 != i) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
            }
            return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
        }

        public Encoder withoutPadding() {
            return !this.f10902b ? this : new Encoder(this.f10901a, false);
        }
    }

    public static Encoder getEncoder() {
        return Encoder.f10899e;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.f10896c;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.f10900f;
    }
}
