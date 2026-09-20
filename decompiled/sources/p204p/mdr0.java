package p204p;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public final class mdr0 implements jrb0 {

    /* JADX INFO: renamed from: a */
    public final ldr0 f142472a;

    /* JADX INFO: renamed from: b */
    public final int f142473b;

    public mdr0(ldr0 ldr0Var, int i) throws InvalidAlgorithmParameterException {
        this.f142472a = ldr0Var;
        this.f142473b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        ldr0Var.mo58758a(new byte[0], i);
    }

    @Override // p204p.jrb0
    /* JADX INFO: renamed from: a */
    public final void mo54181a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!vgg1.m85477r(mo54182b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // p204p.jrb0
    /* JADX INFO: renamed from: b */
    public final byte[] mo54182b(byte[] bArr) {
        return this.f142472a.mo58758a(bArr, this.f142473b);
    }
}
