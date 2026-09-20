package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i3q implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashMap f98232b;

    public /* synthetic */ i3q(int i, LinkedHashMap linkedHashMap) {
        this.f98231a = i;
        this.f98232b = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d A[PHI: r5
      0x008d: PHI (r5v12 java.lang.Integer) = (r5v5 java.lang.Integer), (r5v10 java.lang.Integer) binds: [B:27:0x008b, B:36:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f98231a) {
            case 0:
                Integer numValueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
                er50 er50Var = (er50) obj;
                String str = er50Var.f62022a.f275315a;
                LinkedHashMap linkedHashMap = this.f98232b;
                Integer num = (Integer) linkedHashMap.get(str);
                if (num == null) {
                    List list = er50Var.f62022a.f275321g;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Integer num2 = (Integer) linkedHashMap.get((String) it.next());
                        if (num2 != null) {
                            arrayList.add(num2);
                        }
                    }
                    num = (Integer) g6f.m43693G0(arrayList);
                    if (num == null) {
                        num = numValueOf;
                    }
                }
                er50 er50Var2 = (er50) obj2;
                Integer num3 = (Integer) linkedHashMap.get(er50Var2.f62022a.f275315a);
                if (num3 != null) {
                    numValueOf = num3;
                } else {
                    List list2 = er50Var2.f62022a.f275321g;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Integer num4 = (Integer) linkedHashMap.get((String) it2.next());
                        if (num4 != null) {
                            arrayList2.add(num4);
                        }
                    }
                    num3 = (Integer) g6f.m43693G0(arrayList2);
                    if (num3 != null) {
                        numValueOf = num3;
                    }
                }
                return jlg1.m53703m(num, numValueOf);
            default:
                String str2 = ((k251) obj2).f118494a;
                LinkedHashMap linkedHashMap2 = this.f98232b;
                Integer num5 = (Integer) linkedHashMap2.get(str2);
                Integer numValueOf2 = Integer.valueOf(num5 != null ? num5.intValue() : 0);
                Integer num6 = (Integer) linkedHashMap2.get(((k251) obj).f118494a);
                return jlg1.m53703m(numValueOf2, Integer.valueOf(num6 != null ? num6.intValue() : 0));
        }
    }
}
