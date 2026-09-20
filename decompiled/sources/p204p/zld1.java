package p204p;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zld1 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final fqa f283987a;

    /* JADX INFO: renamed from: b */
    public final Random f283988b;

    /* JADX INFO: renamed from: c */
    public final boolean f283989c;

    /* JADX INFO: renamed from: d */
    public final boolean f283990d;

    /* JADX INFO: renamed from: e */
    public final long f283991e;

    /* JADX INFO: renamed from: g */
    public final npa f283993g;

    /* JADX INFO: renamed from: h */
    public boolean f283994h;

    /* JADX INFO: renamed from: i */
    public rme0 f283995i;

    /* JADX INFO: renamed from: f */
    public final npa f283992f = new npa();

    /* JADX INFO: renamed from: t */
    public final byte[] f283996t = new byte[4];

    /* JADX INFO: renamed from: X */
    public final lpa f283986X = new lpa();

    public zld1(fqa fqaVar, Random random, boolean z, boolean z2, long j) {
        this.f283987a = fqaVar;
        this.f283988b = random;
        this.f283989c = z;
        this.f283990d = z2;
        this.f283991e = j;
        this.f283993g = fqaVar.mo42408l();
    }

    /* JADX INFO: renamed from: a */
    public final void m96362a(int i, iva ivaVar) throws IOException {
        if (this.f283994h) {
            throw new IOException("closed");
        }
        int iMo51747d = ivaVar.mo51747d();
        if (iMo51747d > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        npa npaVar = this.f283993g;
        npaVar.m65298J(i | 128);
        npaVar.m65298J(iMo51747d | 128);
        byte[] bArr = this.f283996t;
        wj50.m88279p(bArr);
        this.f283988b.nextBytes(bArr);
        npaVar.write(bArr, 0, bArr.length);
        if (iMo51747d > 0) {
            long j = npaVar.f156904b;
            ivaVar.mo51760s(npaVar, ivaVar.mo51747d());
            lpa lpaVar = this.f283986X;
            wj50.m88279p(lpaVar);
            npaVar.m65313s(lpaVar);
            lpaVar.m59651c(j);
            w1h1.m87007l(lpaVar, bArr);
            lpaVar.close();
        }
        this.f283987a.flush();
    }

    /* JADX INFO: renamed from: c */
    public final void m96363c(int i, iva ivaVar) throws IOException {
        if (this.f283994h) {
            throw new IOException("closed");
        }
        npa npaVar = this.f283992f;
        npaVar.m65297I(ivaVar);
        int i2 = i | 128;
        if (this.f283989c && ivaVar.mo51747d() >= this.f283991e) {
            rme0 rme0Var = this.f283995i;
            if (rme0Var == null) {
                rme0Var = new rme0(this.f283990d, 0);
                this.f283995i = rme0Var;
            }
            rme0Var.m75952a(npaVar);
            i2 = i | 192;
        }
        long j = npaVar.f156904b;
        npa npaVar2 = this.f283993g;
        npaVar2.m65298J(i2);
        if (j <= 125) {
            npaVar2.m65298J(((int) j) | 128);
        } else if (j <= 65535) {
            npaVar2.m65298J(254);
            npaVar2.m65302N((int) j);
        } else {
            npaVar2.m65298J(255);
            gfz0 gfz0VarM65296G = npaVar2.m65296G(8);
            byte[] bArr = gfz0VarM65296G.f79489a;
            int i3 = gfz0VarM65296G.f79491c;
            bArr[i3] = (byte) ((j >>> 56) & 255);
            bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i3 + 7] = (byte) (j & 255);
            gfz0VarM65296G.f79491c = i3 + 8;
            npaVar2.f156904b += 8;
        }
        byte[] bArr2 = this.f283996t;
        wj50.m88279p(bArr2);
        this.f283988b.nextBytes(bArr2);
        npaVar2.write(bArr2, 0, bArr2.length);
        if (j > 0) {
            lpa lpaVar = this.f283986X;
            wj50.m88279p(lpaVar);
            npaVar.m65313s(lpaVar);
            lpaVar.m59651c(0L);
            w1h1.m87007l(lpaVar, bArr2);
            lpaVar.close();
        }
        npaVar2.mo25160U0(npaVar, j);
        this.f283987a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        rme0 rme0Var = this.f283995i;
        if (rme0Var != null) {
            a0f1.m24341b(rme0Var);
        }
        a0f1.m24341b(this.f283987a);
    }
}
