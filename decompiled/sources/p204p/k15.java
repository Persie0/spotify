package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k15 {

    /* JADX INFO: renamed from: a */
    public static final j15 f118204a = new j15("");

    /* JADX INFO: renamed from: a */
    public static final List m55048a(j15 j15Var, int i, int i2, C2126mg c2126mg) {
        List list;
        if (i == i2 || (list = j15Var.f107640a) == null) {
            return null;
        }
        if (i != 0 || i2 < j15Var.f107641b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i15 i15Var = (i15) list.get(i3);
                if ((c2126mg != null ? ((Boolean) c2126mg.invoke(i15Var.f97388a)).booleanValue() : true) && m55049b(i, i2, i15Var.f97389b, i15Var.f97390c)) {
                    arrayList.add(new i15(n0e1.m63437n(i15Var.f97389b, i, i2) - i, n0e1.m63437n(i15Var.f97390c, i, i2) - i, (e15) i15Var.f97388a, i15Var.f97391d));
                }
            }
            return arrayList;
        }
        if (c2126mg == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) c2126mg.invoke(((i15) obj).f97388a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m55049b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
