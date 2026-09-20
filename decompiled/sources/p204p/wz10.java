package p204p;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wz10 {

    /* JADX INFO: renamed from: a */
    public final SparseIntArray f256435a = new SparseIntArray();

    /* JADX INFO: renamed from: b */
    public final SparseIntArray f256436b = new SparseIntArray();

    /* JADX INFO: renamed from: c */
    public boolean f256437c = false;

    /* JADX INFO: renamed from: d */
    public boolean f256438d = false;

    /* JADX INFO: renamed from: a */
    public static int m89390a(SparseIntArray sparseIntArray, int i) {
        int size = sparseIntArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (sparseIntArray.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        int i4 = i2 - 1;
        if (i4 < 0 || i4 >= sparseIntArray.size()) {
            return -1;
        }
        return sparseIntArray.keyAt(i4);
    }

    /* JADX INFO: renamed from: b */
    public final int m89391b(int i, int i2) {
        if (!this.f256438d) {
            return m89393d(i, i2);
        }
        SparseIntArray sparseIntArray = this.f256436b;
        int i3 = sparseIntArray.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM89393d = m89393d(i, i2);
        sparseIntArray.put(i, iM89393d);
        return iM89393d;
    }

    /* JADX INFO: renamed from: c */
    public final int m89392c(int i, int i2) {
        if (!this.f256437c) {
            return mo84278e(i, i2);
        }
        SparseIntArray sparseIntArray = this.f256435a;
        int i3 = sparseIntArray.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iMo84278e = mo84278e(i, i2);
        sparseIntArray.put(i, iMo84278e);
        return iMo84278e;
    }

    /* JADX INFO: renamed from: d */
    public final int m89393d(int i, int i2) {
        int i3;
        int iMo34488f;
        int i4;
        SparseIntArray sparseIntArray;
        int iM89390a;
        if (!this.f256438d || (iM89390a = m89390a((sparseIntArray = this.f256436b), i)) == -1) {
            i3 = 0;
            iMo34488f = 0;
            i4 = 0;
        } else {
            i3 = sparseIntArray.get(iM89390a);
            i4 = iM89390a + 1;
            iMo34488f = mo34488f(iM89390a) + m89392c(iM89390a, i2);
            if (iMo34488f == i2) {
                i3++;
                iMo34488f = 0;
            }
        }
        int iMo34488f2 = mo34488f(i);
        while (i4 < i) {
            int iMo34488f3 = mo34488f(i4);
            iMo34488f += iMo34488f3;
            if (iMo34488f == i2) {
                i3++;
                iMo34488f = 0;
            } else if (iMo34488f > i2) {
                i3++;
                iMo34488f = iMo34488f3;
            }
            i4++;
        }
        return iMo34488f + iMo34488f2 > i2 ? i3 + 1 : i3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:17:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002b -> B:17:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:17:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public int mo84278e(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.mo34488f(r6)
            r1 = 0
            if (r0 != r7) goto L8
            goto L35
        L8:
            boolean r2 = r5.f256437c
            if (r2 == 0) goto L1e
            android.util.SparseIntArray r2 = r5.f256435a
            int r3 = m89390a(r2, r6)
            if (r3 < 0) goto L1e
            int r2 = r2.get(r3)
            int r4 = r5.mo34488f(r3)
            int r4 = r4 + r2
            goto L2e
        L1e:
            r3 = r1
            r4 = r3
        L20:
            if (r3 >= r6) goto L31
            int r2 = r5.mo34488f(r3)
            int r4 = r4 + r2
            if (r4 != r7) goto L2b
            r4 = r1
            goto L2e
        L2b:
            if (r4 <= r7) goto L2e
            r4 = r2
        L2e:
            int r3 = r3 + 1
            goto L20
        L31:
            int r0 = r0 + r4
            if (r0 > r7) goto L35
            return r4
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.wz10.mo84278e(int, int):int");
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo34488f(int i);

    /* JADX INFO: renamed from: g */
    public final void m89394g() {
        this.f256436b.clear();
    }

    /* JADX INFO: renamed from: h */
    public final void m89395h() {
        this.f256435a.clear();
    }
}
