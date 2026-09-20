package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class y9f {

    /* JADX INFO: renamed from: a */
    public final Object f270584a;

    public y9f() {
        FormatType formatType = FormatType.FULLSCREEN;
        FormatType formatType2 = FormatType.MODAL;
        FormatType formatType3 = FormatType.WEB_VIEW;
        FormatType formatType4 = FormatType.BOTTOMSHEET;
        FormatType formatType5 = FormatType.TOOLTIP;
        FormatType formatType6 = FormatType.SNACKBAR;
        pqm0 pqm0Var = new pqm0(formatType, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
        pqm0 pqm0Var2 = new pqm0(formatType2, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
        pqm0 pqm0Var3 = new pqm0(formatType3, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
        pqm0 pqm0Var4 = new pqm0(formatType4, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
        pqm0 pqm0Var5 = new pqm0(formatType5, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6}));
        FormatType formatType7 = FormatType.BANNER;
        this.f270584a = kkc0.m56695h0(pqm0Var, pqm0Var2, pqm0Var3, pqm0Var4, pqm0Var5, new pqm0(formatType7, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType7})), new pqm0(formatType6, bk5.m29624m1(new FormatType[]{formatType, formatType2, formatType3, formatType4, formatType5, formatType6})));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v7, types: [p.lau] */
    public y9f(int i, int i2) {
        int i3;
        Object arrayList;
        int i4 = -(i / 2);
        i4 = i % 2 == 0 ? i4 + 1 : i4;
        if (i <= 0) {
            throw new IllegalArgumentException("rowCount must be > 0");
        }
        if (i2 >= 0) {
            if (i2 == 0) {
                arrayList = lau.f131415a;
            } else {
                int i5 = 2;
                if (i == 2) {
                    arrayList = new ArrayList();
                    arrayList.add(new xq20(0, i4));
                    if (i2 > 1) {
                        arrayList.add(new xq20(1, i4));
                    }
                    if (i2 > 2) {
                        arrayList.add(new xq20(0, i4 + 1));
                    }
                    if (i2 > 3) {
                        arrayList.add(new xq20(1, i4 + 1));
                    }
                    int i6 = 4;
                    while (i6 < i2) {
                        arrayList.add(new xq20(i5, i4));
                        int i7 = i6 + 1;
                        if (i7 < i2) {
                            arrayList.add(new xq20(i5, i4 + 1));
                            i6 += 2;
                        } else {
                            i6 = i7;
                        }
                        i5++;
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new xq20(0, i4));
                    if (1 < i2) {
                        arrayList2.add(new xq20(1, i4));
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    for (int i8 = 1; i8 < i && i3 < i2; i8++) {
                        arrayList2.add(new xq20(0, i4 + i8));
                        i3++;
                    }
                    int i9 = i - 1;
                    for (int i10 = i9; i10 > 0 && i3 < i2; i10--) {
                        arrayList2.add(new xq20(1, i4 + i10));
                        i3++;
                    }
                    while (i3 < i2) {
                        arrayList2.add(new xq20(i5, i4));
                        i3++;
                        for (int i11 = i9; i11 > 0 && i3 < i2; i11--) {
                            arrayList2.add(new xq20(i5, i4 + i11));
                            i3++;
                        }
                        i5++;
                    }
                    arrayList = arrayList2;
                }
            }
            this.f270584a = arrayList;
            return;
        }
        throw new IllegalArgumentException("itemCount must be >= 0");
    }
}
