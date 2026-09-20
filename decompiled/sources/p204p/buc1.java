package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class buc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juc1 f31083a;

    public buc1(juc1 juc1Var) {
        this.f31083a = juc1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        otc1 otc1Var = (otc1) obj;
        juc1 juc1Var = this.f31083a;
        vl91 vl91Var = juc1Var.f116086c;
        boolean z = otc1Var.f169035a;
        lv31 lv31VarEdit = ((wl91) vl91Var).f252497a.edit();
        lv31VarEdit.m60048a(wl91.f252496c, z);
        lv31VarEdit.m60055h();
        if (otc1Var.f169035a) {
            juc1Var.f116083Z.invoke(juc1Var.f116084a.getString(R.string.interactive_entrypoint_tts_enabled));
        }
        return w2a1.f247311a;
    }
}
