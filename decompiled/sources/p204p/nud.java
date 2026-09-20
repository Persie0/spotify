package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nud implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oud f158602a;

    public nud(oud oudVar) {
        this.f158602a = oudVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r9.mo30229d(r8, r0) == r4) goto L37;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        mud mudVar;
        Object c6x0Var;
        jud judVar;
        if (ibkVar instanceof mud) {
            mudVar = (mud) ibkVar;
            int i = mudVar.f147309b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mudVar.f147309b = i - Integer.MIN_VALUE;
            } else {
                mudVar = new mud(this, ibkVar);
            }
        } else {
            mudVar = new mud(this, ibkVar);
        }
        Object objM37686u = mudVar.f147308a;
        int i2 = mudVar.f147309b;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    judVar = mudVar.f147312e;
                    bqz0Var = mudVar.f147311d;
                    bga.m29073P(objM37686u);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM37686u);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM37686u);
            judVar = (jud) obj;
            e3p e3pVar = this.f158602a.f170266a;
            String str = judVar.f116094a;
            String str2 = judVar.f116095b;
            int i3 = judVar.f116096c;
            mudVar.f147311d = bqz0Var;
            mudVar.f147312e = judVar;
            mudVar.f147309b = 1;
            objM37686u = e3pVar.m37686u(i3, str, str2, mudVar);
            if (objM37686u == yukVar) {
            }
            return yukVar;
            List list = (List) objM37686u;
            if (list.size() != judVar.f116096c) {
                z = false;
            }
            c6x0Var = new qud(list, z);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            qlg1.m73220y(mudVar.getContext());
            c6x0Var = pud.f181423a;
        }
        mudVar.f147311d = null;
        mudVar.f147312e = null;
        mudVar.f147309b = 2;
    }
}
