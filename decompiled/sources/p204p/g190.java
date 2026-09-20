package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class g190 {

    /* JADX INFO: renamed from: f */
    public static final long f75552f;

    /* JADX INFO: renamed from: g */
    public static final long f75553g;

    /* JADX INFO: renamed from: a */
    public final wt80 f75554a;

    /* JADX INFO: renamed from: b */
    public final yz80 f75555b;

    /* JADX INFO: renamed from: c */
    public final vzx f75556c;

    /* JADX INFO: renamed from: d */
    public final myx f75557d;

    /* JADX INFO: renamed from: e */
    public final voi f75558e;

    static {
        hvi0 hvi0Var = cks.f39079b;
        ils ilsVar = ils.SECONDS;
        f75552f = jwg1.m54449D(4, ilsVar);
        f75553g = jwg1.m54449D(3, ilsVar);
    }

    public g190(wt80 wt80Var, yz80 yz80Var, vzx vzxVar, myx myxVar, voi voiVar) {
        this.f75554a = wt80Var;
        this.f75555b = yz80Var;
        this.f75556c = vzxVar;
        this.f75557d = myxVar;
        this.f75558e = voiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m43347a(g190 g190Var, uzx uzxVar, String str, ibk ibkVar) {
        d190 d190Var;
        if (ibkVar instanceof d190) {
            d190Var = (d190) ibkVar;
            int i = d190Var.f44206c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d190Var.f44206c = i - Integer.MIN_VALUE;
            } else {
                d190Var = new d190(g190Var, ibkVar);
            }
        } else {
            d190Var = new d190(g190Var, ibkVar);
        }
        Object objM76981v = d190Var.f44204a;
        int i2 = d190Var.f44206c;
        long j = f75552f;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            api apiVarM77296c = ((s5p) g190Var.f75558e).m77296c();
            if (apiVarM77296c != null && !apiVarM77296c.mo26697m() && apiVarM77296c.getType() == xfr.f261063L0) {
                uzxVar.f235651a.f246566f.m43245b(str);
                q950 q950Var = new q950(g190Var, null, 21);
                d190Var.f44206c = 1;
                objM76981v = s1h1.m76981v(j, q950Var, d190Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM76981v);
        if (((xul0) objM76981v) == null) {
            Logger.m3973i("Active entity did not settle to self within %s before listEndpoint.play; continuing anyway", new cks(j));
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m43348b(g190 g190Var, String str, Boolean bool, ibk ibkVar) {
        e190 e190Var;
        String str2;
        Boolean bool2;
        if (ibkVar instanceof e190) {
            e190Var = (e190) ibkVar;
            int i = e190Var.f55152e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e190Var.f55152e = i - Integer.MIN_VALUE;
            } else {
                e190Var = new e190(g190Var, ibkVar);
            }
        } else {
            e190Var = new e190(g190Var, ibkVar);
        }
        Object objM76981v = e190Var.f55150c;
        int i2 = e190Var.f55152e;
        long j = f75553g;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            if (bool != null) {
                i090 i090Var = new i090((Object) g190Var, str, (Object) bool, (fbk) null, 4);
                e190Var.f55148a = str;
                e190Var.f55149b = bool;
                e190Var.f55152e = 1;
                objM76981v = s1h1.m76981v(j, i090Var, e190Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
                str2 = str;
                bool2 = bool;
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bool2 = e190Var.f55149b;
        str2 = e190Var.f55148a;
        bga.m29073P(objM76981v);
        p2x0 p2x0Var = (p2x0) objM76981v;
        if (p2x0Var == null) {
            Logger.m3973i("setLens(enhance, %s) timed out within %s for %s; continuing without lens update", bool2, new cks(j), str2);
            return w2a1Var;
        }
        if (p2x0Var instanceof k2x0) {
            Logger.m3973i("setLens(enhance, %s) failed for %s: %s", bool2, str2, ((k2x0) p2x0Var).f118699a);
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m43349c(oso0 oso0Var, st80 st80Var, ibk ibkVar) {
        f190 f190Var;
        if (ibkVar instanceof f190) {
            f190Var = (f190) ibkVar;
            int i = f190Var.f64822c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f190Var.f64822c = i - Integer.MIN_VALUE;
            } else {
                f190Var = new f190(this, ibkVar);
            }
        } else {
            f190Var = new f190(this, ibkVar);
        }
        Object objM88284w = f190Var.f64820a;
        int i2 = f190Var.f64822c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM88284w);
                onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
                if (oso0Var.m67745f() != null || oso0Var.m67748i() != null) {
                    njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
                    Boolean boolM67745f = oso0Var.m67745f();
                    if (boolM67745f != null) {
                        boolean zBooleanValue = boolM67745f.booleanValue();
                        tmw tmwVarM17771o = EsOptional$OptionalBoolean.m17771o();
                        tmwVarM17771o.m81146m(zBooleanValue);
                        njwVarM17688r.m64644u(tmwVarM17771o);
                    }
                    if (oso0Var.m67748i() != null) {
                        String str = wj50.m88271j(oso0Var.m67748i(), Boolean.TRUE) ? "RECOMMENDATION" : "NONE";
                        njwVarM17688r.m64640q("context_enhancement", str);
                        njwVarM17688r.m64640q("original_enhancement_mode", str);
                    }
                    onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
                }
                if (oso0Var.m67746g() != null) {
                    xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
                    xowVarM18009u.m91568s(oso0Var.m67746g());
                    String strM67747h = oso0Var.m67747h();
                    if (strM67747h != null) {
                        xowVarM18009u.m91569t(strM67747h);
                    }
                    onwVarM17830E.m67428D(xowVarM18009u);
                } else if (oso0Var.m67747h() != null) {
                    xow xowVarM18009u2 = EsSkipToTrack$SkipToTrack.m18009u();
                    xowVarM18009u2.m91569t(oso0Var.m67747h());
                    onwVarM17830E.m67428D(xowVarM18009u2);
                }
                Long lM67744e = oso0Var.m67744e();
                if (lM67744e != null) {
                    long jLongValue = lM67744e.longValue();
                    umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
                    umwVarM17777q.m83492m(jLongValue);
                    onwVarM17830E.m67440z((EsOptional$OptionalInt64) umwVarM17777q.build());
                }
                EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
                dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
                dnwVarM17804F.m36494s("wearos");
                String strM67743d = oso0Var.m67743d();
                if (strM67743d != null) {
                    dnwVarM17804F.m36496u(strM67743d);
                }
                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
                ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
                String strM67741b = oso0Var.m67741b();
                if (strM67741b != null) {
                    ilwVarM17768t.m51043m(strM67741b);
                }
                String strM67742c = oso0Var.m67742c();
                if (strM67742c != null) {
                    ilwVarM17768t.m51044q(strM67742c);
                }
                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
                vzx vzxVar = this.f75556c;
                is80 is80Var = is80.f105164R0;
                eq0 eq0Var = new eq0(this, oso0Var, st80Var, esPreparePlayOptions$PreparePlayOptions, esPlayOrigin$PlayOrigin, esLoggingParams$LoggingParams, (fbk) null);
                f190Var.f64822c = 1;
                objM88284w = wj50.m88284w(vzxVar, is80Var, null, eq0Var, f190Var);
                yuk yukVar = yuk.f276404a;
                if (objM88284w == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88284w);
            }
            return (ufo) objM88284w;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m3967c(th, "listEndpoint.play failed; returning error DataLayerResponse", new Object[0]);
            tfo tfoVar = ufo.Companion;
            String message = th.getMessage();
            if (message == null) {
                message = "listEndpoint.play failed";
            }
            tfoVar.getClass();
            return tfo.m80701a(message);
        }
    }
}
