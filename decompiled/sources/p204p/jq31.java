package p204p;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jq31 {

    /* JADX INFO: renamed from: d */
    public static final fv31 f114778d;

    /* JADX INFO: renamed from: e */
    public static final fv31 f114779e;

    /* JADX INFO: renamed from: f */
    public static final fv31 f114780f;

    /* JADX INFO: renamed from: a */
    public final hv31 f114781a;

    /* JADX INFO: renamed from: b */
    public final wg61 f114782b = new wg61(new iq31(this, 1));

    /* JADX INFO: renamed from: c */
    public final wg61 f114783c = new wg61(new iq31(this, 0));

    static {
        si5 si5Var = fv31.f73628b;
        f114778d = si5Var.m78181M("show-preferences-sort-order");
        f114779e = si5Var.m78181M("show-preferences-filter-option");
        f114780f = si5Var.m78181M("cwp-sort-filter-options");
    }

    public jq31(String str, Application application, vnb vnbVar) {
        this.f114781a = vnbVar.f243033b.mo35842b(application, str);
    }

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m54030a(jq31 jq31Var, String str) {
        LinkedHashMap linkedHashMap = null;
        if (str.length() == 0) {
            str = null;
        }
        if (str != null) {
            List listM88477a1 = wl51.m88477a1(dq60.m36614n("\\{|\\}|\"filter\":", bm51.m29801l0(str, "&quot;", "\""), ""), new String[]{","}, 0, 6);
            ArrayList<List> arrayList = new ArrayList();
            Iterator it = listM88477a1.iterator();
            while (it.hasNext()) {
                List listM88477a2 = wl51.m88477a1((String) it.next(), new String[]{"\":\""}, 0, 6);
                if (listM88477a2.size() != 2) {
                    listM88477a2 = null;
                }
                if (listM88477a2 != null) {
                    arrayList.add(listM88477a2);
                }
            }
            int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            linkedHashMap = new LinkedHashMap(iM31820L);
            for (List list : arrayList) {
                linkedHashMap.put(bm51.m29801l0((String) list.get(0), "\"", ""), bm51.m29801l0((String) list.get(1), "\"", ""));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m54031b(String str, eq31 eq31Var) {
        String str2;
        String str3;
        int i = eq31Var.f61771a;
        if (i == 1) {
            str2 = "Default";
        } else if (i == 2) {
            str2 = "Newest";
        } else if (i == 3) {
            str2 = "Oldest";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "MostPopular";
        }
        int i2 = eq31Var.f61772b;
        if (i2 == 1) {
            str3 = "None";
        } else if (i2 == 2) {
            str3 = "AvailableOffline";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str3 = "UnPlayed";
        }
        String strM75190h = rbz.m75190h(str, "|", str2, "|", str3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(strM75190h);
        hv31 hv31Var = this.f114781a;
        fv31 fv31Var = f114780f;
        gbu gbuVar = gbu.f78413a;
        Set setMo48707b = hv31Var.mo48707b(fv31Var, gbuVar);
        Object objM43714b1 = gbuVar;
        if (setMo48707b != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : setMo48707b) {
                if (!wl51.m88496t0((String) obj, str, false)) {
                    arrayList.add(obj);
                }
            }
            objM43714b1 = g6f.m43714b1(arrayList, 1000);
        }
        linkedHashSet.addAll(objM43714b1);
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60052e(fv31Var, linkedHashSet);
        lv31VarEdit.m60054g();
    }
}
