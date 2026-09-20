package p204p;

import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class siy {

    /* JADX INFO: renamed from: a */
    public final ArrayList f209684a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m78245a(int i, Map map) {
        int iM38547C = edb.m38547C(i);
        int i2 = 3;
        int i3 = 2;
        int i4 = 5;
        int i5 = 4;
        ArrayList arrayList = this.f209684a;
        switch (iM38547C) {
            case 0:
                return;
            case 1:
                j6f.m52567Y(arrayList, new le0(i2, 25));
                arrayList.add(new ssa1(2, map));
                return;
            case 2:
                j6f.m52567Y(arrayList, new le0(i3, 25));
                arrayList.add(new ssa1(3, map));
                return;
            case 3:
                j6f.m52567Y(arrayList, new le0(i4, 25));
                arrayList.add(new ssa1(4, map));
                return;
            case 4:
                j6f.m52567Y(arrayList, new le0(i5, 25));
                arrayList.add(new ssa1(5, map));
                return;
            case 5:
                arrayList.add(new ssa1(6, map));
                return;
            case 6:
                arrayList.add(new ssa1(7, map));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
