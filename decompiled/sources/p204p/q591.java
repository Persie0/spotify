package p204p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class q591 implements k591 {

    /* JADX INFO: renamed from: c */
    public static final q591 f185483c;

    /* JADX INFO: renamed from: a */
    public int f185484a;

    /* JADX INFO: renamed from: b */
    public List f185485b;

    static {
        List list = Collections.EMPTY_LIST;
        q591 q591Var = new q591();
        q591Var.f185484a = 2;
        q591Var.f185485b = list;
        f185483c = q591Var;
    }

    @Override // p204p.k591
    /* JADX INFO: renamed from: a */
    public final float mo31432a(float f) {
        int i = this.f185484a;
        List list = this.f185485b;
        if (i != 1) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((k591) it.next()).mo31432a(f);
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                f = ((k591) it2.next()).mo31432a(f);
            }
        }
        return f;
    }
}
