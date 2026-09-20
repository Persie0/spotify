package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class flb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dcr0 f70744a;

    public flb0(dcr0 dcr0Var) {
        this.f70744a = dcr0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        glt gltVar = (glt) obj;
        Object objM35670a = this.f70744a.m35670a(new q8r0(gltVar.f81168b, new r511(new vcb0(R.string.lyrics_edit_tool_button_title, gltVar.f81169c, gltVar.f81170d, gltVar.f81171e, gltVar.f81172f), new u511(qpv0.f191387a.mo54112b(ddb0.class)))), ibkVar);
        return objM35670a == yuk.f276404a ? objM35670a : w2a1.f247311a;
    }
}
