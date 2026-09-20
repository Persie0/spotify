package p204p;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class nlr implements ck81 {

    /* JADX INFO: renamed from: a */
    public final byte[] f155132a = new byte[4096];

    @Override // p204p.ck81
    /* JADX INFO: renamed from: c */
    public final void mo33089c(l2n0 l2n0Var, int i, int i2) {
        l2n0Var.m57931S(i);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: d */
    public final int mo33090d(fho fhoVar, int i, boolean z) throws EOFException {
        byte[] bArr = this.f155132a;
        int i2 = fhoVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: a */
    public final void mo33087a(r300 r300Var) {
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: b */
    public final void mo33088b(long j, int i, int i2, int i3, bk81 bk81Var) {
    }
}
