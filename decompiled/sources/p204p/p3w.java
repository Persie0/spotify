package p204p;

import com.spotify.messages.MobileEpisodePageFallbackEvent;
import com.spotify.messages.StickerTapped;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p3w {

    /* JADX INFO: renamed from: a */
    public final ago f173758a;

    /* JADX INFO: renamed from: b */
    public final qre0 f173759b;

    /* JADX INFO: renamed from: c */
    public final tjo f173760c;

    public p3w(ago agoVar, qre0 qre0Var, int i) {
        switch (i) {
            case 1:
                this.f173758a = agoVar;
                this.f173759b = qre0Var;
                this.f173760c = pag1.m69487w(new rko(a7j0.f13082i, 1, tmz0.f221808P0, new pko(tmz0.f221806N0), tmz0.f221809Q0), tmz0.f221807O0);
                break;
            default:
                this.f173758a = agoVar;
                this.f173759b = qre0Var;
                jqv0 jqv0Var = qpv0.f191387a;
                this.f173760c = pag1.m69484t(new rko(new jqx(jqv0Var.mo54112b(xaw.class)), 1, l2w.f129102Z0, new pko(l2w.f129089P0), l2w.f129103a1), new rko(new jqx(jqv0Var.mo54112b(v140.class)), 2, l2w.f129093T0, new pko(l2w.f129090Q0), l2w.f129094U0), new rko(new jqx(jqv0Var.mo54112b(erc1.class)), 2, l2w.f129095V0, new pko(l2w.f129091R0), l2w.f129096W0), new rko(new jqx(jqv0Var.mo54112b(y7t0.class)), 2, l2w.f129098X0, new pko(l2w.f129092S0), l2w.f129100Y0), ksv.f126038Z);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public Object m69089a(String str, ego egoVar, ibk ibkVar) {
        o3w o3wVar;
        Object objM95673w;
        gx81 gx81Var;
        ?? arrayList;
        List<t140> list;
        String string;
        String str2;
        u140 u140Var;
        m340 m340Var;
        z240 z240VarM60640a;
        if (ibkVar instanceof o3w) {
            o3wVar = (o3w) ibkVar;
            int i = o3wVar.f161460d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3wVar.f161460d = i - Integer.MIN_VALUE;
            } else {
                o3wVar = new o3w(this, ibkVar);
            }
        } else {
            o3wVar = new o3w(this, ibkVar);
        }
        Object obj = o3wVar.f161458b;
        int i2 = o3wVar.f161460d;
        if (i2 == 0) {
            bga.m29073P(obj);
            tjo tjoVar = egoVar.f59369d;
            o3wVar.f161457a = str;
            o3wVar.f161460d = 1;
            objM95673w = z9g1.m95673w(this.f173758a, this.f173760c, tjoVar, str, o3wVar);
            yuk yukVar = yuk.f276404a;
            if (objM95673w == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = o3wVar.f161457a;
            bga.m29073P(obj);
            objM95673w = ((s6x0) obj).f206218a;
        }
        String str3 = str;
        Throwable thM77348a = s6x0.m77348a(objM95673w);
        if (thM77348a != null) {
            return new c6x0(thM77348a);
        }
        pqm0 pqm0Var = (pqm0) objM95673w;
        n3w n3wVar = (n3w) pqm0Var.f180350a;
        Object obj2 = pqm0Var.f180351b;
        v140 v140Var = n3wVar.f150146c;
        xaw xawVar = n3wVar.f150144a;
        if (v140Var != null) {
            erc1 erc1Var = n3wVar.f150145b;
            gx81Var = new gx81(0L, (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11862c)) == null) ? null : z240VarM60640a.f278475a.f198763a, v140Var.f236243a, v140Var.f236244b);
        } else {
            gx81Var = null;
        }
        if (gx81Var == null) {
            fog0 fog0VarM14245o = MobileEpisodePageFallbackEvent.m14245o();
            fog0VarM14245o.m42287m(str3);
            this.f173759b.m73616a(fog0VarM14245o.build());
        }
        cem cemVar = (v140Var == null || (u140Var = v140Var.f236247e) == null) ? null : new cem(u140Var.f225679b, u140Var.f225678a);
        if (cemVar == null) {
            vaw vawVar = xawVar.f259777d;
            String str4 = "";
            if (vawVar == null || (string = vawVar.f239336b.toString()) == null) {
                string = "";
            }
            vaw vawVar2 = xawVar.f259777d;
            if (vawVar2 != null && (str2 = vawVar2.f239335a) != null) {
                str4 = str2;
            }
            cemVar = new cem(string, str4);
        }
        cem cemVar2 = cemVar;
        if (v140Var == null || (list = v140Var.f236246d) == null) {
            arrayList = lau.f131415a;
        } else {
            arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (t140 t140Var : list) {
                arrayList.add(new bem(t140Var.f216154b, t140Var.f216153a));
            }
        }
        ?? r2 = arrayList;
        if (gx81Var == null) {
            String strM89458a = xawVar.f259778e.m89458a(szk.f215608c);
            gx81Var = new gx81(0L, strM89458a.length() > 0 ? strM89458a : null, xawVar.f259776c, "episode");
        }
        return new dem(str3, r2, cemVar2, null, obj2, gx81Var);
    }

    /* JADX INFO: renamed from: b */
    public void m69090b(String str, String str2, String str3) {
        qho qhoVarMo25866b = this.f173758a.mo25866b(this.f173760c.mo28634a(w2a1.f247311a));
        if (!(qhoVarMo25866b instanceof oho)) {
            qhoVarMo25866b = null;
        }
        String str4 = qhoVarMo25866b != null ? (String) vie1.m85619a(qhoVarMo25866b) : null;
        if (str4 == null) {
            str4 = "";
        }
        u351 u351VarM14433r = StickerTapped.m14433r();
        u351VarM14433r.m82272r(str);
        u351VarM14433r.m82273s(str2);
        u351VarM14433r.m82270m(str3);
        u351VarM14433r.m82271q(str4);
        this.f173759b.m73616a(u351VarM14433r.build());
    }
}
