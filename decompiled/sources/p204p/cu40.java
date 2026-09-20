package p204p;

import com.spotify.music.R;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class cu40 {

    /* JADX INFO: renamed from: l */
    public static final long f42035l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f42036m = 0;

    /* JADX INFO: renamed from: a */
    public final hu2 f42037a;

    /* JADX INFO: renamed from: b */
    public final el2 f42038b;

    /* JADX INFO: renamed from: c */
    public final wyy0 f42039c;

    /* JADX INFO: renamed from: d */
    public final wt80 f42040d;

    /* JADX INFO: renamed from: e */
    public final wek0 f42041e;

    /* JADX INFO: renamed from: f */
    public final q831 f42042f;

    /* JADX INFO: renamed from: g */
    public final y64 f42043g;

    /* JADX INFO: renamed from: h */
    public String f42044h;

    /* JADX INFO: renamed from: i */
    public String f42045i;

    /* JADX INFO: renamed from: j */
    public final c9k f42046j;

    /* JADX INFO: renamed from: k */
    public final zv41 f42047k = jag1.m52819d(Boolean.FALSE);

    static {
        hvi0 hvi0Var = cks.f39079b;
        f42035l = jwg1.m54449D(15, ils.SECONDS);
    }

    public cu40(hu2 hu2Var, el2 el2Var, wyy0 wyy0Var, wt80 wt80Var, wek0 wek0Var, q831 q831Var, xre xreVar, y64 y64Var, luk lukVar) {
        this.f42037a = hu2Var;
        this.f42038b = el2Var;
        this.f42039c = wyy0Var;
        this.f42040d = wt80Var;
        this.f42041e = wek0Var;
        this.f42042f = q831Var;
        this.f42043g = y64Var;
        this.f42046j = p3n0.m69075f(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m33857a(cu40 cu40Var, String str, String str2, String str3, d850 d850Var, ibk ibkVar) {
        zt40 zt40Var;
        if (ibkVar instanceof zt40) {
            zt40Var = (zt40) ibkVar;
            int i = zt40Var.f286055e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zt40Var.f286055e = i - Integer.MIN_VALUE;
            } else {
                zt40Var = new zt40(cu40Var, ibkVar);
            }
        } else {
            zt40Var = new zt40(cu40Var, ibkVar);
        }
        Object objM86755t = zt40Var.f286053c;
        int i2 = zt40Var.f286055e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            voc1 voc1VarM83614b = xoc1.f264174r.m83614b(str);
            yab yabVarM54985d = k0e1.m54985d(Observable.create(new pgq0(13, cu40Var.f42037a, (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) ? new ps2(rsf1.m76330k(str), voc1VarM83614b) : new qs2(str2, str3, voc1VarM83614b))).onErrorReturn(s0o0.f204462f));
            zt40Var.f286051a = str;
            zt40Var.f286052b = d850Var;
            zt40Var.f286055e = 1;
            objM86755t = vyf1.m86755t(yabVarM54985d, zt40Var);
            if (objM86755t != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return w2a1Var;
        }
        d850Var = zt40Var.f286052b;
        str = zt40Var.f286051a;
        bga.m29073P(objM86755t);
        us2 us2Var = (us2) objM86755t;
        if (!(us2Var instanceof ts2)) {
            if (!(us2Var instanceof ss2)) {
                throw new NoWhenBranchMatchedException();
            }
            cu40Var.m33861e();
            return w2a1Var;
        }
        cu40Var.f42044h = str;
        String str4 = ((ts2) us2Var).f223189a;
        cu40Var.f42045i = str4;
        zt40Var.f286051a = null;
        zt40Var.f286052b = null;
        zt40Var.f286055e = 2;
        return cu40Var.m33860d(str4, d850Var, zt40Var) == obj ? obj : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m33858b(cu40 cu40Var, String str, d850 d850Var, ibk ibkVar) {
        au40 au40Var;
        String str2;
        km2 km2Var;
        if (ibkVar instanceof au40) {
            au40Var = (au40) ibkVar;
            int i = au40Var.f19840e;
            if ((i & Integer.MIN_VALUE) != 0) {
                au40Var.f19840e = i - Integer.MIN_VALUE;
            } else {
                au40Var = new au40(cu40Var, ibkVar);
            }
        } else {
            au40Var = new au40(cu40Var, ibkVar);
        }
        au40 au40Var2 = au40Var;
        Object objM70240a = au40Var2.f19838c;
        int i2 = au40Var2.f19840e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM70240a);
            String strM76330k = rsf1.m76330k(str);
            el2 el2Var = cu40Var.f42038b;
            bn2 bn2Var = new bn2(strM76330k, null);
            au40Var2.f19836a = str;
            au40Var2.f19837b = d850Var;
            au40Var2.f19840e = 1;
            objM70240a = ((pl2) el2Var).m70240a(bn2Var, "chat-mvp", false, null, au40Var2);
            if (objM70240a != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM70240a);
            return w2a1Var;
        }
        d850Var = au40Var2.f19837b;
        str = au40Var2.f19836a;
        bga.m29073P(objM70240a);
        dl2 dl2Var = ((zl2) objM70240a).f283894b;
        if (dl2Var != null) {
            Iterator it = dl2Var.f50093b.iterator();
            do {
                if (!it.hasNext()) {
                    km2Var = null;
                    break;
                }
                km2Var = ((cl2) it.next()).f39153a;
            } while (km2Var == null);
            if (km2Var != null) {
                str2 = km2Var.f124032a;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            cu40Var.m33861e();
            return w2a1Var;
        }
        cu40Var.f42044h = str;
        cu40Var.f42045i = str2;
        au40Var2.f19836a = null;
        au40Var2.f19837b = null;
        au40Var2.f19840e = 2;
        return cu40Var.m33860d(str2, d850Var, au40Var2) == obj ? obj : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m33859c(String str, ibk ibkVar) {
        yt40 yt40Var;
        if (ibkVar instanceof yt40) {
            yt40Var = (yt40) ibkVar;
            int i = yt40Var.f275960c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yt40Var.f275960c = i - Integer.MIN_VALUE;
            } else {
                yt40Var = new yt40(this, ibkVar);
            }
        } else {
            yt40Var = new yt40(this, ibkVar);
        }
        Object objM76981v = yt40Var.f275958a;
        int i2 = yt40Var.f275960c;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            f620 f620Var = new f620(this, str, null, 20);
            yt40Var.f275960c = 1;
            objM76981v = s1h1.m76981v(f42035l, f620Var, yt40Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        return Boolean.valueOf(wj50.m88271j(objM76981v, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x015f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m33860d(String str, d850 d850Var, ibk ibkVar) {
        bu40 bu40Var;
        String str2;
        d850 d850Var2;
        Single singleJust;
        d850 d850Var3;
        if (ibkVar instanceof bu40) {
            bu40Var = (bu40) ibkVar;
            int i = bu40Var.f31015e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bu40Var.f31015e = i - Integer.MIN_VALUE;
            } else {
                bu40Var = new bu40(this, ibkVar);
            }
        } else {
            bu40Var = new bu40(this, ibkVar);
        }
        Object objM96567o = bu40Var.f31013c;
        int i2 = bu40Var.f31015e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            bu40Var.f31011a = str;
            bu40Var.f31012b = d850Var;
            bu40Var.f31015e = 1;
            Object objM33859c = m33859c(str, bu40Var);
            if (objM33859c != obj) {
                str2 = str;
                d850Var2 = d850Var;
                objM96567o = objM33859c;
            }
            return obj;
        }
        if (i2 == 1) {
            d850 d850Var4 = bu40Var.f31012b;
            String str3 = bu40Var.f31011a;
            bga.m29073P(objM96567o);
            d850Var2 = d850Var4;
            str2 = str3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850Var3 = bu40Var.f31012b;
            bga.m29073P(objM96567o);
        }
        if (!((Boolean) objM96567o).booleanValue()) {
            m33861e();
            return w2a1Var;
        }
        if (d850Var3 != null) {
            wek0.m87886e(this.f42041e, d850Var3);
        }
        return w2a1Var;
        if (!((Boolean) objM96567o).booleanValue()) {
            m33861e();
            return w2a1Var;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        wyy0 wyy0Var = this.f42039c;
        lwr lwrVar = wyy0Var.f256404d;
        if (tgv.m80789j(str2) || tgv.m80781b(str2)) {
            List<ContextPage> listSingletonList = Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder(str2).build())).build());
            scm0 scm0Var = wyy0Var.f256403c;
            String str4 = scm0Var.m77806a().f197896c;
            mec0 mec0Var = new mec0();
            if (str4.length() > 0) {
                mec0Var.put(Context.Metadata.KEY_CONTEXT_DESCRIPTION, str4);
            }
            d850 d850Var5 = d850Var2;
            d850Var2 = d850Var5;
            lwrVar.m60127a(wyy0Var.f256401a.m83821a(wyy0Var.m89386c(Context.builder(scm0Var.m77806a().f197897d).pages(listSingletonList).metadata(mec0Var.m61540b()).build(), d850Var5, jCurrentTimeMillis, PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str2).build()).playerOptionsOverride(PlayerOptionOverrides.builder().modes(nau.f152117a).build()).build())).onErrorReturn(new djs0(wyy0Var, 25)).subscribe());
            singleJust = Single.just(Boolean.TRUE);
        } else {
            lwrVar.m60127a(wyy0Var.f256408h.m80992a(str2).flatMap(new tyy0(str2, wyy0Var, d850Var2, jCurrentTimeMillis)).onErrorReturn(new rwt0(wyy0Var, 18)).subscribe());
            singleJust = Single.just(Boolean.TRUE);
            wj50.m88279p(singleJust);
        }
        bu40Var.f31011a = null;
        bu40Var.f31012b = d850Var2;
        bu40Var.f31015e = 2;
        objM96567o = zn91.m96567o(singleJust, bu40Var);
        if (objM96567o != obj) {
            d850Var3 = d850Var2;
            if (!((Boolean) objM96567o).booleanValue()) {
                m33861e();
                return w2a1Var;
            }
            if (d850Var3 != null) {
                wek0.m87886e(this.f42041e, d850Var3);
            }
            return w2a1Var;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final void m33861e() {
        Integer numValueOf = Integer.valueOf(R.string.instant_mix_error_message);
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        na6.m63963k(true, "Invalid resource ID provided: %s", null);
        g631 g631Var = new g631(null, "", numValueOf, null, null, null, null, null, false);
        q831 q831Var = this.f42042f;
        if (q831Var.m72301f()) {
            q831Var.m72305j(g631Var);
        } else {
            q831Var.m72307m(g631Var);
        }
    }
}
