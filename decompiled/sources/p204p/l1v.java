package p204p;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class l1v implements a32 {

    /* JADX INFO: renamed from: a */
    public final on40 f128803a;

    /* JADX INFO: renamed from: b */
    public final jrb0 f128804b;

    /* JADX INFO: renamed from: c */
    public final int f128805c;

    public l1v(on40 on40Var, jrb0 jrb0Var, int i) {
        this.f128803a = on40Var;
        this.f128804b = jrb0Var;
        this.f128805c = i;
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: a */
    public final byte[] mo24592a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrMo67399a = this.f128803a.mo67399a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return vgg1.m85474o(bArrMo67399a, this.f128804b.mo54182b(vgg1.m85474o(bArr2, bArrMo67399a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: b */
    public final byte[] mo24593b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f128805c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f128804b.mo54181a(bArrCopyOfRange2, vgg1.m85474o(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f128803a.mo67400b(bArrCopyOfRange);
    }
}
