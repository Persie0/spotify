package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class v6s0 {

    /* JADX INFO: renamed from: e */
    public static final long f237944e;

    /* JADX INFO: renamed from: a */
    public final el2 f237945a;

    /* JADX INFO: renamed from: b */
    public final lqi0 f237946b;

    /* JADX INFO: renamed from: c */
    public final long f237947c = f237944e;

    /* JADX INFO: renamed from: d */
    public final nj2 f237948d;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f237944e = jwg1.m54449D(3, ils.SECONDS);
    }

    public v6s0(el2 el2Var, zv41 zv41Var, nj2 nj2Var) {
        this.f237945a = el2Var;
        this.f237946b = zv41Var;
        this.f237948d = nj2Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m84817a(bn2 bn2Var, String str, String str2, ibk ibkVar) {
        u6s0 u6s0Var;
        List list;
        int i;
        Iterator it;
        int i2;
        Object next;
        int i3;
        String str3;
        zv41 zv41Var;
        if (ibkVar instanceof u6s0) {
            u6s0Var = (u6s0) ibkVar;
            int i4 = u6s0Var.f227426g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                u6s0Var.f227426g = i4 - Integer.MIN_VALUE;
            } else {
                u6s0Var = new u6s0(this, ibkVar);
            }
        } else {
            u6s0Var = new u6s0(this, ibkVar);
        }
        Object objM70246g = u6s0Var.f227424e;
        int i5 = u6s0Var.f227426g;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i5 == 0) {
                bga.m29073P(objM70246g);
                el2 el2Var = this.f237945a;
                u6s0Var.f227426g = 1;
                objM70246g = ((pl2) el2Var).m70246g(bn2Var, str, str2, u6s0Var);
                if (objM70246g == yukVar) {
                }
                return yukVar;
            }
            if (i5 == 1) {
                bga.m29073P(objM70246g);
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw edb.m38575x(objM70246g);
                }
                i2 = u6s0Var.f227423d;
                i = u6s0Var.f227422c;
                it = u6s0Var.f227421b;
                list = u6s0Var.f227420a;
                bga.m29073P(objM70246g);
            }
            while (it.hasNext()) {
                next = it.next();
                i3 = i2 + 1;
                if (i2 >= 0) {
                    h6f.m46722S();
                    throw null;
                }
                str3 = (String) next;
                this.f237948d.invoke(str3);
                zv41Var = (zv41) this.f237946b;
                if (((uyc) zv41Var.getValue()) instanceof tyc) {
                    zv41Var.m97091m(null, new tyc(str3));
                }
                if (i2 < h6f.m46714K(list)) {
                    u6s0Var.getClass();
                    u6s0Var.f227420a = list;
                    u6s0Var.f227421b = it;
                    u6s0Var.f227422c = i;
                    u6s0Var.f227423d = i3;
                    u6s0Var.f227426g = 2;
                    if (njg1.m64620m(this.f237947c, u6s0Var) == yukVar) {
                        return yukVar;
                    }
                }
                i2 = i3;
            }
            u6s0Var.getClass();
            u6s0Var.f227420a = null;
            u6s0Var.f227421b = null;
            u6s0Var.f227426g = 3;
            njg1.m64618k(u6s0Var);
            return yukVar;
            ArrayList arrayList = ((gm2) objM70246g).f81257b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((mm2) it2.next()).f145030a;
                if (wl51.m88460J0(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    arrayList2.add(str4);
                }
            }
            if (arrayList2.isEmpty()) {
                return w2a1Var;
            }
            Iterator it3 = arrayList2.iterator();
            list = arrayList2;
            i = 0;
            it = it3;
            i2 = 0;
            while (it.hasNext()) {
                next = it.next();
                i3 = i2 + 1;
                if (i2 >= 0) {
                    h6f.m46722S();
                    throw null;
                }
                str3 = (String) next;
                this.f237948d.invoke(str3);
                zv41Var = (zv41) this.f237946b;
                if (((uyc) zv41Var.getValue()) instanceof tyc) {
                    zv41Var.m97091m(null, new tyc(str3));
                }
                if (i2 < h6f.m46714K(list)) {
                    u6s0Var.getClass();
                    u6s0Var.f227420a = list;
                    u6s0Var.f227421b = it;
                    u6s0Var.f227422c = i;
                    u6s0Var.f227423d = i3;
                    u6s0Var.f227426g = 2;
                    if (njg1.m64620m(this.f237947c, u6s0Var) == yukVar) {
                        return yukVar;
                    }
                }
                i2 = i3;
            }
            u6s0Var.getClass();
            u6s0Var.f227420a = null;
            u6s0Var.f227421b = null;
            u6s0Var.f227426g = 3;
            njg1.m64618k(u6s0Var);
            return yukVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            na6.m63972t("Failed to fetch agent-gateway progress stages", th);
            return w2a1Var;
        }
    }
}
