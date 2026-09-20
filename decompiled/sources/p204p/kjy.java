package p204p;

import com.spotify.martini.martinidata.model.Mode;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class kjy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ojy f123443a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ voc1 f123444b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Mode f123445c;

    public kjy(ojy ojyVar, voc1 voc1Var, Mode mode) {
        this.f123443a = ojyVar;
        this.f123444b = voc1Var;
        this.f123445c = mode;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Object objM37256a = this.f123443a.f166174b.m37256a(((fjy) obj).f70423a, this.f123444b, this.f123445c, ibkVar);
        return objM37256a == yuk.f276404a ? objM37256a : w2a1.f247311a;
    }
}
