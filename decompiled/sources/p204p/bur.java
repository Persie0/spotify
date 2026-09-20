package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bur implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iur f31198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f31199b;

    public bur(iur iurVar, om0 om0Var) {
        this.f31198a = iurVar;
        this.f31199b = om0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        aur aurVar;
        yqr yqrVar;
        if (ibkVar instanceof aur) {
            aurVar = (aur) ibkVar;
            int i = aurVar.f20008b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aurVar.f20008b = i - Integer.MIN_VALUE;
            } else {
                aurVar = new aur(this, ibkVar);
            }
        } else {
            aurVar = new aur(this, ibkVar);
        }
        Object obj2 = aurVar.f20007a;
        int i2 = aurVar.f20008b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            yqrVar = (yqr) obj;
            th00 th00Var = this.f31198a.f106022b;
            so0 so0Var = new so0(yqrVar.f275280a.mo29280c());
            aurVar.f20010d = yqrVar;
            aurVar.f20008b = 1;
            Object objInvoke = th00Var.invoke(so0Var, aurVar);
            yuk yukVar = yuk.f276404a;
            if (objInvoke == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yqrVar = aurVar.f20010d;
            bga.m29073P(obj2);
        }
        Iterator it = yqrVar.f275281b.iterator();
        while (it.hasNext()) {
            om0.m67310a(this.f31199b, (qm0) it.next(), yqrVar.f275280a.mo29280c(), null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
