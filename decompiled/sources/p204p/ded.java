package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ded implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ er70 f48055a;

    public ded(er70 er70Var) {
        this.f48055a = er70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r11.mo30229d(r10, r0) == r5) goto L35;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ced cedVar;
        mcd mcdVar;
        Object objMo27271a;
        mcd mcdVar2;
        tv01 tv01Var;
        rv01 rv01Var;
        pv01 pv01VarM59161m;
        if (ibkVar instanceof ced) {
            cedVar = (ced) ibkVar;
            int i = cedVar.f37080b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cedVar.f37080b = i - Integer.MIN_VALUE;
            } else {
                cedVar = new ced(this, ibkVar);
            }
        } else {
            cedVar = new ced(this, ibkVar);
        }
        Object obj2 = cedVar.f37079a;
        int i2 = cedVar.f37080b;
        rv01 rv01Var2 = yu01.f276244a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                mcdVar = (mcd) obj;
                tv01 tv01Var2 = new tv01(mcdVar.f142130a, mcdVar.f142131b, 4);
                try {
                    uv01 uv01Var = (uv01) this.f48055a.get();
                    List listSingletonList = Collections.singletonList(tv01Var2);
                    cedVar.f37082d = bqz0Var;
                    cedVar.f37083e = mcdVar;
                    cedVar.f37084f = tv01Var2;
                    cedVar.f37080b = 1;
                    objMo27271a = uv01Var.mo27271a(listSingletonList, cedVar);
                    if (objMo27271a != yukVar) {
                        mcdVar2 = mcdVar;
                        tv01Var = tv01Var2;
                        rv01Var = (rv01) ((Map) objMo27271a).get(tv01Var);
                        if (rv01Var != null) {
                            rv01Var2 = pv01VarM59161m;
                        }
                        idd iddVar = new idd(mcdVar2.f142130a, mcdVar2.f142131b, rv01Var2);
                        cedVar.f37082d = null;
                        cedVar.f37083e = null;
                        cedVar.f37084f = null;
                        cedVar.f37080b = 2;
                    }
                } catch (Exception unused) {
                    mcdVar2 = mcdVar;
                    idd iddVar2 = new idd(mcdVar2.f142130a, mcdVar2.f142131b, rv01Var2);
                    cedVar.f37082d = null;
                    cedVar.f37083e = null;
                    cedVar.f37084f = null;
                    cedVar.f37080b = 2;
                }
                return yukVar;
            }
            if (i2 == 1) {
                tv01Var = cedVar.f37084f;
                mcd mcdVar3 = cedVar.f37083e;
                bqz0 bqz0Var2 = cedVar.f37082d;
                try {
                    bga.m29073P(obj2);
                    mcdVar2 = mcdVar3;
                    bqz0Var = bqz0Var2;
                    objMo27271a = obj2;
                    try {
                        rv01Var = (rv01) ((Map) objMo27271a).get(tv01Var);
                        if (rv01Var != null && (pv01VarM59161m = ljf1.m59161m(rv01Var)) != null) {
                            rv01Var2 = pv01VarM59161m;
                        }
                    } catch (Exception unused2) {
                        mcdVar = mcdVar2;
                        mcdVar2 = mcdVar;
                    }
                } catch (Exception unused3) {
                    mcdVar = mcdVar3;
                    bqz0Var = bqz0Var2;
                    mcdVar2 = mcdVar;
                    idd iddVar3 = new idd(mcdVar2.f142130a, mcdVar2.f142131b, rv01Var2);
                    cedVar.f37082d = null;
                    cedVar.f37083e = null;
                    cedVar.f37084f = null;
                    cedVar.f37080b = 2;
                }
                idd iddVar4 = new idd(mcdVar2.f142130a, mcdVar2.f142131b, rv01Var2);
                cedVar.f37082d = null;
                cedVar.f37083e = null;
                cedVar.f37084f = null;
                cedVar.f37080b = 2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
