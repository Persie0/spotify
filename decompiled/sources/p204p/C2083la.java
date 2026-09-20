package p204p;

/* JADX INFO: renamed from: p.la */
/* JADX INFO: loaded from: classes3.dex */
public final class C2083la implements c5y {

    /* JADX INFO: renamed from: a */
    public final C2045ka f131202a = new C2045ka(0, null, 1, "audio/ac4");

    /* JADX INFO: renamed from: b */
    public final l2n0 f131203b = new l2n0(16384);

    /* JADX INFO: renamed from: c */
    public boolean f131204c;

    @Override // p204p.c5y
    /* JADX INFO: renamed from: a */
    public final void mo31287a(long j, long j2) {
        this.f131204c = false;
        this.f131202a.mo32141c();
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: b */
    public final void mo31288b(e5y e5yVar) {
        this.f131202a.mo32143f(e5yVar, new zmx0(0, 1));
        e5yVar.mo37836t();
        e5yVar.mo37835d(new ra8(-9223372036854775807L));
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: c */
    public final int mo31289c(d5y d5yVar, vaq0 vaq0Var) {
        l2n0 l2n0Var = this.f131203b;
        int i = d5yVar.read(l2n0Var.f129054a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        l2n0Var.m57930R(0);
        l2n0Var.m57929Q(i);
        boolean z = this.f131204c;
        C2045ka c2045ka = this.f131202a;
        if (!z) {
            c2045ka.f120748o = 0L;
            this.f131204c = true;
        }
        c2045ka.mo32139a(l2n0Var);
        return 0;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: d */
    public final boolean mo31290d(d5y d5yVar) {
        hhp hhpVar;
        int i;
        l2n0 l2n0Var = new l2n0(10);
        int i2 = 0;
        while (true) {
            hhpVar = (hhp) d5yVar;
            hhpVar.mo35036c(l2n0Var.f129054a, 0, 10, false);
            l2n0Var.m57930R(0);
            if (l2n0Var.m57920H() != 4801587) {
                break;
            }
            l2n0Var.m57931S(3);
            int iM57916D = l2n0Var.m57916D();
            i2 += iM57916D + 10;
            hhpVar.mo35045w(iM57916D, false);
        }
        hhpVar.f91556f = 0;
        hhpVar.mo35045w(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            hhpVar.mo35036c(l2n0Var.f129054a, 0, 7, false);
            l2n0Var.m57930R(0);
            int iM57924L = l2n0Var.m57924L();
            if (iM57924L == 44096 || iM57924L == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = l2n0Var.f129054a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM57924L == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                hhpVar.mo35045w(i - 7, false);
            } else {
                hhpVar.f91556f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                hhpVar.mo35045w(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // p204p.c5y
    public final void release() {
    }
}
