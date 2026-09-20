package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a23 implements Function {

    /* JADX INFO: renamed from: a */
    public final Set f11563a;

    public /* synthetic */ a23(Set set) {
        this.f11563a = set;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        cq50 cq50Var = (cq50) obj;
        String str = cq50Var.f40737b;
        List list = cq50Var.f40741f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!this.f11563a.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        return new b03(str, arrayList);
    }
}
