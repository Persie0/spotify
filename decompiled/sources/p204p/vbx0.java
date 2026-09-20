package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Maybe;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vbx0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pcb f239600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f239601b;

    public vbx0(pcb pcbVar, String str) {
        this.f239600a = pcbVar;
        this.f239601b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ubx0 ubx0Var;
        Maybe maybeM23363f;
        if (ibkVar instanceof ubx0) {
            ubx0Var = (ubx0) ibkVar;
            int i = ubx0Var.f228900b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubx0Var.f228900b = i - Integer.MIN_VALUE;
            } else {
                ubx0Var = new ubx0(this, ibkVar);
            }
        } else {
            ubx0Var = new ubx0(this, ibkVar);
        }
        Object obj2 = ubx0Var.f228899a;
        int i2 = ubx0Var.f228900b;
        w2a1 w2a1Var = w2a1.f247311a;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        zax0 zax0Var = (zax0) obj;
        eq31 eq31Var = zax0Var.f281177a;
        int i4 = eq31Var.f61771a;
        String str = this.f239601b;
        qdl qdlVar = new qdl(str, eq31Var);
        if (i4 == 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        pcb pcbVar = this.f239600a;
        e72.m38010i0((sr4) ((w221) pcbVar.f176007g).f247211b, "children_dataSource");
        Set set = dd41.f47702f;
        int i5 = 23;
        int i6 = 0;
        if (r46.m74708A(str, gn80.SHOW_SHOW)) {
            maybeM23363f = ((jpx) ((epx) pcbVar.f176004d)).m53978b(new C1668ai("cwp", false, (gh00) new zz70(str, 5))).timeInterval().take(2L).flatMap(new jbh1(str, 7)).firstElement().m23369g(new oyz(qdlVar, i5));
        } else {
            maybeM23363f = Maybe.m23363f(new es31(i4));
        }
        yab yabVarM54985d = k0e1.m54985d(maybeM23363f.m23369g(new ha80(qdlVar, 2)).m23366c(qdlVar).flatMapObservable(new z4y(pcbVar, i5)).map(new ae00(pcbVar, 21)).doOnNext(new v090(pcbVar, i6)).doOnError(new v090(pcbVar, i3)));
        aeq0 aeq0Var = new aeq0(bqz0Var, 9);
        ubx0Var.f228900b = 1;
        Object objCollect = yabVarM54985d.collect(new ruu0(10, aeq0Var, zax0Var), ubx0Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
