package p204p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class hm90 implements w111 {

    /* JADX INFO: renamed from: a */
    public final ugi f92862a;

    /* JADX INFO: renamed from: b */
    public final flw0 f92863b;

    public hm90(ugi ugiVar, flw0 flw0Var) {
        this.f92862a = ugiVar;
        this.f92863b = flw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47935a(lu01 lu01Var, ibk ibkVar) {
        fm90 fm90Var;
        if (ibkVar instanceof fm90) {
            fm90Var = (fm90) ibkVar;
            int i = fm90Var.f70994c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fm90Var.f70994c = i - Integer.MIN_VALUE;
            } else {
                fm90Var = new fm90(this, ibkVar);
            }
        } else {
            fm90Var = new fm90(this, ibkVar);
        }
        Object objM42025i = fm90Var.f70992a;
        int i2 = fm90Var.f70994c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM42025i);
                flw0 flw0Var = this.f92863b;
                fm90Var.f70994c = 1;
                objM42025i = flw0Var.m42025i(lu01Var, fm90Var);
                yuk yukVar = yuk.f276404a;
                if (objM42025i == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM42025i);
            }
            return (sr01) objM42025i;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m47936b(String str, ibk ibkVar) {
        gm90 gm90Var;
        gcr0 gcr0Var;
        if (ibkVar instanceof gm90) {
            gm90Var = (gm90) ibkVar;
            int i = gm90Var.f81336c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gm90Var.f81336c = i - Integer.MIN_VALUE;
            } else {
                gm90Var = new gm90(this, ibkVar);
            }
        } else {
            gm90Var = new gm90(this, ibkVar);
        }
        Object objM47935a = gm90Var.f81334a;
        int i2 = gm90Var.f81336c;
        if (i2 == 0) {
            bga.m29073P(objM47935a);
            if (this.f92862a.f230189s) {
                lu01 lu01Var = new lu01(str, null, null, null, null, null, null, 126);
                gm90Var.f81336c = 1;
                objM47935a = m47935a(lu01Var, gm90Var);
                Object obj = yuk.f276404a;
                if (objM47935a == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM47935a);
        sr01 sr01Var = (sr01) objM47935a;
        if (sr01Var != null) {
            as01 as01Var = sr01Var.f213202b.f154745b;
            so8 so8Var = as01Var instanceof so8 ? (so8) as01Var : null;
            if (so8Var != null && (gcr0Var = so8Var.f211129b) != null) {
                return new hxw0(gcr0Var.f78646a, gcr0Var.f78647b);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public final Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        em90 em90Var;
        lu01 lu01Var;
        Object c6x0Var;
        if (fbkVar instanceof em90) {
            em90Var = (em90) fbkVar;
            int i = em90Var.f60856c;
            if ((i & Integer.MIN_VALUE) != 0) {
                em90Var.f60856c = i - Integer.MIN_VALUE;
            } else {
                em90Var = new em90(this, (ibk) fbkVar);
            }
        } else {
            em90Var = new em90(this, (ibk) fbkVar);
        }
        Object objM47935a = em90Var.f60854a;
        int i2 = em90Var.f60856c;
        if (i2 == 0) {
            bga.m29073P(objM47935a);
            if (this.f92862a.f230189s && (lu01Var = eo01Var.f61264a) != null) {
                try {
                    Set set = dd41.f47702f;
                    c6x0Var = r46.m74726U(lu01Var.f136946a).f47709c;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = null;
                }
                gn80 gn80Var = (gn80) c6x0Var;
                if (gn80Var == gn80.CONCERT || gn80Var == gn80.CONCERT_CAMPAIGN) {
                    em90Var.f60856c = 1;
                    objM47935a = m47935a(lu01Var, em90Var);
                    Object obj = yuk.f276404a;
                    if (objM47935a == obj) {
                        return obj;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM47935a);
        sr01 sr01Var = (sr01) objM47935a;
        if (sr01Var != null) {
            return new e211(Collections.singletonList(sr01Var), 0, fji.f70297b, "live-events-share-format-handler");
        }
        return null;
    }
}
