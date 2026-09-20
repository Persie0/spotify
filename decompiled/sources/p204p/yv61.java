package p204p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class yv61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ew61 f276584a;

    public yv61(ew61 ew61Var) {
        this.f276584a = ew61Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vv61 vv61Var = (vv61) obj;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(vv61Var.f245158a));
            intent.addFlags(268435456);
            this.f276584a.f63444c.mo35747a(intent);
        } catch (ActivityNotFoundException e) {
            Logger.m3974j(e, "No activity found to handle URL: %s", vv61Var.f245158a);
        }
        return w2a1.f247311a;
    }
}
