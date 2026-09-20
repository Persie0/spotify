package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ini implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kni f104005a;

    public ini(kni kniVar) {
        this.f104005a = kniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L29;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hni hniVar;
        Object okiVar;
        if (ibkVar instanceof hni) {
            hniVar = (hni) ibkVar;
            int i = hniVar.f93342b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hniVar.f93342b = i - Integer.MIN_VALUE;
            } else {
                hniVar = new hni(this, ibkVar);
            }
        } else {
            hniVar = new hni(this, ibkVar);
        }
        Object objM89557A = hniVar.f93341a;
        int i2 = hniVar.f93342b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = hniVar.f93344d;
                    bga.m29073P(objM89557A);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM89557A);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM89557A);
            kni kniVar = this.f104005a;
            luk lukVar = kniVar.f124418f;
            nmi nmiVar = new nmi(kniVar, fbkVar, 1);
            hniVar.f93344d = bqz0Var;
            hniVar.f93342b = 1;
            objM89557A = x0h1.m89557A(lukVar, nmiVar, hniVar);
            if (objM89557A == yukVar) {
            }
            return yukVar;
            okiVar = (sli) objM89557A;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            okiVar = new oki(i3j.f98189a);
        }
        hniVar.f93344d = null;
        hniVar.f93342b = 2;
    }
}
