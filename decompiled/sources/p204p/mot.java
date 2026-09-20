package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class mot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ppt f145739a;

    public mot(ppt pptVar) {
        this.f145739a = pptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        fot fotVar;
        fiz vjzVar;
        if (ibkVar instanceof fot) {
            fotVar = (fot) ibkVar;
            int i = fotVar.f71628b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fotVar.f71628b = i - Integer.MIN_VALUE;
            } else {
                fotVar = new fot(this, ibkVar);
            }
        } else {
            fotVar = new fot(this, ibkVar);
        }
        Object obj2 = fotVar.f71627a;
        int i2 = fotVar.f71628b;
        int i3 = 1;
        if (i2 == 0) {
            bga.m29073P(obj2);
            hgt hgtVar = (hgt) obj;
            pgo pgoVar = (pgo) this.f145739a.f180102a.f145081b;
            Set set = dd41.f47702f;
            String str = hgtVar.f91197a;
            String strM35721s = r46.m74726U(str).m35721s();
            if (strM35721s == null) {
                vjzVar = new ysk(new bhy(new IllegalStateException(edb.m38564m("Cannot extract username from: ", str))), 27);
            } else {
                fbk fbkVar = null;
                vjzVar = new vjz(new jd1(new zux(fag1.m41173v(pgoVar, c7c.f34844a, str), fag1.m41173v(pgoVar, c7c.f34845b, hgtVar.f91198b), new pz2(hgtVar, strM35721s, fbkVar, 7), i3), 5), new ga2(3, 25, fbkVar), 2);
            }
            d6i d6iVar = new d6i(bqz0Var, 11);
            fotVar.f71628b = 1;
            Object objCollect = vjzVar.collect(d6iVar, fotVar);
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
