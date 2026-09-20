package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bl91 {

    /* JADX INFO: renamed from: a */
    public final byte[] f28134a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f28135b;

    /* JADX INFO: renamed from: c */
    public int f28136c;

    /* JADX INFO: renamed from: d */
    public long f28137d;

    /* JADX INFO: renamed from: e */
    public int f28138e;

    /* JADX INFO: renamed from: f */
    public int f28139f;

    /* JADX INFO: renamed from: g */
    public int f28140g;

    /* JADX INFO: renamed from: a */
    public final void m29752a(ck81 ck81Var, bk81 bk81Var) {
        if (this.f28136c > 0) {
            ck81Var.mo33088b(this.f28137d, this.f28138e, this.f28139f, this.f28140g, bk81Var);
            this.f28136c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m29753b(ck81 ck81Var, long j, int i, int i2, int i3, bk81 bk81Var) {
        c95.m31856v(this.f28140g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f28135b) {
            int i4 = this.f28136c;
            int i5 = i4 + 1;
            this.f28136c = i5;
            if (i4 == 0) {
                this.f28137d = j;
                this.f28138e = i;
                this.f28139f = 0;
            }
            this.f28139f += i2;
            this.f28140g = i3;
            if (i5 >= 16) {
                m29752a(ck81Var, bk81Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29754c(d5y d5yVar) {
        if (this.f28135b) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f28134a;
        d5yVar.mo35039i(0, bArr, 10);
        d5yVar.mo35037g();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f28135b = true;
    }
}
