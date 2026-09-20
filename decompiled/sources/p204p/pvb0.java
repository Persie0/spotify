package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pvb0 {

    /* JADX INFO: renamed from: a */
    public static final rb20 f181680a;

    static {
        Object next;
        fmg1.m42126S("kotlinx.coroutines.fast.service.loader", true);
        try {
            Iterator it = btz0.m30496T(btz0.m30477A(y8a0.m93102g())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((o24) next).getClass();
                    do {
                        ((o24) it.next()).getClass();
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            o24 o24Var = (o24) next;
            if (o24Var != null) {
                f181680a = bkg1.m29681A(o24Var);
            } else {
                bkg1.m29698p(3, null);
                throw null;
            }
        } catch (Throwable th) {
            bkg1.m29698p(2, th);
            throw null;
        }
    }
}
