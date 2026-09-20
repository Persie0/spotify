package p204p;

import android.view.View;
import com.spotify.music.R;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsContainerView;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import spotify.playlist.esperanto.proto.PlaylistContainsResponse;
import spotify.playlist.esperanto.proto.PlaylistModificationResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class ag70 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag70(Object obj, int i) {
        super(0);
        this.f15304a = i;
        this.f15305b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        msh mshVar;
        switch (this.f15304a) {
            case 0:
                ((bg70) this.f15305b).f26858d.finish();
                return w2a1.f247311a;
            case 1:
                return (ijc1) ((wg70) this.f15305b).invoke();
            case 2:
                return new oj70(((qj70) this.f15305b).f189175d.getResources());
            case 3:
                try {
                    List<zh11> listM32849k = ci11.m32849k(((vj70) this.f15305b).f241903a, 4);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (zh11 zh11Var : listM32849k) {
                        wj50.m88279p(zh11Var);
                        Integer numM51322f = iq3.m51322f(zh11Var);
                        if (numM51322f != null) {
                            linkedHashSet.add(numM51322f);
                        }
                    }
                    return linkedHashSet;
                } catch (IllegalArgumentException e) {
                    na6.m63959g("Could not retrieve pinned shortcuts", e);
                    return null;
                }
            case 4:
                return ((r7i0) ((ql70) this.f15305b).f189750b.get()).mo43757c(true);
            case 5:
                pp70 pp70Var = ((lp70) this.f15305b).f135676d1;
                pp70Var.f179937p.f130325X0 = true;
                i3b0 i3b0Var = pp70Var.f179938q;
                if (i3b0Var != null) {
                    i3b0Var.f98097S0 = true;
                }
                return w2a1.f247311a;
            case 6:
                rp70 rp70Var = (rp70) this.f15305b;
                if (!((Boolean) rp70Var.f201447g.getValue()).booleanValue() && (mshVar = rp70Var.f201443c) != null) {
                    mshVar.m62758o();
                }
                return w2a1.f247311a;
            case 7:
                return (ir70) this.f15305b;
            case 8:
                return ((ur70) this.f15305b).m83837b();
            case 9:
                ((qx70) this.f15305b).f193537d.m51847a();
                return w2a1.f247311a;
            case 10:
                ez70 ez70Var = (ez70) this.f15305b;
                Map map = ez70Var.f64298e;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((zoe1) entry.getValue()).mo26673b(new e840(1, ez70Var, ez70.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, 0, 14)));
                }
                return linkedHashMap;
            case 11:
                return ((mgn) ((bmh) this.f15305b).f28527c).m61726a(new w080(false, 2));
            case 12:
                n280 n280Var = (n280) this.f15305b;
                te0 te0Var = n280Var.f149680a;
                l280 l280Var = new l280(n280Var, 0);
                l280 l280Var2 = new l280(n280Var, 1);
                jqv0 jqv0Var = qpv0.f191387a;
                return te0Var.m80523a(l280Var, l280Var2, jqv0Var.mo54112b(String.class), jqv0Var.mo54112b(s180.class));
            case 13:
                return new bi1((n380) this.f15305b, 23);
            case 14:
                return (kv91) ((g580) this.f15305b).f76610a.get();
            case 15:
                return ((View) ((n780) this.f15305b).f151101a.get()).findViewById(R.id.loading);
            case 16:
                return Long.valueOf(((LibraryChipsContainerView) this.f15305b).getResources().getInteger(android.R.integer.config_shortAnimTime));
            case 17:
                ((rc80) this.f15305b).f197790a.m60960e();
                return w2a1.f247311a;
            case 18:
                ud80 ud80Var = (ud80) this.f15305b;
                u3f u3fVar = (u3f) ud80Var.f229201f.mo49283h();
                if (u3fVar != null) {
                    return u3fVar.mo45277a(ud80Var.f229196a.getResources());
                }
                return null;
            case 19:
                urm urmVar = (urm) ((g3n) this.f15305b).f76244a.f55002b;
                String strM58011d = ((l3n) urmVar.f233404c).m58011d();
                men menVar = (men) urmVar.f233405d;
                jiq jiqVar = (jiq) menVar.f142767a.f212084fq.get();
                jg31.m53271i(jiqVar);
                hg6 hg6Var = (hg6) menVar.f142768b.f169605Z5.get();
                jg31.m53271i(hg6Var);
                return new cjc0(new ucu(strM58011d, jiqVar, hg6Var, 1), s380.f205215W0);
            case 20:
                of80 of80Var = (of80) this.f15305b;
                return new cjc0(of80Var.f164668a, new da70(of80Var, 15));
            case 21:
                return new en2((f13) this.f15305b);
            case 22:
                zh80 zh80Var = (zh80) this.f15305b;
                k3n k3nVar = (k3n) zh80Var.f282832f;
                ha80 ha80Var = (ha80) zh80Var.f282833g;
                kcj0 kcj0Var = (kcj0) k3nVar.f118941a.f33427c;
                oar0 oar0Var = (oar0) ((h4t0) kcj0Var.f121501e).get();
                jen jenVar = (jen) kcj0Var.f121500d;
                eju ejuVar = (eju) jenVar.f111629b.f170025z1.get();
                jg31.m53271i(ejuVar);
                nju njuVar = new nju(ejuVar.f60295c, 10);
                otn otnVar = jenVar.f111629b;
                nc2 nc2Var = (nc2) otnVar.f169653c3.get();
                jg31.m53271i(nc2Var);
                lb5 lb5Var = new lb5(15);
                rf50 rf50Var = (rf50) otnVar.f169866p3.get();
                jg31.m53271i(rf50Var);
                return new gvt(new bjc0(new ct3(oar0Var, njuVar, nc2Var, lb5Var, rf50Var.m75422a(((l3n) kcj0Var.f121498b).m58010c(), ((bu50) kcj0Var.f121499c).f31022d), ha80Var), new yh80(zh80Var, 0)));
            case 23:
                return ((PlaylistContainsResponse) this.f15305b).m97659n().m18471o();
            case 24:
                return ((PlaylistModificationResponse) this.f15305b).m97693n();
            case 25:
                return (paq) ((C2529wd) this.f15305b).f250161b;
            case 26:
                ((j490) this.f15305b).f108623c.m63782a(bda.f26063c);
                return w2a1.f247311a;
            case 27:
                return new cjc0((dut) ((w4n) ((zqe) this.f15305b).f285375e).get(), v690.f237785f);
            case 28:
                return new C1873fu((f13) this.f15305b);
            default:
                ycc yccVar = (ycc) ((x4n) ((ol9) this.f15305b).f166794e).f258158a.f247852b;
                pgo pgoVar = ((orq) yccVar.f271453b).f168639a;
                jg31.m53271i(pgoVar);
                String strM58011d2 = ((l3n) yccVar.f271454c).m58011d();
                mys mysVar = (mys) ((mfn) yccVar.f271455d).f143099a.f169853o6.get();
                jg31.m53271i(mysVar);
                return new cjc0(new wa30(pgoVar, strM58011d2, mysVar), v690.f237786g);
        }
    }
}
