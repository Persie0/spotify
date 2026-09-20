package p204p;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class s3f1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f205282a;

    /* JADX INFO: renamed from: b */
    public final s0f1 f205283b;

    public s3f1(s0f1 s0f1Var) {
        this.f205283b = s0f1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            s0f1 s0f1Var = this.f205283b;
            l3f1 l3f1Var = (l3f1) ((RunnableC2650zh) s0f1Var.f204379c).f282752c;
            l3f1Var.f129324c.set(null);
            ywh0 ywh0Var = l3f1Var.f129328g.f273250L0;
            ywh0Var.sendMessage(ywh0Var.obtainMessage(3));
            Dialog dialog = (Dialog) s0f1Var.f204378b;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.f205282a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f205282a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
