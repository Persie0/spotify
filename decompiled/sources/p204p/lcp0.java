package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.widgets.npvwidget.WidgetUpdateCoordinator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lcp0 {
    /* JADX INFO: renamed from: a */
    public static final void m58711a(Context context) {
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_UPDATE");
        context.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: b */
    public static C1044a m58712b(Context context) {
        n5q n5qVar = xsr.f265651a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(qpv0.f191387a.mo54112b(hcp0.class), new C1037x558fa59a().m15633a(new kcp0(context)));
        return new C1044a(n5qVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }
}
