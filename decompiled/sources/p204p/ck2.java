package p204p;

import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ck2 implements aj2, wk40 {

    /* JADX INFO: renamed from: A */
    public final nuu0 f38744A;

    /* JADX INFO: renamed from: B */
    public volatile String f38745B;

    /* JADX INFO: renamed from: C */
    public final bqa f38746C;

    /* JADX INFO: renamed from: D */
    public final bqa f38747D;

    /* JADX INFO: renamed from: E */
    public volatile pjq f38748E;

    /* JADX INFO: renamed from: F */
    public volatile tf60 f38749F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f38750G;

    /* JADX INFO: renamed from: H */
    public volatile String f38751H;

    /* JADX INFO: renamed from: I */
    public volatile String f38752I;

    /* JADX INFO: renamed from: J */
    public volatile Long f38753J;

    /* JADX INFO: renamed from: K */
    public volatile String f38754K;

    /* JADX INFO: renamed from: L */
    public final Object f38755L;

    /* JADX INFO: renamed from: M */
    public final wg61 f38756M;

    /* JADX INFO: renamed from: N */
    public final wg61 f38757N;

    /* JADX INFO: renamed from: O */
    public final wg61 f38758O;

    /* JADX INFO: renamed from: P */
    public gj2 f38759P;

    /* JADX INFO: renamed from: Q */
    public int f38760Q;

    /* JADX INFO: renamed from: R */
    public boolean f38761R;

    /* JADX INFO: renamed from: a */
    public final jq2 f38762a;

    /* JADX INFO: renamed from: b */
    public final el2 f38763b;

    /* JADX INFO: renamed from: c */
    public final ym2 f38764c;

    /* JADX INFO: renamed from: d */
    public final qnk f38765d;

    /* JADX INFO: renamed from: e */
    public final Flowable f38766e;

    /* JADX INFO: renamed from: f */
    public final k7p0 f38767f;

    /* JADX INFO: renamed from: g */
    public final ulp f38768g;

    /* JADX INFO: renamed from: h */
    public final o3v f38769h;

    /* JADX INFO: renamed from: i */
    public final lgf f38770i;

    /* JADX INFO: renamed from: j */
    public final dj70 f38771j;

    /* JADX INFO: renamed from: k */
    public final wf4 f38772k;

    /* JADX INFO: renamed from: l */
    public final pi2 f38773l;

    /* JADX INFO: renamed from: m */
    public final fw40 f38774m;

    /* JADX INFO: renamed from: n */
    public final bj2 f38775n;

    /* JADX INFO: renamed from: o */
    public final xuk f38776o;

    /* JADX INFO: renamed from: p */
    public final zv41 f38777p;

    /* JADX INFO: renamed from: q */
    public final nuu0 f38778q;

    /* JADX INFO: renamed from: r */
    public final zv41 f38779r;

    /* JADX INFO: renamed from: s */
    public final nuu0 f38780s;

    /* JADX INFO: renamed from: t */
    public final zv41 f38781t;

    /* JADX INFO: renamed from: u */
    public final nuu0 f38782u;

    /* JADX INFO: renamed from: v */
    public final zv41 f38783v;

    /* JADX INFO: renamed from: w */
    public final nuu0 f38784w;

    /* JADX INFO: renamed from: x */
    public final zv41 f38785x;

    /* JADX INFO: renamed from: y */
    public final nuu0 f38786y;

    /* JADX INFO: renamed from: z */
    public final zv41 f38787z;

    public ck2(jq2 jq2Var, el2 el2Var, ym2 ym2Var, qnk qnkVar, nrd nrdVar, vq2 vq2Var, Flowable flowable, k7p0 k7p0Var, ulp ulpVar, o3v o3vVar, lgf lgfVar, dj70 dj70Var, wf4 wf4Var, pi2 pi2Var, fw40 fw40Var, bj2 bj2Var, xuk xukVar) {
        this.f38762a = jq2Var;
        this.f38763b = el2Var;
        this.f38764c = ym2Var;
        this.f38765d = qnkVar;
        this.f38766e = flowable;
        this.f38767f = k7p0Var;
        this.f38768g = ulpVar;
        this.f38769h = o3vVar;
        this.f38770i = lgfVar;
        this.f38771j = dj70Var;
        this.f38772k = wf4Var;
        this.f38773l = pi2Var;
        this.f38774m = fw40Var;
        this.f38775n = bj2Var;
        this.f38776o = xukVar;
        trd trdVar = (trd) nrdVar;
        fbk fbkVar = null;
        if (trdVar.f223047c.compareAndSet(false, true)) {
            x0h1.m89578u(xukVar, null, 0, new C2069kx(trdVar, fbkVar, 9), 3);
        }
        vq2Var.m86187g(xukVar);
        ryc rycVar = ryc.f203872a;
        zv41 zv41VarM52819d = jag1.m52819d(rycVar);
        this.f38777p = zv41VarM52819d;
        zux zuxVarM43299d = g0g1.m43299d(zv41VarM52819d, pi2Var.f177818e, new C2278q2());
        iq3 iq3Var = hf11.f90581a;
        this.f38778q = bzf1.m31029u(zuxVarM43299d, xukVar, iq3Var, rycVar);
        zv41 zv41VarM52819d2 = jag1.m52819d("");
        this.f38779r = zv41VarM52819d2;
        this.f38780s = bzf1.m31021m(zv41VarM52819d2);
        Boolean bool = Boolean.FALSE;
        zv41 zv41VarM52819d3 = jag1.m52819d(bool);
        this.f38781t = zv41VarM52819d3;
        this.f38782u = bzf1.m31021m(zv41VarM52819d3);
        zv41 zv41VarM52819d4 = jag1.m52819d(bool);
        this.f38783v = zv41VarM52819d4;
        this.f38784w = bzf1.m31021m(zv41VarM52819d4);
        zv41 zv41VarM52819d5 = jag1.m52819d(bool);
        this.f38785x = zv41VarM52819d5;
        this.f38786y = bzf1.m31021m(zv41VarM52819d5);
        zv41 zv41VarM52819d6 = jag1.m52819d(null);
        this.f38787z = zv41VarM52819d6;
        this.f38744A = bzf1.m31021m(zv41VarM52819d6);
        bzf1.m31029u(new yj2(zv41VarM52819d6, 0), xukVar, iq3Var, null);
        this.f38745B = "";
        bqa bqaVarM92080a = xtm0.m92080a(-2, 0, 6);
        this.f38746C = bqaVarM92080a;
        this.f38747D = bqaVarM92080a;
        this.f38755L = new Object();
        this.f38756M = new wg61(new f30(this, 2));
        this.f38757N = new wg61(new qj2(this, 1));
        this.f38758O = new wg61(new qj2(this, 0));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m33018D(String str) {
        return str.equals(WidgetInteraction.Background.DESTINATION_HOME) || bm51.m29803n0(str, "spotify:home?", false) || bm51.m29803n0(str, "spotify:home:", false) || bm51.m29803n0(str, "spotify:internal:", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m33020b(ck2 ck2Var, bi2 bi2Var, boolean z, ibk ibkVar) {
        jj2 jj2Var;
        if (ibkVar instanceof jj2) {
            jj2Var = (jj2) ibkVar;
            int i = jj2Var.f112870d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj2Var.f112870d = i - Integer.MIN_VALUE;
            } else {
                jj2Var = new jj2(ck2Var, ibkVar);
            }
        } else {
            jj2Var = new jj2(ck2Var, ibkVar);
        }
        Object obj = jj2Var.f112868b;
        int i2 = jj2Var.f112870d;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (z && !(bi2Var instanceof ai2)) {
                jj2Var.f112867a = bi2Var;
                jj2Var.f112870d = 1;
                Object objM33053J = ck2Var.m33053J(jj2Var);
                Object obj2 = yuk.f276404a;
                if (objM33053J == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bi2Var = jj2Var.f112867a;
            bga.m29073P(obj);
        }
        if (bi2Var != null) {
            ck2Var.f38746C.mo30231j(bi2Var);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m33021c(ck2 ck2Var, boolean z, fj2 fj2Var, boolean z2, ibk ibkVar) {
        kj2 kj2Var;
        if (ibkVar instanceof kj2) {
            kj2Var = (kj2) ibkVar;
            int i = kj2Var.f123203e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj2Var.f123203e = i - Integer.MIN_VALUE;
            } else {
                kj2Var = new kj2(ck2Var, ibkVar);
            }
        } else {
            kj2Var = new kj2(ck2Var, ibkVar);
        }
        Object obj = kj2Var.f123201c;
        int i2 = kj2Var.f123203e;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (z) {
                kj2Var.f123200b = fj2Var;
                kj2Var.f123199a = z2;
                kj2Var.f123203e = 1;
                Object objM33053J = ck2Var.m33053J(kj2Var);
                Object obj2 = yuk.f276404a;
                if (objM33053J == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = kj2Var.f123199a;
            fj2Var = kj2Var.f123200b;
            bga.m29073P(obj);
        }
        if (fj2Var != fj2.f70045b && z2) {
            ck2Var.f38746C.mo30231j(xh2.f261418a);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m33022d(ck2 ck2Var, hj2 hj2Var, xv41 xv41Var, ibk ibkVar) {
        lj2 lj2Var;
        if (ibkVar instanceof lj2) {
            lj2Var = (lj2) ibkVar;
            int i = lj2Var.f133940d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj2Var.f133940d = i - Integer.MIN_VALUE;
            } else {
                lj2Var = new lj2(ck2Var, ibkVar);
            }
        } else {
            lj2Var = new lj2(ck2Var, ibkVar);
        }
        Object objM33046B = lj2Var.f133938b;
        int i2 = lj2Var.f133940d;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM33046B);
            lj2Var.f133937a = hj2Var;
            lj2Var.f133940d = 1;
            objM33046B = ck2Var.m33046B(xv41Var, lj2Var);
            Object obj = yuk.f276404a;
            if (objM33046B == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hj2Var = lj2Var.f133937a;
            bga.m29073P(objM33046B);
        }
        hj2 hj2Var2 = (hj2) objM33046B;
        boolean z2 = !wj50.m88271j(hj2Var2.m47647a(), hj2Var.m47647a());
        if (wj50.m88271j(hj2Var2.m47649c(), hj2Var.m47649c()) && wj50.m88271j(hj2Var2.m47648b(), hj2Var.m47648b())) {
            z = false;
        }
        return new dj2(z2, z);
    }

    /* JADX INFO: renamed from: e */
    public static final bi2 m33023e(ck2 ck2Var, String str, String str2) {
        if (str == null) {
            return new zh2(str2);
        }
        if (str.length() == 0) {
            return null;
        }
        return hdi.m47217I(str) ? new zh2(str2) : new yh2(str);
    }

    /* JADX INFO: renamed from: h */
    public static final flx m33026h(ck2 ck2Var) {
        return (flx) ck2Var.f38758O.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public static final Object m33036r(ck2 ck2Var, ibk ibkVar) {
        sj2 sj2Var;
        int i;
        int i2;
        if (ibkVar instanceof sj2) {
            sj2Var = (sj2) ibkVar;
            int i3 = sj2Var.f209741d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sj2Var.f209741d = i3 - Integer.MIN_VALUE;
            } else {
                sj2Var = new sj2(ck2Var, ibkVar);
            }
        } else {
            sj2Var = new sj2(ck2Var, ibkVar);
        }
        Object objM86755t = sj2Var.f209739b;
        int i4 = sj2Var.f209741d;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    bga.m29073P(objM86755t);
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = sj2Var.f209738a;
                    bga.m29073P(objM86755t);
                }
                i = i2;
                return qyg1.m74178H(i != 0);
            }
            bga.m29073P(objM86755t);
            Boolean bool = (Boolean) ck2Var.f38768g.f231607f.m23798h();
            if (!(bool != null ? bool.booleanValue() : true)) {
                i = 0;
                return qyg1.m74178H(i != 0);
            }
            Flowable flowable = ck2Var.f38766e;
            d0k[] d0kVarArr = bmu0.f28619a;
            onc oncVar = new onc(flowable);
            sj2Var.f209741d = 1;
            objM86755t = vyf1.m86755t(oncVar, sj2Var);
            if (objM86755t == yukVar) {
            }
            return yukVar;
            PlayerState playerState = (PlayerState) objM86755t;
            i = (!playerState.isPlaying() || playerState.isPaused()) ? 0 : 1;
            if (i != 0) {
                Completable completableIgnoreElement = ((p8p0) ck2Var.f38757N.getValue()).mo48412a(h8p0.m46836d(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement();
                sj2Var.f209738a = i;
                sj2Var.f209741d = 2;
                if (zn91.m96565n(completableIgnoreElement, sj2Var) != yukVar) {
                    i2 = i;
                    i = i2;
                }
                return yukVar;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to pause context player for TTS", e2);
        }
        return qyg1.m74178H(i != 0);
    }

    /* JADX INFO: renamed from: s */
    public static final ej2 m33037s(ck2 ck2Var, qvw0 qvw0Var) {
        ck2Var.m33052I(qvw0Var.m74033a());
        ocm0 ocm0VarMo32928a = ck2Var.f38771j.mo32928a(aey0.MAIN);
        String str = null;
        String str2 = ocm0VarMo32928a != null ? ocm0VarMo32928a.f163960b : null;
        ck2Var.m33052I(str2);
        String strM74037e = qvw0Var.m74037e();
        if (strM74037e == null && (strM74037e = qvw0Var.m74033a()) == null) {
            strM74037e = str2;
        }
        String strM74033a = qvw0Var.m74033a();
        if (strM74033a == null || m33018D(strM74033a)) {
            strM74033a = null;
        }
        if (strM74033a == null) {
            String str3 = ck2Var.f38754K;
            if (str3 != null) {
                str = str3;
            } else if (str2 != null && !m33018D(str2)) {
                str = str2;
            }
        } else {
            str = strM74033a;
        }
        return new ej2(strM74037e, str);
    }

    /* JADX INFO: renamed from: z */
    public static final String m33044z(ck2 ck2Var, bi2 bi2Var) {
        if (bi2Var instanceof yh2) {
            String strM93622a = ((yh2) bi2Var).m93622a();
            if (hdi.m47219K(strM93622a) || hdi.m47217I(strM93622a)) {
                return null;
            }
            return strM93622a;
        }
        if (!(bi2Var instanceof ai2)) {
            return null;
        }
        ai2 ai2Var = (ai2) bi2Var;
        String strM26051c = ai2Var.m26051c();
        if (strM26051c == null && ((strM26051c = ai2Var.m26052d()) == null || strM26051c.length() <= 0 || hdi.m47219K(strM26051c) || hdi.m47217I(strM26051c))) {
            return null;
        }
        return strM26051c;
    }

    /* JADX INFO: renamed from: A */
    public final void m33045A() {
        tf60 tf60Var = this.f38749F;
        this.f38749F = null;
        if (tf60Var != null) {
            tf60Var.mo26601e(null);
        }
        pi2 pi2Var = this.f38773l;
        tf60 tf60Var2 = pi2Var.f177819f;
        pi2Var.f177819f = null;
        if (tf60Var2 != null) {
            tf60Var2.mo26601e(null);
        }
        zv41 zv41Var = pi2Var.f177817d;
        ti2 ti2Var = ti2.f220534a;
        zv41Var.getClass();
        zv41Var.m97091m(null, ti2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m33046B(xv41 xv41Var, ibk ibkVar) {
        ij2 ij2Var;
        ocm0 ocm0Var;
        if (ibkVar instanceof ij2) {
            ij2Var = (ij2) ibkVar;
            int i = ij2Var.f102672d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij2Var.f102672d = i - Integer.MIN_VALUE;
            } else {
                ij2Var = new ij2(this, ibkVar);
            }
        } else {
            ij2Var = new ij2(this, ibkVar);
        }
        Object obj = ij2Var.f102670b;
        int i2 = ij2Var.f102672d;
        if (i2 == 0) {
            bga.m29073P(obj);
            ocm0 ocm0VarMo32928a = this.f38771j.mo32928a(aey0.MAIN);
            ij2Var.f102669a = ocm0VarMo32928a;
            ij2Var.f102672d = 1;
            Object objM33050G = m33050G(xv41Var, ij2Var);
            Object obj2 = yuk.f276404a;
            if (objM33050G == obj2) {
                return obj2;
            }
            obj = objM33050G;
            ocm0Var = ocm0VarMo32928a;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ocm0Var = ij2Var.f102669a;
            bga.m29073P(obj);
        }
        return new hj2((String) obj, ocm0Var != null ? ocm0Var.f163960b : null, ocm0Var != null ? ocm0Var.f163961c : null);
    }

    /* JADX INFO: renamed from: C */
    public final void m33047C() {
        m33045A();
        zv41 zv41Var = this.f38781t;
        Boolean bool = Boolean.FALSE;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
        zv41 zv41Var2 = this.f38783v;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, bool);
        zv41 zv41Var3 = this.f38779r;
        zv41Var3.getClass();
        zv41Var3.m97091m(null, "");
        this.f38751H = null;
        this.f38752I = null;
        this.f38753J = null;
        zv41 zv41Var4 = this.f38777p;
        ryc rycVar = ryc.f203872a;
        zv41Var4.getClass();
        zv41Var4.m97091m(null, rycVar);
    }

    /* JADX INFO: renamed from: E */
    public final void m33048E(String str, boolean z, vh00 vh00Var) {
        gj2 gj2Var;
        tf60 tf60VarM44863b;
        rlv0 rlv0Var = new rlv0();
        boolean z2 = true;
        rlv0Var.f200373a = x0h1.m89578u(this.f38776o, null, 2, new C1968i6(this, str, rlv0Var, null, 13), 1);
        synchronized (this.f38755L) {
            try {
                gj2Var = this.f38759P;
                if (!z && (gj2Var == null || !gj2Var.m44864c())) {
                    z2 = false;
                }
                Object obj = rlv0Var.f200373a;
                if (obj == null) {
                    wj50.m88260d0("playbackJob");
                    throw null;
                }
                this.f38759P = new gj2((tf60) obj, z2, vh00Var);
                zv41 zv41Var = this.f38785x;
                Boolean bool = Boolean.TRUE;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gj2Var != null && (tf60VarM44863b = gj2Var.m44863b()) != null) {
            tf60VarM44863b.mo26601e(null);
        }
        Object obj2 = rlv0Var.f200373a;
        if (obj2 != null) {
            ((tf60) obj2).start();
        } else {
            wj50.m88260d0("playbackJob");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r0 == r11) goto L29;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33049F(nk2 nk2Var, String str, ibk ibkVar) {
        rj2 rj2Var;
        nk2 nk2Var2;
        el2 el2Var;
        Object obj;
        String str2;
        String strM91372a;
        String strM91373b;
        if (ibkVar instanceof rj2) {
            rj2Var = (rj2) ibkVar;
            int i = rj2Var.f199692f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rj2Var.f199692f = i - Integer.MIN_VALUE;
            } else {
                rj2Var = new rj2(this, ibkVar);
            }
        } else {
            rj2Var = new rj2(this, ibkVar);
        }
        rj2 rj2Var2 = rj2Var;
        Object objM70245f = rj2Var2.f199690d;
        int i2 = rj2Var2.f199692f;
        wf4 wf4Var = this.f38772k;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM70245f);
                el2 el2Var2 = this.f38763b;
                nk2Var2 = nk2Var;
                rj2Var2.f199687a = nk2Var2;
                rj2Var2.f199688b = str;
                rj2Var2.f199689c = el2Var2;
                rj2Var2.f199692f = 1;
                Object objM33055L = m33055L(rj2Var2);
                if (objM33055L != obj2) {
                    el2Var = el2Var2;
                    obj = objM33055L;
                    str2 = str;
                }
                return obj2;
            }
            if (i2 == 1) {
                el2 el2Var3 = rj2Var2.f199689c;
                str2 = rj2Var2.f199688b;
                nk2 nk2Var3 = rj2Var2.f199687a;
                bga.m29073P(objM70245f);
                obj = objM70245f;
                nk2Var2 = nk2Var3;
                el2Var = el2Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM70245f);
            }
            fm2 fm2Var = (fm2) objM70245f;
            List<yl2> listM42046c = fm2Var.m42046c();
            if (wf4Var.m87963u() && listM42046c != null && !listM42046c.isEmpty()) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM42046c, 10));
                for (yl2 yl2Var : listM42046c) {
                    xl2 xl2VarM94146a = yl2Var.m94146a();
                    String str3 = "";
                    if (xl2VarM94146a == null || (strM91372a = xl2VarM94146a.m91372a()) == null) {
                        strM91372a = "";
                    }
                    xl2 xl2VarM94146a2 = yl2Var.m94146a();
                    if (xl2VarM94146a2 != null && (strM91373b = xl2VarM94146a2.m91373b()) != null) {
                        str3 = strM91373b;
                    }
                    wwu wwuVarM72371C = q9g1.m72371C(strM91372a);
                    List listM94147b = yl2Var.m94147b();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM94147b, 10));
                    for (wl2 wl2Var : (ArrayList) listM94147b) {
                        String strM88379a = wl2Var.m88379a();
                        int i3 = n6f.f150872l;
                        long jM60224n = ly5.m60224n();
                        String strM88380b = wl2Var.m88380b();
                        arrayList2.add(new mzn0(null, 0L, jM60224n, strM88379a, strM88380b.length() == 0 ? null : strM88380b, wl2Var.m88381c(), false, false, fm2Var.m42048e(), ContentDeliveryAdvertisementCapability.LINEAR_4DAY));
                    }
                    arrayList.add(new h550(strM91372a, str3, wwuVarM72371C, opo.m67574x(arrayList2)));
                }
                return new jpk(fm2Var.m42047d(), fm2Var.m42044a(), arrayList);
            }
            List listM42045b = fm2Var.m42045b();
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(listM42045b, 10));
            for (wl2 wl2Var2 : (ArrayList) listM42045b) {
                String strM88379a2 = wl2Var2.m88379a();
                int i4 = n6f.f150872l;
                long jM60224n2 = ly5.m60224n();
                String strM88380b2 = wl2Var2.m88380b();
                arrayList3.add(new mzn0(null, 0L, jM60224n2, strM88379a2, strM88380b2.length() == 0 ? null : strM88380b2, wl2Var2.m88381c(), false, false, fm2Var.m42048e(), ContentDeliveryAdvertisementCapability.LINEAR_4DAY));
            }
            return new ipk(arrayList3);
            wm2 wm2VarM28033p = b3h1.m28033p(str2, (wm2) obj);
            el2 el2Var4 = el2Var;
            String strM64653a = nk2Var2.m64653a();
            String strM68947m = p2h1.m68947m(nk2Var2);
            boolean zM87963u = wf4Var.m87963u();
            rj2Var2.f199687a = null;
            rj2Var2.f199688b = null;
            rj2Var2.f199689c = null;
            rj2Var2.f199692f = 2;
            objM70245f = ((pl2) el2Var4).m70245f(wm2VarM28033p, strM64653a, strM68947m, zM87963u, rj2Var2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new ipk(lau.f131415a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m33050G(xv41 xv41Var, ibk ibkVar) {
        tj2 tj2Var;
        PlayerState playerState;
        String strContextUri;
        if (ibkVar instanceof tj2) {
            tj2Var = (tj2) ibkVar;
            int i = tj2Var.f220808c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj2Var.f220808c = i - Integer.MIN_VALUE;
            } else {
                tj2Var = new tj2(this, ibkVar);
            }
        } else {
            tj2Var = new tj2(this, ibkVar);
        }
        Object objM86755t = tj2Var.f220806a;
        int i2 = tj2Var.f220808c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86755t);
                playerState = (PlayerState) xv41Var.getValue();
                if (playerState == null) {
                    kmx kmxVarM27791m = b0g1.m27791m(xv41Var);
                    tj2Var.f220808c = 1;
                    objM86755t = vyf1.m86755t(kmxVarM27791m, tj2Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM86755t == yukVar) {
                        return yukVar;
                    }
                }
                strContextUri = playerState.contextUri();
                if (strContextUri == null && !wl51.m88460J0(strContextUri)) {
                    return strContextUri;
                }
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            playerState = (PlayerState) objM86755t;
            strContextUri = playerState.contextUri();
            return strContextUri == null ? null : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    /* JADX INFO: renamed from: H */
    public final void m33051H() {
        boolean z;
        synchronized (this.f38755L) {
            int i = this.f38760Q;
            if (i == 0) {
                z = false;
            } else {
                int i2 = i - 1;
                this.f38760Q = i2;
                if (i2 == 0) {
                    z = this.f38761R;
                    this.f38761R = false;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            x0h1.m89578u(this.f38776o, null, 0, new mj2(this, null, 1), 3);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m33052I(String str) {
        if (str != null) {
            if (wl51.m88460J0(str)) {
                str = null;
            }
            if (str == null || m33018D(str)) {
                return;
            }
            this.f38754K = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m33053J(ibk ibkVar) {
        uj2 uj2Var;
        if (ibkVar instanceof uj2) {
            uj2Var = (uj2) ibkVar;
            int i = uj2Var.f230867c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj2Var.f230867c = i - Integer.MIN_VALUE;
            } else {
                uj2Var = new uj2(this, ibkVar);
            }
        } else {
            uj2Var = new uj2(this, ibkVar);
        }
        Object obj = uj2Var.f230865a;
        int i2 = uj2Var.f230867c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableIgnoreElement = ((p8p0) this.f38757N.getValue()).mo48412a(h8p0.m46838f(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())).ignoreElement();
                uj2Var.f230867c = 1;
                Object objM96565n = zn91.m96565n(completableIgnoreElement, uj2Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to resume context player after TTS", e2);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: K */
    public final void m33054K() {
        boolean z;
        synchronized (this.f38755L) {
            try {
                z = true;
                if (this.f38760Q > 0) {
                    this.f38761R = true;
                } else {
                    gj2 gj2Var = this.f38759P;
                    if (gj2Var != null) {
                        this.f38759P = gj2.m44862a(gj2Var);
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            x0h1.m89578u(this.f38776o, null, 0, new mj2(this, null, 2), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: L */
    public final Object m33055L(ibk ibkVar) {
        vj2 vj2Var;
        if (ibkVar instanceof vj2) {
            vj2Var = (vj2) ibkVar;
            int i = vj2Var.f241862c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj2Var.f241862c = i - Integer.MIN_VALUE;
            } else {
                vj2Var = new vj2(this, ibkVar);
            }
        } else {
            vj2Var = new vj2(this, ibkVar);
        }
        Object objM94180a = vj2Var.f241860a;
        int i2 = vj2Var.f241862c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM94180a);
                ym2 ym2Var = this.f38764c;
                vj2Var.f241862c = 1;
                objM94180a = ym2Var.m94180a(vj2Var);
                yuk yukVar = yuk.f276404a;
                if (objM94180a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM94180a);
            }
            return (wm2) objM94180a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            na6.m63972t("Failed to build AgentGatewayUserContext for agent-coordinator request", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: M */
    public final Object m33056M(String str, qvw0 qvw0Var, ibk ibkVar) {
        wj2 wj2Var;
        ck2 ck2Var;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof wj2) {
            wj2Var = (wj2) ibkVar;
            int i = wj2Var.f251834c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj2Var.f251834c = i - Integer.MIN_VALUE;
            } else {
                wj2Var = new wj2(this, ibkVar);
            }
        } else {
            wj2Var = new wj2(this, ibkVar);
        }
        Object obj = wj2Var.f251832a;
        yuk yukVar = yuk.f276404a;
        int i2 = wj2Var.f251834c;
        fbk fbkVar = null;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                bga.m29073P(obj);
                return w2a1Var;
            } catch (CancellationException unused) {
                qlg1.m73220y(wj2Var.getContext());
                return w2a1Var;
            } catch (Exception unused2) {
                ck2Var = this;
                zv41 zv41Var = ck2Var.f38777p;
                ryc rycVar = ryc.f203872a;
                zv41Var.getClass();
                zv41Var.m97091m(null, rycVar);
                return w2a1Var;
            }
        }
        bga.m29073P(obj);
        if (!this.f38772k.m87944b() || !p2h1.m68946l(str)) {
            m33045A();
            ck2Var = this;
            ck2Var.f38748E = x0h1.m89574q(this.f38776o, null, 2, new C1968i6(ck2Var, str, qvw0Var, fbkVar, 14), 1);
            pjq pjqVar = ck2Var.f38748E;
            if (pjqVar != null) {
                pjqVar.mo26599N(new nj2(this, 1));
            }
            try {
                pjq pjqVar2 = ck2Var.f38748E;
                if (pjqVar2 != null) {
                    wj2Var.f251834c = 1;
                    if (pjqVar2.m38777P(wj2Var) == yukVar) {
                        return yukVar;
                    }
                }
            } catch (CancellationException unused3) {
                qlg1.m73220y(wj2Var.getContext());
            } catch (Exception unused4) {
                zv41 zv41Var2 = ck2Var.f38777p;
                ryc rycVar2 = ryc.f203872a;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, rycVar2);
            }
        } else if (this.f38772k.m87944b() && this.f38749F == null) {
            if (this.f38774m.m42935y()) {
                m33059P();
                return w2a1Var;
            }
            rlv0 rlv0Var = new rlv0();
            di41 di41VarM89578u = x0h1.m89578u(this.f38776o, null, 2, new fa2(this, rlv0Var, fbkVar, 5), 1);
            rlv0Var.f200373a = di41VarM89578u;
            this.f38749F = di41VarM89578u;
            Object obj2 = rlv0Var.f200373a;
            if (obj2 != null) {
                ((tf60) obj2).start();
                return w2a1Var;
            }
            wj50.m88260d0("job");
            throw null;
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m33057N(boolean z) {
        fr0.m42476t(z, this.f38783v, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m33058O(boolean z) {
        fr0.m42476t(z, this.f38781t, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m33059P() {
        pjq pjqVar = this.f38748E;
        fbk fbkVar = null;
        if (pjqVar != null) {
            pjqVar.mo26601e(null);
        }
        m33045A();
        m33062S();
        zv41 zv41Var = this.f38781t;
        Boolean bool = Boolean.FALSE;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
        zv41 zv41Var2 = this.f38783v;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, bool);
        this.f38750G = false;
        this.f38787z.m97090l(null);
        zv41 zv41Var3 = this.f38779r;
        zv41Var3.getClass();
        zv41Var3.m97091m(null, "");
        zv41 zv41Var4 = this.f38777p;
        ryc rycVar = ryc.f203872a;
        zv41Var4.getClass();
        zv41Var4.m97091m(null, rycVar);
        pi2 pi2Var = this.f38773l;
        tf60 tf60Var = pi2Var.f177819f;
        pi2Var.f177819f = null;
        if (tf60Var != null) {
            tf60Var.mo26601e(null);
        }
        rlv0 rlv0Var = new rlv0();
        di41 di41VarM89578u = x0h1.m89578u(pi2Var.f177816c, null, 2, new fa2(pi2Var, rlv0Var, fbkVar, 3), 1);
        rlv0Var.f200373a = di41VarM89578u;
        pi2Var.f177819f = di41VarM89578u;
        zv41 zv41Var5 = pi2Var.f177817d;
        ui2 ui2Var = ui2.f230568a;
        zv41Var5.getClass();
        zv41Var5.m97091m(null, ui2Var);
        Object obj = rlv0Var.f200373a;
        if (obj != null) {
            ((tf60) obj).start();
        } else {
            wj50.m88260d0("sessionJob");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public final Object m33060Q(String str, ibk ibkVar) {
        zj2 zj2Var;
        if (ibkVar instanceof zj2) {
            zj2Var = (zj2) ibkVar;
            int i = zj2Var.f283335c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zj2Var.f283335c = i - Integer.MIN_VALUE;
            } else {
                zj2Var = new zj2(this, ibkVar);
            }
        } else {
            zj2Var = new zj2(this, ibkVar);
        }
        Object obj = zj2Var.f283333a;
        yuk yukVar = yuk.f276404a;
        int i2 = zj2Var.f283335c;
        if (i2 == 0) {
            bga.m29073P(obj);
            qnk qnkVar = this.f38765d;
            String str2 = this.f38751H;
            String str3 = this.f38752I;
            if (str3 != null) {
                str = str3;
            }
            zj2Var.f283335c = 1;
            if (((bpk) qnkVar).m30131F(str2, str, zj2Var) == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f38751H = null;
        this.f38752I = null;
        this.f38753J = null;
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m33061R() {
        pqm0 pqm0VarM69840u;
        tf60 tf60VarM44863b;
        synchronized (this.f38755L) {
            try {
                gj2 gj2Var = this.f38759P;
                this.f38759P = null;
                if (gj2Var != null) {
                    zv41 zv41Var = this.f38785x;
                    Boolean bool = Boolean.FALSE;
                    zv41Var.getClass();
                    zv41Var.m97091m(null, bool);
                }
                boolean z = false;
                boolean z2 = gj2Var != null && gj2Var.m44864c();
                if (z2 && this.f38760Q > 0) {
                    this.f38761R = true;
                }
                if (z2 && this.f38760Q == 0) {
                    z = true;
                }
                pqm0VarM69840u = pft0.m69840u(gj2Var, Boolean.valueOf(z));
            } catch (Throwable th) {
                throw th;
            }
        }
        gj2 gj2Var2 = (gj2) pqm0VarM69840u.f180350a;
        boolean zBooleanValue = ((Boolean) pqm0VarM69840u.f180351b).booleanValue();
        if (gj2Var2 != null && (tf60VarM44863b = gj2Var2.m44863b()) != null) {
            tf60VarM44863b.mo26601e(null);
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: S */
    public final void m33062S() {
        if (m33061R()) {
            x0h1.m89578u(this.f38776o, null, 0, new mj2(this, null, 3), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: T */
    public final Object m33063T(String str, ibk ibkVar) {
        bk2 bk2Var;
        String str2;
        jj70 jj70Var;
        String str3;
        String str4;
        ck2 ck2Var;
        jj70 jj70Var2;
        if (ibkVar instanceof bk2) {
            bk2Var = (bk2) ibkVar;
            int i = bk2Var.f27817g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk2Var.f27817g = i - Integer.MIN_VALUE;
            } else {
                bk2Var = new bk2(this, ibkVar);
            }
        } else {
            bk2Var = new bk2(this, ibkVar);
        }
        Object objM30157w = bk2Var.f27815e;
        yuk yukVar = yuk.f276404a;
        int i2 = bk2Var.f27817g;
        if (i2 == 0) {
            bga.m29073P(objM30157w);
            if (!this.f38772k.m87956n() || q191.m71911u((uyc) this.f38778q.f158717a.getValue())) {
                return null;
            }
            m33052I(str);
            ocm0 ocm0VarMo32928a = this.f38771j.mo32928a(aey0.MAIN);
            m33052I(ocm0VarMo32928a != null ? ocm0VarMo32928a.f163960b : null);
            qnk qnkVar = this.f38765d;
            bk2Var.f27811a = str;
            bk2Var.f27817g = 1;
            objM30157w = ((bpk) qnkVar).m30157w(str, bk2Var);
            if (objM30157w != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = bk2Var.f27811a;
            bga.m29073P(objM30157w);
        } else {
            if (i2 == 2) {
                str4 = bk2Var.f27812b;
                str3 = bk2Var.f27811a;
                bga.m29073P(objM30157w);
                jj70 jj70Var3 = (jj70) objM30157w;
                str2 = str4;
                str = str3;
                jj70Var = jj70Var3;
                if (str2 != null || jj70Var == null) {
                    this.f38751H = null;
                    this.f38752I = null;
                    this.f38753J = null;
                    return null;
                }
                this.f38751H = str2;
                this.f38752I = str;
                qnk qnkVar2 = this.f38765d;
                bk2Var.f27811a = null;
                bk2Var.f27812b = null;
                bk2Var.f27813c = jj70Var;
                bk2Var.f27814d = this;
                bk2Var.f27817g = 3;
                objM30157w = ((bpk) qnkVar2).m30143i(str2, bk2Var);
                if (objM30157w != yukVar) {
                    ck2Var = this;
                    jj70Var2 = jj70Var;
                }
                return yukVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ck2Var = bk2Var.f27814d;
            jj70Var2 = bk2Var.f27813c;
            bga.m29073P(objM30157w);
        }
        ck2Var.f38753J = (Long) objM30157w;
        return jj70Var2.m53527b();
        str2 = (String) objM30157w;
        if (str2 == null) {
            jj70Var = null;
            if (str2 != null) {
            }
            this.f38751H = null;
            this.f38752I = null;
            this.f38753J = null;
            return null;
        }
        qnk qnkVar3 = this.f38765d;
        bk2Var.f27811a = str;
        bk2Var.f27812b = str2;
        bk2Var.f27813c = null;
        bk2Var.f27817g = 2;
        Object objM30148n = ((bpk) qnkVar3).m30148n(str2, bk2Var);
        if (objM30148n != yukVar) {
            str3 = str;
            str4 = str2;
            objM30157w = objM30148n;
            jj70 jj70Var4 = (jj70) objM30157w;
            str2 = str4;
            str = str3;
            jj70Var = jj70Var4;
            if (str2 != null) {
            }
            this.f38751H = null;
            this.f38752I = null;
            this.f38753J = null;
            return null;
        }
        return yukVar;
    }
}
