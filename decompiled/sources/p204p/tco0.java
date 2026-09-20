package p204p;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class tco0 implements BiFunction, Function, iuk, r0f1, emg1 {
    /* JADX INFO: renamed from: b */
    public static ArrayList m80477b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r3t0) obj) != r3t0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r3t0) it.next()).f195574a);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m80478c(List list) {
        npa npaVar = new npa();
        for (String str : m80477b(list)) {
            npaVar.m65298J(str.length());
            npaVar.m65303P(0, str.length(), str);
        }
        return npaVar.m65314t(npaVar.f156904b);
    }

    @Override // p204p.x0f1
    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object mo49415a() {
        return new c3f1("StandardIntegrity");
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        prt0 prt0Var = (prt0) obj;
        nrt0 nrt0Var = (nrt0) obj2;
        int iOrdinal = nrt0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return prt0.m70733a(prt0Var, nrt0Var, null, null, 8187);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = prt0Var.f180667b;
        nrt0 nrt0Var2 = nrt0.f157606a;
        if (i != 2) {
            return prt0.m70733a(prt0Var, nrt0Var2, null, null, 8187);
        }
        Set set = prt0Var.f180676k;
        ort0 ort0Var = ort0.f168653c;
        return prt0.m70733a(prt0Var, nrt0Var2, s601.m77304g0(ort0Var, prt0Var.f180675j), s601.m77304g0(ort0Var, set), 6651);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ikc0.m50942n(obj);
        throw null;
    }
}
