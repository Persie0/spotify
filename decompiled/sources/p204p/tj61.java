package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tj61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ px0 f220834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x6j0 f220835b;

    public tj61(px0 px0Var, x6j0 x6j0Var) {
        this.f220834a = px0Var;
        this.f220835b = x6j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        sj61 sj61Var;
        if (ibkVar instanceof sj61) {
            sj61Var = (sj61) ibkVar;
            int i = sj61Var.f209763b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj61Var.f209763b = i - Integer.MIN_VALUE;
            } else {
                sj61Var = new sj61(this, ibkVar);
            }
        } else {
            sj61Var = new sj61(this, ibkVar);
        }
        Object obj2 = sj61Var.f209762a;
        int i2 = sj61Var.f209763b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            List listM46715L = h6f.m46715L(new pk61(new e8b(R.string.tab_title_home), R.drawable.ic_eis_home, 1, k0j0.f118115a), new pk61(new e8b(R.string.tab_title_recently_played), R.drawable.ic_eis_recently_played, ((ay3) this.f220834a.f182174b).m27492h() ? 1 : 2, x0j0.f256888a), new pk61(new e8b(R.string.tab_title_browse), R.drawable.ic_eis_browse, 1, g0j0.f75385a), new pk61(new e8b(R.string.tab_title_your_library), R.drawable.ic_eis_your_library, 2, o0j0.f160412a));
            Object kk61Var = new kk61(listM46715L);
            this.f220835b.m90096c(((pk61) g6f.m43741q0(listM46715L)).f178405d.getUri());
            sj61Var.f209763b = 1;
            Object objMo30229d = bqz0Var.mo30229d(kk61Var, sj61Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
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
