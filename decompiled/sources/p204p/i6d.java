package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class i6d implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h7d f99211a;

    public i6d(h7d h7dVar) {
        this.f99211a = h7dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        h6d h6dVar;
        n3d n3dVar;
        Object objM41780c;
        int i;
        if (ibkVar instanceof h6d) {
            h6dVar = (h6d) ibkVar;
            int i2 = h6dVar.f88066b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6dVar.f88066b = i2 - Integer.MIN_VALUE;
            } else {
                h6dVar = new h6d(this, ibkVar);
            }
        } else {
            h6dVar = new h6d(this, ibkVar);
        }
        Object obj2 = h6dVar.f88065a;
        int i3 = h6dVar.f88066b;
        w2a1 w2a1Var = w2a1.f247311a;
        h7d h7dVar = this.f99211a;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj2);
            n3dVar = (n3d) obj;
            fj1 fj1Var = h7dVar.f88421j;
            String str = n3dVar.f150007a;
            h6dVar.f88068d = n3dVar;
            h6dVar.f88069e = 0;
            h6dVar.f88066b = 1;
            objM41780c = fj1Var.m41780c(str, h6dVar);
            if (objM41780c != yukVar) {
                i = 0;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        i = h6dVar.f88069e;
        n3dVar = h6dVar.f88068d;
        bga.m29073P(obj2);
        objM41780c = ((s6x0) obj2).f206218a;
        if (s6x0.m77348a(objM41780c) == null) {
            ((Boolean) objM41780c).getClass();
            return w2a1Var;
        }
        qlg1.m73220y(h6dVar.getContext());
        i780 i780Var = h7dVar.f88414c;
        h6dVar.f88068d = null;
        h6dVar.f88069e = i;
        h6dVar.f88066b = 2;
        Object objM89557A = x0h1.m89557A((luk) i780Var.f99466c, new qff0(i780Var, n3dVar.f150007a, null, 12), h6dVar);
        if (objM89557A != yukVar) {
            objM89557A = w2a1Var;
        }
        return objM89557A == yukVar ? yukVar : w2a1Var;
    }
}
