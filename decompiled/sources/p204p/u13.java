package p204p;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class u13 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f225672b;

    public /* synthetic */ u13(int i, List list) {
        this.f225671a = i;
        this.f225672b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f225671a) {
            case 0:
                String str = ((w46) obj).f247713a;
                List list = this.f225672b;
                return jlg1.m53703m(Integer.valueOf(list.indexOf(str)), Integer.valueOf(list.indexOf(((w46) obj2).f247713a)));
            case 1:
                String str2 = ((w46) obj).f247713a;
                List list2 = this.f225672b;
                return jlg1.m53703m(Integer.valueOf(list2.indexOf(str2)), Integer.valueOf(list2.indexOf(((w46) obj2).f247713a)));
            default:
                fq01 fq01VarMo30099a = ((yo01) obj).mo30099a();
                List list3 = this.f225672b;
                return wj50.m88282u(list3.indexOf(fq01VarMo30099a), list3.indexOf(((yo01) obj2).mo30099a()));
        }
    }
}
