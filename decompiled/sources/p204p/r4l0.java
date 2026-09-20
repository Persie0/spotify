package p204p;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class r4l0 {

    /* JADX INFO: renamed from: a */
    public int f195799a;

    /* JADX INFO: renamed from: b */
    public long f195800b;

    /* JADX INFO: renamed from: c */
    public int f195801c;

    /* JADX INFO: renamed from: d */
    public int f195802d;

    /* JADX INFO: renamed from: e */
    public int f195803e;

    /* JADX INFO: renamed from: f */
    public final int[] f195804f = new int[255];

    /* JADX INFO: renamed from: g */
    public final l2n0 f195805g = new l2n0(255);

    /* JADX INFO: renamed from: a */
    public final boolean m74758a(d5y d5yVar, boolean z) throws ParserException, EOFException {
        boolean zMo35036c;
        boolean zMo35036c2;
        m74759b();
        l2n0 l2n0Var = this.f195805g;
        l2n0Var.m57927O(27);
        try {
            zMo35036c = d5yVar.mo35036c(l2n0Var.f129054a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo35036c = false;
        }
        if (zMo35036c && l2n0Var.m57919G() == 1332176723) {
            if (l2n0Var.m57917E() == 0) {
                this.f195799a = l2n0Var.m57917E();
                this.f195800b = l2n0Var.m57948t();
                l2n0Var.m57950v();
                l2n0Var.m57950v();
                l2n0Var.m57950v();
                int iM57917E = l2n0Var.m57917E();
                this.f195801c = iM57917E;
                this.f195802d = iM57917E + 27;
                l2n0Var.m57927O(iM57917E);
                try {
                    zMo35036c2 = d5yVar.mo35036c(l2n0Var.f129054a, 0, this.f195801c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo35036c2 = false;
                }
                if (zMo35036c2) {
                    for (int i = 0; i < this.f195801c; i++) {
                        int iM57917E2 = l2n0Var.m57917E();
                        this.f195804f[i] = iM57917E2;
                        this.f195803e += iM57917E2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.m755d("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m74759b() {
        this.f195799a = 0;
        this.f195800b = 0L;
        this.f195801c = 0;
        this.f195802d = 0;
        this.f195803e = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74760c(d5y d5yVar) {
        return m74761d(d5yVar, -1L);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74761d(d5y d5yVar, long j) {
        boolean zMo35036c;
        c95.m31843i(d5yVar.getPosition() == d5yVar.mo35040k());
        l2n0 l2n0Var = this.f195805g;
        l2n0Var.m57927O(4);
        while (true) {
            if (j != -1 && d5yVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo35036c = d5yVar.mo35036c(l2n0Var.f129054a, 0, 4, true);
            } catch (EOFException unused) {
                zMo35036c = false;
            }
            if (!zMo35036c) {
                break;
            }
            l2n0Var.m57930R(0);
            if (l2n0Var.m57919G() == 1332176723) {
                d5yVar.mo35037g();
                return true;
            }
            d5yVar.mo35044v(1);
        }
        do {
            if (j != -1 && d5yVar.getPosition() >= j) {
                break;
            }
        } while (d5yVar.mo35043s(1) != -1);
        return false;
    }
}
