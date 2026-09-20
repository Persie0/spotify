package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class iov implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f104291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pov f104292b;

    public iov(rlv0 rlv0Var, pov povVar) {
        this.f104291a = rlv0Var;
        this.f104292b = povVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hov hovVar;
        fiz movVar;
        if (ibkVar instanceof hov) {
            hovVar = (hov) ibkVar;
            int i = hovVar.f93639b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hovVar.f93639b = i - Integer.MIN_VALUE;
            } else {
                hovVar = new hov(this, ibkVar);
            }
        } else {
            hovVar = new hov(this, ibkVar);
        }
        Object obj2 = hovVar.f93638a;
        int i2 = hovVar.f93639b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            rnv rnvVar = (rnv) obj;
            this.f104291a.f200373a = rnvVar.f201021b;
            bov bovVar = rnvVar.f201020a;
            pov povVar = this.f104292b;
            pgo pgoVar = povVar.f179795X;
            int i3 = bovVar.f29256b;
            String str = bovVar.f29255a;
            int iM38547C = edb.m38547C(i3);
            if (iM38547C == 0) {
                movVar = new mov(fag1.m41173v(pgoVar, rov.f201355a, bovVar), povVar, bovVar, 0);
            } else if (iM38547C == 1) {
                movVar = g0g1.m43301f(fag1.m41173v(pgoVar, rov.f201355a, bovVar), fag1.m41151B(pgoVar, povVar.f179803f.f52858b, str), fag1.m41151B(pgoVar, (tjo) povVar.f179804g.f185927d, new qv00(str, str)), fag1.m41151B(pgoVar, povVar.f179805h.f163347a, new yro0(str)), new oov(povVar, bovVar, null, 0));
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                movVar = new mov(fag1.m41173v(pgoVar, rov.f201356b, bovVar), povVar, bovVar, 1);
            }
            d6i d6iVar = new d6i(bqz0Var, 29);
            hovVar.f93639b = 1;
            Object objCollect = movVar.collect(d6iVar, hovVar);
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
