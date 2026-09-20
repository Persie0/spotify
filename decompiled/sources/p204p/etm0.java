package p204p;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class etm0 extends lqg1 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f62745g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ lqg1 f62746h;

    public /* synthetic */ etm0(lqg1 lqg1Var, int i) {
        this.f62745g = i;
        this.f62746h = lqg1Var;
    }

    @Override // p204p.lqg1
    /* JADX INFO: renamed from: r */
    public final void mo39937r(fuw0 fuw0Var, Object obj) {
        switch (this.f62745g) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f62746h.mo39937r(fuw0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.f62746h.mo39937r(fuw0Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
