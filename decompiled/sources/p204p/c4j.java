package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class c4j implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a3j f33961a;

    public c4j(a3j a3jVar) {
        this.f33961a = a3jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L29;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        b4j b4jVar;
        Object j3jVar;
        if (ibkVar instanceof b4j) {
            b4jVar = (b4j) ibkVar;
            int i = b4jVar.f23366b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b4jVar.f23366b = i - Integer.MIN_VALUE;
            } else {
                b4jVar = new b4j(this, ibkVar);
            }
        } else {
            b4jVar = new b4j(this, ibkVar);
        }
        Object objM24630a = b4jVar.f23365a;
        int i2 = b4jVar.f23366b;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = b4jVar.f23368d;
                    bga.m29073P(objM24630a);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM24630a);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM24630a);
            a3j a3jVar = this.f33961a;
            b4jVar.f23368d = bqz0Var;
            b4jVar.f23366b = 1;
            objM24630a = a3jVar.m24630a(b4jVar);
            if (objM24630a == obj2) {
            }
            return obj2;
            j3jVar = new j3j((List) objM24630a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            j3jVar = i3j.f98189a;
        }
        b4jVar.f23368d = null;
        b4jVar.f23366b = 2;
    }
}
