package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gn91 extends mq6 {

    /* JADX INFO: renamed from: b */
    public static final sr31 f82663b = new sr31();

    /* JADX INFO: renamed from: c */
    public static final gn91 f82664c = new gn91(lau.f131415a);

    public gn91(List list) {
        this.f146194a = u9u.f228268a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o25 o25Var = (o25) it.next();
            o25Var.getClass();
            String strMo29110D = qpv0.f191387a.mo54112b(o25.class).mo29110D();
            wj50.m88279p(strMo29110D);
            int iM78993i = f82663b.m78993i(strMo29110D);
            int iMo80970a = this.f146194a.mo80970a();
            if (iMo80970a != 0) {
                if (iMo80970a == 1) {
                    tj5 tj5Var = this.f146194a;
                    try {
                        wml0 wml0Var = (wml0) tj5Var;
                        int i = wml0Var.f252928b;
                        if (i == iM78993i) {
                            this.f146194a = new wml0(iM78993i, o25Var);
                        } else {
                            wj5 wj5Var = new wj5();
                            wj5Var.f251847a = new Object[20];
                            wj5Var.f251848b = 0;
                            wj5Var.mo80971b(i, wml0Var.f252927a);
                            this.f146194a = wj5Var;
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException(mq6.m62514a(tj5Var, 1, "OneElementArrayMap"), e);
                    }
                }
                this.f146194a.mo80971b(iM78993i, o25Var);
            } else {
                tj5 tj5Var2 = this.f146194a;
                if (!(tj5Var2 instanceof u9u)) {
                    throw new IllegalStateException(mq6.m62514a(tj5Var2, 0, "EmptyArrayMap"));
                }
                this.f146194a = new wml0(iM78993i, o25Var);
            }
        }
    }
}
