package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class bq71 {

    /* JADX INFO: renamed from: a */
    public final ul0 f29723a;

    /* JADX INFO: renamed from: b */
    public final Flowable f29724b;

    public bq71(ul0 ul0Var, Flowable flowable) {
        this.f29723a = ul0Var;
        this.f29724b = flowable;
    }

    /* JADX INFO: renamed from: a */
    public static void m30199a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("timestamps must not be empty");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(((pu71) it.next()) instanceof mu71)) {
                throw new IllegalArgumentException("toUser only accepts Creator timestamps");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m30200b(String str, ArrayList arrayList, vp71 vp71Var, ibk ibkVar) {
        zp71 zp71Var;
        zl0 zl0Var;
        if (ibkVar instanceof zp71) {
            zp71Var = (zp71) ibkVar;
            int i = zp71Var.f285013c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zp71Var.f285013c = i - Integer.MIN_VALUE;
            } else {
                zp71Var = new zp71(this, ibkVar);
            }
        } else {
            zp71Var = new zp71(this, ibkVar);
        }
        Object objM86756u = zp71Var.f285011a;
        int i2 = zp71Var.f285013c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                m30199a(arrayList);
                int iOrdinal = vp71Var.ordinal();
                if (iOrdinal == 0) {
                    zl0Var = zl0.PRECISION_LOW;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zl0Var = zl0.PRECISION_HIGH;
                }
                nnc nncVarM30202d = m30202d(str, arrayList);
                gm11 gm11Var = new gm11(zl0Var, fbkVar, 24);
                zp71Var.f285013c = 1;
                objM86756u = vyf1.m86756u(nncVarM30202d, gm11Var, zp71Var);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86756u);
            }
            return ((wp71) objM86756u).m88681a();
        } catch (Exception unused) {
            qlg1.m73220y(zp71Var.getContext());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final vjz m30201c(String str, List list) {
        m30199a(list);
        return oyf1.m68486s(mvl0.m62953p(new ia2(m30202d(str, list), 24)), new far0(11));
    }

    /* JADX INFO: renamed from: d */
    public final nnc m30202d(String str, List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((mu71) ((pu71) it.next())).m62837g()));
        }
        d0k[] d0kVarArr = bmu0.f28619a;
        return xtm0.m92074U(mvl0.m62953p(new vj61((enc) new onc(this.f29724b), (Object) this, str, 2)), new x13(this, arrayList, str, null, 17));
    }
}
