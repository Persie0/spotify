package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pf9 {

    /* JADX INFO: renamed from: a */
    public final int[] f176997a;

    /* JADX INFO: renamed from: b */
    public final int f176998b;

    /* JADX INFO: renamed from: c */
    public final int f176999c;

    /* JADX INFO: renamed from: d */
    public final int f177000d;

    /* JADX INFO: renamed from: e */
    public final List f177001e;

    public pf9(int... iArr) {
        List listM43728j1;
        this.f176997a = iArr;
        Integer numM29586I0 = bk5.m29586I0(iArr, 0);
        this.f176998b = numM29586I0 != null ? numM29586I0.intValue() : -1;
        Integer numM29586I1 = bk5.m29586I0(iArr, 1);
        this.f176999c = numM29586I1 != null ? numM29586I1.intValue() : -1;
        Integer numM29586I2 = bk5.m29586I0(iArr, 2);
        this.f177000d = numM29586I2 != null ? numM29586I2.intValue() : -1;
        if (iArr.length <= 3) {
            listM43728j1 = lau.f131415a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(edb.m38567p(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listM43728j1 = g6f.m43728j1(new C2117m7(new ck5(iArr), 3, iArr.length));
        }
        this.f177001e = listM43728j1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69801a(int i, int i2, int i3) {
        int i4 = this.f176998b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f176999c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f177000d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        pf9 pf9Var = (pf9) obj;
        return this.f176998b == pf9Var.f176998b && this.f176999c == pf9Var.f176999c && this.f177000d == pf9Var.f177000d && wj50.m88271j(this.f177001e, pf9Var.f177001e);
    }

    public final int hashCode() {
        int i = this.f176998b;
        int i2 = (i * 31) + this.f176999c + i;
        int i3 = (i2 * 31) + this.f177000d + i2;
        return this.f177001e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f176997a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : g6f.m43753y0(arrayList, ".", null, null, null, 62);
    }
}
