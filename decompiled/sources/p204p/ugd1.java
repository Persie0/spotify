package p204p;

import androidx.media3.common.ParserException;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ugd1 implements vgd1 {

    /* JADX INFO: renamed from: m */
    public static final int[] f230129m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f230130n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, Error.TOO_YOUNG_FIELD_NUMBER, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final e5y f230131a;

    /* JADX INFO: renamed from: b */
    public final ck81 f230132b;

    /* JADX INFO: renamed from: c */
    public final o7f f230133c;

    /* JADX INFO: renamed from: d */
    public final int f230134d;

    /* JADX INFO: renamed from: e */
    public final byte[] f230135e;

    /* JADX INFO: renamed from: f */
    public final l2n0 f230136f;

    /* JADX INFO: renamed from: g */
    public final int f230137g;

    /* JADX INFO: renamed from: h */
    public final r300 f230138h;

    /* JADX INFO: renamed from: i */
    public int f230139i;

    /* JADX INFO: renamed from: j */
    public long f230140j;

    /* JADX INFO: renamed from: k */
    public int f230141k;

    /* JADX INFO: renamed from: l */
    public long f230142l;

    public ugd1(e5y e5yVar, ck81 ck81Var, o7f o7fVar) throws ParserException {
        this.f230131a = e5yVar;
        this.f230132b = ck81Var;
        this.f230133c = o7fVar;
        int i = o7fVar.f162532b;
        int iMax = Math.max(1, i / 10);
        this.f230137g = iMax;
        l2n0 l2n0Var = new l2n0(o7fVar.f162535e);
        l2n0Var.m57952x();
        int iM57952x = l2n0Var.m57952x();
        this.f230134d = iM57952x;
        int i2 = o7fVar.f162531a;
        int i3 = o7fVar.f162533c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (o7fVar.f162534d * i2)) + 1;
        if (iM57952x != i4) {
            throw ParserException.m752a(null, "Expected frames per block: " + i4 + "; got: " + iM57952x);
        }
        int iM46311g = h0b1.m46311g(iMax, iM57952x);
        this.f230135e = new byte[iM46311g * i3];
        this.f230136f = new l2n0(iM57952x * 2 * i2 * iM46311g);
        int i5 = ((i3 * i) * 8) / iM57952x;
        p300 p300Var = new p300();
        p300Var.f173527o = def0.m35799p("audio/raw");
        p300Var.f173521i = i5;
        p300Var.f173522j = i5;
        p300Var.f173528p = iMax * 2 * i2;
        p300Var.f173502I = i2;
        int i6 = o7fVar.f162536f;
        p300Var.f173503J = i6 == 0 ? -1 : i6 << 2;
        p300Var.f173504K = i;
        p300Var.f173505L = 2;
        this.f230138h = new r300(p300Var);
    }

    @Override // p204p.vgd1
    /* JADX INFO: renamed from: a */
    public final void mo83031a(int i, long j) {
        ygd1 ygd1Var = new ygd1(this.f230133c, this.f230134d, i, j);
        this.f230131a.mo37835d(ygd1Var);
        r300 r300Var = this.f230138h;
        ck81 ck81Var = this.f230132b;
        ck81Var.mo33087a(r300Var);
        ck81Var.mo33093g(ygd1Var.f272569e);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // p204p.vgd1
    /* JADX INFO: renamed from: b */
    public final boolean mo83032b(d5y d5yVar, long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        l2n0 l2n0Var;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        int i8;
        int iM46317j;
        int iMin;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        byte b;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f230141k;
        o7f o7fVar = this.f230133c;
        int i19 = i18 / (o7fVar.f162531a * 2);
        int i20 = this.f230137g;
        int i21 = this.f230134d;
        int iM46311g = h0b1.m46311g(i20 - i19, i21);
        int i22 = o7fVar.f162533c;
        int i23 = iM46311g * i22;
        boolean z = j == 0;
        while (true) {
            bArr = this.f230135e;
            if (z && (i16 = this.f230139i) < i23) {
                i17 = d5yVar.read(bArr, this.f230139i, (int) Math.min(i23 - i16, j));
                if (i17 == -1) {
                    break;
                }
                this.f230139i += i17;
                bArr = this.f230135e;
                if (z) {
                }
            }
            i = this.f230139i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    l2n0Var = this.f230136f;
                    if (i3 < i) {
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = o7fVar.f162531a;
                        if (i5 < i6) {
                            bArr2 = l2n0Var.f129054a;
                            int i24 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i24;
                            i8 = (i22 / i6) - 4;
                            iM46317j = (short) ((bArr[i24] & 255) | ((bArr[i24 + 1] & 255) << 8));
                            int i25 = i;
                            iMin = Math.min(bArr[i24 + 2] & 255, 88);
                            iArr = f230130n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iM46317j & 255);
                            bArr2[i10 + 1] = (byte) (iM46317j >> 8);
                            int i26 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iM46317j = h0b1.m46317j(iM46317j + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iM46317j & 255);
                                bArr2[i10 + 1] = (byte) (iM46317j >> 8);
                                iMin = h0b1.m46317j(iMin + f230129m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i25;
                            i3 = i26;
                        }
                    }
                    i3++;
                }
                int i27 = i;
                int i28 = i21 * i27 * 2 * o7fVar.f162531a;
                l2n0Var.m57930R(0);
                l2n0Var.m57929Q(i28);
                this.f230139i -= i27 * i22;
                int i29 = l2n0Var.f129056c;
                this.f230132b.mo33092f(i29, l2n0Var);
                i4 = this.f230141k + i29;
                this.f230141k = i4;
                if (i4 / (o7fVar.f162531a * 2) >= i20) {
                    m83034d(i20);
                }
            }
            if (z && (i2 = this.f230141k / (o7fVar.f162531a * 2)) > 0) {
                m83034d(i2);
            }
            return z;
        }
        while (true) {
            bArr = this.f230135e;
            if (z) {
            }
            i = this.f230139i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    l2n0Var = this.f230136f;
                    if (i3 < i) {
                        break;
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = o7fVar.f162531a;
                        if (i5 < i6) {
                            bArr2 = l2n0Var.f129054a;
                            int i210 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i210;
                            i8 = (i22 / i6) - 4;
                            iM46317j = (short) ((bArr[i210] & 255) | ((bArr[i210 + 1] & 255) << 8));
                            int i211 = i;
                            iMin = Math.min(bArr[i210 + 2] & 255, 88);
                            iArr = f230130n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iM46317j & 255);
                            bArr2[i10 + 1] = (byte) (iM46317j >> 8);
                            int i212 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iM46317j = h0b1.m46317j(iM46317j + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iM46317j & 255);
                                bArr2[i10 + 1] = (byte) (iM46317j >> 8);
                                iMin = h0b1.m46317j(iMin + f230129m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i211;
                            i3 = i212;
                        }
                    }
                    i3++;
                }
                int i213 = i;
                int i214 = i21 * i213 * 2 * o7fVar.f162531a;
                l2n0Var.m57930R(0);
                l2n0Var.m57929Q(i214);
                this.f230139i -= i213 * i22;
                int i215 = l2n0Var.f129056c;
                this.f230132b.mo33092f(i215, l2n0Var);
                i4 = this.f230141k + i215;
                this.f230141k = i4;
                if (i4 / (o7fVar.f162531a * 2) >= i20) {
                    m83034d(i20);
                }
            }
            if (z) {
                m83034d(i2);
            }
            return z;
            this.f230139i += i17;
        }
    }

    @Override // p204p.vgd1
    /* JADX INFO: renamed from: c */
    public final void mo83033c(long j) {
        this.f230139i = 0;
        this.f230140j = j;
        this.f230141k = 0;
        this.f230142l = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m83034d(int i) {
        long j = this.f230140j;
        long j2 = this.f230142l;
        o7f o7fVar = this.f230133c;
        long j3 = o7fVar.f162532b;
        String str = h0b1.f86200a;
        long jM46312g0 = j + h0b1.m46312g0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * o7fVar.f162531a;
        this.f230132b.mo33088b(jM46312g0, 1, i2, this.f230141k - i2, null);
        this.f230142l += (long) i;
        this.f230141k -= i2;
    }
}
