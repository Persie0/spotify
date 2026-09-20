package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class xtn0 implements l8d0 {

    /* JADX INFO: renamed from: a */
    public final fun0 f265894a;

    /* JADX INFO: renamed from: b */
    public final sti f265895b;

    public xtn0(fun0 fun0Var, sti stiVar) {
        this.f265894a = fun0Var;
        this.f265895b = stiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m92106c(xtn0 xtn0Var, List list, ibk ibkVar) {
        vtn0 vtn0Var;
        if (ibkVar instanceof vtn0) {
            vtn0Var = (vtn0) ibkVar;
            int i = vtn0Var.f244737d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vtn0Var.f244737d = i - Integer.MIN_VALUE;
            } else {
                vtn0Var = new vtn0(xtn0Var, ibkVar);
            }
        } else {
            vtn0Var = new vtn0(xtn0Var, ibkVar);
        }
        Object objM79283i0 = vtn0Var.f244735b;
        int i2 = vtn0Var.f244737d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79283i0);
                sti stiVar = xtn0Var.f265895b;
                vtn0Var.f244734a = list;
                vtn0Var.f244737d = 1;
                objM79283i0 = stiVar.m79283i0(list, vtn0Var);
                Object obj = yuk.f276404a;
                if (objM79283i0 == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = vtn0Var.f244734a;
                bga.m29073P(objM79283i0);
            }
            return (List) objM79283i0;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3974j(e2, "Subtitle decoration failed", new Object[0]);
            return list;
        }
    }

    @Override // p204p.cxx
    /* JADX INFO: renamed from: a */
    public final Observable mo28057a(roa roaVar) {
        return k0e1.m54988g(new q4n0(k0e1.m54985d(this.f265894a.m42741e(roaVar, 1)), this, 1), dau.f47107a);
    }

    @Override // p204p.cxx
    /* JADX INFO: renamed from: b */
    public final Single mo24638b(roa roaVar) {
        return vjf1.m85770t(dau.f47107a, new d2n0(this, roaVar, (fbk) null, 8));
    }
}
