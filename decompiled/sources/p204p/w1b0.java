package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w1b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247052a;

    /* JADX INFO: renamed from: b */
    public int f247053b;

    /* JADX INFO: renamed from: c */
    public long[] f247054c;

    public w1b0() {
        this.f247052a = 1;
        this.f247054c = new long[2];
    }

    /* JADX INFO: renamed from: a */
    public final void m86983a(long j) {
        switch (this.f247052a) {
            case 0:
                int i = this.f247053b;
                long[] jArr = this.f247054c;
                if (i == jArr.length) {
                    this.f247054c = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.f247054c;
                int i2 = this.f247053b;
                this.f247053b = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!m86986d(j)) {
                    int i3 = this.f247053b;
                    long[] jArrCopyOf = this.f247054c;
                    if (i3 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i3 + 1, jArrCopyOf.length * 2));
                        this.f247054c = jArrCopyOf;
                    }
                    jArrCopyOf[i3] = j;
                    if (i3 >= this.f247053b) {
                        this.f247053b = i3 + 1;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m86984b(long[] jArr) {
        int length = this.f247053b + jArr.length;
        long[] jArr2 = this.f247054c;
        if (length > jArr2.length) {
            this.f247054c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f247054c, this.f247053b, jArr.length);
        this.f247053b = length;
    }

    /* JADX INFO: renamed from: c */
    public void m86985c() {
        this.f247053b = 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86986d(long j) {
        int i = this.f247053b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f247054c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public long m86987e(int i) {
        if (i >= 0 && i < this.f247053b) {
            return this.f247054c[i];
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Invalid index ", ", size is ");
        sbM56838j.append(this.f247053b);
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: f */
    public long m86988f(int i) {
        return this.f247054c[i];
    }

    /* JADX INFO: renamed from: g */
    public int m86989g() {
        return this.f247053b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86990h() {
        return this.f247053b == 0;
    }

    /* JADX INFO: renamed from: i */
    public void m86991i(long j) {
        int i = this.f247053b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.f247054c[i2]) {
                int i3 = this.f247053b - 1;
                while (i2 < i3) {
                    long[] jArr = this.f247054c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f247053b--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m86992j(int i) {
        int i2 = this.f247053b;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = this.f247054c;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.f247053b--;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m86993k() {
        return this.f247053b;
    }

    public w1b0(int i) {
        this.f247052a = 0;
        this.f247054c = new long[i];
    }
}
