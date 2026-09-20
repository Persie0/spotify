package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w2b0 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f247312a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f247313b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f247314c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f247315d;

    public w2b0(int i) {
        if (i == 0) {
            this.f247313b = fem.f68797b;
            this.f247314c = fem.f68798c;
        } else {
            int iM41469r = fem.m41469r(i);
            this.f247313b = new long[iM41469r];
            this.f247314c = new Object[iM41469r];
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m87066b() {
        int i = this.f247315d;
        Object[] objArr = this.f247314c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f247315d = 0;
        this.f247312a = false;
    }

    /* JADX INFO: renamed from: c */
    public final Object m87067c(long j) {
        Object obj;
        int iM41460h = fem.m41460h(this.f247313b, this.f247315d, j);
        if (iM41460h < 0 || (obj = this.f247314c[iM41460h]) == bjf1.f27688a) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        w2b0 w2b0Var = (w2b0) super.clone();
        w2b0Var.f247313b = (long[]) this.f247313b.clone();
        w2b0Var.f247314c = (Object[]) this.f247314c.clone();
        return w2b0Var;
    }

    /* JADX INFO: renamed from: d */
    public final int m87068d(long j) {
        if (this.f247312a) {
            int i = this.f247315d;
            long[] jArr = this.f247313b;
            Object[] objArr = this.f247314c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != bjf1.f27688a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f247312a = false;
            this.f247315d = i2;
        }
        return fem.m41460h(this.f247313b, this.f247315d, j);
    }

    /* JADX INFO: renamed from: e */
    public final long m87069e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f247315d)) {
            epv0.m39674J("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f247312a) {
            long[] jArr = this.f247313b;
            Object[] objArr = this.f247314c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != bjf1.f27688a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f247312a = false;
            this.f247315d = i3;
        }
        return this.f247313b[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m87070g(long j, Object obj) {
        int iM41460h = fem.m41460h(this.f247313b, this.f247315d, j);
        if (iM41460h >= 0) {
            this.f247314c[iM41460h] = obj;
            return;
        }
        int i = ~iM41460h;
        int i2 = this.f247315d;
        Object obj2 = bjf1.f27688a;
        if (i < i2) {
            Object[] objArr = this.f247314c;
            if (objArr[i] == obj2) {
                this.f247313b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f247312a) {
            long[] jArr = this.f247313b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f247314c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f247312a = false;
                this.f247315d = i3;
                i = ~fem.m41460h(this.f247313b, i3, j);
            }
        }
        int i5 = this.f247315d;
        if (i5 >= this.f247313b.length) {
            int iM41469r = fem.m41469r(i5 + 1);
            this.f247313b = Arrays.copyOf(this.f247313b, iM41469r);
            this.f247314c = Arrays.copyOf(this.f247314c, iM41469r);
        }
        int i6 = this.f247315d;
        if (i6 - i != 0) {
            long[] jArr2 = this.f247313b;
            int i7 = i + 1;
            bk5.m29633r0(jArr2, jArr2, i7, i, i6);
            Object[] objArr3 = this.f247314c;
            bk5.m29629p0(i7, i, this.f247315d, objArr3, objArr3);
        }
        this.f247313b[i] = j;
        this.f247314c[i] = obj;
        this.f247315d++;
    }

    /* JADX INFO: renamed from: h */
    public final void m87071h(long j) {
        int iM41460h = fem.m41460h(this.f247313b, this.f247315d, j);
        if (iM41460h >= 0) {
            Object[] objArr = this.f247314c;
            Object obj = objArr[iM41460h];
            Object obj2 = bjf1.f27688a;
            if (obj != obj2) {
                objArr[iM41460h] = obj2;
                this.f247312a = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m87072i() {
        if (this.f247312a) {
            int i = this.f247315d;
            long[] jArr = this.f247313b;
            Object[] objArr = this.f247314c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != bjf1.f27688a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f247312a = false;
            this.f247315d = i2;
        }
        return this.f247315d;
    }

    /* JADX INFO: renamed from: j */
    public final Object m87073j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f247315d)) {
            epv0.m39674J("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f247312a) {
            long[] jArr = this.f247313b;
            Object[] objArr = this.f247314c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != bjf1.f27688a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f247312a = false;
            this.f247315d = i3;
        }
        return this.f247314c[i];
    }

    public final String toString() {
        if (m87072i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f247315d * 28);
        sb.append('{');
        int i = this.f247315d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m87069e(i2));
            sb.append('=');
            Object objM87073j = m87073j(i2);
            if (objM87073j != sb) {
                sb.append(objM87073j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ w2b0(Object obj) {
        this(10);
    }
}
