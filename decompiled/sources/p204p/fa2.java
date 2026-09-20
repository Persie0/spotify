package p204p;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.nsd.NsdManager;
import android.provider.Settings;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class fa2 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67411a;

    /* JADX INFO: renamed from: b */
    public int f67412b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67413c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa2(Object obj, Object obj2, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f67411a = i;
        this.f67413c = obj;
        this.f67414d = obj2;
    }

    /* JADX INFO: renamed from: A */
    private final Object m41119A(Object obj) {
        jke jkeVar = (jke) this.f67414d;
        sir0 sir0Var = (sir0) this.f67413c;
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            pi4 pi4Var = new pi4(sir0Var, 0);
            ((ConnectivityManager) ((wg61) jkeVar.f113294e).getValue()).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), pi4Var);
            zq2 zq2Var = new zq2(14, jkeVar, pi4Var);
            this.f67413c = null;
            this.f67412b = 1;
            Object objM45540m = grl0.m45540m(sir0Var, zq2Var, this);
            yuk yukVar = yuk.f276404a;
            if (objM45540m == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: B */
    private final Object m41120B(Object obj) {
        NsdManager nsdManager = (NsdManager) this.f67414d;
        sir0 sir0Var = (sir0) this.f67413c;
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            uj4 uj4Var = new uj4(sir0Var);
            zpr zprVarM93843a = yj4.m93843a();
            if (zprVarM93843a.equals(ypr.f275012a)) {
                yj4.m93844b(nsdManager, uj4Var);
            } else {
                if (!zprVarM93843a.equals(xpr.f264709a)) {
                    throw new NoWhenBranchMatchedException();
                }
                nsdManager.discoverServices("_spotify-social-listening._tcp", 1, uj4Var);
            }
            zq2 zq2Var = new zq2(sir0Var, nsdManager, uj4Var);
            this.f67413c = null;
            this.f67412b = 1;
            Object objM45540m = grl0.m45540m(sir0Var, zq2Var, this);
            yuk yukVar = yuk.f276404a;
            if (objM45540m == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: D */
    private final Object m41121D(Object obj) {
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            gw40 gw40Var = (gw40) this.f67413c;
            jl4 jl4Var = (jl4) this.f67414d;
            this.f67413c = gw40Var;
            this.f67412b = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(this));
            hqbVar.m48222q();
            ha71 ha71Var = jl4Var.f113479b;
            deo0 deo0Var = ha71Var.f89141a;
            deo0Var.mo35805b();
            ha71Var.f89142b.set(new ka71(ha71Var, deo0Var));
            hqbVar.mo42415l(new n62(17, gw40Var, jl4Var));
            Object objM48221p = hqbVar.m48221p();
            yuk yukVar = yuk.f276404a;
            if (objM48221p == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:18:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: E */
    private final java.lang.Object m41122E(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f67412b
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r7.f67413c
            p.xuk r0 = (p204p.xuk) r0
            p204p.bga.m29073P(r8)
            goto L56
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            p204p.bga.m29073P(r8)
            java.lang.Object r8 = r7.f67413c
            p.xuk r8 = (p204p.xuk) r8
            r0 = r8
        L1f:
            boolean r8 = p204p.kk40.m56650L(r0)
            if (r8 == 0) goto L79
            p.wv3 r8 = p204p.wv3.f255347b1
            r7.f67413c = r0
            r7.f67412b = r1
            p.juk r2 = r7.getContext()
            p.mzx r3 = p204p.mzx.f148828f
            p.huk r2 = r2.mo26595B(r3)
            p.ap40 r2 = (p204p.ap40) r2
            if (r2 != 0) goto L46
            p.juk r2 = r7.getContext()
            p.cyh0 r2 = p204p.cvf1.m34049l(r2)
            java.lang.Object r8 = r2.mo30456K(r7, r8)
            goto L51
        L46:
            p.mgo r8 = new p.mgo
            r3 = 0
            r4 = 1
            r8.<init>(r1, r4, r3)
            java.lang.Object r8 = r2.m26644L()
        L51:
            p.yuk r2 = p204p.yuk.f276404a
            if (r8 != r2) goto L56
            return r2
        L56:
            java.lang.Object r8 = r7.f67414d
            p.maq0 r8 = (p204p.maq0) r8
            int[] r2 = r8.f141660d1
            boolean r3 = r8.isAttachedToWindow()
            if (r3 != 0) goto L63
            goto L1f
        L63:
            r3 = 0
            r4 = r2[r3]
            r5 = r2[r1]
            android.view.View r6 = r8.f141644N0
            r6.getLocationOnScreen(r2)
            r3 = r2[r3]
            if (r4 != r3) goto L75
            r2 = r2[r1]
            if (r5 == r2) goto L1f
        L75:
            r8.m61324B()
            goto L1f
        L79:
            p.w2a1 r8 = p204p.w2a1.f247311a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.fa2.m41122E(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    private final Object m41123f(Object obj) {
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            owp owpVar = ((he3) this.f67413c).f90302j;
            d850 d850Var = ((kd3) this.f67414d).f121594j;
            this.f67412b = 1;
            Object objM68180f = owpVar.m68180f(d850Var, this);
            yuk yukVar = yuk.f276404a;
            if (objM68180f == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m41124i(Object obj) {
        int i = this.f67412b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        owp owpVar = ((he3) this.f67413c).f90302j;
        d850 d850Var = ((pd3) this.f67414d).f176340j;
        this.f67412b = 1;
        Object objM68181g = owpVar.m68181g(d850Var, this);
        yuk yukVar = yuk.f276404a;
        if (objM68181g != yukVar) {
            objM68181g = w2a1Var;
        }
        return objM68181g == yukVar ? yukVar : w2a1Var;
    }

    /* JADX INFO: renamed from: j */
    private final Object m41125j(Object obj) {
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            ud80 ud80Var = ((he3) this.f67413c).f90293a;
            String str = ((jd3) this.f67414d).f111226j;
            this.f67412b = 1;
            Object objM82840b = ud80.m82840b(ud80Var, str, false, this, 6);
            yuk yukVar = yuk.f276404a;
            if (objM82840b == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m41126k(Object obj) {
        int i = this.f67412b;
        if (i == 0) {
            rlv0 rlv0VarM36622v = dq60.m36622v(obj);
            vzn vznVar = (vzn) this.f67413c;
            fiz fizVarM34374j = cyf1.m34374j(mvl0.m62953p(new nzx0(new r2m(vznVar, (fbk) null, 23))), (luk) vznVar.f246488c);
            C2343rm c2343rm = new C2343rm(24, rlv0VarM36622v, (fj3) this.f67414d);
            this.f67412b = 1;
            Object objCollect = fizVarM34374j.collect(c2343rm, this);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m41127n(Object obj) {
        int i = this.f67412b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        ltx0 ltx0Var = (ltx0) this.f67413c;
        dry0 dry0Var = (dry0) ((hry0) this.f67414d);
        Single singleM59920o = ltx0Var.m59920o(dry0Var.f52416c, dry0Var.f52414a, dry0Var.f52415b);
        this.f67412b = 1;
        Object objM96567o = zn91.m96567o(singleM59920o, this);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX INFO: renamed from: o */
    private final Object m41128o(Object obj) {
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            if (((f2z0) this.f67413c).f65321m > 0) {
                yw70 yw70Var = (yw70) this.f67414d;
                this.f67412b = 1;
                t9y0 t9y0Var = yw70.f276887y;
                Object objM94782k = yw70Var.m94782k(0, 0, this);
                yuk yukVar = yuk.f276404a;
                if (objM94782k == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m41129q(Object obj) {
        yr3 yr3Var = (yr3) this.f67413c;
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            long jM60858h = m5b1.m60858h(((wcs) this.f67414d).f250096a, yr3Var.m94406d2() ? -1.0f : 1.0f);
            float fM60855e = yr3Var.f275375i1 == vvl0.f245248a ? m5b1.m60855e(jM60858h) : m5b1.m60854d(jM60858h);
            this.f67412b = 1;
            Object objM94405c2 = yr3.m94405c2(yr3Var, fM60855e, this);
            yuk yukVar = yuk.f276404a;
            if (objM94405c2 == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:11:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: t */
    private final java.lang.Object m41130t(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f67413c
            p.niz r0 = (p204p.niz) r0
            int r1 = r7.f67412b
            r2 = 2
            r3 = 1
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            goto L1d
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            p204p.bga.m29073P(r8)
            goto L3d
        L1d:
            p204p.bga.m29073P(r8)
        L20:
            p.juk r8 = r7.getContext()
            boolean r8 = p204p.qlg1.m73191G(r8)
            if (r8 == 0) goto L4a
            java.lang.Object r8 = r7.f67414d
            p.zq2 r8 = (p204p.zq2) r8
            java.lang.Object r8 = r8.invoke()
            r7.f67413c = r0
            r7.f67412b = r3
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r4) goto L3d
            goto L49
        L3d:
            r7.f67413c = r0
            r7.f67412b = r2
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r8 = p204p.njg1.m64619l(r5, r7)
            if (r8 != r4) goto L20
        L49:
            return r4
        L4a:
            p.w2a1 r8 = p204p.w2a1.f247311a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.fa2.m41130t(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: u */
    private final Object m41131u(Object obj) {
        niz nizVar = (niz) this.f67413c;
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(((e84) this.f67414d).f57064a.getContentResolver(), "airplane_mode_on", 0) != 0);
            this.f67413c = null;
            this.f67412b = 1;
            Object objEmit = nizVar.emit(boolValueOf, this);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: x */
    private final Object m41132x(Object obj) throws Throwable {
        int i = this.f67412b;
        yuk yukVar = yuk.f276404a;
        if (i == 0) {
            bga.m29073P(obj);
            f150 f150Var = new f150(19);
            this.f67412b = 1;
            if (cvf1.m34056s(f150Var, this) == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw edb.m38575x(obj);
            }
            bga.m29073P(obj);
        }
        hqi0 hqi0VarM38275i = ((ea4) this.f67413c).m38275i();
        if (hqi0VarM38275i == null) {
            return w2a1.f247311a;
        }
        C2132mm c2132mm = new C2132mm((fw40) this.f67414d, 9);
        this.f67412b = 2;
        hb11.m46961m((hb11) hqi0VarM38275i, c2132mm, this);
        return yukVar;
    }

    /* JADX INFO: renamed from: y */
    private final Object m41133y(Object obj) {
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            zuv zuvVar = ((ch4) this.f67413c).f37912s;
            String strUri = ((ContextTrack) this.f67414d).uri();
            this.f67412b = 1;
            obj = zuvVar.m97080c(strUri, this);
            yuk yukVar = yuk.f276404a;
            if (obj == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return Boolean.valueOf(!((Collection) obj).isEmpty());
    }

    /* JADX INFO: renamed from: z */
    private final Object m41134z(Object obj) {
        niz nizVar = (niz) this.f67413c;
        int i = this.f67412b;
        if (i == 0) {
            bga.m29073P(obj);
            Map map = (Map) this.f67414d;
            this.f67413c = null;
            this.f67412b = 1;
            Object objEmit = nizVar.emit(map, this);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f67411a) {
            case 0:
                return new fa2((ka2) this.f67413c, (String) this.f67414d, fbkVar, 0);
            case 1:
                return new fa2((wc2) this.f67413c, (d850) this.f67414d, fbkVar, 1);
            case 2:
                return new fa2((pi2) this.f67413c, (String) this.f67414d, fbkVar, 2);
            case 3:
                return new fa2((pi2) this.f67413c, (rlv0) this.f67414d, fbkVar, 3);
            case 4:
                return new fa2((y3l0) this.f67413c, (String) this.f67414d, fbkVar, 4);
            case 5:
                return new fa2((ck2) this.f67413c, (rlv0) this.f67414d, fbkVar, 5);
            case 6:
                return new fa2((sm2) this.f67413c, (String) this.f67414d, fbkVar, 6);
            case 7:
                fa2 fa2Var = new fa2((vq2) this.f67414d, fbkVar, 7);
                fa2Var.f67413c = obj;
                return fa2Var;
            case 8:
                return new fa2((kc5) this.f67413c, (String) this.f67414d, fbkVar, 8);
            case 9:
                return new fa2((sy2) this.f67413c, (uy2) this.f67414d, fbkVar, 9);
            case 10:
                return new fa2((b43) this.f67413c, (jdp0) this.f67414d, fbkVar, 10);
            case 11:
                return new fa2((b43) this.f67413c, (h8p0) this.f67414d, fbkVar, 11);
            case 12:
                return new fa2((w83) this.f67413c, (vn80) this.f67414d, fbkVar, 12);
            case 13:
                return new fa2((he3) this.f67413c, (kd3) this.f67414d, fbkVar, 13);
            case 14:
                return new fa2((he3) this.f67413c, (pd3) this.f67414d, fbkVar, 14);
            case 15:
                return new fa2((he3) this.f67413c, (jd3) this.f67414d, fbkVar, 15);
            case 16:
                return new fa2((vzn) this.f67413c, (fj3) this.f67414d, fbkVar, 16);
            case 17:
                return new fa2((ltx0) this.f67413c, (hry0) this.f67414d, fbkVar, 17);
            case 18:
                return new fa2((f2z0) this.f67413c, (yw70) this.f67414d, fbkVar, 18);
            case 19:
                return new fa2((yr3) this.f67413c, (wcs) this.f67414d, fbkVar, 19);
            case 20:
                fa2 fa2Var2 = new fa2((zq2) this.f67414d, fbkVar, 20);
                fa2Var2.f67413c = obj;
                return fa2Var2;
            case 21:
                fa2 fa2Var3 = new fa2((e84) this.f67414d, fbkVar, 21);
                fa2Var3.f67413c = obj;
                return fa2Var3;
            case 22:
                return new fa2((ea4) this.f67413c, (fw40) this.f67414d, fbkVar, 22);
            case 23:
                return new fa2((ch4) this.f67413c, (ContextTrack) this.f67414d, fbkVar, 23);
            case 24:
                fa2 fa2Var4 = new fa2((Map) this.f67414d, fbkVar, 24);
                fa2Var4.f67413c = obj;
                return fa2Var4;
            case 25:
                fa2 fa2Var5 = new fa2((jke) this.f67414d, fbkVar, 25);
                fa2Var5.f67413c = obj;
                return fa2Var5;
            case 26:
                fa2 fa2Var6 = new fa2((NsdManager) this.f67414d, fbkVar, 26);
                fa2Var6.f67413c = obj;
                return fa2Var6;
            case 27:
                fa2 fa2Var7 = new fa2((jl4) this.f67414d, fbkVar, 27);
                fa2Var7.f67413c = obj;
                return fa2Var7;
            case 28:
                fa2 fa2Var8 = new fa2((maq0) this.f67414d, fbkVar, 28);
                fa2Var8.f67413c = obj;
                return fa2Var8;
            default:
                return new fa2((w591) this.f67413c, (ujh) this.f67414d, fbkVar, 29);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67411a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fa2) create(bool, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 1:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 2:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 3:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 4:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 5:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 6:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 7:
                return ((fa2) create((PlayerState) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 8:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 9:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 10:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 11:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 12:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 13:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 14:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 15:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 16:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 17:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 18:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 19:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 20:
                return ((fa2) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 21:
                return ((fa2) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 22:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 23:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 24:
                return ((fa2) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 25:
                return ((fa2) create((sir0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 26:
                return ((fa2) create((sir0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 27:
                ((fa2) create((gw40) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 28:
                return ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                ((fa2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [p.ir4] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 0;
        Object[] objArr = 0;
        fbk fbkVar = null;
        int i3 = 1;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        switch (this.f67411a) {
            case 0:
                yuk yukVar = yuk.f276404a;
                int i4 = this.f67412b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                Single map = ((ron0) ((ka2) this.f67413c).f120756c).m76074b("age_assurance_video_blocker_service:should_block_video", Collections.singletonList((String) this.f67414d), false).map(o5h1.f161997e);
                this.f67412b = 1;
                Object objM96567o = zn91.m96567o(map, this);
                return objM96567o == yukVar ? yukVar : objM96567o;
            case 1:
                wc2 wc2Var = (wc2) this.f67413c;
                pfm0 pfm0Var = wc2Var.f249939g;
                yuk yukVar2 = yuk.f276404a;
                int i5 = this.f67412b;
                try {
                    if (i5 == 0) {
                        bga.m29073P(obj);
                        pfm0Var.m69810a(new tq9((boolean) (objArr == true ? 1 : 0), i));
                        gfi0 gfi0Var = wc2Var.f249935c;
                        String str = xoc1.f263917J6.f243453a;
                        d850 d850Var = (d850) this.f67414d;
                        this.f67412b = 1;
                        if (gfi0Var.m44623d(str, d850Var, null, this) == yukVar2) {
                            return yukVar2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    pfm0Var.m69810a(new tq9((boolean) (c2 == true ? 1 : 0), i));
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    pfm0Var.m69810a(new tq9((boolean) (c == true ? 1 : 0), i));
                    throw th;
                }
            case 2:
                String str2 = (String) this.f67414d;
                yuk yukVar3 = yuk.f276404a;
                int i6 = this.f67412b;
                if (i6 == 0) {
                    bga.m29073P(obj);
                    C2373se c2373se = new C2373se(k0e1.m54985d(((jpx) ((pi2) this.f67413c).f177815b).m53978b(new C1668ai("agent-audio-recognition", false, (gh00) new C2597y1(str2, 16)))), 6);
                    this.f67412b = 1;
                    obj = vyf1.m86755t(c2373se, this);
                    if (obj == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return ((gqx) obj).mo45449a(v140.class, str2).f72301b;
            case 3:
                si2 si2Var = si2.f209344a;
                yuk yukVar4 = yuk.f276404a;
                int i7 = this.f67412b;
                try {
                    try {
                        try {
                            if (i7 == 0) {
                                bga.m29073P(obj);
                                qld1 qld1Var = ((pi2) this.f67413c).f177814a;
                                qld1Var.getClass();
                                nzx0 nzx0VarM76724v = ryf1.m76724v(cyf1.m34374j(new nzx0(new s6d1(qld1Var, new nzx0(new w9a1(qld1Var, fbkVar, 28)), fbkVar, c3 == true ? 1 : 0)), qld1Var.f189849c), new oi2((pi2) this.f67413c, (rlv0) this.f67414d, null));
                                C2343rm c2343rm = new C2343rm(15, (pi2) this.f67413c, (rlv0) this.f67414d);
                                this.f67412b = 1;
                                if (nzx0VarM76724v.collect(c2343rm, this) == yukVar4) {
                                    return yukVar4;
                                }
                            } else {
                                if (i7 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bga.m29073P(obj);
                            }
                            tf60 tf60Var = ((pi2) this.f67413c).f177819f;
                            Object obj2 = ((rlv0) this.f67414d).f200373a;
                            if (obj2 == null) {
                                wj50.m88260d0("sessionJob");
                                throw null;
                            }
                            if (tf60Var == ((tf60) obj2)) {
                                yi2 yi2Var = (yi2) ((pi2) this.f67413c).f177817d.getValue();
                                if ((yi2Var instanceof ui2) || (yi2Var instanceof ri2)) {
                                    Logger.m3966b("Audio recognition ended without a terminal result", new Object[0]);
                                    zv41 zv41Var = ((pi2) this.f67413c).f177817d;
                                    zv41Var.getClass();
                                    zv41Var.m97091m(null, si2Var);
                                }
                            }
                            tf60 tf60Var2 = ((pi2) this.f67413c).f177819f;
                            Object obj3 = ((rlv0) this.f67414d).f200373a;
                            if (obj3 == null) {
                                wj50.m88260d0("sessionJob");
                                throw null;
                            }
                            if (tf60Var2 == ((tf60) obj3)) {
                                ((pi2) this.f67413c).f177819f = null;
                            }
                            return w2a1.f247311a;
                        } catch (CancellationException e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        Logger.m3967c(e2, "Audio recognition failed", new Object[0]);
                        tf60 tf60Var3 = ((pi2) this.f67413c).f177819f;
                        Object obj4 = ((rlv0) this.f67414d).f200373a;
                        if (obj4 == null) {
                            wj50.m88260d0("sessionJob");
                            throw null;
                        }
                        if (tf60Var3 == ((tf60) obj4)) {
                            zv41 zv41Var2 = ((pi2) this.f67413c).f177817d;
                            zv41Var2.getClass();
                            zv41Var2.m97091m(null, si2Var);
                        }
                        tf60 tf60Var4 = ((pi2) this.f67413c).f177819f;
                        Object obj5 = ((rlv0) this.f67414d).f200373a;
                        if (obj5 == null) {
                            wj50.m88260d0("sessionJob");
                            throw null;
                        }
                        if (tf60Var4 == ((tf60) obj5)) {
                        }
                    }
                } catch (Throwable th2) {
                    tf60 tf60Var5 = ((pi2) this.f67413c).f177819f;
                    Object obj6 = ((rlv0) this.f67414d).f200373a;
                    if (obj6 == null) {
                        wj50.m88260d0("sessionJob");
                        throw null;
                    }
                    if (tf60Var5 != ((tf60) obj6)) {
                        throw th2;
                    }
                    ((pi2) this.f67413c).f177819f = null;
                    throw th2;
                }
                break;
            case 4:
                String str3 = (String) this.f67414d;
                yuk yukVar5 = yuk.f276404a;
                int i8 = this.f67412b;
                try {
                    if (i8 == 0) {
                        bga.m29073P(obj);
                        fwk0 fwk0Var = ((y3l0) this.f67413c).f268961a;
                        amw amwVarM16125q = EsOffline$DownloadRequest.m16125q();
                        amwVarM16125q.m26450r(str3);
                        Completable completableFlatMapCompletable = fwk0Var.m42967a((EsOffline$DownloadRequest) amwVarM16125q.build()).flatMapCompletable(jsy.f115608T0);
                        this.f67412b = 1;
                        if (zn91.m96565n(completableFlatMapCompletable, this) == yukVar5) {
                            return yukVar5;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    na6.m63972t("Failed to start download for ".concat(str3), e4);
                }
                return w2a1.f247311a;
            case 5:
                w2a1 w2a1Var = w2a1.f247311a;
                yuk yukVar6 = yuk.f276404a;
                int i9 = this.f67412b;
                try {
                    try {
                        try {
                            if (i9 == 0) {
                                bga.m29073P(obj);
                                fw40 fw40Var = ((ck2) this.f67413c).f38774m;
                                this.f67412b = 1;
                                obj = ((qi2) fw40Var.f73935c).invoke(this);
                                if (obj == yukVar6) {
                                    return yukVar6;
                                }
                            } else {
                                if (i9 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bga.m29073P(obj);
                            }
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            tf60 tf60Var6 = ((ck2) this.f67413c).f38749F;
                            Object obj7 = ((rlv0) this.f67414d).f200373a;
                            if (obj7 == null) {
                                wj50.m88260d0("job");
                                throw null;
                            }
                            if (tf60Var6 != ((tf60) obj7)) {
                                tf60 tf60Var7 = ((ck2) this.f67413c).f38749F;
                                Object obj8 = ((rlv0) this.f67414d).f200373a;
                                if (obj8 == null) {
                                    wj50.m88260d0("job");
                                    throw null;
                                }
                                if (tf60Var7 != ((tf60) obj8)) {
                                    return w2a1Var;
                                }
                            } else {
                                ((ck2) this.f67413c).f38749F = null;
                                if (zBooleanValue) {
                                    ((ck2) this.f67413c).m33059P();
                                } else {
                                    ((ck2) this.f67413c).f38773l.m70068b();
                                }
                                tf60 tf60Var8 = ((ck2) this.f67413c).f38749F;
                                Object obj9 = ((rlv0) this.f67414d).f200373a;
                                if (obj9 == null) {
                                    wj50.m88260d0("job");
                                    throw null;
                                }
                                if (tf60Var8 != ((tf60) obj9)) {
                                    return w2a1Var;
                                }
                            }
                            ((ck2) this.f67413c).f38749F = null;
                            return w2a1Var;
                        } catch (CancellationException e5) {
                            throw e5;
                        }
                    } catch (Exception e6) {
                        na6.m63972t("Failed to request microphone permission for Agent audio recognition", e6);
                        tf60 tf60Var9 = ((ck2) this.f67413c).f38749F;
                        Object obj10 = ((rlv0) this.f67414d).f200373a;
                        if (obj10 == null) {
                            wj50.m88260d0("job");
                            throw null;
                        }
                        if (tf60Var9 == ((tf60) obj10)) {
                            ((ck2) this.f67413c).f38749F = null;
                            pi2 pi2Var = ((ck2) this.f67413c).f38773l;
                            tf60 tf60Var10 = pi2Var.f177819f;
                            pi2Var.f177819f = null;
                            if (tf60Var10 != null) {
                                tf60Var10.mo26601e(null);
                            }
                            zv41 zv41Var3 = pi2Var.f177817d;
                            si2 si2Var2 = si2.f209344a;
                            zv41Var3.getClass();
                            zv41Var3.m97091m(null, si2Var2);
                        }
                        tf60 tf60Var11 = ((ck2) this.f67413c).f38749F;
                        Object obj11 = ((rlv0) this.f67414d).f200373a;
                        if (obj11 == null) {
                            wj50.m88260d0("job");
                            throw null;
                        }
                        if (tf60Var11 != ((tf60) obj11)) {
                            return w2a1Var;
                        }
                    }
                } catch (Throwable th3) {
                    tf60 tf60Var12 = ((ck2) this.f67413c).f38749F;
                    Object obj12 = ((rlv0) this.f67414d).f200373a;
                    if (obj12 == null) {
                        wj50.m88260d0("job");
                        throw null;
                    }
                    if (tf60Var12 != ((tf60) obj12)) {
                        throw th3;
                    }
                    ((ck2) this.f67413c).f38749F = null;
                    throw th3;
                }
                break;
            case 6:
                yuk yukVar7 = yuk.f276404a;
                int i10 = this.f67412b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                el2 el2Var = ((sm2) this.f67413c).f210546d;
                String str4 = (String) this.f67414d;
                this.f67412b = 1;
                Object objM40677b = f3h1.m40677b(el2Var, str4, this);
                return objM40677b == yukVar7 ? yukVar7 : objM40677b;
            case 7:
                PlayerState playerState = (PlayerState) this.f67413c;
                yuk yukVar8 = yuk.f276404a;
                int i11 = this.f67412b;
                if (i11 == 0) {
                    bga.m29073P(obj);
                    ((vq2) this.f67414d).f243863e = playerState;
                    vq2 vq2Var = (vq2) this.f67414d;
                    wj50.m88279p(playerState);
                    this.f67413c = null;
                    this.f67412b = 1;
                    if (vq2.m86181a(vq2Var, playerState, this) == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 8:
                yuk yukVar9 = yuk.f276404a;
                int i12 = this.f67412b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                rxp0 rxp0Var = new rxp0(((uiq0) ((kc5) this.f67413c).f121371g).m83206b((String) this.f67414d, null), c4 == true ? 1 : 0);
                this.f67412b = 1;
                Object objM86755t = vyf1.m86755t(rxp0Var, this);
                return objM86755t == yukVar9 ? yukVar9 : objM86755t;
            case 9:
                yuk yukVar10 = yuk.f276404a;
                int i13 = this.f67412b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                sy2 sy2Var = (sy2) this.f67413c;
                uy2 uy2Var = (uy2) this.f67414d;
                this.f67412b = 1;
                h23 h23Var = uy2Var.f235118d;
                voc1 voc1Var = uy2Var.f235116b;
                String str5 = uy2Var.f235115a;
                String str6 = uy2Var.f235117c;
                Object objM56684z = kk40.m56684z(new ly2(str6 == null ? str5 : str6, str5, sy2Var, h23Var, null, voc1Var), this);
                return objM56684z == yukVar10 ? yukVar10 : objM56684z;
            case 10:
                b43 b43Var = (b43) this.f67413c;
                String str7 = b43Var.f23206h;
                yuk yukVar11 = yuk.f276404a;
                int i14 = this.f67412b;
                if (i14 == 0) {
                    bga.m29073P(obj);
                    rli0 rli0Var = b43Var.f23202d;
                    yab yabVarM54985d = k0e1.m54985d(rli0Var.f200321a.m49110d(str7).map(new t180(rli0Var, 26)));
                    fiz fizVarM95590j = z8g1.m95590j(b43Var.f23203e.m33735a());
                    Flowable flowableMo53041b = ((jdp0) this.f67414d).mo53041b();
                    d0k[] d0kVarArr = bmu0.f28619a;
                    yab yabVarM65827f = nxf1.m65827f(new cjz(b43Var.f23207i.getLifecycle(), g0g1.m43301f(yabVarM54985d, fizVarM95590j, new onc(flowableMo53041b), b43Var.f23204f.m72336a(str7), new y33(5, i2, fbkVar)), fbkVar, i3));
                    C2132mm c2132mm = new C2132mm(b43Var, 8);
                    this.f67412b = 1;
                    if (yabVarM65827f.collect(c2132mm, this) == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 11:
                yuk yukVar12 = yuk.f276404a;
                int i15 = this.f67412b;
                if (i15 == 0) {
                    bga.m29073P(obj);
                    Completable completableIgnoreElement = ((b43) this.f67413c).f23205g.mo48412a((h8p0) this.f67414d).ignoreElement();
                    completableIgnoreElement.getClass();
                    CompletableOnErrorComplete completableOnErrorCompleteM23299p = completableIgnoreElement.m23299p(Functions.f7232h);
                    this.f67412b = 1;
                    if (zn91.m96565n(completableOnErrorCompleteM23299p, this) == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 12:
                vn80 vn80Var = (vn80) this.f67414d;
                w83 w83Var = (w83) this.f67413c;
                yuk yukVar13 = yuk.f276404a;
                int i16 = this.f67412b;
                try {
                    if (i16 == 0) {
                        bga.m29073P(obj);
                        MaybeFlatMapCompletable maybeFlatMapCompletableM34312x = w83Var.f248831c.m34312x(vn80Var, 2, w83Var.f248833e.m91831k());
                        this.f67412b = 1;
                        if (zn91.m96565n(maybeFlatMapCompletableM34312x, this) == yukVar13) {
                            return yukVar13;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    w83Var.m87438d();
                    break;
                } catch (Throwable unused) {
                    w83Var.m87437c(vn80Var);
                }
                return w2a1.f247311a;
            case 13:
                return m41123f(obj);
            case 14:
                return m41124i(obj);
            case 15:
                return m41125j(obj);
            case 16:
                return m41126k(obj);
            case 17:
                return m41127n(obj);
            case 18:
                return m41128o(obj);
            case 19:
                return m41129q(obj);
            case 20:
                return m41130t(obj);
            case 21:
                return m41131u(obj);
            case 22:
                return m41132x(obj);
            case 23:
                return m41133y(obj);
            case 24:
                return m41134z(obj);
            case 25:
                return m41119A(obj);
            case 26:
                return m41120B(obj);
            case 27:
                return m41121D(obj);
            case 28:
                return m41122E(obj);
            default:
                yuk yukVar14 = yuk.f276404a;
                int i17 = this.f67412b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw edb.m38575x(obj);
                }
                bga.m29073P(obj);
                w591 w591Var = (w591) this.f67413c;
                final ujh ujhVar = (ujh) this.f67414d;
                ?? r2 = new j971() { // from class: p.ir4
                    @Override // p204p.j971
                    /* JADX INFO: renamed from: a */
                    public final void mo51429a(u571 u571Var, u571 u571Var2, boolean z) {
                        long j = u571Var.f226936d;
                        ic71 ic71Var = u571Var.f226937e;
                        long j2 = u571Var2.f226936d;
                        ic71 ic71Var2 = u571Var2.f226937e;
                        ujh ujhVar2 = ujhVar;
                        if (z) {
                            ujhVar2.m83285h().restartInput((View) ujhVar2.f231032b);
                            return;
                        }
                        if (ic71.m50235c(j, j2) && wj50.m88271j(ic71Var, ic71Var2)) {
                            return;
                        }
                        ujhVar2.m83285h().updateSelection((View) ujhVar2.f231032b, ic71.m50239g(j2), ic71.m50238f(j2), ic71Var2 != null ? ic71.m50239g(ic71Var2.f100752a) : -1, ic71Var2 != null ? ic71.m50238f(ic71Var2.f100752a) : -1);
                    }
                };
                this.f67412b = 1;
                w591Var.m87230b(r2, this);
                return yukVar14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa2(Object obj, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f67411a = i;
        this.f67414d = obj;
    }
}
