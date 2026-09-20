package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import p204p.a99;
import p204p.ava;
import p204p.rwe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0065k {

    /* JADX INFO: renamed from: f */
    public static final C0065k f936f = new C0065k(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f937a;

    /* JADX INFO: renamed from: b */
    public int[] f938b;

    /* JADX INFO: renamed from: c */
    public Object[] f939c;

    /* JADX INFO: renamed from: d */
    public int f940d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f941e;

    public C0065k(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f937a = i;
        this.f938b = iArr;
        this.f939c = objArr;
        this.f941e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m746a(int i) {
        int[] iArr = this.f938b;
        if (i > iArr.length) {
            int i2 = this.f937a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f938b = Arrays.copyOf(iArr, i);
            this.f939c = Arrays.copyOf(this.f939c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m747b() {
        int iM76514Y;
        int iM76516a0;
        int iM76514Y2;
        int i = this.f940d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f937a; i3++) {
            int i4 = this.f938b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f939c[i3]).getClass();
                    iM76514Y2 = rwe.m76514Y(i5) + 8;
                } else if (i6 == 2) {
                    iM76514Y2 = rwe.m76512W(i5, (ava) this.f939c[i3]);
                } else if (i6 == 3) {
                    iM76514Y = rwe.m76514Y(i5) * 2;
                    iM76516a0 = ((C0065k) this.f939c[i3]).m747b();
                } else {
                    if (i6 != 5) {
                        int i7 = InvalidProtocolBufferException.f893b;
                        throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                    }
                    ((Integer) this.f939c[i3]).getClass();
                    iM76514Y2 = rwe.m76514Y(i5) + 4;
                }
                i2 = iM76514Y2 + i2;
            } else {
                long jLongValue = ((Long) this.f939c[i3]).longValue();
                iM76514Y = rwe.m76514Y(i5);
                iM76516a0 = rwe.m76516a0(jLongValue);
            }
            i2 = iM76516a0 + iM76514Y + i2;
        }
        this.f940d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m748c(int i, Object obj) {
        if (!this.f941e) {
            throw new UnsupportedOperationException();
        }
        m746a(this.f937a + 1);
        int[] iArr = this.f938b;
        int i2 = this.f937a;
        iArr[i2] = i;
        this.f939c[i2] = obj;
        this.f937a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m749d(a99 a99Var) {
        if (this.f937a == 0) {
            return;
        }
        a99Var.getClass();
        rwe rweVar = (rwe) a99Var.f13521b;
        for (int i = 0; i < this.f937a; i++) {
            int i2 = this.f938b[i];
            Object obj = this.f939c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                rweVar.m76538r0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                rweVar.m76529i0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                rweVar.m76526f0(i3, (ava) obj);
            } else if (i4 == 3) {
                rweVar.m76535o0(i3, 3);
                ((C0065k) obj).m749d(a99Var);
                rweVar.m76535o0(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = InvalidProtocolBufferException.f893b;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
                rweVar.m76527g0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0065k)) {
            return false;
        }
        C0065k c0065k = (C0065k) obj;
        int i = this.f937a;
        if (i == c0065k.f937a) {
            int[] iArr = this.f938b;
            int[] iArr2 = c0065k.f938b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f939c;
            Object[] objArr2 = c0065k.f939c;
            int i3 = this.f937a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f937a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f938b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f939c;
        int i6 = this.f937a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
