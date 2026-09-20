package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class fas {

    /* JADX INFO: renamed from: a */
    public final y3l0 f67627a;

    /* JADX INFO: renamed from: b */
    public final wt80 f67628b;

    /* JADX INFO: renamed from: c */
    public final c07 f67629c;

    /* JADX INFO: renamed from: d */
    public final luk f67630d;

    /* JADX INFO: renamed from: e */
    public final ltx0 f67631e;

    public fas(y3l0 y3l0Var, wt80 wt80Var, c07 c07Var, luk lukVar, ltx0 ltx0Var) {
        this.f67627a = y3l0Var;
        this.f67628b = wt80Var;
        this.f67629c = c07Var;
        this.f67630d = lukVar;
        this.f67631e = ltx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r9 == r4) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m41191a(fas fasVar, String str, ibk ibkVar) {
        eas easVar;
        if (ibkVar instanceof eas) {
            easVar = (eas) ibkVar;
            int i = easVar.f57722c;
            if ((i & Integer.MIN_VALUE) != 0) {
                easVar.f57722c = i - Integer.MIN_VALUE;
            } else {
                easVar = new eas(fasVar, ibkVar);
            }
        } else {
            easVar = new eas(fasVar, ibkVar);
        }
        Object objM92767b = easVar.f57720a;
        int i2 = easVar.f57722c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM92767b);
            if (new gf41(str).f79270c != df41.SHOW) {
                y3l0 y3l0Var = fasVar.f67627a;
                easVar.f57722c = 1;
                objM92767b = y3l0Var.m92767b(str, easVar);
                if (objM92767b != yukVar) {
                }
                return yukVar;
            }
            return lau.f131415a;
        }
        if (i2 == 1) {
            bga.m29073P(objM92767b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM92767b);
        }
        Map map = (Map) objM92767b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new mcj((String) entry.getKey(), ((qu80) ((p2x0) entry.getValue()).m68971d()).f192599e.f271257b));
        }
        return arrayList;
        List list = (List) objM92767b;
        if (!list.isEmpty()) {
            wt80 wt80Var = fasVar.f67628b;
            int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : list) {
                linkedHashMap.put(obj, new vt80((String) obj, gas.f78091a));
            }
            easVar.f57722c = 2;
            objM92767b = ((mu80) wt80Var).m62842g(linkedHashMap, null, easVar);
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: b */
    public final Observable m41192b(String str, boolean z) {
        ltx0 ltx0Var = this.f67631e;
        return Observable.combineLatest(Observable.combineLatest((Observable) ltx0Var.f136904c, (Observable) ltx0Var.f136903b, mmq0.f145227t), this.f67629c.m31111a(z), vjf1.m85770t(this.f67630d, new lzr(this, str, (fbk) null, 5)).toObservable(), d7f0.f46169f1);
    }
}
