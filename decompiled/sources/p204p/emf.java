package p204p;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class emf {

    /* JADX INFO: renamed from: a */
    public final k5m0 f60899a;

    /* JADX INFO: renamed from: b */
    public final c700 f60900b;

    /* JADX INFO: renamed from: c */
    public final pz0 f60901c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f60902d;

    /* JADX INFO: renamed from: e */
    public final chf f60903e;

    /* JADX INFO: renamed from: f */
    public final vc4 f60904f;

    public emf(k5m0 k5m0Var, c700 c700Var, pz0 pz0Var, Scheduler scheduler, chf chfVar, vc4 vc4Var) {
        this.f60899a = k5m0Var;
        this.f60900b = c700Var;
        this.f60901c = pz0Var;
        this.f60902d = scheduler;
        this.f60903e = chfVar;
        this.f60904f = vc4Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m39419b(emf emfVar, voc1 voc1Var, String str, boolean z, boolean z2, xm70 xm70Var, d850 d850Var, int i) {
        String lastPathSegment;
        List<String> pathSegments;
        List<String> pathSegments2;
        String strM35694A;
        z650 z650Var;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        String str2 = null;
        xm70 xm70Var2 = (i & 16) != 0 ? null : xm70Var;
        d850 d850Var2 = (i & 32) != 0 ? null : d850Var;
        emfVar.getClass();
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        if (dd41VarM74726U.f47709c != gn80.SHOW_EPISODE) {
            return;
        }
        String strM35710h = dd41VarM74726U.m35710h();
        if ((xm70Var2 instanceof wm70) || (xm70Var2 instanceof sm70) || (xm70Var2 instanceof tm70) || (xm70Var2 instanceof um70)) {
            dd41 dd41VarM74726U2 = r46.m74726U(xm70Var2.mo78519W0());
            Uri uri = dd41VarM74726U2.f47707a;
            switch (dd41VarM74726U2.f47709c.ordinal()) {
                case 223:
                    lastPathSegment = (uri != null && (pathSegments = uri.getPathSegments()) != null) ? (String) g6f.m43747t0(6, pathSegments) : null;
                    break;
                case 224:
                    lastPathSegment = uri == null ? null : uri.getLastPathSegment();
                    break;
                case 225:
                    lastPathSegment = (uri != null && (pathSegments2 = uri.getPathSegments()) != null) ? (String) g6f.m43747t0(5, pathSegments2) : null;
                    break;
                default:
                    lastPathSegment = null;
                    break;
            }
            if (lastPathSegment == null) {
                return;
            } else {
                strM35694A = r46.m74718K(strM35710h, lastPathSegment).m35694A();
            }
        } else {
            strM35694A = r46.m74716I(strM35710h).m35694A();
        }
        String str3 = strM35694A;
        if (str3 == null) {
            return;
        }
        Bundle bundleM70529j = pp91.m70529j(pft0.m69840u("view_uri", voc1Var.f243453a), pft0.m69840u("disable_input", Boolean.valueOf(z3)), pft0.m69840u("launch_action", xm70Var2), pft0.m69840u("show_sensitive", Boolean.valueOf(z4)));
        k5m0 k5m0Var = emfVar.f60899a;
        if (d850Var2 != null && (z650Var = d850Var2.f46380a) != null) {
            str2 = z650Var.f279709a;
        }
        k5m0.m55541i(k5m0Var, str3, str2, bundleM70529j, false, 8);
        emfVar.f60903e.m32765b(str, false).m23303t(emfVar.f60902d).subscribe(ah4.f15615h, new e03(str, 3));
    }

    /* JADX INFO: renamed from: c */
    public static void m39420c(emf emfVar, String str, voc1 voc1Var, boolean z, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        c700 c700Var = emfVar.f60900b;
        if (emfVar.f60904f.m85181c()) {
            m39419b(emfVar, voc1Var, str, z4, z3, null, null, 48);
            return;
        }
        i500 i500VarM31604F = c700Var.m31604F("comments-sheet-fragment");
        dmf dmfVar = i500VarM31604F instanceof dmf ? (dmf) i500VarM31604F : null;
        if (dmfVar != null && dmfVar.m36415r1().equals(str)) {
            dmfVar.f50523f2.onNext(w2a1.f247311a);
            emfVar.m39421a(str, dmfVar);
            return;
        }
        if (dmfVar != null) {
            dmfVar.dismiss();
        }
        dmf dmfVar2 = (dmf) emfVar.f60901c.mo25006a();
        dmfVar2.f50518a2 = str;
        dmfVar2.f50519b2 = voc1Var;
        dmfVar2.f50522e2 = z3;
        dmfVar2.f50520c2 = z4;
        if (!dmfVar2.m49727z0()) {
            dmfVar2.mo63162p1(c700Var, "comments-sheet-fragment");
        }
        emfVar.m39421a(str, dmfVar2);
    }

    /* JADX INFO: renamed from: a */
    public final void m39421a(String str, dmf dmfVar) {
        dmfVar.f98716q1.mo31986a(new dz2(this.f60903e.m32765b(str, false).m23303t(this.f60902d).subscribe(ah4.f15615h, new e03(str, 3)), 3));
    }
}
