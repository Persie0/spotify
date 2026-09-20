package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class fyb extends ck90 {

    /* JADX INFO: renamed from: M0 */
    public static final Uri f74675M0 = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();

    /* JADX INFO: renamed from: L0 */
    public final o4a f74676L0 = new o4a(this, 7);

    /* JADX INFO: renamed from: Y */
    public final Context f74677Y;

    /* JADX INFO: renamed from: Z */
    public final eyb f74678Z;

    public fyb(Context context) {
        this.f74677Y = context;
        this.f74678Z = new eyb(this, context.getContentResolver());
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        o4a o4aVar = this.f74676L0;
        Context context = this.f74677Y;
        if (i >= 33) {
            fz6.m43138B(context, o4aVar, intentFilter);
        } else {
            context.registerReceiver(o4aVar, intentFilter);
        }
        this.f74678Z.startQuery(42, null, f74675M0, new String[]{"CarConnectionState"}, null, null, null);
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        this.f74677Y.unregisterReceiver(this.f74676L0);
        this.f74678Z.cancelOperation(42);
    }
}
