package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class v221 {

    /* JADX INFO: renamed from: a */
    public final String f236528a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f236529b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public pqm0 f236530c = new pqm0("V", null);

    public v221(y3z0 y3z0Var, String str, String str2) {
        this.f236528a = str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m84492a(String str, de60... de60VarArr) {
        pn91 pn91Var;
        if (de60VarArr.length == 0) {
            pn91Var = null;
        } else {
            co40 co40VarM29630p1 = bk5.m29630p1(de60VarArr);
            int iM31820L = c95.m31820L(i6f.m49804T(co40VarM29630p1, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            Iterator it = co40VarM29630p1.iterator();
            while (true) {
                do40 do40Var = (do40) it;
                if (!((Iterator) do40Var.f50936c).hasNext()) {
                    break;
                }
                bo40 bo40Var = (bo40) do40Var.next();
                linkedHashMap.put(Integer.valueOf(bo40Var.f29008a), (de60) bo40Var.f29009b);
            }
            pn91Var = new pn91(linkedHashMap);
        }
        this.f236529b.add(new pqm0(str, pn91Var));
    }

    /* JADX INFO: renamed from: b */
    public final void m84493b(String str, de60... de60VarArr) {
        co40 co40VarM29630p1 = bk5.m29630p1(de60VarArr);
        int iM31820L = c95.m31820L(i6f.m49804T(co40VarM29630p1, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        Iterator it = co40VarM29630p1.iterator();
        while (true) {
            do40 do40Var = (do40) it;
            if (!((Iterator) do40Var.f50936c).hasNext()) {
                this.f236530c = new pqm0(str, new pn91(linkedHashMap));
                return;
            } else {
                bo40 bo40Var = (bo40) do40Var.next();
                linkedHashMap.put(Integer.valueOf(bo40Var.f29008a), (de60) bo40Var.f29009b);
            }
        }
    }
}
