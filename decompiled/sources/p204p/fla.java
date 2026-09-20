package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes.dex */
public final class fla extends MainThreadDisposable {

    /* JADX INFO: renamed from: b */
    public final Observer f70732b;

    /* JADX INFO: renamed from: c */
    public final Context f70733c;

    /* JADX INFO: renamed from: d */
    public final o4a f70734d;

    public fla(Observer observer, Context context, IntentFilter intentFilter) {
        this.f70732b = observer;
        this.f70733c = context;
        o4a o4aVar = new o4a(this, 6);
        this.f70734d = o4aVar;
        if (Build.VERSION.SDK_INT <= 33) {
            context.registerReceiver(o4aVar, intentFilter);
        } else {
            context.registerReceiver(o4aVar, intentFilter);
        }
    }

    @Override // io.reactivex.rxjava3.android.MainThreadDisposable
    /* JADX INFO: renamed from: a */
    public final void mo23278a() {
        this.f70733c.unregisterReceiver(this.f70734d);
    }
}
