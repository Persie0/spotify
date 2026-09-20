package p204p;

import android.content.Context;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.music.R;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.proto.C1203a;
import com.spotify.playlist.proto.ModificationRequest;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class nf80 implements dut {

    /* JADX INFO: renamed from: P0 */
    public static final PlaylistRequestDecorationPolicy f153267P0;

    /* JADX INFO: renamed from: L0 */
    public final ay7 f153268L0;

    /* JADX INFO: renamed from: M0 */
    public final m7t0 f153269M0 = qjg1.m72914f(new ff80(this, 0), s380.f205217X0, gn70.f81602P0, new ff80(this, 1), 8);

    /* JADX INFO: renamed from: N0 */
    public final cph f153270N0;

    /* JADX INFO: renamed from: O0 */
    public final i5x f153271O0;

    /* JADX INFO: renamed from: X */
    public final be4 f153272X;

    /* JADX INFO: renamed from: Y */
    public final d670 f153273Y;

    /* JADX INFO: renamed from: Z */
    public final dts f153274Z;

    /* JADX INFO: renamed from: a */
    public final pgo f153275a;

    /* JADX INFO: renamed from: b */
    public final xh70 f153276b;

    /* JADX INFO: renamed from: c */
    public final Context f153277c;

    /* JADX INFO: renamed from: d */
    public final z9j0 f153278d;

    /* JADX INFO: renamed from: e */
    public final String f153279e;

    /* JADX INFO: renamed from: f */
    public final wt80 f153280f;

    /* JADX INFO: renamed from: g */
    public final yz80 f153281g;

    /* JADX INFO: renamed from: h */
    public final xst f153282h;

    /* JADX INFO: renamed from: i */
    public final qkx0 f153283i;

    /* JADX INFO: renamed from: t */
    public final luk f153284t;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57347E((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setLink(true).build());
        top0VarM18421v.m81217y((PlaylistTrackDecorationPolicy) ktp0VarM18427E.build());
        f153267P0 = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public nf80(pgo pgoVar, xh70 xh70Var, Context context, z9j0 z9j0Var, String str, wt80 wt80Var, yz80 yz80Var, xst xstVar, qkx0 qkx0Var, luk lukVar, be4 be4Var, d670 d670Var) {
        this.f153275a = pgoVar;
        this.f153276b = xh70Var;
        this.f153277c = context;
        this.f153278d = z9j0Var;
        this.f153279e = str;
        this.f153280f = wt80Var;
        this.f153281g = yz80Var;
        this.f153282h = xstVar;
        this.f153283i = qkx0Var;
        this.f153284t = lukVar;
        this.f153272X = be4Var;
        this.f153273Y = d670Var;
        this.f153274Z = new dts(fag1.m41173v(pgoVar, pag1.m69487w(new rko(dzx.f54794t, 1, s380.f205222a1, new pko(s380.f205219Y0), s380.f205224b1), s380.f205221Z0), str), 19);
        this.f153268L0 = psh.m70869m(pgoVar, str);
        fyf fyfVar = new fyf(new aa70(this, 15), true, -5792757);
        wpi0 wpi0Var = xwt.f266743a;
        this.f153270N0 = new cph(fyfVar, 3);
        this.f153271O0 = mhf1.m61771p(this).m94133b(z970.f280680S0, new nmx(this, 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m64329e(nf80 nf80Var, af80 af80Var, ibk ibkVar) {
        gf80 gf80Var;
        ts80 ts80Var;
        if (ibkVar instanceof gf80) {
            gf80Var = (gf80) ibkVar;
            int i = gf80Var.f79301d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gf80Var.f79301d = i - Integer.MIN_VALUE;
            } else {
                gf80Var = new gf80(nf80Var, ibkVar);
            }
        } else {
            gf80Var = new gf80(nf80Var, ibkVar);
        }
        Object obj = gf80Var.f79299b;
        int i2 = gf80Var.f79301d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (af80Var instanceof ze80) {
                String str = ((ze80) af80Var).f281903b;
                ts80 ts80Var2 = new ts80(m64334j(str));
                xst xstVar = nf80Var.f153282h;
                gf80Var.f79298a = ts80Var2;
                gf80Var.f79301d = 1;
                if (xstVar.m91979i(str, gf80Var) != yukVar) {
                    ts80Var = ts80Var2;
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        ts80Var = gf80Var.f79298a;
        bga.m29073P(obj);
        pgo pgoVar = nf80Var.f153275a;
        laz lazVar = laz.f131472t;
        fw80 fw80Var = new fw80(nf80Var.f153279e);
        dw80 dw80Var = new dw80(ts80Var);
        gf80Var.f79298a = null;
        gf80Var.f79301d = 2;
        return pgoVar.mo25869e(lazVar, fw80Var, dw80Var, gf80Var) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m64330f(nf80 nf80Var, af80 af80Var, ibk ibkVar) throws Throwable {
        hf80 hf80Var;
        fw80 fw80Var;
        ts80 ts80Var;
        fw80 fw80Var2;
        pgo pgoVar;
        laz lazVar;
        cw80 cw80Var;
        if (ibkVar instanceof hf80) {
            hf80Var = (hf80) ibkVar;
            int i = hf80Var.f90630f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf80Var.f90630f = i - Integer.MIN_VALUE;
            } else {
                hf80Var = new hf80(nf80Var, ibkVar);
            }
        } else {
            hf80Var = new hf80(nf80Var, ibkVar);
        }
        Object obj = hf80Var.f90628d;
        int i2 = hf80Var.f90630f;
        Object obj2 = w2a1.f247311a;
        fbk fbkVar = null;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (af80Var instanceof ze80) {
                ze80 ze80Var = (ze80) af80Var;
                String strM64334j = m64334j(ze80Var.f281903b);
                ts80 ts80Var2 = new ts80(strM64334j);
                fw80Var = new fw80(nf80Var.f153279e);
                hf80Var.f90625a = ze80Var;
                hf80Var.f90626b = ts80Var2;
                hf80Var.f90627c = fw80Var;
                hf80Var.f90630f = 1;
                if (nf80Var.m64337m(fw80Var, strM64334j, hf80Var) != obj3) {
                    ts80Var = ts80Var2;
                }
                return obj3;
            }
            return obj2;
        }
        if (i2 == 1) {
            fw80 fw80Var3 = hf80Var.f90627c;
            ts80Var = hf80Var.f90626b;
            ze80 ze80Var2 = hf80Var.f90625a;
            bga.m29073P(obj);
            fw80Var = fw80Var3;
            af80Var = ze80Var2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj2;
            }
            fw80Var2 = hf80Var.f90627c;
            ts80Var = hf80Var.f90626b;
            bga.m29073P(obj);
        }
        pgoVar = nf80Var.f153275a;
        lazVar = laz.f131472t;
        cw80Var = new cw80(ts80Var);
        hf80Var.f90625a = null;
        hf80Var.f90626b = null;
        hf80Var.f90627c = null;
        hf80Var.f90630f = 3;
        if (pgoVar.mo25869e(lazVar, fw80Var2, cw80Var, hf80Var) != obj3) {
            return obj3;
        }
        return obj2;
        xst xstVar = nf80Var.f153282h;
        String str = ((ze80) af80Var).f281903b;
        hf80Var.f90625a = null;
        hf80Var.f90626b = ts80Var;
        hf80Var.f90627c = fw80Var;
        hf80Var.f90630f = 2;
        Object objM89557A = x0h1.m89557A((luk) xstVar.f265665c, new p6z(xstVar, str, fbkVar, 1), hf80Var);
        if (objM89557A != obj3) {
            objM89557A = obj2;
        }
        if (objM89557A != obj3) {
            fw80Var2 = fw80Var;
            pgoVar = nf80Var.f153275a;
            lazVar = laz.f131472t;
            cw80Var = new cw80(ts80Var);
            hf80Var.f90625a = null;
            hf80Var.f90626b = null;
            hf80Var.f90627c = null;
            hf80Var.f90630f = 3;
            if (pgoVar.mo25869e(lazVar, fw80Var2, cw80Var, hf80Var) != obj3) {
                return obj2;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m64331g(nf80 nf80Var, String str, ibk ibkVar) {
        if80 if80Var;
        if (ibkVar instanceof if80) {
            if80Var = (if80) ibkVar;
            int i = if80Var.f101711d;
            if ((i & Integer.MIN_VALUE) != 0) {
                if80Var.f101711d = i - Integer.MIN_VALUE;
            } else {
                if80Var = new if80(nf80Var, ibkVar);
            }
        } else {
            if80Var = new if80(nf80Var, ibkVar);
        }
        Object obj = if80Var.f101709b;
        int i2 = if80Var.f101711d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (str != null) {
                ts80 ts80Var = new ts80(m64334j(str));
                pgo pgoVar = nf80Var.f153275a;
                laz lazVar = laz.f131472t;
                fw80 fw80Var = new fw80(nf80Var.f153279e);
                dw80 dw80Var = new dw80(ts80Var);
                if80Var.f101708a = str;
                if80Var.f101711d = 1;
                if (pgoVar.mo25869e(lazVar, fw80Var, dw80Var, if80Var) != yukVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        str = if80Var.f101708a;
        bga.m29073P(obj);
        xst xstVar = nf80Var.f153282h;
        if80Var.f101708a = null;
        if80Var.f101711d = 2;
        return xstVar.m91979i(str, if80Var) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049 A[PHI: r0 r2
      0x0049: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v17 java.lang.String) binds: [B:69:0x015a, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r2v32 java.lang.Object) = (r2v31 java.lang.Object), (r2v1 java.lang.Object) binds: [B:69:0x015a, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0141 A[Catch: all -> 0x0180, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, all -> 0x0180, blocks: (B:15:0x0037, B:20:0x0046, B:71:0x015d, B:73:0x0163, B:22:0x0050, B:66:0x0137, B:68:0x0141, B:25:0x0057, B:57:0x00e0, B:58:0x00f9, B:60:0x00ff, B:61:0x010b, B:63:0x0111, B:46:0x009c, B:48:0x00a0, B:51:0x00a6, B:54:0x00b9, B:53:0x00b6), top: B:81:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163 A[Catch: all -> 0x0180, CancellationException -> 0x0183, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0183, all -> 0x0180, blocks: (B:15:0x0037, B:20:0x0046, B:71:0x015d, B:73:0x0163, B:22:0x0050, B:66:0x0137, B:68:0x0141, B:25:0x0057, B:57:0x00e0, B:58:0x00f9, B:60:0x00ff, B:61:0x010b, B:63:0x0111, B:46:0x009c, B:48:0x00a0, B:51:0x00a6, B:54:0x00b9, B:53:0x00b6), top: B:81:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017d, code lost:
    
        if (p204p.x0h1.m89557A(r6, r0, r11) == r15) goto L75;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m64332h(nf80 nf80Var, cf80 cf80Var, ibk ibkVar) {
        jf80 jf80Var;
        String str;
        String str2;
        Object obj;
        String str3;
        cf80 cf80Var2 = cf80Var;
        String str4 = nf80Var.f153279e;
        if (ibkVar instanceof jf80) {
            jf80Var = (jf80) ibkVar;
            int i = jf80Var.f111842e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf80Var.f111842e = i - Integer.MIN_VALUE;
            } else {
                jf80Var = new jf80(nf80Var, ibkVar);
            }
        } else {
            jf80Var = new jf80(nf80Var, ibkVar);
        }
        jf80 jf80Var2 = jf80Var;
        Object objM62841f = jf80Var2.f111840c;
        int i2 = jf80Var2.f111842e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM62841f);
                Iterator it = cf80Var2.f37292a.values().iterator();
                do {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    af80 af80Var = (af80) it.next();
                    if (af80Var instanceof ze80) {
                        ze80 ze80Var = (ze80) af80Var;
                        if (ze80Var.f281905d) {
                            str = ze80Var.f281903b;
                        }
                    } else if (!(af80Var instanceof ye80)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = null;
                } while (str == null);
                if (str == null) {
                    na6.m63957e("Graduation chip selected but no chip is selected in state");
                }
                i490 i490Var = cf80Var2.f37293b;
                if (i490Var == null) {
                    i490Var = v390.f236813a;
                }
                i490 i490Var2 = i490Var;
                Set setSingleton = str != null ? Collections.singleton(new ts80(m64334j(str))) : gbu.f78413a;
                wt80 wt80Var = nf80Var.f153280f;
                st80 st80Var = new st80(f153267P0, i490Var2, setSingleton, false, null, a5u0.f12598a, null, 0, null, 472);
                jf80Var2.f111838a = cf80Var2;
                jf80Var2.f111842e = 1;
                objM62841f = ((mu80) wt80Var).m62841f(str4, st80Var, jf80Var2);
                if (objM62841f == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                cf80Var2 = jf80Var2.f111838a;
                bga.m29073P(objM62841f);
            } else if (i2 == 2) {
                bga.m29073P(objM62841f);
                str2 = (String) ((p2x0) objM62841f).m68970c();
                if (str2 != null) {
                    yz80 yz80Var = nf80Var.f153281g;
                    String strM64335k = nf80Var.m64335k();
                    jf80Var2.f111838a = null;
                    jf80Var2.f111839b = str2;
                    jf80Var2.f111842e = 3;
                    C1203a c1203aM18507s = ModificationRequest.Attributes.m18507s();
                    c1203aM18507s.m18674q(strM64335k);
                    objM62841f = ((n090) yz80Var).m63323t(str2, c1203aM18507s, jf80Var2);
                    if (objM62841f == yukVar) {
                        obj = objM62841f;
                        str3 = str2;
                        if (((p2x0) obj) instanceof m2x0) {
                            d850 d850VarM90963u = nf80Var.f153276b.m90963u(str3);
                            luk lukVar = nf80Var.f153284t;
                            rcy rcyVar = new rcy(nf80Var, str3, d850VarM90963u, fbkVar, 24);
                            jf80Var2.f111838a = null;
                            jf80Var2.f111839b = null;
                            jf80Var2.f111842e = 4;
                        }
                    }
                    return yukVar;
                }
            } else if (i2 == 3) {
                str2 = jf80Var2.f111839b;
                bga.m29073P(objM62841f);
                obj = objM62841f;
                str3 = str2;
                if (((p2x0) obj) instanceof m2x0) {
                    d850 d850VarM90963u2 = nf80Var.f153276b.m90963u(str3);
                    luk lukVar2 = nf80Var.f153284t;
                    rcy rcyVar2 = new rcy(nf80Var, str3, d850VarM90963u2, fbkVar, 24);
                    jf80Var2.f111838a = null;
                    jf80Var2.f111839b = null;
                    jf80Var2.f111842e = 4;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM62841f);
            }
            return w2a1.f247311a;
            List list = ((qu80) ((p2x0) objM62841f).m68971d()).f192598d;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((nw80) it2.next()).f159049c);
            }
            String strM64336l = nf80Var.m64336l(cf80Var2);
            if (strM64336l != null) {
                qkx0 qkx0Var = nf80Var.f153283i;
                nkx0 nkx0Var = new nkx0(str4);
                jf80Var2.f111838a = null;
                jf80Var2.f111842e = 2;
                rkx0 rkx0Var = (rkx0) qkx0Var;
                objM62841f = x0h1.m89557A(rkx0Var.f200176b, new nm0(strM64336l, arrayList, nkx0Var, rkx0Var, (String) null, str4, str4, (fbk) null), jf80Var2);
                if (objM62841f != yukVar) {
                    str2 = (String) ((p2x0) objM62841f).m68970c();
                    if (str2 != null) {
                        yz80 yz80Var2 = nf80Var.f153281g;
                        String strM64335k2 = nf80Var.m64335k();
                        jf80Var2.f111838a = null;
                        jf80Var2.f111839b = str2;
                        jf80Var2.f111842e = 3;
                        C1203a c1203aM18507s2 = ModificationRequest.Attributes.m18507s();
                        c1203aM18507s2.m18674q(strM64335k2);
                        objM62841f = ((n090) yz80Var2).m63323t(str2, c1203aM18507s2, jf80Var2);
                        if (objM62841f == yukVar) {
                            obj = objM62841f;
                            str3 = str2;
                            if (((p2x0) obj) instanceof m2x0) {
                                d850 d850VarM90963u3 = nf80Var.f153276b.m90963u(str3);
                                luk lukVar3 = nf80Var.f153284t;
                                rcy rcyVar3 = new rcy(nf80Var, str3, d850VarM90963u3, fbkVar, 24);
                                jf80Var2.f111838a = null;
                                jf80Var2.f111839b = null;
                                jf80Var2.f111842e = 4;
                            }
                        }
                    }
                }
                return yukVar;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m64333i(nf80 nf80Var, List list, ibk ibkVar) {
        kf80 kf80Var;
        Object next;
        Iterable iterable;
        fw80 fw80Var;
        Set set;
        String str;
        if (ibkVar instanceof kf80) {
            kf80Var = (kf80) ibkVar;
            int i = kf80Var.f122096f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kf80Var.f122096f = i - Integer.MIN_VALUE;
            } else {
                kf80Var = new kf80(nf80Var, ibkVar);
            }
        } else {
            kf80Var = new kf80(nf80Var, ibkVar);
        }
        Object obj = kf80Var.f122094d;
        int i2 = kf80Var.f122096f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((j6z) next).f109433d);
            j6z j6zVar = (j6z) next;
            Object value = nf80Var.f153268L0.f21119a.getValue();
            oho ohoVar = value instanceof oho ? (oho) value : null;
            if (ohoVar == null || (iterable = (Set) ohoVar.f165512a) == null) {
                iterable = gbu.f78413a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : iterable) {
                if (obj3 instanceof ts80) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ts80) it2.next()).f223241a);
            }
            Set setM43736n1 = g6f.m43736n1(arrayList2);
            fw80Var = new fw80(nf80Var.f153279e);
            if (j6zVar == null && !setM43736n1.isEmpty()) {
                kf80Var.f122091a = null;
                kf80Var.f122092b = null;
                kf80Var.f122096f = 1;
                if (nf80Var.m64337m(fw80Var, null, kf80Var) == obj2) {
                    return obj2;
                }
                return w2a1Var;
            }
            if (j6zVar != null) {
                String strM64334j = m64334j(j6zVar.f109430a);
                kf80Var.f122091a = setM43736n1;
                kf80Var.f122092b = fw80Var;
                kf80Var.f122093c = strM64334j;
                kf80Var.f122096f = 2;
                if (nf80Var.m64337m(fw80Var, strM64334j, kf80Var) != obj2) {
                    set = setM43736n1;
                    str = strM64334j;
                }
                return obj2;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
            return w2a1Var;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        str = kf80Var.f122093c;
        fw80Var = kf80Var.f122092b;
        set = kf80Var.f122091a;
        bga.m29073P(obj);
        if (!set.contains(str)) {
            ts80 ts80Var = new ts80(str);
            pgo pgoVar = nf80Var.f153275a;
            laz lazVar = laz.f131472t;
            cw80 cw80Var = new cw80(ts80Var);
            kf80Var.f122091a = null;
            kf80Var.f122092b = null;
            kf80Var.f122093c = null;
            kf80Var.f122096f = 3;
            if (pgoVar.mo25869e(lazVar, fw80Var, cw80Var, kf80Var) == obj2) {
                return obj2;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: j */
    public static String m64334j(String str) {
        return wl51.m88491o1(bm51.m29801l0(str, "tags contains ", "")).toString();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f153271O0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f153270N0;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f153269M0;
    }

    /* JADX INFO: renamed from: k */
    public final String m64335k() {
        return this.f153277c.getString(R.string.liked_songs_graduation_playlist_description, DateFormat.getDateInstance(3, Locale.getDefault()).format(new Date()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX INFO: renamed from: l */
    public final String m64336l(cf80 cf80Var) {
        Iterable iterable;
        String str;
        String strM43753y0;
        Object next;
        if (this.f153272X.m28873e()) {
            Iterator it = cf80Var.f37292a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                af80 af80Var = (af80) next;
                ze80 ze80Var = af80Var instanceof ze80 ? (ze80) af80Var : null;
                if (ze80Var != null && ze80Var.f281905d) {
                    break;
                }
            }
            af80 af80Var2 = (af80) next;
            if (af80Var2 != null) {
                strM43753y0 = ((ze80) af80Var2).f281902a;
            } else {
                strM43753y0 = null;
            }
        } else {
            Object value = this.f153268L0.f21119a.getValue();
            oho ohoVar = value instanceof oho ? (oho) value : null;
            if (ohoVar == null || (iterable = (Set) ohoVar.f165512a) == null) {
                iterable = gbu.f78413a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof ts80) {
                    arrayList.add(obj);
                }
            }
            ts80 ts80Var = (ts80) g6f.m43745s0(arrayList);
            if (ts80Var == null || (str = ts80Var.f223241a) == null) {
                strM43753y0 = null;
            } else {
                strM43753y0 = g6f.m43753y0(wl51.m88477a1(str, new String[]{" "}, 0, 6), " ", null, null, null, 62);
            }
        }
        if (strM43753y0 == null) {
            return null;
        }
        if (strM43753y0.length() <= 0) {
            return strM43753y0;
        }
        return ((Object) String.valueOf(strM43753y0.charAt(0)).toUpperCase(Locale.ROOT)) + strM43753y0.substring(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m64337m(fw80 fw80Var, String str, ibk ibkVar) {
        lf80 lf80Var;
        Iterable iterable;
        Iterator it;
        int i;
        if (ibkVar instanceof lf80) {
            lf80Var = (lf80) ibkVar;
            int i2 = lf80Var.f132850f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lf80Var.f132850f = i2 - Integer.MIN_VALUE;
            } else {
                lf80Var = new lf80(this, ibkVar);
            }
        } else {
            lf80Var = new lf80(this, ibkVar);
        }
        Object obj = lf80Var.f132848d;
        int i3 = lf80Var.f132850f;
        if (i3 == 0) {
            bga.m29073P(obj);
            Object value = this.f153268L0.f21119a.getValue();
            oho ohoVar = value instanceof oho ? (oho) value : null;
            if (ohoVar == null || (iterable = (Set) ohoVar.f165512a) == null) {
                iterable = gbu.f78413a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (obj2 instanceof ts80) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                ts80 ts80Var = (ts80) obj3;
                if (str == null || !wj50.m88271j(ts80Var.f223241a, str)) {
                    arrayList2.add(obj3);
                }
            }
            it = arrayList2.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = lf80Var.f132847c;
            it = lf80Var.f132846b;
            fw80 fw80Var2 = lf80Var.f132845a;
            bga.m29073P(obj);
            i = i4;
            fw80Var = fw80Var2;
        }
        while (it.hasNext()) {
            ts80 ts80Var2 = (ts80) it.next();
            laz lazVar = laz.f131472t;
            dw80 dw80Var = new dw80(ts80Var2);
            lf80Var.f132845a = fw80Var;
            lf80Var.f132846b = it;
            lf80Var.f132847c = i;
            lf80Var.f132850f = 1;
            Object objMo25869e = this.f153275a.mo25869e(lazVar, fw80Var, dw80Var, lf80Var);
            yuk yukVar = yuk.f276404a;
            if (objMo25869e == yukVar) {
                return yukVar;
            }
        }
        return w2a1.f247311a;
    }
}
