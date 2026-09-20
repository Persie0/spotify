package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e1v0 {

    /* JADX INFO: renamed from: a */
    public final hv31 f55263a;

    public /* synthetic */ e1v0(hv31 hv31Var) {
        this.f55263a = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public List m37567a() {
        try {
            String strMo48711f = this.f55263a.mo48711f(f1v0.f64981a);
            if (strMo48711f != null) {
                Iterable<spn0> iterable = (Iterable) fk60.f70476d.m41880a(strMo48711f, new mj5(spn0.Companion.serializer(), 0));
                ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
                for (spn0 spn0Var : iterable) {
                    arrayList.add(new qfa0(spn0Var.f212904c, spn0Var.f212902a, spn0Var.f212903b));
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: b */
    public void m37568b(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qfa0 qfa0Var = (qfa0) it.next();
            arrayList.add(new spn0(qfa0Var.f188159c, qfa0Var.f188157a, qfa0Var.f188158b));
        }
        String strM41881b = fk60.f70476d.m41881b(new mj5(spn0.Companion.serializer(), 0), arrayList);
        lv31 lv31VarEdit = this.f55263a.edit();
        lv31VarEdit.m60051d(f1v0.f64981a, strM41881b);
        lv31VarEdit.m60054g();
    }
}
