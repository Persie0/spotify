package p204p;

import android.view.View;
import android.widget.ImageView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class onz0 implements Function, gxi0, vd21, Function3, InterfaceC2207oa, orq0, ant, xt31, ov51, pqa0, l081, BiFunction, InterfaceC1667ah {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167414a;

    /* JADX INFO: renamed from: b */
    public final Object f167415b;

    public /* synthetic */ onz0(Object obj, int i) {
        this.f167414a = i;
        this.f167415b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        boolean z;
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        if (!((Boolean) obj).booleanValue() && !bool.booleanValue()) {
            hlv0 hlv0Var = (hlv0) ((he90) this.f167415b).f90385i;
            z = (!hlv0Var.f92758b.m64431n() ? true : hlv0Var.f92757a.m54963a(10) ^ true) && bool2.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @Override // p204p.vd21
    /* JADX INFO: renamed from: V */
    public void mo27465V() {
        me21 me21Var = (me21) this.f167415b;
        ParagraphView paragraphView = me21Var.f142585o;
        if (paragraphView == null) {
            wj50.m88260d0("titleView");
            throw null;
        }
        ParagraphView paragraphView2 = me21Var.f142586p;
        if (paragraphView2 == null) {
            wj50.m88260d0("subtitleView");
            throw null;
        }
        ParagraphView paragraphView3 = me21Var.f142587q;
        if (paragraphView3 == null) {
            wj50.m88260d0("trackTitleView");
            throw null;
        }
        ImageView imageView = me21Var.f142588r;
        if (imageView == null) {
            wj50.m88260d0("imageView");
            throw null;
        }
        for (View view : h6f.m46715L(paragraphView, paragraphView2, paragraphView3, imageView)) {
            view.setVisibility(0);
            view.setAlpha(me21Var.f142583m ? 0.0f : 1.0f);
        }
    }

    @Override // p204p.orq0
    /* JADX INFO: renamed from: a */
    public pfm0 mo61278a() {
        return (pfm0) ((h4t0) ((obf0) this.f167415b).f163640g).get();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((me4) this.f167415b).m61536a() && ((ihi) obj).f102296c == u300.SONGDNA_COVERS;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f167414a) {
            case 0:
                gnz0 gnz0Var = (gnz0) obj;
                pnz0 pnz0Var = (pnz0) this.f167415b;
                return ((jpx) pnz0Var.f179548d).m53978b(new C1668ai("transcript-selection-page", false, (gh00) new nnz0(gnz0Var, 0))).filter(wsq0.f254700X).map(new frv0(gnz0Var, 14)).first(new m340(7, null)).onErrorReturn(wvq0.f255562X).observeOn(pnz0Var.f179546b).doOnSuccess(new kwr0(5, gnz0Var, pnz0Var)).flatMapObservable(axq0.f20963Y);
            case 6:
                d850 d850Var = ((ox21) obj).f170841c;
                s2o s2oVar = (s2o) this.f167415b;
                return (s2oVar != null ? s2oVar.m77080Q(d850Var) : CompletableEmpty.f7437a).m23307y();
            case 7:
                return new CompletableFromAction(new jn10(25, (q831) this.f167415b, (px21) obj)).m23307y();
            case 8:
                return vjf1.m85770t(dau.f47107a, new q2y0((t621) this.f167415b, null, 27)).map(zkq0.f283806M0).onErrorReturn(alq0.f16918M0);
            case 11:
                jua0 jua0Var = (jua0) this.f167415b;
                ig7 ig7Var = jua0Var.f116064b;
                return new tua0((yzt) obj, ig7Var.f101903l, jua0Var.f116063a, ig7Var.f101904m);
            case 12:
                return new fi31(((kg31) this.f167415b).f122293a, false);
            default:
                return new ff81((qsb) obj, (yb81) this.f167415b);
        }
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: b */
    public File mo46107b() {
        return (File) ((uoa) this.f167415b).f232365e;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: c */
    public i3l mo46108c() {
        azu0 azu0Var = (azu0) ((uoa) this.f167415b).f232361a;
        if (azu0Var != null) {
            return (i3l) azu0Var.f21691c;
        }
        return null;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: d */
    public File mo46109d() {
        return (File) ((azu0) ((uoa) this.f167415b).f232361a).f21690b;
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: e */
    public void mo37400e(String str, String str2) {
        ((ky61) this.f167415b).mo53808b(h15.m46399f('E', str, str2, null));
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: f */
    public File mo46110f() {
        return (File) ((uoa) this.f167415b).f232362b;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: g */
    public File mo46111g() {
        return (File) ((uoa) this.f167415b).f232364d;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: h */
    public File mo46112h() {
        return (File) ((uoa) this.f167415b).f232366f;
    }

    /* JADX INFO: renamed from: i */
    public gn41 m67443i() {
        Integer numValueOf = Integer.valueOf(R.string.settings_item_show_followers_and_following_title);
        Integer numValueOf2 = Integer.valueOf(R.string.settings_item_show_followers_and_following_description);
        g3e.f76187x.getClass();
        return new gn41("showFollowersFollowing", numValueOf, numValueOf2, null, null, null, null, wow0.f253579N0, ((r1j) this.f167415b).m74483a(), new ue61(new ke61(43, false), new ne61(qpv0.f191387a.mo54112b(um11.class))), null, 18410);
    }

    @Override // p204p.xt31
    /* JADX INFO: renamed from: j */
    public awr mo61141j(m94 m94Var) {
        return new eg51(Observable.create(new po11((y951) ((pi6) this.f167415b).f177836d, 12)).subscribe(new s651(m94Var, 1), cz31.f43462h));
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: k */
    public void mo37402k(String str, String str2, Throwable th) {
        ((ky61) this.f167415b).mo53808b(h15.m46399f('E', str, str2, th));
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: l */
    public File mo46113l() {
        return (File) ((uoa) this.f167415b).f232363c;
    }

    @Override // p204p.orq0
    /* JADX INFO: renamed from: m */
    public r4m0 mo61282m() {
        obf0 obf0Var = (obf0) this.f167415b;
        w241 w241Var = (w241) obf0Var.f163635b;
        n6q n6qVar = (n6q) ((h4t0) obf0Var.f163638e).get();
        v241 v241Var = (v241) obf0Var.f163636c;
        doh dohVar = (doh) v241Var.f236545a.get();
        jg31.m53271i(dohVar);
        y3z0 y3z0Var = new y3z0(b2s.m27971a((s7o) obf0Var.f163639f));
        e541 e541Var = (e541) v241Var.f236547c.get();
        jg31.m53271i(e541Var);
        z9j0 z9j0Var = (z9j0) v241Var.f236548d.get();
        jg31.m53271i(z9j0Var);
        return new u241(w241Var, n6qVar, dohVar, y3z0Var, e541Var, z9j0Var, n5h1.m63737m(whr0.f251426i), (pfm0) ((h4t0) obf0Var.f163640g).get());
    }

    /* JADX INFO: renamed from: n */
    public on3 m67444n() {
        return (on3) this.f167415b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public Enum m67445o(hr01 hr01Var, ibk ibkVar) {
        gr01 gr01Var;
        if (ibkVar instanceof gr01) {
            gr01Var = (gr01) ibkVar;
            int i = gr01Var.f83595d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gr01Var.f83595d = i - Integer.MIN_VALUE;
            } else {
                gr01Var = new gr01(this, ibkVar);
            }
        } else {
            gr01Var = new gr01(this, ibkVar);
        }
        Object objM44323e = gr01Var.f83593b;
        int i2 = gr01Var.f83595d;
        if (i2 == 0) {
            bga.m29073P(objM44323e);
            gcu0 gcu0Var = (gcu0) this.f167415b;
            gr01Var.f83592a = hr01Var;
            gr01Var.f83595d = 1;
            objM44323e = gcu0Var.m44323e(gr01Var);
            yuk yukVar = yuk.f276404a;
            if (objM44323e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hr01Var = gr01Var.f83592a;
            bga.m29073P(objM44323e);
        }
        return ((Boolean) objM44323e).booleanValue() ? hr01.f94286Q0 : hr01Var;
    }

    /* JADX INFO: renamed from: p */
    public void m67446p(o2x0 o2x0Var) {
        r741 r741Var = (r741) this.f167415b;
        oa41 oa41Var = (oa41) o2x0Var.f161172b;
        if (oa41Var == null) {
            return;
        }
        oa41 oa41Var2 = r741Var.f196435d;
        if (oa41Var2 != null) {
            List<fa41> list = oa41Var2.f163209a;
            List<fa41> list2 = oa41Var.f163209a;
            if (list != null && list2 != null) {
                HashMap map = new HashMap();
                for (fa41 fa41Var : list) {
                    map.put(fa41Var.f67428c, fa41Var);
                }
                HashMap map2 = new HashMap();
                for (fa41 fa41Var2 : list2) {
                    map2.put(fa41Var2.f67428c, fa41Var2);
                }
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    fa41 fa41Var3 = (fa41) entry.getValue();
                    fa41 fa41Var4 = (fa41) map.get(str);
                    if (fa41Var4 != null && fa41Var4.f67431f) {
                        fa41Var3.f67431f = true;
                    }
                }
            }
        }
        r741Var.f196435d = oa41Var;
        r741Var.f196439h.mo46962a(w2a1.f247311a);
        try {
            oa41Var.f163210b = Long.parseLong(o2x0Var.f161171a.f149862f.m78534b("MC-TTL"));
        } catch (NumberFormatException e) {
            e.getMessage();
        }
        r741.m74886a(r741Var, oa41Var.f163210b);
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ((r7q) this.f167415b).invoke(aq81.f18141f);
        return true;
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        qsj qsjVar;
        switch (this.f167414a) {
            case 20:
                ((je51) this.f167415b).m53080a((hdn0) obj);
                break;
            default:
                ov81 ov81Var = (ov81) obj;
                hv81 hv81Var = (hv81) this.f167415b;
                hv81Var.f95621Y.setText(((bls) hv81Var.f95624b).m29783a(ov81Var.f170448c, new zks(3, 2)));
                ContentRestrictionBadgeView contentRestrictionBadgeView = hv81Var.f95632t;
                if (ov81Var.f170452g) {
                    qsjVar = qsj.f192127a;
                } else {
                    qsjVar = ov81Var.f170453h ? qsj.f192128b : qsj.f192130d;
                }
                contentRestrictionBadgeView.mo2820d(qsjVar);
                break;
        }
    }

    public onz0(toc1 toc1Var) {
        this.f167414a = 16;
        this.f167415b = new y3z0(toc1Var);
    }

    public onz0(int i) {
        this.f167414a = i;
        switch (i) {
            case 22:
                this.f167415b = new t46(8);
                break;
            default:
                this.f167415b = new on3(27);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new CompletableFromAction(new yf41(6, (ik81) this.f167415b, ik81.m50926h((PlayerState) obj, ((Boolean) obj2).booleanValue(), false)));
    }
}
