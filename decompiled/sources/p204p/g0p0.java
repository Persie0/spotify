package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;

/* JADX INFO: loaded from: classes9.dex */
public final class g0p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ he90 f75412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0p0(he90 he90Var, int i) {
        super(0);
        this.f75411a = i;
        this.f75412b = he90Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f75411a) {
            case 0:
                return ((xb5) this.f75412b.f90382f).m90305a(AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE, new Bundle());
            case 1:
                he90 he90Var = this.f75412b;
                f550 f550Var = (f550) he90Var.f90380d;
                Context context = (Context) he90Var.f90378b;
                Intent intentM43588a = ((g550) f550Var).m43588a(context);
                intentM43588a.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
                intentM43588a.setFlags(805306368);
                return PendingIntent.getActivity(context, 0, intentM43588a, 201326592);
            default:
                return (PendingIntent) ((g550) ((f550) this.f75412b.f90380d)).f76593d.getValue();
        }
    }
}
