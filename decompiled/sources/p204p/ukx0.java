package p204p;

import androidx.car.app.model.Alert;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ukx0 extends hva {

    /* JADX INFO: renamed from: h */
    public static final int[] f231380h;

    /* JADX INFO: renamed from: b */
    public final int f231381b;

    /* JADX INFO: renamed from: c */
    public final hva f231382c;

    /* JADX INFO: renamed from: d */
    public final hva f231383d;

    /* JADX INFO: renamed from: e */
    public final int f231384e;

    /* JADX INFO: renamed from: f */
    public final int f231385f;

    /* JADX INFO: renamed from: g */
    public int f231386g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
        f231380h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f231380h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public ukx0(hva hvaVar, hva hvaVar2) {
        this.f231382c = hvaVar;
        this.f231383d = hvaVar2;
        int size = hvaVar.size();
        this.f231384e = size;
        this.f231381b = hvaVar2.size() + size;
        this.f231385f = Math.max(hvaVar.mo48766f(), hvaVar2.mo48766f()) + 1;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: e */
    public final void mo48765e(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        hva hvaVar = this.f231382c;
        int i5 = this.f231384e;
        if (i4 <= i5) {
            hvaVar.mo48765e(i, bArr, i2, i3);
            return;
        }
        hva hvaVar2 = this.f231383d;
        if (i >= i5) {
            hvaVar2.mo48765e(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        hvaVar.mo48765e(i, bArr, i2, i6);
        hvaVar2.mo48765e(0, bArr, i2 + i6, i3 - i6);
    }

    public final boolean equals(Object obj) {
        int iMo48771o;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hva) {
            hva hvaVar = (hva) obj;
            int size = hvaVar.size();
            int i = this.f231381b;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f231386g == 0 || (iMo48771o = hvaVar.mo48771o()) == 0 || this.f231386g == iMo48771o) {
                    chc0 chc0Var = new chc0(this);
                    xj90 xj90VarM32762a = chc0Var.m32762a();
                    chc0 chc0Var2 = new chc0(hvaVar);
                    xj90 xj90VarM32762a2 = chc0Var2.m32762a();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = xj90VarM32762a.f262074b.length - i2;
                        int length2 = xj90VarM32762a2.f262074b.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? xj90VarM32762a.m91210s(xj90VarM32762a2, i3, iMin) : xj90VarM32762a2.m91210s(xj90VarM32762a, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            xj90VarM32762a = chc0Var.m32762a();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            xj90VarM32762a2 = chc0Var2.m32762a();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: f */
    public final int mo48766f() {
        return this.f231385f;
    }

    public final int hashCode() {
        int iMo48769m = this.f231386g;
        if (iMo48769m == 0) {
            int i = this.f231381b;
            iMo48769m = mo48769m(i, 0, i);
            if (iMo48769m == 0) {
                iMo48769m = 1;
            }
            this.f231386g = iMo48769m;
        }
        return iMo48769m;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: i */
    public final boolean mo48767i() {
        return this.f231381b >= f231380h[this.f231385f];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tkx0(this);
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: j */
    public final boolean mo48768j() {
        int iMo48770n = this.f231382c.mo48770n(0, 0, this.f231384e);
        hva hvaVar = this.f231383d;
        return hvaVar.mo48770n(iMo48770n, 0, hvaVar.size()) == 0;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: m */
    public final int mo48769m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        hva hvaVar = this.f231382c;
        int i5 = this.f231384e;
        if (i4 <= i5) {
            return hvaVar.mo48769m(i, i2, i3);
        }
        hva hvaVar2 = this.f231383d;
        if (i2 >= i5) {
            return hvaVar2.mo48769m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return hvaVar2.mo48769m(hvaVar.mo48769m(i, i2, i6), 0, i3 - i6);
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: n */
    public final int mo48770n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        hva hvaVar = this.f231382c;
        int i5 = this.f231384e;
        if (i4 <= i5) {
            return hvaVar.mo48770n(i, i2, i3);
        }
        hva hvaVar2 = this.f231383d;
        if (i2 >= i5) {
            return hvaVar2.mo48770n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return hvaVar2.mo48770n(hvaVar.mo48770n(i, i2, i6), 0, i3 - i6);
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: o */
    public final int mo48771o() {
        return this.f231386g;
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: p */
    public final String mo48772p() {
        byte[] bArr;
        int i = this.f231381b;
        if (i == 0) {
            bArr = fe50.f68685a;
        } else {
            byte[] bArr2 = new byte[i];
            mo48765e(0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // p204p.hva
    /* JADX INFO: renamed from: r */
    public final void mo48774r(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        hva hvaVar = this.f231382c;
        int i4 = this.f231384e;
        if (i3 <= i4) {
            hvaVar.mo48774r(outputStream, i, i2);
            return;
        }
        hva hvaVar2 = this.f231383d;
        if (i >= i4) {
            hvaVar2.mo48774r(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        hvaVar.mo48774r(outputStream, i, i5);
        hvaVar2.mo48774r(outputStream, 0, i2 - i5);
    }

    @Override // p204p.hva
    public final int size() {
        return this.f231381b;
    }
}
