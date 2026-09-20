package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class ani implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kni f17446a;

    public ani(kni kniVar) {
        this.f17446a = kniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r8.mo30229d(r9, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        zmi zmiVar;
        if (ibkVar instanceof zmi) {
            zmiVar = (zmi) ibkVar;
            int i = zmiVar.f284295b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zmiVar.f284295b = i - Integer.MIN_VALUE;
            } else {
                zmiVar = new zmi(this, ibkVar);
            }
        } else {
            zmiVar = new zmi(this, ibkVar);
        }
        Object objM57048u = zmiVar.f284294a;
        int i2 = zmiVar.f284295b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = zmiVar.f284297d;
                bga.m29073P(objM57048u);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM57048u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM57048u);
        ugz ugzVar = this.f17446a.f124413a;
        zmiVar.f284297d = bqz0Var;
        zmiVar.f284295b = 1;
        objM57048u = kpg1.m57048u(new zmy(ugzVar, (uji) obj, fbkVar, 8), dm70.f50460d, gn70.f81617b, zmiVar);
        if (objM57048u != yukVar) {
        }
        return yukVar;
        zmiVar.f284297d = null;
        zmiVar.f284295b = 2;
    }
}
