package p204p;

import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzgb;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class dcg1 {

    /* JADX INFO: renamed from: f */
    public static final dcg1 f47554f = new dcg1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f47555a;

    /* JADX INFO: renamed from: b */
    public int[] f47556b;

    /* JADX INFO: renamed from: c */
    public Object[] f47557c;

    /* JADX INFO: renamed from: d */
    public int f47558d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f47559e;

    public dcg1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f47555a = i;
        this.f47556b = iArr;
        this.f47557c = objArr;
        this.f47559e = z;
    }

    /* JADX INFO: renamed from: b */
    public static dcg1 m35653b() {
        return new dcg1(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final int m35654a() {
        int iM84377P;
        int iM84378Q;
        int iM84377P2;
        int i = this.f47558d;
        if (i != -1) {
            return i;
        }
        int iM51025m = 0;
        for (int i2 = 0; i2 < this.f47555a; i2++) {
            int i3 = this.f47556b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        rzf1 rzf1Var = (rzf1) this.f47557c[i2];
                        int iM84377P3 = v0g1.m84377P(i6);
                        int iMo40353e = rzf1Var.mo40353e();
                        iM51025m = ilf1.m51025m(iMo40353e, iMo40353e, iM84377P3, iM51025m);
                    } else if (i5 == 3) {
                        int iM84377P4 = v0g1.m84377P(i4 << 3);
                        iM84377P = iM84377P4 + iM84377P4;
                        iM84378Q = ((dcg1) this.f47557c[i2]).m35654a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new zzgb());
                        }
                        ((Integer) this.f47557c[i2]).getClass();
                        iM84377P2 = v0g1.m84377P(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f47557c[i2]).getClass();
                    iM84377P2 = v0g1.m84377P(i4 << 3) + 8;
                }
                iM51025m = iM84377P2 + iM51025m;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f47557c[i2]).longValue();
                iM84377P = v0g1.m84377P(i7);
                iM84378Q = v0g1.m84378Q(jLongValue);
            }
            iM51025m = iM84378Q + iM84377P + iM51025m;
        }
        this.f47558d = iM51025m;
        return iM51025m;
    }

    /* JADX INFO: renamed from: c */
    public final void m35655c(int i, Object obj) {
        if (!this.f47559e) {
            throw new UnsupportedOperationException();
        }
        m35657e(this.f47555a + 1);
        int[] iArr = this.f47556b;
        int i2 = this.f47555a;
        iArr[i2] = i;
        this.f47557c[i2] = obj;
        this.f47555a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m35656d(use1 use1Var) throws zzfa {
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        if (this.f47555a != 0) {
            for (int i = 0; i < this.f47555a; i++) {
                int i2 = this.f47556b[i];
                Object obj = this.f47557c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    v0g1Var.m84390N(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    v0g1Var.m84383G(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    rzf1 rzf1Var = (rzf1) obj;
                    v0g1Var.m84389M((i4 << 3) | 2);
                    v0g1Var.m84389M(rzf1Var.mo40353e());
                    rzf1Var.mo40355i(v0g1Var);
                } else if (i3 == 3) {
                    v0g1Var.m84387K(i4, 3);
                    ((dcg1) obj).m35656d(use1Var);
                    v0g1Var.m84387K(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzgb());
                    }
                    v0g1Var.m84381E(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m35657e(int i) {
        int[] iArr = this.f47556b;
        if (i > iArr.length) {
            int i2 = this.f47555a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f47556b = Arrays.copyOf(iArr, i);
            this.f47557c = Arrays.copyOf(this.f47557c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dcg1)) {
            return false;
        }
        dcg1 dcg1Var = (dcg1) obj;
        int i = this.f47555a;
        if (i == dcg1Var.f47555a) {
            int[] iArr = this.f47556b;
            int[] iArr2 = dcg1Var.f47556b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f47557c;
            Object[] objArr2 = dcg1Var.f47557c;
            int i3 = this.f47555a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f47555a;
        int i2 = i + 527;
        int[] iArr = this.f47556b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f47557c;
        int i6 = this.f47555a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
