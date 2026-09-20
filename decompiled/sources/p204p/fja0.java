package p204p;

import com.spotify.liveeventslocation.p099v1.userlocation.StoreUserLocationRequest;
import com.spotify.liveeventslocation.p099v1.userlocation.StoreUserLocationResponse;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class fja0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rb5 f70136a;

    public fja0(rb5 rb5Var) {
        this.f70136a = rb5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L28;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        eja0 eja0Var;
        yja0 yja0Var;
        if (ibkVar instanceof eja0) {
            eja0Var = (eja0) ibkVar;
            int i = eja0Var.f60171b;
            if ((i & Integer.MIN_VALUE) != 0) {
                eja0Var.f60171b = i - Integer.MIN_VALUE;
            } else {
                eja0Var = new eja0(this, ibkVar);
            }
        } else {
            eja0Var = new eja0(this, ibkVar);
        }
        Object objM36399b = eja0Var.f60170a;
        int i2 = eja0Var.f60171b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = eja0Var.f60173d;
                    bga.m29073P(objM36399b);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM36399b);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM36399b);
            gia0 gia0Var = (gia0) obj;
            if (gia0Var.f80115c.equals(d510.f45297c)) {
                throw new IllegalStateException("Location is empty");
            }
            rb5 rb5Var = this.f70136a;
            int i3 = gia0Var.f80115c.f45299b;
            eja0Var.f60173d = bqz0Var;
            eja0Var.f60171b = 1;
            g951 g951VarM13059o = StoreUserLocationRequest.m13059o();
            g951VarM13059o.m44007m(String.valueOf(i3));
            StoreUserLocationRequest storeUserLocationRequest = (StoreUserLocationRequest) g951VarM13059o.build();
            dm90 dm90Var = (dm90) rb5Var.f197471b;
            wj50.m88279p(storeUserLocationRequest);
            objM36399b = dm90Var.m36399b(storeUserLocationRequest, eja0Var);
            if (objM36399b == yukVar) {
            }
            return yukVar;
            yja0Var = new yja0(((StoreUserLocationResponse) objM36399b).m13060n());
        } catch (Exception unused) {
            yja0Var = new yja0(false);
        }
        eja0Var.f60173d = null;
        eja0Var.f60171b = 2;
    }
}
