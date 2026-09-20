package p204p;

import android.os.Bundle;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class ftc0 implements dfo {

    /* JADX INFO: renamed from: Q0 */
    public static final tjo f73164Q0 = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(v140.class)), 1, xfc0.f260906V0, new pko(xfc0.f260903S0), xfc0.f260907W0), xfc0.f260904T0);

    /* JADX INFO: renamed from: M0 */
    public final xiz f73166M0;

    /* JADX INFO: renamed from: N0 */
    public final ns5 f73167N0;

    /* JADX INFO: renamed from: O0 */
    public final i5x f73168O0;

    /* JADX INFO: renamed from: P0 */
    public final cph f73169P0;

    /* JADX INFO: renamed from: X */
    public final hzq0 f73170X;

    /* JADX INFO: renamed from: Y */
    public final pgo f73171Y;

    /* JADX INFO: renamed from: a */
    public final uvc f73173a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f73174b;

    /* JADX INFO: renamed from: c */
    public final wf4 f73175c;

    /* JADX INFO: renamed from: d */
    public final jan f73176d;

    /* JADX INFO: renamed from: e */
    public final p8p0 f73177e;

    /* JADX INFO: renamed from: f */
    public final ry31 f73178f;

    /* JADX INFO: renamed from: g */
    public final w47 f73179g;

    /* JADX INFO: renamed from: h */
    public final tw60 f73180h;

    /* JADX INFO: renamed from: i */
    public final aj2 f73181i;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2609yd f73182t;

    /* JADX INFO: renamed from: Z */
    public final bqa f73172Z = xtm0.m92080a(-2, 0, 6);

    /* JADX INFO: renamed from: L0 */
    public final lsi0 f73165L0 = msi0.m62770a();

    public ftc0(uvc uvcVar, k5m0 k5m0Var, Flowable flowable, wf4 wf4Var, jan janVar, p8p0 p8p0Var, ry31 ry31Var, w47 w47Var, tw60 tw60Var, aj2 aj2Var, InterfaceC2609yd interfaceC2609yd, hzq0 hzq0Var, pgo pgoVar) {
        this.f73173a = uvcVar;
        this.f73174b = k5m0Var;
        this.f73175c = wf4Var;
        this.f73176d = janVar;
        this.f73177e = p8p0Var;
        this.f73178f = ry31Var;
        this.f73179g = w47Var;
        this.f73180h = tw60Var;
        this.f73181i = aj2Var;
        this.f73182t = interfaceC2609yd;
        this.f73170X = hzq0Var;
        this.f73171Y = pgoVar;
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f73166M0 = axf1.m27397l(xtm0.m92074U(mvl0.m62953p(new sw0(new onc(flowable), 29)), new g3c0((fbk) null, this, 2)), xfc0.f260905U0, dtc0.f52787b, null, new b6b0(this, 25), 8);
        this.f73167N0 = ns5.f157674l;
        this.f73168O0 = mhf1.m61771p(this).m94133b(n0c0.f148986U0, new yhb0(this, 11));
        fyf fyfVar = new fyf(new eoa0(this, 19), true, -1859278342);
        wpi0 wpi0Var = xwt.f266743a;
        this.f73169P0 = new cph(fyfVar, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m42593f(ftc0 ftc0Var, qwt qwtVar, wsc0 wsc0Var, boolean z, th00 th00Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        th00 th00Var2;
        ftc0 ftc0Var2;
        String strM12k;
        String strM12k2;
        String strM12k3;
        AbstractC2524w8 abstractC2524w8M67566p;
        Object q0a0Var;
        kqi0 kqi0Var;
        boolean z2;
        boolean z3;
        int i3;
        kqi0 kqi0Var2;
        j6i0 j6i0Var;
        cxh0 cxh0Var;
        fxh0 fxh0VarM47247x;
        xq00 xq00Var2 = xq00Var;
        wf4 wf4Var = ftc0Var.f73175c;
        InterfaceC2609yd interfaceC2609yd = ftc0Var.f73182t;
        xq00Var2.m91775k0(-101180710);
        if ((i & 48) == 0) {
            i2 = (xq00Var2.m91770i(wsc0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            th00Var2 = th00Var;
            i2 |= xq00Var2.m91770i(th00Var2) ? 2048 : 1024;
        } else {
            th00Var2 = th00Var;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var2.m91770i(ftc0Var) ? 131072 : 65536;
        }
        int i4 = i2;
        if (xq00Var2.m91752Y(i4 & 1, (74897 & i4) != 74896)) {
            String str = wsc0Var.f254586b;
            gtc0 gtc0Var = wsc0Var.f254589e;
            fbk fbkVar = null;
            if (!ftc0Var.m42595h()) {
                gtc0Var = null;
            }
            if (gtc0Var != null) {
                xq00Var2.m91771i0(805799216);
                xq00Var2.m91788r(false);
                abstractC2524w8M67566p = opo.m67566p(gtc0Var.f84136a);
            } else if (wsc0Var.f254587c) {
                xq00Var2.m91771i0(805802679);
                abstractC2524w8M67566p = opo.m67566p(k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_01, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_02, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_03, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_04, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_05, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_06, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_07, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_08, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_09, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_podcast_hint_10, xq00Var2));
                xq00Var2.m91788r(false);
            } else if (wsc0Var.f254588d) {
                xq00Var2.m91771i0(805829173);
                abstractC2524w8M67566p = opo.m67566p(k0e1.m54977L(R.string.martini_chat_entry_card_audiobook_hint_01, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_audiobook_hint_02, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_audiobook_hint_03, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_audiobook_hint_04, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_audiobook_hint_05, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_audiobook_hint_07, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_header_audiobook, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_11, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_header_generic, xq00Var2));
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-788348746);
                if (str != null) {
                    xq00Var2.m91771i0(805854319);
                    strM12k = k0e1.m54978M(R.string.martini_chat_entry_card_music_hint_01, new Object[]{str}, xq00Var2);
                    xq00Var2.m91788r(false);
                } else {
                    strM12k = AbstractC0000a.m12k(xq00Var2, 805857227, R.string.martini_chat_entry_card_music_hint_01_fallback, xq00Var2, false);
                }
                String str2 = strM12k;
                if (str != null) {
                    xq00Var2.m91771i0(805861711);
                    strM12k2 = k0e1.m54978M(R.string.martini_chat_entry_card_music_hint_07, new Object[]{str}, xq00Var2);
                    xq00Var2.m91788r(false);
                } else {
                    strM12k2 = AbstractC0000a.m12k(xq00Var2, 805864619, R.string.martini_chat_entry_card_music_hint_07_fallback, xq00Var2, false);
                }
                String str3 = strM12k2;
                if (str != null) {
                    xq00Var2.m91771i0(805869103);
                    strM12k3 = k0e1.m54978M(R.string.martini_chat_entry_card_music_hint_10, new Object[]{str}, xq00Var2);
                    xq00Var2.m91788r(false);
                } else {
                    strM12k3 = AbstractC0000a.m12k(xq00Var2, 805872011, R.string.martini_chat_entry_card_music_hint_10_fallback, xq00Var2, false);
                }
                abstractC2524w8M67566p = opo.m67566p(str2, k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_02, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_03, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_04, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_05, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_06, xq00Var2), str3, k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_08, xq00Var2), k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_09, xq00Var2), strM12k3, k0e1.m54977L(R.string.martini_chat_entry_card_music_hint_11, xq00Var2));
                xq00Var2.m91788r(false);
            }
            if (!interfaceC2609yd.mo76359a(5)) {
                abstractC2524w8M67566p = opo.m67566p(g6f.m43741q0(abstractC2524w8M67566p));
            }
            AbstractC2524w8 abstractC2524w8 = abstractC2524w8M67566p;
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(g6f.m43745s0(abstractC2524w8));
                xq00Var2.m91793t0(objM91750T);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T;
            boolean zM87967y = wf4Var.m87967y();
            boolean zMo76359a = interfaceC2609yd.mo76359a(6);
            boolean z4 = (i4 & 896) == 256;
            Object objM91750T2 = xq00Var2.m91750T();
            f6i0 f6i0Var = f6i0.f66415a;
            if (z4 || objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B(f6i0Var);
                xq00Var2.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var4 = (kqi0) objM91750T2;
            kqi0 kqi0VarM77651H = sam.m77651H(abstractC2524w8, xq00Var2);
            kqi0 kqi0VarM77651H2 = sam.m77651H(gh00Var, xq00Var);
            Object objM91750T3 = xq00Var2.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77645B(null);
                xq00Var2.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var5 = (kqi0) objM91750T3;
            boolean zM91770i = xq00Var2.m91770i(ftc0Var) | ((i4 & 7168) == 2048) | xq00Var2.m91770i(kqi0Var5);
            Object objM91750T4 = xq00Var2.m91750T();
            if (zM91770i || objM91750T4 == ia7Var) {
                kqi0Var = kqi0Var4;
                q0a0Var = new q0a0(ftc0Var, th00Var2, kqi0Var5, fbkVar, 11);
                xq00Var2.m91793t0(q0a0Var);
            } else {
                kqi0Var = kqi0Var4;
                q0a0Var = objM91750T4;
            }
            w2a1 w2a1Var = w2a1.f247311a;
            hz40.m49237i(w2a1Var, (th00) q0a0Var, xq00Var2);
            gtc1 gtc1Var = new gtc1(leu.m58815a(xq00Var2).f112823a.f229875b.f123093a, 0.0f, 0.0f, null, 30);
            if (z) {
                xq00Var2.m91771i0(793830133);
                Object objM91750T5 = xq00Var2.m91750T();
                if (objM91750T5 == ia7Var) {
                    z2 = zM87967y;
                    z3 = zMo76359a;
                    i3 = 16384;
                    kqi0Var2 = kqi0Var3;
                    ftc0Var2 = ftc0Var;
                    objM91750T5 = ftc0Var.f73176d.m52846a(ftc0Var.f73177e, ftc0Var.f73178f.mo43021a(ftc0Var.f73179g), new pcb(kqi0Var5, kqi0VarM77651H, ftc0Var, z2, z3, kqi0VarM77651H2, kqi0Var3), new esc0(kqi0VarM77651H2, 4), new esc0(kqi0Var, 5), (4000 & 32) != 0 ? null : null, gtc1Var, (4000 & 128) != 0 ? cxh0.f43038a : null, false, sfe0.f208551S0, (4000 & 1024) != 0 ? sfe0.f208552T0 : null, (4000 & 2048) != 0 ? null : null);
                    xq00Var2.m91793t0(objM91750T5);
                } else {
                    z2 = zM87967y;
                    z3 = zMo76359a;
                    i3 = 16384;
                    ftc0Var2 = ftc0Var;
                    kqi0Var2 = kqi0Var3;
                }
                j6i0Var = (j6i0) objM91750T5;
                xq00Var2.m91788r(false);
            } else {
                w2a1Var = w2a1Var;
                i4 = i4;
                z2 = zM87967y;
                z3 = zMo76359a;
                i3 = 16384;
                ftc0Var2 = ftc0Var;
                kqi0Var2 = kqi0Var3;
                xq00Var2.m91771i0(795208114);
                xq00Var2.m91788r(false);
                j6i0Var = null;
            }
            f6i0 f6i0Var2 = (f6i0) kqi0Var.getValue();
            cxh0 cxh0Var2 = cxh0.f43038a;
            if (f6i0Var2 == f6i0Var) {
                xq00Var2.m91771i0(795324240);
                boolean zM91770i2 = xq00Var2.m91770i(ftc0Var2) | xq00Var2.m91770i(kqi0Var2) | ((i4 & 57344) == i3);
                Object objM91750T6 = xq00Var2.m91750T();
                if (zM91770i2 || objM91750T6 == ia7Var) {
                    objM91750T6 = new k380(ftc0Var2, kqi0Var2, gh00Var, 11);
                    xq00Var2.m91793t0(objM91750T6);
                }
                fxh0VarM47247x = hdi.m47247x(cxh0Var2, false, null, null, null, (eh00) objM91750T6, 15);
                cxh0Var = cxh0Var2;
                xq00Var2.m91788r(false);
            } else {
                cxh0Var = cxh0Var2;
                xq00Var2.m91771i0(795600078);
                xq00Var2.m91788r(false);
                fxh0VarM47247x = cxh0Var;
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("MartiniChatEntryCard.Card", zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224763f, nec.m64246i(mi21.m61822f(1.0f, cxh0Var), ((giu) iiu.f102631a.f258039d).f80259c, hmx0.m47993b(16)).mo34315F(fxh0VarM47247x)));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            if (j6i0Var != null) {
                xq00Var2.m91771i0(1103695242);
                mif1.m61869b(j6i0Var, w2a1Var, null, null, xq00Var2, 48, 12);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(1103784925);
                boolean z5 = !wf4Var.m87949g();
                boolean z6 = wf4Var.m87935F() && interfaceC2609yd.mo76359a(6);
                boolean zM91770i3 = xq00Var2.m91770i(kqi0Var2);
                Object objM91750T7 = xq00Var2.m91750T();
                if (zM91770i3 || objM91750T7 == ia7Var) {
                    objM91750T7 = new esc0(kqi0Var2, 2);
                    xq00Var2.m91793t0(objM91750T7);
                }
                akg1.m26216a(abstractC2524w8, false, z5, z6, z2, z3, null, (gh00) objM91750T7, xq00Var2, 0, 66);
                xq00Var2 = xq00Var2;
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
        } else {
            ftc0Var2 = ftc0Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ms1(ftc0Var2, qwtVar, wsc0Var, z, th00Var, gh00Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m42594g(ftc0 ftc0Var, String str, String str2, boolean z, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        k5m0 k5m0Var = ftc0Var.f73174b;
        String str4 = xoc1.f264109i6.f243453a;
        boolean z2 = z;
        Bundle bundle = new Bundle();
        bundle.putParcelable("martini-launch-parameters", xzc0.f267580a);
        if (str2 == null) {
            bundle.putBoolean("martini-open-with-keyboard", true);
        } else {
            bundle.putString("martini-prompt", str2);
            bundle.putBoolean("martini-open-with-keyboard", false);
            bundle.putBoolean("martini-resume-playback-after-tts", z2);
        }
        if (str3 != null) {
            bundle.putString("martini-cta-suggestion-text", str3);
            bundle.putInt("martini-cta-suggestion-insertion-index", ftc0Var.f73175c.m87966x());
        }
        k5m0.m55541i(k5m0Var, str4, str, bundle, false, 8);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f73168O0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f73169P0;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f73171Y;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f73166M0;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f73167N0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m42595h() {
        return this.f73175c.m87934E() && !this.f73182t.mo76361c();
    }
}
