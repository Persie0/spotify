package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gh21 implements k7a0 {

    /* JADX INFO: renamed from: a */
    public final long f79788a = o0a0.f160316h.getAndIncrement();

    /* JADX INFO: renamed from: b */
    public final sjo f79789b;

    /* JADX INFO: renamed from: c */
    public final nz41 f79790c;

    /* JADX INFO: renamed from: d */
    public byte[] f79791d;

    public gh21(uio uioVar, sjo sjoVar) {
        this.f79789b = sjoVar;
        this.f79790c = new nz41(uioVar);
    }

    @Override // p204p.k7a0
    /* JADX INFO: renamed from: a */
    public final void mo38892a() {
        nz41 nz41Var = this.f79790c;
        nz41Var.f159996b = 0L;
        try {
            nz41Var.mo28175u(this.f79789b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) nz41Var.f159996b;
                byte[] bArr = this.f79791d;
                if (bArr == null) {
                    this.f79791d = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.f79791d = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f79791d;
                i = nz41Var.read(bArr2, i2, bArr2.length - i2);
            }
        } finally {
            mag1.m61306p(nz41Var);
        }
    }

    @Override // p204p.k7a0
    /* JADX INFO: renamed from: b */
    public final void mo38893b() {
    }
}
