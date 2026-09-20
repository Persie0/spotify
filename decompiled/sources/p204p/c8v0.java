package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c8v0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d8v0 f35322b;

    public /* synthetic */ c8v0(d8v0 d8v0Var, int i) {
        this.f35321a = i;
        this.f35322b = d8v0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f35321a) {
            case 0:
                this.f35322b.m35105h(((r5v0) obj).f196136b);
                break;
            default:
                h8v0 h8v0Var = ((t5v0) obj).f217375b;
                d8v0 d8v0Var = this.f35322b;
                Integer num = d8v0Var.f46539t;
                if (num != null && num.intValue() > 0) {
                    List list = h8v0Var.f88807a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof d7v0) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        p4v0 p4v0Var = ((d7v0) it.next()).f46280a.f217090m;
                        String str = p4v0Var != null ? p4v0Var.f174014a : null;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    List listM43714b1 = g6f.m43714b1(arrayList2, num.intValue());
                    if (!listM43714b1.isEmpty()) {
                        d8v0Var.f46539t = null;
                        ((g8v0) d8v0Var.f46533d).m43966a(new v5v0(listM43714b1));
                    }
                }
                zv41 zv41Var = d8v0Var.f46531Y;
                zv41Var.getClass();
                zv41Var.m97091m(null, h8v0Var);
                d8v0Var.m35106i();
                break;
        }
    }
}
