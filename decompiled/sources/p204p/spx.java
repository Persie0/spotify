package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class spx {

    /* JADX INFO: renamed from: a */
    public final epx f212966a;

    public /* synthetic */ spx(epx epxVar) {
        this.f212966a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m78923a(String str, ibk ibkVar) {
        rpx rpxVar;
        if (ibkVar instanceof rpx) {
            rpxVar = (rpx) ibkVar;
            int i = rpxVar.f201658d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rpxVar.f201658d = i - Integer.MIN_VALUE;
            } else {
                rpxVar = new rpx(this, ibkVar);
            }
        } else {
            rpxVar = new rpx(this, ibkVar);
        }
        Object objM86756u = rpxVar.f201656b;
        int i2 = rpxVar.f201658d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                yab yabVarM54985d = k0e1.m54985d(((jpx) this.f212966a).m53978b(new C1668ai("music-quiz", false, (gh00) new lpx(str, 2))));
                bpp bppVar = new bpp(2, 11, null);
                rpxVar.f201655a = str;
                rpxVar.f201658d = 1;
                objM86756u = vyf1.m86756u(yabVarM54985d, bppVar, rpxVar);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = rpxVar.f201655a;
                bga.m29073P(objM86756u);
            }
            ks81 ks81Var = (ks81) ((gqx) objM86756u).mo45449a(ks81.class, str).f72301b;
            return ks81Var != null ? ks81Var.f125873e : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Serializable m78924b(ArrayList arrayList, ibk ibkVar) {
        ns11 ns11Var;
        if (ibkVar instanceof ns11) {
            ns11Var = (ns11) ibkVar;
            int i = ns11Var.f157646d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ns11Var.f157646d = i - Integer.MIN_VALUE;
            } else {
                ns11Var = new ns11(this, ibkVar);
            }
        } else {
            ns11Var = new ns11(this, ibkVar);
        }
        Object objM96571q = ns11Var.f157644b;
        int i2 = ns11Var.f157646d;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            if (!arrayList.isEmpty()) {
                Observable observableFilter = ((jpx) this.f212966a).m53978b(new C1668ai("show_value_metadata", false, (gh00) new f5q0(10, arrayList))).filter(hkr0.f92474L0);
                ns11Var.f157643a = arrayList;
                ns11Var.f157646d = 1;
                objM96571q = zn91.m96571q(observableFilter, 2, null, ns11Var);
                yuk yukVar = yuk.f276404a;
                if (objM96571q == yukVar) {
                    return yukVar;
                }
            }
            return nau.f152117a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList = ns11Var.f157643a;
        bga.m29073P(objM96571q);
        gqx gqxVar = (gqx) objM96571q;
        if (gqxVar != null) {
            int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : arrayList) {
                ub21 ub21Var = (ub21) gqxVar.mo45449a(ub21.class, (String) obj).f72301b;
                String str = ub21Var != null ? ub21Var.f228616b : null;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = ub21Var != null ? ub21Var.f228617c : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = ub21Var != null ? ub21Var.f228615a : null;
                if (str4 != null) {
                    str2 = str4;
                }
                linkedHashMap.put(obj, new c0x0(str, str3, str2));
            }
            return linkedHashMap;
        }
        return nau.f152117a;
    }
}
