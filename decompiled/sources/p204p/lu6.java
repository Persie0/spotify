package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class lu6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v6u f137005a;

    public lu6(v6u v6uVar) {
        this.f137005a = v6uVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        flt fltVar = (flt) obj;
        Object objM71995a = this.f137005a.f237951a.m71995a(new h2c(new r511(new mrc(new zrc(fltVar.f70866a, fltVar.f70867b), R.string.chapter_selector_title), new u511(qpv0.f191387a.mo54112b(esc.class)))), ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM71995a != yukVar) {
            objM71995a = w2a1Var;
        }
        return objM71995a == yukVar ? objM71995a : w2a1Var;
    }
}
