package p204p;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes8.dex */
public final class owi0 extends SecureRandom {

    /* JADX INFO: renamed from: a */
    public int f170718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte[] f170719b;

    public owi0(byte[] bArr) {
        this.f170719b = bArr;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        int i = this.f170718a;
        int length = bArr.length + i;
        byte[] bArr2 = this.f170719b;
        if (length > bArr2.length) {
            throw new IllegalStateException(edb.m38560i(this.f170718a + bArr.length, bArr2.length, "Ed25519 KeyPairGenerator requested ", " random bytes, but only ", " seed bytes available"));
        }
        bk5.m29625n0(0, i, bArr.length + i, bArr2, bArr);
        this.f170718a += bArr.length;
    }
}
