package p204p;

import android.view.View;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fwv0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f74186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwv0(int i, Object obj, Object obj2) {
        super(0);
        this.f74184a = i;
        this.f74185b = obj;
        this.f74186c = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [p.eh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        String str;
        int i = this.f74184a;
        boolean z = false;
        int i2 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f74186c;
        Object obj2 = this.f74185b;
        switch (i) {
            case 0:
                qwn0 qwn0Var = ((gwv0) obj2).f85113c;
                xf40 xf40VarMetadata = ((ContextTrack) ((PlayerState) obj).track().mo49278b()).metadata();
                if (xf40VarMetadata == null || (str = (String) xf40VarMetadata.get("image_xlarge_url")) == null) {
                    str = "";
                }
                ((rwn0) qwn0Var).m76573b(pwn0.BACK_SKIP_BUTTON, str);
                return w2a1Var;
            case 1:
                ((gh00) obj2).invoke(new ywv0(((zwv0) ((bxv0) obj)).f287099a));
                return w2a1Var;
            case 2:
                ((gh00) obj2).invoke(new fxv0(((gxv0) obj).f85344a));
                return w2a1Var;
            case 3:
                v6w0 v6w0Var = ((it41) obj).f105421a;
                b5w0 b5w0Var = (b5w0) obj2;
                wpi0 wpi0Var = joc1.f114387a;
                C1741ch c1741ch = b5w0Var.f23766Z;
                j5w0 j5w0Var = b5w0Var.f23769b;
                b5w0.m28210b(b5w0Var, c1741ch != null ? c1741ch.f37858c.f96307t : null, j5w0Var.mo52490m(v6w0Var.f237979a));
                C1741ch c1741ch2 = b5w0Var.f23751M0;
                b5w0.m28210b(b5w0Var, c1741ch2 != null ? c1741ch2.f37858c.f96307t : null, j5w0Var.mo52485d(v6w0Var.f237979a));
                C1741ch c1741ch3 = b5w0Var.f23752N0;
                b5w0.m28210b(b5w0Var, c1741ch3 != null ? c1741ch3.f37858c.f96307t : null, j5w0Var.mo52488k(v6w0Var.f237979a));
                C1741ch c1741ch4 = b5w0Var.f23753O0;
                b5w0.m28210b(b5w0Var, c1741ch4 != null ? c1741ch4.f37858c.f96307t : null, j5w0Var.mo52497y(v6w0Var.f237979a));
                C1741ch c1741ch5 = b5w0Var.f23754P0;
                b5w0.m28210b(b5w0Var, c1741ch5 != null ? c1741ch5.f37858c.f96307t : null, j5w0Var.mo52491q(v6w0Var.f237979a));
                hxt hxtVar = b5w0Var.f23756R0;
                b5w0.m28210b(b5w0Var, hxtVar != null ? hxtVar.f96307t : null, j5w0Var.mo52486e(v6w0Var.f237979a));
                hxt hxtVar2 = b5w0Var.f23757S0;
                b5w0.m28210b(b5w0Var, hxtVar2 != null ? hxtVar2.f96307t : null, j5w0Var.mo52486e(v6w0Var.f237979a));
                return w2a1Var;
            case 4:
                p2o p2oVar = (p2o) obj2;
                Consumer consumer = ((h8w0) obj).f88820c.f217915S0;
                if (consumer == null) {
                    wj50.m88260d0("mobiusOutput");
                    throw null;
                }
                wfx wfxVar = new wfx(consumer, 5);
                eju ejuVar = (eju) ((a8w0) ((s2o) p2oVar.f173372a.f171807c).f205040g).f13401f.get();
                jg31.m53271i(ejuVar);
                return new h5z(new fju(ejuVar.f60295c, i2), wfxVar);
            case 5:
                ((gh00) obj2).invoke(new icw0(((fdw0) obj).f68586e));
                return w2a1Var;
            case 6:
                mzp0.m63257c((mzp0) obj2, new jzp0((hku) obj, 3));
                return w2a1Var;
            case 7:
                mzp0.m63257c((mzp0) obj2, new kzp0((lh10) obj, 3));
                return w2a1Var;
            case 8:
                kqi0 kqi0Var = (kqi0) obj;
                if (!wj50.m88271j((String) kqi0Var.getValue(), ((ujw0) obj2).f231169b) && !wl51.m88460J0((String) kqi0Var.getValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return Boolean.valueOf(wj50.m88271j(obj2, ((ulw0) obj).f231666l.getValue()));
            case 10:
                ((gh00) obj2).invoke(new ffb0((zgb0) obj));
                return w2a1Var;
            case 11:
                WebView webView = (WebView) obj2;
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    ((eh00) obj).invoke();
                }
                return w2a1Var;
            case 12:
                j8x0 j8x0Var = (j8x0) obj2;
                kv91 kv91Var = j8x0Var.f110041h;
                yt91 yt91VarM96903c = ((xlg0) obj).f263144b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                j8x0Var.f110036c.mo47345e();
                return w2a1Var;
            case 13:
                ((kqi0) obj).setValue(((huh0) obj2).f95412b);
                return w2a1Var;
            case 14:
                y9r0 y9r0Var = (y9r0) obj2;
                if (y9r0Var != null && y9r0Var.m93159b(1)) {
                    ((gh00) obj).invoke(r2c1.f195126a);
                }
                return w2a1Var;
            case 15:
                ((gh00) obj2).invoke(new rlx0(((wlx0) obj).f252638a.f251745a, System.currentTimeMillis()));
                return w2a1Var;
            case 16:
                ((nlv0) obj2).f155174a = false;
                ((eh00) obj).invoke();
                return w2a1Var;
            case 17:
                ((m500) ((mc7) obj2).f142084b).f31643a.mo31988d((v6e) obj);
                return w2a1Var;
            case 18:
                ((gh00) obj2).invoke(new m4y0(((o4y0) ((q4y0) obj)).f161805d));
                return w2a1Var;
            case 19:
                View view = (View) obj2;
                return view.getResources().getConfiguration().getLayoutDirection() == 1 ? Float.valueOf(-(view.getX() + view.getWidth())) : Float.valueOf(((Number) ((qe70) obj).invoke()).floatValue() - view.getX());
            case 20:
                return (f0k) ((edd1) obj2).invoke(((tgy0) obj).f220292b);
            case 21:
                int i3 = ev31.f63134h;
                return new dv31(((vgy0) ((xgy0) obj2)).f241339a.f74287b.getValue(), ((vgy0) ((xgy0) obj)).f241339a.f74287b.getValue());
            case 22:
                ((zv41) ((ykn) obj2).f273764t).m97090l(((ppy0) ((rpy0) obj)).f180145a);
                return w2a1Var;
            case 23:
                ykn yknVar = (ykn) obj;
                return ((u5o) obj2).m82416a((noa0) yknVar.f273762h, (zv41) yknVar.f273764t).m76492e();
            case 24:
                RecyclerView recyclerView = (RecyclerView) ((s18) obj2).f204623e;
                List list = ((upy0) obj).f232844b;
                hjv0 adapter = recyclerView.getAdapter();
                if (adapter != null && adapter.mo1617e() == list.size()) {
                    if (list.isEmpty()) {
                        z = true;
                    } else if (recyclerView.getChildCount() > 0 && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                vtg1.m86384k((l971) obj2);
                ((eh00) obj).invoke();
                return w2a1Var;
            case 26:
                jxy0 jxy0Var = (jxy0) obj2;
                if (jxy0Var != null) {
                    ixy0 ixy0Var = (ixy0) obj;
                    if (hbg1.m47046q(ixy0Var.f106794g, jxy0Var, ixy0Var.f106791d, ixy0Var.f106796i)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                return fmd0.m42086p((vbg1) obj2, (d850) obj);
            case 28:
                qbm0 qbm0Var = (qbm0) obj;
                ((f4z0) obj2).getClass();
                return new rcm0(qbm0Var.f187117a, qbm0Var.f187118b.f36166c, qbm0Var.f187119c);
            default:
                ((xoi0) obj2).mo33104m((ci20) obj);
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fwv0(View view, eh00 eh00Var) {
        super(0);
        this.f74184a = 19;
        this.f74185b = view;
        this.f74186c = (qe70) eh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwv0(xre xreVar, gh00 gh00Var, wlx0 wlx0Var) {
        super(0);
        this.f74184a = 15;
        this.f74185b = gh00Var;
        this.f74186c = wlx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwv0(fmd0 fmd0Var, vbg1 vbg1Var, d850 d850Var) {
        super(0);
        this.f74184a = 27;
        this.f74185b = vbg1Var;
        this.f74186c = d850Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwv0(xgy0 xgy0Var, xgy0 xgy0Var2) {
        super(0);
        this.f74184a = 21;
        int i = ev31.f63134h;
        this.f74185b = xgy0Var;
        this.f74186c = xgy0Var2;
    }
}
