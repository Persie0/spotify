package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import p204p.gaz;
import p204p.l0e1;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        gaz.m44194g("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gaz gazVarM44190b = gaz.m44190b();
        Objects.toString(intent);
        gazVarM44190b.getClass();
        try {
            l0e1 l0e1VarM57799S = l0e1.m57799S(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            l0e1VarM57799S.getClass();
            synchronized (l0e1.f128403L0) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = l0e1VarM57799S.f128411H0;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    l0e1VarM57799S.f128411H0 = pendingResultGoAsync;
                    if (l0e1VarM57799S.f128410G0) {
                        pendingResultGoAsync.finish();
                        l0e1VarM57799S.f128411H0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException unused) {
            gaz.m44190b().getClass();
        }
    }
}
