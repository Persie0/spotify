package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kd20 extends nd20 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final byte[] f121588b;

    public kd20(byte[] bArr) {
        bArr.getClass();
        this.f121588b = bArr;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: a */
    public final byte[] mo56150a() {
        return (byte[]) this.f121588b.clone();
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: b */
    public final int mo56151b() {
        byte[] bArr = this.f121588b;
        c95.m31854t("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length, bArr.length >= 4);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: c */
    public final long mo56152c() {
        byte[] bArr = this.f121588b;
        c95.m31854t("HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length, bArr.length >= 8);
        long j = bArr[0] & 255;
        for (int i = 1; i < Math.min(bArr.length, 8); i++) {
            j |= (((long) bArr[i]) & 255) << (i * 8);
        }
        return j;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: d */
    public final int mo56153d() {
        return this.f121588b.length * 8;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: e */
    public final boolean mo56154e(nd20 nd20Var) {
        byte[] bArr = this.f121588b;
        if (bArr.length != nd20Var.mo56155f().length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == nd20Var.mo56155f()[i];
        }
        return z;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: f */
    public final byte[] mo56155f() {
        return this.f121588b;
    }
}
