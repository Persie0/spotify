package p204p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes10.dex */
public final class e8i0 {

    /* JADX INFO: renamed from: a */
    public final epx f57212a;

    /* JADX INFO: renamed from: b */
    public final luk f57213b;

    public /* synthetic */ e8i0(epx epxVar, luk lukVar) {
        this.f57212a = epxVar;
        this.f57213b = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m38109a(ArrayList arrayList, ibk ibkVar) throws UnsupportedEncodingException {
        qua1 qua1Var;
        Object next;
        if (ibkVar instanceof qua1) {
            qua1Var = (qua1) ibkVar;
            int i = qua1Var.f192616d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qua1Var.f192616d = i - Integer.MIN_VALUE;
            } else {
                qua1Var = new qua1(this, ibkVar);
            }
        } else {
            qua1Var = new qua1(this, ibkVar);
        }
        Object objM86755t = qua1Var.f192614b;
        int i2 = qua1Var.f192616d;
        int i3 = 10;
        if (i2 == 0) {
            ArrayList arrayListM93485o = yds.m93485o(objM86755t);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oua1 oua1Var = ((pua1) it.next()).f181399a;
                nua1 nua1Var = oua1Var instanceof nua1 ? (nua1) oua1Var : null;
                String str = nua1Var != null ? nua1Var.f158549b : null;
                if (str != null) {
                    arrayListM93485o.add(str);
                }
            }
            List listM43727j0 = g6f.m43727j0(arrayListM93485o);
            if (listM43727j0.isEmpty()) {
                return arrayList;
            }
            int iM31820L = c95.m31820L(i6f.m49804T(listM43727j0, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : listM43727j0) {
                linkedHashMap.put("spotify:user:" + URLEncoder.encode((String) obj, "UTF-8"), obj);
            }
            qua1Var.f192613a = arrayList;
            qua1Var.f192616d = 1;
            Flowable flowable = ((jpx) this.f57212a).m53978b(new C1668ai("playlist-collaboration", false, (gh00) new khd(3, linkedHashMap))).toFlowable(BackpressureStrategy.f7190d);
            d0k[] d0kVarArr = bmu0.f28619a;
            int i4 = 20;
            objM86755t = vyf1.m86755t(new gt71(new xjz0(new l181(cyf1.m34374j(new onc(flowable), this.f57213b), i4), i4), linkedHashMap, i3), qua1Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = qua1Var.f192613a;
            bga.m29073P(objM86755t);
        }
        Map map = (Map) objM86755t;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (pua1 pua1Var : arrayList) {
            oua1 oua1Var2 = pua1Var.f181399a;
            nua1 nua1Var2 = oua1Var2 instanceof nua1 ? (nua1) oua1Var2 : null;
            if (nua1Var2 != null) {
                String str2 = nua1Var2.f158549b;
                eua1 eua1Var = (eua1) map.get(str2);
                if (eua1Var != null) {
                    String str3 = eua1Var.f62930b;
                    Iterator it2 = eua1Var.f62933e.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            o340 o340Var = (o340) next;
                            int i5 = o340Var.f161281c * o340Var.f161280b;
                            do {
                                Object next2 = it2.next();
                                o340 o340Var2 = (o340) next2;
                                int i6 = o340Var2.f161281c * o340Var2.f161280b;
                                if (i5 < i6) {
                                    next = next2;
                                    i5 = i6;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    o340 o340Var3 = (o340) next;
                    String str4 = o340Var3 != null ? o340Var3.f161279a : null;
                    if (str4 == null) {
                        str4 = nua1Var2.f158550c;
                    }
                    pua1Var = new pua1(new nua1(str3, str2, str4), pua1Var.f181400b, pua1Var.f181401c);
                }
            }
            arrayList2.add(pua1Var);
        }
        return arrayList2;
    }
}
