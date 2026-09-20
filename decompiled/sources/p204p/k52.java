package p204p;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class k52 {

    /* JADX INFO: renamed from: a */
    public final ron0 f119388a;

    public /* synthetic */ k52(ron0 ron0Var) {
        this.f119388a = ron0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m55416a(k52 k52Var, List list, ibk ibkVar) {
        xlx xlxVar;
        if (ibkVar instanceof xlx) {
            xlxVar = (xlx) ibkVar;
            int i = xlxVar.f263246c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xlxVar.f263246c = i - Integer.MIN_VALUE;
            } else {
                xlxVar = new xlx(k52Var, ibkVar);
            }
        } else {
            xlxVar = new xlx(k52Var, ibkVar);
        }
        Object objM89557A = xlxVar.f263244a;
        int i2 = xlxVar.f263246c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                ron0 ron0Var = k52Var.f119388a;
                xlxVar.f263246c = 1;
                objM89557A = x0h1.m89557A(ron0Var.f201305a, new zu8(ron0Var, list, "search", true, (fbk) null), xlxVar);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            Iterable<pob> iterable = (Iterable) objM89557A;
            int iM31820L = c95.m31820L(i6f.m49804T(iterable, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (pob pobVar : iterable) {
                linkedHashMap.put(pobVar.f179663a, Boolean.valueOf(pobVar.f179664b));
            }
            return linkedHashMap;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return nau.f152117a;
        }
    }

    /* JADX INFO: renamed from: b */
    public fiz m55417b(List list) {
        if (list.isEmpty()) {
            return new ysk(nau.f152117a, 27);
        }
        fbk fbkVar = null;
        int i = 3;
        return mvl0.m62953p(new vjz(new ner(new vjz(this.f119388a.m76075c(), new f3q(2, 12, fbkVar)), this, list, i), new ic0(i, 21, fbkVar), 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Serializable m55418c(String str, ibk ibkVar) {
        j52 j52Var;
        Serializable c6x0Var;
        if (ibkVar instanceof j52) {
            j52Var = (j52) ibkVar;
            int i = j52Var.f108841c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j52Var.f108841c = i - Integer.MIN_VALUE;
            } else {
                j52Var = new j52(this, ibkVar);
            }
        } else {
            j52Var = new j52(this, ibkVar);
        }
        Object objM76073a = j52Var.f108839a;
        int i2 = j52Var.f108841c;
        boolean z = true;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76073a);
                ron0 ron0Var = this.f119388a;
                List listSingletonList = Collections.singletonList(str);
                j52Var.f108841c = 1;
                objM76073a = ron0.m76073a(ron0Var, listSingletonList, "share_video_frame", j52Var);
                yuk yukVar = yuk.f276404a;
                if (objM76073a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76073a);
            }
            pob pobVar = (pob) g6f.m43745s0((List) objM76073a);
            if (pobVar == null || pobVar.f179664b) {
                z = false;
            }
            c6x0Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || (thM77348a instanceof TimeoutCancellationException) || !(thM77348a instanceof CancellationException)) {
            return c6x0Var instanceof c6x0 ? Boolean.TRUE : c6x0Var;
        }
        throw thM77348a;
    }
}
