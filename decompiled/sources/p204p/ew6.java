package p204p;

import android.app.Activity;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class ew6 implements dut, mzd1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63437a;

    /* JADX INFO: renamed from: b */
    public final Object f63438b;

    /* JADX INFO: renamed from: c */
    public final Object f63439c;

    /* JADX INFO: renamed from: d */
    public final Object f63440d;

    public ew6(int i) {
        this.f63437a = i;
        int i2 = 3;
        switch (i) {
            case 4:
                this.f63438b = x2h1.m89764z();
                this.f63439c = new lu91(ksv.f126029S0, ksv.f126031U0);
                fyf fyfVar = jgg.f112189a;
                wpi0 wpi0Var = xwt.f266743a;
                this.f63440d = new cph(fyfVar, i2);
                break;
            case 5:
            default:
                this.f63438b = x2h1.m89764z();
                this.f63440d = new j2a1();
                this.f63439c = new b60(i2);
                break;
            case 6:
                this.f63438b = new kzs0(x4g0.f258115i);
                this.f63439c = vgg1.m85454J(null, x4g0.f258116t, 1);
                fyf fyfVar2 = new fyf(new d9i0(this, 9), true, 1862207136);
                wpi0 wpi0Var2 = xwt.f266743a;
                this.f63440d = new cph(fyfVar2, i2);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m40138e(ew6 ew6Var, n2k n2kVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        long j;
        xq00Var.m91775k0(-1602454267);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(n2kVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            int iM38547C = edb.m38547C(n2kVar.f149775a);
            if (iM38547C == 0) {
                xq00Var.m91771i0(1934714441);
                j = leu.m58815a(xq00Var).f112824b.f138757a;
                xq00Var.m91788r(false);
            } else {
                if (iM38547C != 1) {
                    throw lq51.m59703i(1934711766, xq00Var, false);
                }
                xq00Var.m91771i0(1934716780);
                j = leu.m58815a(xq00Var).f112824b.f138758b;
                xq00Var.m91788r(false);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("standard_header_action_context_menu", cxh0.f43038a);
            wgu wguVar = wgu.f251150c;
            String strM54977L = k0e1.m54977L(R.string.standard_header_context_menu_element_accessibility, xq00Var);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new awj(3, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            riw0.m75607a(new peu(new t40(strM54977L), eh00Var), wguVar, fxh0VarM39673I, null, null, null, false, null, null, rkk.m75772x(1258007822, new uqf(j, 10, (byte) 0), xq00Var), xq00Var, 0, 6, 1016);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hsd(ew6Var, n2kVar, gh00Var, i, 28);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m40139f(ew6 ew6Var, xri0 xri0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        int i3;
        int i4;
        xq00Var.m91775k0(-552595155);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91762e(xri0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= xq00Var.m91770i(ew6Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i5 & 1, (i5 & 1171) != 1170)) {
            int i6 = i5 & 14;
            int iOrdinal = xri0Var.ordinal();
            if (iOrdinal == 0) {
                i3 = 1120888924;
                i4 = R.string.mute_chat_duration_one_hour;
            } else if (iOrdinal == 1) {
                i3 = 1120891871;
                i4 = R.string.mute_chat_duration_eight_hours;
            } else if (iOrdinal == 2) {
                i3 = 1120894779;
                i4 = R.string.mute_chat_duration_one_day;
            } else if (iOrdinal == 3) {
                i3 = 1120897596;
                i4 = R.string.mute_chat_duration_one_week;
            } else {
                if (iOrdinal != 4) {
                    throw lq51.m59703i(1120887891, xq00Var, false);
                }
                i3 = 1120900378;
                i4 = R.string.mute_chat_duration_always;
            }
            String strM12k = AbstractC0000a.m12k(xq00Var, i3, i4, xq00Var, false);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z = ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) | (i6 == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new mii0(5, gh00Var, xri0Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0(strM12k)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            p711.m69222a(fxh0VarM61822f, null, null, false, null, null, new peu(new t40(strM12k), eh00Var), null, null, null, null, null, null, null, null, rkk.m75772x(726576241, new tv20(strM12k, 28), xq00Var), xq00Var, 0, 196608, 32702);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vjc0((Object) ew6Var, (Object) xri0Var, gh00Var, (Object) fxh0Var2, i, 17);
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f63437a) {
            case 0:
                return (j2a1) this.f63440d;
            case 1:
                return (i5x) this.f63439c;
            case 2:
                return (coj0) this.f63439c;
            case 3:
                return (j2a1) this.f63440d;
            case 4:
                return (lu91) this.f63439c;
            case 5:
                return (i5x) this.f63438b;
            case 6:
                return (xu91) this.f63439c;
            case 7:
                return (j2a1) this.f63440d;
            case 8:
                return (i5x) this.f63438b;
            case 9:
                return (j2a1) this.f63440d;
            case 10:
                return (j2a1) this.f63440d;
            case 11:
                return (j2a1) this.f63440d;
            default:
                return (j2a1) this.f63440d;
        }
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f63437a) {
            case 0:
                return (b60) this.f63438b;
            case 1:
                return (mhj) this.f63440d;
            case 2:
                return (cph) this.f63440d;
            case 3:
                return (b60) this.f63439c;
            case 4:
                return (cph) this.f63440d;
            case 5:
                return (cph) this.f63440d;
            case 6:
                return (cph) this.f63440d;
            case 7:
                return (cph) this.f63439c;
            case 8:
                return (cph) this.f63440d;
            case 9:
                return (cph) this.f63439c;
            case 10:
                return (cph) this.f63439c;
            case 11:
                return (b60) this.f63439c;
            default:
                return (h1l0) this.f63439c;
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f63437a) {
            case 0:
                return (qv6) this.f63439c;
            case 1:
                return (kzs0) this.f63438b;
            case 2:
                return (kzs0) this.f63438b;
            case 3:
                return (kzs0) this.f63438b;
            case 4:
                return (kzs0) this.f63438b;
            case 5:
                return (m7t0) this.f63439c;
            case 6:
                return (kzs0) this.f63438b;
            case 7:
                return (m7t0) this.f63438b;
            case 8:
                return (vb61) this.f63439c;
            case 9:
                return (mmh0) this.f63438b;
            case 10:
                return (kzs0) this.f63438b;
            case 11:
                return (pvs0) this.f63438b;
            default:
                return (gu6) this.f63438b;
        }
    }

    public ew6(i4t0 i4t0Var, x60 x60Var, boolean z) {
        this.f63437a = 1;
        this.f63438b = x2h1.m89764z();
        this.f63439c = mhf1.m61771p(this).m94133b(x30.f257637t, agi.f15381Q0);
        this.f63440d = new mhj(i4t0Var, x60Var, z);
    }

    public ew6(gu6 gu6Var, h1l0 h1l0Var) {
        this.f63437a = 12;
        this.f63438b = gu6Var;
        this.f63440d = new j2a1();
        this.f63439c = h1l0Var;
    }

    public ew6(i26 i26Var, in9 in9Var) {
        this.f63437a = 8;
        this.f63438b = mhf1.m61771p(this).m94133b(new nmx(this, 27), oxu0.f171581U0);
        this.f63439c = x2h1.m89738B(new jr3(i26Var, in9Var, null, 9));
        fyf fyfVar = h4h.f87532a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f63440d = new cph(fyfVar, 3);
    }

    public ew6(Flowable flowable) {
        this.f63437a = 7;
        this.f63438b = qjg1.m72915g(flowable, o6p0.f162399h, uio0.f230743N0, null, 24);
        this.f63440d = new j2a1();
        fyf fyfVar = r0h.f194489a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f63439c = new cph(fyfVar, 3);
    }

    public ew6(b60 b60Var, qv6 qv6Var) {
        this.f63437a = 0;
        this.f63438b = b60Var;
        this.f63439c = qv6Var;
        this.f63440d = new j2a1();
    }

    public ew6(xre xreVar, e940 e940Var, ebg0 ebg0Var, z5f z5fVar, xr9 xr9Var, y64 y64Var, gh00 gh00Var) {
        this.f63437a = 5;
        this.f63438b = mhf1.m61771p(this).m94133b(new tx2(ebg0Var, 19), p820.f174825T0);
        this.f63439c = qjg1.m72914f(new u53(z5fVar, xr9Var, 2), ks20.f125819h, lq00.f135912c1, new st20(1, gh00Var), 8);
        fyf fyfVar = new fyf(new ki0(e940Var, xreVar, y64Var, 4), true, 1949718074);
        wpi0 wpi0Var = xwt.f266743a;
        this.f63440d = new cph(fyfVar, 3);
    }

    public ew6(b60 b60Var, pvs0 pvs0Var) {
        this.f63437a = 11;
        this.f63438b = pvs0Var;
        this.f63440d = new j2a1();
        this.f63439c = b60Var;
    }

    public ew6(b321 b321Var, zj51 zj51Var, qok0 qok0Var, t4b0 t4b0Var, wul wulVar, gk51 gk51Var, Scheduler scheduler, ha80 ha80Var, esa0 esa0Var) {
        this.f63437a = 9;
        kk51 kk51Var = new kk51(2, lk51.f134260a, 2);
        jlx0 jlx0Var = new jlx0(6);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        final dc31 dc31Var = zj51Var.f283366a;
        final int i = 0;
        Action action = new Action() { // from class: p.yj51
            @Override // io.reactivex.rxjava3.functions.Action
            public final void run() {
                switch (i) {
                    case 0:
                        dc31 dc31Var2 = dc31Var;
                        k5m0.m55541i((k5m0) dc31Var2.f47417d, ((t6b0) dc31Var2.f47418e).m80158a() ? xoc1.f264114j3.m83614b("spotify:internal:unboxing:feature:lossless").f243453a : xoc1.f263999U2.f243453a, null, null, false, 14);
                        break;
                    default:
                        String str = xoc1.f264013W2.f243453a;
                        dc31 dc31Var3 = dc31Var;
                        z9j0 z9j0Var = (z9j0) dc31Var3.f47416c;
                        if (!z9j0Var.mo47349j((Activity) dc31Var3.f47415b)) {
                            k5m0.m55541i((k5m0) dc31Var3.f47417d, str, null, null, false, 14);
                        } else {
                            z9j0Var.mo47346g(str);
                        }
                        break;
                }
            }
        };
        Scheduler scheduler2 = zj51Var.f283367b;
        subtypeEffectHandlerBuilderM15658c.m15660b(xj51.class, action, scheduler2);
        final int i2 = 1;
        subtypeEffectHandlerBuilderM15658c.m15660b(wj51.class, new Action() { // from class: p.yj51
            @Override // io.reactivex.rxjava3.functions.Action
            public final void run() {
                switch (i2) {
                    case 0:
                        dc31 dc31Var2 = dc31Var;
                        k5m0.m55541i((k5m0) dc31Var2.f47417d, ((t6b0) dc31Var2.f47418e).m80158a() ? xoc1.f264114j3.m83614b("spotify:internal:unboxing:feature:lossless").f243453a : xoc1.f263999U2.f243453a, null, null, false, 14);
                        break;
                    default:
                        String str = xoc1.f264013W2.f243453a;
                        dc31 dc31Var3 = dc31Var;
                        z9j0 z9j0Var = (z9j0) dc31Var3.f47416c;
                        if (!z9j0Var.mo47349j((Activity) dc31Var3.f47415b)) {
                            k5m0.m55541i((k5m0) dc31Var3.f47417d, str, null, null, false, 14);
                        } else {
                            z9j0Var.mo47346g(str);
                        }
                        break;
                }
            }
        }, scheduler2);
        this.f63438b = alf1.m26337t(kk51Var, jlx0Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h()), ek41.f60358P0, new rk51(qok0Var, t4b0Var, wulVar, gk51Var, scheduler));
        this.f63440d = new j2a1();
        fyf fyfVar = new fyf(new ki0(b321Var, ha80Var, esa0Var, 9), true, 1810744181);
        wpi0 wpi0Var = xwt.f266743a;
        this.f63439c = new cph(fyfVar, 3);
    }

    public ew6(z9j0 z9j0Var) {
        this.f63437a = 10;
        this.f63438b = new kzs0(new c1r0(this, 13));
        this.f63440d = new j2a1();
        this.f63439c = new cph(this, 15);
    }

    public ew6(yvx yvxVar) {
        this.f63437a = 2;
        this.f63438b = new kzs0(new xgg(yvxVar, this));
        this.f63439c = mhf1.m61772q(this).m42292j(nwj.f159194O0, nwj.f159196Q0);
        fyf fyfVar = new fyf(new r4i(this, 14), true, -1733745543);
        wpi0 wpi0Var = xwt.f266743a;
        this.f63440d = new cph(fyfVar, 3);
    }
}
