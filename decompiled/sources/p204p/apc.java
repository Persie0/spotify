package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class apc implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hol0 f17906a;

    public apc(hol0 hol0Var) {
        this.f17906a = hol0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        zoc zocVar;
        fiz va3Var;
        if (ibkVar instanceof zoc) {
            zocVar = (zoc) ibkVar;
            int i = zocVar.f284759b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zocVar.f284759b = i - Integer.MIN_VALUE;
            } else {
                zocVar = new zoc(this, ibkVar);
            }
        } else {
            zocVar = new zoc(this, ibkVar);
        }
        Object obj2 = zocVar.f284758a;
        int i2 = zocVar.f284759b;
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
        String str = ((soc) obj).f211160a;
        Set set = dd41.f47702f;
        gn80 gn80Var = r46.m74726U(str).f47709c;
        gn80 gn80Var2 = gn80.PODCAST_CHAPTER;
        hol0 hol0Var = this.f17906a;
        if (gn80Var == gn80Var2 || gn80Var == gn80.CLIP) {
            va3Var = new va3(hol0Var.m48100y(new tjo(Collections.singletonList(new rko(new txr(qpv0.f191387a.mo54112b(v140.class)), 1, wv3.f255327L0, new pko(new C2597y1(str, 29)), wv3.f255328M0)), wv3.f255329N0), w2a1Var), str, i3);
        } else {
            va3Var = new ysk(str, 27);
        }
        fbk fbkVar = null;
        int i4 = 4;
        vjz vjzVar = new vjz(new ia2(xtm0.m92074U(va3Var, new xv3(0, fbkVar, hol0Var)), i4), new ga2(3, i4, fbkVar), 2);
        h61 h61Var = new h61(bqz0Var, 14);
        zocVar.f284759b = 1;
        Object objCollect = vjzVar.collect(h61Var, zocVar);
        yuk yukVar = yuk.f276404a;
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
