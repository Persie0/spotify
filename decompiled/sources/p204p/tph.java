package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tph extends pph {

    /* JADX INFO: renamed from: c */
    public final boolean f222545c;

    public tph(hg50 hg50Var, boolean z) {
        super(hg50Var);
        this.f222545c = z;
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: d */
    public final void mo70578d(byte b) {
        if (this.f222545c) {
            mo70584j(String.valueOf(b & 255));
        } else {
            m70582h(String.valueOf(b & 255));
        }
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: f */
    public final void mo70580f(int i) {
        if (this.f222545c) {
            mo70584j(Long.toString(((long) i) & 4294967295L, 10));
        } else {
            m70582h(Long.toString(((long) i) & 4294967295L, 10));
        }
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: g */
    public final void mo70581g(long j) {
        int i = 63;
        String str = "0";
        if (this.f222545c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            mo70584j(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        m70582h(str);
    }

    @Override // p204p.pph
    /* JADX INFO: renamed from: i */
    public final void mo70583i(short s) {
        if (this.f222545c) {
            mo70584j(String.valueOf(s & 65535));
        } else {
            m70582h(String.valueOf(s & 65535));
        }
    }
}
