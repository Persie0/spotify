package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class v0v0 implements u0v0 {

    /* JADX INFO: renamed from: b */
    public static final List f236147b = h6f.m46715L("spotify", "31jperisdn7xh5nxeu2m23zoeifu");

    /* JADX INFO: renamed from: a */
    public final als f236148a;

    public v0v0(als alsVar, xre xreVar) {
        this.f236148a = alsVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m84408b(String str, v140 v140Var) {
        ArrayList arrayList;
        List list = v140Var != null ? v140Var.f236246d : null;
        if (list == null) {
            list = lau.f131415a;
        }
        if (bm51.m29803n0(str, "spotify:kallax:", false)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (bm51.m29803n0(((t140) obj).f216154b, "spotify:artist:", false)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(i6f.m49804T(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((t140) it.next()).f216153a);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((t140) it2.next()).f216153a);
            }
            arrayList = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((String) obj2).length() > 0) {
                arrayList4.add(obj2);
            }
        }
        return g6f.m43753y0(arrayList4, ", ", null, null, null, 62);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m84409c(String str, thj thjVar, boolean z, boolean z2) {
        if ((thjVar != null ? thjVar.f220443a : null) != rhj.f199234b) {
            return false;
        }
        if (z && tgv.m80783d(str)) {
            return true;
        }
        return z2 && tgv.m80784e(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m84410d(uy80 uy80Var) {
        if (wj50.m88271j(uy80Var != null ? uy80Var.f235211g : null, "spotbot-to-playlist")) {
            return true;
        }
        return wj50.m88271j(uy80Var != null ? uy80Var.f235211g : null, "spotbot-to-playlist-test");
    }

    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v54 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v54 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: e */
    public final p204p.t0v0 m84411e(java.lang.String r42, p204p.v140 r43, p204p.erc1 r44, p204p.daj r45, p204p.jcl0 r46, p204p.y7t0 r47, p204p.byv r48, p204p.uff0 r49, p204p.uy80 r50, p204p.bob1 r51, p204p.thj r52, boolean r53, boolean r54, boolean r55, java.lang.Boolean r56) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.v0v0.m84411e(java.lang.String, p.v140, p.erc1, p.daj, p.jcl0, p.y7t0, p.byv, p.uff0, p.uy80, p.bob1, p.thj, boolean, boolean, boolean, java.lang.Boolean):p.t0v0");
    }
}
