package p204p;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tme0 extends AbstractC2638z5 {

    /* JADX INFO: renamed from: f */
    public final MessageDigest f221672f;

    /* JADX INFO: renamed from: g */
    public final int f221673g;

    /* JADX INFO: renamed from: h */
    public boolean f221674h;

    public tme0(MessageDigest messageDigest, int i) {
        this.f221672f = messageDigest;
        this.f221673g = i;
    }

    @Override // p204p.c95
    /* JADX INFO: renamed from: F */
    public final nd20 mo25555F() {
        c95.m31856v(!this.f221674h, "Cannot re-use a Hasher after calling hash() on it");
        this.f221674h = true;
        MessageDigest messageDigest = this.f221672f;
        int digestLength = messageDigest.getDigestLength();
        int i = this.f221673g;
        if (i == digestLength) {
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = nd20.f152641a;
            return new kd20(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        char[] cArr2 = nd20.f152641a;
        return new kd20(bArrCopyOf);
    }

    @Override // p204p.AbstractC2638z5
    /* JADX INFO: renamed from: e0 */
    public final void mo40584e0(byte[] bArr, int i) {
        c95.m31856v(!this.f221674h, "Cannot re-use a Hasher after calling hash() on it");
        this.f221672f.update(bArr, 0, i);
    }
}
