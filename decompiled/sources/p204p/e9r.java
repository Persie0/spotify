package p204p;

import android.os.SystemClock;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationFixOutcome;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class e9r {

    /* JADX INFO: renamed from: a */
    public final cha0 f57510a;

    /* JADX INFO: renamed from: b */
    public final o7r f57511b;

    /* JADX INFO: renamed from: c */
    public final xre f57512c;

    /* JADX INFO: renamed from: d */
    public final b7r f57513d;

    /* JADX INFO: renamed from: e */
    public final g2a1 f57514e;

    /* JADX INFO: renamed from: f */
    public final t4j f57515f;

    /* JADX INFO: renamed from: g */
    public final n7r f57516g;

    public e9r(cha0 cha0Var, o7r o7rVar, xre xreVar, b7r b7rVar, g2a1 g2a1Var, t4j t4jVar, n7r n7rVar) {
        this.f57510a = cha0Var;
        this.f57511b = o7rVar;
        this.f57512c = xreVar;
        this.f57513d = b7rVar;
        this.f57514e = g2a1Var;
        this.f57515f = t4jVar;
        this.f57516g = n7rVar;
    }

    /* JADX INFO: renamed from: a */
    public final g7r m38258a() {
        g7r g7rVar = this.f57513d.f24373a;
        if (g7rVar == null) {
            return null;
        }
        ((wy3) this.f57512c).getClass();
        if (System.currentTimeMillis() - g7rVar.m43920b() < y8a0.m93096a(1)) {
            return g7rVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if (r0 == r5) goto L48;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38259b(long j, String str, ibk ibkVar) {
        c9r c9rVar;
        String str2;
        long j2;
        long j3;
        String str3;
        String str4;
        String str5;
        if (ibkVar instanceof c9r) {
            c9rVar = (c9r) ibkVar;
            int i = c9rVar.f35622f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9rVar.f35622f = i - Integer.MIN_VALUE;
            } else {
                c9rVar = new c9r(this, ibkVar);
            }
        } else {
            c9rVar = new c9r(this, ibkVar);
        }
        Object objM76978s = c9rVar.f35620d;
        Object obj = yuk.f276404a;
        int i2 = c9rVar.f35622f;
        fbk fbkVar = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = c9rVar.f35618b;
                    j3 = c9rVar.f35617a;
                    str2 = c9rVar.f35619c;
                    try {
                        bga.m29073P(objM76978s);
                    } catch (SecurityException unused) {
                        n7r n7rVar = this.f57516g;
                        ((wy3) this.f57512c).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
                        if (str2 == null) {
                            str5 = "unspecified";
                        } else {
                            str5 = str2;
                        }
                        n7rVar.m63808c(2, "securityException", str5, jElapsedRealtime);
                        return x8r.f259211a;
                    } catch (TimeoutCancellationException unused2) {
                        n7r n7rVar2 = this.f57516g;
                        ((wy3) this.f57512c).getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
                        if (str2 == null) {
                            str4 = "unspecified";
                        } else {
                            str4 = str2;
                        }
                        n7rVar2.m63808c(1, "", str4, jElapsedRealtime2);
                        return y8r.f270359a;
                    } catch (Exception e) {
                        e = e;
                        n7r n7rVar3 = this.f57516g;
                        String simpleName = e.getClass().getSimpleName();
                        ((wy3) this.f57512c).getClass();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j2;
                        if (str2 == null) {
                            str3 = "unspecified";
                        } else {
                            str3 = str2;
                        }
                        n7rVar3.m63808c(3, simpleName, str3, jElapsedRealtime3);
                        return new v8r(new i7r(e));
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76978s);
                }
                int iOrdinal = ((ima0) objM76978s).ordinal();
                if (iOrdinal == 0) {
                    return a9r.f13625a;
                }
                if (iOrdinal == 1) {
                    return new z8r();
                }
                throw new NoWhenBranchMatchedException();
            }
            bga.m29073P(objM76978s);
            ((wy3) this.f57512c).getClass();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            try {
                xuo xuoVar = new xuo(this, fbkVar, 26);
                str2 = str;
                try {
                    c9rVar.f35619c = str2;
                    c9rVar.f35617a = j;
                    c9rVar.f35618b = jElapsedRealtime4;
                    c9rVar.f35622f = 1;
                    objM76978s = s1h1.m76978s(j, xuoVar, c9rVar);
                    if (objM76978s != obj) {
                        j3 = j;
                        j2 = jElapsedRealtime4;
                    }
                    return obj;
                } catch (SecurityException unused3) {
                    j2 = jElapsedRealtime4;
                    n7r n7rVar4 = this.f57516g;
                    ((wy3) this.f57512c).getClass();
                    long jElapsedRealtime5 = SystemClock.elapsedRealtime() - j2;
                    if (str2 == null) {
                        str5 = "unspecified";
                    } else {
                        str5 = str2;
                    }
                    n7rVar4.m63808c(2, "securityException", str5, jElapsedRealtime5);
                    return x8r.f259211a;
                } catch (TimeoutCancellationException unused4) {
                    j2 = jElapsedRealtime4;
                    n7r n7rVar5 = this.f57516g;
                    ((wy3) this.f57512c).getClass();
                    long jElapsedRealtime6 = SystemClock.elapsedRealtime() - j2;
                    if (str2 == null) {
                        str4 = "unspecified";
                    } else {
                        str4 = str2;
                    }
                    n7rVar5.m63808c(1, "", str4, jElapsedRealtime6);
                    return y8r.f270359a;
                } catch (Exception e2) {
                    e = e2;
                    j2 = jElapsedRealtime4;
                    n7r n7rVar6 = this.f57516g;
                    String simpleName2 = e.getClass().getSimpleName();
                    ((wy3) this.f57512c).getClass();
                    long jElapsedRealtime7 = SystemClock.elapsedRealtime() - j2;
                    if (str2 == null) {
                        str3 = "unspecified";
                    } else {
                        str3 = str2;
                    }
                    n7rVar6.m63808c(3, simpleName2, str3, jElapsedRealtime7);
                    return new v8r(new i7r(e));
                }
            } catch (SecurityException unused5) {
                str2 = str;
            } catch (TimeoutCancellationException unused6) {
                str2 = str;
            } catch (Exception e3) {
                e = e3;
                str2 = str;
            }
            g7r g7rVar = (g7r) objM76978s;
            ((wy3) this.f57512c).getClass();
            long jElapsedRealtime8 = SystemClock.elapsedRealtime() - j2;
            if (g7rVar == null) {
                this.f57516g.m63808c(3, "locationUnavailable", str2 == null ? "unspecified" : str2, jElapsedRealtime8);
                return new v8r(h7r.f88516a);
            }
            n7r n7rVar7 = this.f57516g;
            double dM43919a = g7rVar.m43919a();
            String str6 = str2 == null ? "unspecified" : str2;
            qre0 qre0Var = n7rVar7.f151203a;
            m7r m7rVarM9244t = DeviceLocationFixOutcome.m9244t();
            m7rVarM9244t.m61084q(jElapsedRealtime8);
            m7rVarM9244t.m61086s();
            m7rVarM9244t.m61088u(str6.length() != 0 ? str6 : "unspecified");
            m7rVarM9244t.m61087t(SearchEndpointResponseKt.RESULT_SUCCESS);
            m7rVarM9244t.m61085r("");
            m7rVarM9244t.m61083m(dM43919a);
            qre0Var.m73616a(m7rVarM9244t.build());
            this.f57513d.f24373a = g7rVar;
            g2a1 g2a1Var = this.f57514e;
            c9rVar.f35619c = null;
            c9rVar.f35617a = j3;
            c9rVar.f35618b = j2;
            c9rVar.f35622f = 2;
            objM76978s = g2a1Var.m43383o(g7rVar, str2, c9rVar);
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m38260c(long j, String str, ibk ibkVar) {
        d9r d9rVar;
        Object objM87199a;
        if (ibkVar instanceof d9r) {
            d9rVar = (d9r) ibkVar;
            int i = d9rVar.f46887e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9rVar.f46887e = i - Integer.MIN_VALUE;
            } else {
                d9rVar = new d9r(this, ibkVar);
            }
        } else {
            d9rVar = new d9r(this, ibkVar);
        }
        Object obj = d9rVar.f46885c;
        int i2 = d9rVar.f46887e;
        o7r o7rVar = this.f57511b;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!o7rVar.mo66382a()) {
                return w8r.f248996a;
            }
            d9rVar.f46884b = str;
            d9rVar.f46883a = j;
            d9rVar.f46887e = 1;
            objM87199a = ((w4j) this.f57515f).m87199a("fetch_consent_gate", d9rVar);
            if (objM87199a != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        j = d9rVar.f46883a;
        str = d9rVar.f46884b;
        bga.m29073P(obj);
        objM87199a = ((s6x0) obj).f206218a;
        Throwable thM77348a = s6x0.m77348a(objM87199a);
        if (thM77348a != null) {
            if (str == null) {
                str = "unspecified";
            }
            this.f57516g.m63808c(3, "consentLoadFailed", str, 0L);
            return new v8r(new i7r(thM77348a));
        }
        a5j a5jVar = (a5j) objM87199a;
        if (a5jVar == a5j.f12525b) {
            return u8r.f228001a;
        }
        if (a5jVar != a5j.f12526c) {
            return t8r.f218125a;
        }
        if (!o7rVar.m66383b()) {
            return x8r.f259211a;
        }
        d9rVar.f46884b = null;
        d9rVar.f46883a = j;
        d9rVar.f46887e = 2;
        Object objM38259b = m38259b(j, str, d9rVar);
        return objM38259b == obj2 ? obj2 : objM38259b;
    }
}
