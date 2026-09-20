package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q06 implements Function {

    /* JADX INFO: renamed from: a */
    public final List f183915a;

    public /* synthetic */ q06(List list) {
        this.f183915a = list;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List listMo45450b = ((gqx) obj).mo45450b(w46.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo45450b.iterator();
        while (it.hasNext()) {
            w46 w46Var = (w46) ((fqx) it.next()).f72301b;
            if (w46Var != null) {
                arrayList.add(w46Var);
            }
        }
        return g6f.m43711Y0(arrayList, new u13(1, this.f183915a));
    }

    public q06(ArrayList arrayList) {
        this.f183915a = Collections.unmodifiableList(arrayList);
    }
}
