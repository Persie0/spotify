package p204p;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class lbh1 extends s7f1 {

    /* JADX INFO: renamed from: d */
    public final tbh1 f131668d;

    /* JADX INFO: renamed from: e */
    public final kkc1 f131669e;

    public lbh1(tbh1 tbh1Var, kkc1 kkc1Var) {
        this.f131668d = tbh1Var;
        this.f131669e = kkc1Var;
    }

    /* JADX INFO: renamed from: u */
    public static lbh1 m58663u(tbh1 tbh1Var, kkc1 kkc1Var) throws GeneralSecurityException {
        int i;
        f9f1 f9f1Var = (f9f1) kkc1Var.f123567b;
        if (f9f1Var.f67266a.length != 32) {
            int length = f9f1Var.f67266a.length;
            throw new GeneralSecurityException(s571.m77248g(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        byte[] bArrM41056b = tbh1Var.f218858e.m41056b();
        byte[] bArrM41056b2 = f9f1Var.m41056b();
        MessageDigest messageDigest = (MessageDigest) z8f1.f280469c.f280471a.zza("SHA-512");
        messageDigest.update(bArrM41056b2, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i2 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i2;
        bArrDigest[31] = (byte) (i2 | 64);
        byte[] bArr = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 + i3;
            bArr[i4] = (byte) (bArrDigest[i3] & 15);
            bArr[i4 + 1] = (byte) ((bArrDigest[i3] & 255) >> 4);
            i3++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 63) {
            byte b = (byte) (bArr[i5] + i6);
            bArr[i5] = b;
            int i7 = (b + 8) >> 4;
            bArr[i5] = (byte) (b - (i7 << 4));
            i5++;
            i6 = i7;
        }
        bArr[63] = (byte) (bArr[63] + i6);
        g2a1 g2a1Var = new g2a1(25);
        s0f1 s0f1Var = new s0f1();
        for (i = 1; i < 64; i += 2) {
            q3h1 q3h1Var = new q3h1();
            x3h1.m89804g(q3h1Var, i / 2, bArr[i]);
            s0f1.m76863g(s0f1Var, g2a1Var);
            x3h1.m89800c(g2a1Var, s0f1Var, q3h1Var);
        }
        y0i0 y0i0Var = new y0i0(21);
        y0i0.m92583o(y0i0Var, g2a1Var);
        x3h1.m89802e(y0i0Var, g2a1Var);
        y0i0.m92583o(y0i0Var, g2a1Var);
        x3h1.m89802e(y0i0Var, g2a1Var);
        y0i0.m92583o(y0i0Var, g2a1Var);
        x3h1.m89802e(y0i0Var, g2a1Var);
        y0i0.m92583o(y0i0Var, g2a1Var);
        x3h1.m89802e(y0i0Var, g2a1Var);
        for (int i8 = 0; i8 < 64; i8 += 2) {
            q3h1 q3h1Var2 = new q3h1();
            x3h1.m89804g(q3h1Var2, i8 / 2, bArr[i8]);
            s0f1.m76863g(s0f1Var, g2a1Var);
            x3h1.m89800c(g2a1Var, s0f1Var, q3h1Var2);
        }
        y0i0 y0i0Var2 = new y0i0(g2a1Var);
        long[] jArr = new long[10];
        upf.m83681Y(jArr, (long[]) y0i0Var2.f267991d);
        long[] jArr2 = new long[10];
        upf.m83681Y(jArr2, (long[]) y0i0Var2.f267989b);
        long[] jArr3 = new long[10];
        upf.m83681Y(jArr3, (long[]) y0i0Var2.f267990c);
        long[] jArr4 = new long[10];
        upf.m83681Y(jArr4, jArr3);
        long[] jArr5 = new long[10];
        upf.m83677U(jArr5, jArr2, jArr);
        upf.m83680X(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        upf.m83680X(jArr6, jArr, jArr2);
        upf.m83680X(jArr6, jArr6, a4h1.f12252a);
        upf.m83676T(jArr6, jArr6, jArr4);
        upf.m83678V(jArr6, jArr6);
        if (!MessageDigest.isEqual(upf.m83684a0(jArr5), upf.m83684a0(jArr6))) {
            throw new IllegalStateException("arithmetic error in scalar multiplication");
        }
        if (Arrays.equals(bArrM41056b, y0i0Var2.m92595p())) {
            return new lbh1(tbh1Var, kkc1Var);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // p204p.kuf1
    /* JADX INFO: renamed from: r */
    public final l1h1 mo25352r() {
        return this.f131668d.f218857d;
    }

    @Override // p204p.s7f1
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ t7f1 mo25353t() {
        return this.f131668d;
    }
}
