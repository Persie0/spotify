package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ar00 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f18886a;

    /* JADX INFO: renamed from: b */
    public final int f18887b;

    /* JADX INFO: renamed from: c */
    public int f18888c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f18889d;

    /* JADX INFO: renamed from: e */
    public final toi0 f18890e;

    /* JADX INFO: renamed from: f */
    public final wg61 f18891f;

    public ar00(int i, ArrayList arrayList) {
        this.f18886a = arrayList;
        this.f18887b = i;
        if (i < 0) {
            lfq0.m58913a("Invalid start index");
        }
        this.f18889d = new ArrayList();
        toi0 toi0Var = new toi0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            hu60 hu60Var = (hu60) this.f18886a.get(i3);
            int i4 = hu60Var.f95330c;
            int i5 = hu60Var.f95331d;
            toi0Var.m81201i(i4, new m520(i3, i2, i5));
            i2 += i5;
        }
        this.f18890e = toi0Var;
        this.f18891f = new wg61(new wul(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26909a(int i, int i2) {
        int i3;
        toi0 toi0Var = this.f18890e;
        m520 m520Var = (m520) toi0Var.m87103b(i);
        if (m520Var == null) {
            return false;
        }
        int i4 = m520Var.f140081b;
        int i5 = i2 - m520Var.f140082c;
        m520Var.f140082c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = toi0Var.f247488c;
        long[] jArr = toi0Var.f247486a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        m520 m520Var2 = (m520) objArr[(i6 << 3) + i8];
                        if (m520Var2.f140081b >= i4 && !m520Var2.equals(m520Var) && (i3 = m520Var2.f140081b + i5) >= 0) {
                            m520Var2.f140081b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
