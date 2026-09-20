package p204p;

import com.spotify.player.model.PlayerState;
import com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class bau0 {

    /* JADX INFO: renamed from: a */
    public final er70 f25346a;

    /* JADX INFO: renamed from: b */
    public final Flowable f25347b;

    /* JADX INFO: renamed from: c */
    public final epx f25348c;

    /* JADX INFO: renamed from: d */
    public final sr6 f25349d;

    public bau0(er70 er70Var, Flowable flowable, epx epxVar, sr6 sr6Var) {
        this.f25346a = er70Var;
        this.f25347b = flowable;
        this.f25348c = epxVar;
        this.f25349d = sr6Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m28593a(String str, ibk ibkVar) {
        y9u0 y9u0Var;
        String str2;
        String str3;
        v140 v140Var;
        xaw xawVar;
        String string;
        vaw vawVar;
        u140 u140Var;
        if (ibkVar instanceof y9u0) {
            y9u0Var = (y9u0) ibkVar;
            int i = y9u0Var.f270658e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9u0Var.f270658e = i - Integer.MIN_VALUE;
            } else {
                y9u0Var = new y9u0(this, ibkVar);
            }
        } else {
            y9u0Var = new y9u0(this, ibkVar);
        }
        Object objM76980u = y9u0Var.f270656c;
        int i2 = y9u0Var.f270658e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            a7s0 a7s0Var = new a7s0(this, fbkVar, 9);
            y9u0Var.f270654a = str;
            y9u0Var.f270658e = 1;
            objM76980u = s1h1.m76980u(250L, a7s0Var, y9u0Var);
            if (objM76980u != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = y9u0Var.f270654a;
            bga.m29073P(objM76980u);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = y9u0Var.f270655b;
            str2 = y9u0Var.f270654a;
            bga.m29073P(objM76980u);
        }
        gqx gqxVar = (gqx) objM76980u;
        v140Var = (v140) gqxVar.mo45449a(v140.class, str3).f72301b;
        xawVar = (xaw) gqxVar.mo45449a(xaw.class, str3).f72301b;
        if (v140Var != null || (u140Var = v140Var.f236247e) == null || (string = u140Var.f225679b) == null) {
            if (xawVar != null || (vawVar = xawVar.f259777d) == null) {
                string = null;
            } else {
                string = vawVar.f239336b.toString();
            }
        }
        if (wj50.m88271j(string, str2)) {
            return str3;
        }
        return null;
        PlayerState playerState = (PlayerState) objM76980u;
        if (playerState != null) {
            String strM47210B = hdi.m47210B(playerState);
            if (strM47210B.length() <= 0) {
                strM47210B = null;
            }
            if (strM47210B != null) {
                Single singleFirstOrError = ((jpx) this.f25348c).m53978b(new C1668ai("ratings-runtime-consumption", false, (gh00) new j1r0(strM47210B, 25))).filter(mmq0.f145223f).firstOrError();
                y9u0Var.f270654a = str;
                y9u0Var.f270655b = strM47210B;
                y9u0Var.f270658e = 2;
                Object objM96567o = zn91.m96567o(singleFirstOrError, y9u0Var);
                if (objM96567o != yukVar) {
                    str2 = str;
                    str3 = strM47210B;
                    objM76980u = objM96567o;
                    gqx gqxVar2 = (gqx) objM76980u;
                    v140Var = (v140) gqxVar2.mo45449a(v140.class, str3).f72301b;
                    xawVar = (xaw) gqxVar2.mo45449a(xaw.class, str3).f72301b;
                    if (v140Var != null) {
                        if (xawVar != null) {
                            string = null;
                        } else {
                            string = null;
                        }
                    } else if (xawVar != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    if (wj50.m88271j(string, str2)) {
                        return str3;
                    }
                }
                return yukVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r7 == r4) goto L31;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m28594b(String str, ibk ibkVar) {
        z9u0 z9u0Var;
        if (ibkVar instanceof z9u0) {
            z9u0Var = (z9u0) ibkVar;
            int i = z9u0Var.f280889c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9u0Var.f280889c = i - Integer.MIN_VALUE;
            } else {
                z9u0Var = new z9u0(this, ibkVar);
            }
        } else {
            z9u0Var = new z9u0(this, ibkVar);
        }
        Object objM28593a = z9u0Var.f280887a;
        int i2 = z9u0Var.f280889c;
        Object obj = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bga.m29073P(objM28593a);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM28593a);
                }
                return (Long) objM28593a;
            }
            bga.m29073P(objM28593a);
            if (!((jn4) this.f25346a.get()).m53806a()) {
                return null;
            }
            z9u0Var.f280889c = 1;
            objM28593a = m28593a(str, z9u0Var);
            if (objM28593a == obj) {
            }
            return obj;
            String str2 = (String) objM28593a;
            if (str2 == null) {
                return null;
            }
            sit0 sit0VarM20426p = QueryRuntimeConsumptionRequest.m20426p();
            sit0VarM20426p.m78240m(str2);
            sit0VarM20426p.m78241q();
            QueryRuntimeConsumptionRequest queryRuntimeConsumptionRequest = (QueryRuntimeConsumptionRequest) sit0VarM20426p.build();
            wj50.m88279p(queryRuntimeConsumptionRequest);
            z9u0Var.f280889c = 2;
            objM28593a = m28595c(queryRuntimeConsumptionRequest, z9u0Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m28595c(QueryRuntimeConsumptionRequest queryRuntimeConsumptionRequest, ibk ibkVar) {
        aau0 aau0Var;
        if (ibkVar instanceof aau0) {
            aau0Var = (aau0) ibkVar;
            int i = aau0Var.f13929c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aau0Var.f13929c = i - Integer.MIN_VALUE;
            } else {
                aau0Var = new aau0(this, ibkVar);
            }
        } else {
            aau0Var = new aau0(this, ibkVar);
        }
        Object objM76980u = aau0Var.f13927a;
        int i2 = aau0Var.f13929c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                l7t0 l7t0Var = new l7t0(this, queryRuntimeConsumptionRequest, fbkVar, 5);
                aau0Var.f13929c = 1;
                objM76980u = s1h1.m76980u(250L, l7t0Var, aau0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            return (Long) objM76980u;
        } catch (CancellationException unused) {
            qlg1.m73220y(aau0Var.getContext());
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
