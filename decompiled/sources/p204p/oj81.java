package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class oj81 {

    /* JADX INFO: renamed from: a */
    public final ej81 f166009a;

    /* JADX INFO: renamed from: b */
    public final rkn f166010b;

    public oj81(ej81 ej81Var, rkn rknVar) {
        this.f166009a = ej81Var;
        this.f166010b = rknVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m67101a(oj81 oj81Var, String str, voc1 voc1Var, String str2, String str3, Map map, rj81 rj81Var, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        oj81Var.m67103c(str, voc1Var, str2, str3, map, rj81Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m67102b(oj81 oj81Var, String str, voc1 voc1Var, d850 d850Var, String str2, Map map, rj81 rj81Var, int i) {
        String str3 = (i & 8) != 0 ? null : str2;
        Map map2 = (i & 32) != 0 ? null : map;
        rj81 rj81Var2 = (i & 64) != 0 ? new rj81(null, null, false, null, false, false, false, false, false, false, null, false, false, false, false, false, null, null, false, false, false, false, false, false, false, null, null, false, false, -1, 7) : rj81Var;
        oj81Var.getClass();
        oj81Var.m67103c(str, voc1Var, str3, d850Var.f46380a.f279709a, map2, rj81Var2);
    }

    /* JADX INFO: renamed from: c */
    public final void m67103c(String str, voc1 voc1Var, String str2, String str3, Map map, rj81 rj81Var) {
        Observable observableM64598d = ((nj81) this.f166009a).m64598d(voc1Var, rj81Var, map, str2, str);
        i3k i3kVarM75788a = this.f166010b.m75788a(voc1Var);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        i3k.m49622b(i3kVarM75788a, observableM64598d, xgg1.m90662N1("CONTEXTMENU_TRACK", "contextmenu/track", 429, "contextmenu"), new z6k(str, str2, rj81Var.f199744b), str3, 16);
    }
}
