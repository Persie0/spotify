package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.AddressCollection;
import com.spotify.address.endpoint.model.p012v1.proto.RequestDetails;
import com.spotify.base.java.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public final class xqt {

    /* JADX INFO: renamed from: a */
    public final qw1 f265110a;

    /* JADX INFO: renamed from: b */
    public final lw1 f265111b;

    /* JADX INFO: renamed from: c */
    public final t0h1 f265112c;

    /* JADX INFO: renamed from: d */
    public final luk f265113d;

    /* JADX INFO: renamed from: e */
    public final ujr0 f265114e;

    public xqt(qw1 qw1Var, lw1 lw1Var, t0h1 t0h1Var, luk lukVar, ujr0 ujr0Var) {
        this.f265110a = qw1Var;
        this.f265111b = lw1Var;
        this.f265112c = t0h1Var;
        this.f265113d = lukVar;
        this.f265114e = ujr0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final RequestDetails m91901a(xqt xqtVar) {
        qw1 qw1Var = xqtVar.f265110a;
        if (!(qw1Var instanceof ow1)) {
            if (qw1Var instanceof pw1) {
                return AddressCollection.m2343w(((pw1) qw1Var).f181877d.m1913r()).m2347s();
            }
            throw new NoWhenBranchMatchedException();
        }
        tuw0 tuw0VarM2446t = RequestDetails.m2446t();
        ow1 ow1Var = (ow1) qw1Var;
        tuw0VarM2446t.m81595q(ow1Var.f170614d);
        tuw0VarM2446t.m81596r(ow1Var.f170615e);
        tuw0VarM2446t.m81594m();
        return (RequestDetails) tuw0VarM2446t.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Object m91902b(xqt xqtVar, ibk ibkVar) {
        uqt uqtVar;
        if (ibkVar instanceof uqt) {
            uqtVar = (uqt) ibkVar;
            int i = uqtVar.f233108c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqtVar.f233108c = i - Integer.MIN_VALUE;
            } else {
                uqtVar = new uqt(xqtVar, ibkVar);
            }
        } else {
            uqtVar = new uqt(xqtVar, ibkVar);
        }
        Object objM83292a = uqtVar.f233106a;
        int i2 = uqtVar.f233108c;
        Object[] objArr = 0;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83292a);
                ujr0 ujr0Var = xqtVar.f265114e;
                laj lajVar = new laj(xqtVar, objArr == true ? 1 : 0, 15);
                uqtVar.f233108c = 1;
                objM83292a = ujr0Var.m83292a(lajVar, uqtVar);
                yuk yukVar = yuk.f276404a;
                if (objM83292a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83292a);
            }
            return (k3x) objM83292a;
        } catch (Exception e) {
            Logger.m3967c(e, "Error loading the Address form", new Object[0]);
            HttpException httpException = e instanceof HttpException ? (HttpException) e : null;
            return new ytw(httpException != null ? new Integer(httpException.f288164a) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m91903c(xqt xqtVar, hjt hjtVar, ibk ibkVar) {
        vqt vqtVar;
        if (ibkVar instanceof vqt) {
            vqtVar = (vqt) ibkVar;
            int i = vqtVar.f243999c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqtVar.f243999c = i - Integer.MIN_VALUE;
            } else {
                vqtVar = new vqt(xqtVar, ibkVar);
            }
        } else {
            vqtVar = new vqt(xqtVar, ibkVar);
        }
        Object objM83292a = vqtVar.f243997a;
        int i2 = vqtVar.f243999c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83292a);
                ujr0 ujr0Var = xqtVar.f265114e;
                gs3 gs3Var = new gs3(xqtVar, hjtVar, null, 27);
                vqtVar.f243999c = 1;
                objM83292a = ujr0Var.m83292a(gs3Var, vqtVar);
                yuk yukVar = yuk.f276404a;
                if (objM83292a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83292a);
            }
            return (k3x) objM83292a;
        } catch (Exception e) {
            Logger.m3967c(e, "Error saving the Address form", new Object[0]);
            return l0x.f128528a;
        }
    }
}
