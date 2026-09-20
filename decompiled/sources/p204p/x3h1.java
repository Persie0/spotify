package p204p;

import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x3h1 {

    /* JADX INFO: renamed from: a */
    public static final q3h1 f257815a = new q3h1(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b */
    public static final g2a1 f257816b = new g2a1(25, new y0i0(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 21), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c */
    public static final byte[] f257817c = {-19, MessagePack.Code.INT64, -11, 92, 26, 99, 18, 88, MessagePack.Code.FIXEXT4, -100, -9, -94, MessagePack.Code.MAP16, -7, MessagePack.Code.MAP16, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m89798a(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        upf.m83679W(jArr2);
        byte[] bArrM83684a0 = upf.m83684a0(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrM83684a0[i] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m89799b(long[] jArr) {
        return upf.m83684a0(jArr)[0] & 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m89800c(g2a1 g2a1Var, s0f1 s0f1Var, q3h1 q3h1Var) {
        y0i0 y0i0Var = (y0i0) s0f1Var.f204378b;
        y0i0 y0i0Var2 = (y0i0) g2a1Var.f75876b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) y0i0Var2.f267991d;
        long[] jArr3 = (long[]) y0i0Var.f267989b;
        long[] jArr4 = (long[]) y0i0Var.f267991d;
        upf.m83676T(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) y0i0Var2.f267989b;
        upf.m83677U(jArr5, jArr3, jArr4);
        upf.m83680X(jArr5, jArr5, q3h1Var.f184886b);
        long[] jArr6 = q3h1Var.f184885a;
        long[] jArr7 = (long[]) y0i0Var2.f267990c;
        upf.m83680X(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) g2a1Var.f75877c;
        upf.m83680X(jArr8, (long[]) s0f1Var.f204379c, q3h1Var.f184887c);
        q3h1Var.mo72120a(jArr2, (long[]) y0i0Var.f267990c);
        upf.m83676T(jArr, jArr2, jArr2);
        upf.m83677U(jArr2, jArr7, jArr5);
        upf.m83676T(jArr5, jArr7, jArr5);
        upf.m83676T(jArr7, jArr, jArr8);
        upf.m83677U(jArr8, jArr, jArr8);
    }

    /* JADX INFO: renamed from: d */
    public static void m89801d(g2a1 g2a1Var, s0f1 s0f1Var, q3h1 q3h1Var) {
        y0i0 y0i0Var = (y0i0) s0f1Var.f204378b;
        y0i0 y0i0Var2 = (y0i0) g2a1Var.f75876b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) y0i0Var2.f267991d;
        long[] jArr3 = (long[]) y0i0Var.f267989b;
        long[] jArr4 = (long[]) y0i0Var.f267991d;
        upf.m83676T(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) y0i0Var2.f267989b;
        upf.m83677U(jArr5, jArr3, jArr4);
        upf.m83680X(jArr5, jArr5, q3h1Var.f184885a);
        long[] jArr6 = q3h1Var.f184886b;
        long[] jArr7 = (long[]) y0i0Var2.f267990c;
        upf.m83680X(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) g2a1Var.f75877c;
        upf.m83680X(jArr8, (long[]) s0f1Var.f204379c, q3h1Var.f184887c);
        q3h1Var.mo72120a(jArr2, (long[]) y0i0Var.f267990c);
        upf.m83676T(jArr, jArr2, jArr2);
        upf.m83677U(jArr2, jArr7, jArr5);
        upf.m83676T(jArr5, jArr7, jArr5);
        upf.m83677U(jArr7, jArr, jArr8);
        upf.m83676T(jArr8, jArr, jArr8);
    }

    /* JADX INFO: renamed from: e */
    public static void m89802e(y0i0 y0i0Var, g2a1 g2a1Var) {
        y0i0 y0i0Var2 = (y0i0) g2a1Var.f75876b;
        long[] jArr = (long[]) y0i0Var2.f267991d;
        long[] jArr2 = (long[]) y0i0Var.f267991d;
        long[] jArr3 = new long[10];
        upf.m83681Y(jArr, jArr2);
        long[] jArr4 = (long[]) y0i0Var2.f267990c;
        long[] jArr5 = (long[]) y0i0Var.f267989b;
        upf.m83681Y(jArr4, jArr5);
        long[] jArr6 = (long[]) g2a1Var.f75877c;
        upf.m83681Y(jArr6, (long[]) y0i0Var.f267990c);
        upf.m83676T(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) y0i0Var2.f267989b;
        upf.m83676T(jArr7, jArr2, jArr5);
        upf.m83681Y(jArr3, jArr7);
        upf.m83676T(jArr7, jArr4, jArr);
        upf.m83677U(jArr4, jArr4, jArr);
        upf.m83677U(jArr, jArr3, jArr7);
        upf.m83677U(jArr6, jArr6, jArr4);
    }

    /* JADX INFO: renamed from: f */
    public static int m89803f(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    /* JADX INFO: renamed from: g */
    public static void m89804g(q3h1 q3h1Var, int i, byte b) {
        q3h1[][] q3h1VarArr = a4h1.f12255d;
        int i2 = (b & 255) >> 7;
        int i3 = (-i2) & b;
        int i4 = b - (i3 + i3);
        q3h1Var.m72121b(q3h1VarArr[i][0], m89803f(i4, 1));
        q3h1Var.m72121b(q3h1VarArr[i][1], m89803f(i4, 2));
        q3h1Var.m72121b(q3h1VarArr[i][2], m89803f(i4, 3));
        q3h1Var.m72121b(q3h1VarArr[i][3], m89803f(i4, 4));
        q3h1Var.m72121b(q3h1VarArr[i][4], m89803f(i4, 5));
        q3h1Var.m72121b(q3h1VarArr[i][5], m89803f(i4, 6));
        q3h1Var.m72121b(q3h1VarArr[i][6], m89803f(i4, 7));
        q3h1Var.m72121b(q3h1VarArr[i][7], m89803f(i4, 8));
        long[] jArr = q3h1Var.f184887c;
        long[] jArr2 = q3h1Var.f184885a;
        long[] jArr3 = q3h1Var.f184886b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i5 = 0; i5 < jArrCopyOf3.length; i5++) {
            jArrCopyOf3[i5] = -jArrCopyOf3[i5];
        }
        hvf1.m48847s(jArr2, jArrCopyOf, i2);
        hvf1.m48847s(jArr3, jArrCopyOf2, i2);
        hvf1.m48847s(jArr, jArrCopyOf3, i2);
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m89805h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 > 15) {
                            int i7 = b2 - i5;
                            if (i7 < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) i7;
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: i */
    public static long m89806i(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    /* JADX INFO: renamed from: j */
    public static long m89807j(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | m89806i(bArr, i);
    }
}
