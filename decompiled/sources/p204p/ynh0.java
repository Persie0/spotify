package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class ynh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ coh0 f274460a;

    public ynh0(coh0 coh0Var) {
        this.f274460a = coh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xnh0 xnh0Var;
        fiz fizVarM34374j;
        if (ibkVar instanceof xnh0) {
            xnh0Var = (xnh0) ibkVar;
            int i = xnh0Var.f263618b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnh0Var.f263618b = i - Integer.MIN_VALUE;
            } else {
                xnh0Var = new xnh0(this, ibkVar);
            }
        } else {
            xnh0Var = new xnh0(this, ibkVar);
        }
        Object obj2 = xnh0Var.f263617a;
        int i2 = xnh0Var.f263618b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            bxb bxbVar = this.f274460a.f40262a;
            String str = ((vce1) obj).f240117c;
            if (str != null) {
                fbk fbkVar = null;
                fizVarM34374j = cyf1.m34374j(new vjz(new vjz(new xkb(((e3p) bxbVar.f31814c).m37690y(str, 0, false), bxbVar, 6), new gc0(2, 8, fbkVar)), new ga2(3, 5, fbkVar), 2), (luk) bxbVar.f31815d);
                if (fizVarM34374j == null) {
                    fizVarM34374j = gau.f78095a;
                }
            } else {
                fizVarM34374j = gau.f78095a;
            }
            mwa0 mwa0Var = new mwa0(bqz0Var, 18);
            xnh0Var.f263618b = 1;
            Object objCollect = fizVarM34374j.collect(mwa0Var, xnh0Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
