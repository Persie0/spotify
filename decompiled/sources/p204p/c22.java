package p204p;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class c22 implements c5y {

    /* JADX INFO: renamed from: a */
    public final int f33269a;

    /* JADX INFO: renamed from: d */
    public final l2n0 f33272d;

    /* JADX INFO: renamed from: e */
    public final ohc f33273e;

    /* JADX INFO: renamed from: f */
    public e5y f33274f;

    /* JADX INFO: renamed from: g */
    public long f33275g;

    /* JADX INFO: renamed from: j */
    public boolean f33278j;

    /* JADX INFO: renamed from: k */
    public boolean f33279k;

    /* JADX INFO: renamed from: l */
    public boolean f33280l;

    /* JADX INFO: renamed from: b */
    public final d22 f33270b = new d22(null, 0, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: c */
    public final l2n0 f33271c = new l2n0(2048);

    /* JADX INFO: renamed from: i */
    public int f33277i = -1;

    /* JADX INFO: renamed from: h */
    public long f33276h = -1;

    public c22(int i) {
        this.f33269a = i;
        l2n0 l2n0Var = new l2n0(10);
        this.f33272d = l2n0Var;
        byte[] bArr = l2n0Var.f129054a;
        this.f33273e = new ohc(bArr, bArr.length);
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: a */
    public final void mo31287a(long j, long j2) {
        this.f33279k = false;
        this.f33270b.mo32141c();
        this.f33275g = j2;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: b */
    public final void mo31288b(e5y e5yVar) {
        this.f33274f = e5yVar;
        this.f33270b.mo32143f(e5yVar, new zmx0(0, 1));
        e5yVar.mo37836t();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    @Override // p204p.c5y
    /* JADX INFO: renamed from: c */
    public final int mo31289c(d5y d5yVar, vaq0 vaq0Var) throws ParserException {
        d22 d22Var;
        this.f33274f.getClass();
        long length = d5yVar.getLength();
        int i = this.f33269a;
        int i2 = -1;
        if ((i & 1) != 0 && length != -1) {
            ohc ohcVar = this.f33273e;
            l2n0 l2n0Var = this.f33272d;
            if (!this.f33278j) {
                this.f33277i = -1;
                d5yVar.mo35037g();
                long j = 0;
                if (d5yVar.getPosition() == 0) {
                    m31291f(d5yVar);
                }
                int i3 = 0;
                for (int i4 = 0; d5yVar.mo35036c(l2n0Var.f129054a, i4, 2, true); i4 = 0) {
                    try {
                        l2n0Var.m57930R(i4);
                        if (((l2n0Var.m57924L() & 65526) == 65520 ? 1 : i4) == 0) {
                            i3 = i4;
                            break;
                        }
                        if (!d5yVar.mo35036c(l2n0Var.f129054a, i4, 4, true)) {
                            break;
                        }
                        ohcVar.m66960m(14);
                        int iM66954g = ohcVar.m66954g(13);
                        if (iM66954g <= 6) {
                            this.f33278j = true;
                            throw ParserException.m752a(null, "Malformed ADTS stream");
                        }
                        j += (long) iM66954g;
                        i3++;
                        if (i3 == 1000 || !d5yVar.mo35045w(iM66954g - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                d5yVar.mo35037g();
                if (i3 > 0) {
                    this.f33277i = (int) (j / ((long) i3));
                } else {
                    this.f33277i = -1;
                }
                this.f33278j = true;
            }
        }
        l2n0 l2n0Var2 = this.f33271c;
        int i5 = d5yVar.read(l2n0Var2.f129054a, 0, 2048);
        boolean z = i5 == -1;
        boolean z2 = this.f33280l;
        d22 d22Var2 = this.f33270b;
        if (z2) {
            i2 = -1;
            d22Var = d22Var2;
        } else {
            boolean z3 = (i & 1) != 0 && this.f33277i > 0;
            if (z3 && d22Var2.f44426s == -9223372036854775807L && !z) {
                i2 = -1;
                d22Var = d22Var2;
            } else {
                if (z3) {
                    long j2 = d22Var2.f44426s;
                    if (j2 != -9223372036854775807L) {
                        e5y e5yVar = this.f33274f;
                        int i6 = this.f33277i;
                        d22Var = d22Var2;
                        e5yVar.mo37835d(new f5j(length, this.f33276h, (int) ((((long) i6) * 8000000) / j2), i6, false, true));
                    } else {
                        d22Var = d22Var2;
                        this.f33274f.mo37835d(new ra8(-9223372036854775807L));
                    }
                } else {
                    d22Var = d22Var2;
                    this.f33274f.mo37835d(new ra8(-9223372036854775807L));
                }
                this.f33280l = true;
            }
        }
        if (z) {
            return i2;
        }
        l2n0Var2.m57930R(0);
        l2n0Var2.m57929Q(i5);
        if (!this.f33279k) {
            d22Var.f44428u = this.f33275g;
            this.f33279k = true;
        }
        d22Var.mo32139a(l2n0Var2);
        return 0;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: d */
    public final boolean mo31290d(d5y d5yVar) {
        int iM31291f = m31291f(d5yVar);
        int i = iM31291f;
        int i2 = 0;
        int i3 = 0;
        do {
            l2n0 l2n0Var = this.f33272d;
            hhp hhpVar = (hhp) d5yVar;
            hhpVar.mo35036c(l2n0Var.f129054a, 0, 2, false);
            l2n0Var.m57930R(0);
            if ((l2n0Var.m57924L() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                hhpVar.mo35036c(l2n0Var.f129054a, 0, 4, false);
                ohc ohcVar = this.f33273e;
                ohcVar.m66960m(14);
                int iM66954g = ohcVar.m66954g(13);
                if (iM66954g <= 6) {
                    i++;
                    hhpVar.f91556f = 0;
                    hhpVar.mo35045w(i, false);
                } else {
                    hhpVar.mo35045w(iM66954g - 6, false);
                    i3 += iM66954g;
                }
            } else {
                i++;
                hhpVar.f91556f = 0;
                hhpVar.mo35045w(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iM31291f < 8192);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m31291f(d5y d5yVar) {
        int i = 0;
        while (true) {
            l2n0 l2n0Var = this.f33272d;
            d5yVar.mo35039i(0, l2n0Var.f129054a, 10);
            l2n0Var.m57930R(0);
            if (l2n0Var.m57920H() != 4801587) {
                break;
            }
            l2n0Var.m57931S(3);
            int iM57916D = l2n0Var.m57916D();
            i += iM57916D + 10;
            d5yVar.mo35041n(iM57916D);
        }
        d5yVar.mo35037g();
        d5yVar.mo35041n(i);
        if (this.f33276h == -1) {
            this.f33276h = i;
        }
        return i;
    }

    @Override // p204p.c5y
    public final void release() {
    }
}
