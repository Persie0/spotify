package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o761 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f162473a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static void m66375b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    m66375b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m66376a(l28 l28Var) {
        this.f162473a.add(l28Var);
    }

    /* JADX INFO: renamed from: c */
    public final List m66377c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f162473a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        boolean z = false;
        m66375b(arrayList2, size2, new int[size2], 0);
        l28[] l28VarArr = new l28[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    l28 l28Var = (l28) arrayList.get(i);
                    l28 l28Var2 = (l28) list.get(iArr[i]);
                    l28Var.getClass();
                    z2 &= l28Var2.f128940b.f174612a <= l28Var.f128940b.f174612a && l28Var2.f128939a == l28Var.f128939a;
                    if (!z2) {
                        break;
                    }
                    l28VarArr[iArr[i]] = (l28) arrayList.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(l28VarArr);
        }
        return null;
    }
}
