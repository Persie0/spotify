package p204p;

import android.animation.AnimatorSet;
import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.checkout.proto.model.p044v1.proto.C0508n;
import com.spotify.checkout.proto.model.p044v1.proto.C0530v0;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.p044v1.proto.SpotifyCheckoutNative;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Next;
import com.spotify.mobius.functions.Consumer;
import com.spotify.puffin.setup.setupflow.manualselect.p136ui.ManualSelectView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class abc0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abc0(int i, Object obj, Object obj2) {
        super(1);
        this.f14090a = i;
        this.f14091b = obj;
        this.f14092c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ?? r1;
        pqm0 pqm0VarM96807p;
        pqm0 pqm0VarM96807p2;
        int i = this.f14090a;
        int i2 = 24;
        int i3 = 3;
        int i4 = 1;
        int i5 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f14092c;
        Object obj3 = this.f14091b;
        switch (i) {
            case 0:
                if (((mce0) obj) == mce0.f142143a && (r1 = (qe70) ((C2655zm) obj3).f284111g) != 0) {
                    r1.invoke((k8e0) obj2);
                }
                return w2a1Var;
            case 1:
                f8z f8zVar = (f8z) obj;
                q58 q58Var = (q58) ((k0a0) obj3).f117948b;
                ManualSelectView manualSelectView = (ManualSelectView) obj2;
                if (f8zVar instanceof c8z) {
                    String str = ((c8z) f8zVar).f35336a;
                    Consumer consumer = (Consumer) q58Var.f185456b;
                    if (consumer != null) {
                        consumer.accept(new kdc0(str));
                    }
                } else if (f8zVar.equals(d8z.f46552a)) {
                    Consumer consumer2 = (Consumer) q58Var.f185456b;
                    if (consumer2 != null) {
                        consumer2.accept(new kdc0(""));
                    }
                    FindInContextView findInContextView = manualSelectView.getBinding().f47106d;
                    g8z g8zVar = manualSelectView.f6591T0;
                    EditText editText = findInContextView.f3658S0;
                    g8zVar.getClass();
                    editText.setText("");
                    findInContextView.m9621z(g8zVar.f77631a);
                    k0e1.m54966A(manualSelectView.getBinding().f47106d.f3658S0);
                    manualSelectView.getBinding().f47106d.clearFocus();
                } else if (f8zVar.equals(d8z.f46553b)) {
                    k0e1.m54966A(manualSelectView.getBinding().f47106d.f3658S0);
                    manualSelectView.getBinding().f47106d.clearFocus();
                }
                return w2a1Var;
            case 2:
                String str2 = (String) obj3;
                if (str2 != null) {
                    djq djqVar = (djq) ((eve1) ((ia70) obj2).f100166b);
                    x0h1.m89578u(n5h1.m63737m(djqVar.f49720a), null, 0, new cjq(djqVar, str2, objArr == true ? 1 : 0, i4), 3);
                }
                return w2a1Var;
            case 3:
                ((uoc0) obj3).f232386h.m72303h((u87) obj2);
                return w2a1Var;
            case 4:
                ((qrc0) obj3).f191810i.m72303h((u87) obj2);
                return w2a1Var;
            case 5:
                oi81 oi81Var = (oi81) obj;
                wf4 wf4Var = (wf4) ((n06) obj2).f148902R0;
                hmv hmvVar = (hmv) obj3;
                if (oi81Var instanceof li81) {
                    hmvVar.invoke(new bwc0(((li81) oi81Var).f133743a));
                } else if (oi81Var instanceof ki81) {
                    hmvVar.invoke(new nxc0(((ki81) oi81Var).f122882a));
                } else if (oi81Var instanceof mi81) {
                    mi81 mi81Var = (mi81) oi81Var;
                    hmvVar.invoke(new mxc0(mi81Var.f143961a, mi81Var.f143962b, mi81Var.f143963c, mi81Var.f143964d));
                } else if (!(oi81Var instanceof ji81)) {
                    if (!(oi81Var instanceof ni81)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (wf4Var.m87938I()) {
                        hmvVar.invoke(new ywc0(((ni81) oi81Var).f154206a));
                    }
                } else if (wf4Var.m87938I()) {
                    hmvVar.invoke(new hwc0(((ji81) oi81Var).f112688a));
                }
                return w2a1Var;
            case 6:
                C2065kt c2065kt = (C2065kt) obj3;
                ((vjd0) c2065kt.f126083f).f241955c = new t0c0(24, (gh00) obj2);
                return new vwt(c2065kt, 17);
            case 7:
                ArrayList<View> arrayListM65203d = nnd0.m65203d((nnd0) obj3, (ViewGroup) obj);
                mnd0 mnd0Var = (mnd0) obj2;
                AnimatorSet animatorSet = mnd0Var.f145409c;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                mnd0Var.f145409c = null;
                mnd0Var.f145410d = false;
                for (View view : arrayListM65203d) {
                    view.setAlpha(0.0f);
                    view.setTranslationY(mnd0Var.f145407a);
                }
                return w2a1Var;
            case 8:
                e6a0 e6a0Var = ((exd0) obj3).f63742a;
                q2c q2cVar = (q2c) obj2;
                q2cVar.getClass();
                wvd0 wvd0Var = (wvd0) e6a0Var.f56598b;
                lwd0 lwd0Var = (lwd0) e6a0Var.f56599c;
                luk lukVar = (luk) e6a0Var.f56600d;
                leh0 leh0Var = (leh0) e6a0Var.f56601e;
                jg31.m53271i(leh0Var);
                return new cjc0(new jxd0(wvd0Var, lwd0Var, lukVar, leh0Var, q2cVar), pvd0.f181706X);
            case 9:
                m7i0 m7i0Var = ((qxd0) obj3).f193626g.f95914a;
                m7i0Var.getClass();
                tai0 tai0Var = new tai0((Context) obj, m7i0Var.f140792j);
                tai0Var.setIdentifier("mediatrimmer-preview");
                tai0Var.setScaleType(mac1.ASPECT_FIT);
                tai0Var.setBufferingThrobberEnabled(false);
                tai0Var.setBackgroundColor(-16777216);
                ((kqi0) obj2).setValue(tai0Var);
                return tai0Var;
            case 10:
                h0e0 h0e0Var = (h0e0) obj;
                n0e0 n0e0Var = (n0e0) obj3;
                o0e0 o0e0Var = new o0e0((t0e0) obj2);
                ezs0 ezs0Var = h0e0Var.f86262c;
                String str3 = ezs0Var.f64460b;
                ro80 ro80VarM44508o = geg1.m44508o();
                un20 un20Var = ezs0Var.f64463e;
                if (un20Var != null && (pqm0VarM96807p = n0e0Var.f149037d.m96807p(un20Var)) != null) {
                    ro80VarM44508o.add(new r6z0((dut) pqm0VarM96807p.f180350a, pqm0VarM96807p.f180351b, n0e0Var.f149038e.f122237b));
                }
                ro80VarM44508o.add(new r6z0(o0e0Var, ezs0.m40402a(h0e0Var.f86262c), 0));
                return new s6z0(str3, geg1.m44506m(ro80VarM44508o), new jtb0(h0e0Var, i2));
            case 11:
                i0e0 i0e0Var = (i0e0) obj;
                ezs0 ezs0Var2 = i0e0Var.f97217c;
                String str4 = ezs0Var2.f64460b;
                f3u f3uVar = (f3u) obj3;
                w0e0 w0e0Var = (w0e0) obj2;
                ro80 ro80VarM44508o2 = geg1.m44508o();
                un20 un20Var2 = ezs0Var2.f64463e;
                if (un20Var2 != null && (pqm0VarM96807p2 = w0e0Var.f246711e.m96807p(un20Var2)) != null) {
                    ro80VarM44508o2.add(new r6z0((dut) pqm0VarM96807p2.f180350a, pqm0VarM96807p2.f180351b, w0e0Var.f246712f.f122237b));
                }
                ro80VarM44508o2.add(new r6z0(f3uVar, ezs0.m40402a(i0e0Var.f97217c), 0));
                return new s6z0(str4, geg1.m44506m(ro80VarM44508o2), new jtb0(i0e0Var, 26));
            case 12:
                vqg1.m86218C((VideoSurfaceView) obj, (m5r0) obj3, ((fv41) obj2).f73651c);
                return w2a1Var;
            case 13:
                mpz0 mpz0Var = (mpz0) obj;
                x2e0 x2e0Var = ((u2e0) obj3).f226080f;
                String strM43753y0 = g6f.m43753y0(bk5.m29582E0(new String[]{x2e0Var != null ? x2e0Var.getText() : null, (String) obj2}), ", ", null, null, null, 62);
                if (!wl51.m88460J0(strM43753y0)) {
                    jpz0.m54000n(mpz0Var, strM43753y0);
                }
                return w2a1Var;
            case 14:
                vqg1.m86218C((VideoSurfaceView) obj, (v5r0) obj3, ((fv41) obj2).f73651c);
                return w2a1Var;
            case 15:
                return d7e0.m35196b((d7e0) obj3, (r6e0) obj, (x6e0) obj2);
            case 16:
                return d7e0.m35196b((d7e0) obj3, (r6e0) obj, new w96((j7e0) obj2));
            case 17:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
                videoSurfaceView.setVideoSurfaceCallback((lmh0) obj3);
                ((gh00) obj2).invoke(videoSurfaceView);
                return videoSurfaceView;
            case 18:
                ((ebc0) obj3).invoke(((URLSpan) obj2).getURL());
                return w2a1Var;
            case 19:
                ((vve0) obj3).m86456a((List) obj2);
                return w2a1Var;
            case 20:
                ((icp) obj).f100858d = new ls8((gfi0) obj3, (hy21) obj2, null);
                return w2a1Var;
            case 21:
                s5o0 s5o0Var = (s5o0) obj;
                t5o0 t5o0Var = (t5o0) obj3;
                s5o0Var.m77294i(t5o0Var, 0, 0, 0.0f);
                s5o0Var.m77294i((t5o0) obj2, 0, t5o0Var.f217323b, 0.0f);
                return w2a1Var;
            case 22:
                vxx vxxVar = (vxx) obj3;
                x0h1.m89578u(n5h1.m63737m((m500) vxxVar.f245849b), (luk) vxxVar.f245853f, 0, new aab0(vxxVar, (String) obj2, (d850) obj, null, 28), 2);
                return w2a1Var;
            case 23:
                pts ptsVar = (pts) obj3;
                x0h1.m89578u(kk40.m56661c((luk) ptsVar.f181249c), null, 0, new tpf0(ptsVar, (String) obj2, (d850) obj, null, 0), 3);
                return w2a1Var;
            case 24:
                fni0 fni0Var = (fni0) obj3;
                return new vjz(g0g1.m43301f((be11) fni0Var.f71305d, (be11) fni0Var.f71306e, fni0Var.f71303b, ((z6g0) ((li0) obj2).f133683e).f279870a, new dwf0((zvf0) obj, null)), new yzb0(i3, i5, objArr2 == true ? 1 : 0), 2);
            case 25:
                ((icp) obj).f100858d = new ewf0((fni0) obj3, (ww0) obj2, null);
                return w2a1Var;
            case 26:
                uw70 uw70Var = (uw70) obj;
                oq51 oq51Var = (oq51) obj3;
                if (oq51Var.f168082a) {
                    uw70.m84091c(uw70Var, "custom", new fyf(new x7e0(oq51Var, 28), true, 1398107899), 2);
                }
                List list = (List) obj2;
                uw70Var.mo30902e(list.size(), new xyf0(i4, list), new xyf0(i5, list), new fyf(new ee1(list, oq51Var, list, 16), true, 802480018));
                return w2a1Var;
            case 27:
                return (Next) ((mmh0) obj3).f145152d.invoke(obj2, obj);
            case 28:
                lqh0 lqh0Var = lqh0.f136051a;
                C0530v0 c0530v0M6327O = SpotifyCheckoutNative.m6327O(lqh0.m59761b((RetrofitMaker) obj3, (hv31) obj2).mo26814c(GetSpotifyCheckoutPageRequest.m6205p()).blockingGet().m6218x());
                c0530v0M6327O.m6668s(vqh0.m86252d(0, 10, false));
                SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) c0530v0M6327O.build();
                C0508n c0508nM6052E = GetCheckoutPageResponse.m6052E();
                c0508nM6052E.m6623v(spotifyCheckoutNative);
                return (GetCheckoutPageResponse) c0508nM6052E.build();
            default:
                rxh0 rxh0Var = (rxh0) obj3;
                Object objM47202r = hdg1.m47202r(rxh0Var.f203601a, (Map) obj);
                if (!objM47202r.equals(rxh0Var.f203603c)) {
                    rxh0Var.f203603c = objM47202r;
                    ((Connection) obj2).accept(objM47202r);
                }
                return w2a1Var;
        }
    }
}
