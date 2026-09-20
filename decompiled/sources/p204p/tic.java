package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tic extends uic {
    @Override // p204p.uic
    /* JADX INFO: renamed from: d */
    public final int[] mo78002d(int[] iArr, int i) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = uic.f230653c;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.f230654a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // p204p.uic
    /* JADX INFO: renamed from: g */
    public final int mo78003g() {
        return 12;
    }
}
