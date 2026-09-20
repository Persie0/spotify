package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class yxl {

    /* JADX INFO: renamed from: g */
    public static final long f277268g;

    /* JADX INFO: renamed from: a */
    public final gxl f277269a;

    /* JADX INFO: renamed from: b */
    public final ayl f277270b;

    /* JADX INFO: renamed from: c */
    public final i0d f277271c;

    /* JADX INFO: renamed from: d */
    public final rc9 f277272d;

    /* JADX INFO: renamed from: e */
    public final el2 f277273e;

    /* JADX INFO: renamed from: f */
    public final luk f277274f;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f277268g = jwg1.m54449D(3, ils.SECONDS);
    }

    public yxl(gxl gxlVar, ayl aylVar, i0d i0dVar, rc9 rc9Var, el2 el2Var, luk lukVar) {
        this.f277269a = gxlVar;
        this.f277270b = aylVar;
        this.f277271c = i0dVar;
        this.f277272d = rc9Var;
        this.f277273e = el2Var;
        this.f277274f = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m94845a(yxl yxlVar, String str, ibk ibkVar) {
        xxl xxlVar;
        if (ibkVar instanceof xxl) {
            xxlVar = (xxl) ibkVar;
            int i = xxlVar.f267019d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxlVar.f267019d = i - Integer.MIN_VALUE;
            } else {
                xxlVar = new xxl(yxlVar, ibkVar);
            }
        } else {
            xxlVar = new xxl(yxlVar, ibkVar);
        }
        Object objM70246g = xxlVar.f267017b;
        int i2 = xxlVar.f267019d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM70246g);
                el2 el2Var = yxlVar.f277273e;
                bn2 bn2Var = new bn2(str, null);
                xxlVar.f267016a = str;
                xxlVar.f267019d = 1;
                objM70246g = ((pl2) el2Var).m70246g(bn2Var, "in-app-aio", null, xxlVar);
                yuk yukVar = yuk.f276404a;
                if (objM70246g == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = xxlVar.f267016a;
                bga.m29073P(objM70246g);
            }
            ArrayList arrayList = ((gm2) objM70246g).f81257b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = ((mm2) it.next()).f145030a;
                if (wl51.m88460J0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                yxlVar.f277269a.m46115b(str, arrayList2);
            }
            return arrayList2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return lau.f131415a;
        }
    }
}
