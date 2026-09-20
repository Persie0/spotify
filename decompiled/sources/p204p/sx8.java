package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes2.dex */
public class sx8 {

    /* JADX INFO: renamed from: e */
    public static final qx8 f214837e = new qx8(false, false, -1);

    /* JADX INFO: renamed from: f */
    public static final byte[] f214838f = {13, 10};

    /* JADX INFO: renamed from: a */
    public final boolean f214839a;

    /* JADX INFO: renamed from: b */
    public final boolean f214840b;

    /* JADX INFO: renamed from: c */
    public final int f214841c;

    /* JADX INFO: renamed from: d */
    public final int f214842d;

    static {
        new sx8(true, false, -1);
        new sx8(false, true, 76);
        new sx8(false, true, 64);
    }

    public sx8(boolean z, boolean z2, int i) {
        this.f214839a = z;
        this.f214840b = z2;
        this.f214841c = i;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f214842d = i / 4;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m79585a(sx8 sx8Var, CharSequence charSequence, int i, int i2) {
        byte[] bytes;
        int i3 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = charSequence.length();
        sx8Var.getClass();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            bga.m29091m(i, length, str.length());
            bytes = str.substring(i, length).getBytes(vuc.f244917e);
        } else {
            bga.m29091m(i, length, charSequence.length());
            byte[] bArr = new byte[length - i];
            while (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt <= 255) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    bArr[i3] = 63;
                    i3++;
                }
                i++;
            }
            bytes = bArr;
        }
        return m79586b(sx8Var, bytes);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00ef A[EDGE_INSN: B:113:0x00ef->B:58:0x00ef BREAK  A[LOOP:1: B:53:0x00de->B:57:0x00ec], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de A[ADDED_TO_REGION, LOOP:1: B:53:0x00de->B:57:0x00ec, LOOP_START, PHI: r14
      0x00de: PHI (r14v15 int) = (r14v12 int), (r14v16 int) binds: [B:51:0x00db, B:57:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec A[LOOP:1: B:53:0x00de->B:57:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX INFO: renamed from: b */
    public static byte[] m79586b(sx8 sx8Var, byte[] bArr) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int length = bArr.length;
        boolean z2 = sx8Var.f214840b;
        boolean z3 = sx8Var.f214840b;
        bga.m29091m(0, length, bArr.length);
        int i9 = 8;
        int i10 = -2;
        if (length == 0) {
            i2 = 0;
        } else {
            if (length == 1) {
                throw new IllegalArgumentException(s571.m77247f(0, "Input should have at least 2 symbols for Base64 decoding, startIndex: ", length, ", endIndex: "));
            }
            if (z2) {
                i = length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = zx8.f287238b[bArr[i11] & 255];
                    if (i12 < 0) {
                        if (i12 == -2) {
                            i -= length - i11;
                            break;
                        }
                        i--;
                    }
                }
            } else if (bArr[length - 1] == 61) {
                i = length - 1;
                if (bArr[length - 2] == 61) {
                    i = length - 2;
                }
            } else {
                i = length;
            }
            i2 = (int) ((((long) i) * ((long) 6)) / ((long) 8));
        }
        byte[] bArr2 = new byte[i2];
        int[] iArr = sx8Var.f214839a ? zx8.f287240d : zx8.f287238b;
        int i13 = -8;
        int i14 = 0;
        int i15 = 0;
        int i16 = -8;
        int i17 = 0;
        while (true) {
            int i18 = i9;
            if (i14 >= length) {
                i3 = i10;
                z = false;
                break;
            }
            if (i16 != i13 || (i8 = i14 + 3) >= length) {
                i4 = bArr[i14] & 255;
                i5 = iArr[i4];
                if (i5 < 0) {
                    i14++;
                    i15 = (i15 << 6) | i5;
                    i6 = i16 + 6;
                    if (i6 >= 0) {
                        bArr2[i17] = (byte) (i15 >>> i6);
                        i15 &= (1 << i6) - 1;
                        i16 -= 2;
                        i17++;
                    } else {
                        i16 = i6;
                    }
                    i9 = 8;
                } else {
                    if (i5 == -2) {
                        if (i16 != -8) {
                            throw new IllegalArgumentException(s571.m77246e(i14, "Redundant pad character at index "));
                        }
                        if (i16 == -6) {
                            i14++;
                        } else if (i16 == -4) {
                            if (i16 != -2) {
                                throw new IllegalStateException("Unreachable");
                            }
                            i14++;
                        } else {
                            i7 = i14 + 1;
                            if (z3) {
                                while (i7 < length) {
                                    if (zx8.f287238b[bArr[i7] & 255] != -1) {
                                        break;
                                    }
                                    i7++;
                                }
                            }
                            if (i7 != length || bArr[i7] != 61) {
                                throw new IllegalArgumentException(s571.m77246e(i7, "Missing one pad character at index "));
                            }
                            i14 = i7 + 1;
                        }
                        z = true;
                        i3 = -2;
                        break;
                    }
                    if (z2) {
                        StringBuilder sb = new StringBuilder("Invalid symbol '");
                        sb.append((char) i4);
                        sb.append("'(");
                        zn91.m96584x(i18);
                        sb.append(Integer.toString(i4, i18));
                        sb.append(") at index ");
                        sb.append(i14);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i14++;
                    i9 = i18;
                }
            } else {
                int i19 = i14 + 4;
                int i20 = iArr[bArr[i8] & 255] | (iArr[bArr[i14 + 2] & 255] << 6) | (iArr[bArr[i14] & 255] << 18) | (iArr[bArr[i14 + 1] & 255] << 12);
                if (i20 >= 0) {
                    bArr2[i17] = (byte) (i20 >> 16);
                    int i21 = i17 + 2;
                    bArr2[i17 + 1] = (byte) (i20 >> 8);
                    i17 += 3;
                    bArr2[i21] = (byte) i20;
                    i9 = i18;
                    i14 = i19;
                } else {
                    i4 = bArr[i14] & 255;
                    i5 = iArr[i4];
                    if (i5 < 0) {
                        i14++;
                        i15 = (i15 << 6) | i5;
                        i6 = i16 + 6;
                        if (i6 >= 0) {
                            bArr2[i17] = (byte) (i15 >>> i6);
                            i15 &= (1 << i6) - 1;
                            i16 -= 2;
                            i17++;
                        } else {
                            i16 = i6;
                        }
                        i9 = 8;
                    } else {
                        if (i5 == -2) {
                            if (i16 != -8) {
                                throw new IllegalArgumentException(s571.m77246e(i14, "Redundant pad character at index "));
                            }
                            if (i16 == -6) {
                                i14++;
                            } else {
                                if (i16 == -4) {
                                    i7 = i14 + 1;
                                    if (z3) {
                                        while (i7 < length) {
                                            if (zx8.f287238b[bArr[i7] & 255] != -1) {
                                                break;
                                                break;
                                            }
                                            i7++;
                                        }
                                    }
                                    if (i7 != length) {
                                    }
                                    throw new IllegalArgumentException(s571.m77246e(i7, "Missing one pad character at index "));
                                }
                                if (i16 != -2) {
                                    throw new IllegalStateException("Unreachable");
                                }
                                i14++;
                            }
                            z = true;
                            i3 = -2;
                            break;
                        }
                        if (z2) {
                            StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                            sb2.append((char) i4);
                            sb2.append("'(");
                            zn91.m96584x(i18);
                            sb2.append(Integer.toString(i4, i18));
                            sb2.append(") at index ");
                            sb2.append(i14);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        i14++;
                        i9 = i18;
                    }
                }
            }
            i10 = -2;
            i13 = -8;
        }
        if (i16 == i3) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i16 != -8 && !z) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i15 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z3) {
            while (i14 < length) {
                if (zx8.f287238b[bArr[i14] & 255] != -1) {
                    break;
                }
                i14++;
            }
        }
        if (i14 >= length) {
            if (i17 == i2) {
                return bArr2;
            }
            throw new IllegalStateException("Check failed.");
        }
        int i22 = bArr[i14] & 255;
        StringBuilder sb3 = new StringBuilder("Symbol '");
        sb3.append((char) i22);
        sb3.append("'(");
        zn91.m96584x(8);
        sb3.append(Integer.toString(i22, 8));
        sb3.append(") at index ");
        throw new IllegalArgumentException(klh.m56832d(i14 - 1, " is prohibited after the pad character", sb3));
    }

    /* JADX INFO: renamed from: c */
    public static String m79587c(sx8 sx8Var, byte[] bArr) {
        int i;
        int length = bArr.length;
        sx8Var.getClass();
        bga.m29091m(0, length, bArr.length);
        int iM79588d = sx8Var.m79588d(length);
        byte[] bArr2 = new byte[iM79588d];
        bga.m29091m(0, length, bArr.length);
        int iM79588d2 = sx8Var.m79588d(length);
        if (iM79588d < 0) {
            throw new IndexOutOfBoundsException(s571.m77246e(iM79588d, "destination offset: 0, destination size: "));
        }
        if (iM79588d2 < 0 || iM79588d2 > iM79588d) {
            throw new IndexOutOfBoundsException(s571.m77247f(iM79588d, "The destination array does not have enough capacity, destination offset: 0, destination size: ", iM79588d2, ", capacity needed: "));
        }
        byte[] bArr3 = sx8Var.f214839a ? zx8.f287239c : zx8.f287237a;
        int i2 = sx8Var.f214840b ? sx8Var.f214842d : Alert.DURATION_SHOW_INDEFINITELY;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3 + 2;
            if (i >= length) {
                break;
            }
            int iMin = Math.min((length - i3) / 3, i2);
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (iMin == i2 && i3 != length) {
                int i11 = i4 + 1;
                byte[] bArr4 = f214838f;
                bArr2[i4] = bArr4[0];
                i4 += 2;
                bArr2[i11] = bArr4[1];
            }
        }
        int i12 = length - i3;
        if (i12 == 1) {
            int i13 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i13 >>> 6];
            bArr2[i4 + 1] = bArr3[i13 & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            i3++;
        } else if (i12 == 2) {
            int i14 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr2[i4] = bArr3[i14 >>> 12];
            bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
            bArr2[i4 + 2] = bArr3[i14 & 63];
            bArr2[i4 + 3] = 61;
            i3 = i;
        }
        if (i3 == length) {
            return new String(bArr2, vuc.f244917e);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: d */
    public final int m79588d(int i) {
        int iM36625y = (i / 3) * 4;
        if (i % 3 != 0) {
            iM36625y += 4;
        }
        if (iM36625y < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f214840b) {
            iM36625y = dq60.m36625y(iM36625y - 1, this.f214841c, 2, iM36625y);
        }
        if (iM36625y >= 0) {
            return iM36625y;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
