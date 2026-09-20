package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hiz0 {

    /* JADX INFO: renamed from: a */
    public static final tjo f91914a = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(v140.class)), 1, vgz0.f241368e, new pko(vgz0.f241365c), vgz0.f241369f), vgz0.f241367d);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.ogo] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.ogo] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: a */
    public static final Serializable m47646a(ArrayList arrayList, pgo pgoVar, ibk ibkVar) {
        giz0 giz0Var;
        if (ibkVar instanceof giz0) {
            giz0Var = (giz0) ibkVar;
            int i = giz0Var.f80303c;
            if ((i & Integer.MIN_VALUE) != 0) {
                giz0Var.f80303c = i - Integer.MIN_VALUE;
            } else {
                giz0Var = new giz0(ibkVar);
            }
        } else {
            giz0Var = new giz0(ibkVar);
        }
        Object objM86756u = giz0Var.f80302b;
        int i2 = giz0Var.f80303c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                if (arrayList.isEmpty()) {
                    return lau.f131415a;
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f91914a.mo28634a((String) it.next()));
                }
                ogo ogoVarMo25867c = pgoVar.mo25867c(new l49(arrayList2));
                lcw0 lcw0Var = new lcw0(ogoVarMo25867c.mo41508b().f253772a, 17);
                f6n0 f6n0Var = new f6n0(2, 26, fbkVar);
                giz0Var.f80301a = ogoVarMo25867c;
                giz0Var.f80303c = 1;
                objM86756u = vyf1.m86756u(lcw0Var, f6n0Var, giz0Var);
                yuk yukVar = yuk.f276404a;
                arrayList = ogoVarMo25867c;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ogo ogoVar = giz0Var.f80301a;
                bga.m29073P(objM86756u);
                arrayList = ogoVar;
            }
            Iterable<qho> iterable = (Iterable) objM86756u;
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(iterable, 10));
            for (qho qhoVar : iterable) {
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                String str = ohoVar != null ? (String) ohoVar.f165512a : null;
                if (str == null) {
                    str = "";
                }
                arrayList3.add(str);
            }
            arrayList.dispose();
            return arrayList3;
        } catch (Throwable th) {
            arrayList.dispose();
            throw th;
        }
    }
}
