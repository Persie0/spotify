package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sk8 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final Handler f210054a;

    public sk8(Handler handler) {
        this.f210054a = handler;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13292a(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f210054a.post(new qk8(this, context, intent, goAsync(), 1));
    }

    public /* synthetic */ sk8() {
        this(t0o0.f215934Z.m79844b());
    }
}
