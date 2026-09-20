package p204p;

import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class w59 extends dla {
    @Override // p204p.l7j
    /* JADX INFO: renamed from: a */
    public final Object mo36122a() {
        Intent intentRegisterReceiver = this.f130662b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            gaz gazVarM44190b = gaz.m44190b();
            int i = x59.f258334a;
            gazVarM44190b.getClass();
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p204p.dla
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo36350e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p204p.dla
    /* JADX INFO: renamed from: f */
    public final void mo36351f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        gaz gazVarM44190b = gaz.m44190b();
        int i = x59.f258334a;
        intent.getAction();
        gazVarM44190b.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    m58416b(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                m58416b(Boolean.FALSE);
            }
        }
    }
}
