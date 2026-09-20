package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public final class oud1 implements mc80 {

    /* JADX INFO: renamed from: a */
    public final Context f170272a;

    public oud1(Context context) {
        this.f170272a = context;
    }

    @Override // p204p.mc80
    /* JADX INFO: renamed from: a */
    public final void mo61457a() {
        Intent intent = new Intent("com.spotify.widgets.widgets.ACTION_END_SESSION");
        Context context = this.f170272a;
        intent.setComponent(new ComponentName(context, "com.spotify.widgets.npvwidget.WidgetUpdateCoordinator"));
        context.sendBroadcast(intent);
    }
}
