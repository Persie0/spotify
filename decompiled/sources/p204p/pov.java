package p204p;

import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class pov implements dfo {

    /* JADX INFO: renamed from: L0 */
    public final String f179788L0;

    /* JADX INFO: renamed from: M0 */
    public final fyc0 f179789M0;

    /* JADX INFO: renamed from: N0 */
    public final EsPlayOrigin$PlayOrigin f179790N0;

    /* JADX INFO: renamed from: O0 */
    public final mmh0 f179791O0;

    /* JADX INFO: renamed from: P0 */
    public final i5x f179792P0;

    /* JADX INFO: renamed from: Q0 */
    public final cph f179793Q0;

    /* JADX INFO: renamed from: R0 */
    public final hk1 f179794R0;

    /* JADX INFO: renamed from: X */
    public final pgo f179795X;

    /* JADX INFO: renamed from: Y */
    public final hrw f179796Y;

    /* JADX INFO: renamed from: Z */
    public final hc80 f179797Z;

    /* JADX INFO: renamed from: a */
    public final h1k f179798a;

    /* JADX INFO: renamed from: b */
    public final hg1 f179799b;

    /* JADX INFO: renamed from: c */
    public final fln f179800c;

    /* JADX INFO: renamed from: d */
    public final wf4 f179801d;

    /* JADX INFO: renamed from: e */
    public final hun0 f179802e;

    /* JADX INFO: renamed from: f */
    public final dtj f179803f;

    /* JADX INFO: renamed from: g */
    public final q6u f179804g;

    /* JADX INFO: renamed from: h */
    public final oak f179805h;

    /* JADX INFO: renamed from: i */
    public final n190 f179806i;

    /* JADX INFO: renamed from: t */
    public final luk f179807t;

    public pov(h1k h1kVar, hg1 hg1Var, fln flnVar, wf4 wf4Var, hun0 hun0Var, dtj dtjVar, q6u q6uVar, oak oakVar, n190 n190Var, luk lukVar, pgo pgoVar, hrw hrwVar, hc80 hc80Var, String str, cbm0 cbm0Var, String str2, fyc0 fyc0Var) {
        this.f179798a = h1kVar;
        this.f179799b = hg1Var;
        this.f179800c = flnVar;
        this.f179801d = wf4Var;
        this.f179802e = hun0Var;
        this.f179803f = dtjVar;
        this.f179804g = q6uVar;
        this.f179805h = oakVar;
        this.f179806i = n190Var;
        this.f179807t = lukVar;
        this.f179795X = pgoVar;
        this.f179796Y = hrwVar;
        this.f179797Z = hc80Var;
        this.f179788L0 = str2;
        this.f179789M0 = fyc0Var;
        dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
        dnwVarM17804F.m36498w(xoc1.f264109i6.f243453a);
        dnwVarM17804F.m36494s(cbm0Var.f36167d);
        dnwVarM17804F.m36496u(str);
        this.f179790N0 = (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
        int i = 0;
        this.f179791O0 = alf1.m26340w(new dov(this, i), brp.f30135g, new jov(this), new eov(this, i), new dov(this, 1));
        this.f179792P0 = mhf1.m61771p(this).m94133b(ccu.f36626V0, ccu.f36627W0);
        fyf fyfVar = new fyf(new fgv(this, 5), true, 996083407);
        wpi0 wpi0Var = xwt.f266743a;
        this.f179793Q0 = new cph(fyfVar, 3);
        this.f179794R0 = new hk1(this, 13);
    }

    /* JADX INFO: renamed from: f */
    public static final bmo0 m70490f(pov povVar, bov bovVar) {
        n190 n190Var = povVar.f179806i;
        String str = bovVar.f29255a;
        String str2 = bovVar.f29258d;
        ysk yskVar = new ysk(gbu.f78413a, 27);
        hc80 hc80Var = povVar.f179797Z;
        hrw hrwVar = povVar.f179796Y;
        ysk yskVar2 = new ysk(null, 27);
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = povVar.f179790N0;
        ysk yskVar3 = new ysk(nau.f152117a, 27);
        mec0 mec0Var = new mec0();
        mec0Var.put("agentic_product_type", "martini");
        String str3 = bovVar.f29257c;
        if (!wl51.m88460J0(str3)) {
            mec0Var.put("martini_conversation_id", str3);
        }
        if (!wl51.m88460J0(str2)) {
            mec0Var.put("play_context_decision_id", str2);
        }
        return povVar.f179802e.m48684e(new xlo0(n190Var.m63475a(str, yskVar, hc80Var, hrwVar, yskVar2, esPlayOrigin$PlayOrigin, yskVar3, new ysk(mec0Var.m61540b(), 27))));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX INFO: renamed from: g */
    public static znv m70491g(bov bovVar, qho qhoVar, ctj ctjVar, pv00 pv00Var, bso0 bso0Var) {
        String strM43753y0;
        m340 m340Var;
        z240 z240VarM60640a;
        String str;
        List list;
        List list2;
        boolean z = qhoVar instanceof oho;
        String str2 = null;
        oho ohoVar = z ? (oho) qhoVar : null;
        nmv nmvVar = ohoVar != null ? (nmv) ohoVar.f165512a : null;
        v140 v140Var = nmvVar != null ? nmvVar.f156270a : null;
        erc1 erc1Var = nmvVar != null ? nmvVar.f156271b : null;
        daj dajVar = nmvVar != null ? nmvVar.f156272c : null;
        String str3 = v140Var != null ? v140Var.f236243a : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        if (bovVar.f29256b != 2 || v140Var == null || (list2 = v140Var.f236246d) == null) {
            strM43753y0 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str5 = ((t140) it.next()).f216153a;
                if (wl51.m88460J0(str5)) {
                    str5 = null;
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                strM43753y0 = g6f.m43753y0(arrayList2, ", ", null, null, null, 62);
            } else {
                strM43753y0 = null;
            }
        }
        boolean z2 = (dajVar == null || (list = dajVar.f47051b) == null || !list.contains(aaj.f13850b)) ? false : true;
        String str6 = bovVar.f29255a;
        if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (z240VarM60640a = m340Var.m60640a(a340.f11861b)) != null && (str = z240VarM60640a.f278475a.f198763a) != null && !wl51.m88460J0(str)) {
            str2 = str;
        }
        return new znv(str6, str4, strM43753y0, str2, z2, !z, ctjVar, pv00Var, bso0Var, null);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f179792P0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f179793Q0;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f179791O0;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f179794R0;
    }
}
